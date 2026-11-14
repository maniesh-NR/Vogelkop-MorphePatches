package defpackage;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public final class n2o {
    public m2o a;

    public n2o(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new l2o(dz0.c(i, interpolator, j));
        } else {
            this.a = new j2o(i, interpolator, j);
        }
    }

    public static void a(View view, s75 s75Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            l2o.h(view, s75Var);
            return;
        }
        PathInterpolator pathInterpolator = j2o.e;
        View.OnApplyWindowInsetsListener i2oVar = s75Var != null ? new i2o(view, s75Var) : null;
        view.setTag(2131364699, i2oVar);
        if (view.getTag(2131364689) == null && view.getTag(2131364690) == null) {
            view.setOnApplyWindowInsetsListener(i2oVar);
        }
    }
}
