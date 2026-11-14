package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jxe implements p5j {
    public final HashMap a;
    public final /* synthetic */ kxe b;

    public jxe(kxe kxeVar, SettingsManager settingsManager) {
        this.b = kxeVar;
        kw3 kw3Var = new kw3((byte) 16);
        kw3 kw3Var2 = new kw3((byte) 17);
        HashMap map = new HashMap();
        this.a = map;
        map.put("night_mode_dimming", kw3Var);
        map.put("night_mode_temperature", kw3Var);
        map.put("darken_websites_dark_theme", kw3Var2);
        map.put("night_mode", kw3Var2);
        map.put("night_mode_schedule", kw3Var2);
        map.put("night_mode_schedule_start", kw3Var2);
        map.put("night_mode_schedule_end", kw3Var2);
        Objects.requireNonNull(settingsManager);
        map.put("darken_websites", new nx3(settingsManager, (byte) 1));
        map.put("night_mode_switch_theme", new nx3(settingsManager, (byte) 2));
        map.put("night_mode_overlay_keyboard", new nx3(settingsManager, (byte) 3));
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        HashMap map = this.a;
        if (map.containsKey(str)) {
            esk eskVar = (esk) map.get(str);
            boolean zBooleanValue = eskVar != null ? ((Boolean) eskVar.get()).booleanValue() : false;
            kxe kxeVar = this.b;
            if (zBooleanValue && !owe.c.a.get()) {
                kxeVar.J.T(true, false);
            }
            kxeVar.J0();
        }
    }
}
