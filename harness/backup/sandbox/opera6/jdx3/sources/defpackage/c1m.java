package defpackage;

/* loaded from: classes.dex */
public final class c1m extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ g1m u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1m(g1m g1mVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = g1mVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(null, this);
    }
}
