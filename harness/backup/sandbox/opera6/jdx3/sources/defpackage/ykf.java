package defpackage;

import com.google.android.gms.ads.AdError;

/* loaded from: classes.dex */
public final class ykf implements zcf {
    public final /* synthetic */ qhf a;
    public final /* synthetic */ zkf b;
    public final /* synthetic */ c37 c;

    public ykf(c37 c37Var, qhf qhfVar, zkf zkfVar) {
        this.c = c37Var;
        this.a = qhfVar;
        this.b = zkfVar;
    }

    @Override // defpackage.zcf
    public final void a(cm cmVar) {
        c37 c37Var = this.c;
        c37Var.getClass();
        c37.y(this.a, "initialize: onError, error=" + cmVar);
        c37Var.a = Boolean.FALSE;
        AdError adErrorQ = rm5.q(cmVar.b, cmVar.c);
        c37Var.b = adErrorQ;
        this.b.d(adErrorQ);
    }

    @Override // defpackage.zcf
    public final void onSuccess() {
        c37 c37Var = this.c;
        c37Var.getClass();
        c37.y(this.a, "initialize: onSuccess");
        c37Var.a = Boolean.TRUE;
        this.b.e();
    }
}
