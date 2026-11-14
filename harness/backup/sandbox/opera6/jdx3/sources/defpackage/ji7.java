package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ji7 {
    public float a = 1.0f;
    public mi7 b = mi7.a;
    public ValueAnimator c;
    public final PointF d;
    public final PointF e;
    public final /* synthetic */ ni7 f;

    public ji7(ni7 ni7Var) {
        this.f = ni7Var;
        ii7 ii7Var = ni7Var.n;
        float fFloatValue = ((Number) ii7Var.invoke()).floatValue();
        ii7 ii7Var2 = ni7Var.o;
        this.d = new PointF(fFloatValue, ((Number) ii7Var2.invoke()).floatValue());
        this.e = new PointF(((Number) ii7Var.invoke()).floatValue(), ((Number) ii7Var2.invoke()).floatValue());
    }

    public static /* synthetic */ void b(ji7 ji7Var, mi7 mi7Var, long j, li7 li7Var, wg5 wg5Var, Function0 function0, int i) {
        TimeInterpolator decelerateInterpolator = li7Var;
        if ((i & 4) != 0) {
            decelerateInterpolator = new DecelerateInterpolator();
        }
        TimeInterpolator timeInterpolator = decelerateInterpolator;
        Function1 m57Var = wg5Var;
        if ((i & 8) != 0) {
            m57Var = new m57((byte) 13);
        }
        Function1 function1 = m57Var;
        if ((i & 16) != 0) {
            function0 = new ki5((byte) 26);
        }
        ji7Var.a(mi7Var, j, timeInterpolator, function1, function0);
    }

    public final void a(mi7 mi7Var, long j, TimeInterpolator timeInterpolator, Function1 function1, Function0 function0) {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.c = null;
        this.b = mi7Var;
        ni7 ni7Var = this.f;
        float fFloatValue = ((Number) ni7Var.n.invoke()).floatValue();
        PointF pointF = this.d;
        pointF.x = fFloatValue;
        pointF.y = ((Number) ni7Var.o.invoke()).floatValue();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(pn7.f(j));
        valueAnimatorOfFloat.addUpdateListener(new af1(this, ni7Var, function1, (byte) 1));
        int i = ni7.C;
        lqh lqhVar = new lqh();
        valueAnimatorOfFloat.addListener(new ki7(lqhVar, function0, lqhVar));
        valueAnimatorOfFloat.start();
        this.c = valueAnimatorOfFloat;
    }

    public final void c(float f, float f2) {
        PointF pointF = this.e;
        pointF.x = f;
        pointF.y = f2;
    }
}
