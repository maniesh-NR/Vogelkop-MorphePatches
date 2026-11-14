package defpackage;

/* loaded from: classes.dex */
public final class ov6 extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ eq6 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov6(eq6 eq6Var, nt5 nt5Var) {
        super(nt5Var);
        this.u = eq6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objJ = this.u.J(null, this);
        return objJ == px5.a ? objJ : new t0i(objJ);
    }
}
