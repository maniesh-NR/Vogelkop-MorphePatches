package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class tn9 implements a5n {
    public final ConstraintLayout a;
    public final StylingImageView b;
    public final StylingTextView c;
    public final StylingImageButton d;
    public final StylingImageButton e;
    public final or2 f;
    public final StylingTextView g;
    public final or2 h;

    public tn9(ConstraintLayout constraintLayout, StylingImageView stylingImageView, StylingTextView stylingTextView, StylingImageButton stylingImageButton, StylingImageButton stylingImageButton2, or2 or2Var, StylingTextView stylingTextView2, or2 or2Var2) {
        this.a = constraintLayout;
        this.b = stylingImageView;
        this.c = stylingTextView;
        this.d = stylingImageButton;
        this.e = stylingImageButton2;
        this.f = or2Var;
        this.g = stylingTextView2;
        this.h = or2Var2;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
