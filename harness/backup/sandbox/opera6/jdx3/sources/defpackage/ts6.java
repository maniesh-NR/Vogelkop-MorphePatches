package defpackage;

/* loaded from: classes.dex */
public final class ts6 extends nt5 {
    public long t;
    public oi9 u;
    public /* synthetic */ Object v;
    public final /* synthetic */ vs6 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts6(vs6 vs6Var, nt5 nt5Var) {
        super(nt5Var);
        this.w = vs6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.c(0L, null, this);
    }
}
