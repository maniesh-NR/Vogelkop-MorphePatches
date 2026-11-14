package defpackage;

/* loaded from: classes.dex */
public final class t11 extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ a21 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t11(a21 a21Var, nt5 nt5Var) {
        super(nt5Var);
        this.u = a21Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(null, null, this);
    }
}
