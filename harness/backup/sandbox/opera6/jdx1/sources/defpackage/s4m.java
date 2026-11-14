package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class s4m extends AnimatorListenerAdapter implements x2m {
    public final View a;
    public final View b;
    public int[] c;
    public float d;
    public float e;
    public final float f;
    public final float g;
    public boolean h;

    public s4m(View view, View view2, float f, float f2) {
        this.b = view;
        this.a = view2;
        this.f = f;
        this.g = f2;
        int[] iArr = (int[]) view2.getTag(2131364839);
        this.c = iArr;
        if (iArr != null) {
            view2.setTag(2131364839, null);
        }
    }

    @Override // defpackage.x2m
    public final void a() {
        int[] iArr = this.c;
        if (iArr == null) {
            iArr = new int[2];
            this.c = iArr;
        }
        View view = this.b;
        view.getLocationOnScreen(iArr);
        this.a.setTag(2131364839, this.c);
        this.d = view.getTranslationX();
        this.e = view.getTranslationY();
        view.setTranslationX(this.f);
        view.setTranslationY(this.g);
    }

    @Override // defpackage.x2m
    public final void c() {
        float f = this.d;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.e);
    }

    @Override // defpackage.x2m
    public final void d(y2m y2mVar) {
        this.h = true;
        float f = this.f;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.g);
    }

    @Override // defpackage.x2m
    public final void e(y2m y2mVar) {
        g(y2mVar);
    }

    @Override // defpackage.x2m
    public final void f(y2m y2mVar) {
    }

    @Override // defpackage.x2m
    public final void g(y2m y2mVar) {
        if (this.h) {
            return;
        }
        this.a.setTag(2131364839, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.h = true;
        float f = this.f;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.g);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        float f = this.f;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.g);
    }
}
