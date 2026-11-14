#!/usr/bin/env python3
"""Extract and compare v2/v3 signing block certificates across APKs.

Layouts:
  v2  (0x7109871a) value: [u32 len signed-data][signed-data][u32 len sigs][sigs][u32 len pubkey][pubkey]
  v3  (0xf05368c0) value: [u32 minSdk][u32 len signed-data][signed-data][u32 len sigs][sigs][u32 len pubkey][pubkey]
  v3.1(0x1b93ad61) value: like v3 with an extra u32 "rotation" ... (treated as v3-ish)

  signed-data: [u32 len digests][digests][u32 len certs][certs][rest]
  certs blob:  sequence of [u32 len][X.509 DER cert]
"""
import struct
import sys
import hashlib

MAGIC = b"APK Sig Block 42"


def get_sigblock(data):
    idx = data.rfind(b"PK\x05\x06")
    if idx < 0:
        return None
    cd_off = struct.unpack("<I", data[idx + 16:idx + 20])[0]
    footer = data[cd_off - 24:cd_off]
    if footer[8:] != MAGIC:
        return None
    size2 = struct.unpack("<Q", footer[:8])[0]
    start = cd_off - size2 - 8
    return data[start:cd_off]


def parse_pairs(block):
    body = block[8:-24]
    pairs = {}
    off = 0
    while off < len(body) - 8:
        ln = struct.unpack("<Q", body[off:off + 8])[0]
        if ln <= 0 or off + 8 + ln > len(body):
            break
        pair = body[off + 8:off + 8 + ln]
        pid = struct.unpack("<I", pair[:4])[0]
        pairs.setdefault(pid, []).append(pair[4:])
        off += 8 + ln
    return pairs


def take(buf, off):
    """Read one u32-length-prefixed blob; return (blob, new_off)."""
    ln = struct.unpack("<I", buf[off:off + 4])[0]
    return buf[off + 4:off + 4 + ln], off + 4 + ln


def cert_digests(path):
    data = open(path, "rb").read()
    b = get_sigblock(data)
    if not b:
        return {}
    out = {}
    names = {0x7109871A: "v2", 0xF05368C0: "v3", 0x1B93AD61: "v3.1"}
    for pid, vals in parse_pairs(b).items():
        nm = names.get(pid, hex(pid))
        for v in vals:
            off = 0
            if pid in (0xF05368C0, 0x1B93AD61):
                off = 4  # skip minSdkVersion
            signed, off = take(v, off)
            sd = 0
            _digests, sd = take(signed, sd)
            _certs, sd = take(signed, sd)
            coff = 0
            while coff < len(_certs) - 4:
                cert, coff = take(_certs, coff)
                out.setdefault(nm, set()).add(hashlib.sha256(cert).hexdigest()[:16])
    return out


for p in sys.argv[1:]:
    d = cert_digests(p)
    print(p.split("/")[-1])
    if not d:
        print("   (no signing block)")
    for k in sorted(d):
        print(f"   {k}: cert sha256[:16] = {sorted(d[k])}")
