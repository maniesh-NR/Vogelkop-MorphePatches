package defpackage;

/* loaded from: classes.dex */
public final class yfj extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ egj u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfj(egj egjVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = egjVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objG = this.u.g(0L, null, this);
        return objG == px5.a ? objG : new t0i(objG);
    }
}
