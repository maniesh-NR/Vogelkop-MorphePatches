package defpackage;

/* loaded from: classes.dex */
public final class o5e extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ p5e u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5e(p5e p5eVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = p5eVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(this);
    }
}
