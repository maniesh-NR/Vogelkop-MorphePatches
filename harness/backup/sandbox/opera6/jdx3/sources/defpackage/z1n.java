package defpackage;

import android.content.SharedPreferences;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class z1n implements w1n {
    public final /* synthetic */ byte a;
    public final esk b;

    public /* synthetic */ z1n(esk eskVar, byte b) {
        this.a = b;
        this.b = eskVar;
    }

    @Override // defpackage.w1n
    public final void apply(int i) {
        byte b = this.a;
        boolean zContains = false;
        esk eskVar = this.b;
        switch (b) {
            case 0:
                if (i > 0 && i < 1906603000) {
                    nv6 nv6VarB = ((ru9) ((tt3) eskVar).get()).b();
                    ((SharedPreferences.Editor) nv6VarB.a).putBoolean("main.menu.wallet.before.offline_pages", false);
                    nv6VarB.w();
                    break;
                }
                break;
            case 1:
                if (i > 0 && i < 1910306000) {
                    SettingsManager settingsManager = (SettingsManager) ((tt3) eskVar).get();
                    settingsManager.R(settingsManager.i("enable_suggested_speed_dials") ? 1 : 0, "enable_frequently_visited_sites");
                    settingsManager.a.n(settingsManager.c.getInt("enable_suggested_speed_dials", 0), "enable_suggested_speed_dials");
                    break;
                }
                break;
            case 2:
                tt3 tt3Var = (tt3) eskVar;
                if (i > 0 && i < 1906808000) {
                    ((SettingsManager) tt3Var.get()).R(((SettingsManager) tt3Var.get()).u("personalized_news") ? 1 : 0, "process_news_topics");
                    break;
                }
                break;
            case 3:
                tt3 tt3Var2 = (tt3) eskVar;
                if (i > 0 && i < 1907806000 && !((SettingsManager) tt3Var2.get()).a.contains("manual_wallpaper_first_occurrence")) {
                    zContains = ((SettingsManager) tt3Var2.get()).a.contains("wallpaper_current");
                }
                if (zContains) {
                    ((SettingsManager) tt3Var2.get()).W(0L, "manual_wallpaper_first_occurrence");
                    break;
                }
                break;
            case 4:
                tt3 tt3Var3 = (tt3) eskVar;
                if (i > 0 && i < 1908505000) {
                    int i2 = ((SettingsManager) tt3Var3.get()).a.getInt("app_theme_accent", -1);
                    if ((i2 >= 0 ? g7j.values()[i2] : null) == null) {
                        ((SettingsManager) tt3Var3.get()).R(0, "app_theme_accent");
                        break;
                    } else {
                        ((SettingsManager) tt3Var3.get()).V(1, "app_theme_accent_changed_by_user");
                        break;
                    }
                }
                break;
            case 5:
                tt3 tt3Var4 = (tt3) eskVar;
                if (i != 0 && i < 1909010000 && !((SettingsManager) tt3Var4.get()).a.contains("manual_wallpaper_first_occurrence")) {
                    zContains = !((SettingsManager) tt3Var4.get()).a.d("wallpaper_current");
                }
                if (zContains) {
                    SettingsManager settingsManager2 = (SettingsManager) tt3Var4.get();
                    settingsManager2.a.e("THEME_WALLPAPER", settingsManager2.c.getString("wallpaper_current", null));
                    break;
                }
                break;
            case 6:
                if (i >= 1906900000 && i < 1906908000) {
                    SettingsManager settingsManager3 = (SettingsManager) ((tt3) eskVar).get();
                    settingsManager3.a.n(settingsManager3.c.getInt("darken_websites", 0), "darken_websites");
                    break;
                }
                break;
            default:
                tt3 tt3Var5 = (tt3) eskVar;
                if (i > 0 && i < 1906708000 && !((ru9) tt3Var5.get()).a.contains("privacy_settings.promotion.can_show")) {
                    nv6 nv6VarB2 = ((ru9) tt3Var5.get()).b();
                    ((SharedPreferences.Editor) nv6VarB2.a).putBoolean("privacy_settings.promotion.can_show", true);
                    nv6VarB2.w();
                    break;
                }
                break;
        }
    }
}
