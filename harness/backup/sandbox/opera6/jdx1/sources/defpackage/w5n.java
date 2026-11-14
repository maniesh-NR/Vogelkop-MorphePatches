package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class w5n implements Interpolator {
    public final /* synthetic */ x5n a;

    public w5n(x5n x5nVar) {
        this.a = x5nVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.a.u.getInterpolation(f);
    }
}
