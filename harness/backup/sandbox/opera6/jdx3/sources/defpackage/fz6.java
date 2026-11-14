package defpackage;

/* loaded from: classes.dex */
public final class fz6 extends nt5 {
    public /* synthetic */ Object t;
    public int u;
    public final /* synthetic */ no6 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz6(no6 no6Var, mt5 mt5Var) {
        super(mt5Var);
        this.v = no6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return this.v.collect(null, this);
    }
}
