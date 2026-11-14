package defpackage;

import android.app.Activity;
import com.opera.android.settings.SettingsManager;
import com.opera.android.utilities.DisplayUtil;

/* loaded from: classes.dex */
public final class k7d extends dp3 {
    public final Activity b;
    public final SettingsManager c;

    public k7d(Activity activity, SettingsManager settingsManager, yv3 yv3Var) {
        super(yv3Var);
        this.b = activity;
        this.c = settingsManager;
    }

    @Override // defpackage.dp3
    public final boolean a(e7j e7jVar, b7j b7jVar) {
        if (DisplayUtil.e(this.b)) {
            return false;
        }
        return e7jVar == e7j.c || b7jVar == b7j.d;
    }

    @Override // defpackage.dp3
    public final boolean b() {
        SettingsManager settingsManager = this.c;
        return a(settingsManager.f(), settingsManager.c()) && settingsManager.i("main_menu_swipe_gesture_enabled") && !i7d.s0(this.b.getResources().getConfiguration());
    }
}
