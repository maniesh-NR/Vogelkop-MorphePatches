package defpackage;

/* loaded from: classes.dex */
public final class z0o extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ a1o u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0o(a1o a1oVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = a1oVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.f(this);
    }
}
