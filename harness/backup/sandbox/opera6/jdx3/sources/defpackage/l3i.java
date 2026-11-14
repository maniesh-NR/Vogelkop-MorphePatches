package defpackage;

/* loaded from: classes.dex */
public final class l3i extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ m3i u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3i(m3i m3iVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = m3iVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(null, this);
    }
}
