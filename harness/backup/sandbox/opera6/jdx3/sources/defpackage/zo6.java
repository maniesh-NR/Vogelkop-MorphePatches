package defpackage;

/* loaded from: classes.dex */
public final class zo6 extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ ap6 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo6(ap6 ap6Var, nt5 nt5Var) {
        super(nt5Var);
        this.u = ap6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(null, null, null, false, this);
    }
}
