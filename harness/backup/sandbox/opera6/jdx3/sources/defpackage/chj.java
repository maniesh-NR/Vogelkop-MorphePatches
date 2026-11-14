package defpackage;

/* loaded from: classes.dex */
public final class chj extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ ehj u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chj(ehj ehjVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = ehjVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objK = this.u.k(null, this);
        return objK == px5.a ? objK : new t0i(objK);
    }
}
