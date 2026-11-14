package com.opera.android.weather.view;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.widget.LottieAnimationView;
import defpackage.vs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/weather/view/WeatherWidgetView;", "Landroid/widget/FrameLayout;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeatherWidgetView extends FrameLayout {
    public final vs a;

    public WeatherWidgetView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(2131559557, this);
        int i = 2131362113;
        LinearLayout linearLayout = (LinearLayout) w1h.j(2131362113, this);
        if (linearLayout != null) {
            i = 2131362594;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) w1h.j(2131362594, this);
            if (lottieAnimationView != null) {
                i = 2131363485;
                StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363485, this);
                if (stylingTextView != null) {
                    this.a = new vs(this, linearLayout, lottieAnimationView, stylingTextView, (byte) 27);
                    setFocusable(true);
                    setClickable(true);
                    linearLayout.setBackground(xgh.i((ShapeDrawable) null, f03.W(2130970279, context), 2131165498));
                    return;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }
}
