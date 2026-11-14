package defpackage;

/* loaded from: classes.dex */
public final class pbi extends nt5 {
    public ghf t;
    public String u;
    public /* synthetic */ Object v;
    public final /* synthetic */ ghf w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbi(ghf ghfVar, nt5 nt5Var) {
        super(nt5Var);
        this.w = ghfVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.x(null, null, this);
    }
}
