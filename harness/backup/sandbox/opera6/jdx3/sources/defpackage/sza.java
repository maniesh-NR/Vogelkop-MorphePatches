package defpackage;

/* loaded from: classes.dex */
public final class sza extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ tza u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sza(tza tzaVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = tzaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.d(null, this);
    }
}
