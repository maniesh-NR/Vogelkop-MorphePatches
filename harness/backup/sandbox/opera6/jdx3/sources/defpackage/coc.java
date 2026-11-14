package defpackage;

/* loaded from: classes.dex */
public final class coc extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ doc u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coc(doc docVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = docVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(0L, this);
    }
}
