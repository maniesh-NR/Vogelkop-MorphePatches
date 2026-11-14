package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class tr6 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ i b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ xr6 e;

    public tr6(xr6 xr6Var, i iVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = xr6Var;
        this.b = iVar;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    public tr6(xr6 xr6Var, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = xr6Var;
        this.b = iVar;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.recyclerview.widget.e, xr6] */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        i iVar = this.b;
        ?? r1 = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                r1.c(iVar);
                r1.q.remove(iVar);
                r1.t();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                r1.c(iVar);
                r1.o.remove(iVar);
                r1.t();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
    }
}
