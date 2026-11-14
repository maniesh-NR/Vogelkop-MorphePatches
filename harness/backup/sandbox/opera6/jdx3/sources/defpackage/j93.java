package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public abstract class j93 extends l7n implements h93 {
    public final SettingsManager b;
    public final d8j c;

    public j93(SettingsManager settingsManager, d8j d8jVar) {
        this.b = settingsManager;
        this.c = d8jVar;
    }

    public d8j f() {
        return this.c;
    }

    public void s() {
        ((g8j) f()).h();
    }
}
