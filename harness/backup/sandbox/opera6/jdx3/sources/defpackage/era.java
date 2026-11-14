package defpackage;

/* loaded from: classes.dex */
public final class era extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ fra u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public era(fra fraVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = fraVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(null, this);
    }
}
