package defpackage;

/* loaded from: classes.dex */
public final class t74 extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ u74 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t74(u74 u74Var, nt5 nt5Var) {
        super(nt5Var);
        this.u = u74Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objF = this.u.f(this);
        return objF == px5.a ? objF : new t0i(objF);
    }
}
