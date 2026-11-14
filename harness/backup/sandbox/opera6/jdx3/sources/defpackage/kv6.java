package defpackage;

/* loaded from: classes.dex */
public final class kv6 extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ lq6 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv6(lq6 lq6Var, nt5 nt5Var) {
        super(nt5Var);
        this.u = lq6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objA = this.u.a(null, this);
        return objA == px5.a ? objA : new t0i(objA);
    }
}
