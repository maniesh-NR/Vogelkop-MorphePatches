package defpackage;

/* loaded from: classes.dex */
public final class yu6 extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ av6 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu6(av6 av6Var, nt5 nt5Var) {
        super(nt5Var);
        this.u = av6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objH = this.u.h(this);
        return objH == px5.a ? objH : new t0i(objH);
    }
}
