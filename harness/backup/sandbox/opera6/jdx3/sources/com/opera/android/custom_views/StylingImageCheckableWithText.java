package com.opera.android.custom_views;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.aqj;
import defpackage.h4i;
import defpackage.khh;
import defpackage.lf1;
import defpackage.lxe;
import defpackage.ojk;
import defpackage.ov0;
import defpackage.pjk;
import defpackage.ug5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/opera/android/custom_views/StylingImageCheckableWithText;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/Checkable;", "pjk", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StylingImageCheckableWithText extends ConstraintLayout implements Checkable {
    public static final int[] x = {R.attr.state_checked};
    public final ov0 p;
    public ValueAnimator q;
    public ValueAnimator r;
    public int s;
    public boolean t;
    public boolean u;
    public int v;
    public pjk w;

    /* JADX WARN: Multi-variable type inference failed */
    public StylingImageCheckableWithText(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(2131558596, (ViewGroup) this);
        int i = 2131362307;
        AppCompatImageView appCompatImageView = (StylingImageView) w1h.j(2131362307, this);
        if (appCompatImageView != null) {
            i = 2131363485;
            TextView textView = (TextView) w1h.j(2131363485, this);
            if (textView != null) {
                this.p = new ov0((View) this, (Object) appCompatImageView, (Object) textView, (byte) 8);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.M, 0, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0);
                Integer numValueOf = resourceId == 0 ? null : Integer.valueOf(resourceId);
                if (numValueOf != null) {
                    appCompatImageView.setImageResource(numValueOf.intValue());
                }
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(2, 0);
                Integer numValueOf2 = resourceId2 != 0 ? Integer.valueOf(resourceId2) : null;
                if (numValueOf2 != null) {
                    appCompatImageView.setBackgroundResource(numValueOf2.intValue());
                }
                ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(4);
                if (colorStateList != null) {
                    appCompatImageView.setImageTintList(colorStateList);
                }
                String string = typedArrayObtainStyledAttributes.getString(1);
                if (string != null) {
                    textView.setText(string);
                }
                ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(0);
                if (colorStateList2 != null) {
                    textView.setTextColor(colorStateList2);
                }
                typedArrayObtainStyledAttributes.recycle();
                setOnClickListener(new h4i((Object) this, (byte) 14));
                return;
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] onCreateDrawableState(int i) {
        return this.u ? View.mergeDrawableStates(super/*android.view.View*/.onCreateDrawableState(i + 1), x) : super/*android.view.View*/.onCreateDrawableState(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int size = View.MeasureSpec.getSize(i);
            int dimensionPixelSize = getResources().getDimensionPixelSize(2131167615);
            ov0 ov0Var = this.p;
            AppCompatImageView appCompatImageView = (StylingImageView) ov0Var.c;
            TextView textView = (TextView) ov0Var.d;
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            int marginStart = dimensionPixelSize + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            ViewGroup.LayoutParams layoutParams2 = ((StylingImageView) ov0Var.c).getLayoutParams();
            int marginEnd = marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            int marginStart2 = marginEnd + (layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart() : 0);
            ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
            this.v = size - (marginStart2 + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd() : 0));
        }
    }

    public final void r() {
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.q = null;
        ValueAnimator valueAnimator2 = this.r;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.r = null;
        this.t = false;
    }

    public final void s() {
        r();
        ov0 ov0Var = this.p;
        ((TextView) ov0Var.d).setVisibility(8);
        TextView textView = (TextView) ov0Var.d;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = 0;
        textView.setLayoutParams(layoutParams);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (z != this.u) {
            this.u = z;
            boolean z2 = this.t;
            ov0 ov0Var = this.p;
            if (z) {
                if (z2) {
                    s();
                } else {
                    r();
                    this.t = true;
                    if (this.s == 0) {
                        ((TextView) ov0Var.d).measure(0, 0);
                        this.s = ((TextView) ov0Var.d).getMeasuredWidth();
                    }
                    ((TextView) ov0Var.d).setVisibility(0);
                    int iMin = Math.min(this.s, this.v);
                    ValueAnimator valueAnimatorT = t(0, iMin, new ug5(this, iMin, (byte) 3), true);
                    this.q = valueAnimatorT;
                    valueAnimatorT.start();
                }
            } else if (z2) {
                s();
            }
            ((StylingImageCheckableWithText) ov0Var.b).postOnAnimation(new ojk(this, (byte) 0));
            pjk pjkVar = this.w;
            if (pjkVar != null) {
                pjkVar.c(z);
            }
        }
    }

    public final ValueAnimator t(int i, int i2, Function0 function0, boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(z ? lf1.d : lf1.a);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new lxe(i, i2, this));
        valueAnimatorOfFloat.addListener(new aqj(function0, (byte) 1));
        return valueAnimatorOfFloat;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.u);
    }

    public final void u(boolean z) {
        this.u = z;
        ((StylingImageCheckableWithText) this.p.b).postOnAnimation(new ojk(this, (byte) 1));
    }
}
