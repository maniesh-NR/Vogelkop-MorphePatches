package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c48 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ c48(byte b, View view, Object obj) {
        this.a = b;
        this.b = view;
    }

    public c48(View view) {
        this.a = (byte) 0;
        this.b = view;
    }

    public c48(qe6 qe6Var, View view) {
        this.a = (byte) 3;
        this.b = view;
        Objects.requireNonNull(qe6Var);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                View view = this.b;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                view.resetPivot();
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                view.setVisibility(8);
                break;
            case 4:
                view.setVisibility(8);
                break;
            case 6:
                view.setVisibility(8);
                break;
            case 8:
                view.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 1:
                view.setVisibility(0);
                break;
            case 2:
            case 4:
            case 6:
            default:
                super.onAnimationStart(animator);
                break;
            case 3:
                view.setVisibility(0);
                break;
            case 5:
                view.setVisibility(0);
                break;
            case 7:
                view.setVisibility(0);
                break;
        }
    }
}
