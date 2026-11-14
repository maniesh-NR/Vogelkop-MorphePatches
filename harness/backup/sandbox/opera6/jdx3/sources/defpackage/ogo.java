package defpackage;

/* loaded from: classes.dex */
public final class ogo extends wbp {
    public final /* synthetic */ cko b;

    public ogo(cko ckoVar) {
        this.b = ckoVar;
    }

    @Override // defpackage.icp
    public final void a(int i, Object obj) {
        p7p p7pVarE;
        Throwable thD = t0i.d(obj);
        if (thD == null || (p7pVarE = this.b.e()) == null) {
            return;
        }
        p7pVarE.g(2000, thD.getMessage());
    }
}
