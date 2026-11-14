package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class pg7 implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {
    public final s03 a = new s03(this, (byte) 2);
    public double b;
    public long c;
    public final ValueAnimator d;
    public final /* synthetic */ qg7 e;

    public pg7(qg7 qg7Var) {
        this.e = qg7Var;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(this);
        valueAnimatorOfFloat.addListener(this);
        valueAnimatorOfFloat.setDuration(10000L);
    }

    public final void a() {
        qg7 qg7Var = this.e;
        re7 re7Var = qg7Var.p;
        ValueAnimator valueAnimator = this.d;
        if (re7Var == null || !re7Var.m()) {
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            this.b = 0.0d;
        } else {
            if (valueAnimator.isStarted() || !qg7Var.p.m()) {
                return;
            }
            valueAnimator.start();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        s03 s03Var = this.a;
        if (s03Var.b) {
            return;
        }
        s03Var.b = true;
        ((i) ((pg7) s03Var.c).e).itemView.post(s03Var);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j = jCurrentAnimationTimeMillis - this.c;
        qg7 qg7Var = this.e;
        re7 re7Var = qg7Var.p;
        long j2 = re7Var.i;
        if (this.b == 0.0d || !re7Var.m()) {
            this.b = j2;
        } else {
            double d = this.b;
            this.b = ((j2 - d) / 10.0d) + d;
        }
        if (j >= 50) {
            this.c = jCurrentAnimationTimeMillis;
            qg7Var.l0(qg7Var.p);
            s03 s03Var = this.a;
            if (s03Var.b) {
                return;
            }
            s03Var.b = true;
            ((i) ((pg7) s03Var.c).e).itemView.post(s03Var);
        }
    }
}
