package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final /* synthetic */ class nx3 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SettingsManager b;

    public /* synthetic */ nx3(SettingsManager settingsManager, byte b) {
        this.a = b;
        this.b = settingsManager;
    }

    public final Object get() {
        boolean zI;
        byte b = this.a;
        SettingsManager settingsManager = this.b;
        switch (b) {
            case 0:
                zI = settingsManager.i("tab_auto_grouping");
                break;
            case 1:
                zI = settingsManager.i("darken_websites");
                break;
            case 2:
                zI = settingsManager.i("night_mode_switch_theme");
                break;
            default:
                zI = settingsManager.i("night_mode_overlay_keyboard");
                break;
        }
        return Boolean.valueOf(zI);
    }
}
