package defpackage;

/* loaded from: classes.dex */
public final class nef extends nt5 {
    public /* synthetic */ Object t;
    public int u;
    public final /* synthetic */ vu6 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nef(vu6 vu6Var, mt5 mt5Var) {
        super(mt5Var);
        this.v = vu6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return this.v.collect(null, this);
    }
}
