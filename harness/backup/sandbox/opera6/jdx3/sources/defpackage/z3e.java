package defpackage;

/* loaded from: classes.dex */
public final class z3e extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ a4e u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3e(a4e a4eVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = a4eVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(this);
    }
}
