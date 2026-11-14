package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class sx3 extends lim implements p5j {
    public final SettingsManager a;
    public final b7f b;

    public sx3(SettingsManager settingsManager) {
        b7f b7fVarM = uup.m(Boolean.FALSE);
        this.b = b7fVarM;
        this.a = settingsManager;
        b7fVarM.d(Boolean.valueOf(settingsManager.i("thumb_scroller_enabled")));
        settingsManager.F(this);
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("thumb_scroller_enabled".equals(str)) {
            this.b.d(Boolean.valueOf(this.a.i("thumb_scroller_enabled")));
        }
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.a.H(this);
    }
}
