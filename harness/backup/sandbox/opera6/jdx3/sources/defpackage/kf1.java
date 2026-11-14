package defpackage;

import android.animation.IntEvaluator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public final class kf1 extends IntEvaluator {
    public final /* synthetic */ PathInterpolator a;

    public kf1(PathInterpolator pathInterpolator) {
        this.a = pathInterpolator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.animation.TypeEvaluator
    public final Integer evaluate(float f, Integer num, Integer num2) {
        return Integer.valueOf(num.intValue() + ((int) (this.a.getInterpolation(f) * (num2.intValue() - num.intValue()))));
    }
}
