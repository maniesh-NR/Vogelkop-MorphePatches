package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.Magnifier;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.DropShadowFrameLayout;
import com.opera.android.custom_views.HeightAnimatingFrameLayout;
import com.opera.android.feed.HeightAnimatingSnappingRecyclerView;
import com.opera.android.flow.MyFlowMessageRoot;
import com.opera.android.media.MediaPlayerBottomSlideLayout;
import com.opera.android.widget.GraphView;
import com.opera.android.widget.ThemeableLottieAnimationView;

/* loaded from: classes.dex */
public final /* synthetic */ class nl2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nl2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                DecelerateInterpolator decelerateInterpolator = ql2.j;
                bq1 bq1Var = ((ql2) obj).a;
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = bq1Var.getLayoutParams();
                if (layoutParams != null && layoutParams.height != iIntValue) {
                    layoutParams.height = iIntValue;
                    bq1Var.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 1:
                o85 o85Var = (o85) obj;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p85 p85Var = o85Var.a;
                ConstraintLayout constraintLayout = p85Var.f;
                p37.t0(zed.b(((o85Var.e() - r2) * fFloatValue) + o85Var.g), constraintLayout);
                ((TextView) p85Var.l).setAlpha(fFloatValue);
                ((ImageView) p85Var.i).setAlpha(fFloatValue);
                ((ImageView) p85Var.k).setAlpha(fFloatValue);
                constraintLayout.setBackgroundTintList(ColorStateList.valueOf(((Integer) o85Var.e.evaluate(fFloatValue, Integer.valueOf(j7h.k(2130969080, o85Var.c)), Integer.valueOf(o85Var.l))).intValue()));
                DropShadowFrameLayout dropShadowFrameLayout = (DropShadowFrameLayout) p85Var.m;
                if (dropShadowFrameLayout.a.X(1.0f - fFloatValue)) {
                    dropShadowFrameLayout.invalidate();
                    break;
                }
                break;
            case 2:
                n85 n85Var = (n85) obj;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n85Var.g = fFloatValue2;
                p37.l0(zed.b(((n85Var.d - r1) * o85.w.getInterpolation(fFloatValue2)) + n85Var.c), n85Var.a);
                n85Var.b.setAlpha(o85.x.getInterpolation(n85Var.g));
                break;
            case 3:
                uw6 uw6Var = (uw6) obj;
                uw6Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uw6Var.invalidate(uw6Var.a);
                break;
            case 4:
                f47 f47Var = (f47) obj;
                f47Var.p.e = f47Var.t.getInterpolation(f47Var.s.getAnimatedFraction());
                break;
            case 5:
                ((a38) ((ym7) obj)).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                c1f c1fVar = ((d48) obj).j;
                if (c1fVar != null) {
                    c1fVar.e();
                    break;
                }
                break;
            case 7:
                c1f c1fVar2 = ((rh8) obj).l;
                if (c1fVar2 != null) {
                    c1fVar2.e();
                    break;
                }
                break;
            case 8:
                GraphView graphView = (GraphView) obj;
                zp8 zp8Var = GraphView.p;
                graphView.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                graphView.l = true;
                graphView.invalidate();
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                HeightAnimatingFrameLayout heightAnimatingFrameLayout = (HeightAnimatingFrameLayout) obj;
                int i = HeightAnimatingFrameLayout.e;
                heightAnimatingFrameLayout.a = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                heightAnimatingFrameLayout.requestLayout();
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                HeightAnimatingSnappingRecyclerView heightAnimatingSnappingRecyclerView = (HeightAnimatingSnappingRecyclerView) obj;
                int i2 = HeightAnimatingSnappingRecyclerView.K0;
                heightAnimatingSnappingRecyclerView.G0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                heightAnimatingSnappingRecyclerView.requestLayout();
                break;
            case 11:
                aba abaVar = (aba) obj;
                xf8.F0(abaVar.i, abaVar.a());
                break;
            case 12:
                f3d f3dVar = (f3d) obj;
                int i3 = f3dVar.G;
                if ((i3 != 0 ? i3 : 1) != 2) {
                    gi5 gi5Var = f3dVar.l;
                    if (gi5Var != null) {
                        gi5Var.q(f3dVar.b.b());
                        break;
                    }
                } else {
                    f3dVar.invalidateSelf();
                    break;
                }
                break;
            case 13:
                j5d j5dVar = (j5d) obj;
                float f = j5dVar.f;
                j5dVar.d = (valueAnimator.getAnimatedFraction() * (j5dVar.h - f)) + f;
                float f2 = j5dVar.g;
                float animatedFraction = (valueAnimator.getAnimatedFraction() * (j5dVar.i - f2)) + f2;
                j5dVar.e = animatedFraction;
                s6h s6hVar = j5dVar.a;
                float f3 = j5dVar.d;
                View viewI = ((txi) s6hVar.b).i();
                if (viewI != null) {
                    Magnifier magnifier = (Magnifier) s6hVar.a;
                    if (magnifier == null) {
                        magnifier = new Magnifier(viewI);
                        s6hVar.a = magnifier;
                    }
                    magnifier.show(f3, animatedFraction);
                    break;
                }
                break;
            case 14:
                ndd nddVar = (ndd) obj;
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nddVar.k.setAlpha((int) (255.0f * fFloatValue3));
                nddVar.y = fFloatValue3;
                break;
            case 15:
                int i4 = MediaPlayerBottomSlideLayout.d;
                ((MediaPlayerBottomSlideLayout) obj).c();
                break;
            case 16:
                MyFlowMessageRoot myFlowMessageRoot = (MyFlowMessageRoot) obj;
                int i5 = MyFlowMessageRoot.l;
                myFlowMessageRoot.h.setAlpha(Math.max(0.0f, (((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.0f) - 2.0f));
                myFlowMessageRoot.requestLayout();
                break;
            case 17:
                gcl gclVar = (gcl) obj;
                Rect rect = gclVar.h;
                rect.set((Rect) valueAnimator.getAnimatedValue());
                w05 w05Var = gclVar.c;
                w05Var.setBounds(new Rect(rect));
                w05Var.invalidateSelf();
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                d0n d0nVar = (d0n) obj;
                float fB = ((n2d) d0nVar.d).d.b.b();
                float fFloatValue4 = fB - ((Number) d0nVar.h.g()).floatValue();
                if (0.0f <= fFloatValue4 && fFloatValue4 <= 0.5f) {
                    d0nVar.a(fB);
                    break;
                }
                break;
            default:
                xbf xbfVar = (xbf) obj;
                wbn wbnVar = (wbn) xbfVar.g;
                int i6 = (int) ((n2d) ((ThemeableLottieAnimationView) xbfVar.b)).d.b.h;
                int i7 = wbnVar.d;
                if (i7 != i6) {
                    float f4 = wbnVar.b;
                    int i8 = i6 - i7;
                    if (i8 <= 0) {
                        k2d k2dVar = (k2d) wbnVar.c.c;
                        i8 = (i8 + k2dVar.b) - k2dVar.a;
                    }
                    wbnVar.b = ((i8 * 2.0f) + f4) % 360.0f;
                    wbnVar.d = i6;
                    wbnVar.a.invoke();
                    break;
                }
                break;
        }
    }
}
