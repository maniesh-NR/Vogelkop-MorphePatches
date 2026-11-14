package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class qe1 {
    public pe1 a;
    public final /* synthetic */ se1 b;

    public qe1(se1 se1Var) {
        this.b = se1Var;
    }

    public final boolean a() {
        boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.a);
        this.a = null;
        return zUnregisterDurationScaleChangeListener;
    }
}
