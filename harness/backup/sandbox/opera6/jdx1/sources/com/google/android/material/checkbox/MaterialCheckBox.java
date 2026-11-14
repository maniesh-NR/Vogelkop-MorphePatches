package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import defpackage.fr3;
import defpackage.hn9;
import defpackage.j14;
import defpackage.lp1;
import defpackage.odd;
import defpackage.p3p;
import defpackage.pdd;
import defpackage.scd;
import defpackage.sgb;
import defpackage.wxe;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class MaterialCheckBox extends lp1 {
    public final LinkedHashSet e;
    public ColorStateList f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public final CharSequence j;
    public Drawable k;
    public Drawable l;
    public boolean m;
    public ColorStateList n;
    public ColorStateList o;
    public final PorterDuff.Mode p;
    public int q;
    public int[] r;
    public boolean s;
    public CharSequence t;
    public CompoundButton.OnCheckedChangeListener u;
    public final AnimatedVectorDrawableCompat v;
    public final odd w;
    public static final int[] x = {2130970865};
    public static final int[] y = {2130970864};
    public static final int[][] z = {new int[]{R.attr.state_enabled, 2130970864}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int A = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        ColorStateList colorStateListK;
        super(wxe.g0(context, attributeSet, 2130968998, 2132084855), attributeSet, 2130968998);
        this.e = new LinkedHashSet();
        this.v = AnimatedVectorDrawableCompat.create(getContext(), 2131232958);
        this.w = new odd(this);
        Context context2 = getContext();
        this.k = this.k;
        ColorStateList colorStateList = this.n;
        this.n = colorStateList == null ? super.getButtonTintList() != null ? super.getButtonTintList() : null : colorStateList;
        np1 np1Var = this.a;
        if (np1Var != null) {
            np1Var.a = true;
            np1Var.a();
        }
        scd.o(context2, attributeSet, 2130968998, 2132084855);
        int[] iArr = ihh.C;
        scd.r(context2, attributeSet, iArr, 2130968998, 2132084855, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130968998, 2132084855);
        ghf ghfVar = new ghf(context2, typedArrayObtainStyledAttributes);
        this.l = ghfVar.t(2);
        if (this.k != null && f03.a0(context2.getTheme(), 2130969974, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == A && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.k = sgb.F(2131232957, context2);
                this.m = true;
                if (this.l == null) {
                    this.l = sgb.F(2131232959, context2);
                }
            }
        }
        this.o = j14.K(context2, ghfVar, 3);
        this.p = hn9.q(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.g = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.h = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.i = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.j = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            e(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(10) && (colorStateListK = j14.K(context2, ghfVar, 10)) != null) {
            Drawable background = getBackground();
            background = background instanceof DrawableWrapper ? ((DrawableWrapper) background).getDrawable() : background;
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(colorStateListK);
            }
        }
        ghfVar.J();
        b();
    }

    public final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        this.k = fr3.C(this.k, this.n, getButtonTintMode());
        this.l = fr3.C(this.l, this.o, this.p);
        if (this.m) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.v;
            if (animatedVectorDrawableCompat != null) {
                odd oddVar = this.w;
                animatedVectorDrawableCompat.unregisterAnimationCallback(oddVar);
                animatedVectorDrawableCompat.registerAnimationCallback(oddVar);
            }
            Drawable drawable = this.k;
            if ((drawable instanceof AnimatedStateListDrawable) && animatedVectorDrawableCompat != null) {
                ((AnimatedStateListDrawable) drawable).addTransition(2131362311, 2131364943, animatedVectorDrawableCompat, false);
                ((AnimatedStateListDrawable) this.k).addTransition(2131363203, 2131364943, animatedVectorDrawableCompat, false);
            }
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null && (colorStateList2 = this.n) != null) {
            drawable2.setTintList(colorStateList2);
        }
        Drawable drawable3 = this.l;
        if (drawable3 != null && (colorStateList = this.o) != null) {
            drawable3.setTintList(colorStateList);
        }
        super.setButtonDrawable(fr3.v(this.k, this.l, -1, -1));
        refreshDrawableState();
    }

    public final void e(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.q != i) {
            this.q = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            g();
            if (this.s) {
                return;
            }
            this.s = true;
            LinkedHashSet linkedHashSet = this.e;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw p3p.g(it);
                }
            }
            if (this.q != 2 && (onCheckedChangeListener = this.u) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.s = false;
        }
    }

    public final void g() {
        if (Build.VERSION.SDK_INT < 30 || this.t != null) {
            return;
        }
        int i = this.q;
        super.setStateDescription(i == 1 ? getResources().getString(2132019905) : i == 0 ? getResources().getString(2132019907) : getResources().getString(2132019906));
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.k;
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
        return this.n;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.q == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.g && this.n == null && this.o == null) {
            this.g = true;
            ColorStateList colorStateList = this.f;
            if (colorStateList == null) {
                int iX = fr3.X(getContext(), f03.d0(2130969108, this));
                int iX2 = fr3.X(getContext(), f03.d0(2130969119, this));
                int iX3 = fr3.X(getContext(), f03.d0(2130969325, this));
                int iX4 = fr3.X(getContext(), f03.d0(2130969284, this));
                ColorStateList colorStateList2 = new ColorStateList(z, new int[]{fr3.R(1.0f, iX3, iX2), fr3.R(1.0f, iX3, iX), fr3.R(0.54f, iX3, iX4), fr3.R(0.38f, iX3, iX4), fr3.R(0.38f, iX3, iX4)});
                this.f = colorStateList2;
                colorStateList = colorStateList2;
            }
            setButtonTintList(colorStateList);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.q == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, x);
        }
        if (this.i) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, y);
        }
        this.r = fr3.J(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.h || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo == null || !this.i) {
            return;
        }
        accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.j));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof pdd)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        pdd pddVar = (pdd) parcelable;
        super.onRestoreInstanceState(pddVar.getSuperState());
        e(pddVar.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        pdd pddVar = new pdd(super.onSaveInstanceState());
        pddVar.a = this.q;
        return pddVar;
    }

    @Override // defpackage.lp1, android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(sgb.F(i, getContext()));
    }

    @Override // defpackage.lp1, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.k = drawable;
        this.m = false;
        b();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.n == colorStateList) {
            return;
        }
        this.n = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        np1 np1Var = this.a;
        if (np1Var != null) {
            np1Var.e = mode;
            np1Var.b = true;
            np1Var.a();
        }
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z2) {
        e(z2 ? 1 : 0);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.u = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final void setStateDescription(CharSequence charSequence) {
        this.t = charSequence;
        if (charSequence == null) {
            g();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        e(!isChecked() ? 1 : 0);
    }
}
