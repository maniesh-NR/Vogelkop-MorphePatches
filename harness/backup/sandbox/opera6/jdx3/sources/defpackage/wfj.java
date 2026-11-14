package defpackage;

/* loaded from: classes.dex */
public final class wfj extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ egj u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfj(egj egjVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = egjVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objF = this.u.f(null, this);
        return objF == px5.a ? objF : new t0i(objF);
    }
}
