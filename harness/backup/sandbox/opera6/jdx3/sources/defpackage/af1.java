package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.opera.android.search.behavior.ScrollableToolbarBehavior;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class af1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ af1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                uh7 uh7Var = (uh7) obj3;
                uh7 uh7Var2 = (uh7) obj2;
                View view = (View) obj;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = uh7Var.a;
                float f2 = ((uh7Var2.a - f) * fFloatValue) + f;
                view.setScaleX(f2);
                view.setScaleY(f2);
                float f3 = uh7Var.b;
                view.setAlpha(((uh7Var2.b - f3) * fFloatValue) + f3);
                float f4 = uh7Var.c;
                view.setTranslationZ(((uh7Var2.c - f4) * fFloatValue) + f4);
                break;
            case 1:
                ni7 ni7Var = (ni7) obj2;
                Function1 function1 = (Function1) obj;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ji7) obj3).a = fFloatValue2;
                int i = ni7.C;
                if (fFloatValue2 < 0.001f) {
                    fFloatValue2 = 0.0f;
                } else if (fFloatValue2 > 0.999f) {
                    fFloatValue2 = 1.0f;
                }
                ni7Var.g();
                function1.invoke(Float.valueOf(fFloatValue2));
                break;
            default:
                ScrollableToolbarBehavior scrollableToolbarBehavior = (ScrollableToolbarBehavior) obj3;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj2;
                View view2 = (View) obj;
                DecelerateInterpolator decelerateInterpolator = ScrollableToolbarBehavior.g;
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                r05 r05Var = scrollableToolbarBehavior.a;
                if (r05Var == null) {
                    scrollableToolbarBehavior.b = iIntValue;
                } else if (r05Var.d != iIntValue) {
                    r05Var.d = iIntValue;
                    r05Var.s();
                }
                coordinatorLayout.f(view2);
                break;
        }
    }
}
