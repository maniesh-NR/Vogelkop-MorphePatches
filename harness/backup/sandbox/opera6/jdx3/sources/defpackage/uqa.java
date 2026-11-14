package defpackage;

/* loaded from: classes.dex */
public final class uqa extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ yqa u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqa(yqa yqaVar, mt5 mt5Var) {
        super(mt5Var);
        this.u = yqaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(null, null, this);
    }
}
