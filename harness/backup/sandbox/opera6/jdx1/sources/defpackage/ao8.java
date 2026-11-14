package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class ao8 extends AnimatorListenerAdapter implements x2m {
    public final View a;
    public boolean b = false;

    public ao8(View view) {
        this.a = view;
    }

    @Override // defpackage.x2m
    public final void a() {
        float transitionAlpha;
        View view = this.a;
        if (view.getVisibility() == 0) {
            s73 s73Var = s9n.a;
            transitionAlpha = view.getTransitionAlpha();
        } else {
            transitionAlpha = 0.0f;
        }
        view.setTag(2131364838, Float.valueOf(transitionAlpha));
    }

    @Override // defpackage.x2m
    public final void b(y2m y2mVar) {
    }

    @Override // defpackage.x2m
    public final void c() {
        this.a.setTag(2131364838, null);
    }

    @Override // defpackage.x2m
    public final void d(y2m y2mVar) {
    }

    @Override // defpackage.x2m
    public final void e(y2m y2mVar) {
    }

    @Override // defpackage.x2m
    public final void f(y2m y2mVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        s73 s73Var = s9n.a;
        this.a.setTransitionAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        s73 s73Var = s9n.a;
        view.setTransitionAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }
}
