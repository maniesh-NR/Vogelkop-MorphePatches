package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class l0h implements as6 {
    public final BrowserActivity a;
    public final BrowserActivity b;
    public final BrowserActivity c;
    public final oz3 d;
    public final gbf e;
    public final k6l f;
    public final qz g;
    public int h;
    public final SettingsManager i;

    public l0h(BrowserActivity browserActivity, BrowserActivity browserActivity2, BrowserActivity browserActivity3, oz3 oz3Var, gbf gbfVar, k6l k6lVar, SettingsManager settingsManager) {
        qz qzVar = new qz(this, (byte) 18);
        this.g = qzVar;
        this.a = browserActivity;
        this.d = oz3Var;
        this.e = gbfVar;
        this.f = k6lVar;
        this.b = browserActivity2;
        this.c = browserActivity3;
        this.i = settingsManager;
        browserActivity2.getLifecycle().a(this);
        k6lVar.b(qzVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(BrowserActivity browserActivity, SettingsManager settingsManager) {
        return settingsManager.i("feature_tips_notification") && !ru9.c(browserActivity).a.getBoolean("privacy_monitor.shown", false) && ru9.c(browserActivity).a.getLong("privacy_monitor.promotion.shown.timestamp", 0L) == 0;
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        this.b.getLifecycle().b(this);
        this.f.v(this.g);
    }
}
