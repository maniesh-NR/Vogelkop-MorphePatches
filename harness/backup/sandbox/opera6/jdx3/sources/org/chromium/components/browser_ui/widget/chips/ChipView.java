package org.chromium.components.browser_ui.widget.chips;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.rma;
import org.chromium.ui.widget.LoadingView;

/* loaded from: classes.dex */
public class ChipView extends LinearLayout {
    public final rma a;
    public final yq1 b;
    public final AppCompatImageView c;
    public final LinearLayout d;
    public final int e;

    public ChipView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(new ContextThemeWrapper(context, 2132083613), attributeSet, 2130969035, 0);
        this.e = Integer.MAX_VALUE;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, phh.b, 2130969035, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, getResources().getDimensionPixelSize(2131165452));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, getResources().getDimensionPixelSize(2131165450));
        getResources().getDimensionPixelSize(2131165449);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(13, getResources().getDimensionPixelSize(2131165426));
        typedArrayObtainStyledAttributes.getDimensionPixelSize(12, getResources().getDimensionPixelSize(2131165425));
        int i = typedArrayObtainStyledAttributes.getBoolean(26, false) ? 2131165435 : 2131165420;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 2131099897);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(6, 2131099911);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(24, 2131099910);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(7, 2131099918);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, getContext().getResources().getDimensionPixelSize(2131165421));
        int dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, getResources().getDimensionPixelSize(2131165427));
        int dimensionPixelSize7 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, getResources().getDimensionPixelSize(2131165427));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(29, false);
        boolean z2 = typedArrayObtainStyledAttributes.getInteger(28, 0) == 1;
        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(22, 2132083690);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(14, getResources().getDimensionPixelSize(2131165427));
        typedArrayObtainStyledAttributes.getDimensionPixelSize(11, getResources().getDimensionPixelSize(2131165427));
        typedArrayObtainStyledAttributes.getResourceId(25, 2132083690);
        int dimensionPixelSize8 = typedArrayObtainStyledAttributes.getDimensionPixelSize(30, getResources().getDimensionPixelSize(2131165419));
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        int dimensionPixelSize9 = typedArrayObtainStyledAttributes.getDimensionPixelSize(21, getResources().getDimensionPixelSize(2131165448));
        int i2 = i;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(27, false);
        int dimensionPixelSize10 = typedArrayObtainStyledAttributes.getDimensionPixelSize(23, getResources().getDimensionPixelSize(2131165434));
        int dimensionPixelSize11 = typedArrayObtainStyledAttributes.getDimensionPixelSize(20, getResources().getDimensionPixelSize(2131165430));
        View appCompatImageView = new AppCompatImageView(getContext());
        this.c = appCompatImageView;
        appCompatImageView.setId(2131362323);
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize6, dimensionPixelSize7));
        addView(appCompatImageView);
        int dimensionPixelOffset = z ? (getResources().getDimensionPixelOffset(2131165422) - dimensionPixelSize7) / 2 : dimensionPixelSize;
        int i3 = (dimensionPixelSize7 - dimensionPixelSize11) / 2;
        int i4 = (dimensionPixelSize6 - dimensionPixelSize11) / 2;
        LoadingView loadingView = new LoadingView(getContext());
        loadingView.setId(2131362320);
        loadingView.setVisibility(8);
        loadingView.setIndeterminateTintList(ColorStateList.valueOf(getContext().getColor(2131100024)));
        loadingView.setPaddingRelative(i4, i3, i4, i3);
        addView(loadingView, new LinearLayout.LayoutParams(dimensionPixelSize6, dimensionPixelSize7));
        setPaddingRelative(dimensionPixelOffset, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        yq1 yq1Var = new yq1(new ContextThemeWrapper(getContext(), 2132083116), (AttributeSet) null);
        this.b = yq1Var;
        yq1Var.setId(2131362321);
        yq1Var.setTextAppearance(resourceId5);
        CharSequence text = typedArrayObtainStyledAttributes.getText(0);
        if (!TextUtils.isEmpty(text)) {
            yq1Var.setText(text);
        }
        yq1Var.setIncludeFontPadding(!z2);
        yq1Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        if (z3) {
            yq1Var.setMaxLines(2);
            yq1Var.setPaddingRelative(yq1Var.getPaddingStart(), dimensionPixelSize9, yq1Var.getPaddingEnd(), dimensionPixelSize9);
        }
        if (z4) {
            yq1Var.setTextAlignment(5);
        }
        yq1Var.setPaddingRelative(dimensionPixelSize10, yq1Var.getPaddingTop(), yq1Var.getPaddingEnd(), yq1Var.getPaddingBottom());
        if (z2) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setId(2131362324);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            this.d = linearLayout;
            linearLayout.addView(yq1Var);
            addView(linearLayout);
        } else {
            addView(yq1Var);
        }
        float f = dimensionPixelSize5;
        rma rmaVar = new rma(this, resourceId, resourceId3, new float[]{f, f, f, f, f, f, f, f}, resourceId4, i2, dimensionPixelSize8, typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0));
        ColorStateList colorStateList = getContext().getColorStateList(resourceId2);
        if (colorStateList != ((ColorStateList) rmaVar.f)) {
            rmaVar.f = colorStateList;
            ((GradientDrawable) rmaVar.h).setColor(colorStateList);
        }
        this.a = rmaVar;
        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(16, 0);
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(18);
        if (resourceId6 != 0) {
            Drawable drawableF = sgb.F(resourceId6, getContext());
            if (drawableF != null && colorStateList2 != null) {
                drawableF.setTintList(colorStateList2);
            }
            boolean z5 = colorStateList2 == null;
            if (drawableF == null) {
                appCompatImageView.setVisibility(8);
            } else {
                appCompatImageView.setVisibility(0);
                if (z5) {
                    drawableF.setTintList(yq1Var.getTextColors());
                }
                appCompatImageView.setImageDrawable(drawableF);
            }
        } else {
            appCompatImageView.setVisibility(8);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int i3 = this.e;
        if (measuredWidth > i3) {
            yq1 yq1Var = this.b;
            LinearLayout linearLayout = this.d;
            int measuredWidth2 = (linearLayout == null ? yq1Var.getMeasuredWidth() : linearLayout.getMeasuredWidth()) - (getMeasuredWidth() - i3);
            if (measuredWidth2 > 0) {
                yq1Var.setMaxWidth(measuredWidth2);
                yq1Var.setEllipsize(TextUtils.TruncateAt.END);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        ((GradientDrawable) this.a.g).setColor(i);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        rma rmaVar = this.a;
        if (colorStateList == ((ColorStateList) rmaVar.d)) {
            return;
        }
        rmaVar.d = colorStateList;
        ((GradientDrawable) rmaVar.g).setColor(colorStateList);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setEnabled(z);
        this.c.setEnabled(z);
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
    }
}
