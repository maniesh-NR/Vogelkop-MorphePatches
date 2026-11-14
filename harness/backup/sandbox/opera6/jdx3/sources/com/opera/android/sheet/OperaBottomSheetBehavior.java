package com.opera.android.sheet;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import defpackage.kjf;
import defpackage.kqd;
import defpackage.ljf;
import defpackage.njf;
import defpackage.ojf;
import defpackage.qp2;
import defpackage.sko;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class OperaBottomSheetBehavior<V extends View> extends nv5 {
    public static final sv2 N = new sv2(Integer.MAX_VALUE, Integer.MAX_VALUE, -2147483647);
    public static final sv2 O = new sv2(7000, 3000, -7000);
    public final ArrayList A;
    public final ojf B;
    public VelocityTracker C;
    public int D;
    public int E;
    public boolean F;
    public ljf G;
    public HashMap H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean L;
    public final kq3 M;
    public sv2 a;
    public final int b;
    public final float c;
    public final float d;
    public int e;
    public boolean f;
    public int g;
    public final int h;
    public int i;
    public final boolean j;
    public mjf k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public x5n r;
    public boolean s;
    public int t;
    public boolean u;
    public int v;
    public int w;
    public int x;
    public WeakReference y;
    public WeakReference z;

    public OperaBottomSheetBehavior() {
        this(new ojf());
    }

    public OperaBottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, new ojf(), attributeSet);
    }

    public OperaBottomSheetBehavior(@NonNull Context context, @NonNull ojf ojfVar, @Nullable AttributeSet attributeSet) {
        int i;
        this.a = O;
        this.b = 0;
        this.p = true;
        this.q = 4;
        this.A = new ArrayList();
        this.M = new kq3(this, (byte) 1);
        this.B = ojfVar;
        this.h = context.getResources().getDimensionPixelSize(2131167120);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ihh.d);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            H(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            H(i);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(10, false);
        if (this.n != z) {
            this.n = z;
            if (!z && this.q == 6) {
                I(4);
            }
            M();
        }
        this.j = typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.o = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.p = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.b = typedArrayObtainStyledAttributes.getInt(13, 0);
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            if (typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0) < 0) {
                qp2.o("offset must be greater than or equal to 0");
                throw null;
            }
        } else if (typedValuePeekValue2.data < 0) {
            qp2.o("offset must be greater than or equal to 0");
            throw null;
        }
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.c = viewConfiguration.getScaledMinimumFlingVelocity() << 2;
        this.d = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public OperaBottomSheetBehavior(@NonNull ojf ojfVar) {
        this.a = O;
        this.b = 0;
        this.p = true;
        this.q = 4;
        this.A = new ArrayList();
        this.M = new kq3(this, (byte) 1);
        this.B = ojfVar;
    }

    public static OperaBottomSheetBehavior C(View view) {
        qv5 layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof qv5)) {
            qp2.o("The view is not a child of CoordinatorLayout");
            return null;
        }
        nv5 nv5Var = layoutParams.a;
        if (nv5Var instanceof OperaBottomSheetBehavior) {
            return (OperaBottomSheetBehavior) nv5Var;
        }
        qp2.o("The view is not associated with OperaBottomSheetBehavior");
        return null;
    }

    public final void A(int i) {
        View view = (View) this.y.get();
        if (view != null) {
            ArrayList arrayList = this.A;
            if (arrayList.isEmpty()) {
                return;
            }
            float fD = D(i);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((njf) arrayList.get(i2)).c(view, fD);
            }
        }
    }

    public final View B(View view) {
        WeakHashMap weakHashMap = r5n.a;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewB = B(viewGroup.getChildAt(i));
            if (viewB != null) {
                return viewB;
            }
        }
        return null;
    }

    public final float D(int i) {
        View view;
        WeakReference weakReference = this.y;
        if (weakReference != null && (view = (View) weakReference.get()) != null && !this.A.isEmpty()) {
            Resources resources = view.getResources();
            ojf ojfVar = this.B;
            ojfVar.getClass();
            float dimensionPixelSize = resources.getDimensionPixelSize(2131166625);
            Resources resources2 = view.getResources();
            ojfVar.getClass();
            float dimensionPixelSize2 = resources2.getDimensionPixelSize(2131166626);
            float height = ((View) view.getParent()).getHeight();
            float f = i;
            if (f < dimensionPixelSize) {
                return 1.0f - nb6.i(f / dimensionPixelSize, 0.0f, 1.0f);
            }
            if (f > height - dimensionPixelSize2) {
                return nb6.i((height - f) / dimensionPixelSize2, 0.0f, 1.0f) - 1.0f;
            }
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(android.view.View r7, float r8) {
        /*
            r6 = this;
            boolean r0 = r6.o
            r1 = 3
            float r2 = r6.c
            r3 = 4
            r4 = 0
            if (r0 == 0) goto Le
            float r0 = -r8
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L1a
        Le:
            int r0 = r6.z(r7, r8)
            float r0 = r6.D(r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1d
        L1a:
            int r0 = r6.l
            goto L65
        L1d:
            boolean r0 = r6.n
            if (r0 == 0) goto L43
            float r0 = -r8
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L43
            boolean r2 = r6.o
            if (r2 != 0) goto L3f
            sv2 r2 = r6.a
            int r2 = r2.c
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L3f
            int r0 = r6.z(r7, r8)
            float r0 = r6.D(r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L43
        L3f:
            int r0 = r6.x
            r1 = 6
            goto L65
        L43:
            int r0 = r6.t
            if (r0 != 0) goto L62
            int r0 = r7.getTop()
            int r2 = r6.l
            int r2 = r0 - r2
            int r2 = java.lang.Math.abs(r2)
            int r5 = r6.m
            int r0 = r0 - r5
            int r0 = java.lang.Math.abs(r0)
            if (r2 >= r0) goto L5f
            int r0 = r6.l
            goto L65
        L5f:
            int r0 = r6.m
            goto L64
        L62:
            int r0 = r6.m
        L64:
            r1 = r3
        L65:
            if (r1 != r3) goto La1
            int r8 = r6.z(r7, r8)
            int r2 = r6.x
            int r2 = r2 - r8
            java.lang.ref.WeakReference r8 = r6.y
            java.lang.Object r8 = r8.get()
            android.view.View r8 = (android.view.View) r8
            if (r8 == 0) goto L94
            java.util.ArrayList r8 = r6.A
            boolean r3 = r8.isEmpty()
            if (r3 != 0) goto L94
            r3 = 0
        L81:
            int r5 = r8.size()
            if (r3 >= r5) goto L94
            java.lang.Object r5 = r8.get(r3)
            njf r5 = (defpackage.njf) r5
            int r2 = r5.a(r2)
            int r3 = r3 + 1
            goto L81
        L94:
            int r8 = r6.x
            int r8 = r8 - r2
            float r2 = r6.D(r8)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto La1
            r1 = 5
            r0 = r8
        La1:
            r6.L(r7, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.sheet.OperaBottomSheetBehavior.E(android.view.View, float):void");
    }

    public final void F(CoordinatorLayout coordinatorLayout, MotionEvent motionEvent) {
        WeakReference weakReference = this.z;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || !coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            return;
        }
        this.D = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.F = true;
    }

    public final void G(int i, View view) {
        int i2 = 0;
        if (i == 3) {
            N(true);
        } else if (i == 6 || i == 4 || i == 5) {
            N(false);
        }
        while (true) {
            ArrayList arrayList = this.A;
            if (i2 >= arrayList.size()) {
                M();
                return;
            } else {
                ((njf) arrayList.get(i2)).d(i);
                i2++;
            }
        }
    }

    public final void H(int i) {
        boolean z = this.f;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.f = true;
            }
        } else {
            if (!z && this.e == i) {
                return;
            }
            this.f = false;
            this.e = Math.max(0, i);
        }
        O();
    }

    public final void I(int i) {
        if (i != this.q) {
            if (this.y == null) {
                if (i == 4 || i == 3 || (this.n && i == 6)) {
                    this.q = i;
                    return;
                }
                return;
            }
            View view = (View) this.y.get();
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                    view.post(new sq1((byte) 5, i, this, view, false));
                } else {
                    K(i, view);
                }
            }
        }
    }

    public final void J(int i) {
        if (this.q != i) {
            this.q = i;
            WeakReference weakReference = this.y;
            View view = weakReference == null ? null : (View) weakReference.get();
            if (view != null) {
                G(i, view);
            }
        }
    }

    public final void K(int i, View view) {
        int top;
        int i2;
        if (i == 4) {
            top = this.m;
        } else if (i == 5) {
            top = (view.isLaidOut() && D(view.getTop()) == 0.0f) ? view.getTop() : this.m;
        } else if (i == 3) {
            top = this.l;
        } else {
            if (!this.n || i != 6) {
                qp2.o(sko.i(i, "Illegal state argument: "));
                return;
            }
            top = this.x;
        }
        if ((i == 4 || i == 5) && top <= (i2 = this.l)) {
            L(view, 3, i2);
        } else {
            L(view, i, top);
        }
    }

    public final void L(View view, int i, int i2) {
        x5n x5nVar = this.r;
        if (x5nVar == null || !x5nVar.p(view, view.getLeft(), i2)) {
            J(i);
            return;
        }
        J(2);
        mjf mjfVar = this.k;
        if (mjfVar == null) {
            mjfVar = new mjf(this, view, i);
            this.k = mjfVar;
        }
        if (mjfVar.b) {
            mjfVar.c = i;
            return;
        }
        mjfVar.c = i;
        view.postOnAnimation(mjfVar);
        this.k.b = true;
    }

    public final void M() {
        View view;
        WeakReference weakReference = this.y;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        r5n.j(524288, view);
        r5n.g(0, view);
        r5n.j(262144, view);
        r5n.g(0, view);
        r5n.j(1048576, view);
        r5n.g(0, view);
        if (this.n && this.q != 6) {
            r5n.k(view, s8.w, (String) null, new lq3(this, 6, (byte) 3));
        }
        int i = this.q;
        if (i == 3) {
            r5n.k(view, s8.v, (String) null, new lq3(this, 4, (byte) 3));
        } else if (i == 4 || i == 5) {
            r5n.k(view, s8.u, (String) null, new lq3(this, 3, (byte) 3));
        }
    }

    public final void N(boolean z) {
        WeakReference weakReference = this.y;
        if (weakReference != null) {
            CoordinatorLayout parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.H != null) {
                        return;
                    } else {
                        this.H = new HashMap(childCount);
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.y.get() && z) {
                        this.H.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (z) {
                    return;
                }
                this.H = null;
            }
        }
    }

    public final void O() {
        View view;
        if (this.y != null) {
            y();
            if (this.q != 4 || (view = (View) this.y.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    public final void g(qv5 qv5Var) {
        this.y = null;
        this.r = null;
    }

    public final void j() {
        this.y = null;
        this.r = null;
    }

    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        x5n x5nVar;
        this.I = false;
        ljf ljfVar = this.G;
        if (ljfVar != null) {
            if (ljfVar.e) {
                z = false;
            } else {
                ljfVar.e = true;
                ljfVar.c = true;
                ljfVar.b.abortAnimation();
                z = ljfVar.d;
            }
            this.G = null;
        } else {
            z = false;
        }
        if (!view.isShown() || !this.p) {
            this.s = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.D = -1;
            VelocityTracker velocityTracker = this.C;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.C = null;
            }
        }
        VelocityTracker velocityTrackerObtain = this.C;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.C = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.E = (int) motionEvent.getY();
            if (this.q != 2 || z) {
                F(coordinatorLayout, motionEvent);
            }
            this.s = this.D == -1 && !coordinatorLayout.o(view, x, this.E);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.F = false;
            this.D = -1;
            if (this.s) {
                this.s = false;
                return false;
            }
            if (z) {
                F(coordinatorLayout, motionEvent);
            }
        }
        if (this.s || (x5nVar = this.r) == null || !x5nVar.o(motionEvent)) {
            WeakReference weakReference = this.z;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (actionMasked != 2 || view2 == null || this.s || this.q == 1 || coordinatorLayout.o(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.r == null || Math.abs(this.E - motionEvent.getY()) <= this.r.b) {
                return false;
            }
        }
        return true;
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.y == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(2131165565);
            if (!this.j && !this.f) {
                hn9.h(view, new kqd((Object) this, (byte) 17));
            }
            this.y = new WeakReference(view);
            M();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.r == null) {
            this.r = new x5n(coordinatorLayout.getContext(), coordinatorLayout, this.M);
        }
        int top = view.getTop();
        int height = view.getHeight();
        coordinatorLayout.r(i, view);
        int i2 = this.x;
        this.w = coordinatorLayout.getWidth();
        this.x = coordinatorLayout.getHeight();
        int height2 = view.getHeight();
        this.v = height2;
        this.l = Math.max(0, this.x - height2);
        y();
        int i3 = this.q;
        if (i3 == 3) {
            int i4 = this.l;
            WeakHashMap weakHashMap = r5n.a;
            view.offsetTopAndBottom(i4);
        } else if (this.n && i3 == 6) {
            int i5 = this.x;
            WeakHashMap weakHashMap2 = r5n.a;
            view.offsetTopAndBottom(i5);
        } else if (i3 == 4) {
            int i6 = this.m;
            WeakHashMap weakHashMap3 = r5n.a;
            view.offsetTopAndBottom(i6);
        } else if (i3 == 5) {
            int iMax = Math.max(0, (top - view.getTop()) + (this.x - i2));
            WeakHashMap weakHashMap4 = r5n.a;
            view.offsetTopAndBottom(iMax);
        } else if (i3 == 1 || i3 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap5 = r5n.a;
            view.offsetTopAndBottom(top2);
        }
        if (view.getTop() != top) {
            A(view.getTop());
        }
        if (view.getHeight() != height) {
            view.getHeight();
            if (((View) this.y.get()) != null) {
                ArrayList arrayList = this.A;
                if (!arrayList.isEmpty()) {
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        ((njf) arrayList.get(i7)).b();
                    }
                }
            }
        }
        this.z = new WeakReference(B(view));
        if (this.L) {
            this.L = false;
            int i8 = this.q;
            WeakReference weakReference = this.y;
            View view2 = weakReference == null ? null : (View) weakReference.get();
            if (view2 != null) {
                G(i8, view2);
            }
        }
        return true;
    }

    public final void n(float f) {
        if (this.q != 3 || f >= this.a.c) {
            return;
        }
        this.I = true;
    }

    public final boolean o(View view, float f) {
        if (this.q == 3 || f <= this.a.a) {
            WeakReference weakReference = this.z;
            return (weakReference == null || view != weakReference.get() || this.q == 3) ? false : true;
        }
        this.K = (int) f;
        return true;
    }

    public final void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1) {
            WeakReference weakReference = this.z;
            if (view2 == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = view.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    int i5 = this.l;
                    if (i4 < i5) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        int i7 = -i6;
                        WeakHashMap weakHashMap = r5n.a;
                        view.offsetTopAndBottom(i7);
                        J(3);
                    } else {
                        if (!this.p) {
                            return;
                        }
                        iArr[1] = i2;
                        WeakHashMap weakHashMap2 = r5n.a;
                        view.offsetTopAndBottom(-i2);
                        J(1);
                    }
                } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                    int i8 = this.m;
                    if (i4 > i8 && !this.n) {
                        int i9 = top - i8;
                        iArr[1] = i9;
                        int i10 = -i9;
                        WeakHashMap weakHashMap3 = r5n.a;
                        view.offsetTopAndBottom(i10);
                        J(4);
                    } else {
                        if (!this.p) {
                            return;
                        }
                        iArr[1] = i2;
                        WeakHashMap weakHashMap4 = r5n.a;
                        view.offsetTopAndBottom(-i2);
                        J(1);
                    }
                }
                A(view.getTop());
                this.t = i2;
                this.u = true;
            }
        }
    }

    public final void q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (view.getScrollY() == 0) {
            if (this.I) {
                this.J = true;
            }
            this.I = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(View view, Parcelable parcelable) {
        kjf kjfVar = (kjf) parcelable;
        int i = this.b;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = kjfVar.d;
            }
            if (i == -1 || (i & 4) == 4) {
                this.n = kjfVar.e;
            }
            if (i == -1 || (i & 8) == 8) {
                this.o = kjfVar.f;
            }
        }
        int i2 = kjfVar.c;
        if (i2 == 1 || i2 == 2) {
            this.q = 4;
        } else {
            this.q = i2;
        }
        WeakReference weakReference = this.y;
        View view2 = weakReference == null ? null : (View) weakReference.get();
        if (view2 == null) {
            this.L = true;
        } else {
            G(this.q, view2);
        }
    }

    public final Parcelable t(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new kjf(this);
    }

    public final boolean u(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.t = 0;
        this.u = false;
        return (i & 2) != 0;
    }

    public final void v(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        if (this.J) {
            this.J = false;
            if (this.o) {
                L(view, 6, this.x);
            } else {
                L(view, 4, this.m);
            }
            this.u = false;
            return;
        }
        if (this.K > 0) {
            ljf ljfVar = this.G;
            if (ljfVar != null) {
                if (!ljfVar.e) {
                    ljfVar.e = true;
                    ljfVar.c = true;
                    ljfVar.b.abortAnimation();
                }
                this.G = null;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            ljf ljfVar2 = new ljf(this, nestedScrollView);
            this.G = ljfVar2;
            int iMin = Math.min(this.K, this.a.b);
            ljfVar2.b.startScroll(nestedScrollView.getLeft(), nestedScrollView.getTop(), 0, (-nestedScrollView.getTop()) - (nestedScrollView.getChildAt(0).getHeight() - nestedScrollView.getHeight()), (int) ((Math.abs(r6) / iMin) * 1000.0f));
            J(2);
            nestedScrollView.postOnAnimation(ljfVar2);
            this.K = 0;
            this.u = false;
            return;
        }
        if (view.getTop() == this.l) {
            J(3);
            return;
        }
        WeakReference weakReference = this.z;
        if (weakReference != null && view2 == weakReference.get() && this.u) {
            float yVelocity = 0.0f;
            if (coordinatorLayout instanceof VelocityTrackingCoordinatorLayout) {
                VelocityTrackingCoordinatorLayout velocityTrackingCoordinatorLayout = (VelocityTrackingCoordinatorLayout) coordinatorLayout;
                VelocityTracker velocityTracker = velocityTrackingCoordinatorLayout.z;
                if (velocityTracker != null) {
                    velocityTracker.computeCurrentVelocity(1000, velocityTrackingCoordinatorLayout.y);
                    yVelocity = velocityTrackingCoordinatorLayout.z.getYVelocity(velocityTrackingCoordinatorLayout.A);
                }
            } else {
                VelocityTracker velocityTracker2 = this.C;
                if (velocityTracker2 != null) {
                    velocityTracker2.computeCurrentVelocity(1000, this.d);
                    yVelocity = this.C.getYVelocity(this.D);
                }
            }
            E(view, yVelocity);
            this.u = false;
        }
    }

    public final boolean w(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.q == 1 && actionMasked == 0) {
            return true;
        }
        x5n x5nVar = this.r;
        if (x5nVar != null) {
            x5nVar.i(motionEvent);
        }
        if (actionMasked == 0) {
            this.D = -1;
            VelocityTracker velocityTracker = this.C;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.C = null;
            }
        }
        VelocityTracker velocityTrackerObtain = this.C;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.C = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (this.r != null && actionMasked == 2 && !this.s) {
            float fAbs = Math.abs(this.E - motionEvent.getY());
            x5n x5nVar2 = this.r;
            if (fAbs > x5nVar2.b) {
                x5nVar2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.s;
    }

    public final void x(njf njfVar) {
        ArrayList arrayList = this.A;
        if (arrayList.contains(njfVar)) {
            return;
        }
        arrayList.add(njfVar);
    }

    public final void y() {
        int i;
        this.m = Math.max(this.x - (this.f ? Math.min(Math.max(this.g, this.x - ((this.w * 9) / 16)), this.v) : (this.j || (i = this.i) <= 0) ? this.e : Math.max(this.e, i + this.h)), this.l);
    }

    public final int z(View view, float f) {
        int iRound;
        int top = view.getTop();
        if (Math.abs(f) < this.c) {
            iRound = 0;
        } else {
            this.a.getClass();
            iRound = Math.round(f * 0.075f);
        }
        return top + iRound;
    }
}
