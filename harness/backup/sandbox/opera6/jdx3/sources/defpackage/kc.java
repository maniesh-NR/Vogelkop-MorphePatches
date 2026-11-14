package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.i;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import com.leanplum.utils.SizeUtil;
import com.opera.android.bar.OmniButtonView;
import com.opera.android.custom_views.BottomIndicatorButtonGroup;
import com.opera.android.custom_views.HeightAnimatingFrameLayout;
import com.opera.android.custom_views.ToolbarProgressBar;
import com.opera.android.feed.HeightAnimatingSnappingRecyclerView;
import com.opera.android.media.MediaPlayerBottomSlideLayout;
import com.opera.android.widget.LottieAnimationView;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes.dex */
public final class kc extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public kc(OmniButtonView omniButtonView) {
        this.a = (byte) 22;
        Objects.requireNonNull(omniButtonView);
        this.b = omniButtonView;
    }

    public /* synthetic */ kc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public kc(tah tahVar) {
        this.a = (byte) 23;
        Objects.requireNonNull(tahVar);
        this.b = tahVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.y = null;
                actionBarOverlayLayout.i = false;
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((yi2) obj).f();
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
                focusRingDrawable.k = 1.0f;
                focusRingDrawable.invalidateSelf();
                break;
            case 14:
                ((i) obj).itemView.setTranslationZ(0.0f);
                break;
            case 17:
                ((LottieAnimationView) obj).r = null;
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                ((esg) obj).c = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.y = null;
                actionBarOverlayLayout.i = false;
                break;
            case 1:
                ((BottomIndicatorButtonGroup) obj).d = null;
                break;
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                bottomSheetBehavior.N(5);
                WeakReference weakReference = bottomSheetBehavior.Y;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.Y.get()).requestLayout();
                    break;
                }
                break;
            case 3:
            case 4:
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
            case 14:
            case 15:
            case 16:
            case SizeUtil.textSize1 /* 22 */:
            default:
                super.onAnimationEnd(animator);
                break;
            case 5:
                n85 n85Var = (n85) obj;
                View view = n85Var.b;
                view.setVisibility(view.getAlpha() <= 0.0f ? 8 : 0);
                n85Var.h = null;
                break;
            case 6:
                o85 o85Var = (o85) obj;
                o85Var.i = null;
                o85Var.d();
                break;
            case 7:
                ym7 ym7Var = (ym7) obj;
                ym7Var.p();
                ym7Var.r.start();
                break;
            case 8:
                ((ExpandableTransformationBehavior) obj).b = null;
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((yi2) obj).g();
                break;
            case 11:
                HeightAnimatingFrameLayout heightAnimatingFrameLayout = (HeightAnimatingFrameLayout) obj;
                heightAnimatingFrameLayout.a = heightAnimatingFrameLayout.b;
                heightAnimatingFrameLayout.c = null;
                break;
            case 12:
                HeightAnimatingSnappingRecyclerView heightAnimatingSnappingRecyclerView = (HeightAnimatingSnappingRecyclerView) obj;
                heightAnimatingSnappingRecyclerView.G0 = heightAnimatingSnappingRecyclerView.H0;
                heightAnimatingSnappingRecyclerView.I0 = null;
                break;
            case 13:
                ((jba) obj).a(true);
                break;
            case 17:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
                lottieAnimationView.p = false;
                Runnable runnable = lottieAnimationView.r;
                if (runnable != null) {
                    lottieAnimationView.r = null;
                    runnable.run();
                    break;
                }
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                esg esgVar = (esg) obj;
                mcn mcnVar = (mcn) esgVar.c;
                if (mcnVar != null) {
                    esgVar.c = null;
                    mcnVar.run();
                    break;
                }
                break;
            case 19:
                ddd dddVar = (ddd) obj;
                ((ycd) dddVar).b.setTranslationY(0.0f);
                dddVar.b(0.0f);
                break;
            case SizeUtil.textSize0 /* 20 */:
                ((MediaPlayerBottomSlideLayout) obj).b = null;
                break;
            case 21:
                ((lqe) obj).j = null;
                break;
            case 23:
                ((tah) obj).x();
                break;
            case SizeUtil.textSize2 /* 24 */:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                sideSheetBehavior.y(5);
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.p.get()).requestLayout();
                    break;
                }
                break;
            case 25:
                ghf ghfVar = (ghf) obj;
                ((ViewPager) ghfVar.b).endFakeDrag();
                ghfVar.d = null;
                break;
            case 26:
                g7b g7bVar = (g7b) obj;
                g7bVar.e = (byte) 0;
                g7bVar.f = null;
                g7bVar.l = false;
                break;
            case 27:
                ToolbarProgressBar toolbarProgressBar = (ToolbarProgressBar) obj;
                toolbarProgressBar.a = false;
                super/*com.opera.android.custom_views.SmoothProgressBar*/.setProgress(0);
                break;
            case 28:
                ((g7m) obj).j = null;
                break;
            case 29:
                ((y2m) obj).p();
                animator.removeListener(this);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                super.onAnimationRepeat(animator);
                m05 m05Var = (m05) obj;
                m05Var.g = (m05Var.g + 4) % ((p83) m05Var.f).e.length;
                break;
            case 4:
                super.onAnimationRepeat(animator);
                o05 o05Var = (o05) obj;
                o05Var.g = (o05Var.g + o05.l.length) % ((p83) o05Var.f).e.length;
                break;
            case 15:
                super.onAnimationRepeat(animator);
                wec wecVar = (wec) obj;
                wecVar.f = (wecVar.f + 1) % ((p83) wecVar.e).e.length;
                wecVar.g = true;
                break;
            case 16:
                super.onAnimationRepeat(animator);
                yec yecVar = (yec) obj;
                yecVar.g = (yecVar.g + 1) % ((p83) yecVar.f).e.length;
                yecVar.h = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 6:
                o85 o85Var = (o85) obj;
                q85 q85Var = (q85) ((pde) o85Var.b.k).g();
                p85 p85Var = o85Var.a;
                ((TextView) p85Var.l).setVisibility(0);
                ((ImageView) p85Var.i).setVisibility(q85Var.c != null ? 0 : 8);
                ((ImageView) p85Var.k).setVisibility(q85Var.d == null ? 8 : 0);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((yi2) obj).h(animator);
                break;
            case SizeUtil.textSize1 /* 22 */:
                bp bpVar = ((OmniButtonView) obj).j;
                if (bpVar != null) {
                    bpVar.U(true);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        switch (this.a) {
            case 5:
                ((n85) this.b).b.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator, z);
                break;
        }
    }
}
