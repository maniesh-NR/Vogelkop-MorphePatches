package defpackage;

/* loaded from: classes.dex */
public final class von extends nt5 {
    public /* synthetic */ Object t;
    public int u;
    public final /* synthetic */ yc1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public von(yc1 yc1Var, mt5 mt5Var) {
        super(mt5Var);
        this.v = yc1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return this.v.collect(null, this);
    }
}
