package defpackage;

/* loaded from: classes.dex */
public final class xp6 extends nt5 {
    public Object t;
    public /* synthetic */ Object u;
    public final /* synthetic */ cq6 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp6(cq6 cq6Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = cq6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        Object objA = this.v.a(this);
        return objA == px5.a ? objA : new t0i(objA);
    }
}
