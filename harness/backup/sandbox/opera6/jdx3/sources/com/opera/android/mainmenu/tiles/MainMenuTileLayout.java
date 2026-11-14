package com.opera.android.mainmenu.tiles;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.icu.text.BreakIterator;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import defpackage.khh;
import defpackage.pt1;

/* loaded from: classes.dex */
public class MainMenuTileLayout extends FrameLayout {
    public final BreakIterator a;
    public final pt1 b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public MainMenuTileLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.a = BreakIterator.getWordInstance();
        View viewInflate = LayoutInflater.from(context).inflate(2131559009, (ViewGroup) this, false);
        addView(viewInflate);
        int i = 2131362121;
        StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362121, viewInflate);
        if (stylingImageView != null) {
            i = 2131362229;
            StylingImageView stylingImageView2 = (StylingImageView) w1h.j(2131362229, viewInflate);
            if (stylingImageView2 != null) {
                i = 2131362237;
                StylingTextView stylingTextView = (StylingTextView) w1h.j(2131362237, viewInflate);
                if (stylingTextView != null) {
                    i = 2131362416;
                    CardView cardViewJ = w1h.j(2131362416, viewInflate);
                    if (cardViewJ != null) {
                        i = 2131362421;
                        if (((LinearLayout) w1h.j(2131362421, viewInflate)) != null) {
                            i = 2131363347;
                            CircularProgressIndicator circularProgressIndicatorJ = w1h.j(2131363347, viewInflate);
                            if (circularProgressIndicatorJ != null) {
                                this.b = new pt1((FrameLayout) viewInflate, stylingImageView, stylingImageView2, stylingTextView, cardViewJ, circularProgressIndicatorJ);
                                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.r, 0, 0);
                                this.c = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                                this.d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                                this.e = typedArrayObtainStyledAttributes.getBoolean(2, false);
                                typedArrayObtainStyledAttributes.recycle();
                                return;
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void a() {
        boolean z = this.e;
        pt1 pt1Var = this.b;
        if (!z || this.f) {
            ((StylingImageView) pt1Var.e).setVisibility(8);
        } else {
            ((StylingImageView) pt1Var.e).setVisibility(0);
        }
    }

    public final void b() {
        boolean z = this.f;
        pt1 pt1Var = this.b;
        if (z) {
            pt1Var.g.setVisibility(0);
            ((StylingImageView) pt1Var.f).setVisibility(4);
        } else {
            pt1Var.g.setVisibility(8);
            ((StylingImageView) pt1Var.f).setVisibility(0);
        }
        a();
    }

    public final void c() {
        int i = this.d;
        pt1 pt1Var = this.b;
        if (i == 0) {
            ((StylingTextView) pt1Var.c).setText(null);
            return;
        }
        String string = getContext().getString(this.d);
        BreakIterator breakIterator = this.a;
        breakIterator.setText(string);
        breakIterator.next();
        if (breakIterator.next() == -1) {
            ((StylingTextView) pt1Var.c).setEllipsize(TextUtils.TruncateAt.END);
            ((StylingTextView) pt1Var.c).setMaxLines(1);
        } else {
            ((StylingTextView) pt1Var.c).setEllipsize(null);
            ((StylingTextView) pt1Var.c).setMaxLines(Integer.MAX_VALUE);
        }
        ((StylingTextView) pt1Var.c).setText(this.d);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        Drawable drawableF;
        super.onFinishInflate();
        StylingImageView stylingImageView = (StylingImageView) this.b.f;
        if (this.c != 0) {
            drawableF = sgb.F(this.c, getContext());
        } else {
            drawableF = null;
        }
        stylingImageView.setImageDrawable(drawableF);
        a();
        b();
        c();
    }

    @Override // android.view.View
    public final void onHoverChanged(boolean z) {
        super.onHoverChanged(z);
        pt1 pt1Var = this.b;
        if (z) {
            ((CardView) pt1Var.d).b(getContext().getColor(2131100268));
        } else {
            ((CardView) pt1Var.d).b(0);
        }
    }
}
