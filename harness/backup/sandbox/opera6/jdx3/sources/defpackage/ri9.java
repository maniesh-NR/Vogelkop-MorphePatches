package defpackage;

/* loaded from: classes.dex */
public final class ri9 extends nt5 {
    public sfo t;
    public String u;
    public String v;
    public /* synthetic */ Object w;
    public final /* synthetic */ ti9 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri9(ti9 ti9Var, nt5 nt5Var) {
        super(nt5Var);
        this.x = ti9Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        Object objB = this.x.b(this);
        return objB == px5.a ? objB : new t0i(objB);
    }
}
