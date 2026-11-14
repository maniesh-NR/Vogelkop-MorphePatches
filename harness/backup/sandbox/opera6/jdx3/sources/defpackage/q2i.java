package defpackage;

/* loaded from: classes.dex */
public final class q2i extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ r2i u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2i(r2i r2iVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = r2iVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.c(this);
    }
}
