package defpackage;

/* loaded from: classes.dex */
public final class p2i extends nt5 {
    public String t;
    public /* synthetic */ Object u;
    public final /* synthetic */ r2i v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2i(r2i r2iVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = r2iVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        Object objB = this.v.b(null, this);
        return objB == px5.a ? objB : new t0i(objB);
    }
}
