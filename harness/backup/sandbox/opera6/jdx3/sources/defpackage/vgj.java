package defpackage;

/* loaded from: classes.dex */
public final class vgj extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ ehj u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgj(ehj ehjVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = ehjVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objC = this.u.c(null, 0L, null, this);
        return objC == px5.a ? objC : new t0i(objC);
    }
}
