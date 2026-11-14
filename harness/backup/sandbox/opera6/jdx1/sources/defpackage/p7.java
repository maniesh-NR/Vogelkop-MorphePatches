package defpackage;

import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class p7 implements cn8 {
    public final o7 a = new o7(null, 0, "audio/ac4", (byte) 1);
    public final g1g b = new g1g(16384);
    public boolean c;

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        lp6 lp6Var;
        int i;
        g1g g1gVar = new g1g(10);
        int i2 = 0;
        while (true) {
            lp6Var = (lp6) dn8Var;
            lp6Var.peekFully(g1gVar.a, 0, 10, false);
            g1gVar.N(0);
            if (g1gVar.D() != 4801587) {
                break;
            }
            g1gVar.O(3);
            int iZ = g1gVar.z();
            i2 += iZ + 10;
            lp6Var.a(iZ, false);
        }
        lp6Var.f = 0;
        lp6Var.a(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            lp6Var.peekFully(g1gVar.a, 0, 7, false);
            g1gVar.N(0);
            int iH = g1gVar.H();
            if (iH != 44096 && iH != 44097) {
                lp6Var.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                lp6Var.a(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = g1gVar.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iH == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                lp6Var.a(i - 7, false);
            }
        }
        return false;
    }

    @Override // defpackage.cn8
    public final int b(dn8 dn8Var, hp2 hp2Var) throws InterruptedIOException {
        g1g g1gVar = this.b;
        int i = ((lp6) dn8Var).read(g1gVar.a, 0, 16384);
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
