package defpackage;

/* loaded from: classes.dex */
public final class xfj extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ egj u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfj(egj egjVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = egjVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objE = this.u.e(null, null, this);
        return objE == px5.a ? objE : new t0i(objE);
    }
}
