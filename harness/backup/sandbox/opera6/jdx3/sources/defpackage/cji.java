package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class cji implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ iji b;

    public cji(iji ijiVar, boolean z) {
        this.a = z;
        this.b = ijiVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        iji ijiVar = this.b;
        FrameLayout frameLayout = ijiVar.h;
        if (this.a) {
            frameLayout.setAlpha(valueAnimator.getAnimatedFraction());
        } else {
            frameLayout.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
        }
        ViewGroup.LayoutParams layoutParams = ijiVar.h.getLayoutParams();
        layoutParams.height = ((Integer) ijiVar.t.getAnimatedValue()).intValue();
        ijiVar.h.setLayoutParams(layoutParams);
    }
}
