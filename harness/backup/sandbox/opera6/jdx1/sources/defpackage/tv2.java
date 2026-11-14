package defpackage;

/* loaded from: classes.dex */
public final class tv2 implements cn8 {
    public final g1g a;
    public final sv2 b;
    public final boolean c;
    public final r16 d;
    public byte e;
    public en8 f;
    public uv2 g;
    public long h;
    public zz4[] i;
    public long j;
    public zz4 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public tv2(int i, r16 r16Var) {
        this.d = r16Var;
        this.c = (i & 1) == 0;
        this.a = new g1g(12);
        this.b = new sv2();
        this.f = new hr5();
        this.i = new zz4[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        g1g g1gVar = this.a;
        ((lp6) dn8Var).peekFully(g1gVar.a, 0, 12, false);
        g1gVar.N(0);
        if (g1gVar.o() == 1179011410) {
            g1gVar.O(4);
            if (g1gVar.o() == 541677121) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0110  */
    @Override // defpackage.cn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.dn8 r26, hp2 r27) throws defpackage.s1g, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv2.b(dn8, hp2):int");
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        this.e = (byte) 0;
        if (this.c) {
            en8Var = new h5k(en8Var, this.d);
        }
        this.f = en8Var;
        this.j = -1L;
    }

    @Override // defpackage.cn8
    public final void release() {
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (zz4 zz4Var : this.i) {
            if (zz4Var.k == 0) {
                zz4Var.i = 0;
            } else {
                zz4Var.i = zz4Var.n[tym.f(zz4Var.m, j, true)];
            }
        }
        if (j != 0) {
            this.e = (byte) 6;
        } else if (this.i.length == 0) {
            this.e = (byte) 0;
        } else {
            this.e = (byte) 3;
        }
    }
}
