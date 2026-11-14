package com.opera.android;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.leanplum.internal.ResourceQualifiers;
import com.opera.android.browser.chromium.BrowserOverrides;
import defpackage.bp;
import defpackage.c1f;
import defpackage.fan;
import defpackage.i7f;
import defpackage.ks3;
import defpackage.l2c;
import defpackage.mcj;
import defpackage.mw7;
import defpackage.p2c;
import defpackage.pde;
import defpackage.pwe;
import defpackage.q2c;
import defpackage.q9n;
import defpackage.qwe;
import defpackage.s6e;
import defpackage.vj6;
import defpackage.vml;
import defpackage.x7i;
import defpackage.y7i;

/* loaded from: classes.dex */
public class RootView extends q2c implements pwe {
    public static final /* synthetic */ int D = 0;
    public boolean A;
    public boolean B;
    public boolean C;
    public mw7 c;
    public boolean d;
    public float e;
    public float f;
    public final i7f g;
    public boolean h;
    public final x7i i;
    public final qwe j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public final pde q;
    public final pde r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public final c1f x;
    public final x7i y;
    public mcj z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        byte b = 0;
        this.a = new l2c(this, this, attributeSet);
        fr frVarF = fr.f(context, attributeSet);
        this.b = frVarF;
        if (frVarF != null) {
            frVarF.e(this);
        }
        this.g = new i7f();
        this.i = new x7i(this, b);
        this.q = new pde(0);
        this.r = new pde(r9b.e);
        this.s = -16777216;
        this.t = -2013265920;
        new x7i(this, (byte) 1);
        this.y = new x7i(this, (byte) 2);
        String[] strArr = OperaApplication.K;
        this.j = ((OperaApplication) context.getApplicationContext()).B();
        setWillNotDraw(false);
        q9n.i(this);
        this.x = new c1f(this, new x7i(this, (byte) 3));
    }

    @Override // defpackage.pwe
    public final void a(bp bpVar) {
        invalidate();
        f();
    }

    @Override // defpackage.q2c
    /* renamed from: c */
    public final p2c generateLayoutParams(AttributeSet attributeSet) {
        return new y7i(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        vj6.a(this.v, this.u, getWidth() - this.w, this.u + this.o, canvas, -16777216);
        vj6.a(0.0f, getHeight() - this.p, getWidth(), getHeight(), canvas, p37.X(this.s, this.j.a.a));
        super.dispatchDraw(canvas);
        vj6.a(0.0f, 0.0f, this.v, getHeight(), canvas, -16777216);
        vj6.a(getWidth() - this.w, 0.0f, getWidth(), getHeight(), canvas, -16777216);
        vj6.a(0.0f, 0.0f, getWidth(), this.u, canvas, -16777216);
        if (this.k > 0) {
            float width = getWidth();
            float height = getHeight();
            int i = this.k;
            int i2 = this.l;
            synchronized (vj6.class) {
                Paint paint = vj6.a;
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(i2);
                if (i > 0) {
                    canvas.drawRect(0.0f, 0.0f, 0.0f + i, height, paint);
                    canvas.drawRect(width - i, 0.0f, width, height, paint);
                    float f = i;
                    float f2 = 0.0f + f;
                    canvas.drawRect(f2, 0.0f, width - f, f2, paint);
                    float f3 = i;
                    canvas.drawRect(0.0f + f3, height - f3, width - f3, height, paint);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.RootView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void e() {
        vq8 vq8Var;
        vq8 vq8Var2;
        if (s6e.b(getContext()).c() && (vq8Var2 = s6e.b(getContext()).b) != null && vq8Var2.a) {
            vq8 vq8Var3 = s6e.b(getContext()).b;
            if (!(vq8Var3 != null ? (String) vq8Var3.l : "").isEmpty()) {
                this.k = fan.a(3.0f, getResources());
                this.l = -1426063616;
                return;
            }
        }
        if (!s6e.b(getContext()).c() || (vq8Var = s6e.b(getContext()).b) == null || !vq8Var.a) {
            int i = BrowserOverrides.a;
            this.k = 0;
        } else {
            int i2 = s6e.b(getContext()).a;
            int i3 = (i2 == 0 || vep.A(i2) != 1) ? -1426128896 : -1436075337;
            this.k = fan.a(3.0f, getResources());
            this.l = i3;
        }
    }

    public final void f() {
        if (this.A || !isAttachedToWindow()) {
            return;
        }
        this.A = true;
        postOnAnimation(this.y);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        super.fitSystemWindows(new Rect(rect));
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        boolean zGatherTransparentRegion = super.gatherTransparentRegion(region);
        if (region == null) {
            return zGatherTransparentRegion;
        }
        region.op(this.v, this.u + this.o, getWidth() - this.w, getHeight() - this.p, Region.Op.INTERSECT);
        return zGatherTransparentRegion;
    }

    @Override // defpackage.q2c, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new y7i(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        g3o g3oVarG = g3o.g((View) null, windowInsets);
        d3o d3oVar = g3oVarG.a;
        if (this.m) {
            int i = Build.VERSION.SDK_INT;
            t2o t2oVar = i >= 36 ? new t2o(g3oVarG) : i >= 35 ? new s2o(g3oVarG) : i >= 34 ? new r2o(g3oVarG) : i >= 31 ? new q2o(g3oVarG) : i >= 30 ? new p2o(g3oVarG) : new o2o(g3oVarG);
            t2oVar.h(r9b.c(0, 0, 0, 0));
            g3oVarG = t2oVar.b();
        }
        r9b r9bVarA = r9b.a(g3oVarG.a.n(), this.n ? r9b.e : g3oVarG.a.i(ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL));
        int i2 = g3oVarG.a.i(519).b;
        int iMax = Math.max(0, r9bVarA.b - i2);
        int i3 = r9bVarA.d;
        int i4 = r9bVarA.a;
        int i5 = r9bVarA.c;
        if (i2 != this.o || i3 != this.p || iMax != this.u || i4 != this.v || i5 != this.w) {
            this.o = i2;
            this.p = i3;
            this.q.r(Integer.valueOf(i3));
            this.u = iMax;
            this.v = i4;
            this.w = i5;
            requestLayout();
            invalidate();
            f();
        }
        r9b r9bVarA2 = r9b.a(d3oVar.i(519), d3oVar.i(ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL));
        xf8.F0(this.r, r9b.c(Math.max(0, r9bVarA2.a - this.v), Math.max(0, (r9bVarA2.b - this.o) - this.u), Math.max(0, r9bVarA2.c - this.w), Math.max(0, r9bVarA2.d - this.p)));
        return super.onApplyWindowInsets(g3oVarG.f());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j.b.b(this);
        int i = BrowserOverrides.a;
        e();
        f();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        if (this.C || vml.b()) {
            super.onDescendantInvalidated(view, view2);
            return;
        }
        this.C = true;
        ks3.B("Invalidate from non-main thread", view2.getClass().getName());
        view2.postInvalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.y);
        this.A = false;
        this.j.b.c(this);
        int i = BrowserOverrides.a;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                y7i y7iVar = (y7i) childAt.getLayoutParams();
                int i6 = this.v + ((ViewGroup.MarginLayoutParams) y7iVar).leftMargin;
                int i7 = this.u + ((y7iVar.b & 1) == 1 ? ((ViewGroup.MarginLayoutParams) y7iVar).topMargin : ((ViewGroup.MarginLayoutParams) y7iVar).topMargin + this.o);
                childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            }
        }
    }

    @Override // defpackage.q2c, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                y7i y7iVar = (y7i) childAt.getLayoutParams();
                int i4 = this.u;
                int i5 = y7iVar.b;
                if ((i5 & 1) != 1) {
                    i4 += this.o;
                }
                if ((i5 & 2) != 2) {
                    i4 += this.p;
                }
                childAt.measure(ViewGroup.getChildMeasureSpec(i, this.v + this.w, ((ViewGroup.MarginLayoutParams) y7iVar).width), ViewGroup.getChildMeasureSpec(i2, i4, ((ViewGroup.MarginLayoutParams) y7iVar).height));
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.B || vml.b()) {
            super.requestLayout();
            return;
        }
        this.B = true;
        ks3.B("requestLayout from non-main thread", null);
        post(new x7i(this, (byte) 4));
    }
}
