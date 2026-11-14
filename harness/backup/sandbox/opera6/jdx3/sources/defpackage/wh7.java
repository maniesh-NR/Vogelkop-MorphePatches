package defpackage;

import android.animation.Animator;
import android.view.View;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class wh7 implements Animator.AnimatorListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xh7 b;
    public final /* synthetic */ View c;

    public /* synthetic */ wh7(xh7 xh7Var, View view, byte b) {
        this.a = b;
        this.b = xh7Var;
        this.c = view;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        View view = this.c;
        xh7 xh7Var = this.b;
        switch (b) {
            case 0:
                ((LinkedHashMap) xh7Var.d).remove(view);
                xh7Var.c();
                break;
            default:
                ((LinkedHashMap) xh7Var.c).remove(view);
                xh7Var.c();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        byte b = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
    }
}
