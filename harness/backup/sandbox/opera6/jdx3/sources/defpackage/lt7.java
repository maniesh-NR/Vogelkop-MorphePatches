package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final /* synthetic */ class lt7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ lt7(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    public /* synthetic */ lt7(zzg zzgVar, View view) {
        this.a = (byte) 1;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                int i = wt7.o;
                ix5.s(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = iIntValue;
                    view.setLayoutParams(layoutParams);
                    break;
                }
                break;
            default:
                view.setAlpha(valueAnimator.getAnimatedFraction());
                view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
