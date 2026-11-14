package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class h2o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ n2o a;
    public final /* synthetic */ g3o b;
    public final /* synthetic */ g3o c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public h2o(n2o n2oVar, g3o g3oVar, g3o g3oVar2, int i, View view) {
        this.a = n2oVar;
        this.b = g3oVar;
        this.c = g3oVar2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        n2o n2oVar = this.a;
        m2o m2oVar = n2oVar.a;
        m2oVar.e(animatedFraction);
        float fC = m2oVar.c();
        PathInterpolator pathInterpolator = j2o.e;
        int i = Build.VERSION.SDK_INT;
        g3o g3oVar = this.b;
        u2o t2oVar = i >= 36 ? new t2o(g3oVar) : i >= 35 ? new s2o(g3oVar) : i >= 34 ? new r2o(g3oVar) : i >= 31 ? new q2o(g3oVar) : i >= 30 ? new p2o(g3oVar) : new o2o(g3oVar);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            d3o d3oVar = g3oVar.a;
            if (i3 == 0) {
                t2oVar.d(i2, d3oVar.i(i2));
            } else {
                r9b r9bVarI = d3oVar.i(i2);
                r9b r9bVarI2 = this.c.a.i(i2);
                float f = 1.0f - fC;
                t2oVar.d(i2, g3o.e(r9bVarI, (int) (((r9bVarI.a - r9bVarI2.a) * f) + 0.5d), (int) (((r9bVarI.b - r9bVarI2.b) * f) + 0.5d), (int) (((r9bVarI.c - r9bVarI2.c) * f) + 0.5d), (int) (((r9bVarI.d - r9bVarI2.d) * f) + 0.5d)));
            }
        }
        j2o.h(this.e, t2oVar.b(), Collections.singletonList(n2oVar));
    }
}
