package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.afc;
import defpackage.ptd;
import defpackage.pud;
import defpackage.r5n;
import defpackage.scd;
import defpackage.zec;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends afc implements pud {
    public static final int[] C = {R.attr.state_checked};
    public ptd A;
    public final ja3 B;
    public Drawable p;
    public final Rect q;
    public final Rect r;
    public int s;
    public final boolean t;
    public boolean u;
    public final int v;
    public boolean w;
    public final boolean x;
    public final CheckedTextView y;
    public FrameLayout z;

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.q = new Rect();
        this.r = new Rect();
        this.s = 119;
        this.t = true;
        this.u = false;
        scd.o(context, attributeSet, 0, 0);
        int[] iArr = ihh.s;
        scd.r(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.s = typedArrayObtainStyledAttributes.getInt(1, this.s);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.t = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
        this.x = true;
        ja3 ja3Var = new ja3(this, (byte) 5);
        this.B = ja3Var;
        setOrientation(0);
        LayoutInflater.from(context).inflate(2131558659, (ViewGroup) this, true);
        this.v = context.getResources().getDimensionPixelSize(2131165575);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(2131362517);
        this.y = checkedTextView;
        r5n.l(checkedTextView, ja3Var);
    }

    @Override // defpackage.pud
    public final void d(ptd ptdVar) {
        StateListDrawable stateListDrawable;
        this.A = ptdVar;
        int i = ptdVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(ptdVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(2130969109, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(C, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        boolean zIsCheckable = ptdVar.isCheckable();
        refreshDrawableState();
        boolean z = this.w;
        CheckedTextView checkedTextView = this.y;
        if (z != zIsCheckable) {
            this.w = zIsCheckable;
            this.B.h(checkedTextView, 2048);
        }
        boolean zIsChecked = ptdVar.isChecked();
        refreshDrawableState();
        checkedTextView.setChecked(zIsChecked);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (zIsChecked && this.x) ? 1 : 0);
        setEnabled(ptdVar.isEnabled());
        checkedTextView.setText(ptdVar.e);
        Drawable icon = ptdVar.getIcon();
        if (icon != null) {
            int i2 = this.v;
            icon.setBounds(0, 0, i2, i2);
        }
        checkedTextView.setCompoundDrawablesRelative(icon, null, null, null);
        View actionView = ptdVar.getActionView();
        if (actionView != null) {
            if (this.z == null) {
                this.z = (FrameLayout) ((ViewStub) findViewById(2131362516)).inflate();
            }
            if (actionView.getParent() != null) {
                ((ViewGroup) actionView.getParent()).removeView(actionView);
            }
            this.z.removeAllViews();
            this.z.addView(actionView);
        }
        setContentDescription(ptdVar.q);
        setTooltipText(ptdVar.r);
        ptd ptdVar2 = this.A;
        if (ptdVar2.e == null && ptdVar2.getIcon() == null && this.A.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.z;
            if (frameLayout != null) {
                zec zecVar = (zec) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) zecVar).width = -1;
                this.z.setLayoutParams(zecVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.z;
        if (frameLayout2 != null) {
            zec zecVar2 = (zec) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) zecVar2).width = -2;
            this.z.setLayoutParams(zecVar2);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.p;
        if (drawable != null) {
            if (this.u) {
                this.u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.t;
                Rect rect = this.q;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.r;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.p.setState(getDrawableState());
    }

    @Override // android.view.View
    public final Drawable getForeground() {
        return this.p;
    }

    @Override // android.view.View
    public final int getForegroundGravity() {
        return this.s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // defpackage.pud
    public final ptd k() {
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        ptd ptdVar = this.A;
        if (ptdVar != null && ptdVar.isCheckable() && this.A.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // defpackage.afc, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.u |= z;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.u = true;
    }

    @Override // android.view.View
    public final void setForeground(Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.p);
            }
            this.p = drawable;
            this.u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setForegroundGravity(int i) {
        if (this.s != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.s = i;
            if (i == 119 && this.p != null) {
                this.p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }
}
