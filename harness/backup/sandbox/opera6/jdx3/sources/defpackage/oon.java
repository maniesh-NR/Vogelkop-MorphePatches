package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.startup.WelcomeActivity;
import com.opera.android.weather.view.WeatherWidgetView;

/* loaded from: classes.dex */
public final /* synthetic */ class oon implements r8n {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oon(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.r8n
    public final void a(View view) {
        c7o c7oVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                b7k b7kVar = ((pon) obj).b;
                ((StylingTextView) ((WeatherWidgetView) b7kVar.c).a.e).setTextColor(f03.D(view.getContext()).getDefaultColor());
                WeatherWidgetView weatherWidgetView = (WeatherWidgetView) b7kVar.c;
                ColorStateList colorStateListU = f03.u(2130970279, view.getContext(), 2131103629);
                weatherWidgetView.getContext();
                Drawable background = ((LinearLayout) weatherWidgetView.a.c).getBackground();
                if (background instanceof RippleDrawable) {
                    ((RippleDrawable) background).setColor(colorStateListU);
                    break;
                }
                break;
            case 1:
                wqn wqnVar = (wqn) obj;
                ioh iohVar = wqnVar.e;
                if (iohVar != null) {
                    wqnVar.X(iohVar);
                    break;
                }
                break;
            case 2:
                ((mrn) obj).j();
                break;
            case 3:
                int i = WelcomeActivity.w;
                ((WelcomeActivity) obj).P();
                break;
            case 4:
                y6o y6oVar = ((d7o) obj).h;
                Drawable drawable = y6oVar.c.getDrawable();
                c7oVar = drawable instanceof c7o ? (c7o) drawable : null;
                if (c7oVar != null) {
                    c7oVar.a(f03.t(2130969327, y6oVar.c.getContext(), 2131101243));
                    break;
                }
                break;
            default:
                q5g q5gVar = ((f7o) obj).b;
                Drawable drawable2 = ((ImageView) q5gVar.c).getDrawable();
                c7oVar = drawable2 instanceof c7o ? (c7o) drawable2 : null;
                if (c7oVar != null) {
                    c7oVar.a(f03.t(2130969300, ((ImageView) q5gVar.c).getContext(), 2131101243));
                    break;
                }
                break;
        }
    }
}
