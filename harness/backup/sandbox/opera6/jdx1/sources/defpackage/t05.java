package defpackage;

import android.animation.Animator;

/* loaded from: classes.dex */
public final class t05 implements Animator.AnimatorListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t05(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public t05(x05 x05Var, u05 u05Var) {
        this.a = (byte) 0;
        this.c = x05Var;
        this.b = u05Var;
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

    private final void g(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                break;
            case 1:
                ((rh8) this.b).c.removeView((qh8) obj);
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                x05 x05Var = (x05) this.c;
                u05 u05Var = (u05) this.b;
                x05Var.a(1.0f, u05Var, true);
                u05Var.k = u05Var.e;
                u05Var.l = u05Var.f;
                u05Var.m = u05Var.g;
                u05Var.a((u05Var.j + 1) % u05Var.i.length);
                if (!x05Var.f) {
                    x05Var.e += 1.0f;
                    break;
                } else {
                    x05Var.f = false;
                    animator.cancel();
                    animator.setDuration(1332L);
                    animator.start();
                    if (u05Var.n) {
                        u05Var.n = false;
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((x05) this.c).e = 0.0f;
                break;
            case 1:
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
