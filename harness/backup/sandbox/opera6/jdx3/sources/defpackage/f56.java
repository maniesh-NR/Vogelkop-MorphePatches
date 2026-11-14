package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class f56 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ k56 e;

    public /* synthetic */ f56(k56 k56Var, i iVar, View view, ViewPropertyAnimator viewPropertyAnimator, byte b) {
        this.a = b;
        this.b = iVar;
        this.c = view;
        this.d = viewPropertyAnimator;
        this.e = k56Var;
    }

    public f56(k56 k56Var, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.a = (byte) 0;
        this.b = iVar;
        this.d = viewPropertyAnimator;
        this.c = view;
        this.e = k56Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        View view = this.c;
        switch (b) {
            case 1:
                view.setAlpha(1.0f);
                break;
            case 2:
                view.setAlpha(1.0f);
                view.setTranslationY(0.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        i iVar = this.b;
        k56 k56Var = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                k56Var.c(iVar);
                k56Var.r.remove(iVar);
                k56Var.w();
                break;
            case 1:
                viewPropertyAnimator.setListener(null);
                k56Var.c(iVar);
                k56Var.p.remove(iVar);
                k56Var.w();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                vqk vqkVar = (vqk) k56Var;
                vqkVar.c(iVar);
                vqkVar.p.remove(iVar);
                if (vqkVar.w() && vqkVar.w) {
                    vqkVar.w = false;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.r();
                break;
            case 1:
                this.e.p();
                break;
            default:
                ((vqk) this.e).p();
                break;
        }
    }
}
