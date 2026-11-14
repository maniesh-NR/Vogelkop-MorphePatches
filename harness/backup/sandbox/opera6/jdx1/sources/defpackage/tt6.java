package defpackage;

/* loaded from: classes.dex */
public final class tt6 implements cn8 {
    public final /* synthetic */ byte a = 1;
    public final Object b;

    public tt6(int i) {
        if ((i & 1) != 0) {
            this.b = new bmj(65496, 2, "image/jpeg");
        } else {
            this.b = new apb();
        }
    }

    public tt6(oj9 oj9Var) {
        this.b = oj9Var;
    }

    private final void e() {
    }

    private final void f(long j, long j2) {
    }

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return ((cn8) this.b).a(dn8Var);
        }
    }

    @Override // defpackage.cn8
    public final int b(dn8 dn8Var, hp2 hp2Var) {
        switch (this.a) {
            case 0:
                return ((lp6) dn8Var).g(Integer.MAX_VALUE) != -1 ? 0 : -1;
            default:
                return ((cn8) this.b).b(dn8Var, hp2Var);
        }
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                hyl hylVarTrack = en8Var.track(0, 3);
                en8Var.h(new rv2(-9223372036854775807L));
                en8Var.endTracks();
                oj9 oj9Var = (oj9) obj;
                nj9 nj9VarA = oj9Var.a();
                nj9VarA.m = dzd.p("text/x-unknown");
                nj9VarA.j = oj9Var.n;
                z1m.q(nj9VarA, hylVarTrack);
                break;
            default:
                ((cn8) obj).d(en8Var);
                break;
        }
    }

    @Override // defpackage.cn8
    public final void release() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((cn8) this.b).release();
                break;
        }
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((cn8) this.b).seek(j, j2);
                break;
        }
    }
}
