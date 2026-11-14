package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.ab5;
import defpackage.fr3;
import defpackage.hn9;
import defpackage.scd;
import defpackage.wxe;

/* loaded from: classes.dex */
public class MaterialSwitch extends SwitchCompat {
    public static final int[] j0 = {2130970869};
    public Drawable T;
    public Drawable U;
    public final int V;
    public Drawable W;
    public Drawable a0;
    public ColorStateList b0;
    public final ColorStateList c0;
    public final PorterDuff.Mode d0;
    public ColorStateList e0;
    public final ColorStateList f0;
    public final PorterDuff.Mode g0;
    public int[] h0;
    public int[] i0;

    public MaterialSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(wxe.g0(context, attributeSet, 2130970291, 2132084596), attributeSet, 2130970291);
        this.V = -1;
        Context context2 = getContext();
        this.T = this.a;
        this.b0 = this.b;
        super.j(null);
        this.W = this.f;
        this.e0 = this.g;
        super.l(null);
        scd.o(context2, attributeSet, 2130970291, 2132084596);
        int[] iArr = ihh.H;
        scd.r(context2, attributeSet, iArr, 2130970291, 2132084596, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130970291, 2132084596);
        ghf ghfVar = new ghf(context2, typedArrayObtainStyledAttributes);
        this.U = ghfVar.t(0);
        this.V = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        this.c0 = ghfVar.s(2);
        int i = typedArrayObtainStyledAttributes.getInt(3, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.d0 = hn9.q(i, mode);
        this.a0 = ghfVar.t(4);
        this.f0 = ghfVar.s(5);
        this.g0 = hn9.q(typedArrayObtainStyledAttributes.getInt(6, -1), mode);
        ghfVar.J();
        this.H = false;
        invalidate();
        n();
        o();
    }

    public static void p(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(ab5.d(f, colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0)));
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public final void i(Drawable drawable) {
        this.T = drawable;
        n();
    }

    @Override // android.view.View
    public final void invalidate() {
        q();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public final void j(ColorStateList colorStateList) {
        this.b0 = colorStateList;
        n();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public final void k(Drawable drawable) {
        this.W = drawable;
        o();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public final void l(ColorStateList colorStateList) {
        this.e0 = colorStateList;
        o();
    }

    public final void n() {
        this.T = fr3.C(this.T, this.b0, this.c);
        this.U = fr3.C(this.U, this.c0, this.d0);
        q();
        Drawable drawable = this.T;
        Drawable drawable2 = this.U;
        int i = this.V;
        super.i(fr3.v(drawable, drawable2, i, i));
        refreshDrawableState();
    }

    public final void o() {
        this.W = fr3.C(this.W, this.e0, this.h);
        this.a0 = fr3.C(this.a0, this.f0, this.g0);
        q();
        Drawable layerDrawable = this.W;
        Drawable drawable = this.a0;
        if (layerDrawable == null) {
            layerDrawable = drawable;
        } else if (drawable != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.W, this.a0});
        }
        if (layerDrawable != null) {
            this.l = layerDrawable.getIntrinsicWidth();
            requestLayout();
        }
        super.k(layerDrawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.U != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, j0);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : iArrOnCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.h0 = iArr;
        this.i0 = fr3.J(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        FocusRingDrawable focusRingDrawableC;
        super.onLayout(z, i, i2, i3, i4);
        if (this.W == null || (focusRingDrawableC = FocusRingDrawable.c(getBackground())) == null) {
            return;
        }
        focusRingDrawableC.mutate();
        focusRingDrawableC.o.w = this.W.getBounds();
    }

    public final void q() {
        ColorStateList colorStateList = this.b0;
        ColorStateList colorStateList2 = this.f0;
        ColorStateList colorStateList3 = this.c0;
        if (colorStateList == null && colorStateList3 == null && this.e0 == null && colorStateList2 == null) {
            return;
        }
        float f = this.z;
        if (colorStateList != null) {
            p(this.T, colorStateList, this.h0, this.i0, f);
        }
        if (colorStateList3 != null) {
            p(this.U, colorStateList3, this.h0, this.i0, f);
        }
        ColorStateList colorStateList4 = this.e0;
        if (colorStateList4 != null) {
            p(this.W, colorStateList4, this.h0, this.i0, f);
        }
        if (colorStateList2 != null) {
            p(this.a0, colorStateList2, this.h0, this.i0, f);
        }
    }
}
