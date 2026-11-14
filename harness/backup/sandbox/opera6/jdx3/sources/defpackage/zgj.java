package defpackage;

/* loaded from: classes.dex */
public final class zgj extends nt5 {
    public fvh t;
    public i9c u;
    public String v;
    public /* synthetic */ Object w;
    public final /* synthetic */ ehj x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgj(ehj ehjVar, nt5 nt5Var) {
        super(nt5Var);
        this.x = ehjVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        Object objI = this.x.i(null, null, null, this);
        return objI == px5.a ? objI : new t0i(objI);
    }
}
