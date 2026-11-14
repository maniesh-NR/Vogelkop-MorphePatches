package defpackage;

/* loaded from: classes.dex */
public final class agl extends i17 implements hi5, lfl {
    public jvg q;
    public t78 r;
    public xhl s;
    public qw5 t;
    public d3k u;
    public final i37 v = luj.b(new p7l(this, (byte) 4));
    public voh w = voh.e;

    public agl(jvg jvgVar, t78 t78Var, xhl xhlVar, qw5 qw5Var) {
        this.q = jvgVar;
        this.r = t78Var;
        this.s = xhlVar;
        this.t = qw5Var;
    }

    @Override // defpackage.b8e
    public final void L0() {
        jvg jvgVar = this.q;
        jvgVar.c = mtl.c;
        jvgVar.b = this;
    }

    @Override // defpackage.b8e
    public final void M0() {
        jvg jvgVar = this.q;
        jvgVar.c = mtl.b;
        jvgVar.b = null;
    }

    @Override // defpackage.lfl
    public final long U(b2c b2cVar) {
        return W(b2cVar).d();
    }

    @Override // defpackage.lfl
    public final voh W(b2c b2cVar) {
        voh vohVar;
        if (this.n && (vohVar = (voh) this.t.invoke(b2cVar)) != null) {
            this.w = vohVar;
            return vohVar;
        }
        return this.w;
    }

    @Override // defpackage.lfl
    public final kfl y() {
        return (kfl) this.v.getValue();
    }
}
