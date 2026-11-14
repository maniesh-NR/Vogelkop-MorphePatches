package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class owc implements a5n {
    public final /* synthetic */ byte a = 0;
    public final LinearLayout b;
    public final StylingImageView c;
    public final LinearLayout d;
    public final StylingTextView e;
    public final StylingImageView f;
    public final FrameLayout g;
    public final StylingTextView h;
    public final View i;

    public owc(LinearLayout linearLayout, StylingImageView stylingImageView, FrameLayout frameLayout, StylingImageView stylingImageView2, LinearLayout linearLayout2, StylingTextView stylingTextView, StylingTextView stylingTextView2, View view) {
        this.b = linearLayout;
        this.c = stylingImageView;
        this.g = frameLayout;
        this.f = stylingImageView2;
        this.d = linearLayout2;
        this.e = stylingTextView;
        this.h = stylingTextView2;
        this.i = view;
    }

    public owc(LinearLayout linearLayout, StylingImageView stylingImageView, LinearLayout linearLayout2, StylingTextView stylingTextView, StylingImageView stylingImageView2, FrameLayout frameLayout, StylingTextView stylingTextView2, View view) {
        this.b = linearLayout;
        this.c = stylingImageView;
        this.d = linearLayout2;
        this.e = stylingTextView;
        this.f = stylingImageView2;
        this.g = frameLayout;
        this.h = stylingTextView2;
        this.i = view;
    }

    public static owc a(View view) {
        int i = 2131362997;
        StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362997, view);
        if (stylingImageView != null) {
            i = 2131363360;
            LinearLayout linearLayout = (LinearLayout) w1h.j(2131363360, view);
            if (linearLayout != null) {
                i = 2131363950;
                StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363950, view);
                if (stylingTextView != null) {
                    i = 2131364181;
                    StylingImageView stylingImageView2 = (StylingImageView) w1h.j(2131364181, view);
                    if (stylingImageView2 != null) {
                        i = 2131364182;
                        FrameLayout frameLayout = (FrameLayout) w1h.j(2131364182, view);
                        if (frameLayout != null) {
                            i = 2131364184;
                            StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131364184, view);
                            if (stylingTextView2 != null) {
                                i = 2131365000;
                                View viewJ = w1h.j(2131365000, view);
                                if (viewJ != null) {
                                    return new owc((LinearLayout) view, stylingImageView, linearLayout, stylingTextView, stylingImageView2, frameLayout, stylingTextView2, viewJ);
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
        switch (this.a) {
        }
        return this.b;
    }
}
