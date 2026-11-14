package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class g56 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewPropertyAnimator f;
    public final /* synthetic */ xkj g;

    public /* synthetic */ g56(xkj xkjVar, i iVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator, byte b) {
        this.a = b;
        this.b = iVar;
        this.c = i;
        this.d = view;
        this.e = i2;
        this.f = viewPropertyAnimator;
        this.g = xkjVar;
    }

    private final void a(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                int i = this.c;
                View view = this.d;
                if (i != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.e != 0) {
                    view.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                int i2 = this.c;
                View view2 = this.d;
                if (i2 != 0) {
                    view2.setTranslationX(0.0f);
                }
                if (this.e != 0) {
                    view2.setTranslationY(0.0f);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        i iVar = this.b;
        xr6 xr6Var = this.g;
        ViewPropertyAnimator viewPropertyAnimator = this.f;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                k56 k56Var = (k56) xr6Var;
                k56Var.o(iVar);
                k56Var.q.remove(iVar);
                k56Var.w();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                xr6 xr6Var2 = xr6Var;
                xr6Var2.o(iVar);
                xr6Var2.p.remove(iVar);
                xr6Var2.t();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((k56) this.g).getClass();
                break;
        }
    }
}
