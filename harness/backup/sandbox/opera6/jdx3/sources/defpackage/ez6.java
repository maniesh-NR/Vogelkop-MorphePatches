package defpackage;

/* loaded from: classes.dex */
public final class ez6 extends nt5 {
    public /* synthetic */ Object t;
    public int u;
    public final /* synthetic */ bw v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez6(bw bwVar, mt5 mt5Var) {
        super(mt5Var);
        this.v = bwVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return this.v.emit(null, this);
    }
}
