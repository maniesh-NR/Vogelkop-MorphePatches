#!/usr/bin/env python3
"""Diagnose parse-level defects in APKs inside the v2 .apkm bundle.

Checks per APK:
  - compression method of AndroidManifest.xml / resources.arsc / classes.dex / lib/**/*.so
  - alignment (offset % 4 for stored resources.arsc; offset % 4096 for stored .so)
  - v1 JAR signature (META-INF/*.SF|*.RSA|*.DSA + MANIFEST.MF)
  - v2/v3 APK Signing Block presence ("APK Sig Block 42" before central dir)
  - entry count and any data-descriptor usage
Compares against the original APKMirror bundle as a known-good reference.
"""
import io
import struct
import sys
import zipfile

APK_SIG_BLOCK_MAGIC = b"APK Sig Block 42"
EOCD_SIG = 0x06054b50
CD_ENTRY_SIG = 0x02014b50


def eocd(data):
    """Return (eocd_offset, cd_offset, cd_size, n_entries)."""
    idx = data.rfind(b"PK\x05\x06")
    if idx < 0:
        return None
    (sig, disk, cd_disk, n_disk, n_total, cd_size, cd_off, comment_len) = struct.unpack(
        "<IHHHHIIH", data[idx:idx + 22])
    return idx, cd_off, cd_size, n_total


def has_v2_block(data):
    """Look for an APK Signing Block ending right before the central directory."""
    e = eocd(data)
    if not e:
        return False, 0
    _, cd_off, _, _ = e
    if cd_off < 32:
        return False, 0
    # signing block footer: size_of_block (8) + magic (16)
    footer = data[cd_off - 24:cd_off]
    if len(footer) < 24 or footer[8:] != APK_SIG_BLOCK_MAGIC:
        return False, 0
    size2 = struct.unpack("<Q", footer[:8])[0]
    if size2 < 24 or cd_off - size2 - 8 < 0:
        return False, 0
    start = cd_off - size2 - 8
    if data[start:start + 8] != struct.pack("<Q", size2):
        return False, 0
    return True, size2


def local_header_offset(zf, name):
    """File offset of the local header for an entry (as stored, post any zip64)."""
    info = zf.getinfo(name)
    return info.header_offset


def data_start_offset(zf, name, raw):
    """Absolute offset where the entry DATA begins (local header + name + extra)."""
    info = zf.getinfo(name)
    off = info.header_offset
    hdr = raw[off:off + 30]
    if hdr[:4] != b"PK\x03\x04":
        return None
    fnlen, extralen = struct.unpack("<HH", hdr[26:30])
    return off + 30 + fnlen + extralen


def diagnose(path, label):
    print(f"\n===== {label}: {path.split('/')[-1]} =====")
    with open(path, "rb") as fh:
        raw = fh.read()
    z = zipfile.ZipFile(io.BytesIO(raw))
    names = z.namelist()
    print(f"  entries: {len(names)}")

    # --- key files compression ---
    interesting = {}
    for n in names:
        i = z.getinfo(n)
        base = n.rsplit("/", 1)[-1]
        if (n.startswith("lib/") and n.endswith(".so")) or n in (
                "resources.arsc", "AndroidManifest.xml") or n.startswith("classes") and n.endswith(".dex") or n.startswith("META-INF/"):
            key = ("lib/*.so" if n.startswith("lib/") else
                   "META-INF/*" if n.startswith("META-INF/") else n)
            interesting.setdefault(key, [0, 0])
            interesting[key][0] += 1
            if i.compress_type != zipfile.ZIP_STORED:
                interesting[key][1] += 1
    for k in sorted(interesting):
        total, compressed = interesting[k]
        flag = "  <-- COMPRESSED" if compressed else ""
        print(f"  {k:28} entries={total:5} deflated={compressed}{flag}")

    # --- alignment ---
    def align_report(n, mod, what):
        if n not in names:
            print(f"  {what}: (absent)")
            return
        i = z.getinfo(n)
        ds = data_start_offset(z, n, raw)
        am = "OK" if ds % mod == 0 else f"MISALIGNED (offset % {mod} = {ds % mod})"
        print(f"  {what}: method={'STORED' if i.compress_type==0 else 'DEFLATE'} data@{ds} {am}")

    if "resources.arsc" in names:
        align_report("resources.arsc", 4, "resources.arsc")
    for arch in ("arm64-v8a", "armeabi-v7a"):
        n = f"lib/{arch}/"
        sos = [x for x in names if x.startswith(n) and x.endswith(".so")]
        if sos:
            worst = []
            for s in sos[:4]:
                i = z.getinfo(s)
                ds = data_start_offset(z, s, raw)
                m = "OK" if i.compress_type == 0 and ds % 4096 == 0 else (
                    "STORED" if i.compress_type == 0 else "DEFLATED") + (f" @+{ds % 4096}" if i.compress_type == 0 else "")
                worst.append(f"{s.rsplit('/',1)[-1]}={m}")
            print(f"  lib/{arch}/: {len(sos)} .so | " + " | ".join(worst))

    # --- v1 signatures ---
    v1 = [n for n in names if n.startswith("META-INF/")
          and (n.endswith(".SF") or n.endswith(".RSA") or n.endswith(".DSA"))]
    mf = "META-INF/MANIFEST.MF" in names
    print(f"  v1 JAR sig: MANIFEST.MF={mf} sig-files={sorted(v1) if v1 else 'NONE'}")

    # --- v2/v3 block ---
    ok, size = has_v2_block(raw)
    print(f"  v2/v3 APK Signing Block: {'PRESENT (' + str(size) + ' bytes)' if ok else 'ABSENT'}")

    # --- data descriptors / zip flags ---
    gpd = sum(1 for n in names if z.getinfo(n).flag_bits & 0x8)
    print(f"  entries using data-descriptor flag: {gpd}")


if __name__ == "__main__":
    diagnose(sys.argv[1], sys.argv[2] if len(sys.argv) > 2 else "APK")
