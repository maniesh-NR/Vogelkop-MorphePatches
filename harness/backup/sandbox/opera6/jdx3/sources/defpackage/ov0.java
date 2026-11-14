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
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.leanplum.utils.SizeUtil;
import com.opera.android.bookmarks.ImportBookmarksBanner;
import com.opera.android.custom_views.AnimationEmptyListView;
import com.opera.android.custom_views.CapturableButton;
import com.opera.android.custom_views.CardView;
import com.opera.android.custom_views.DialogTitle;
import com.opera.android.custom_views.FadingNestedScrollView;
import com.opera.android.custom_views.FitWindowsFrameLayoutWithToolbar;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.LayoutDirectionRelativeLayout;
import com.opera.android.custom_views.LayoutDirectionToolbar;
import com.opera.android.custom_views.OperaEditText;
import com.opera.android.custom_views.StylingImageCheckableWithText;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.startpage.livescore.LiveScoreAudioCommentaryView;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.ui.catalog.widget.OperaTextView;
import com.opera.android.widget.AspectRatioImageView;
import com.opera.android.widget.SelectableRelativeLayout;

/* loaded from: classes.dex */
public final class ov0 implements a5n {
    public final /* synthetic */ byte a;
    public final View b;
    public final Object c;
    public final Object d;

    public /* synthetic */ ov0(View view, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = view;
        this.c = obj;
        this.d = obj2;
    }

    public ov0(ConstraintLayout constraintLayout, StylingTextView stylingTextView, LinearLayout linearLayout) {
        this.a = (byte) 17;
        this.b = constraintLayout;
        this.d = stylingTextView;
        this.c = linearLayout;
    }

    public ov0(ImportBookmarksBanner importBookmarksBanner, StylingImageView stylingImageView, TextView textView, MaterialButton materialButton) {
        this.a = (byte) 19;
        this.b = importBookmarksBanner;
        this.c = stylingImageView;
        this.d = materialButton;
    }

    public ov0(LayoutDirectionRelativeLayout layoutDirectionRelativeLayout, pq3 pq3Var, FrameLayout frameLayout, FrameLayout frameLayout2, StylingImageView stylingImageView, AspectRatioImageView aspectRatioImageView, StylingTextView stylingTextView, LayoutDirectionLinearLayout layoutDirectionLinearLayout, DialogTitle dialogTitle, DialogTitle dialogTitle2) {
        this.a = (byte) 18;
        this.b = layoutDirectionRelativeLayout;
        this.c = frameLayout;
        this.d = aspectRatioImageView;
    }

