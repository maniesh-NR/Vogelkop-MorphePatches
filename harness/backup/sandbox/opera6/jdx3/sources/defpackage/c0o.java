package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class c0o {
    public final Context a;
    public final r65 b;
    public final ox3 c;
    public final yl6 d;
    public final t1 e;
    public final ldf f;
    public final jjg g;
    public final t1 h;
    public final SettingsManager i;

    public c0o(Context context, r65 r65Var, ox3 ox3Var, yl6 yl6Var, t1 t1Var, ldf ldfVar, jjg jjgVar, t1 t1Var2, SettingsManager settingsManager) {
        this.a = context;
        this.b = r65Var;
        this.c = ox3Var;
        this.d = yl6Var;
        this.e = t1Var;
        this.f = ldfVar;
        this.g = jjgVar;
        this.h = t1Var2;
        this.i = settingsManager;
    }

    public final boolean a() {
        SharedPreferences sharedPreferences = ru9.c(this.e.b).a;
        if (((SharedPreferences) this.f.a.get()).getBoolean("need", false) || (this.i.J() && !sharedPreferences.getBoolean("oem.onboarding.completed", false))) {
            return !sharedPreferences.getBoolean("oem.onboarding.cmp_intro_reached", false);
        }
        return false;
    }
}
