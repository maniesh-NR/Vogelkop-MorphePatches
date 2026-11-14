package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* loaded from: classes.dex */
public final class j2o extends m2o {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final yp8 f = new yp8();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, n2o n2oVar) {
        s75 s75VarK = k(view);
        if (s75VarK != null) {
            s75VarK.h(n2oVar);
            if (s75VarK.b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), n2oVar);
            }
        }
    }

    public static void g(View view, n2o n2oVar, g3o g3oVar, boolean z) {
        s75 s75VarK = k(view);
        if (s75VarK != null) {
            s75VarK.c = g3oVar;
            if (!z) {
                s75VarK.i(n2oVar);
                z = s75VarK.b == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), n2oVar, g3oVar, z);
            }
        }
    }

    public static void h(View view, g3o g3oVar, List list) {
        s75 s75VarK = k(view);
        if (s75VarK != null) {
            g3oVar = s75VarK.j(g3oVar, list);
            if (s75VarK.b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), g3oVar, list);
            }
        }
    }

    public static void i(View view, n2o n2oVar, mgh mghVar) {
        s75 s75VarK = k(view);
        if (s75VarK != null) {
            s75VarK.k(n2oVar, mghVar);
            if (s75VarK.b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), n2oVar, mghVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(2131364690) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static s75 k(View view) {
        Object tag = view.getTag(2131364699);
        if (tag instanceof i2o) {
            return ((i2o) tag).a;
        }
        return null;
    }
}
