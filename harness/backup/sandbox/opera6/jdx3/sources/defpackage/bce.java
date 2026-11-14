package defpackage;

/* loaded from: classes.dex */
public final class bce extends nt5 {
    public String t;
    public pfe u;
    public /* synthetic */ Object v;
    public final /* synthetic */ ece w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bce(ece eceVar, nt5 nt5Var) {
        super(nt5Var);
        this.w = eceVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.d(null, this);
    }
}
