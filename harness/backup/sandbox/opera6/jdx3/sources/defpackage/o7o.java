package defpackage;

/* loaded from: classes.dex */
public final class o7o extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ q7o u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7o(q7o q7oVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = q7oVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(null, this);
    }
}
