package defpackage;

/* loaded from: classes.dex */
public final class wfo extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ zfo u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfo(zfo zfoVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = zfoVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objA = this.u.a(0L, this, null);
        return objA == px5.a ? objA : new t0i(objA);
    }
}
