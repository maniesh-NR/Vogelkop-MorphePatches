package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class alb implements Interpolator {
    public final /* synthetic */ byte a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.a) {
            case 0:
            case 1:
                return f * f * f * f * f;
            case 2:
            case 3:
            case 5:
            case 6:
            default:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            case 4:
                return f < 0.14f ? f / 0.14f : 1.0f - ((f * 1.14f) - 0.14f);
        }
    }
}
