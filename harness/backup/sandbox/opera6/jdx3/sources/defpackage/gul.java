package defpackage;

/* loaded from: classes.dex */
public final class gul extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ kul u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gul(kul kulVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = kulVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(this);
    }
}
