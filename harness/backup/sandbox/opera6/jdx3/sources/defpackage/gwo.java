package defpackage;

/* loaded from: classes.dex */
public final class gwo extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ oxo u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwo(oxo oxoVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = oxoVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objF = this.u.f(null, null, null, null, null, null, null, null, this);
        return objF == px5.a ? objF : new t0i(objF);
    }
}
