package defpackage;

/* loaded from: classes.dex */
public final class y0l extends nt5 {
    public u7k t;
    public /* synthetic */ Object u;
    public final /* synthetic */ u7k v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0l(u7k u7kVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = u7kVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        Object objO = this.v.o(null, this);
        return objO == px5.a ? objO : new t0i(objO);
    }
}
