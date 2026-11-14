package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.chip.ChipGroup;
import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.CardView;
import com.opera.android.custom_views.LayoutDirectionFrameLayout;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.LayoutDirectionRelativeLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.feed.SoftwareClipMaskableFrameLayout;
import com.opera.android.privacy_monitor.views.TextCenteredLayout;
import com.opera.android.search.behavior.ScrollableToolbarLinearLayout;
import com.opera.android.settings.BigSwitchButton;
import com.opera.android.ui.catalog.widget.OperaTextView;
import com.opera.android.view.TouchIgnoringViewPager;
import com.opera.android.vpn.LocationButton;
import com.opera.android.weather.view.WeatherWidgetView;
import com.opera.android.widget.SelectableRelativeLayout;

/* loaded from: classes.dex */
public final class vs implements a5n {
    public final /* synthetic */ byte a;
    public final ViewGroup b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ vs(ViewGroup viewGroup, View view, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = viewGroup;
        this.c = view;
        this.d = obj;
        this.e = obj2;
    }

    public vs(FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.a = (byte) 5;
        this.b = frameLayout;
        this.d = imageView;
        this.c = textView;
        this.e = textView2;
    }

    public vs(RelativeLayout relativeLayout, OperaTextView operaTextView, OperaTextView operaTextView2, StylingImageView stylingImageView) {
        this.a = (byte) 18;
        this.b = relativeLayout;
        this.e = operaTextView;
        this.c = operaTextView2;
        this.d = stylingImageView;
    }

    public vs(CardView cardView, ov0 ov0Var, OperaTextView operaTextView, TouchIgnoringViewPager touchIgnoringViewPager, StylingImageView stylingImageView) {
        this.a = (byte) 13;
        this.b = cardView;
        this.c = ov0Var;
        this.e = operaTextView;
        this.d = stylingImageView;
    }

    public vs(LayoutDirectionFrameLayout layoutDirectionFrameLayout, StylingImageView stylingImageView, StylingTextView stylingTextView, FrameLayout frameLayout, LinearLayout linearLayout, StylingTextView stylingTextView2) {
        this.a = (byte) 14;
        this.b = layoutDirectionFrameLayout;
        this.c = stylingImageView;
        this.d = stylingTextView;
        this.e = stylingTextView2;
    }

