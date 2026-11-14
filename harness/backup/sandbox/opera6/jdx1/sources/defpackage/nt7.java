package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class nt7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;
    public final /* synthetic */ float c;

    public /* synthetic */ nt7(View view, float f, byte b) {
        this.a = b;
        this.b = view;
        this.c = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        float f = this.c;
        View view = this.b;
        switch (b) {
            case 0:
                int i = wt7.o;
                ix5.s(view, f);
                break;
            default:
                view.setScaleX(f);
                view.setScaleY(f);
                view.setTag(2131364521, null);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.setTag(null);
                break;
            default:
                this.b.setTag(2131364521, null);
                break;
        }
    }
}
