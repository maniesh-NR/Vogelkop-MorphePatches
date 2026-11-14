package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final class d5l implements re5 {
    public final ConstraintLayout a;
    public final k1g b;
    public final View c;
    public final StylingImageButton d;
    public final StylingImageButton e;
    public final StylingImageButton f;
    public final OperaTextView g;
    public final OperaTextView h;
    public final View i;
    public final View j;

    public d5l(ConstraintLayout constraintLayout, k1g k1gVar, View view, StylingImageButton stylingImageButton, StylingImageButton stylingImageButton2, StylingImageButton stylingImageButton3, OperaTextView operaTextView, OperaTextView operaTextView2, View view2, View view3) {
        this.a = constraintLayout;
        this.b = k1gVar;
        this.c = view;
        this.d = stylingImageButton;
        this.e = stylingImageButton2;
        this.f = stylingImageButton3;
        this.g = operaTextView;
        this.h = operaTextView2;
        this.i = view2;
        this.j = view3;
    }

    @Override // defpackage.re5
    public final View getRoot() {
        return this.a;
    }
}
