package defpackage;

/* loaded from: classes.dex */
public final class e3i extends nt5 {
    public /* synthetic */ Object t;
    public int u;
    public final /* synthetic */ ref v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3i(ref refVar, mt5 mt5Var) {
        super(mt5Var);
        this.v = refVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return this.v.emit(null, this);
    }
}
