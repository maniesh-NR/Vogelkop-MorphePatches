package defpackage;

import android.content.SharedPreferences;
import com.appsflyer.internal.j;

/* loaded from: classes.dex */
public final class lrn implements kz3 {
    public final /* synthetic */ mrn a;
    public final /* synthetic */ rn9 b;

    public lrn(mrn mrnVar, rn9 rn9Var) {
        this.a = mrnVar;
        this.b = rn9Var;
    }

    @Override // defpackage.kz3
    public final void b(hjm hjmVar) {
        int iOrdinal = hjmVar.ordinal();
        rn9 rn9Var = this.b;
        if (iOrdinal == 0) {
            rn9Var.J(kf0.b);
        } else if (iOrdinal == 1) {
            rn9Var.J(kf0.e);
        } else {
            h9o.p();
        }
    }

    @Override // defpackage.kz3
    public final void d() {
        this.b.J(kf0.d);
    }

    @Override // defpackage.kz3
    public final void g(lz3 lz3Var) {
        j.d((SharedPreferences) ((jbn) this.a.a.get()).d.a.get(), "hintShown", true);
    }
}
