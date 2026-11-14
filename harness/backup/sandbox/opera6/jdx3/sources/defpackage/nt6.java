package defpackage;

/* loaded from: classes.dex */
public final class nt6 extends nt5 {
    public String t;
    public /* synthetic */ Object u;
    public final /* synthetic */ ot6 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt6(ot6 ot6Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = ot6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.b(null, this);
    }
}
