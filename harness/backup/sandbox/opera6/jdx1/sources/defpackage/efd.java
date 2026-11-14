package defpackage;

import android.util.SparseArray;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class efd implements cn8 {
    public static final byte[] k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] l0;
    public static final byte[] m0;
    public static final byte[] n0;
    public static final UUID o0;
    public static final Map p0;
    public int A;
    public long B;
    public final SparseArray C;
    public boolean D;
    public long E;
    public int F;
    public long G;
    public long H;
    public int I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public boolean N;
    public byte O;
    public long P;
    public long Q;
    public int R;
    public int S;
    public int[] T;
    public int U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public long Z;
    public final yn6 a;
    public int a0;
    public final z b;
    public int b0;
    public final SparseArray c;
    public int c0;
    public final boolean d;
    public boolean d0;
    public final boolean e;
    public boolean e0;
    public final tnk f;
    public boolean f0;
    public final g1g g;
    public short g0;
    public final g1g h;
    public byte h0;
    public final g1g i;
    public boolean i0;
    public final g1g j;
    public en8 j0;
    public final g1g k;
    public final g1g l;
    public final g1g m;
    public final g1g n;
    public final g1g o;
    public final g1g p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    public dfd y;
    public boolean z;

    static {
        String str = tym.a;
        l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        u35.n(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        u35.n(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        p0 = Collections.unmodifiableMap(map);
    }

    public efd(tnk tnkVar, int i) {
        yn6 yn6Var = new yn6();
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.a = yn6Var;
        yn6Var.d = new nv6(this);
        this.f = tnkVar;
        this.C = new SparseArray();
        this.d = (i & 1) == 0;
        this.e = (i & 2) == 0;
        this.b = new z((byte) 1);
        this.c = new SparseArray();
        this.i = new g1g(4);
        this.j = new g1g(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new g1g(4);
        this.g = new g1g(qyn.d);
        this.h = new g1g(4);
        this.l = new g1g();
        this.m = new g1g();
        this.n = new g1g(8);
        this.o = new g1g();
        this.p = new g1g();
        this.T = new int[1];
        this.x = true;
    }

    public static byte[] h(long j, long j2, String str) {
        z4o.w(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str3 = tym.a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        bp bpVar = new bp((byte) 27);
        g1g g1gVar = (g1g) bpVar.b;
        lp6 lp6Var = (lp6) dn8Var;
        long j = lp6Var.c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        lp6Var.peekFully(g1gVar.a, 0, 4, false);
        long jC = g1gVar.C();
        bpVar.a = 4;
        while (true) {
            if (jC != 440786851) {
                int i2 = bpVar.a + 1;
                bpVar.a = i2;
                if (i2 == i) {
                    break;
                }
                lp6Var.peekFully(g1gVar.a, 0, 1, false);
                jC = ((jC << 8) & (-256)) | (g1gVar.a[0] & 255);
            } else {
                long jZ = bpVar.Z(lp6Var);
                long j3 = bpVar.a;
                if (jZ != Long.MIN_VALUE && (j == -1 || j3 + jZ < j)) {
                    while (true) {
                        long j4 = bpVar.a;
                        long j5 = j3 + jZ;
                        if (j4 < j5) {
                            if (bpVar.Z(lp6Var) == Long.MIN_VALUE) {
                                break;
                            }
                            long jZ2 = bpVar.Z(lp6Var);
                            if (jZ2 < 0 || jZ2 > 2147483647L) {
                                break;
                            }
                            if (jZ2 != 0) {
                                int i3 = (int) jZ2;
                                lp6Var.a(i3, false);
                                bpVar.a += i3;
                            }
                        } else if (j4 == j5) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0a1b  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0b9f  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0be8  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x0bff  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0197  */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r0v53, types: [dn8, lp6] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [byte] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r1v51, types: [z] */
    /* JADX WARN: Type inference failed for: r3v159 */
    /* JADX WARN: Type inference failed for: r3v160 */
    /* JADX WARN: Type inference failed for: r3v162 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v42, types: [int] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r5v170 */
    /* JADX WARN: Type inference failed for: r5v171, types: [int] */
    /* JADX WARN: Type inference failed for: r5v173 */
    /* JADX WARN: Type inference failed for: r5v174, types: [int] */
    /* JADX WARN: Type inference failed for: r5v177 */
    /* JADX WARN: Type inference failed for: r5v178, types: [int] */
    /* JADX WARN: Type inference failed for: r5v183 */
    /* JADX WARN: Type inference failed for: r5v184 */
    /* JADX WARN: Type inference failed for: r5v185 */
    /* JADX WARN: Type inference failed for: r6v8, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.util.SparseArray] */
    @Override // defpackage.cn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.dn8 r43, hp2 r44) throws defpackage.s1g, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 4806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efd.b(dn8, hp2):int");
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        if (this.e) {
            en8Var = new h5k(en8Var, this.f);
        }
        this.j0 = en8Var;
    }

    public final void e(int i) {
        if (this.D) {
            return;
        }
        throw s1g.d("Element " + i + " must be in a Cues", null);
    }

    public final void f(int i) {
        if (this.y != null) {
            return;
        }
        throw s1g.d("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.dfd r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efd.g(dfd, long, int, int, int):void");
    }

    public final void i() {
        if (!this.x) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                en8 en8Var = this.j0;
                en8Var.getClass();
                en8Var.endTracks();
                this.x = false;
                return;
            }
            if (((dfd) sparseArray.valueAt(i)).W) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void j(lp6 lp6Var, int i) {
        g1g g1gVar = this.i;
        if (g1gVar.c >= i) {
            return;
        }
        byte[] bArr = g1gVar.a;
        if (bArr.length < i) {
            g1gVar.c(Math.max(bArr.length << 1, i));
        }
        byte[] bArr2 = g1gVar.a;
        int i2 = g1gVar.c;
        lp6Var.readFully(bArr2, i2, i - i2, false);
        g1gVar.M(i);
    }

    public final void k() {
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.g0 = (short) 0;
        this.h0 = (byte) 0;
        this.i0 = false;
        this.l.K(0);
    }

    public final long l(long j) throws s1g {
        long j2 = this.t;
        if (j2 == -9223372036854775807L) {
            throw s1g.d("Can't scale timecode prior to timecodeScale being set.", null);
        }
        String str = tym.a;
        return tym.W(j, j2, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01d6  */
    /* JADX WARN: Type inference failed for: r8v32, types: [int, short] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m(defpackage.lp6 r18, defpackage.dfd r19, int r20, boolean r21) throws defpackage.s1g, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efd.m(lp6, dfd, int, boolean):int");
    }

    public final void n(lp6 lp6Var, byte[] bArr, int i) throws InterruptedIOException {
        int length = bArr.length + i;
        g1g g1gVar = this.m;
        byte[] bArr2 = g1gVar.a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            g1gVar.L(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        lp6Var.readFully(g1gVar.a, bArr.length, i, false);
        g1gVar.N(0);
        g1gVar.M(length);
    }

    @Override // defpackage.cn8
    public final void release() {
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        this.M = -9223372036854775807L;
        this.O = (byte) 0;
        yn6 yn6Var = this.a;
        yn6Var.e = (byte) 0;
        yn6Var.b.clear();
        z zVar = yn6Var.c;
        zVar.a = false;
        zVar.b = 0;
        z zVar2 = this.b;
        zVar2.a = false;
        zVar2.b = 0;
        k();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.z) {
            this.C.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            k7m k7mVar = ((dfd) sparseArray.valueAt(i)).V;
            if (k7mVar != null) {
                k7mVar.b = false;
                k7mVar.c = 0;
            }
            i++;
        }
    }
}
