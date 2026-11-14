package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.opera.android.widget.ThumbScroller;

/* loaded from: classes.dex */
public final class onl extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ThumbScroller b;

    public /* synthetic */ onl(ThumbScroller thumbScroller, byte b) {
        this.a = b;
        this.b = thumbScroller;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ThumbScroller thumbScroller = this.b;
        switch (b) {
            case 0:
                int i = ThumbScroller.q;
                thumbScroller.e();
                thumbScroller.c = null;
                break;
            default:
                thumbScroller.c = null;
                break;
        }
    }
}
