package defpackage;

/* loaded from: classes.dex */
public final class ago extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ bgo u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ago(bgo bgoVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = bgoVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(null, this);
    }
}
