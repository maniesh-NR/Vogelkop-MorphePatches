package defpackage;

/* loaded from: classes.dex */
public final class xi9 extends nt5 {
    public long t;
    public long u;
    public /* synthetic */ Object v;
    public final /* synthetic */ zi9 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi9(zi9 zi9Var, nt5 nt5Var) {
        super(nt5Var);
        this.w = zi9Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.a(0L, this);
    }
}
