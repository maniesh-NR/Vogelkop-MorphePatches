package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class d3h extends mqk {
    public final plh j;
    public boolean k;

    public d3h(SettingsManager settingsManager, iv7 iv7Var, qde qdeVar, ndc ndcVar, nqi nqiVar, plh plhVar) {
        super(kqk.h, "enable_product_suggestion", settingsManager, iv7Var, qdeVar, ndcVar, nqiVar);
        this.j = plhVar;
    }

    @Override // defpackage.mqk
    public final boolean a() {
        return super.a() && this.k;
    }

    @Override // defpackage.mqk
    public final boolean d() {
        return false;
    }

    @Override // defpackage.mqk
    public final void f() {
        super.f();
        ndc ndcVar = this.f;
        w7d.i(scd.D(this.j, ndcVar.getLifecycle()), cqp.V(ndcVar.getLifecycle()), new fb9((byte) 19, null, this));
    }
}
