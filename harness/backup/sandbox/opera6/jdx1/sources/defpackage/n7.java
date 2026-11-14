package defpackage;

import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class n7 implements cn8 {
    public final o7 a = new o7("audio/ac3");
    public final g1g b = new g1g(2786);
    public boolean c;

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        lp6 lp6Var;
        int iJ;
        g1g g1gVar = new g1g(10);
        int i = 0;
        while (true) {
            lp6Var = (lp6) dn8Var;
            lp6Var.peekFully(g1gVar.a, 0, 10, false);
            g1gVar.N(0);
            if (g1gVar.D() != 4801587) {
                break;
            }
            g1gVar.O(3);
            int iZ = g1gVar.z();
            i += iZ + 10;
            lp6Var.a(iZ, false);
        }
        lp6Var.f = 0;
        lp6Var.a(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            lp6Var.peekFully(g1gVar.a, 0, 6, false);
            g1gVar.N(0);
            if (g1gVar.H() != 2935) {
                lp6Var.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                lp6Var.a(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = g1gVar.a;
                if (bArr.length < 6) {
                    iJ = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iJ = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) << 1;
                } else {
                    byte b = bArr[4];
                    iJ = j14.J((b & 192) >> 6, b & 63);
                }
                if (iJ == -1) {
                    break;
                }
                lp6Var.a(iJ - 6, false);
            }
        }
        return false;
    }

    @Override // defpackage.cn8
    public final int b(dn8 dn8Var, hp2 hp2Var) throws InterruptedIOException {
        g1g g1gVar = this.b;
        int i = ((lp6) dn8Var).read(g1gVar.a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        g1gVar.N(0);
        g1gVar.M(i);
        boolean z = this.c;
        o7 o7Var = this.a;
        if (!z) {
            o7Var.o = 0L;
            this.c = true;
        }
        o7Var.a(g1gVar);
        return 0;
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        this.a.c(en8Var, new s7m(0, 1));
        en8Var.endTracks();
        en8Var.h(new rv2(-9223372036854775807L));
    }

    @Override // defpackage.cn8
    public final void release() {
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        this.c = false;
        this.a.seek();
    }
}
