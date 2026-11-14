package defpackage;

/* loaded from: classes.dex */
public final class lth extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ ghf u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lth(ghf ghfVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = ghfVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objR = ghf.r(this.u, null, this);
        return objR == px5.a ? objR : new t0i(objR);
    }
}
