package defpackage;

import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class hf9 implements cn8 {
    public final g1g a = new g1g(4);
    public final g1g b = new g1g(9);
    public final g1g c = new g1g(11);
    public final g1g d = new g1g();
    public final doi e;
    public en8 f;
    public byte g;
    public boolean h;
    public long i;
    public int j;
    public short k;
    public int l;
    public long m;
    public boolean n;
    public nh2 o;
    public v4n p;

    public hf9() {
        doi doiVar = new doi(new s97(), (byte) 22);
        doiVar.c = -9223372036854775807L;
        doiVar.d = new long[0];
        doiVar.e = new long[0];
        this.e = doiVar;
        this.g = (byte) 1;
    }

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        g1g g1gVar = this.a;
        lp6 lp6Var = (lp6) dn8Var;
        lp6Var.peekFully(g1gVar.a, 0, 3, false);
        g1gVar.N(0);
        if (g1gVar.D() == 4607062) {
            lp6Var.peekFully(g1gVar.a, 0, 2, false);
            g1gVar.N(0);
            if ((g1gVar.H() & 250) == 0) {
                lp6Var.peekFully(g1gVar.a, 0, 4, false);
                g1gVar.N(0);
                int iM = g1gVar.m();
                lp6Var.f = 0;
                lp6Var.a(iM, false);
                lp6Var.peekFully(g1gVar.a, 0, 4, false);
                g1gVar.N(0);
                if (g1gVar.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02aa  */
    /* JADX WARN: Type inference failed for: r2v45, types: [int, short] */
    @Override // defpackage.cn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.dn8 r34, hp2 r35) throws defpackage.s1g, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf9.b(dn8, hp2):int");
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        this.f = en8Var;
    }

    public final g1g e(lp6 lp6Var) throws InterruptedIOException {
        int i = this.l;
        g1g g1gVar = this.d;
        byte[] bArr = g1gVar.a;
        if (i > bArr.length) {
            g1gVar.L(new byte[Math.max(bArr.length << 1, i)], 0);
        } else {
            g1gVar.N(0);
        }
        g1gVar.M(this.l);
        lp6Var.readFully(g1gVar.a, 0, this.l, false);
        return g1gVar;
    }

    @Override // defpackage.cn8
    public final void release() {
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.g = (byte) 1;
            this.h = false;
        } else {
            this.g = (byte) 3;
        }
        this.j = 0;
    }
}
