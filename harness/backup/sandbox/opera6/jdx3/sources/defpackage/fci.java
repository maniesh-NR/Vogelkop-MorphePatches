package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class fci implements Interpolator {
    public float a = 0.85f;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = this.a;
        float f3 = (((f2 * f) / (((((f2 * 2.0f) * f) - f2) - f) + 1.0f)) - 0.5f) * 2.0f;
        float f4 = f3 < 0.0f ? -1.0f : 1.0f;
        float fAbs = Math.abs(f3);
        return (((fAbs / ((fAbs * fAbs) + 1.0f)) / 0.5f) * f4 * 0.5f) + 0.5f;
    }
}
