package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.opera.android.flow.MyFlowMessageRoot;
import java.util.Objects;

/* loaded from: classes.dex */
public final class in8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ in8(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    public in8(View view, boolean z) {
        this.a = (byte) 0;
        this.b = z;
        this.c = view;
    }

    public in8(eq8 eq8Var) {
        this.a = (byte) 1;
        this.c = eq8Var;
        this.b = false;
    }

    public in8(tah tahVar) {
        this.a = (byte) 5;
        Objects.requireNonNull(tahVar);
        this.c = tahVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b = true;
                break;
            case 2:
            case 3:
            default:
                super.onAnimationCancel(animator);
                break;
            case 4:
                ((MyFlowMessageRoot) this.c).h.setAlpha(this.b ? 1.0f : 0.0f);
                break;
            case 5:
                this.b = true;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (!this.b) {
                    ((View) obj).setVisibility(4);
                    break;
                }
                break;
            case 1:
                eq8 eq8Var = (eq8) obj;
                if (!this.b) {
                    if (((Float) eq8Var.z.getAnimatedValue()).floatValue() != 0.0f) {
                        eq8Var.A = (byte) 2;
                        eq8Var.s.invalidate();
                        break;
                    } else {
                        eq8Var.A = (byte) 0;
                        eq8Var.h(0);
                        break;
                    }
                } else {
                    this.b = false;
                    break;
                }
            case 2:
                c99 c99Var = (c99) obj;
                c99Var.q = (byte) 0;
                c99Var.l = null;
                break;
            case 3:
                fge fgeVar = (fge) obj;
                fgeVar.G = null;
                fgeVar.C.setClickable(!this.b);
                break;
            case 4:
            default:
                super.onAnimationEnd(animator);
                break;
            case 5:
                if (!this.b) {
                    ((FrameLayout) ((tah) obj).g).setAlpha(0.0f);
                    break;
                }
                break;
            case 6:
                if (!this.b) {
                    ((iji) obj).h.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (this.b) {
                    ((View) obj).setVisibility(0);
                    break;
                }
                break;
            case 1:
            default:
                super.onAnimationStart(animator);
                break;
            case 2:
                c99 c99Var = (c99) obj;
                c99Var.r.a(0, this.b);
                c99Var.q = (byte) 2;
                c99Var.l = animator;
                break;
        }
    }
}
