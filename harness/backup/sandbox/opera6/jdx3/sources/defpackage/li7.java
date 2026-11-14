package defpackage;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class li7 implements TimeInterpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) ((Math.sin(((f * 5.0f) - 0.75d) * 2.0943951023931953d) * Math.pow(2.0d, f * (-10.0d))) + 1.0d);
    }
}
