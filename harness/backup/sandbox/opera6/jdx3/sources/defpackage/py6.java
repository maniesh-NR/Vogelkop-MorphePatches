package defpackage;

/* loaded from: classes.dex */
public final class py6 extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ kz6 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py6(kz6 kz6Var, nt5 nt5Var) {
        super(nt5Var);
        this.u = kz6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.i(null, this);
    }
}
