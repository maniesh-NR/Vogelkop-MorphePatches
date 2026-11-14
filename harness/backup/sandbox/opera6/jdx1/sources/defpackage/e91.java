package defpackage;

import android.graphics.PathMeasure;

/* loaded from: classes.dex */
public final class e91 {
    public final PathMeasure a;

    public e91(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final void a(float f, float f2, d91 d91Var) {
        if (d91Var == null) {
            yt7.k("Unable to obtain android.graphics.Path");
        } else {
            this.a.getSegment(f, f2, d91Var.a, true);
        }
    }
}
