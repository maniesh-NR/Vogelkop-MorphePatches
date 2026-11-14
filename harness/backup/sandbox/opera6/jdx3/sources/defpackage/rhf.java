package defpackage;

import android.app.Activity;

/* loaded from: classes.dex */
public final class rhf extends rn {
    public final /* synthetic */ byte m;
    public final /* synthetic */ oo8 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rhf(oo8 oo8Var, Activity activity, zy zyVar, dl dlVar, byte b) {
        super(oo8Var, activity, zyVar, dlVar);
        this.m = b;
        this.n = oo8Var;
    }

    @Override // defpackage.rn
    public final void g() {
        rhf rhfVar;
        eq eqVar;
        byte b = this.m;
        byte b2 = 1;
        oo8 oo8Var = this.n;
        String str = this.c;
        Activity activity = this.k;
        switch (b) {
            case 0:
                bp bpVar = new bp();
                int iOrdinal = oo8Var.f.ordinal();
                if (iOrdinal == 1) {
                    rhfVar = this;
                    eqVar = eq.c;
                } else if (iOrdinal != 2) {
                    b(false, "Unknown banner ad format for Opera Ads", false, v50.n, null);
                    break;
                } else {
                    rhfVar = this;
                    eqVar = eq.d;
                }
                z13 z13Var = new z13(activity);
                if (z13Var.b == null) {
                    z13Var.b = str;
                }
                if (z13Var.a == null) {
                    z13Var.a = eqVar;
                }
                z13Var.g(new s14(bpVar, rhfVar, z13Var, oo8Var));
                break;
            case 1:
                p8f p8fVar = new p8f(this, new bp(), oo8Var, b2);
                wjo wjoVar = wjo.REGULAR;
                if (fcp.a(p8fVar) != null && fcp.b(p8fVar, activity) != null && fcp.c(p8fVar, str) != null) {
                    ejo ejoVar = fko.a;
                    fko.a(activity);
                    dhb dhbVar = new dhb(activity.getApplicationContext(), new pro(str, sm.e, eq.e, wjoVar));
                    dhbVar.J(p8fVar);
                    dhbVar.I();
                    break;
                }
                break;
            default:
                phj.d0(activity, str, new shf(new bp(), this, oo8Var));
                break;
        }
    }
}
