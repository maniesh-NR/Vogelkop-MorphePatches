package defpackage;

/* loaded from: classes.dex */
public final class wgj extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ ehj u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgj(ehj ehjVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = ehjVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objA = this.u.a(null, 0L, null, this);
        return objA == px5.a ? objA : new t0i(objA);
    }
}
