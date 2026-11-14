package defpackage;

/* loaded from: classes.dex */
public final class mz1 extends nt5 {
    public String t;
    public /* synthetic */ Object u;
    public final /* synthetic */ tz1 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz1(tz1 tz1Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = tz1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.b(null, this);
    }
}