    public static ov0 a(View view) {
        int i = 2131362594;
        StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362594, view);
        if (stylingImageView != null) {
            i = 2131363485;
            OperaTextView operaTextViewJ = w1h.j(2131363485, view);
            if (operaTextViewJ != null) {
                return new ov0(view, (Object) stylingImageView, (Object) operaTextViewJ, (byte) 6);
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ov0 b(View view) {
        int i = 2131362240;
        View viewJ = w1h.j(2131362240, view);
        if (viewJ != null) {
            ov0 ov0VarC = c(viewJ);
            int i2 = 2131362594;
            if (((StylingImageView) w1h.j(2131362594, view)) != null) {
                i2 = 2131363509;
                TextView textView = (TextView) w1h.j(2131363509, view);
                if (textView != null) {
                    return new ov0(view, (Object) ov0VarC, (Object) textView, (byte) 13);
                }
            }
            i = i2;
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ov0 c(View view) {
        int i = 2131363659;
        CapturableButton capturableButton = (CapturableButton) w1h.j(2131363659, view);
        if (capturableButton != null) {
            i = 2131363917;
            CapturableButton capturableButton2 = (CapturableButton) w1h.j(2131363917, view);
            if (capturableButton2 != null) {
                return new ov0(view, (Object) capturableButton, (Object) capturableButton2, (byte) 14);
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ov0 d(View view) {
        int i = 2131362647;
        TextView textView = (TextView) w1h.j(2131362647, view);
        if (textView != null) {
            i = 2131362594;
            ImageView imageView = (ImageView) w1h.j(2131362594, view);
            if (imageView != null) {
                return new ov0(view, (Object) textView, (Object) imageView, (byte) 15);
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ov0 e(View view) {
        int i = 2131362305;
        StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362305, view);
        if (stylingImageView != null) {
            i = 2131363525;
            TextView textView = (TextView) w1h.j(2131363525, view);
            if (textView != null) {
                return new ov0(view, (Object) stylingImageView, (Object) textView, (byte) 23);
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ov0 f(View view) {
        int i = 2131363095;
        View viewJ = w1h.j(2131363095, view);
        if (viewJ != null) {
            i = 2131363692;
            OperaListItem operaListItem = (OperaListItem) w1h.j(2131363692, view);
            if (operaListItem != null) {
                return new ov0(view, (Object) viewJ, (Object) operaListItem, (byte) 24);
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ov0 g(View view) {
        int i = 2131363061;
        View viewJ = w1h.j(2131363061, view);
        if (viewJ != null) {
            i = 2131363956;
            Guideline guidelineJ = w1h.j(2131363956, view);
            if (guidelineJ != null) {
                return new ov0(view, (Object) viewJ, (Object) guidelineJ, (byte) 29);
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ov0 h(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(2131558637, (ViewGroup) null, false);
        int i = 2131363192;
        TextView textView = (TextView) w1h.j(2131363192, viewInflate);
        if (textView != null) {
            i = 2131363195;
            LinearLayout linearLayout = (LinearLayout) w1h.j(2131363195, viewInflate);
            if (linearLayout != null) {
                return new ov0(viewInflate, (Object) textView, (Object) linearLayout, (byte) 10);
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static ov0 i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131559171, viewGroup, false);
        int i = 2131362543;
        View viewJ = w1h.j(2131362543, viewInflate);
        if (viewJ != null) {
            b98 b98Var = new b98((FrameLayout) viewJ, (byte) 3);
            ImageView imageView = (ImageView) w1h.j(2131363185, viewInflate);
            if (imageView != null) {
                return new ov0(viewInflate, (Object) b98Var, (Object) imageView, (byte) 26);
            }
            i = 2131363185;
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static ov0 j(LayoutInflater layoutInflater, LinearLayout linearLayout) {
        TextInputLayout textInputLayoutInflate = layoutInflater.inflate(2131558664, (ViewGroup) linearLayout, false);
        OperaEditText operaEditText = (OperaEditText) w1h.j(2131362658, textInputLayoutInflate);
        if (operaEditText != null) {
            TextInputLayout textInputLayout = textInputLayoutInflate;
            return new ov0((View) textInputLayout, (Object) operaEditText, (Object) textInputLayout, (byte) 11);
        }
        t3p.q("Missing required view with ID: ".concat(textInputLayoutInflate.getResources().getResourceName(2131362658)));
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        NestedScrollView nestedScrollView = this.b;
        switch (b) {
            case 0:
                return (SelectableRelativeLayout) nestedScrollView;
            case 1:
                return (FitWindowsFrameLayoutWithToolbar) nestedScrollView;
            case 2:
                return (FitWindowsFrameLayoutWithToolbar) nestedScrollView;
            case 3:
                return (LayoutDirectionToolbar) nestedScrollView;
            case 4:
                return (LinearLayout) nestedScrollView;
            case 5:
                return (FrameLayout) nestedScrollView;
            case 6:
                return (RelativeLayout) nestedScrollView;
            case 7:
                return (FrameLayout) nestedScrollView;
            case 8:
                return (StylingImageCheckableWithText) nestedScrollView;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return (FadingNestedScrollView) nestedScrollView;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return (LinearLayout) nestedScrollView;
            case 11:
                return (TextInputLayout) nestedScrollView;
            case 12:
                return (AnimationEmptyListView) nestedScrollView;
            case 13:
                return (CardView) nestedScrollView;
            case 14:
                return (LinearLayout) nestedScrollView;
            case 15:
                return (LinearLayout) nestedScrollView;
            case 16:
                return (LinearLayout) nestedScrollView;
            case 17:
                return (ConstraintLayout) nestedScrollView;
            case SizeUtil.textSize0_1 /* 18 */:
                return (LayoutDirectionRelativeLayout) nestedScrollView;
            case 19:
                return (ImportBookmarksBanner) nestedScrollView;
            case SizeUtil.textSize0 /* 20 */:
                return (LiveScoreAudioCommentaryView) nestedScrollView;
            case 21:
                return (ConstraintLayout) nestedScrollView;
            case SizeUtil.textSize1 /* 22 */:
                return (ConstraintLayout) nestedScrollView;
            case 23:
                return (LinearLayout) nestedScrollView;
            case SizeUtil.textSize2 /* 24 */:
                return (LayoutDirectionLinearLayout) nestedScrollView;
            case 25:
                return (FrameLayout) nestedScrollView;
            case 26:
                return (FrameLayout) nestedScrollView;
            case 27:
                return (FrameLayout) nestedScrollView;
            case 28:
                return (FitWindowsFrameLayoutWithToolbar) nestedScrollView;
            default:
                return nestedScrollView;
        }
    }
}
