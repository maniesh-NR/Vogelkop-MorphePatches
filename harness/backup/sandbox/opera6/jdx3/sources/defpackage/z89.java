package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.opera.android.widget.ThumbScroller;

/* loaded from: classes.dex */
public final class z89 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z89(byte b, Object obj, boolean z) {
        this.a = b;
        this.d = obj;
        this.c = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
            default:
                this.b = true;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                c99 c99Var = (c99) obj;
                c99Var.q = (byte) 0;
                c99Var.l = null;
                if (!this.b) {
                    c99Var.r.a(z ? 8 : 4, z);
                    break;
                }
                break;
            default:
                ThumbScroller thumbScroller = (ThumbScroller) obj;
                thumbScroller.c = null;
                if (!this.b) {
                    thumbScroller.f.setAlpha(0.0f);
                    thumbScroller.f.setTranslationX(0.0f);
                    if (!z) {
                        thumbScroller.setVisibility(4);
                        break;
                    } else {
                        thumbScroller.postDelayed(thumbScroller.p, 400L);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                c99 c99Var = (c99) this.d;
                c99Var.r.a(0, this.c);
                c99Var.q = (byte) 1;
                c99Var.l = animator;
                this.b = false;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
