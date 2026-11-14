package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class lzj {
    public final Context a;
    public final SettingsManager b;

    public lzj(Context context, SettingsManager settingsManager) {
        this.a = context.getApplicationContext();
        this.b = settingsManager;
    }

    public final void a(boolean z) {
        Context context = this.a;
        int i = ru9.c(context).a.getInt("settings.speed_dial_enabled_default.reason", -1);
        if (i == -1 || 10 >= i) {
            nv6 nv6VarB = ru9.c(context).b();
            ((SharedPreferences.Editor) nv6VarB.a).putInt("settings.speed_dial_enabled_default.reason", 10);
            nv6VarB.w();
            this.b.R(z ? 1 : 0, "speed_dial.enabled");
        }
    }
}
