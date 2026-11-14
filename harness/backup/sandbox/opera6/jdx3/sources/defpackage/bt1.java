package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class bt1 implements a5n {
    public final /* synthetic */ byte a;
    public final LinearLayout b;
    public final StylingTextView c;
    public final StylingImageView d;

    public bt1(LinearLayout linearLayout, StylingImageView stylingImageView, StylingTextView stylingTextView) {
        this.a = (byte) 1;
        this.b = linearLayout;
        this.c = stylingTextView;
        this.d = stylingImageView;
    }

    public /* synthetic */ bt1(LinearLayout linearLayout, StylingImageView stylingImageView, StylingTextView stylingTextView, byte b) {
        this.a = b;
        this.b = linearLayout;
        this.d = stylingImageView;
        this.c = stylingTextView;
    }

    public static bt1 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131559547, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131362594;
        StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362594, viewInflate);
        if (stylingImageView != null) {
            i = 2131363525;
            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363525, viewInflate);
            if (stylingTextView != null) {
                return new bt1((LinearLayout) viewInflate, stylingImageView, stylingTextView, (byte) 2);
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }
}
