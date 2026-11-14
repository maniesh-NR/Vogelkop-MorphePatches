package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.custom_views.LayoutDirectionFrameLayout;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.privacy_monitor.views.TextCenteredLayout;
import com.opera.android.settings.SettingsStatisticView;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.ui.catalog.widget.OperaTextView;
import com.opera.android.widget.spotlightcarousel.SpotlightCarouselRecyclerView;

/* loaded from: classes.dex */
public final class q5g implements a5n {
    public final /* synthetic */ byte a;
    public final ViewGroup b;
    public final Object c;
    public final Object d;

    public /* synthetic */ q5g(ViewGroup viewGroup, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = viewGroup;
        this.c = obj;
        this.d = obj2;
    }

    public q5g(FrameLayout frameLayout, OperaListItem operaListItem, RecyclerView recyclerView, OperaListItem operaListItem2, OperaListItem operaListItem3) {
        this.a = (byte) 14;
        this.b = frameLayout;
        this.c = recyclerView;
        this.d = operaListItem3;
    }

    public static q5g a(View view) {
        int i = 2131364528;
        View viewJ = w1h.j(2131364528, view);
        if (viewJ != null) {
            hi4 hi4VarB = hi4.b(viewJ);
            int i2 = 2131364978;
            OperaTextInputEditText operaTextInputEditText = (OperaTextInputEditText) w1h.j(2131364978, view);
            if (operaTextInputEditText != null) {
                i2 = 2131364981;
                if (w1h.j(2131364981, view) != null) {
                    return new q5g((LinearLayout) view, hi4VarB, operaTextInputEditText, (byte) 3);
                }
            }
            i = i2;
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static q5g b(LinearLayout linearLayout) {
        int i = 2131362260;
        FrameLayout frameLayout = (FrameLayout) w1h.j(2131362260, linearLayout);
        if (frameLayout != null) {
            i = 2131362261;
            SpotlightCarouselRecyclerView spotlightCarouselRecyclerView = (SpotlightCarouselRecyclerView) w1h.j(2131362261, linearLayout);
            if (spotlightCarouselRecyclerView != null) {
                return new q5g(linearLayout, frameLayout, spotlightCarouselRecyclerView, (byte) 7);
            }
        }
        t3p.q("Missing required view with ID: ".concat(linearLayout.getResources().getResourceName(i)));
        return null;
    }

    public static q5g c(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(2131559310, (ViewGroup) null, false);
        int i = 2131362527;
        if (w1h.j(2131362527, viewInflate) != null) {
            i = 2131363782;
            LinearLayout linearLayout = (LinearLayout) w1h.j(2131363782, viewInflate);
            if (linearLayout != null) {
                LayoutDirectionFrameLayout layoutDirectionFrameLayout = (LayoutDirectionFrameLayout) viewInflate;
                StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363525, viewInflate);
                if (stylingTextView != null) {
                    return new q5g(layoutDirectionFrameLayout, linearLayout, stylingTextView, (byte) 4);
                }
                i = 2131363525;
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static q5g d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131559321, viewGroup, false);
        int i = 2131364414;
        TextView textView = (TextView) w1h.j(2131364414, viewInflate);
        if (textView != null) {
            i = 2131364415;
            ImageView imageView = (ImageView) w1h.j(2131364415, viewInflate);
            if (imageView != null) {
                return new q5g((LayoutDirectionLinearLayout) viewInflate, textView, imageView, (byte) 6);
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static q5g e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131559410, viewGroup, false);
        int i = 2131363057;
        OperaTextView operaTextViewJ = w1h.j(2131363057, constraintLayoutInflate);
        if (operaTextViewJ != null) {
            i = 2131363525;
            OperaTextView operaTextViewJ2 = w1h.j(2131363525, constraintLayoutInflate);
            if (operaTextViewJ2 != null) {
                return new q5g(constraintLayoutInflate, operaTextViewJ, operaTextViewJ2, (byte) 9);
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        ConstraintLayout constraintLayout = this.b;
        switch (b) {
            case 0:
                return (p5g) constraintLayout;
            case 1:
                return (LinearLayout) constraintLayout;
            case 2:
                return constraintLayout;
            case 3:
                return (LinearLayout) constraintLayout;
            case 4:
                return (LayoutDirectionFrameLayout) constraintLayout;
            case 5:
                return (SettingsStatisticView) constraintLayout;
            case 6:
                return (LayoutDirectionLinearLayout) constraintLayout;
            case 7:
                return (LinearLayout) constraintLayout;
            case 8:
                return (FrameLayout) constraintLayout;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return constraintLayout;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return (LinearLayout) constraintLayout;
            case 11:
                return (TextCenteredLayout) constraintLayout;
            case 12:
                return (LinearLayout) constraintLayout;
            case 13:
                return constraintLayout;
            case 14:
                return (FrameLayout) constraintLayout;
            case 15:
                return (FrameLayout) constraintLayout;
            case 16:
                return (FrameLayout) constraintLayout;
            case 17:
                return (LinearLayout) constraintLayout;
            default:
                return (LayoutDirectionLinearLayout) constraintLayout;
        }
    }
}
