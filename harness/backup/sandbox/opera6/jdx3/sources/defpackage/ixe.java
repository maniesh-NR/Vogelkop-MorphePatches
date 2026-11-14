package defpackage;

import com.google.android.material.slider.Slider;
import com.google.android.material.slider.h;
import com.opera.android.settings.SettingsManager;
import com.opera.android.widget.GradientSlider;
import com.opera.android.widget.ScheduleRangeSlider;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class ixe implements w73 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kxe b;

    public /* synthetic */ ixe(kxe kxeVar, byte b) {
        this.a = b;
        this.b = kxeVar;
    }

    public final void b(Object obj, float f, boolean z) {
        byte b = this.a;
        kxe kxeVar = this.b;
        switch (b) {
            case 0:
                kxeVar.y.V((int) f, ((Slider) obj) == ((GradientSlider) kxeVar.G.d) ? "night_mode_dimming" : "night_mode_temperature");
                break;
            default:
                h hVar = (h) obj;
                SettingsManager settingsManager = kxeVar.y;
                if (z && (hVar instanceof ScheduleRangeSlider)) {
                    ScheduleRangeSlider scheduleRangeSlider = (ScheduleRangeSlider) hVar;
                    int iF0 = (int) scheduleRangeSlider.F0();
                    int i = iF0 > 24 ? iF0 - 24 : iF0 + 24;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    settingsManager.W(timeUnit.toMillis(i * 30), "night_mode_schedule_end");
                    boolean z2 = scheduleRangeSlider.h1;
                    ArrayList arrayListY = scheduleRangeSlider.y();
                    float fE0 = scheduleRangeSlider.E0(0.25f);
                    Float f2 = (Float) CollectionsKt.M(z2 ? 1 : 0, arrayListY);
                    if (f2 != null) {
                        fE0 = f2.floatValue();
                    }
                    settingsManager.W(timeUnit.toMillis((((int) fE0) > 24 ? r6 - 24 : r6 + 24) * 30), "night_mode_schedule_start");
                    break;
                }
                break;
        }
    }
}
