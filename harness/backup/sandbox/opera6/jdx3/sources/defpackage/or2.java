package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.CardView;
import com.opera.android.custom_views.CornerRadiusLayout;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.LayoutDirectionToolbar;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.live_score.LivescoreSheetContentWrapper;
import com.opera.android.live_score.LivescoreSheetLayoutSwitcher;
import com.opera.android.mainmenu.MainMenuSheetToggleLayout;
import com.opera.android.premium.ui.view.SubscriptionPlanList;
import com.opera.android.startup.ContentWrapperLayout;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import com.opera.android.ui.catalog.widget.OperaProgressIndicator;
import com.opera.android.ui.catalog.widget.OperaTextView;
import com.opera.android.webcore.FastResizeWebViewContainer;
import com.opera.android.widget.MeasurableHeightScrollView;
import com.opera.android.widget.SelectableRelativeLayout;
import com.opera.android.widget.ThemeableLottieAnimationView;

/* loaded from: classes.dex */
public final class or2 implements a5n {
    public final /* synthetic */ byte a;
    public final Object b;
    public final View c;
    public final Object d;
    public final Object e;
    public final Object f;

    public /* synthetic */ or2(View view, View view2, StylingTextView stylingTextView, View view3, StylingTextView stylingTextView2, byte b) {
        this.a = b;
        this.c = view;
        this.d = view2;
        this.b = stylingTextView;
        this.e = view3;
        this.f = stylingTextView2;
    }

    public /* synthetic */ or2(View view, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = view;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = obj4;
    }

    public /* synthetic */ or2(ViewGroup viewGroup, View view, View view2, StylingTextView stylingTextView, StylingTextView stylingTextView2, byte b) {
        this.a = b;
        this.c = viewGroup;
        this.d = view;
        this.e = view2;
        this.b = stylingTextView;
        this.f = stylingTextView2;
    }

    public or2(FrameLayout frameLayout, StylingImageView stylingImageView, TextView textView, TextView textView2, FrameLayout frameLayout2, CornerRadiusLayout cornerRadiusLayout) {
        this.a = (byte) 16;
        this.c = frameLayout;
        this.d = stylingImageView;
        this.e = textView;
        this.f = textView2;
        this.b = cornerRadiusLayout;
    }

    public or2(FrameLayout frameLayout, StylingImageView stylingImageView, StylingTextView stylingTextView, StylingImageView stylingImageView2, SelectableRelativeLayout selectableRelativeLayout, StylingTextView stylingTextView2) {
        this.a = (byte) 19;
        this.c = frameLayout;
        this.b = stylingTextView;
        this.d = stylingImageView2;
        this.e = selectableRelativeLayout;
        this.f = stylingTextView2;
    }

    public or2(LinearLayout linearLayout, OperaTextInputEditText operaTextInputEditText, TextInputLayout textInputLayout, OperaTextInputEditText operaTextInputEditText2, TextInputLayout textInputLayout2) {
        this.a = (byte) 24;
        this.c = linearLayout;
        this.f = operaTextInputEditText;
        this.d = textInputLayout;
        this.b = operaTextInputEditText2;
        this.e = textInputLayout2;
    }

    public or2(LinearLayout linearLayout, StylingTextView stylingTextView, StylingImageView stylingImageView, StylingImageView stylingImageView2, StylingTextView stylingTextView2) {
        this.a = (byte) 20;
        this.c = linearLayout;
        this.b = stylingTextView;
        this.d = stylingImageView;
        this.e = stylingImageView2;
        this.f = stylingTextView2;
    }

    public or2(LinearLayout linearLayout, LivescoreSheetContentWrapper livescoreSheetContentWrapper, LivescoreSheetLayoutSwitcher livescoreSheetLayoutSwitcher, MeasurableHeightScrollView measurableHeightScrollView, LayoutDirectionToolbar layoutDirectionToolbar, FastResizeWebViewContainer fastResizeWebViewContainer) {
        this.a = (byte) 14;
        this.c = linearLayout;
        this.d = livescoreSheetContentWrapper;
        this.e = measurableHeightScrollView;
        this.f = layoutDirectionToolbar;
        this.b = fastResizeWebViewContainer;
    }

