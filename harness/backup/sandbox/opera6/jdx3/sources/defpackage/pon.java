package defpackage;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.i;
import com.opera.android.weather.view.WeatherWidgetView;

/* loaded from: classes.dex */
public final class pon extends i {
    public final b7k b;

    public pon(b7k b7kVar) {
        super((FrameLayout) b7kVar.b);
        this.b = b7kVar;
        WeatherWidgetView weatherWidgetView = (WeatherWidgetView) b7kVar.c;
        oon oonVar = new oon(this, (byte) 0);
        q9n.e(weatherWidgetView, oonVar);
        oonVar.a(weatherWidgetView);
    }
}
