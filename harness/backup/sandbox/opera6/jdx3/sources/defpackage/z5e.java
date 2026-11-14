package defpackage;

/* loaded from: classes.dex */
public final class z5e extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ a6e u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5e(a6e a6eVar, mt5 mt5Var) {
        super(mt5Var);
        this.u = a6eVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(this);
    }
}
