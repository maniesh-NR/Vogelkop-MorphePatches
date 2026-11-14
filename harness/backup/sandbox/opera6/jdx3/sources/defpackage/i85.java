package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final class i85 implements re5 {
    public final ConstraintLayout a;
    public final k1g b;
    public final View c;
    public final TextView d;
    public final TextView e;
    public final OperaTextView f;
    public final OperaTextView g;
    public final StylingImageButton h;
    public final StylingImageButton i;
    public final StylingImageButton j;
    public final View k;

    public i85(ConstraintLayout constraintLayout, k1g k1gVar, View view, TextView textView, TextView textView2, OperaTextView operaTextView, OperaTextView operaTextView2, StylingImageButton stylingImageButton, StylingImageButton stylingImageButton2, StylingImageButton stylingImageButton3, View view2) {
        this.a = constraintLayout;
        this.b = k1gVar;
        this.c = view;
        this.d = textView;
        this.e = textView2;
        this.f = operaTextView;
        this.g = operaTextView2;
        this.h = stylingImageButton;
        this.i = stylingImageButton2;
        this.j = stylingImageButton3;
        this.k = view2;
    }

    @Override // defpackage.re5
    public final View getRoot() {
        return this.a;
    }
}
