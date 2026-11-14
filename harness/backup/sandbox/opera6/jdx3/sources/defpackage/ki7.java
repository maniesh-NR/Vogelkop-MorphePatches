package defpackage;

import android.animation.Animator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ki7 implements Animator.AnimatorListener {
    public final /* synthetic */ lqh a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ lqh c;

    public ki7(lqh lqhVar, Function0 function0, lqh lqhVar2) {
        this.a = lqhVar;
        this.b = function0;
        this.c = lqhVar2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.c.a = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a.a) {
            return;
        }
        this.b.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
