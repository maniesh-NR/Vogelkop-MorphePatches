package defpackage;

/* loaded from: classes.dex */
public final class q2p extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ a3p u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2p(a3p a3pVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = a3pVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.d(null, this);
    }
}
