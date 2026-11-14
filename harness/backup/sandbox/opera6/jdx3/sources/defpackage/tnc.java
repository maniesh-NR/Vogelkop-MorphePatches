package defpackage;

/* loaded from: classes.dex */
public final class tnc extends nt5 {
    public /* synthetic */ Object t;
    public int u;
    public final /* synthetic */ z78 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tnc(z78 z78Var, mt5 mt5Var) {
        super(mt5Var);
        this.v = z78Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return this.v.collect(null, this);
    }
}