    public or2(ConstraintLayout constraintLayout, StylingImageView stylingImageView, StylingImageView stylingImageView2, OperaTextView operaTextView, OperaTextView operaTextView2, OperaTextView operaTextView3, TextSwitcher textSwitcher, OperaTextView operaTextView4, TextSwitcher textSwitcher2) {
        this.a = (byte) 4;
        this.c = constraintLayout;
        this.d = stylingImageView;
        this.e = stylingImageView2;
        this.f = textSwitcher;
        this.b = textSwitcher2;
    }

    public or2(ConstraintLayout constraintLayout, ContentWrapperLayout contentWrapperLayout, OperaMaterialButton operaMaterialButton, OperaProgressIndicator operaProgressIndicator, OperaProgressIndicator operaProgressIndicator2, ThemeableLottieAnimationView themeableLottieAnimationView, OperaProgressIndicator operaProgressIndicator3, ConstraintLayout constraintLayout2, ThemeableLottieAnimationView themeableLottieAnimationView2, TextView textView) {
        this.a = (byte) 27;
        this.c = constraintLayout;
        this.d = contentWrapperLayout;
        this.e = operaMaterialButton;
        this.f = themeableLottieAnimationView;
        this.b = constraintLayout2;
    }

    public static or2 a(View view) {
        int i = 2131361870;
        if (((FrameLayout) w1h.j(2131361870, view)) != null) {
            i = 2131362450;
            AppCompatImageView appCompatImageView = (StylingImageButton) w1h.j(2131362450, view);
            if (appCompatImageView != null) {
                i = 2131362731;
                AppCompatImageView appCompatImageView2 = (StylingImageView) w1h.j(2131362731, view);
                if (appCompatImageView2 != null) {
                    i = 2131362949;
                    StylingTextView stylingTextView = (StylingTextView) w1h.j(2131362949, view);
                    if (stylingTextView != null) {
                        i = 2131363296;
                        StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363296, view);
                        if (stylingTextView2 != null) {
                            return new or2((ViewGroup) view, (View) appCompatImageView, (View) appCompatImageView2, stylingTextView, stylingTextView2, (byte) 1);
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static or2 b(View view) {
        int i = 2131363719;
        ImageView imageView = (ImageView) w1h.j(2131363719, view);
        if (imageView != null) {
            i = 2131363721;
            ConstraintLayout constraintLayoutJ = w1h.j(2131363721, view);
            if (constraintLayoutJ != null) {
                int i2 = 2131363720;
                ImageView imageView2 = (ImageView) w1h.j(2131363720, constraintLayoutJ);
                if (imageView2 != null) {
                    i2 = 2131363722;
                    ImageView imageView3 = (ImageView) w1h.j(2131363722, constraintLayoutJ);
                    if (imageView3 != null) {
                        ov0 ov0Var = new ov0((View) constraintLayoutJ, (Object) imageView2, (Object) imageView3, (byte) 21);
                        i = 2131363723;
                        TextView textView = (TextView) w1h.j(2131363723, view);
                        if (textView != null) {
                            i = 2131363724;
                            TextView textView2 = (TextView) w1h.j(2131363724, view);
                            if (textView2 != null) {
                                return new or2(view, (Object) imageView, (Object) ov0Var, (Object) textView, (Object) textView2, (byte) 13);
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(constraintLayoutJ.getResources().getResourceName(i2)));
                return null;
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static or2 c(View view) {
        int i = 2131361906;
        MainMenuSheetToggleLayout mainMenuSheetToggleLayout = (MainMenuSheetToggleLayout) w1h.j(2131361906, view);
        if (mainMenuSheetToggleLayout != null) {
            i = 2131362491;
            MainMenuSheetToggleLayout mainMenuSheetToggleLayout2 = (MainMenuSheetToggleLayout) w1h.j(2131362491, view);
            if (mainMenuSheetToggleLayout2 != null) {
                i = 2131363693;
                MainMenuSheetToggleLayout mainMenuSheetToggleLayout3 = (MainMenuSheetToggleLayout) w1h.j(2131363693, view);
                if (mainMenuSheetToggleLayout3 != null) {
                    i = 2131365058;
                    MainMenuSheetToggleLayout mainMenuSheetToggleLayout4 = (MainMenuSheetToggleLayout) w1h.j(2131365058, view);
                    if (mainMenuSheetToggleLayout4 != null) {
                        return new or2(view, (Object) mainMenuSheetToggleLayout, (Object) mainMenuSheetToggleLayout2, (Object) mainMenuSheetToggleLayout3, (Object) mainMenuSheetToggleLayout4, (byte) 17);
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static or2 d(View view) {
        int i = 2131363034;
        StylingImageButton stylingImageButton = (StylingImageButton) w1h.j(2131363034, view);
        if (stylingImageButton != null) {
            i = 2131363891;
            StylingImageButton stylingImageButton2 = (StylingImageButton) w1h.j(2131363891, view);
            if (stylingImageButton2 != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i = 2131365031;
                StylingImageButton stylingImageButton3 = (StylingImageButton) w1h.j(2131365031, view);
                if (stylingImageButton3 != null) {
                    return new or2((View) relativeLayout, (Object) stylingImageButton, (Object) stylingImageButton2, (Object) relativeLayout, (Object) stylingImageButton3, (byte) 18);
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static or2 e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131558678, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131362633;
        View viewJ = w1h.j(2131362633, viewInflate);
        if (viewJ != null) {
            i = 2131362634;
            ImageView imageView = (ImageView) w1h.j(2131362634, viewInflate);
            if (imageView != null) {
                i = 2131362635;
                FrameLayout frameLayout = (FrameLayout) w1h.j(2131362635, viewInflate);
                if (frameLayout != null) {
                    i = 2131362636;
                    View viewJ2 = w1h.j(2131362636, viewInflate);
                    if (viewJ2 != null) {
                        return new or2(viewInflate, (Object) viewJ, (Object) imageView, (Object) frameLayout, (Object) viewJ2, (byte) 6);
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        ConstraintLayout constraintLayout = this.c;
        switch (b) {
            case 0:
                return (LayoutDirectionLinearLayout) constraintLayout;
            case 1:
                return constraintLayout;
            case 2:
                return (FrameLayout) constraintLayout;
            case 3:
                return (FrameLayout) constraintLayout;
            case 4:
                return constraintLayout;
            case 5:
                return constraintLayout;
            case 6:
                return (FrameLayout) constraintLayout;
            case 7:
                return constraintLayout;
            case 8:
                return (FrameLayout) constraintLayout;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return constraintLayout;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return (CardView) constraintLayout;
            case 11:
                return (SelectableRelativeLayout) constraintLayout;
            case 12:
                return (j3b) constraintLayout;
            case 13:
                return constraintLayout;
            case 14:
                return (LinearLayout) constraintLayout;
            case 15:
                return (LinearLayout) constraintLayout;
            case 16:
                return (FrameLayout) constraintLayout;
            case 17:
                return (LinearLayout) constraintLayout;
            case SizeUtil.textSize0_1 /* 18 */:
                return (RelativeLayout) constraintLayout;
            case 19:
                return (FrameLayout) constraintLayout;
            case SizeUtil.textSize0 /* 20 */:
                return (LinearLayout) constraintLayout;
            case 21:
                return (LinearLayout) constraintLayout;
            case SizeUtil.textSize1 /* 22 */:
                return (FrameLayout) constraintLayout;
            case 23:
                return (LinearLayout) constraintLayout;
            case SizeUtil.textSize2 /* 24 */:
                return (LinearLayout) constraintLayout;
            case 25:
                return (FrameLayout) constraintLayout;
            case 26:
                return (LinearLayout) constraintLayout;
            case 27:
                return constraintLayout;
            case 28:
                return (SubscriptionPlanList) constraintLayout;
            default:
                return constraintLayout;
        }
    }
}
