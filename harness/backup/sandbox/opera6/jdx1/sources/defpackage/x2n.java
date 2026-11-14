package defpackage;

/* loaded from: classes.dex */
public final class x2n implements v6f {
    public mc4 a;
    public boolean b;

    @Override // defpackage.v6f
    public final void a(Object obj) {
        jpo.n("SourceStreamRequirementObserver can be updated from main thread only", xug.n());
        boolean zEquals = Boolean.TRUE.equals((Boolean) obj);
        if (this.b != zEquals) {
            this.b = zEquals;
            mc4 mc4Var = this.a;
            if (mc4Var != null) {
                if (zEquals) {
                    mc4Var.l();
                } else {
                    mc4Var.c();
                }
            }
        }
    }

    @Override // defpackage.v6f
    public final void onError(Throwable th) {
    }
}
