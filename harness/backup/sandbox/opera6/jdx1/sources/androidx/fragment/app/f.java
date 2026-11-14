package androidx.fragment.app;

import android.view.View;

/* loaded from: classes.dex */
public abstract class f {
    public final c0 a;

    public f(c0 c0Var) {
        this.a = c0Var;
    }

    public final boolean a() {
        int i;
        c0 c0Var = this.a;
        View view = c0Var.c.mView;
        if (view != null) {
            i = 4;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i = 2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        qp2.o(sko.i(visibility, "Unknown visibility "));
                        return false;
                    }
                    i = 3;
                }
            }
        } else {
            i = 0;
        }
        int i2 = c0Var.a;
        if (i != i2) {
            return (i == 2 || i2 == 2) ? false : true;
        }
        return true;
    }
}
