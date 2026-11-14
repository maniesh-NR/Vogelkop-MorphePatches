package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import defpackage.fr3;
import defpackage.ic4;
import defpackage.j14;
import defpackage.scd;
import defpackage.wxe;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] a0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public final Integer S;
    public final boolean T;
    public final boolean U;
    public final ImageView.ScaleType V;
    public final Boolean W;

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(wxe.g0(context, attributeSet, 2130971164, 2132084931), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayA0 = scd.a0(context2, attributeSet, ihh.K, 2130971164, 2132084931, new int[0]);
        if (typedArrayA0.hasValue(2)) {
            this.S = Integer.valueOf(typedArrayA0.getColor(2, -1));
            Drawable drawableQ = q();
            if (drawableQ != null) {
                A(drawableQ);
            }
        }
        this.T = typedArrayA0.getBoolean(6, false);
        this.U = typedArrayA0.getBoolean(5, false);
        int i = typedArrayA0.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = a0;
            if (i < scaleTypeArr.length) {
                this.V = scaleTypeArr[i];
            }
        }
        if (typedArrayA0.hasValue(0)) {
            this.W = Boolean.valueOf(typedArrayA0.getBoolean(0, false));
        }
        typedArrayA0.recycle();
        saj sajVarI = saj.j(context2, attributeSet, 2130971164, 2132084931).i();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : fr3.N(background);
        if (colorStateListValueOf != null) {
            zdd zddVar = new zdd(sajVarI);
            zddVar.u(colorStateListValueOf);
            zddVar.q(context2);
            zddVar.t(getElevation());
            setBackground(zddVar);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void A(Drawable drawable) {
        Integer num;
        if (drawable != null && (num = this.S) != null) {
            drawable = drawable.mutate();
            drawable.setTint(num.intValue());
        }
        super.A(drawable);
    }

    public final void H(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zdd background = getBackground();
        if (background instanceof zdd) {
            ic4.K(this, background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        w8l w8lVar = j14.u;
        int i5 = 0;
        ImageView imageView2 = null;
        boolean z2 = this.U;
        boolean z3 = this.T;
        if (z3 || z2) {
            ArrayList arrayListV = j14.V(this, this.w);
            TextView textView = arrayListV.isEmpty() ? null : (TextView) Collections.min(arrayListV, w8lVar);
            ArrayList arrayListV2 = j14.V(this, this.x);
            TextView textView2 = arrayListV2.isEmpty() ? null : (TextView) Collections.max(arrayListV2, w8lVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (z3 && textView != null) {
                    H(textView, pair);
                }
                if (z2 && textView2 != null) {
                    H(textView2, pair);
                }
            }
        }
        AppCompatImageView appCompatImageView = this.d;
        Drawable drawable2 = appCompatImageView != null ? appCompatImageView.getDrawable() : null;
        if (drawable2 != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(drawable2.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.W;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.V;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        zdd background = getBackground();
        if (background instanceof zdd) {
            background.t(f);
        }
    }
}
