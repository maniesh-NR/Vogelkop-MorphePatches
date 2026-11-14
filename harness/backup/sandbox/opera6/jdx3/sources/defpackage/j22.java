package defpackage;

import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final /* synthetic */ class j22 implements wim {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j22(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.wim
    public final void c(boolean z) {
        r22 r22Var;
        vsn vsnVarG;
        qyj qyjVarF;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                x22 x22Var = (x22) obj;
                if (z && (r22Var = x22Var.n) != null && (vsnVarG = r22Var.g()) != null && (qyjVarF = vsnVarG.c.f()) != null) {
                    qyjVarF.f();
                    break;
                }
                break;
            default:
                hi7 hi7Var = (hi7) obj;
                long j = hi7.t;
                FrameLayout frameLayout = (FrameLayout) hi7Var.e.b;
                if (!z) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = frameLayout.animate();
                    viewPropertyAnimatorAnimate.setDuration(pn7.f(j));
                    viewPropertyAnimatorAnimate.alpha(1.0f);
                    viewPropertyAnimatorAnimate.withStartAction(new ai7(hi7Var, (byte) 1));
                    break;
                } else {
                    ki5 ki5Var = new ki5((byte) 19);
                    ViewPropertyAnimator viewPropertyAnimatorAnimate2 = frameLayout.animate();
                    viewPropertyAnimatorAnimate2.setDuration(pn7.f(j));
                    viewPropertyAnimatorAnimate2.alpha(0.0f);
                    viewPropertyAnimatorAnimate2.withEndAction(new ai7(hi7Var, ki5Var));
                    break;
                }
        }
    }
}
