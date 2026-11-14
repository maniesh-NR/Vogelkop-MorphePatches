package defpackage;

/* loaded from: classes.dex */
public final class nze extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ zm9 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nze(zm9 zm9Var, nt5 nt5Var) {
        super(nt5Var);
        this.u = zm9Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.e(null, this);
    }
}
