package defpackage;

/* loaded from: classes.dex */
public final class kz1 extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ tz1 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz1(tz1 tz1Var, nt5 nt5Var) {
        super(nt5Var);
        this.u = tz1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(this);
    }
}
