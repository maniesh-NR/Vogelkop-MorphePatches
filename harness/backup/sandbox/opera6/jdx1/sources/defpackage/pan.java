package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class pan extends AnimatorListenerAdapter implements x2m {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public boolean d = true;
    public final /* synthetic */ ran e;

    public pan(ran ranVar, ViewGroup viewGroup, View view, View view2) {
        this.e = ranVar;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // defpackage.x2m
    public final void a() {
    }

    @Override // defpackage.x2m
    public final void c() {
    }

    @Override // defpackage.x2m
    public final void d(y2m y2mVar) {
        if (this.d) {
            h();
        }
    }

    @Override // defpackage.x2m
    public final void e(y2m y2mVar) {
        y2mVar.C(this);
    }

    @Override // defpackage.x2m
    public final void f(y2m y2mVar) {
    }

    public final void h() {
        this.c.setTag(2131364121, null);
        this.a.getOverlay().remove(this.b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.a.getOverlay().remove(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            r5n.a(this.a, view);
        } else {
            this.e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.c;
            View view2 = this.b;
            view.setTag(2131364121, view2);
            r5n.a(this.a, view2);
            this.d = true;
        }
    }
}
