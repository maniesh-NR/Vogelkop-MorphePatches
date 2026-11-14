package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final class x6o implements a5n {
    public final View a;
    public final LinearLayout b;
    public final ImageView c;
    public final OperaTextView d;
    public final y6o e;
    public final LinearLayout f;
    public final ImageView g;
    public final OperaTextView h;

    public x6o(View view, LinearLayout linearLayout, ImageView imageView, OperaTextView operaTextView, y6o y6oVar, LinearLayout linearLayout2, ImageView imageView2, OperaTextView operaTextView2) {
        this.a = view;
        this.b = linearLayout;
        this.c = imageView;
        this.d = operaTextView;
        this.e = y6oVar;
        this.f = linearLayout2;
        this.g = imageView2;
        this.h = operaTextView2;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
