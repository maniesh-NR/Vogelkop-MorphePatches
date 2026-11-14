package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.g3o;
import defpackage.h5n;
import defpackage.hkj;
import defpackage.i6n;
import defpackage.mv5;
import defpackage.n5n;
import defpackage.nv5;
import defpackage.ov5;
import defpackage.pv5;
import defpackage.qv5;
import defpackage.r5n;
import defpackage.thh;
import defpackage.wng;
import defpackage.yg9;
import defpackage.zy9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements lle, mle {
    public static final String t;
    public static final Class[] u;
    public static final ThreadLocal v;
    public static final yg9 w;
    public static final wng x;
    public final ArrayList a;
    public final i3j b;
    public final ArrayList c;
    public final int[] d;
    public final int[] e;
    public final int[] f;
    public boolean g;
    public boolean h;
    public final int[] i;
    public View j;
    public View k;
    public rv5 l;
    public boolean m;
    public g3o n;
    public boolean o;
    public final Drawable p;
    public ViewGroup.OnHierarchyChangeListener q;
    public zy9 r;
    public final fr s;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        t = r0 != null ? r0.getName() : null;
        w = new yg9((byte) 22);
        u = new Class[]{Context.class, AttributeSet.class};
        v = new ThreadLocal();
        x = new wng(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969422);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.a = new ArrayList();
        this.b = new i3j((byte) 12);
        this.c = new ArrayList();
        this.d = new int[2];
        this.e = new int[2];
        this.f = new int[2];
        this.s = new fr((byte) 17, false);
        int[] iArr = thh.a;
        if (i == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 2132085043);
            WeakHashMap weakHashMap = r5n.a;
            coordinatorLayout = this;
            context2 = context;
            n5n.b(coordinatorLayout, context2, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 2132085043);
        } else {
            coordinatorLayout = this;
            context2 = context;
            typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, 0);
            WeakHashMap weakHashMap2 = r5n.a;
            n5n.b(coordinatorLayout, context2, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.i = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                coordinatorLayout.i[i2] = (int) (r12[i2] * f);
            }
        }
        coordinatorLayout.p = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        coordinatorLayout.y();
        super.setOnHierarchyChangeListener(new pv5(coordinatorLayout));
        if (coordinatorLayout.getImportantForAccessibility() == 0) {
            coordinatorLayout.setImportantForAccessibility(1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) x.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, qv5 qv5Var, int i2, int i3) {
        int i4 = qv5Var.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = qv5Var.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static qv5 n(View view) {
        qv5 qv5Var = (qv5) view.getLayoutParams();
        if (!qv5Var.b) {
            if (view instanceof mv5) {
                qv5Var.b(((mv5) view).b());
                qv5Var.b = true;
                return qv5Var;
            }
            ov5 ov5Var = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                ov5Var = (ov5) superclass.getAnnotation(ov5.class);
                if (ov5Var != null) {
                    break;
                }
            }
            if (ov5Var != null) {
                try {
                    qv5Var.b((nv5) ov5Var.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception unused) {
                    ov5Var.value().getClass();
                }
            }
            qv5Var.b = true;
        }
        return qv5Var;
    }

    public static void w(int i, View view) {
        qv5 qv5Var = (qv5) view.getLayoutParams();
        int i2 = qv5Var.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = r5n.a;
            view.offsetLeftAndRight(i - i2);
            qv5Var.i = i;
        }
    }

    public static void x(int i, View view) {
        qv5 qv5Var = (qv5) view.getLayoutParams();
        int i2 = qv5Var.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = r5n.a;
            view.offsetTopAndBottom(i - i2);
            qv5Var.j = i;
        }
    }

    public final void b(int i, View view) {
        fr frVar = this.s;
        if (i == 1) {
            frVar.c = 0;
        } else {
            frVar.b = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            qv5 qv5Var = (qv5) childAt.getLayoutParams();
            if (qv5Var.a(i)) {
                nv5 nv5Var = qv5Var.a;
                if (nv5Var != null) {
                    nv5Var.v(this, childAt, view, i);
                }
                if (i == 0) {
                    qv5Var.m = false;
                } else if (i == 1) {
                    qv5Var.n = false;
                }
                qv5Var.o = false;
            }
        }
        this.k = null;
    }

    public final void c(qv5 qv5Var, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) qv5Var).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) qv5Var).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) qv5Var).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) qv5Var).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof qv5) && super.checkLayoutParams(layoutParams);
    }

    public final void d(View view, View view2, int i, int i2) {
        fr frVar = this.s;
        if (i2 == 1) {
            frVar.c = i;
        } else {
            frVar.b = i;
        }
        this.k = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((qv5) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (!zDispatchKeyEvent && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? p(-getHeight()) : p(-((int) (getHeight() * 0.2f)));
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? p(getHeight()) : p((int) (getHeight() * 0.2f));
            }
            if (keyCode == 62) {
                return keyEvent.isShiftPressed() ? p(-m()) : p(m() - getHeight());
            }
            if (keyCode == 92) {
                return p(-getHeight());
            }
            if (keyCode == 93) {
                return p(getHeight());
            }
            if (keyCode == 122) {
                return p(-m());
            }
            if (keyCode == 123) {
                return p(m() - getHeight());
            }
        }
        return zDispatchKeyEvent;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        nv5 nv5Var = ((qv5) view.getLayoutParams()).a;
        if (nv5Var != null) {
            nv5Var.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final void e(View view, int i, int i2, int[] iArr, int i3) {
        nv5 nv5Var;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                qv5 qv5Var = (qv5) childAt.getLayoutParams();
                if (qv5Var.a(i3) && (nv5Var = qv5Var.a) != null) {
                    int[] iArr2 = this.d;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    nv5Var.p(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            q(1);
        }
    }

    public final void f(View view) {
        ArrayList arrayList = (ArrayList) ((hkj) this.b.b).get(view);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View view2 = (View) arrayList.get(i);
            nv5 nv5Var = ((qv5) view2.getLayoutParams()).a;
            if (nv5Var != null) {
                nv5Var.h(this, view2, view);
            }
        }
    }

    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        nv5 nv5Var;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                qv5 qv5Var = (qv5) childAt.getLayoutParams();
                if (qv5Var.a(i5) && (nv5Var = qv5Var.a) != null) {
                    int[] iArr2 = this.d;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    nv5Var.q(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new qv5(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new qv5(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof qv5 ? new qv5((qv5) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new qv5((ViewGroup.MarginLayoutParams) layoutParams) : new qv5(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.s.j();
    }

    @Override // android.view.View
    public final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            i6n.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final void i(View view, int i, int i2, int i3, int i4, int i5) {
        g(view, i, i2, i3, i4, 0, this.e);
    }

    public final List j(View view) {
        hkj hkjVar = (hkj) this.b.b;
        int i = hkjVar.c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) hkjVar.k(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(hkjVar.f(i2));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public final boolean k(View view, View view2, int i, int i2) {
        CoordinatorLayout coordinatorLayout;
        View view3;
        int i3;
        int i4;
        int childCount = getChildCount();
        int i5 = 0;
        boolean z = false;
        while (i5 < childCount) {
            View childAt = this.getChildAt(i5);
            if (childAt.getVisibility() == 8) {
                coordinatorLayout = this;
                view3 = view;
                i3 = i;
                i4 = i2;
            } else {
                qv5 qv5Var = (qv5) childAt.getLayoutParams();
                nv5 nv5Var = qv5Var.a;
                coordinatorLayout = this;
                view3 = view;
                i3 = i;
                i4 = i2;
                if (nv5Var != null) {
                    boolean zU = nv5Var.u(coordinatorLayout, childAt, view3, i3, i4);
                    z |= zU;
                    if (i4 == 0) {
                        qv5Var.m = zU;
                    } else if (i4 == 1) {
                        qv5Var.n = zU;
                    }
                } else if (i4 == 0) {
                    qv5Var.m = false;
                } else if (i4 == 1) {
                    qv5Var.n = false;
                }
            }
            i5++;
            this = coordinatorLayout;
            view = view3;
            i = i3;
            i2 = i4;
        }
        return z;
    }

    public final int m() {
        int height = 0;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            qv5 qv5Var = (qv5) childAt.getLayoutParams();
            height += childAt.getHeight() + ((ViewGroup.MarginLayoutParams) qv5Var).topMargin + ((ViewGroup.MarginLayoutParams) qv5Var).bottomMargin;
        }
        return height;
    }

    public final boolean o(View view, int i, int i2) {
        wng wngVar = x;
        Rect rectA = a();
        i6n.a(this, view, rectA);
        try {
            return rectA.contains(i, i2);
        } finally {
            rectA.setEmpty();
            wngVar.c(rectA);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
        if (this.m) {
            if (this.l == null) {
                this.l = new rv5(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.l);
        }
        if (this.n == null) {
            WeakHashMap weakHashMap = r5n.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
        if (this.m && this.l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.l);
        }
        View view = this.k;
        if (view != null) {
            b(0, view);
        }
        this.h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        super.onDraw(canvas);
        if (!this.o || (drawable = this.p) == null) {
            return;
        }
        g3o g3oVar = this.n;
        int iD = g3oVar != null ? g3oVar.d() : 0;
        if (iD > 0) {
            drawable.setBounds(0, 0, getWidth(), iD);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v();
        }
        boolean zU = u(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zU;
        }
        this.j = null;
        v();
        return zU;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        nv5 nv5Var;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((nv5Var = ((qv5) view.getLayoutParams()).a) == null || !nv5Var.l(this, view, layoutDirection))) {
                r(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x028b, code lost:
    
        if (r10 != false) goto L164;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 871
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        nv5 nv5Var;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                qv5 qv5Var = (qv5) childAt.getLayoutParams();
                if (qv5Var.a(0) && (nv5Var = qv5Var.a) != null) {
                    nv5Var.n(f2);
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        nv5 nv5Var;
        int childCount = getChildCount();
        boolean zO = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                qv5 qv5Var = (qv5) childAt.getLayoutParams();
                if (qv5Var.a(0) && (nv5Var = qv5Var.a) != null) {
                    zO |= nv5Var.o(view, f2);
                }
            }
        }
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        e(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        i(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        d(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof sv5)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sv5 sv5Var = (sv5) parcelable;
        super.onRestoreInstanceState(sv5Var.a);
        SparseArray sparseArray = sv5Var.c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            nv5 nv5Var = n(childAt).a;
            if (id != -1 && nv5Var != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                nv5Var.s(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableT;
        sv5 sv5Var = new sv5(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            nv5 nv5Var = ((qv5) childAt.getLayoutParams()).a;
            if (id != -1 && nv5Var != null && (parcelableT = nv5Var.t(childAt)) != null) {
                sparseArray.append(id, parcelableT);
            }
        }
        sv5Var.c = sparseArray;
        return sv5Var;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return k(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(0, view);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zU;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.j;
        boolean z = false;
        if (view != null) {
            nv5 nv5Var = ((qv5) view.getLayoutParams()).a;
            zU = nv5Var != null ? nv5Var.w(this, this.j, motionEvent) : false;
        } else {
            zU = u(motionEvent, 1);
            if (actionMasked != 0 && zU) {
                z = true;
            }
        }
        if (this.j == null || actionMasked == 3) {
            zU |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            super.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zU;
        }
        this.j = null;
        v();
        return zU;
    }

    public final boolean p(int i) {
        View view;
        View focusedChild = this;
        while (true) {
            if (focusedChild == null) {
                view = null;
                break;
            }
            if (focusedChild.isFocused()) {
                view = focusedChild;
                break;
            }
            focusedChild = focusedChild instanceof ViewGroup ? ((ViewGroup) focusedChild).getFocusedChild() : null;
        }
        k(this, view, 2, 1);
        e(view, 0, i, this.f, 1);
        int[] iArr = this.f;
        int i2 = iArr[1];
        iArr[0] = 0;
        iArr[1] = 0;
        g(view, 0, i2, 0, i, 1, iArr);
        b(1, view);
        return iArr[1] > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(int r23) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.q(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(int r12, android.view.View r13) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.r(int, android.view.View):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        nv5 nv5Var = ((qv5) view.getLayoutParams()).a;
        if (nv5Var == null || !nv5Var.r(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.g) {
            return;
        }
        if (this.j == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                nv5 nv5Var = ((qv5) childAt.getLayoutParams()).a;
                if (nv5Var != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    nv5Var.k(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        v();
        this.g = true;
    }

    public final void s(int i, int i2, int i3, View view) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        y();
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.q = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.p;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        drawable.setVisible(z, false);
    }

    public final boolean t(nv5 nv5Var, View view, MotionEvent motionEvent, int i) {
        if (i == 0) {
            return nv5Var.k(this, view, motionEvent);
        }
        if (i == 1) {
            return nv5Var.w(this, view, motionEvent);
        }
        hai.d();
        return false;
    }

    public final boolean u(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        yg9 yg9Var = w;
        if (yg9Var != null) {
            Collections.sort(arrayList, yg9Var);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zT = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            nv5 nv5Var = ((qv5) view.getLayoutParams()).a;
            if (zT) {
                if (actionMasked != 0 && nv5Var != null) {
                    if (motionEventObtain == null) {
                        motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(3);
                    }
                    t(nv5Var, view, motionEventObtain, i);
                }
            } else if (nv5Var != null && (zT = t(nv5Var, view, motionEvent, i))) {
                this.j = view;
                if (actionMasked != 3 && actionMasked != 1) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        View view2 = (View) arrayList.get(i4);
                        nv5 nv5Var2 = ((qv5) view2.getLayoutParams()).a;
                        if (nv5Var2 != null) {
                            if (motionEventObtain == null) {
                                motionEventObtain = MotionEvent.obtain(motionEvent);
                                motionEventObtain.setAction(3);
                            }
                            t(nv5Var2, view2, motionEventObtain, i);
                        }
                    }
                }
            }
        }
        arrayList.clear();
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        return zT;
    }

    public final void v() {
        View view = this.j;
        if (view != null) {
            nv5 nv5Var = ((qv5) view.getLayoutParams()).a;
            if (nv5Var != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                nv5Var.w(this, this.j, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.j = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((qv5) getChildAt(i).getLayoutParams()).getClass();
        }
        this.g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }

    public final void y() {
        WeakHashMap weakHashMap = r5n.a;
        if (!getFitsSystemWindows()) {
            h5n.c(this, null);
            return;
        }
        zy9 zy9Var = this.r;
        if (zy9Var == null) {
            zy9Var = new zy9(this);
            this.r = zy9Var;
        }
        h5n.c(this, zy9Var);
        setSystemUiVisibility(1280);
    }
}
