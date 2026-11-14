package defpackage;

/* loaded from: classes.dex */
public final class z0l extends nt5 {
    public u7k t;
    public /* synthetic */ Object u;
    public final /* synthetic */ u7k v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0l(u7k u7kVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = u7kVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        Object objP = this.v.p(this);
        return objP == px5.a ? objP : new t0i(objP);
    }
}
