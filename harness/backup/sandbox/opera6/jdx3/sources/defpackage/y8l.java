package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class y8l extends dp3 {
    public final SettingsManager b;

    public y8l(SettingsManager settingsManager, ew3 ew3Var) {
        super(ew3Var);
        this.b = settingsManager;
    }

    @Override // defpackage.dp3
    public final boolean b() {
        SettingsManager settingsManager = this.b;
        if (a(settingsManager.f(), settingsManager.c())) {
            return settingsManager.i("tab_switch_swipe_gesture_enabled");
        }
        return false;
    }
}
