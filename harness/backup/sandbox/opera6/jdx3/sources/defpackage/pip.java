package defpackage;

/* loaded from: classes.dex */
public final class pip extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ ftj u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pip(ftj ftjVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = ftjVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.c(null, null, 0, 0, this);
    }
}
