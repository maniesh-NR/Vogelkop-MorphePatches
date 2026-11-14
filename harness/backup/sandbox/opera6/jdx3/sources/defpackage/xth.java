package defpackage;

/* loaded from: classes.dex */
public final class xth extends nt5 {
    public tth t;
    public /* synthetic */ Object u;
    public final /* synthetic */ zth v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xth(zth zthVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = zthVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return zth.b(this.v, null, this);
    }
}
