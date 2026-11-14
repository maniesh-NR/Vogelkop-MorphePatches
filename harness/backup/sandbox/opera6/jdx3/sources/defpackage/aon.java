package defpackage;

/* loaded from: classes.dex */
public final class aon extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ z4k u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aon(z4k z4kVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = z4kVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.e(this);
    }
}
