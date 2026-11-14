package defpackage;

/* loaded from: classes.dex */
public final class qi9 extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ ti9 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi9(ti9 ti9Var, nt5 nt5Var) {
        super(nt5Var);
        this.u = ti9Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objA = this.u.a(this);
        return objA == px5.a ? objA : new t0i(objA);
    }
}
