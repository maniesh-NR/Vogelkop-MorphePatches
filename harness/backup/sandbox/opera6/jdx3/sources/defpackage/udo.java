package defpackage;

/* loaded from: classes.dex */
public final class udo extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ wdo u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udo(wdo wdoVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = wdoVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objA = this.u.a(null, null, null, null, null, this);
        return objA == px5.a ? objA : new t0i(objA);
    }
}
