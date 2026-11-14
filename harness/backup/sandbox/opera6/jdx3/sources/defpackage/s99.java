package defpackage;

import com.opera.android.settings.SettingsManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class s99 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SettingsManager b;

    public /* synthetic */ s99(SettingsManager settingsManager, byte b) {
        this.a = b;
        this.b = settingsManager;
    }

    public final Object invoke() {
        byte b = this.a;
        SettingsManager settingsManager = this.b;
        switch (b) {
            case 0:
                settingsManager.V(1, "speed_dial.enabled");
                return Unit.a;
            case 1:
                return Boolean.valueOf(settingsManager.i("tab_auto_grouping"));
            default:
                return uyg.d(settingsManager, "enable_weather", new sul((byte) 15));
        }
    }
}
