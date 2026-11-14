package defpackage;

/* loaded from: classes.dex */
public final class zvn extends nt5 {
    public Exception t;
    public /* synthetic */ Object u;
    public final /* synthetic */ dwn v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvn(dwn dwnVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = dwnVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(0, null, this);
    }
}
