package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class xig extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zig b;

    public /* synthetic */ xig(zig zigVar, byte b) {
        this.a = b;
        this.b = zigVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        zig zigVar = this.b;
        switch (b) {
            case 0:
                View view = zigVar.b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = zigVar.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = zigVar.d;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                ViewGroup viewGroup3 = zigVar.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    break;
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                zigVar.h(0);
                break;
            case 3:
                zigVar.h(0);
                break;
            case 4:
                ViewGroup viewGroup4 = zigVar.g;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                    break;
                }
                break;
            case 5:
                ViewGroup viewGroup5 = zigVar.i;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        zig zigVar = this.b;
        switch (b) {
            case 0:
                View view = zigVar.k;
                if ((view instanceof uw6) && !zigVar.B) {
                    uw6 uw6Var = (uw6) view;
                    ValueAnimator valueAnimator = uw6Var.E;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(uw6Var.F, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = zigVar.b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = zigVar.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = zigVar.d;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                ViewGroup viewGroup3 = zigVar.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(zigVar.B ? 0 : 4);
                }
                View view3 = zigVar.k;
                if ((view3 instanceof uw6) && !zigVar.B) {
                    uw6 uw6Var2 = (uw6) view3;
                    ValueAnimator valueAnimator2 = uw6Var2.E;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    uw6Var2.G = false;
                    valueAnimator2.setFloatValues(uw6Var2.F, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                zigVar.h(4);
                break;
            case 3:
                zigVar.h(4);
                break;
            case 4:
                ViewGroup viewGroup4 = zigVar.i;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(0);
                    viewGroup4.setTranslationX(viewGroup4.getWidth());
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                    break;
                }
                break;
            default:
                ViewGroup viewGroup5 = zigVar.g;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
