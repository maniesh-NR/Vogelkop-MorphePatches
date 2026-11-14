package com.opera.android.bar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.ap3;
import defpackage.atj;
import defpackage.c1f;
import defpackage.dll;
import defpackage.fan;
import defpackage.i0l;
import defpackage.io3;
import defpackage.kze;
import defpackage.nje;
import defpackage.no3;
import defpackage.q9n;
import defpackage.qvk;
import defpackage.u7;
import defpackage.u8n;
import defpackage.va2;
import defpackage.z61;
import defpackage.zo3;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class BottomBar extends LinearLayout {
    public static final boolean r = i0l.g();
    public final io3 a;
    public c1f b;
    public ap3 c;
    public final qvk d;
    public boolean e;
    public boolean f;
    public View g;
    public View h;
    public View i;
    public final Paint j;
    public boolean k;
    public final Paint l;
    public final int m;
    public final int n;
    public final kze o;
    public final kze p;
    public atj q;

    public BottomBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = new io3(this);
        this.j = new Paint();
        this.k = true;
        this.l = new Paint(1);
        this.o = new kze(0);
        this.p = new kze(0);
        this.d = new qvk(context);
        this.c = new ap3(new zo3(f03.W(2130969093, context).getDefaultColor()), true, false);
        setWillNotDraw(false);
        if (r) {
            this.m = getResources().getDimensionPixelSize(2131167202);
            u7 u7Var = new u7(this, (byte) 18);
            dll dllVarS = q9n.s(this);
            if (dllVarS != null) {
                u8n.b(dllVarS, this, u7Var);
            }
            u7Var.a(this);
        } else {
            this.m = 0;
        }
        this.n = getResources().getDimensionPixelSize(2131167744);
        va2 va2Var = new va2(this, (byte) 20);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(this, va2Var);
    }

    public void a(int i) {
        View view = this.g;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void b(boolean z) {
    }

    public int c() {
        return 0;
    }

    public final int d() {
        int height = 0;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ("floater".equals(childAt.getTag()) && childAt.getVisibility() == 0) {
                height = childAt.getHeight() + height;
            }
        }
        return height;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f) {
            return false;
        }
        if (motionEvent.getAction() != 0 || motionEvent.getY() <= getHeight() - getPaddingBottom()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        if (this.k) {
            int i = this.c.a.a;
            Paint paint = this.j;
            paint.setColor(i);
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - getPaddingBottom(), getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        super.draw(canvas2);
        if (r) {
            canvas2.drawRect(getLayoutDirection() == 1 ? getWidth() - this.m : 0, this.n, r14 + r2, getHeight(), this.l);
        }
    }

    public View e(nje njeVar) {
        return null;
    }

    public int f() {
        View view = this.g;
        if (view != null) {
            return Math.round(view.getTranslationY());
        }
        return 0;
    }

    public void g() {
        z61 z61Var = new z61();
        if (isAttachedToWindow()) {
            z61Var.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(z61Var);
    }

    public void h() {
        this.g = findViewById(2131364845);
        this.h = findViewById(2131364846);
        this.i = findViewById(2131362176);
        m();
    }

    public void i(no3 no3Var) {
    }

    public final void j(int i) {
        int iMax = Math.max(0, Math.min(i, (getHeight() - getPaddingBottom()) - d()));
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ("floater".equals(childAt.getTag())) {
                childAt.setTranslationY(iMax);
            }
        }
    }

    public final void k() {
        m();
        int iC = c();
        kze kzeVar = this.p;
        if (iC != ((Integer) kzeVar.g()).intValue()) {
            kzeVar.r(Integer.valueOf(iC));
        }
    }

    public void l(int i) {
        View view = this.g;
        if (view != null) {
            view.setTranslationY(i);
        }
        this.i.setTranslationY(i);
        j(i);
        m();
    }

    public final void m() {
        int iC = c();
        View view = this.g;
        int iW = 0;
        if (view != null && view.getVisibility() == 0) {
            Context context = getContext();
            iW = f03.w(2130971212, context, 0) + fan.a(1.0f, context.getResources());
        }
        xf8.G0(this.o, Integer.valueOf((iW + iC) - f()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        atj atjVarK;
        super.onAttachedToWindow();
        a(this.c.a.a);
        Object tag = getTag(2131364495);
        if (tag != null) {
            atjVarK = (atj) tag;
        } else {
            Object parent = getParent();
            View view = parent instanceof View ? (View) parent : null;
            atjVarK = view != null ? xug.k(view) : null;
        }
        this.q = atjVarK;
        if (atjVarK != null) {
            g();
        }
        c1f c1fVarC = c1f.c(this);
        this.b = c1fVarC;
        if (c1fVarC != null) {
            c1fVarC.d(this.a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (this.q != null) {
            this.q = null;
        }
        super.onDetachedFromWindow();
        c1f c1fVar = this.b;
        if (c1fVar != null) {
            c1fVar.g(this.a);
            this.b = null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            View view = this.g;
            this.e = view == null || view.getVisibility() != 0 || motionEvent.getY() > ((float) this.g.getBottom());
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.e = false;
        }
        if (this.e && this.d.a(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        return this.e ? zOnTouchEvent | this.d.a(motionEvent) : zOnTouchEvent;
    }
}
