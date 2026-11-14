package defpackage;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final /* synthetic */ class zpj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bqj b;

    public /* synthetic */ zpj(bqj bqjVar, byte b) {
        this.a = b;
        this.b = bqjVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        bqj bqjVar = this.b;
        switch (b) {
            case 0:
                p37.t0(((Integer) valueAnimator.getAnimatedValue()).intValue(), (FrameLayout) bqjVar.a.e);
                bqjVar.b();
                break;
            default:
                p37.t0(((Integer) valueAnimator.getAnimatedValue()).intValue(), (FrameLayout) bqjVar.a.e);
                bqjVar.b();
                break;
        }
    }
}
