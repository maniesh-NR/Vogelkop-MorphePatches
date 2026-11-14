package defpackage;

/* loaded from: classes.dex */
public final class oz implements cn8 {
    public final g1g d;
    public final bq4 e;
    public en8 f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final int a = 0;
    public final pz b = new pz(null, 0, "audio/mp4a-latm", true);
    public final g1g c = new g1g(2048);
    public int i = -1;
    public long h = -1;

    public oz(int i) {
        g1g g1gVar = new g1g(10);
        this.d = g1gVar;
        byte[] bArr = g1gVar.a;
        this.e = new bq4(bArr, bArr.length);
    }

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        lp6 lp6Var = (lp6) dn8Var;
        int iE = e(lp6Var);
        int i = iE;
        int i2 = 0;
        int i3 = 0;
        do {
            g1g g1gVar = this.d;
            lp6Var.peekFully(g1gVar.a, 0, 2, false);
            g1gVar.N(0);
            if ((g1gVar.H() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                lp6Var.peekFully(g1gVar.a, 0, 4, false);
                bq4 bq4Var = this.e;
                bq4Var.q(14);
                int i4 = bq4Var.i(13);
                if (i4 <= 6) {
                    i++;
                    lp6Var.f = 0;
                    lp6Var.a(i, false);
                } else {
                    lp6Var.a(i4 - 6, false);
                    i3 += i4;
                }
            } else {
                i++;
                lp6Var.f = 0;
                lp6Var.a(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iE < 8192);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011f  */
    @Override // defpackage.cn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.dn8 r20, hp2 r21) throws defpackage.s1g, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oz.b(dn8, hp2):int");
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        this.f = en8Var;
        this.b.c(en8Var, new s7m(0, 1));
        en8Var.endTracks();
    }

    public final int e(lp6 lp6Var) {
        int i = 0;
        while (true) {
            g1g g1gVar = this.d;
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
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override // defpackage.cn8
    public final void release() {
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        this.k = false;
        this.b.seek();
        this.g = j2;
    }
}
