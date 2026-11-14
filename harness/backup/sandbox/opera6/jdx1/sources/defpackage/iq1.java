package defpackage;

/* loaded from: classes.dex */
public final class iq1 extends ek9 {
    public final /* synthetic */ nq1 j;
    public final /* synthetic */ qq1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq1(qq1 qq1Var, qq1 qq1Var2, nq1 nq1Var) {
        super(qq1Var2);
        this.k = qq1Var;
        this.j = nq1Var;
    }

    @Override // defpackage.ek9
    public final gij b() {
        return this.j;
    }

    @Override // defpackage.ek9
    public final boolean c() {
        qq1 qq1Var = this.k;
        pq1 pq1Var = qq1Var.f;
        if (pq1Var.a()) {
            return true;
        }
        pq1Var.i(qq1Var.getTextDirection(), qq1Var.getTextAlignment());
        return true;
    }
}
