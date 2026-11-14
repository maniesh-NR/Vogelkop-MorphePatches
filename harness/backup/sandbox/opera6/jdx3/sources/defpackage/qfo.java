package defpackage;

/* loaded from: classes.dex */
public final class qfo extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ sfo u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfo(sfo sfoVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = sfoVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objD = this.u.d(null, null, null, null, null, null, this);
        return objD == px5.a ? objD : new t0i(objD);
    }
}
