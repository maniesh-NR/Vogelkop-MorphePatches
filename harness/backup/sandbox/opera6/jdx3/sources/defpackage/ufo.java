package defpackage;

/* loaded from: classes.dex */
public final class ufo extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ oam u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufo(oam oamVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = oamVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objK = this.u.k(null, this);
        return objK == px5.a ? objK : new t0i(objK);
    }
}
