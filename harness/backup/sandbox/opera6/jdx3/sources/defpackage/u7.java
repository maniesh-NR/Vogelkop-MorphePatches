package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.view.animation.PathInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.i;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.RootView;
import com.opera.android.ads.AdStarRatingView;
import com.opera.android.autofill.CreditCard;
import com.opera.android.bar.BottomBar;
import com.opera.android.browser.BrowserFragment;
import com.opera.android.bubbleview.BubbleView;
import com.opera.android.custom_views.AccentSelector;
import com.opera.android.custom_views.ActionBarSearchView;
import com.opera.android.custom_views.AnimationEmptyListView;
import com.opera.android.custom_views.BottomIndicatorButtonGroup;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.TabCountButton;
import com.opera.android.custom_views.ThemeSelector;
import com.opera.android.settings.BigSwitchButton;
import com.opera.android.widget.ThemeableLottieAnimationView;

/* loaded from: classes.dex */
public final /* synthetic */ class u7 implements r8n {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.r8n
    public final void a(View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                AccentSelector accentSelector = (AccentSelector) obj;
                int i = AccentSelector.n;
                sll sllVar = accentSelector.m;
                sllVar.setColor(f03.W(sllVar.b, sllVar.a));
                accentSelector.invalidate();
                break;
            case 1:
                ActionBarSearchView actionBarSearchView = (ActionBarSearchView) obj;
                int i2 = ActionBarSearchView.j0;
                TextView textView = (TextView) actionBarSearchView.findViewById(2131364166);
                textView.setHintTextColor(f03.t(2130969263, actionBarSearchView.getContext(), 2131101243));
                Drawable drawable = (Drawable) mzg.h(actionBarSearchView, "mSearchHintIcon");
                if (drawable != null) {
                    j14.n0(drawable, textView.getHintTextColors().getDefaultColor());
                    mzg.p(actionBarSearchView, drawable, "mSearchHintIcon");
                    actionBarSearchView.setQueryHint(actionBarSearchView.getQueryHint());
                }
                ColorStateList colorStateListV = f03.v(actionBarSearchView.getContext());
                ImageView imageView = (ImageView) actionBarSearchView.findViewById(2131364149);
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 != null) {
                    drawable2.mutate();
                    drawable2.setTintList(colorStateListV);
                    imageView.setImageDrawable(drawable2);
                }
                ImageView imageView2 = (ImageView) actionBarSearchView.findViewById(2131364151);
                Drawable drawable3 = imageView2.getDrawable();
                if (drawable3 != null) {
                    j14.n0(drawable3, colorStateListV.getDefaultColor());
                    imageView2.setImageDrawable(drawable3);
                }
                ImageView imageView3 = (ImageView) actionBarSearchView.findViewById(2131364160);
                Drawable drawable4 = imageView3.getDrawable();
                if (drawable4 != null) {
                    drawable4.mutate();
                    drawable4.setTintList(colorStateListV);
                    imageView3.setImageDrawable(drawable4);
                    break;
                }
                break;
            case 2:
                ((tf) obj).U();
                break;
            case 3:
                ((wk) obj).H0();
                break;
            case 4:
                int i3 = AdStarRatingView.h;
                ((AdStarRatingView) obj).d.setColorFilter(f03.t(2130969184, view.getContext(), 2131101243), PorterDuff.Mode.MULTIPLY);
                break;
            case 5:
                q87 q87Var = (q87) obj;
                Context context = q87Var.b;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.listDivider});
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                q87Var.d = resourceId != 0 ? sgb.F(resourceId, context) : null;
                typedArrayObtainStyledAttributes.recycle();
                break;
            case 6:
                ws wsVar = (ws) obj;
                ts tsVar = wsVar.d;
                if (tsVar != null) {
                    ConstraintLayout constraintLayout = wsVar.b.b;
                    constraintLayout.setBackgroundTintList(f03.W(tsVar.a.b, constraintLayout.getContext()));
                    break;
                }
                break;
            case 7:
                s10 s10Var = (s10) obj;
                s10Var.i0();
                s10Var.f0();
                break;
            case 8:
                Drawable positiveButtonIcon = ((vv3) ((uk6) obj).b).getPositiveButtonIcon(view.getContext());
                int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(2131165290);
                positiveButtonIcon.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                ((Button) view).setCompoundDrawables(positiveButtonIcon, null, null, null);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                AnimationEmptyListView animationEmptyListView = (AnimationEmptyListView) obj;
                ov0 ov0Var = animationEmptyListView.a;
                animationEmptyListView.d = p37.r(f03.t(2130969325, ((ThemeableLottieAnimationView) ov0Var.c).getContext(), 2131101243), f03.t(2130969263, ((ThemeableLottieAnimationView) ov0Var.c).getContext(), 2131101243));
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                zu1 zu1Var = (zu1) obj;
                g7j g7jVar = zu1Var.c;
                if (g7jVar != null) {
                    zu1.U(g7jVar, (AccentSelector) zu1Var.b.b);
                    break;
                }
                break;
            case 11:
                av1 av1Var = (av1) obj;
                f7j f7jVar = av1Var.c;
                if (f7jVar != null) {
                    av1Var.U(f7jVar, (ThemeSelector) av1Var.b.b);
                    break;
                }
                break;
            case 12:
                mr2 mr2Var = (mr2) obj;
                ColorStateList colorStateListU = f03.u(2130969303, view.getContext(), 2131100356);
                if (colorStateListU != null) {
                    fr2 fr2Var = mr2Var.y;
                    Drawable drawable5 = (fr2Var != null ? fr2Var : null).b;
                    if (drawable5 != null) {
                        drawable5.setTintList(colorStateListU);
                        break;
                    }
                }
                break;
            case 13:
                ((jv2) obj).U();
                break;
            case 14:
                ((g53) obj).L0(view);
                Toolbar toolbar = (Toolbar) view;
                Drawable drawableQ = toolbar.q();
                if (drawableQ != null) {
                    j14.n0(drawableQ, f03.t(2130969110, toolbar.getContext(), 2131103876));
                    break;
                }
                break;
            case 15:
                view.setBackgroundColor(((s63) obj).i ? f03.t(2130969517, view.getContext(), 2131101243) : f03.G(view.getContext()).getDefaultColor());
                break;
            case 16:
                ((x83) obj).q(view);
                break;
            case 17:
                BigSwitchButton bigSwitchButton = (BigSwitchButton) obj;
                k2d k2dVar = BigSwitchButton.j;
                bigSwitchButton.a();
                bigSwitchButton.e();
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                BottomBar bottomBar = (BottomBar) obj;
                boolean z = BottomBar.r;
                bottomBar.l.setColor(f03.t(2130970698, bottomBar.getContext(), 2131099816));
                break;
            case 19:
                BottomIndicatorButtonGroup bottomIndicatorButtonGroup = (BottomIndicatorButtonGroup) obj;
                PathInterpolator pathInterpolator = BottomIndicatorButtonGroup.i;
                bottomIndicatorButtonGroup.b.setColor(f03.C(view.getContext()));
                bottomIndicatorButtonGroup.invalidate();
                break;
            case SizeUtil.textSize0 /* 20 */:
                i3j i3jVar = (i3j) obj;
                i3jVar.i();
                ((fwk) i3jVar.c).jumpToCurrentState();
                break;
            case 21:
                ((TabCountButton) ((pjn) obj).b).f(f03.v(view.getContext()));
                break;
            case SizeUtil.textSize1 /* 22 */:
                Window window = ((tq3) obj).getWindow();
                if (window != null) {
                    mcj.s(window, p37.u0(f03.t(2130968812, view.getContext(), 2131101243)));
                    break;
                }
                break;
            case 23:
                BrowserActivity browserActivity = (BrowserActivity) obj;
                int i4 = BrowserActivity.E1;
                RootView rootView = browserActivity.Q;
                if (rootView == null) {
                    rootView = null;
                }
                s8n s8nVar = new s8n(rootView.getContext(), 2130969943);
                RootView rootView2 = browserActivity.Q;
                if (rootView2 == null) {
                    rootView2 = null;
                }
                int iT = f03.t(2130970431, s8nVar, 2131101243);
                if (iT != rootView2.s) {
                    rootView2.s = iT;
                    rootView2.invalidate();
                    rootView2.f();
                }
                RootView rootView3 = browserActivity.Q;
                RootView rootView4 = rootView3 != null ? rootView3 : null;
                int iT2 = f03.t(2130970432, s8nVar, 2131101243);
                if (iT2 != rootView4.t) {
                    rootView4.t = iT2;
                    rootView4.invalidate();
                    rootView4.f();
                    break;
                }
                break;
            case SizeUtil.textSize2 /* 24 */:
                BrowserFragment browserFragment = (BrowserFragment) obj;
                browserFragment.g.z();
                browserFragment.d.d(Integer.valueOf(f03.H(view.getContext()) ? -16777216 : -1));
                break;
            case 25:
                int i5 = BubbleView.D;
                ((BubbleView) obj).b();
                break;
            case 26:
                al4 al4Var = (al4) obj;
                CreditCard creditCard = al4Var.c;
                if (creditCard != null) {
                    StylingImageView stylingImageView = (StylingImageView) al4Var.b.d;
                    Context context2 = ((i) al4Var).itemView.getContext();
                    int iV = y9m.V(creditCard.f, context2);
                    if (iV == 0) {
                        iV = y9m.V(5, context2);
                    }
                    stylingImageView.setImageResource(iV);
                    break;
                }
                break;
            case 27:
                ((ac1) obj).l();
                break;
            case 28:
                l55 l55Var = (l55) obj;
                fqk fqkVar = l55Var.d;
                if (fqkVar != null && fqkVar.c.d == null) {
                    l55Var.b.x(new dxh(2130969900));
                    break;
                }
                break;
            default:
                ((h85) obj).Z();
                break;
        }
    }
}
