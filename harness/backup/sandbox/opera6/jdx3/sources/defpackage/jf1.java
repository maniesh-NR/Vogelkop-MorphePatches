package defpackage;

import android.animation.FloatEvaluator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public final class jf1 extends FloatEvaluator {
    public final /* synthetic */ PathInterpolator a;

    public jf1(PathInterpolator pathInterpolator) {
        this.a = pathInterpolator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f, Number number, Number number2) {
        Float f2 = (Float) number;
        return Float.valueOf(((((Float) number2).floatValue() - f2.floatValue()) * this.a.getInterpolation(f)) + f2.floatValue());
    }
}
