package defpackage;

/* loaded from: classes.dex */
public final class gp3 extends nt5 {
    public /* synthetic */ Object t;
    public int u;
    public final /* synthetic */ ip3 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp3(ip3 ip3Var, mt5 mt5Var) {
        super(mt5Var);
        this.v = ip3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return this.v.collect(null, this);
    }
}
