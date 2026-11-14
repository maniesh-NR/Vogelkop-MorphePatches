package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class cf1 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public cf1(vkd vkdVar, boolean z, tjg tjgVar) {
        this.a = (byte) 2;
        this.b = z;
        this.c = tjgVar;
        this.d = vkdVar;
    }

    public /* synthetic */ cf1(boolean z, View view, Object obj, byte b) {
        this.a = b;
        this.b = z;
        this.c = view;
        this.d = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                uh7 uh7Var = (uh7) this.d;
                float f = uh7Var.a;
                View view = (View) this.c;
                if (this.b) {
                    view.setTranslationZ(uh7Var.c);
                    view.setScaleX(f);
                    view.setScaleY(f);
                    view.setAlpha(uh7Var.b);
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((View) obj2).setTag(2131364682, null);
                break;
            case 1:
                View view = (View) obj;
                if (!z) {
                    ((View) obj2).setVisibility(4);
                    view.setAlpha(1.0f);
                    view.setVisibility(0);
                    break;
                }
                break;
            default:
                vkd vkdVar = (vkd) obj;
                vkdVar.c.setTag(2131363449, null);
                if (z) {
                    ((tjg) obj2).j(vkdVar.f);
                }
                vkdVar.b.removeView(vkdVar.e);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                View view = (View) this.d;
                if (this.b) {
                    ((View) this.c).setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setVisibility(4);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
