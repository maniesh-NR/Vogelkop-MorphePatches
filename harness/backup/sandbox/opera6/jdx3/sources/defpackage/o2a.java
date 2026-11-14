package defpackage;

import android.content.res.ColorStateList;
import android.graphics.LinearGradient;
import com.opera.android.widget.GradientSlider;

/* loaded from: classes.dex */
public final class o2a {
    public float a = Float.NEGATIVE_INFINITY;
    public float b = Float.NEGATIVE_INFINITY;
    public int c;
    public int d;
    public LinearGradient e;
    public final /* synthetic */ GradientSlider f;

    public o2a(GradientSlider gradientSlider, ColorStateList colorStateList, ColorStateList colorStateList2) {
        this.f = gradientSlider;
        this.c = a(colorStateList);
        this.d = a(colorStateList2);
    }

    public final int a(ColorStateList colorStateList) {
        return colorStateList.getColorForState(this.f.getDrawableState(), colorStateList.getDefaultColor());
    }
}
