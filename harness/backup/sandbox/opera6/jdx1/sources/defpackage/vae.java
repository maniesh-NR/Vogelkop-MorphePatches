package defpackage;

import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class vae implements cn8 {
    public static final rqd v = new rqd((byte) 7);
    public final int a;
    public final long b;
    public final g1g c;
    public final fbe d;
    public final cu9 e;
    public final xm5 f;
    public final s97 g;
    public en8 h;
    public hyl i;
    public hyl j;
    public int k;
    public lxd l;
    public long m;
    public long n;
    public long o;
    public long p;
    public int q;
    public xwi r;
    public boolean s;
    public boolean t;
    public long u;

    public vae(int i) {
        this(-9223372036854775807L);
    }

    public vae(long j) {
        this.a = 0;
        this.b = j;
        this.c = new g1g(10);
        this.d = new fbe();
        this.e = new cu9();
        this.m = -9223372036854775807L;
        this.f = new xm5((byte) 26);
        s97 s97Var = new s97();
        this.g = s97Var;
        this.j = s97Var;
        this.p = -1L;
    }

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        return h((lp6) dn8Var, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090 A[PHI: r13
      0x0090: PHI (r13v9 cu9) = (r13v7 cu9), (r13v7 cu9), (r13v7 cu9), (r13v6 cu9) binds: [B:120:0x0280, B:126:0x0292, B:111:0x0259, B:31:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.cn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.dn8 r56, hp2 r57) throws java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vae.b(dn8, hp2):int");
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        this.h = en8Var;
        hyl hylVarTrack = en8Var.track(0, 1);
        this.i = hylVarTrack;
        this.j = hylVarTrack;
        this.h.endTracks();
    }

    public final xn5 e(lp6 lp6Var, boolean z) {
        g1g g1gVar = this.c;
        lp6Var.peekFully(g1gVar.a, 0, 4, false);
        g1gVar.N(0);
        int iM = g1gVar.m();
        fbe fbeVar = this.d;
        fbeVar.a(iM);
        return new xn5(lp6Var.c, lp6Var.d, fbeVar.f, fbeVar.c, z);
    }

    public final void f() {
        twi twiVar = this.r;
        if ((twiVar instanceof xn5) && ((wn5) twiVar).isSeekable()) {
            long j = this.p;
            if (j == -1 || j == this.r.b()) {
                return;
            }
            xn5 xn5Var = (xn5) this.r;
            this.r = new xn5(this.p, xn5Var.h, xn5Var.i, xn5Var.j, xn5Var.k);
            en8 en8Var = this.h;
            en8Var.getClass();
            en8Var.h(this.r);
            hyl hylVar = this.i;
            hylVar.getClass();
            hylVar.e(this.r.getDurationUs());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(defpackage.lp6 r9) {
        /*
            r8 = this;
            xwi r0 = r8.r
            r1 = 1
            if (r0 == 0) goto L1a
            long r2 = r0.b()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1a
            long r4 = r9.getPeekPosition()
            r6 = 4
            long r2 = r2 - r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L26
        L1a:
            g1g r8 = r8.c     // Catch: java.io.EOFException -> L26
            byte[] r8 = r8.a     // Catch: java.io.EOFException -> L26
            r0 = 0
            r2 = 4
            boolean r8 = r9.peekFully(r8, r0, r2, r1)     // Catch: java.io.EOFException -> L26
            r8 = r8 ^ r1
            return r8
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vae.g(lp6):boolean");
    }

    public final boolean h(lp6 lp6Var, boolean z) throws InterruptedIOException {
        int peekPosition;
        int i;
        int iS;
        lp6Var.f = 0;
        if (lp6Var.d == 0) {
            lxd lxdVarC = this.f.C(lp6Var, (this.a & 8) == 0 ? null : v, 131072);
            this.l = lxdVarC;
            if (lxdVarC != null) {
                this.e.b(lxdVarC);
            }
            peekPosition = (int) lp6Var.getPeekPosition();
            if (!z) {
                lp6Var.h(peekPosition, false);
            }
            i = 0;
        } else {
            peekPosition = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (!g(lp6Var)) {
                g1g g1gVar = this.c;
                g1gVar.N(0);
                int iM = g1gVar.m();
                if ((i == 0 || ((-128000) & iM) == (i & (-128000))) && (iS = phj.S(iM)) != -1) {
                    i2++;
                    if (i2 != 1) {
                        if (i2 == 4) {
                            break;
                        }
                    } else {
                        this.d.a(iM);
                        i = iM;
                    }
                    lp6Var.a(iS - 4, false);
                } else {
                    int i4 = i3 + 1;
                    if (i3 == 131072) {
                        if (z) {
                            return false;
                        }
                        f();
                        qp2.c();
                        return false;
                    }
                    if (z) {
                        lp6Var.f = 0;
                        lp6Var.a(peekPosition + i4, false);
                    } else {
                        lp6Var.h(1, false);
                    }
                    i2 = 0;
                    i3 = i4;
                    i = 0;
                }
            } else if (i2 <= 0) {
                f();
                qp2.c();
                return false;
            }
        }
        if (z) {
            lp6Var.h(peekPosition + i3, false);
        } else {
            lp6Var.f = 0;
        }
        this.k = i;
        return true;
    }

    @Override // defpackage.cn8
    public final void release() {
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        this.k = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.q = 0;
        this.p = -1L;
        this.u = j2;
        xwi xwiVar = this.r;
        if (xwiVar instanceof a6b) {
            j0d j0dVar = ((a6b) xwiVar).d.b;
            int i = j0dVar.b;
            if (i == 0 || j2 - j0dVar.d(i - 1) >= 100000) {
                this.t = true;
                this.j = this.g;
            }
        }
    }
}
