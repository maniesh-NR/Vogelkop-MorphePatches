package defpackage;

/* loaded from: classes.dex */
public final class omk extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ tmk u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omk(tmk tmkVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = tmkVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.c(this);
    }
}
