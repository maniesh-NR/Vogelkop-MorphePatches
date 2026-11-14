package defpackage;

/* loaded from: classes.dex */
public final class yfo extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ zfo u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfo(zfo zfoVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = zfoVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objC = this.u.c(0L, null, 0L, 0L, this);
        return objC == px5.a ? objC : new t0i(objC);
    }
}
