package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.awk;
import defpackage.fhh;
import defpackage.kle;
import defpackage.r5n;
import defpackage.u05;
import defpackage.vvk;
import defpackage.x05;
import defpackage.xvk;
import defpackage.yvk;
import defpackage.zvk;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements mle, lle, kle {
    public static final int[] I = {R.attr.enabled};
    public xvk A;
    public yvk B;
    public yvk C;
    public boolean D;
    public final int E;
    public final vvk F;
    public final xvk G;
    public final xvk H;
    public View a;
    public zvk b;
    public boolean c;
    public final int d;
    public final float e;
    public float f;
    public final fr g;
    public final s14 h;
    public final int[] i;
    public final int[] j;
    public final int[] k;
    public boolean l;
    public final int m;
    public int n;
    public float o;
    public float p;
    public boolean q;
    public int r;
    public final DecelerateInterpolator s;
    public final h05 t;
    public int u;
    public int v;
    public final int w;
    public final int x;
    public final x05 y;
    public xvk z;

    public SwipeRefreshLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        this.e = -1.0f;
        this.i = new int[2];
        this.j = new int[2];
        this.k = new int[2];
        this.r = -1;
        this.u = -1;
        this.F = new vvk(this, (byte) 0);
        this.G = new xvk(this, (byte) 2);
        this.H = new xvk(this, (byte) 3);
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.s = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = (int) (displayMetrics.density * 40.0f);
        this.E = i;
        h05 h05Var = new h05(getContext());
        float f = h05Var.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = h05Var.getContext().obtainStyledAttributes(fhh.a);
        h05Var.b = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = r5n.a;
        h05Var.setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(h05Var.b);
        h05Var.setBackground(shapeDrawable);
        this.t = h05Var;
        x05 x05Var = new x05(getContext());
        this.y = x05Var;
        x05Var.d(1);
        this.t.setImageDrawable(this.y);
        this.t.setVisibility(8);
        addView(this.t);
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.x = i2;
        this.e = i2;
        this.g = new fr((byte) 17, false);
        this.h = new s14(this);
        setNestedScrollingEnabled(true);
        int i3 = -i;
        this.n = i3;
        this.w = i3;
        j(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, I);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final boolean a() {
        View view = this.a;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void b(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void c() {
        if (this.a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.t)) {
                    this.a = childAt;
                    return;
                }
            }
        }
    }

    public final void d(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.h.t(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.h.u(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.h.v(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.h.w(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public final void e(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public final void f(float f) {
        if (f > this.e) {
            n(true, true);
            return;
        }
        this.c = false;
        x05 x05Var = this.y;
        u05 u05Var = x05Var.a;
        u05Var.e = 0.0f;
        u05Var.f = 0.0f;
        x05Var.invalidateSelf();
        vvk vvkVar = new vvk(this, (byte) 1);
        this.v = this.n;
        xvk xvkVar = this.H;
        xvkVar.reset();
        xvkVar.setDuration(200L);
        xvkVar.setInterpolator(this.s);
        h05 h05Var = this.t;
        h05Var.a = vvkVar;
        h05Var.clearAnimation();
        h05Var.startAnimation(xvkVar);
        u05 u05Var2 = x05Var.a;
        if (u05Var2.n) {
            u05Var2.n = false;
        }
        x05Var.invalidateSelf();
    }

    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            int i6 = iArr[1];
            if (i5 == 0) {
                this.h.w(i, i2, i3, i4, this.j, i5, iArr);
            }
            int i7 = i4 - (iArr[1] - i6);
            if ((i7 == 0 ? this.j[1] + i4 : i7) >= 0 || a()) {
                return;
            }
            float fAbs = this.f + Math.abs(r12);
            this.f = fAbs;
            h(fAbs);
            iArr[1] = iArr[1] + i7;
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.u;
        return i3 >= 0 ? i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2 : i2;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.g.j();
    }

    public final void h(float f) {
        yvk yvkVar;
        yvk yvkVar2;
        x05 x05Var = this.y;
        u05 u05Var = x05Var.a;
        if (!u05Var.n) {
            u05Var.n = true;
        }
        x05Var.invalidateSelf();
        float f2 = this.e;
        float fMin = Math.min(1.0f, Math.abs(f / f2));
        float fMax = (((float) Math.max(fMin - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - f2;
        float f3 = this.x;
        double dMax = Math.max(0.0f, Math.min(fAbs, f3 * 2.0f) / f3) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i = this.w + ((int) ((f3 * fMin) + (f3 * fPow * 2.0f)));
        h05 h05Var = this.t;
        if (h05Var.getVisibility() != 0) {
            h05Var.setVisibility(0);
        }
        h05Var.setScaleX(1.0f);
        h05Var.setScaleY(1.0f);
        if (f < f2) {
            if (x05Var.a.t > 76 && ((yvkVar2 = this.B) == null || !yvkVar2.hasStarted() || yvkVar2.hasEnded())) {
                yvk yvkVar3 = new yvk(this, x05Var.a.t, 76);
                yvkVar3.setDuration(300L);
                h05Var.a = null;
                h05Var.clearAnimation();
                h05Var.startAnimation(yvkVar3);
                this.B = yvkVar3;
            }
        } else if (x05Var.a.t < 255 && ((yvkVar = this.C) == null || !yvkVar.hasStarted() || yvkVar.hasEnded())) {
            yvk yvkVar4 = new yvk(this, x05Var.a.t, 255);
            yvkVar4.setDuration(300L);
            h05Var.a = null;
            h05Var.clearAnimation();
            h05Var.startAnimation(yvkVar4);
            this.C = yvkVar4;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        u05 u05Var2 = x05Var.a;
        u05Var2.e = 0.0f;
        u05Var2.f = fMin2;
        x05Var.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        u05 u05Var3 = x05Var.a;
        if (fMin3 != u05Var3.p) {
            u05Var3.p = fMin3;
        }
        x05Var.invalidateSelf();
        x05Var.a.g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        x05Var.invalidateSelf();
        o(i - this.n);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.h.A(0);
    }

    public final void i(View view, int i, int i2, int i3, int i4, int i5) {
        g(view, i, i2, i3, i4, i5, this.k);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.h.b;
    }

    public final void j(float f) {
        o((this.v + ((int) ((this.w - r0) * f))) - this.t.getTop());
    }

    public final boolean k(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public final void l() {
        this.t.clearAnimation();
        this.y.stop();
        this.t.setVisibility(8);
        this.t.getBackground().setAlpha(255);
        this.y.setAlpha(255);
        o(this.w - this.n);
        this.n = this.t.getTop();
    }

    public final void m(boolean z) {
        if (!z || this.c == z) {
            n(z, false);
            return;
        }
        this.c = z;
        o((this.x + this.w) - this.n);
        this.D = false;
        h05 h05Var = this.t;
        h05Var.setVisibility(0);
        this.y.setAlpha(255);
        xvk xvkVar = new xvk(this, (byte) 0);
        this.z = xvkVar;
        xvkVar.setDuration(this.m);
        vvk vvkVar = this.F;
        if (vvkVar != null) {
            h05Var.a = vvkVar;
        }
        h05Var.clearAnimation();
        h05Var.startAnimation(this.z);
    }

    public final void n(boolean z, boolean z2) {
        if (this.c != z) {
            this.D = z2;
            c();
            this.c = z;
            h05 h05Var = this.t;
            vvk vvkVar = this.F;
            if (!z) {
                xvk xvkVar = new xvk(this, (byte) 1);
                this.A = xvkVar;
                xvkVar.setDuration(150L);
                h05Var.a = vvkVar;
                h05Var.clearAnimation();
                h05Var.startAnimation(this.A);
                return;
            }
            this.v = this.n;
            xvk xvkVar2 = this.G;
            xvkVar2.reset();
            xvkVar2.setDuration(200L);
            xvkVar2.setInterpolator(this.s);
            if (vvkVar != null) {
                h05Var.a = vvkVar;
            }
            h05Var.clearAnimation();
            h05Var.startAnimation(xvkVar2);
        }
    }

    public final void o(int i) {
        h05 h05Var = this.t;
        h05Var.bringToFront();
        WeakHashMap weakHashMap = r5n.a;
        h05Var.offsetTopAndBottom(i);
        this.n = h05Var.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r5.c()
            int r0 = r6.getActionMasked()
            boolean r1 = r5.isEnabled()
            r2 = 0
            if (r1 == 0) goto L7b
            boolean r1 = r5.a()
            if (r1 != 0) goto L7b
            boolean r1 = r5.c
            if (r1 != 0) goto L7b
            boolean r1 = r5.l
            if (r1 != 0) goto L7b
            if (r0 == 0) goto L58
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L53
            r4 = 2
            if (r0 == r4) goto L41
            r4 = 3
            if (r0 == r4) goto L53
            r3 = 6
            if (r0 != r3) goto L78
            int r0 = r6.getActionIndex()
            int r3 = r6.getPointerId(r0)
            int r4 = r5.r
            if (r3 != r4) goto L78
            if (r0 != 0) goto L3a
            r2 = r1
        L3a:
            int r6 = r6.getPointerId(r2)
            r5.r = r6
            goto L78
        L41:
            int r0 = r5.r
            if (r0 == r3) goto L7b
            int r0 = r6.findPointerIndex(r0)
            if (r0 < 0) goto L7b
            float r6 = r6.getY(r0)
            r5.p(r6)
            goto L78
        L53:
            r5.q = r2
            r5.r = r3
            goto L78
        L58:
            h05 r0 = r5.t
            int r0 = r0.getTop()
            int r1 = r5.w
            int r1 = r1 - r0
            r5.o(r1)
            int r0 = r6.getPointerId(r2)
            r5.r = r0
            r5.q = r2
            int r0 = r6.findPointerIndex(r0)
            if (r0 < 0) goto L7b
            float r6 = r6.getY(r0)
            r5.p = r6
        L78:
            boolean r5 = r5.q
            return r5
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.a == null) {
                c();
            }
            View view = this.a;
            if (view == null) {
                return;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            int measuredWidth2 = this.t.getMeasuredWidth();
            int measuredHeight2 = this.t.getMeasuredHeight();
            int i5 = measuredWidth / 2;
            int i6 = measuredWidth2 / 2;
            int i7 = this.n;
            this.t.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a == null) {
            c();
        }
        View view = this.a;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            int i3 = this.E;
            this.t.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            this.u = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == this.t) {
                    this.u = i4;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.h.t(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.h.u(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f;
            float f2 = 0.0f;
            if (f > 0.0f) {
                float f3 = i2;
                if (f3 > f) {
                    iArr[1] = (int) f;
                    this.f = 0.0f;
                } else {
                    f2 = f - f3;
                    this.f = f2;
                    iArr[1] = i2;
                }
                h(f2);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.i;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        g(view, i, i2, i3, i4, 0, this.k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.g.b = i;
        startNestedScroll(i & 2);
        this.f = 0.0f;
        this.l = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        awk awkVar = (awk) parcelable;
        super.onRestoreInstanceState(awkVar.getSuperState());
        m(awkVar.a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new awk(super.onSaveInstanceState(), this.c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.c || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.g.b = 0;
        this.l = false;
        float f = this.f;
        if (f > 0.0f) {
            f(f);
            this.f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.c && !this.l) {
            if (actionMasked == 0) {
                this.r = motionEvent.getPointerId(0);
                this.q = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.r);
                if (iFindPointerIndex >= 0) {
                    if (this.q) {
                        float y = (motionEvent.getY(iFindPointerIndex) - this.o) * 0.5f;
                        this.q = false;
                        f(y);
                    }
                    this.r = -1;
                    return false;
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.r);
                if (iFindPointerIndex2 >= 0) {
                    float y2 = motionEvent.getY(iFindPointerIndex2);
                    p(y2);
                    if (this.q) {
                        float f = (y2 - this.o) * 0.5f;
                        if (f > 0.0f) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            h(f);
                        }
                    }
                    return true;
                }
            } else if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.r) {
                            this.r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 >= 0) {
                    this.r = motionEvent.getPointerId(actionIndex2);
                    return true;
                }
            }
        }
        return false;
    }

    public final void p(float f) {
        float f2 = this.p;
        float f3 = f - f2;
        float f4 = this.d;
        if (f3 <= f4 || this.q) {
            return;
        }
        this.o = f2 + f4;
        this.q = true;
        this.y.setAlpha(76);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view = this.a;
        if (view != null) {
            WeakHashMap weakHashMap = r5n.a;
            if (!view.isNestedScrollingEnabled()) {
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(z);
                    return;
                }
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        l();
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        s14 s14Var = this.h;
        if (s14Var.b) {
            ViewGroup viewGroup = (ViewGroup) s14Var.e;
            WeakHashMap weakHashMap = r5n.a;
            viewGroup.stopNestedScroll();
        }
        s14Var.b = z;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.h.J(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.h.K(0);
    }
}
