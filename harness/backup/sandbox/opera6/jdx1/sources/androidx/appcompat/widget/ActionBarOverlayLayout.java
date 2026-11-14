package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.d3o;
import defpackage.g3o;
import defpackage.h5n;
import defpackage.itd;
import defpackage.kud;
import defpackage.lc;
import defpackage.mc;
import defpackage.n8n;
import defpackage.nc;
import defpackage.ne;
import defpackage.o2o;
import defpackage.p2o;
import defpackage.q2o;
import defpackage.qe;
import defpackage.qsl;
import defpackage.r2o;
import defpackage.r5n;
import defpackage.r9b;
import defpackage.rtl;
import defpackage.s2o;
import defpackage.t2o;
import defpackage.u2o;
import defpackage.y1o;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements lle, mle {
    public static final int[] E = {2130968583, R.attr.windowContentOverlay};
    public static final g3o F;
    public static final Rect G;
    public final lc A;
    public final lc B;
    public final fr C;
    public final nc D;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public rtl e;
    public Drawable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public final Rect l;
    public final Rect m;
    public final Rect n;
    public final Rect o;
    public final Rect p;
    public boolean q;
    public boolean r;
    public g3o s;
    public g3o t;
    public g3o u;
    public g3o v;
    public y1o w;
    public OverScroller x;
    public ViewPropertyAnimator y;
    public final kc z;

    static {
        int i = Build.VERSION.SDK_INT;
        u2o t2oVar = i >= 36 ? new t2o() : i >= 35 ? new s2o() : i >= 34 ? new r2o() : i >= 31 ? new q2o() : i >= 30 ? new p2o() : new o2o();
        t2oVar.h(r9b.c(0, 1, 0, 1));
        F = t2oVar.b();
        G = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.l = new Rect();
        this.m = new Rect();
        this.n = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        this.q = true;
        this.r = false;
        g3o g3oVar = g3o.b;
        this.s = g3oVar;
        this.t = g3oVar;
        this.u = g3oVar;
        this.v = g3oVar;
        this.z = new kc(this, (byte) 0);
        this.A = new lc(this, (byte) 0);
        this.B = new lc(this, (byte) 1);
        c(context);
        this.C = new fr((byte) 17, false);
        nc ncVar = new nc(context);
        ncVar.setWillNotDraw(true);
        this.D = ncVar;
        addView(ncVar);
    }

    public static boolean l(View view, int i, int i2, int i3, int i4) {
        boolean z;
        mc mcVar = (mc) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) mcVar).leftMargin != i) {
            ((ViewGroup.MarginLayoutParams) mcVar).leftMargin = i;
            z = true;
        } else {
            z = false;
        }
        if (((ViewGroup.MarginLayoutParams) mcVar).topMargin != i2) {
            ((ViewGroup.MarginLayoutParams) mcVar).topMargin = i2;
            z = true;
        }
        if (((ViewGroup.MarginLayoutParams) mcVar).rightMargin != i3) {
            ((ViewGroup.MarginLayoutParams) mcVar).rightMargin = i3;
            z = true;
        }
        if (((ViewGroup.MarginLayoutParams) mcVar).bottomMargin == i4) {
            return z;
        }
        ((ViewGroup.MarginLayoutParams) mcVar).bottomMargin = i4;
        return true;
    }

    public final void a() {
        removeCallbacks(this.A);
        removeCallbacks(this.B);
        ViewPropertyAnimator viewPropertyAnimator = this.y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void b(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(E);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.x = new OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof mc;
    }

    public final void d(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f != null) {
            if (this.d.getVisibility() == 0) {
                translationY = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f.setBounds(0, translationY, getWidth(), this.f.getIntrinsicHeight() + translationY);
            this.f.draw(canvas);
        }
    }

    public final void e(View view, int i, int i2, int[] iArr, int i3) {
    }

    public final void f(int i) {
        h();
        if (i == 2) {
            this.e.getClass();
        } else if (i == 5) {
            this.e.getClass();
        } else {
            if (i != 109) {
                return;
            }
            this.g = true;
        }
    }

    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        i(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new mc(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new mc(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new mc(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.C.j();
    }

    public final void h() {
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(2131361859);
            this.d = findViewById(2131361861);
            View viewFindViewById = findViewById(2131361858);
            if (!(viewFindViewById instanceof Toolbar)) {
                qp2.n("Can't make a decor toolbar out of ".concat(viewFindViewById.getClass().getSimpleName()));
                return;
            }
            Toolbar toolbar = (Toolbar) viewFindViewById;
            rtl rtlVar = toolbar.J;
            if (rtlVar == null) {
                rtlVar = new rtl(toolbar, true);
                toolbar.J = rtlVar;
            }
            this.e = rtlVar;
        }
    }

    public final void i(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public final void j(boolean z) {
        if (z != this.h) {
            this.h = z;
            if (z) {
                return;
            }
            a();
            a();
            this.d.getHeight();
            this.d.setTranslationY(-0);
        }
    }

    public final boolean k(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public final void m(itd itdVar, kud kudVar) {
        h();
        rtl rtlVar = this.e;
        Toolbar toolbar = rtlVar.a;
        ne neVar = rtlVar.m;
        if (neVar == null) {
            neVar = new ne(toolbar.getContext());
            rtlVar.m = neVar;
        }
        neVar.e = kudVar;
        if (itdVar == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        itd itdVar2 = toolbar.a.p;
        if (itdVar2 == itdVar) {
            return;
        }
        if (itdVar2 != null) {
            itdVar2.r(toolbar.K);
            itdVar2.r(toolbar.L);
        }
        if (toolbar.L == null) {
            toolbar.L = new qsl(toolbar);
        }
        neVar.m = true;
        Context context = toolbar.i;
        if (itdVar != null) {
            itdVar.b(neVar, context);
            itdVar.b(toolbar.L, toolbar.i);
        } else {
            neVar.i(context, null);
            toolbar.L.i(toolbar.i, null);
            neVar.e();
            toolbar.L.e();
        }
        qe qeVar = toolbar.a;
        int i = toolbar.j;
        if (qeVar.r != i) {
            qeVar.r = i;
            if (i == 0) {
                qeVar.q = qeVar.getContext();
            } else {
                qeVar.q = new ContextThemeWrapper(qeVar.getContext(), i);
            }
        }
        qe qeVar2 = toolbar.a;
        qeVar2.t = neVar;
        neVar.f = qeVar2;
        qeVar2.p = neVar.c;
        toolbar.K = neVar;
        toolbar.G();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean zL;
        h();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        boolean z = true;
        boolean z2 = (windowSystemUiVisibility & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        boolean z3 = (windowSystemUiVisibility & 1536) != 0;
        WeakHashMap weakHashMap = r5n.a;
        nc ncVar = this.D;
        g3o g3oVar = F;
        Rect rect = this.p;
        h5n.b(ncVar, g3oVar, rect);
        boolean zEquals = rect.equals(G);
        this.q = !zEquals;
        boolean z4 = zEquals || (z2 && z3);
        this.r = z4;
        y1o y1oVar = this.w;
        if (y1oVar != null) {
            y1oVar.p = (z2 || z4) ? false : true;
        }
        g3o g3oVarG = g3o.g(this, windowInsets);
        d3o d3oVar = g3oVarG.a;
        r9b r9bVarN = d3oVar.n();
        int i = r9bVarN.a;
        int i2 = r9bVarN.a;
        int i3 = r9bVarN.b;
        int i4 = r9bVarN.c;
        this.o.set(i, i3, i4, r9bVarN.d);
        if (this.r) {
            r9b r9bVarI = d3oVar.i(2);
            int i5 = r9bVarI.a;
            int i6 = r9bVarI.c;
            this.d.setPadding(i2 - i5, i3, i4 - i6, 0);
            zL = l(this.d, r9bVarI.a, 0, i6, 0);
        } else {
            this.d.setPadding(0, 0, 0, 0);
            zL = l(this.d, i2, i3, i4, 0);
        }
        Rect rect2 = this.l;
        h5n.b(this, g3oVarG, rect2);
        g3o g3oVarR = d3oVar.r(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.s = g3oVarR;
        if (!this.t.equals(g3oVarR)) {
            this.t = this.s;
            zL = true;
        }
        Rect rect3 = this.m;
        if (rect3.equals(rect2)) {
            z = zL;
        } else {
            rect3.set(rect2);
        }
        if (z) {
            requestLayout();
        }
        return d3oVar.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        WeakHashMap weakHashMap = r5n.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                mc mcVar = (mc) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) mcVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) mcVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        h();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        mc mcVar = (mc) this.d.getLayoutParams();
        int iMax = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) mcVar).leftMargin + ((ViewGroup.MarginLayoutParams) mcVar).rightMargin);
        int iMax2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) mcVar).topMargin + ((ViewGroup.MarginLayoutParams) mcVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = r5n.a;
        boolean z = (getWindowSystemUiVisibility() & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        if (z) {
            measuredHeight = this.a;
            if (this.r) {
                measuredHeight += this.o.top;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.l;
        Rect rect2 = this.n;
        rect2.set(rect);
        g3o g3oVar = this.s;
        this.u = g3oVar;
        if (this.g || z || !this.q) {
            r9b r9bVarC = this.r ? r9b.c(g3oVar.b(), Math.max(this.u.d(), measuredHeight), this.u.c(), Math.max(this.u.a(), 0)) : r9b.c(g3oVar.b(), this.u.d() + measuredHeight, this.u.c(), this.u.a());
            g3o g3oVar2 = this.u;
            int i3 = Build.VERSION.SDK_INT;
            u2o t2oVar = i3 >= 36 ? new t2o(g3oVar2) : i3 >= 35 ? new s2o(g3oVar2) : i3 >= 34 ? new r2o(g3oVar2) : i3 >= 31 ? new q2o(g3oVar2) : i3 >= 30 ? new p2o(g3oVar2) : new o2o(g3oVar2);
            t2oVar.h(r9bVarC);
            this.u = t2oVar.b();
        } else {
            boolean z2 = this.r;
            int i4 = rect2.top;
            if (z2) {
                rect2.top = Math.max(i4, measuredHeight);
                rect2.bottom = Math.max(rect2.bottom, 0);
            } else {
                rect2.top = i4 + measuredHeight;
                rect2.bottom = rect2.bottom;
            }
            this.u = this.u.a.r(0, measuredHeight, 0, 0);
        }
        l(this.c, rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (!this.v.equals(this.u)) {
            g3o g3oVar3 = this.u;
            this.v = g3oVar3;
            r5n.c(this.c, g3oVar3);
        }
        measureChildWithMargins(this.c, i, 0, i2, 0);
        mc mcVar2 = (mc) this.c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) mcVar2).leftMargin + ((ViewGroup.MarginLayoutParams) mcVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) mcVar2).topMargin + ((ViewGroup.MarginLayoutParams) mcVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.h || !z) {
            return false;
        }
        this.x.fling(0, 0, 0, (int) f2, 0, 0, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE);
        if (this.x.getFinalY() > this.d.getHeight()) {
            a();
            this.B.run();
        } else {
            a();
            this.A.run();
        }
        this.i = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.j = this.j + i2;
        a();
        this.d.setTranslationY(-Math.max(0, Math.min(r1, this.d.getHeight())));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        n8n n8nVar;
        this.C.b = i;
        ActionBarContainer actionBarContainer = this.d;
        this.j = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        a();
        y1o y1oVar = this.w;
        if (y1oVar == null || (n8nVar = y1oVar.u) == null) {
            return;
        }
        n8nVar.a();
        y1oVar.u = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.h || this.i) {
            return;
        }
        if (this.j <= this.d.getHeight()) {
            a();
            postDelayed(this.A, 600L);
        } else {
            a();
            postDelayed(this.B, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        h();
        int i2 = this.k ^ i;
        this.k = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        y1o y1oVar = this.w;
        if (y1oVar != null) {
            y1oVar.p = (z2 || this.r) ? false : true;
            if (z || !z2) {
                if (y1oVar.r) {
                    y1oVar.r = false;
                    y1oVar.z(true);
                }
            } else if (!y1oVar.r) {
                y1oVar.r = true;
                y1oVar.z(true);
            }
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) == 0 || this.w == null) {
            return;
        }
        WeakHashMap weakHashMap = r5n.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        y1o y1oVar = this.w;
        if (y1oVar != null) {
            y1oVar.o = i;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
