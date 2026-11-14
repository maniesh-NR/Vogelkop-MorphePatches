package defpackage;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class n49 implements as6, p5j {
    public final FirebaseAnalytics a;
    public final SettingsManager b;

    public n49(FirebaseAnalytics firebaseAnalytics, SettingsManager settingsManager, hjf hjfVar) {
        this.a = firebaseAnalytics;
        this.b = settingsManager;
        hjfVar.getLifecycle().a(this);
        settingsManager.F(this);
        firebaseAnalytics.a.zzq(Boolean.valueOf(settingsManager.i("ga_usage_statistics")));
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("ga_usage_statistics".equals(str)) {
            this.a.a.zzq(Boolean.valueOf(this.b.i("ga_usage_statistics")));
        }
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.b.H(this);
    }
}
