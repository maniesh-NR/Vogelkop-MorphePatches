package com.opera.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import defpackage.h63;
import defpackage.khh;
import defpackage.pp8;
import defpackage.vs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/opera/android/widget/FaqItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "pp8", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FaqItemView extends ConstraintLayout {
    public static final /* synthetic */ int t = 0;
    public final pp8 p;
    public vs q;
    public h63 r;
    public h63 s;

    public FaqItemView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.n, 0, 0);
        try {
            pp8 pp8Var = new pp8(typedArrayObtainStyledAttributes.getResourceId(2, 0), typedArrayObtainStyledAttributes.getResourceId(0, 0), typedArrayObtainStyledAttributes.getBoolean(1, false));
            typedArrayObtainStyledAttributes.recycle();
            this.p = pp8Var;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, android.widget.TextView, com.opera.android.custom_views.StylingTextView, yq1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View, android.widget.TextView, com.opera.android.custom_views.StylingTextView, yq1] */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        vs vsVar = this.q;
        if (vsVar == null) {
            vsVar = null;
        }
        ?? r0 = (StylingTextView) vsVar.e;
        h63 h63Var = new h63(this, (StylingTextView) r0);
        r0.addTextChangedListener(h63Var);
        CharSequence text = r0.getText();
        int i = 8;
        r0.setVisibility((text == null || text.length() == 0) ? 8 : 0);
        this.r = h63Var;
        vs vsVar2 = this.q;
        ?? r02 = (StylingTextView) (vsVar2 != null ? vsVar2 : null).d;
        h63 h63Var2 = new h63(this, (StylingTextView) r02);
        r02.addTextChangedListener(h63Var2);
        CharSequence text2 = r02.getText();
        if (text2 != null && text2.length() != 0) {
            i = 0;
        }
        r02.setVisibility(i);
        this.s = h63Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        TextWatcher textWatcher = this.r;
        if (textWatcher != null) {
            vs vsVar = this.q;
            if (vsVar == null) {
                vsVar = null;
            }
            ((StylingTextView) vsVar.e).removeTextChangedListener(textWatcher);
        }
        this.r = null;
        TextWatcher textWatcher2 = this.s;
        if (textWatcher2 != null) {
            vs vsVar2 = this.q;
            if (vsVar2 == null) {
                vsVar2 = null;
            }
            ((StylingTextView) vsVar2.d).removeTextChangedListener(textWatcher2);
        }
        this.s = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(getContext()).inflate(2131558717, (ViewGroup) this, false);
        addView(constraintLayoutInflate);
        int i = 2131362843;
        AppCompatImageView appCompatImageView = (StylingImageView) w1h.j(2131362843, constraintLayoutInflate);
        if (appCompatImageView != null) {
            i = 2131362845;
            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131362845, constraintLayoutInflate);
            if (stylingTextView != null) {
                i = 2131362846;
                yq1 yq1Var = (StylingTextView) w1h.j(2131362846, constraintLayoutInflate);
                if (yq1Var != null) {
                    this.q = new vs((ViewGroup) constraintLayoutInflate, (View) appCompatImageView, (Object) stylingTextView, (Object) yq1Var, (byte) 11);
                    pp8 pp8Var = this.p;
                    int i2 = pp8Var.a;
                    if (i2 != 0) {
                        yq1Var.setText(i2);
                    } else {
                        yq1Var.setText("");
                    }
                    int i3 = pp8Var.b;
                    vs vsVar = this.q;
                    if (vsVar == null) {
                        vsVar = null;
                    }
                    yq1 yq1Var2 = (StylingTextView) vsVar.d;
                    if (i3 != 0) {
                        yq1Var2.setText(i3);
                    } else {
                        yq1Var2.setText("");
                    }
                    boolean z = pp8Var.c;
                    vs vsVar2 = this.q;
                    ((StylingImageView) (vsVar2 != null ? vsVar2 : null).c).setVisibility(z ? 0 : 8);
                    return;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
    }
}
