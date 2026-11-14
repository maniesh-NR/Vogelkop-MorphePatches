package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class wo1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wo1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i = AppBarLayout.B;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((zdd) obj).t(fFloatValue);
                zdd zddVar = appBarLayout.x;
                if (zddVar instanceof zdd) {
                    zddVar.t(fFloatValue);
                }
                Iterator it = appBarLayout.r.iterator();
                if (it.hasNext()) {
                    throw p3p.g(it);
                }
                Iterator it2 = appBarLayout.s.iterator();
                if (it2.hasNext()) {
                    throw p3p.g(it2);
                }
                return;
            case 1:
                f47 f47Var = (f47) obj2;
                p83 p83Var = (p83) obj;
                if (p83Var.b(true) && p83Var.m != 0 && f47Var.isVisible()) {
                    f47Var.invalidateSelf();
                    return;
                }
                return;
            case 2:
                fwk fwkVar = (fwk) obj2;
                float animatedFraction = ((ValueAnimator) obj).getAnimatedFraction();
                if (animatedFraction != fwkVar.e) {
                    fwkVar.e = animatedFraction;
                    fwkVar.c();
                    return;
                }
                return;
            case 3:
                ((ViewGroup.LayoutParams) obj2).height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((uvl) obj).i.requestLayout();
                return;
            default:
                ((View) ((y1o) ((z4k) obj2).b).e.getParent()).invalidate();
                return;
        }
    }
}
