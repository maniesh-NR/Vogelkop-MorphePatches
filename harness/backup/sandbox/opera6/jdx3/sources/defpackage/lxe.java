package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import com.opera.android.custom_views.StylingImageCheckableWithText;

/* loaded from: classes.dex */
public final /* synthetic */ class lxe implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lxe(int i, int i2, StylingImageCheckableWithText stylingImageCheckableWithText) {
        this.b = i;
        this.c = i2;
        this.d = stylingImageCheckableWithText;
    }

    public /* synthetic */ lxe(mxe mxeVar, int i, int i2) {
        this.d = mxeVar;
        this.b = i;
        this.c = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.d;
        int i = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                ((mxe) obj).S(p37.R(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i));
                break;
            default:
                int[] iArr = StylingImageCheckableWithText.x;
                int iFloatValue = i2 + ((int) ((i - i2) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                TextView textView = (TextView) ((StylingImageCheckableWithText) obj).p.d;
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                layoutParams.width = iFloatValue;
                textView.setLayoutParams(layoutParams);
                break;
        }
    }
}
