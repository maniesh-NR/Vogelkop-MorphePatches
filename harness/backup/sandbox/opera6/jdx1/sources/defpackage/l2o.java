package defpackage;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class l2o extends m2o {
    public final WindowInsetsAnimation e;

    public l2o(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    public static r9b f(WindowInsetsAnimation.Bounds bounds) {
        return r9b.d(bounds.getUpperBound());
    }

    public static r9b g(WindowInsetsAnimation.Bounds bounds) {
        return r9b.d(bounds.getLowerBound());
    }

    public static void h(View view, s75 s75Var) {
        view.setWindowInsetsAnimationCallback(s75Var != null ? new k2o(s75Var) : null);
    }

    @Override // defpackage.m2o
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // defpackage.m2o
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.m2o
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.m2o
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.m2o
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
