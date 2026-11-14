package defpackage;

/* loaded from: classes.dex */
public final class c2f extends nt5 {
    public apc t;
    public /* synthetic */ Object u;
    public final /* synthetic */ e2f v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2f(e2f e2fVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = e2fVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(null, this);
    }
}
