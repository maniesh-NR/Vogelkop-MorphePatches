package defpackage;

/* loaded from: classes.dex */
public final class xfo extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ zfo u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfo(zfo zfoVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = zfoVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objB = this.u.b(null, null, this);
        return objB == px5.a ? objB : new t0i(objB);
    }
}
