package defpackage;

/* loaded from: classes.dex */
public final class xhi extends nt5 {
    public String t;
    public /* synthetic */ Object u;
    public final /* synthetic */ yhi v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhi(yhi yhiVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = yhiVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
