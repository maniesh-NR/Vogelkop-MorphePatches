package defpackage;

/* loaded from: classes.dex */
public final class bmj implements cn8 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public byte e;
    public en8 f;
    public hyl g;

    public bmj(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        int i = this.b;
        int i2 = this.a;
        z4o.H((i2 == -1 || i == -1) ? false : true);
        g1g g1gVar = new g1g(i);
        ((lp6) dn8Var).peekFully(g1gVar.a, 0, i, false);
        return g1gVar.H() == i2;
    }

    @Override // defpackage.cn8
    public final int b(dn8 dn8Var, hp2 hp2Var) {
        byte b = this.e;
        if (b != 1) {
            if (b == 2) {
                return -1;
            }
            h9o.e();
            return 0;
        }
        hyl hylVar = this.g;
        hylVar.getClass();
        int iC = hylVar.c(dn8Var, 1024, true);
        if (iC != -1) {
            this.d += iC;
            return 0;
        }
        this.e = (byte) 2;
        this.g.a(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        this.f = en8Var;
        hyl hylVarTrack = en8Var.track(1024, 4);
        this.g = hylVarTrack;
        nj9 nj9Var = new nj9();
        String str = this.c;
        nj9Var.l = dzd.p(str);
        nj9Var.m = dzd.p(str);
        z1m.q(nj9Var, hylVarTrack);
        this.f.endTracks();
        this.f.h(new dmj());
        this.e = (byte) 1;
    }

    @Override // defpackage.cn8
    public final void release() {
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = (byte) 1;
            this.d = 0;
        }
    }
}
