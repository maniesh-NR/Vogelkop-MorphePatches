package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final class y6o implements a5n {
    public final ConstraintLayout a;
    public final StylingImageButton b;
    public final ImageView c;
    public final OperaTextView d;
    public final OperaTextView e;

    public y6o(ConstraintLayout constraintLayout, StylingImageButton stylingImageButton, ImageView imageView, OperaTextView operaTextView, OperaTextView operaTextView2) {
        this.a = constraintLayout;
        this.b = stylingImageButton;
        this.c = imageView;
        this.d = operaTextView;
        this.e = operaTextView2;
    }

    public static y6o a(View view) {
        int i = 2131362353;
        StylingImageButton stylingImageButton = (StylingImageButton) w1h.j(2131362353, view);
        if (stylingImageButton != null) {
            i = 2131362594;
            ImageView imageView = (ImageView) w1h.j(2131362594, view);
            if (imageView != null) {
                i = 2131363509;
                OperaTextView operaTextViewJ = w1h.j(2131363509, view);
                if (operaTextViewJ != null) {
                    i = 2131363525;
                    OperaTextView operaTextViewJ2 = w1h.j(2131363525, view);
                    if (operaTextViewJ2 != null) {
                        return new y6o((ConstraintLayout) view, stylingImageButton, imageView, operaTextViewJ, operaTextViewJ2);
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
