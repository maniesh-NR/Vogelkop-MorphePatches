package defpackage;

/* loaded from: classes.dex */
public final class si9 extends nt5 {
    public long t;
    public /* synthetic */ Object u;
    public final /* synthetic */ ti9 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si9(ti9 ti9Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = ti9Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(0L, this);
    }
}
