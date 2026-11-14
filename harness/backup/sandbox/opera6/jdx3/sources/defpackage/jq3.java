package defpackage;

import android.animation.ValueAnimator;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.widget.UrlFieldEditText;

/* loaded from: classes.dex */
public final class jq3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jq3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zdd zddVar = ((BottomSheetBehavior) obj).j;
                if (zddVar != null) {
                    xdd xddVar = zddVar.b;
                    if (xddVar.j != fFloatValue) {
                        xddVar.j = fFloatValue;
                        zddVar.f = true;
                        zddVar.g = true;
                        zddVar.invalidateSelf();
                        break;
                    }
                }
                break;
            case 1:
                ((CollapsingToolbarLayout) obj).f(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 2:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                eq8 eq8Var = (eq8) obj;
                eq8Var.c.setAlpha(iFloatValue);
                eq8Var.d.setAlpha(iFloatValue);
                eq8Var.s.invalidate();
                break;
            case 3:
                ((elb) obj).a(valueAnimator.getAnimatedFraction());
                break;
            case 4:
                ((xkb) obj).m = valueAnimator.getAnimatedFraction();
                break;
            case 5:
                ViewPager viewPager = (ViewPager) ((ghf) obj).b;
                try {
                    viewPager.fakeDragBy(viewPager.getScrollX() - ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    break;
                } catch (NullPointerException unused) {
                    viewPager.beginFakeDrag();
                    return;
                }
            case 6:
                ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 7:
                ((TextInputLayout) obj).v0.x(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                vr3 vr3Var = (vr3) obj;
                ((UrlFieldEditText) vr3Var.c).setHighlightColor(vr3Var.a);
                break;
        }
    }
}
