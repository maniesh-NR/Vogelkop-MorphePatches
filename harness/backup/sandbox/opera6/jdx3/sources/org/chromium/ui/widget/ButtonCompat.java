package org.chromium.ui.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.ContextThemeWrapper;
import defpackage.qhh;
import defpackage.rma;

/* loaded from: classes.dex */
public class ButtonCompat extends jp1 {
    public ButtonCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2132083218);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ButtonCompat(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        float[] fArr;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        super(new ContextThemeWrapper(context, i), attributeSet, R.attr.buttonStyle);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, qhh.a, R.attr.buttonStyle, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 2131099842);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(6, -1);
        resourceId2 = resourceId2 == -1 ? getContext().getColor(resourceId) == 0 ? 2131103819 : 2131100200 : resourceId2;
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(0, R.color.transparent);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(2, 2131165548);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, getResources().getDimensionPixelSize(2131165361));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(1, 0);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, getResources().getDimensionPixelSize(2131165362));
        int dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize5);
        int dimensionPixelSize7 = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize5);
        int dimensionPixelSize8 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize5);
        int dimensionPixelSize9 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, dimensionPixelSize5);
        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(4, -1);
        if (resourceId5 != -1) {
            setTextColor(getContext().getColorStateList(resourceId5));
        }
        if (getLayoutDirection() == 1) {
            float f = dimensionPixelSize7;
            float f2 = dimensionPixelSize6;
            float f3 = dimensionPixelSize8;
            float f4 = dimensionPixelSize9;
            fArr = new float[]{f, f, f2, f2, f3, f3, f4, f4};
        } else {
            float f5 = dimensionPixelSize6;
            float f6 = dimensionPixelSize7;
            float f7 = dimensionPixelSize9;
            float f8 = dimensionPixelSize8;
            fArr = new float[]{f5, f5, f6, f6, f7, f7, f8, f8};
        }
        typedArrayObtainStyledAttributes.recycle();
        ColorStateList colorStateList = getContext().getColorStateList(resourceId3);
        int dimensionPixelSize10 = getResources().getDimensionPixelSize(resourceId4);
        ColorStateList colorStateList2 = getContext().getColorStateList(resourceId2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(fArr);
        if (dimensionPixelSize10 > 0) {
            gradientDrawable.setStroke(dimensionPixelSize10, colorStateList);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadii(fArr);
        gradientDrawable2.setStroke(dimensionPixelSize10, 0);
        Drawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadii(fArr);
        gradientDrawable3.setColor(-1);
        int[][] iArr = {rma.m, StateSet.NOTHING};
        int colorForState = colorStateList2.getColorForState(rma.n, colorStateList2.getDefaultColor());
        int iL = ab5.l(colorForState, Math.min(Color.alpha(colorForState) << 1, 255));
        int colorForState2 = colorStateList2.getColorForState(rma.l, colorStateList2.getDefaultColor());
        setBackground(new RippleDrawable(new ColorStateList(iArr, new int[]{iL, ab5.l(colorForState2, Math.min(Color.alpha(colorForState2) << 1, 255))}), dimensionPixelSize3 != 0 ? new InsetDrawable(layerDrawable, dimensionPixelSize4, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize3) : layerDrawable, gradientDrawable3));
        ColorStateList colorStateList3 = getContext().getColorStateList(resourceId);
        if (colorStateList3 != null) {
            gradientDrawable.setColor(colorStateList3);
        }
        if (i2 == 1) {
            dimensionPixelSize2 = getResources().getDimensionPixelSize(2131165523);
            dimensionPixelSize = getResources().getDimensionPixelSize(2131165524);
        } else {
            dimensionPixelSize = 0;
            dimensionPixelSize2 = 0;
        }
        if (dimensionPixelSize2 > 0) {
            gradientDrawable.setStroke(dimensionPixelSize10, colorStateList, dimensionPixelSize2, dimensionPixelSize);
        } else {
            gradientDrawable.setStroke(dimensionPixelSize10, colorStateList);
        }
    }
}
