package defpackage;

/* loaded from: classes.dex */
public final class b2f extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ e2f u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2f(e2f e2fVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = e2fVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(null, this);
    }
}
