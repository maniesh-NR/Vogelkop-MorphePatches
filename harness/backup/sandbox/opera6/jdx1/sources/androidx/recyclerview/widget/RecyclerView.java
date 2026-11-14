package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.widget.StackLayoutManager;
import defpackage.dph;
import defpackage.f7n;
import defpackage.g6n;
import defpackage.h6n;
import defpackage.hkj;
import defpackage.iph;
import defpackage.ivg;
import defpackage.j1d;
import defpackage.kle;
import defpackage.kp5;
import defpackage.lph;
import defpackage.mph;
import defpackage.n5n;
import defpackage.nph;
import defpackage.oph;
import defpackage.or;
import defpackage.pr;
import defpackage.qph;
import defpackage.r5n;
import defpackage.r87;
import defpackage.ro9;
import defpackage.sgb;
import defpackage.t5n;
import defpackage.tpi;
import defpackage.vng;
import defpackage.vph;
import defpackage.wph;
import defpackage.xr6;
import defpackage.z5i;
import defpackage.zv4;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements tpi, kle {
    public static final int[] C0 = {R.attr.nestedScrollingEnabled};
    public static final Class[] D0;
    public static final alb E0;
    public static final wu5 F0;
    public boolean A;
    public final qfb A0;
    public final AccessibilityManager B;
    public final r87 B0;
    public ArrayList C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public final wu5 H;
    public EdgeEffect I;
    public EdgeEffect J;
    public EdgeEffect K;
    public EdgeEffect L;
    public e M;
    public byte N;
    public int O;
    public VelocityTracker P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public zwg V;
    public final int W;
    public final float a;
    public final int a0;
    public final a83 b;
    public final float b0;
    public final g c;
    public final float c0;
    public qph d;
    public final boolean d0;
    public final pr e;
    public final h e0;
    public final zv4 f;
    public b f0;
    public final ivg g;
    public final a g0;
    public boolean h;
    public final vph h0;
    public final dph i;
    public ArrayList i0;
    public final Rect j;
    public boolean j0;
    public final Rect k;
    public boolean k0;
    public final RectF l;
    public final yhe l0;
    public d m;
    public boolean m0;
    public f n;
    public final wph n0;
    public final ArrayList o;
    public StackLayoutManager o0;
    public final ArrayList p;
    public final int[] p0;
    public final ArrayList q;
    public s14 q0;
    public nph r;
    public final int[] r0;
    public boolean s;
    public final int[] s0;
    public boolean t;
    public final int[] t0;
    public boolean u;
    public final ArrayList u0;
    public int v;
    public final dph v0;
    public boolean w;
    public boolean w0;
    public boolean x;
    public int x0;
    public boolean y;
    public int y0;
    public int z;
    public final boolean z0;

    static {
        Class cls = Integer.TYPE;
        D0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        E0 = new alb((byte) 5);
        F0 = new wu5();
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.recyclerview.R.attr.recyclerViewStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Class[], java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Class] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        boolean z;
        char c;
        ?? r10;
        TypedArray typedArray;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i);
        this.b = new a83(this, (byte) 14);
        this.c = new g(this);
        this.g = new ivg((byte) 12);
        this.i = new dph(this, (byte) 0);
        this.j = new Rect();
        this.k = new Rect();
        this.l = new RectF();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.v = 0;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        this.H = F0;
        this.M = new xr6();
        this.N = (byte) 0;
        this.O = -1;
        this.b0 = Float.MIN_VALUE;
        this.c0 = Float.MIN_VALUE;
        this.d0 = true;
        this.e0 = new h(this);
        this.g0 = new a();
        vph vphVar = new vph();
        vphVar.a = -1;
        vphVar.b = 0;
        vphVar.c = 0;
        vphVar.d = (byte) 1;
        vphVar.e = 0;
        vphVar.f = false;
        vphVar.g = false;
        vphVar.h = false;
        vphVar.i = false;
        vphVar.j = false;
        vphVar.k = false;
        this.h0 = vphVar;
        this.j0 = false;
        this.k0 = false;
        yhe yheVar = new yhe(this, (byte) 13);
        this.l0 = yheVar;
        this.m0 = false;
        this.p0 = new int[2];
        this.r0 = new int[2];
        this.s0 = new int[2];
        this.t0 = new int[2];
        this.u0 = new ArrayList();
        this.v0 = new dph(this, (byte) 1);
        this.x0 = 0;
        this.y0 = 0;
        this.A0 = new qfb(this, (byte) 26);
        this.B0 = new r87(getContext(), new wub(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.U = viewConfiguration.getScaledTouchSlop();
        this.b0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.c0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.M.a = yheVar;
        c cVar = new c(this);
        pr prVar = new pr();
        prVar.b = new vng(30);
        prVar.c = new ArrayList();
        prVar.d = new ArrayList();
        prVar.a = 0;
        prVar.e = cVar;
        prVar.f = new yhe(prVar, (byte) 4);
        this.e = prVar;
        this.f = new zv4(new isd(this, (byte) 16));
        if (r5n.e(this) == 0) {
            r5n.n(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.B = (AccessibilityManager) getContext().getSystemService("accessibility");
        wph wphVar = new wph(this);
        this.n0 = wphVar;
        r5n.l(this, wphVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.RecyclerView, i, 0);
        n5n.b(this, context, androidx.recyclerview.R.styleable.RecyclerView, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(androidx.recyclerview.R.styleable.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.h = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_android_clipToPadding, true);
        if (typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_fastScrollEnabled, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalThumbDrawable);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalTrackDrawable);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                qp2.o("Trying to set fast scroller without both required drawables.".concat(F()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c = 2;
            z = 1;
            typedArray = typedArrayObtainStyledAttributes;
            r10 = 0;
            new eq8(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(androidx.recyclerview.R.dimen.fastscroll_margin));
        } else {
            z = 1;
            c = 2;
            r10 = 0;
            typedArray = typedArrayObtainStyledAttributes;
        }
        typedArray.recycle();
        this.z0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    ?? AsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(f.class);
                    try {
                        constructor = AsSubclass.getConstructor(D0);
                        objArr = new Object[4];
                        objArr[0] = context;
                        objArr[z] = attributeSet;
                        objArr[c] = Integer.valueOf(i);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = AsSubclass.getConstructor(r10);
                            objArr = r10;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(z);
                    C0((f) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    j9h.e(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw r10;
                } catch (ClassNotFoundException e4) {
                    j9h.e(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw r10;
                } catch (IllegalAccessException e5) {
                    j9h.e(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw r10;
                } catch (InstantiationException e6) {
                    j9h.e(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw r10;
                } catch (InvocationTargetException e7) {
                    j9h.e(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw r10;
                }
            }
        }
        int[] iArr = C0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        n5n.b(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(2131363235, Boolean.TRUE);
    }

    public static RecyclerView L(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewL = L(viewGroup.getChildAt(i));
            if (recyclerViewL != null) {
                return recyclerViewL;
            }
        }
        return null;
    }

    public static int S(View view) {
        i iVarU = U(view);
        if (iVarU != null) {
            return iVarU.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public static i U(View view) {
        if (view == null) {
            return null;
        }
        return ((lph) view.getLayoutParams()).a;
    }

    public static void V(Rect rect, View view) {
        lph lphVar = (lph) view.getLayoutParams();
        Rect rect2 = lphVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) lphVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) lphVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) lphVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) lphVar).bottomMargin);
    }

    private void cancelScroll() {
        VelocityTracker velocityTracker = this.P;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        Y().K(0);
        n0();
        E0(0);
    }

    public static void q(i iVar) {
        WeakReference<RecyclerView> weakReference = iVar.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == iVar.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            iVar.mNestedRecyclerView = null;
        }
    }

    public static int t(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && sgb.E(edgeEffect) != 0.0f) {
            int iRound = Math.round(sgb.T(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || sgb.E(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(sgb.T(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public final void A(int i, int i2) {
        this.G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        ArrayList arrayList = this.i0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((oph) this.i0.get(size)).onScrolled(this, i, i2);
            }
        }
        this.G--;
    }

    public final void A0(StackLayoutManager stackLayoutManager) {
        if (stackLayoutManager == this.o0) {
            return;
        }
        this.o0 = stackLayoutManager;
        setChildrenDrawingOrderEnabled(true);
    }

    public final void B() {
        if (this.L != null) {
            return;
        }
        this.H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.L = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void B0(e eVar) {
        e eVar2 = this.M;
        if (eVar2 != null) {
            eVar2.f();
            this.M.a = null;
        }
        this.M = eVar;
        if (eVar != null) {
            eVar.a = this.l0;
        }
    }

    public final void C() {
        if (this.I != null) {
            return;
        }
        this.H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.I = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void C0(f fVar) {
        RecyclerView recyclerView;
        if (fVar == this.n) {
            return;
        }
        L0();
        f fVar2 = this.n;
        g gVar = this.c;
        if (fVar2 != null) {
            e eVar = this.M;
            if (eVar != null) {
                eVar.f();
            }
            this.n.removeAndRecycleAllViews(gVar);
            this.n.removeAndRecycleScrapInt(gVar);
            gVar.a.clear();
            gVar.g();
            if (this.s) {
                this.n.dispatchDetachedFromWindow(this, gVar);
            }
            this.n.setRecyclerView(null);
            this.n = null;
        } else {
            gVar.a.clear();
            gVar.g();
        }
        zv4 zv4Var = this.f;
        zv4Var.b.s();
        ArrayList arrayList = zv4Var.c;
        int size = arrayList.size();
        while (true) {
            size--;
            recyclerView = (RecyclerView) zv4Var.a.b;
            if (size < 0) {
                break;
            }
            i iVarU = U((View) arrayList.get(size));
            if (iVarU != null) {
                iVarU.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.w(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.n = fVar;
        if (fVar != null) {
            if (fVar.mRecyclerView != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(fVar);
                String strF = fVar.mRecyclerView.F();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(strF);
                throw new IllegalArgumentException(sb.toString());
            }
            fVar.setRecyclerView(this);
            if (this.s) {
                this.n.dispatchAttachedToWindow(this);
            }
        }
        gVar.n();
        requestLayout();
    }

    public final void D() {
        if (this.K != null) {
            return;
        }
        this.H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.K = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void D0(ro9 ro9Var) {
        g gVar = this.c;
        RecyclerView recyclerView = gVar.g;
        gVar.f(recyclerView.m, false);
        if (gVar.f != null) {
            r1.b--;
        }
        gVar.f = ro9Var;
        if (ro9Var != null && recyclerView.m != null) {
            ro9Var.b++;
        }
        gVar.e();
    }

    public final void E() {
        if (this.J != null) {
            return;
        }
        this.H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.J = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E0(int i) {
        if (i != this.N) {
            this.N = i;
            if (i != 2) {
                h hVar = this.e0;
                hVar.g.removeCallbacks(hVar);
                hVar.c.abortAnimation();
                f fVar = this.n;
                if (fVar != null) {
                    fVar.stopSmoothScroller();
                }
            }
            f fVar2 = this.n;
            if (fVar2 != null) {
                fVar2.onScrollStateChanged(i);
            }
            ArrayList arrayList = this.i0;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((oph) this.i0.get(size)).onScrollStateChanged(this, i);
                }
            }
        }
    }

    public final String F() {
        return " " + super.toString() + ", adapter:" + this.m + ", layout:" + this.n + ", context:" + getContext();
    }

    public final boolean F0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fE = sgb.E(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.a * 0.015f;
        return ((float) (Math.exp(1.7362676463664735d * Math.log((double) (fAbs / f))) * ((double) f))) < fE;
    }

    public final void G(vph vphVar) {
        if (this.N != 2) {
            vphVar.getClass();
            return;
        }
        OverScroller overScroller = this.e0.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        vphVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final void G0(int i, int i2, boolean z) {
        f fVar = this.n;
        if (fVar == null || this.x) {
            return;
        }
        if (!fVar.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.n.canScrollVertically()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            Y().J(i3, 1);
        }
        this.e0.c(i, i2, LinearLayoutManager.INVALID_OFFSET, null);
    }

    public final View H(float f, float f2) {
        zv4 zv4Var = this.f;
        for (int iE = zv4Var.e() - 1; iE >= 0; iE--) {
            View viewD = zv4Var.d(iE);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (f >= viewD.getLeft() + translationX && f <= viewD.getRight() + translationX && f2 >= viewD.getTop() + translationY && f2 <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
        return null;
    }

    public final void H0(int i) {
        f fVar;
        if (this.x || (fVar = this.n) == null) {
            return;
        }
        fVar.smoothScrollToPosition(this, this.h0, i);
    }

    public final View I(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final void I0() {
        int i = this.v + 1;
        this.v = i;
        if (i != 1 || this.x) {
            return;
        }
        this.w = false;
    }

    public final boolean J(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nph nphVar = (nph) arrayList.get(i);
            if (nphVar.b(this, motionEvent) && action != 3) {
                this.r = nphVar;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J0(int i) {
        boolean zCanScrollHorizontally = this.n.canScrollHorizontally();
        int i2 = zCanScrollHorizontally;
        if (this.n.canScrollVertically()) {
            i2 = (zCanScrollHorizontally ? 1 : 0) | 2;
        }
        Y().J(i2, i);
    }

    public final void K(int[] iArr) {
        zv4 zv4Var = this.f;
        int iE = zv4Var.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = LinearLayoutManager.INVALID_OFFSET;
        for (int i3 = 0; i3 < iE; i3++) {
            i iVarU = U(zv4Var.d(i3));
            if (!iVarU.shouldIgnore()) {
                int layoutPosition = iVarU.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final void K0(boolean z) {
        int i = this.v;
        if (i < 1) {
            this.v = 1;
            i = 1;
        }
        if (!z && !this.x) {
            this.w = false;
        }
        if (i == 1) {
            if (z && this.w && !this.x && this.n != null && this.m != null) {
                x();
            }
            if (!this.x) {
                this.w = false;
            }
        }
        this.v--;
    }

    public final void L0() {
        E0(0);
        h hVar = this.e0;
        hVar.g.removeCallbacks(hVar);
        hVar.c.abortAnimation();
        f fVar = this.n;
        if (fVar != null) {
            fVar.stopSmoothScroller();
        }
    }

    public final i M(int i) {
        i iVar = null;
        if (this.D) {
            return null;
        }
        zv4 zv4Var = this.f;
        int iH = zv4Var.h();
        for (int i2 = 0; i2 < iH; i2++) {
            i iVarU = U(zv4Var.g(i2));
            if (iVarU != null && !iVarU.isRemoved() && Q(iVarU) == i) {
                if (!zv4Var.c.contains(iVarU.itemView)) {
                    return iVarU;
                }
                iVar = iVarU;
            }
        }
        return iVar;
    }

    public final void M0(d dVar, boolean z) {
        suppressLayout(false);
        z0(dVar, true, z);
        l0(true);
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.i N(int r6, boolean r7) {
        /*
            r5 = this;
            zv4 r5 = r5.f
            int r0 = r5.h()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L37
            android.view.View r3 = r5.g(r2)
            androidx.recyclerview.widget.i r3 = U(r3)
            if (r3 == 0) goto L34
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L34
            if (r7 == 0) goto L21
            int r4 = r3.mPosition
            if (r4 == r6) goto L27
            goto L34
        L21:
            int r4 = r3.getLayoutPosition()
            if (r4 != r6) goto L34
        L27:
            android.view.View r1 = r3.itemView
            java.util.ArrayList r4 = r5.c
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L33
            r1 = r3
            goto L34
        L33:
            return r3
        L34:
            int r2 = r2 + 1
            goto L8
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.N(int, boolean):androidx.recyclerview.widget.i");
    }

    public boolean O(int i, int i2) {
        return P(i, i2, this.W, this.a0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r9 == 0) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean P(int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.P(int, int, int, int):boolean");
    }

    public final int Q(i iVar) {
        if (iVar.hasAnyOfTheFlags(524) || !iVar.isBound()) {
            return -1;
        }
        int i = iVar.mPosition;
        ArrayList arrayList = (ArrayList) this.e.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            or orVar = (or) arrayList.get(i2);
            byte b = orVar.a;
            if (b != 1) {
                if (b == 2) {
                    int i3 = orVar.b;
                    if (i3 <= i) {
                        int i4 = orVar.d;
                        if (i3 + i4 > i) {
                            return -1;
                        }
                        i -= i4;
                    } else {
                        continue;
                    }
                } else if (b == 8) {
                    int i5 = orVar.b;
                    if (i5 == i) {
                        i = orVar.d;
                    } else {
                        if (i5 < i) {
                            i--;
                        }
                        if (orVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (orVar.b <= i) {
                i += orVar.d;
            }
        }
        return i;
    }

    public final long R(i iVar) {
        return this.m.hasStableIds() ? iVar.getItemId() : iVar.mPosition;
    }

    public final i T(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return U(view);
        }
        kp5.d("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect W(View view) {
        lph lphVar = (lph) view.getLayoutParams();
        boolean z = lphVar.c;
        Rect rect = lphVar.b;
        if (z) {
            vph vphVar = this.h0;
            if (!vphVar.g || (!lphVar.a.isUpdated() && !lphVar.a.isInvalid())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.p;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.j;
                    rect2.set(0, 0, 0, 0);
                    ((iph) arrayList.get(i)).getItemOffsets(rect2, view, this, vphVar);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                lphVar.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final iph X(int i) {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        if (i >= 0 && i < size) {
            return (iph) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + size);
    }

    public final s14 Y() {
        s14 s14Var = this.q0;
        if (s14Var != null) {
            return s14Var;
        }
        s14 s14Var2 = new s14(this);
        this.q0 = s14Var2;
        return s14Var2;
    }

    public final boolean Z() {
        return !this.u || this.D || this.e.s();
    }

    public final void a0() {
        if (this.p.size() == 0) {
            return;
        }
        f fVar = this.n;
        if (fVar != null) {
            fVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        d0();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        f fVar = this.n;
        if (fVar == null || !fVar.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public final boolean b0() {
        return this.F > 0;
    }

    public final void c0(int i) {
        if (this.n == null) {
            return;
        }
        E0(2);
        this.n.scrollToPosition(i);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof lph) && this.n.checkLayoutParams((lph) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        f fVar = this.n;
        if (fVar == null || !fVar.canScrollHorizontally()) {
            return 0;
        }
        return this.n.computeHorizontalScrollExtent(this.h0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        f fVar = this.n;
        if (fVar == null || !fVar.canScrollHorizontally()) {
            return 0;
        }
        return this.n.computeHorizontalScrollOffset(this.h0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        f fVar = this.n;
        if (fVar == null || !fVar.canScrollHorizontally()) {
            return 0;
        }
        return this.n.computeHorizontalScrollRange(this.h0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        f fVar = this.n;
        if (fVar == null || !fVar.canScrollVertically()) {
            return 0;
        }
        return this.n.computeVerticalScrollExtent(this.h0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        f fVar = this.n;
        if (fVar == null || !fVar.canScrollVertically()) {
            return 0;
        }
        return this.n.computeVerticalScrollOffset(this.h0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        f fVar = this.n;
        if (fVar == null || !fVar.canScrollVertically()) {
            return 0;
        }
        return this.n.computeVerticalScrollRange(this.h0);
    }

    public final void d0() {
        zv4 zv4Var = this.f;
        int iH = zv4Var.h();
        for (int i = 0; i < iH; i++) {
            ((lph) zv4Var.g(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.c.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            lph lphVar = (lph) ((i) arrayList.get(i2)).itemView.getLayoutParams();
            if (lphVar != null) {
                lphVar.c = true;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        f fVar = this.n;
        int itemCount = 0;
        if (fVar != null) {
            if (fVar.canScrollVertically()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        G0(0, measuredHeight, false);
                        return true;
                    }
                    G0(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zIsLayoutReversed = fVar.isLayoutReversed();
                    if (keyCode == 122) {
                        if (zIsLayoutReversed) {
                            itemCount = this.m.getItemCount();
                        }
                    } else if (!zIsLayoutReversed) {
                        itemCount = this.m.getItemCount();
                    }
                    H0(itemCount);
                    return true;
                }
            } else if (fVar.canScrollHorizontally()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        G0(measuredWidth, 0, false);
                        return true;
                    }
                    G0(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zIsLayoutReversed2 = fVar.isLayoutReversed();
                    if (keyCode2 == 122) {
                        if (zIsLayoutReversed2) {
                            itemCount = this.m.getItemCount();
                        }
                    } else if (!zIsLayoutReversed2) {
                        itemCount = this.m.getItemCount();
                    }
                    H0(itemCount);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return Y().t(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return Y().u(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return Y().v(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return Y().w(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((iph) arrayList.get(i)).onDrawOver(canvas, this, this.h0);
        }
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.I;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.J;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.K;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.M == null || arrayList.size() <= 0 || !this.M.h()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0(int i, int i2, MotionEvent motionEvent) {
        float y;
        float x;
        f fVar = this.n;
        if (fVar == null || this.x) {
            return;
        }
        int[] iArr = this.t0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = fVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.n.canScrollVertically();
        int i3 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        if (motionEvent == null) {
            y = getHeight() / 2.0f;
            x = getWidth() / 2.0f;
        } else {
            y = motionEvent.getY();
            x = motionEvent.getX();
        }
        int iO0 = i - o0(y, i);
        int iP0 = i2 - p0(x, i2);
        Y().J(i3, 1);
        if (Y().v(zCanScrollHorizontally ? iO0 : 0, zCanScrollVertically ? iP0 : 0, 1, this.t0, this.r0)) {
            iO0 -= iArr[0];
            iP0 -= iArr[1];
        }
        v0(zCanScrollHorizontally ? iO0 : 0, zCanScrollVertically ? iP0 : 0, motionEvent, 1);
        b bVar = this.f0;
        if (bVar != null && (iO0 != 0 || iP0 != 0)) {
            bVar.a(this, iO0, iP0);
        }
        Y().K(1);
    }

    public final void f0(int i, int i2, boolean z) {
        int i3 = i + i2;
        zv4 zv4Var = this.f;
        int iH = zv4Var.h();
        for (int i4 = 0; i4 < iH; i4++) {
            i iVarU = U(zv4Var.g(i4));
            if (iVarU != null && !iVarU.shouldIgnore()) {
                int i5 = iVarU.mPosition;
                vph vphVar = this.h0;
                if (i5 >= i3) {
                    iVarU.offsetPosition(-i2, z);
                    vphVar.f = true;
                } else if (i5 >= i) {
                    iVarU.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    vphVar.f = true;
                }
            }
        }
        g gVar = this.c;
        ArrayList arrayList = gVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i iVar = (i) arrayList.get(size);
            if (iVar != null) {
                int i6 = iVar.mPosition;
                if (i6 >= i3) {
                    iVar.offsetPosition(-i2, z);
                } else if (i6 >= i) {
                    iVar.addFlags(8);
                    gVar.h(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x015a, code lost:
    
        if (r16 > 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0167, code lost:
    
        if (r5 > 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x016a, code lost:
    
        if (r16 < 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x016d, code lost:
    
        if (r5 < 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0175, code lost:
    
        if ((r5 * r6) <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x017d, code lost:
    
        if ((r5 * r6) >= 0) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010c  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r19, int r20) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0() {
        this.F++;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        f fVar = this.n;
        if (fVar != null) {
            return fVar.generateDefaultLayoutParams();
        }
        qp2.n("RecyclerView has no LayoutManager".concat(F()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        f fVar = this.n;
        if (fVar != null) {
            return fVar.generateLayoutParams(getContext(), attributeSet);
        }
        qp2.n("RecyclerView has no LayoutManager".concat(F()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        f fVar = this.n;
        if (fVar != null) {
            return fVar.generateLayoutParams(layoutParams);
        }
        qp2.n("RecyclerView has no LayoutManager".concat(F()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        f fVar = this.n;
        return fVar != null ? fVar.getBaseline() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        StackLayoutManager stackLayoutManager = this.o0;
        if (stackLayoutManager == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        stackLayoutManager.getClass();
        return (i - i2) - 1;
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.h;
    }

    public final void h0(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.F - 1;
        this.F = i2;
        if (i2 < 1) {
            this.F = 0;
            if (z) {
                int i3 = this.z;
                this.z = 0;
                if (i3 != 0 && (accessibilityManager = this.B) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.u0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    i iVar = (i) arrayList.get(size);
                    if (iVar.itemView.getParent() == this && !iVar.shouldIgnore() && (i = iVar.mPendingAccessibilityState) != -1) {
                        iVar.itemView.setImportantForAccessibility(i);
                        iVar.mPendingAccessibilityState = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return Y().A(0);
    }

    public final void i0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.O) {
            int i = actionIndex == 0 ? 1 : 0;
            this.O = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.S = x;
            this.Q = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.T = y;
            this.R = y;
        }
    }

    public void invalidateGlows() {
        this.L = null;
        this.J = null;
        this.K = null;
        this.I = null;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return Y().b;
    }

    public final void j0() {
        if (this.m0 || !this.s) {
            return;
        }
        WeakHashMap weakHashMap = r5n.a;
        postOnAnimation(this.v0);
        this.m0 = true;
    }

    public final void k0() {
        boolean z;
        boolean z2 = this.D;
        pr prVar = this.e;
        boolean z3 = false;
        if (z2) {
            prVar.x((ArrayList) prVar.c);
            prVar.x((ArrayList) prVar.d);
            prVar.a = 0;
            if (this.E) {
                this.n.onItemsChanged(this);
            }
        }
        if (this.M != null && this.n.supportsPredictiveItemAnimations()) {
            prVar.v();
        } else {
            prVar.h();
        }
        boolean z4 = this.j0 || this.k0;
        boolean z5 = this.u && this.M != null && ((z = this.D) || z4 || this.n.mRequestedSimpleAnimations) && (!z || this.m.hasStableIds());
        vph vphVar = this.h0;
        vphVar.j = z5;
        if (z5 && z4 && !this.D && this.M != null && this.n.supportsPredictiveItemAnimations()) {
            z3 = true;
        }
        vphVar.k = z3;
    }

    public final void l(i iVar) {
        View view = iVar.itemView;
        boolean z = view.getParent() == this;
        this.c.m(T(view));
        boolean zIsTmpDetached = iVar.isTmpDetached();
        zv4 zv4Var = this.f;
        if (zIsTmpDetached) {
            zv4Var.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            zv4Var.a(view, -1, true);
            return;
        }
        int iIndexOfChild = ((RecyclerView) zv4Var.a.b).indexOfChild(view);
        if (iIndexOfChild < 0) {
            s49.l(view, "view is not a child, cannot hide ");
        } else {
            zv4Var.b.t(iIndexOfChild);
            zv4Var.i(view);
        }
    }

    public final void l0(boolean z) {
        this.E |= z;
        this.D = true;
        zv4 zv4Var = this.f;
        int iH = zv4Var.h();
        for (int i = 0; i < iH; i++) {
            i iVarU = U(zv4Var.g(i));
            if (iVarU != null && !iVarU.shouldIgnore()) {
                iVarU.addFlags(6);
            }
        }
        d0();
        g gVar = this.c;
        ArrayList arrayList = gVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = (i) arrayList.get(i2);
            if (iVar != null) {
                iVar.addFlags(6);
                iVar.addChangePayload(null);
            }
        }
        d dVar = gVar.g.m;
        if (dVar == null || !dVar.hasStableIds()) {
            gVar.g();
        }
    }

    public final void m(iph iphVar) {
        f fVar = this.n;
        if (fVar != null) {
            fVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(iphVar);
        d0();
        requestLayout();
    }

    public final void m0(i iVar, fr frVar) {
        iVar.setFlags(0, 8192);
        boolean z = this.h0.h;
        ivg ivgVar = this.g;
        if (z && iVar.isUpdated() && !iVar.isRemoved() && !iVar.shouldIgnore()) {
            ((j1d) ivgVar.c).g(R(iVar), iVar);
        }
        hkj hkjVar = (hkj) ivgVar.b;
        f7n f7nVarA = (f7n) hkjVar.get(iVar);
        if (f7nVarA == null) {
            f7nVarA = f7n.a();
            hkjVar.put(iVar, f7nVarA);
        }
        f7nVarA.b = frVar;
        f7nVarA.a |= 4;
    }

    public final void n(nph nphVar) {
        this.q.add(nphVar);
    }

    public final void n0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.I.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void o(oph ophVar) {
        ArrayList arrayList = this.i0;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.i0 = arrayList;
        }
        arrayList.add(ophVar);
    }

    public final int o0(float f, int i) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.I;
        float f2 = 0.0f;
        if (edgeEffect == null || sgb.E(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.K;
            if (edgeEffect2 != null && sgb.E(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.K;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fT = sgb.T(edgeEffect3, width, height);
                    if (sgb.E(this.K) == 0.0f) {
                        this.K.onRelease();
                    }
                    f2 = fT;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.I;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -sgb.T(edgeEffect4, -width, 1.0f - height);
                if (sgb.E(this.I) == 0.0f) {
                    this.I.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.F = r0
            r1 = 1
            r5.s = r1
            boolean r2 = r5.u
            if (r2 == 0) goto L13
            boolean r2 = r5.isLayoutRequested()
            if (r2 == 0) goto L14
        L13:
            r1 = r0
        L14:
            r5.u = r1
            androidx.recyclerview.widget.g r1 = r5.c
            r1.e()
            androidx.recyclerview.widget.f r1 = r5.n
            if (r1 == 0) goto L22
            r1.dispatchAttachedToWindow(r5)
        L22:
            r5.m0 = r0
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.b.e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.b r1 = (androidx.recyclerview.widget.b) r1
            r5.f0 = r1
            if (r1 != 0) goto L5d
            androidx.recyclerview.widget.b r1 = new androidx.recyclerview.widget.b
            r1.<init>()
            r5.f0 = r1
            java.util.WeakHashMap r1 = defpackage.r5n.a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4f
            if (r1 == 0) goto L4f
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L51
        L4f:
            r1 = 1114636288(0x42700000, float:60.0)
        L51:
            androidx.recyclerview.widget.b r2 = r5.f0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.c = r3
            r0.set(r2)
        L5d:
            androidx.recyclerview.widget.b r0 = r5.f0
            r0.getClass()
            java.util.ArrayList r0 = r0.a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.M;
        if (eVar != null) {
            eVar.f();
        }
        L0();
        this.s = false;
        f fVar = this.n;
        g gVar = this.c;
        if (fVar != null) {
            fVar.dispatchDetachedFromWindow(this, gVar);
        }
        this.u0.clear();
        removeCallbacks(this.v0);
        this.g.getClass();
        while (f7n.d.a() != null) {
        }
        ArrayList arrayList = gVar.c;
        for (int i = 0; i < arrayList.size(); i++) {
            z5i.r(((i) arrayList.get(i)).itemView);
        }
        gVar.f(gVar.g.m, false);
        Iterator it = new g6n(this).iterator();
        while (true) {
            h6n h6nVar = (h6n) it;
            if (!h6nVar.hasNext()) {
                break;
            }
            ArrayList arrayList2 = z5i.J((View) h6nVar.next()).a;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((t5n) arrayList2.get(size)).a.e();
                }
            }
        }
        b bVar = this.f0;
        if (bVar != null) {
            bVar.a.remove(this);
            this.f0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((iph) arrayList.get(i)).onDraw(canvas, this, this.h0);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        float axisValue;
        if (this.n != null && !this.x && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f = this.n.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                z = false;
                axisValue = this.n.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
                f = f;
                i = 0;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                i = 26;
                axisValue = motionEvent.getAxisValue(26);
                if (this.n.canScrollVertically()) {
                    float f2 = -axisValue;
                    axisValue = 0.0f;
                    f = f2;
                } else if (!this.n.canScrollHorizontally()) {
                    axisValue = 0.0f;
                }
                z = this.z0;
            } else {
                i = 0;
                z = false;
                axisValue = 0.0f;
            }
            int i2 = (int) (f * this.c0);
            int i3 = (int) (axisValue * this.b0);
            if (z) {
                OverScroller overScroller = this.e0.c;
                G0((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, true);
            } else {
                e0(i3, i2, motionEvent);
            }
            if (i != 0 && !z) {
                this.B0.a(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.x) {
            this.r = null;
            if (J(motionEvent)) {
                cancelScroll();
                return true;
            }
            f fVar = this.n;
            if (fVar != null) {
                boolean zCanScrollHorizontally = fVar.canScrollHorizontally();
                boolean zCanScrollVertically = this.n.canScrollVertically();
                VelocityTracker velocityTrackerObtain = this.P;
                if (velocityTrackerObtain == null) {
                    velocityTrackerObtain = VelocityTracker.obtain();
                    this.P = velocityTrackerObtain;
                }
                velocityTrackerObtain.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.y) {
                        this.y = false;
                    }
                    this.O = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.S = x;
                    this.Q = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.T = y;
                    this.R = y;
                    EdgeEffect edgeEffect = this.I;
                    if (edgeEffect == null || sgb.E(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        sgb.T(this.I, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.K;
                    if (edgeEffect2 != null && sgb.E(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        sgb.T(this.K, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.J;
                    if (edgeEffect3 != null && sgb.E(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        sgb.T(this.J, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.L;
                    if (edgeEffect4 != null && sgb.E(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        sgb.T(this.L, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.N == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        E0(1);
                        Y().K(1);
                    }
                    int[] iArr = this.s0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    J0(0);
                } else if (actionMasked == 1) {
                    this.P.clear();
                    Y().K(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.O);
                    if (iFindPointerIndex >= 0) {
                        int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        if (this.N != 1) {
                            int i = x2 - this.Q;
                            int i2 = y2 - this.R;
                            int i3 = this.U;
                            if (!zCanScrollHorizontally || Math.abs(i) <= i3) {
                                z2 = false;
                            } else {
                                this.S = x2;
                                z2 = true;
                            }
                            if (zCanScrollVertically && Math.abs(i2) > i3) {
                                this.T = y2;
                                z2 = true;
                            }
                            if (z2) {
                                E0(1);
                            }
                        }
                    }
                } else if (actionMasked == 3) {
                    cancelScroll();
                } else if (actionMasked == 5) {
                    this.O = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.S = x3;
                    this.Q = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.T = y3;
                    this.R = y3;
                } else if (actionMasked == 6) {
                    i0(motionEvent);
                }
                if (this.N == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        x();
        Trace.endSection();
        this.u = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        f fVar = this.n;
        if (fVar == null) {
            v(i, i2);
            return;
        }
        boolean zIsAutoMeasureEnabled = fVar.isAutoMeasureEnabled();
        g gVar = this.c;
        boolean z = false;
        vph vphVar = this.h0;
        if (zIsAutoMeasureEnabled) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.n.onMeasure(gVar, vphVar, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.w0 = z;
            if (z || this.m == null) {
                return;
            }
            if (vphVar.d == 1) {
                y();
            }
            this.n.setMeasureSpecs(i, i2);
            vphVar.i = true;
            z();
            this.n.setMeasuredDimensionFromChildren(i, i2);
            if (this.n.shouldMeasureTwice()) {
                this.n.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                vphVar.i = true;
                z();
                this.n.setMeasuredDimensionFromChildren(i, i2);
            }
            this.x0 = getMeasuredWidth();
            this.y0 = getMeasuredHeight();
            return;
        }
        if (this.t) {
            this.n.onMeasure(gVar, vphVar, i, i2);
            return;
        }
        if (this.A) {
            I0();
            g0();
            k0();
            h0(true);
            if (vphVar.k) {
                vphVar.g = true;
            } else {
                this.e.h();
                vphVar.g = false;
            }
            this.A = false;
            K0(false);
        } else if (vphVar.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        d dVar = this.m;
        if (dVar != null) {
            vphVar.e = dVar.getItemCount();
        } else {
            vphVar.e = 0;
        }
        I0();
        this.n.onMeasure(gVar, vphVar, i, i2);
        K0(false);
        vphVar.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (b0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof qph)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        qph qphVar = (qph) parcelable;
        this.d = qphVar;
        super.onRestoreInstanceState(qphVar.a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        qph qphVar = new qph(super.onSaveInstanceState());
        qph qphVar2 = this.d;
        if (qphVar2 != null) {
            qphVar.c = qphVar2.c;
            return qphVar;
        }
        f fVar = this.n;
        if (fVar != null) {
            qphVar.c = fVar.onSaveInstanceState();
            return qphVar;
        }
        qphVar.c = null;
        return qphVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4 A[PHI: r8
      0x00d4: PHI (r8v7 int) = (r8v2 int), (r8v11 int) binds: [B:46:0x00c1, B:50:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(String str) {
        if (!b0()) {
            if (this.G > 0) {
                new IllegalStateException(F());
            }
        } else if (str == null) {
            qp2.n("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(F()));
        } else {
            qp2.n(str);
        }
    }

    public final int p0(float f, int i) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.J;
        float f2 = 0.0f;
        if (edgeEffect == null || sgb.E(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.L;
            if (edgeEffect2 != null && sgb.E(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.L;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fT = sgb.T(edgeEffect3, height, 1.0f - width);
                    if (sgb.E(this.L) == 0.0f) {
                        this.L.onRelease();
                    }
                    f2 = fT;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.J;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -sgb.T(edgeEffect4, -height, width);
                if (sgb.E(this.J) == 0.0f) {
                    this.J.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    public final void q0(iph iphVar) {
        f fVar = this.n;
        if (fVar != null) {
            fVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.p;
        arrayList.remove(iphVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        d0();
        requestLayout();
    }

    public final void r() {
        zv4 zv4Var = this.f;
        int iH = zv4Var.h();
        for (int i = 0; i < iH; i++) {
            i iVarU = U(zv4Var.g(i));
            if (!iVarU.shouldIgnore()) {
                iVarU.clearOldPosition();
            }
        }
        g gVar = this.c;
        ArrayList arrayList = gVar.a;
        ArrayList arrayList2 = gVar.c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((i) arrayList2.get(i2)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((i) arrayList.get(i3)).clearOldPosition();
        }
        ArrayList arrayList3 = gVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((i) gVar.b.get(i4)).clearOldPosition();
            }
        }
    }

    public final void r0(int i) {
        int size = this.p.size();
        if (i >= 0 && i < size) {
            q0(X(i));
            return;
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + size);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        i iVarU = U(view);
        if (iVarU != null) {
            if (iVarU.isTmpDetached()) {
                iVarU.clearTmpDetachFlag();
            } else if (!iVarU.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + iVarU + F());
            }
        }
        view.clearAnimation();
        w(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.n.onRequestChildFocus(this, this.h0, view, view2) && view2 != null) {
            u0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.n.requestChildRectangleOnScreen(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((nph) arrayList.get(i)).c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.v != 0 || this.x) {
            this.w = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.I.onRelease();
            zIsFinished = this.I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.K.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.J.onRelease();
            zIsFinished |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.L.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void s0(nph nphVar) {
        this.q.remove(nphVar);
        if (this.r == nphVar) {
            this.r = null;
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        f fVar = this.n;
        if (fVar == null || this.x) {
            return;
        }
        boolean zCanScrollHorizontally = fVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.n.canScrollVertically();
        if (!zCanScrollHorizontally) {
            if (!zCanScrollVertically) {
                return;
            } else {
                i = 0;
            }
        }
        if (!zCanScrollVertically) {
            i2 = 0;
        }
        v0(i, i2, null, 0);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!b0()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.z |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.h) {
            invalidateGlows();
        }
        this.h = z;
        super.setClipToPadding(z);
        if (this.u) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            qp2.o("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        s14 s14VarY = Y();
        if (s14VarY.b) {
            ViewGroup viewGroup = (ViewGroup) s14VarY.e;
            WeakHashMap weakHashMap = r5n.a;
            viewGroup.stopNestedScroll();
        }
        s14VarY.b = z;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return Y().J(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        Y().K(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.x) {
            p("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.x = true;
                this.y = true;
                L0();
                return;
            }
            this.x = false;
            if (this.w && this.n != null && this.m != null) {
                requestLayout();
            }
            this.w = false;
        }
    }

    public final void t0(oph ophVar) {
        ArrayList arrayList = this.i0;
        if (arrayList != null) {
            arrayList.remove(ophVar);
        }
    }

    public final void u() {
        if (!this.u || this.D) {
            Trace.beginSection("RV FullInvalidate");
            x();
            Trace.endSection();
            return;
        }
        pr prVar = this.e;
        if (prVar.s()) {
            int i = prVar.a;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (prVar.s()) {
                    Trace.beginSection("RV FullInvalidate");
                    x();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            I0();
            g0();
            prVar.v();
            if (!this.w) {
                zv4 zv4Var = this.f;
                int iE = zv4Var.e();
                int i2 = 0;
                while (true) {
                    if (i2 < iE) {
                        i iVarU = U(zv4Var.d(i2));
                        if (iVarU != null && !iVarU.shouldIgnore() && iVarU.isUpdated()) {
                            x();
                            break;
                        }
                        i2++;
                    } else {
                        prVar.g();
                        break;
                    }
                }
            }
            K0(true);
            h0(true);
            Trace.endSection();
        }
    }

    public final void u0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof lph) {
            lph lphVar = (lph) layoutParams;
            if (!lphVar.c) {
                Rect rect2 = lphVar.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.n.requestChildRectangleOnScreen(this, view, this.j, !this.u, view2 == null);
    }

    public final void v(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = r5n.a;
        setMeasuredDimension(f.chooseSize(i, paddingRight, getMinimumWidth()), f.chooseSize(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v0(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void w(View view) {
        i iVarU = U(view);
        d dVar = this.m;
        if (dVar != null && iVarU != null) {
            dVar.onViewDetachedFromWindow(iVarU);
        }
        ArrayList arrayList = this.C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((mph) this.C.get(size)).a(view);
            }
        }
    }

    public final void w0(int i, int i2, int[] iArr) {
        i iVar;
        I0();
        g0();
        Trace.beginSection("RV Scroll");
        vph vphVar = this.h0;
        G(vphVar);
        g gVar = this.c;
        int iScrollHorizontallyBy = i != 0 ? this.n.scrollHorizontallyBy(i, gVar, vphVar) : 0;
        int iScrollVerticallyBy = i2 != 0 ? this.n.scrollVerticallyBy(i2, gVar, vphVar) : 0;
        Trace.endSection();
        zv4 zv4Var = this.f;
        int iE = zv4Var.e();
        for (int i3 = 0; i3 < iE; i3++) {
            View viewD = zv4Var.d(i3);
            i iVarT = T(viewD);
            if (iVarT != null && (iVar = iVarT.mShadowingHolder) != null) {
                View view = iVar.itemView;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        h0(true);
        K0(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03cf  */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [int] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.x():void");
    }

    public final void x0(int i) {
        if (this.x) {
            return;
        }
        L0();
        f fVar = this.n;
        if (fVar == null) {
            return;
        }
        fVar.scrollToPosition(i);
        awakenScrollBars();
    }

    public final void y() {
        f7n f7nVar;
        View viewI;
        vph vphVar = this.h0;
        vphVar.a(1);
        G(vphVar);
        vphVar.i = false;
        I0();
        ivg ivgVar = this.g;
        hkj hkjVar = (hkj) ivgVar.b;
        hkj hkjVar2 = (hkj) ivgVar.b;
        hkjVar.clear();
        j1d j1dVar = (j1d) ivgVar.c;
        j1dVar.b();
        g0();
        k0();
        i iVarT = null;
        View focusedChild = (this.d0 && hasFocus() && this.m != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewI = I(focusedChild)) != null) {
            iVarT = T(viewI);
        }
        if (iVarT == null) {
            vphVar.m = -1L;
            vphVar.l = -1;
            vphVar.n = -1;
        } else {
            vphVar.m = this.m.hasStableIds() ? iVarT.getItemId() : -1L;
            vphVar.l = this.D ? -1 : iVarT.isRemoved() ? iVarT.mOldPosition : iVarT.getAbsoluteAdapterPosition();
            View focusedChild2 = iVarT.itemView;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            vphVar.n = id;
        }
        vphVar.h = vphVar.j && this.k0;
        this.k0 = false;
        this.j0 = false;
        vphVar.g = vphVar.k;
        vphVar.e = this.m.getItemCount();
        K(this.p0);
        boolean z = vphVar.j;
        zv4 zv4Var = this.f;
        if (z) {
            int iE = zv4Var.e();
            for (int i = 0; i < iE; i++) {
                i iVarU = U(zv4Var.d(i));
                if (!iVarU.shouldIgnore() && (!iVarU.isInvalid() || this.m.hasStableIds())) {
                    fr frVarI = this.M.i(vphVar, iVarU, e.a(iVarU), iVarU.getUnmodifiedPayloads());
                    f7n f7nVarA = (f7n) hkjVar2.get(iVarU);
                    if (f7nVarA == null) {
                        f7nVarA = f7n.a();
                        hkjVar2.put(iVarU, f7nVarA);
                    }
                    f7nVarA.b = frVarI;
                    f7nVarA.a |= 4;
                    if (vphVar.h && iVarU.isUpdated() && !iVarU.isRemoved() && !iVarU.shouldIgnore() && !iVarU.isInvalid()) {
                        j1dVar.g(R(iVarU), iVarU);
                    }
                }
            }
        }
        if (vphVar.k) {
            int iH = zv4Var.h();
            for (int i2 = 0; i2 < iH; i2++) {
                i iVarU2 = U(zv4Var.g(i2));
                if (!iVarU2.shouldIgnore()) {
                    iVarU2.saveOldPosition();
                }
            }
            boolean z2 = vphVar.f;
            vphVar.f = false;
            this.n.onLayoutChildren(this.c, vphVar);
            vphVar.f = z2;
            for (int i3 = 0; i3 < zv4Var.e(); i3++) {
                i iVarU3 = U(zv4Var.d(i3));
                if (!iVarU3.shouldIgnore() && ((f7nVar = (f7n) hkjVar2.get(iVarU3)) == null || (f7nVar.a & 4) == 0)) {
                    int iA = e.a(iVarU3);
                    boolean zHasAnyOfTheFlags = iVarU3.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iA |= 4096;
                    }
                    fr frVarI2 = this.M.i(vphVar, iVarU3, iA, iVarU3.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        m0(iVarU3, frVarI2);
                    } else {
                        f7n f7nVarA2 = (f7n) hkjVar2.get(iVarU3);
                        if (f7nVarA2 == null) {
                            f7nVarA2 = f7n.a();
                            hkjVar2.put(iVarU3, f7nVarA2);
                        }
                        f7nVarA2.a |= 2;
                        f7nVarA2.b = frVarI2;
                    }
                }
            }
            r();
        } else {
            r();
        }
        h0(true);
        K0(false);
        vphVar.d = (byte) 2;
    }

    public final void y0(d dVar) {
        suppressLayout(false);
        z0(dVar, false, true);
        l0(false);
        requestLayout();
    }

    public final void z() {
        I0();
        g0();
        vph vphVar = this.h0;
        vphVar.a(6);
        this.e.h();
        vphVar.e = this.m.getItemCount();
        vphVar.c = 0;
        if (this.d != null && this.m.canRestoreState()) {
            Parcelable parcelable = this.d.c;
            if (parcelable != null) {
                this.n.onRestoreInstanceState(parcelable);
            }
            this.d = null;
        }
        vphVar.g = false;
        this.n.onLayoutChildren(this.c, vphVar);
        vphVar.f = false;
        vphVar.j = vphVar.j && this.M != null;
        vphVar.d = (byte) 4;
        h0(true);
        K0(false);
    }

    public final void z0(d dVar, boolean z, boolean z2) {
        d dVar2 = this.m;
        a83 a83Var = this.b;
        if (dVar2 != null) {
            dVar2.unregisterAdapterDataObserver(a83Var);
            this.m.onDetachedFromRecyclerView(this);
        }
        g gVar = this.c;
        if (!z || z2) {
            e eVar = this.M;
            if (eVar != null) {
                eVar.f();
            }
            f fVar = this.n;
            if (fVar != null) {
                fVar.removeAndRecycleAllViews(gVar);
                this.n.removeAndRecycleScrapInt(gVar);
            }
            gVar.a.clear();
            gVar.g();
        }
        pr prVar = this.e;
        prVar.x((ArrayList) prVar.c);
        prVar.x((ArrayList) prVar.d);
        prVar.a = 0;
        d dVar3 = this.m;
        this.m = dVar;
        if (dVar != null) {
            dVar.registerAdapterDataObserver(a83Var);
            dVar.onAttachedToRecyclerView(this);
        }
        f fVar2 = this.n;
        if (fVar2 != null) {
            fVar2.onAdapterChanged(dVar3, this.m);
        }
        d dVar4 = this.m;
        gVar.a.clear();
        gVar.g();
        gVar.f(dVar3, true);
        ro9 ro9VarC = gVar.c();
        if (dVar3 != null) {
            ro9VarC.b--;
        }
        if (!z && ro9VarC.b == 0) {
            ro9VarC.f();
        }
        if (dVar4 != null) {
            ro9VarC.b++;
        } else {
            ro9VarC.getClass();
        }
        gVar.e();
        this.h0.f = true;
    }
}