    public static vs a(View view) {
        int i = 2131363786;
        if (((TextView) w1h.j(2131363786, view)) != null) {
            i = 2131363787;
            TextView textView = (TextView) w1h.j(2131363787, view);
            if (textView != null) {
                i = 2131363803;
                if (((TextView) w1h.j(2131363803, view)) != null) {
                    i = 2131363804;
                    TextView textView2 = (TextView) w1h.j(2131363804, view);
                    if (textView2 != null) {
                        i = 2131363525;
                        TextView textView3 = (TextView) w1h.j(2131363525, view);
                        if (textView3 != null) {
                            i = 2131364769;
                            if (w1h.j(2131364769, view) != null) {
                                return new vs((ViewGroup) view, (View) textView, (Object) textView2, (Object) textView3, (byte) 16);
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static vs b(View view) {
        int i = 2131362414;
        OperaTextView operaTextViewJ = w1h.j(2131362414, view);
        if (operaTextViewJ != null) {
            i = 2131363092;
            OperaTextView operaTextViewJ2 = w1h.j(2131363092, view);
            if (operaTextViewJ2 != null) {
                i = 2131363185;
                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131363185, view);
                if (stylingImageView != null) {
                    return new vs((RelativeLayout) view, operaTextViewJ, operaTextViewJ2, stylingImageView);
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static vs c(View view) {
        ScrollableToolbarLinearLayout scrollableToolbarLinearLayout = (ScrollableToolbarLinearLayout) view;
        int i = 2131362317;
        ChipGroup chipGroup = (ChipGroup) w1h.j(2131362317, view);
        if (chipGroup != null) {
            i = 2131364140;
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) w1h.j(2131364140, view);
            if (horizontalScrollView != null) {
                i = 2131364573;
                if (((FrameLayout) w1h.j(2131364573, view)) != null) {
                    return new vs((ViewGroup) scrollableToolbarLinearLayout, (View) scrollableToolbarLinearLayout, (Object) chipGroup, (Object) horizontalScrollView, (byte) 19);
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static vs d(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(2131558852, (ViewGroup) null, false);
        int i = 2131362425;
        if (((StylingImageView) w1h.j(2131362425, viewInflate)) != null) {
            i = 2131362527;
            if (w1h.j(2131362527, viewInflate) != null) {
                i = 2131363092;
                FrameLayout frameLayout = (FrameLayout) w1h.j(2131363092, viewInflate);
                if (frameLayout != null) {
                    i = 2131363782;
                    LinearLayout linearLayout = (LinearLayout) w1h.j(2131363782, viewInflate);
                    if (linearLayout != null) {
                        LayoutDirectionFrameLayout layoutDirectionFrameLayout = (LayoutDirectionFrameLayout) viewInflate;
                        i = 2131363525;
                        StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363525, viewInflate);
                        if (stylingTextView != null) {
                            return new vs((ViewGroup) layoutDirectionFrameLayout, (View) frameLayout, (Object) linearLayout, (Object) stylingTextView, (byte) 15);
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static vs e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131558517, viewGroup, false);
        int i = 2131362248;
        yq1 yq1Var = (StylingTextView) w1h.j(2131362248, viewInflate);
        if (yq1Var != null) {
            i = 2131363458;
            ImageView imageView = (ImageView) w1h.j(2131363458, viewInflate);
            if (imageView != null) {
                i = 2131364567;
                StylingTextView stylingTextView = (StylingTextView) w1h.j(2131364567, viewInflate);
                if (stylingTextView != null) {
                    return new vs((ViewGroup) viewInflate, (View) yq1Var, (Object) imageView, (Object) stylingTextView, (byte) 3);
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static vs f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131558527, viewGroup, false);
        int i = 2131362594;
        ImageView imageView = (ImageView) w1h.j(2131362594, viewInflate);
        if (imageView != null) {
            i = 2131363311;
            if (((LinearLayout) w1h.j(2131363311, viewInflate)) != null) {
                i = 2131364596;
                TextView textView = (TextView) w1h.j(2131364596, viewInflate);
                if (textView != null) {
                    i = 2131363525;
                    TextView textView2 = (TextView) w1h.j(2131363525, viewInflate);
                    if (textView2 != null) {
                        return new vs((FrameLayout) viewInflate, imageView, textView, textView2);
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static vs g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131559333, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131362330;
        TextView textView = (TextView) w1h.j(2131362330, viewInflate);
        if (textView != null) {
            i = 2131362696;
            TextCenteredLayout textCenteredLayout = (TextCenteredLayout) w1h.j(2131362696, viewInflate);
            if (textCenteredLayout != null) {
                i = 2131364544;
                TextView textView2 = (TextView) w1h.j(2131364544, viewInflate);
                if (textView2 != null) {
                    return new vs((ViewGroup) viewInflate, (View) textView, (Object) textCenteredLayout, (Object) textView2, (byte) 21);
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        ConstraintLayout constraintLayout = this.b;
        switch (b) {
            case 0:
                return constraintLayout;
            case 1:
            case 2:
                return constraintLayout;
            case 3:
                return (LayoutDirectionLinearLayout) constraintLayout;
            case 4:
                return (LayoutDirectionLinearLayout) constraintLayout;
            case 5:
                return (FrameLayout) constraintLayout;
            case 6:
                return (BigSwitchButton) constraintLayout;
            case 7:
                return (SelectableRelativeLayout) constraintLayout;
            case 8:
                return (LayoutDirectionRelativeLayout) constraintLayout;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return constraintLayout;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return (LayoutDirectionLinearLayout) constraintLayout;
            case 11:
                return constraintLayout;
            case 12:
                return (SoftwareClipMaskableFrameLayout) constraintLayout;
            case 13:
                return (CardView) constraintLayout;
            case 14:
                return (LayoutDirectionFrameLayout) constraintLayout;
            case 15:
                return (LayoutDirectionFrameLayout) constraintLayout;
            case 16:
                return constraintLayout;
            case 17:
                return (FrameLayout) constraintLayout;
            case SizeUtil.textSize0_1 /* 18 */:
                return (RelativeLayout) constraintLayout;
            case 19:
                return (ScrollableToolbarLinearLayout) constraintLayout;
            case SizeUtil.textSize0 /* 20 */:
                return constraintLayout;
            case 21:
                return (LinearLayout) constraintLayout;
            case SizeUtil.textSize1 /* 22 */:
                return constraintLayout;
            case 23:
                return (LinearLayout) constraintLayout;
            case SizeUtil.textSize2 /* 24 */:
                return (LocationButton) constraintLayout;
            case 25:
                return (CoordinatorLayout) constraintLayout;
            case 26:
                return constraintLayout;
            default:
                return (WeatherWidgetView) constraintLayout;
        }
    }
}
