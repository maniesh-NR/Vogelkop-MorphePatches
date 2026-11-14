package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.leanplum.utils.SizeUtil;
import com.opera.android.StatusBarDrawerAppBarLayout;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.BestHorizontalFitLayout;
import com.opera.android.custom_views.CheckBox;
import com.opera.android.custom_views.CircleImageView;
import com.opera.android.custom_views.DialogTitle;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.LayoutDirectionRelativeLayout;
import com.opera.android.custom_views.OperaRadioGroup;
import com.opera.android.custom_views.RadioButton;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.favorites.NonCollapsingCardView;
import com.opera.android.privacy_monitor.views.TextCenteredLayout;
import com.opera.android.startpage.SoftwareClipMaxWidthLinearLayout;
import com.opera.android.startpage.common.SnappingRecyclerView;
import com.opera.android.startpage.livescore.LiveScoreCarouselStarButton;
import com.opera.android.suggestion.CompactSuggestionView;
import com.opera.android.suggestion.adapter.SuggestionListActionItem;
import com.opera.android.theme.ThemeableRecyclerView;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final class kf implements a5n {
    public final /* synthetic */ byte a;
    public final View b;
    public final Object c;

    public /* synthetic */ kf(byte b, View view, Object obj) {
        this.a = b;
        this.b = view;
        this.c = obj;
    }

    public kf(LinearLayout linearLayout, zt5 zt5Var, FrameLayout frameLayout, StylingTextView stylingTextView, OperaMaterialButton operaMaterialButton, OperaMaterialButton operaMaterialButton2, DialogTitle dialogTitle) {
        this.a = (byte) 9;
        this.b = linearLayout;
        this.c = frameLayout;
    }

    public kf(ConstraintLayout constraintLayout, OperaMaterialButton operaMaterialButton, OperaMaterialButton operaMaterialButton2, FadingRecyclerView fadingRecyclerView) {
        this.a = (byte) 3;
        this.b = constraintLayout;
        this.c = fadingRecyclerView;
    }

    public kf(NonCollapsingCardView nonCollapsingCardView, FadingRecyclerView fadingRecyclerView, TextView textView) {
        this.a = (byte) 14;
        this.b = nonCollapsingCardView;
        this.c = textView;
    }

    public kf(pq3 pq3Var, FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView, TextView textView2, RecyclerView recyclerView, CircleImageView circleImageView) {
        this.a = (byte) 8;
        this.b = frameLayout;
        this.c = frameLayout2;
    }

    public static kf a(View view) {
        CheckBox checkBox = (CheckBox) w1h.j(2131362471, view);
        if (checkBox != null) {
            return new kf((byte) 2, view, (Object) checkBox);
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(2131362471)));
        return null;
    }

    public static kf b(FrameLayout frameLayout) {
        SoftwareClipMaxWidthLinearLayout softwareClipMaxWidthLinearLayout = (SoftwareClipMaxWidthLinearLayout) w1h.j(2131362257, frameLayout);
        if (softwareClipMaxWidthLinearLayout != null) {
            return new kf((byte) 29, (View) frameLayout, (Object) softwareClipMaxWidthLinearLayout);
        }
        t3p.q("Missing required view with ID: ".concat(frameLayout.getResources().getResourceName(2131362257)));
        return null;
    }

    public static kf c(View view) {
        StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363874, view);
        if (stylingTextView != null) {
            return new kf((byte) 6, view, (Object) stylingTextView);
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(2131363874)));
        return null;
    }

    public static kf d(View view) {
        int i = 2131362900;
        ConstraintLayout constraintLayoutJ = w1h.j(2131362900, view);
        if (constraintLayoutJ != null) {
            i = 2131362901;
            if (((ImageView) w1h.j(2131362901, view)) != null) {
                i = 2131362902;
                if (((SnappingRecyclerView) w1h.j(2131362902, view)) != null) {
                    i = 2131362903;
                    if (((StylingTextView) w1h.j(2131362903, view)) != null) {
                        return new kf((byte) 13, view, (Object) constraintLayoutJ);
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static kf e(View view) {
        int i = 2131362041;
        if (((StatusBarDrawerAppBarLayout) w1h.j(2131362041, view)) != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            int i2 = 2131363735;
            FrameLayout frameLayout = (FrameLayout) w1h.j(2131363735, view);
            if (frameLayout != null) {
                i2 = 2131364794;
                if (w1h.j(2131364794, view) != null) {
                    return new kf((byte) 15, (View) coordinatorLayout, (Object) frameLayout);
                }
            }
            i = i2;
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static kf f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131558960, viewGroup, false);
        int i = 2131362593;
        if (((StylingTextView) w1h.j(2131362593, viewInflate)) != null) {
            i = 2131362597;
            Object objJ = w1h.j(2131362597, viewInflate);
            if (objJ != null) {
                i = 2131362598;
                Object objJ2 = w1h.j(2131362598, viewInflate);
                if (objJ2 != null) {
                    i = 2131363332;
                    StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363332, viewInflate);
                    if (stylingTextView != null) {
                        i = 2131364523;
                        if (((BestHorizontalFitLayout) w1h.j(2131364523, viewInflate)) != null) {
                            return new kf((byte) 16, viewInflate, (Object) stylingTextView);
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static kf g(LayoutInflater layoutInflater, LinearLayout linearLayout) {
        yq1 yq1VarInflate = layoutInflater.inflate(2131558663, (ViewGroup) linearLayout, false);
        linearLayout.addView(yq1VarInflate);
        if (yq1VarInflate != null) {
            yq1 yq1Var = (RadioButton) yq1VarInflate;
            return new kf((byte) 10, (View) yq1Var, (Object) yq1Var);
        }
        t3p.q("rootView");
        return null;
    }

    public static kf h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131559172, viewGroup, false);
        int i = 2131362543;
        View viewJ = w1h.j(2131362543, viewInflate);
        if (viewJ != null) {
            b98 b98Var = new b98((FrameLayout) viewJ, (byte) 3);
            if (((FrameLayout) w1h.j(2131364081, viewInflate)) != null) {
                return new kf((byte) 20, viewInflate, (Object) b98Var);
            }
            i = 2131364081;
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static kf i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131559332, viewGroup, false);
        viewGroup.addView(viewInflate);
        if (viewInflate != null) {
            TextCenteredLayout textCenteredLayout = (TextCenteredLayout) viewInflate;
            return new kf((byte) 27, (View) textCenteredLayout, (Object) textCenteredLayout);
        }
        t3p.q("rootView");
        return null;
    }

    public static kf j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131559337, viewGroup, false);
        StylingTextView stylingTextView = (StylingTextView) w1h.j(2131364479, viewInflate);
        if (stylingTextView != null) {
            return new kf((byte) 28, viewInflate, (Object) stylingTextView);
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131364479)));
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        RecyclerView recyclerView = this.b;
        switch (b) {
            case 0:
                return (SuggestionListActionItem) recyclerView;
            case 1:
                return (OperaTextView) recyclerView;
            case 2:
                return (FrameLayout) recyclerView;
            case 3:
                return (ConstraintLayout) recyclerView;
            case 4:
                return (ThemeableRecyclerView) recyclerView;
            case 5:
                return (CoordinatorLayout) recyclerView;
            case 6:
                return (LayoutDirectionRelativeLayout) recyclerView;
            case 7:
                return (CompactSuggestionView) recyclerView;
            case 8:
                return (FrameLayout) recyclerView;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return (LinearLayout) recyclerView;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return (RadioButton) recyclerView;
            case 11:
                return (FrameLayout) recyclerView;
            case 12:
                return (FrameLayout) recyclerView;
            case 13:
                return (LayoutDirectionLinearLayout) recyclerView;
            case 14:
                return (NonCollapsingCardView) recyclerView;
            case 15:
                return (CoordinatorLayout) recyclerView;
            case 16:
                return (RelativeLayout) recyclerView;
            case 17:
                return (LiveScoreCarouselStarButton) recyclerView;
            case SizeUtil.textSize0_1 /* 18 */:
                return (RelativeLayout) recyclerView;
            case 19:
                return (LinearLayout) recyclerView;
            case SizeUtil.textSize0 /* 20 */:
                return (FrameLayout) recyclerView;
            case 21:
                return recyclerView;
            case SizeUtil.textSize1 /* 22 */:
                return (FadingRecyclerView) recyclerView;
            case 23:
                return (OperaRadioGroup) recyclerView;
            case SizeUtil.textSize2 /* 24 */:
                return (LinearLayout) recyclerView;
            case 25:
                return (ConstraintLayout) recyclerView;
            case 26:
                return (StatusBarDrawingFrameLayout) recyclerView;
            case 27:
                return (TextCenteredLayout) recyclerView;
            case 28:
                return (LayoutDirectionLinearLayout) recyclerView;
            default:
                return (FrameLayout) recyclerView;
        }
    }
}
