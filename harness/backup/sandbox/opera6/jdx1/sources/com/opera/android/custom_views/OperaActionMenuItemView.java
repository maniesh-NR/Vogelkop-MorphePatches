package com.opera.android.custom_views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.ke;
import defpackage.l5b;
import defpackage.oe;
import defpackage.ptd;
import defpackage.pud;
import defpackage.qe;
import defpackage.yq1;
import defpackage.zhh;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class OperaActionMenuItemView extends yq1 implements pud, View.OnClickListener, oe {
    public static final /* synthetic */ int r = 0;
    public ptd h;
    public CharSequence i;
    public Drawable j;
    public qe k;
    public ke l;
    public u59 m;
    public boolean n;
    public final int o;
    public int p;
    public final int q;

    public OperaActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.n = t();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zhh.c, 0, 0);
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.p = -1;
        setSaveEnabled(false);
        lzb lzbVar = new lzb(this, (byte) 29);
        l5b l5bVar = q9n.c;
        dll dllVarV = hjf.v(getContext());
        if (dllVarV == null) {
            return;
        }
        u8n.b(dllVarV, this, lzbVar);
    }

    @Override // defpackage.pud
    public final void d(ptd ptdVar) {
        this.h = ptdVar;
        Drawable icon = ptdVar.getIcon();
        this.j = icon;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i = this.q;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            icon.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(icon, null, null, null);
        u();
        this.i = ptdVar.getTitleCondensed();
        u();
        setId(ptdVar.a);
        setVisibility(ptdVar.isVisible() ? 0 : 8);
        setEnabled(ptdVar.isEnabled());
        if (ptdVar.hasSubMenu() && this.l == null) {
            this.l = new ke(this);
        }
        setBackground(f03.x(s() ? 2130970694 : 2130968581, getContext()));
    }

    @Override // defpackage.oe
    public final boolean e() {
        return s();
    }

    @Override // defpackage.oe
    public final boolean g() {
        return s() && this.h.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.pud
    public final ptd k() {
        return this.h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qe qeVar = this.k;
        if (qeVar != null) {
            qeVar.p.q(this.h, null, 0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.n = t();
        u();
    }

    @Override // defpackage.yq1, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zS = s();
        if (zS && (i3 = this.p) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.o;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zS || this.j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ke keVar;
        if (this.h.hasSubMenu() && (keVar = this.l) != null && keVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean s() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.p = i;
        super.setPadding(i, i2, i3, i4);
    }

    public final boolean t() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void u() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.i);
        if (this.j != null && ((this.h.y & 4) != 4 || !this.n)) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.i : null);
        CharSequence charSequence = this.h.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.h.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.h.r;
        if (TextUtils.isEmpty(charSequence2)) {
            setTooltipText(z3 ? null : this.h.e);
        } else {
            setTooltipText(charSequence2);
        }
    }
}
