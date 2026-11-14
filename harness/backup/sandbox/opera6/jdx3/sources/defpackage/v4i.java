package defpackage;

/* loaded from: classes.dex */
public final class v4i extends nt5 {
    public k15 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ x4i v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4i(x4i x4iVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = x4iVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        Object objA = this.v.a(null, this);
        return objA == px5.a ? objA : new t0i(objA);
    }
}
