package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.opera.android.custom_views.OperaIntroView;

/* loaded from: classes.dex */
public final class ea3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ea3(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                OperaIntroView operaIntroView = (OperaIntroView) this.c;
                ((n2d) operaIntroView).d.b.removeListener(this);
                operaIntroView.C = 0;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((na3) obj).d(i);
                break;
            case 1:
                ((na3) obj).d(i);
                break;
            default:
                OperaIntroView operaIntroView = (OperaIntroView) obj;
                ((n2d) operaIntroView).d.b.removeListener(this);
                operaIntroView.C = 0;
                int i2 = OperaIntroView.F;
                if (i == 1) {
                    operaIntroView.A();
                    break;
                } else if (i == 2) {
                    operaIntroView.C(3);
                    operaIntroView.s(0, 237, 257, null);
                    break;
                } else if (i == 3) {
                    elf elfVar = operaIntroView.B;
                    break;
                } else {
                    operaIntroView.getClass();
                    break;
                }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                na3 na3Var = (na3) this.c;
                SnackbarContentLayout snackbarContentLayout = na3Var.j;
                int i = na3Var.b;
                snackbarContentLayout.a.setAlpha(1.0f);
                long j = i;
                ViewPropertyAnimator duration = snackbarContentLayout.a.animate().alpha(0.0f).setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.c;
                duration.setInterpolator(timeInterpolator).setStartDelay(0L).start();
                if (snackbarContentLayout.b.getVisibility() == 0) {
                    snackbarContentLayout.b.setAlpha(1.0f);
                    snackbarContentLayout.b.animate().alpha(0.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(0L).start();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
