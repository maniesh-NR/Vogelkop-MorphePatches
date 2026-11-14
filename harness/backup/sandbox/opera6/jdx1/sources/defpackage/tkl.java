package defpackage;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class tkl {
    public static float a(float f, DisplayMetrics displayMetrics) {
        return TypedValue.deriveDimension(1, f, displayMetrics);
    }

    public static float b(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static int c(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static int d(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static void e(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }
}
