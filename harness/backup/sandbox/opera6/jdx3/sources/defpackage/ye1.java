package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class ye1 {
    public static final PathInterpolator a;
    public static final short b;
    public static final PathInterpolator c;

    static {
        PathInterpolator pathInterpolator = lf1.g;
        a = pathInterpolator;
        b = (short) 700;
        c = pathInterpolator;
    }

    public static ViewPropertyAnimator a(View view, boolean z) {
        float f = 1.0f;
        float f2 = 0.0f;
        if (!z) {
            f2 = 1.0f;
            f = 0.0f;
        }
        view.setAlpha(f2);
        return view.animate().setListener(null).setDuration(b).setInterpolator(c).withLayer().alpha(f);
    }

    public static ViewPropertyAnimator b(View view, View view2, x65 x65Var, boolean z, boolean z2) {
        int width;
        int width2;
        int i = z2 ? 1 : -1;
        int i2 = 0;
        if (cs5.W(view2)) {
            if (z) {
                width2 = view.getWidth() * i;
            } else {
                width = view.getWidth() * (-i);
                i2 = width;
                width2 = 0;
            }
        } else if (z) {
            width2 = view.getWidth() * (-i);
        } else {
            width = view.getWidth() * i;
            i2 = width;
            width2 = 0;
        }
        view2.setTranslationX(width2);
        return view2.animate().setListener(null).setUpdateListener(x65Var).setDuration(700L).setInterpolator(a).translationX(i2).withLayer();
    }
}
