package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class h5n {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(2131364699);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static g3o b(View view, g3o g3oVar, Rect rect) {
        WindowInsets windowInsetsF = g3oVar.f();
        if (windowInsetsF != null) {
            return g3o.g(view, view.computeSystemWindowInsets(windowInsetsF, rect));
        }
        rect.setEmpty();
        return g3oVar;
    }

    public static void c(View view, bcf bcfVar) {
        g5n g5nVar = bcfVar != null ? new g5n(view, bcfVar) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(2131364690, g5nVar);
        }
        if (view.getTag(2131364689) != null) {
            return;
        }
        if (g5nVar != null) {
            view.setOnApplyWindowInsetsListener(g5nVar);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(2131364699));
        }
    }
}
