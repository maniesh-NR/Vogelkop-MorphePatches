package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.opera.android.weather.ui.WeatherWidgetActivity;

/* loaded from: classes.dex */
public final class tz9 extends nt5 {
    public WeatherWidgetActivity t;
    public /* synthetic */ Object u;
    public final /* synthetic */ k5o v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz9(k5o k5oVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = k5oVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.g((WeatherWidgetActivity) null, this);
    }
}
