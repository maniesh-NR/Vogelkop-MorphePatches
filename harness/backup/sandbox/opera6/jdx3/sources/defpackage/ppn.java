package defpackage;

import com.opera.android.weather.ui.WeatherWidgetActivity;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ppn extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ WeatherWidgetActivity j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ppn(WeatherWidgetActivity weatherWidgetActivity, byte b) {
        super(0);
        this.i = b;
        this.j = weatherWidgetActivity;
    }

    public final Object invoke() {
        byte b = this.i;
        WeatherWidgetActivity weatherWidgetActivity = this.j;
        switch (b) {
            case 0:
                return weatherWidgetActivity.getDefaultViewModelProviderFactory();
            case 1:
                return weatherWidgetActivity.getViewModelStore();
            default:
                return weatherWidgetActivity.getDefaultViewModelCreationExtras();
        }
    }
}
