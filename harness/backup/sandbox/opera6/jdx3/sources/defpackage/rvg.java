package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.custom_views.RecyclerViewForScreenshot;
import com.opera.android.custom_views.StylingEditText;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageCheckableWithText;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.premium.ui.view.PremiumPricingCard;
import com.opera.android.widget.ThemeableLottieAnimationView;

/* loaded from: classes.dex */
public final class rvg implements a5n {
    public final /* synthetic */ byte a = 2;
    public final ViewGroup b;
    public final View c;
    public final Object d;
    public final Object e;
    public final View f;
    public final Object g;
    public final View h;
    public final Object i;
    public final View j;
    public final View k;
    public final View l;
    public final View m;
    public final View n;
    public final View o;
    public final View p;

    /* JADX WARN: Multi-variable type inference failed */
    public rvg(FrameLayout frameLayout, StylingImageCheckableWithText stylingImageCheckableWithText, LinearLayout linearLayout, StylingImageButton stylingImageButton, Barrier barrier, RecyclerView recyclerView, StylingEditText stylingEditText, View view, StylingImageButton stylingImageButton2, ConstraintLayout constraintLayout, ThemeableLottieAnimationView themeableLottieAnimationView, StylingImageButton stylingImageButton3, Barrier barrier2, StylingImageButton stylingImageButton4, LinearLayout linearLayout2) {
        this.b = frameLayout;
        this.d = stylingImageCheckableWithText;
        this.e = linearLayout;
        this.f = stylingImageButton;
        this.g = barrier;
        this.h = recyclerView;
        this.i = stylingEditText;
        this.c = view;
        this.j = stylingImageButton2;
        this.k = constraintLayout;
        this.l = themeableLottieAnimationView;
        this.m = stylingImageButton3;
        this.n = barrier2;
        this.o = stylingImageButton4;
        this.p = linearLayout2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rvg(CoordinatorLayout coordinatorLayout, MaterialButton materialButton, hi4 hi4Var, hi4 hi4Var2, StylingTextView stylingTextView, hi4 hi4Var3, TextInputLayout textInputLayout, hi4 hi4Var4, RecyclerViewForScreenshot recyclerViewForScreenshot, LinearProgressIndicator linearProgressIndicator, LinearLayout linearLayout, StylingTextView stylingTextView2, ViewSwitcher viewSwitcher, MaterialButton materialButton2, LinearLayout linearLayout2) {
        this.b = coordinatorLayout;
        this.c = materialButton;
        this.d = hi4Var;
        this.e = hi4Var2;
        this.f = stylingTextView;
        this.g = hi4Var3;
        this.h = textInputLayout;
        this.i = hi4Var4;
        this.j = recyclerViewForScreenshot;
        this.k = linearProgressIndicator;
        this.l = linearLayout;
        this.m = stylingTextView2;
        this.n = viewSwitcher;
        this.o = materialButton2;
        this.p = linearLayout2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rvg(PremiumPricingCard premiumPricingCard, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, Flow flow, TextView textView10, ImageView imageView, TextView textView11) {
        this.b = premiumPricingCard;
        this.c = view;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
        this.h = textView5;
        this.i = textView6;
        this.j = textView7;
        this.k = textView8;
        this.l = textView9;
        this.o = flow;
        this.m = textView10;
        this.p = imageView;
        this.n = textView11;
    }

    public static rvg a(View view) {
        int i = 2131361873;
        StylingImageCheckableWithText stylingImageCheckableWithText = (StylingImageCheckableWithText) w1h.j(2131361873, view);
        if (stylingImageCheckableWithText != null) {
            i = 2131361874;
            LinearLayout linearLayout = (LinearLayout) w1h.j(2131361874, view);
            if (linearLayout != null) {
                i = 2131361940;
                StylingImageButton stylingImageButton = (StylingImageButton) w1h.j(2131361940, view);
                if (stylingImageButton != null) {
                    i = 2131362703;
                    Barrier barrierJ = w1h.j(2131362703, view);
                    if (barrierJ != null) {
                        i = 2131362950;
                        RecyclerView recyclerViewJ = w1h.j(2131362950, view);
                        if (recyclerViewJ != null) {
                            i = 2131364217;
                            StylingEditText stylingEditText = (StylingEditText) w1h.j(2131364217, view);
                            if (stylingEditText != null) {
                                i = 2131364218;
                                View viewJ = w1h.j(2131364218, view);
                                if (viewJ != null) {
                                    i = 2131364219;
                                    StylingImageButton stylingImageButton2 = (StylingImageButton) w1h.j(2131364219, view);
                                    if (stylingImageButton2 != null) {
                                        i = 2131364220;
                                        ConstraintLayout constraintLayoutJ = w1h.j(2131364220, view);
                                        if (constraintLayoutJ != null) {
                                            i = 2131364519;
                                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) w1h.j(2131364519, view);
                                            if (themeableLottieAnimationView != null) {
                                                i = 2131364520;
                                                StylingImageButton stylingImageButton3 = (StylingImageButton) w1h.j(2131364520, view);
                                                if (stylingImageButton3 != null) {
                                                    i = 2131364552;
                                                    Barrier barrierJ2 = w1h.j(2131364552, view);
                                                    if (barrierJ2 != null) {
                                                        i = 2131364575;
                                                        StylingImageButton stylingImageButton4 = (StylingImageButton) w1h.j(2131364575, view);
                                                        if (stylingImageButton4 != null) {
                                                            i = 2131365092;
                                                            LinearLayout linearLayout2 = (LinearLayout) w1h.j(2131365092, view);
                                                            if (linearLayout2 != null) {
                                                                return new rvg((FrameLayout) view, stylingImageCheckableWithText, linearLayout, stylingImageButton, barrierJ, recyclerViewJ, stylingEditText, viewJ, stylingImageButton2, constraintLayoutJ, themeableLottieAnimationView, stylingImageButton3, barrierJ2, stylingImageButton4, linearLayout2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        ConstraintLayout constraintLayout = this.b;
        switch (b) {
            case 0:
                return (PremiumPricingCard) constraintLayout;
            case 1:
                return (CoordinatorLayout) constraintLayout;
            default:
                return (FrameLayout) constraintLayout;
        }
    }
}
