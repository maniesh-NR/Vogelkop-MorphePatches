package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v31 extends ViewGroup implements as6, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, cg9 {
    public static Class G0;
    public static Method H0;
    public static Method I0;
    public static final dee J0 = new dee();
    public static rl K0;
    public static Method L0;
    public dee A;
    public final i31 A0;
    public boolean B;
    public boolean B0;
    public boolean C;
    public boolean C0;
    public final cae D;
    public final foi D0;
    public final s14 E;
    public View E0;
    public final t0g F;
    public final s31 F0;
    public final i37 G;
    public final d5o H;
    public final p21 I;
    public boolean J;
    public final p12 K;
    public boolean L;
    public nc1 M;
    public yo5 N;
    public boolean O;
    public final d37 P;
    public long Q;
    public final int[] R;
    public final float[] S;
    public final Matrix T;
    public final float[] U;
    public final float[] V;
    public long W;
    public final t0g a;
    public boolean a0;
    public long b;
    public long b0;
    public final boolean c;
    public gil c0;
    public y7o d;
    public cjl d0;
    public sdc e;
    public ajl e0;
    public yb7 f;
    public final AtomicReference f0;
    public g1i g;
    public r17 g0;
    public final i72 h;
    public final t0g h0;
    public final n31 i;
    public final t0g i0;
    public final t0g j;
    public c9b j0;
    public final View k;
    public final hd k0;
    public final gg9 l;
    public jb1 l0;
    public CoroutineContext m;
    public MotionEvent m0;
    public final p51 n;
    public long n0;
    public final t0g o;
    public final wzg o0;
    public final i37 p;
    public final dee p0;
    public final v9b q;
    public float q0;
    public final m3c r;
    public float r0;
    public final jde s;
    public float s0;
    public final yoh t;
    public float t0;
    public final i3j u;
    public final ig u0;
    public final b41 v;
    public final n31 v0;
    public final o41 w;
    public boolean w0;
    public final a71 x;
    public final o31 x0;
    public final zu2 y;
    public final vr3 y0;
    public final dee z;
    public final i31 z0;

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    public v31(Context context, fh5 fh5Var) throws pxb {
        super(context);
        this.a = hyg.k(fh5Var);
        this.b = 9205357640488583168L;
        byte b = 1;
        this.c = true;
        this.g = ulp.g;
        this.h = new i72();
        byte b2 = 0;
        this.i = new n31(this, b2);
        this.j = new t0g(fsp.a(context), ujp.n);
        gg9 gg9Var = new gg9(this, this);
        this.l = gg9Var;
        fh5Var.e();
        this.m = fh5Var.c.j();
        p51 p51Var = new p51();
        this.n = p51Var;
        this.o = hyg.k(Boolean.FALSE);
        this.p = luj.b(new i31(this, (byte) 2));
        this.q = new v9b();
        m3c m3cVar = new m3c(3);
        m3cVar.d0(w7i.c);
        m3cVar.a0(h());
        m3cVar.f0(o().r);
        m3cVar.e0(new t31(this).d(gg9Var.e).d(p51Var.c));
        this.r = m3cVar;
        jde jdeVar = xbb.a;
        jde jdeVar2 = new jde();
        this.s = jdeVar2;
        yoh yohVar = new yoh(jdeVar2, this);
        this.t = yohVar;
        t08 t08Var = new t08();
        i3j i3jVar = new i3j();
        i3jVar.a = m3cVar;
        i3jVar.b = t08Var;
        i3jVar.c = jdeVar2;
        i3jVar.d = new dee(2);
        this.u = i3jVar;
        b41 b41Var = new b41(this);
        this.v = b41Var;
        o41 o41Var = new o41(this, new q2(0, this, i41.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, (byte) 3));
        this.w = o41Var;
        this.x = new a71(this);
        zu2 zu2Var = new zu2((byte) 0);
        this.y = zu2Var;
        this.z = new dee();
        this.D = new cae();
        this.E = new s14(m3cVar);
        this.F = hyg.k(new Configuration(context.getResources().getConfiguration()));
        this.G = luj.b(new i31(this, (byte) 3));
        d5o d5oVar = new d5o();
        d5oVar.a = this;
        d5oVar.b = zu2Var;
        setImportantForAutofill(1);
        AutofillId autofillId = getAutofillId();
        if (autofillId == null) {
            throw vep.q("Required value was null.");
        }
        d5oVar.c = autofillId;
        this.H = d5oVar;
        this.I = new p21(new s6h(context), i3jVar, this, yohVar, context.getPackageName());
        h31 h31Var = new h31(this, b);
        p12 p12Var = new p12();
        p12Var.a = new tuj(h31Var);
        p12Var.b = new w5f((byte) 15);
        p12Var.c = new w5f((byte) 16);
        p12Var.d = new w5f((byte) 17);
        p12Var.e = new w5f((byte) 18);
        p12Var.f = new w5f((byte) 19);
        p12Var.g = new w5f((byte) 20);
        p12Var.h = new w5f((byte) 21);
        this.K = p12Var;
        d37 d37Var = new d37();
        d37Var.c = m3cVar;
        d37Var.d = new d5o((byte) 29);
        d37Var.e = new s6h((byte) 26);
        d37Var.f = new dfe(new m3c[16]);
        d37Var.g = new dfe(new qfd[16]);
        this.P = d37Var;
        this.Q = 9223372034707292159L;
        this.R = new int[]{0, 0};
        this.S = afd.a();
        this.T = new Matrix();
        this.U = afd.a();
        this.V = afd.a();
        this.W = -1L;
        this.b0 = 9187343241974906880L;
        this.f0 = new AtomicReference(null);
        this.h0 = fh5Var.p;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = ag9.a;
        d2c d2cVar = layoutDirection != 0 ? layoutDirection != 1 ? null : d2c.b : d2c.a;
        this.i0 = hyg.k(d2cVar == null ? d2c.a : d2cVar);
        this.k0 = new hd(this);
        this.o0 = new wzg((byte) 13);
        this.p0 = new dee();
        this.q0 = Float.NaN;
        this.r0 = Float.NaN;
        this.s0 = Float.NaN;
        this.t0 = Float.NaN;
        this.u0 = new ig(this, (byte) 3);
        this.v0 = new n31(this, b);
        this.x0 = new o31(this, b2);
        h31 h31Var2 = new h31(this, (byte) 2);
        vr3 vr3Var = new vr3();
        vr3Var.c = h31Var2;
        vr3Var.a = 0;
        vr3Var.d = new GestureDetector(context, new w6b(vr3Var));
        this.y0 = vr3Var;
        this.z0 = new i31(this, (byte) 4);
        this.A0 = new i31(this, b2);
        addOnAttachStateChangeListener(o41Var);
        setWillNotDraw(false);
        setFocusable(true);
        h41.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        r5n.l(this, b41Var);
        setOnDragListener(p51Var);
        c41.a.a(this);
        if (s()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(2131363113, Boolean.TRUE);
            this.k = view;
            addView(view, -1);
        }
        this.D0 = Build.VERSION.SDK_INT >= 31 ? new foi((byte) 0) : null;
        this.F0 = new s31(this);
    }

    public static void c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof v31) {
                ((v31) childAt).B();
            } else if (childAt instanceof ViewGroup) {
                c((ViewGroup) childAt);
            }
        }
    }

    public static long d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            igm igmVar = jgm.b;
            return size;
        }
        if (mode == 0) {
            igm igmVar2 = jgm.b;
            return 2147483647L;
        }
        if (mode != 1073741824) {
            h9o.e();
            return 0L;
        }
        long j = size;
        igm igmVar3 = jgm.b;
        return (j << 32) | j;
    }

    public static final boolean e(v31 v31Var, KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public static void q(m3c m3cVar) {
        m3cVar.D();
        dfe dfeVarZ = m3cVar.z();
        Object[] objArr = dfeVarZ.a;
        int i = dfeVarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            q((m3c) objArr[i2]);
        }
    }

    public static boolean s() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean t(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || !dae.a.a(motionEvent, i);
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    public final boolean A(int i) throws pxb {
        if (i != 7 && i != 8) {
            Integer numC = ag9.c(i);
            if (numC == null) {
                throw vep.q("Invalid focus direction");
            }
            int iIntValue = numC.intValue();
            vg9 vg9VarF = this.l.f();
            if (vg9VarF == null) {
                qp2.n("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer numC2 = ag9.c(i);
            if (numC2 == null) {
                throw vep.q("Invalid focus direction");
            }
            int iIntValue2 = numC2.intValue();
            c6n c6nVar = ui6.e0(vg9VarF).o;
            View view = c6nVar != null ? c6nVar.b : null;
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), findFocus(), iIntValue2);
            if (viewFindNextFocus == null || view == null || !i41.o(view, viewFindNextFocus)) {
                viewFindNextFocus = null;
            }
            if (viewFindNextFocus != null) {
                return ag9.b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
            }
        }
        return false;
    }

    public final void B() {
        dee deeVar;
        Object[] objArr;
        if (this.J) {
            tuj tujVar = (tuj) this.K.a;
            w5f w5fVar = new w5f((byte) 22);
            synchronized (tujVar.i) {
                dfe dfeVar = (dfe) tujVar.h;
                int i = dfeVar.c;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    objArr = dfeVar.a;
                    if (i2 >= i) {
                        break;
                    }
                    suj sujVar = (suj) objArr[i2];
                    sujVar.d(w5fVar);
                    if (!sujVar.f.j()) {
                        i3++;
                    } else if (i3 > 0) {
                        Object[] objArr2 = dfeVar.a;
                        objArr2[i2 - i3] = objArr2[i2];
                    }
                    i2++;
                }
                int i4 = i - i3;
                Arrays.fill(objArr, i4, i, (Object) null);
                dfeVar.c = i4;
            }
            this.J = false;
        }
        nc1 nc1Var = this.M;
        if (nc1Var != null) {
            c(nc1Var);
        }
        p21 p21Var = this.I;
        if (p21Var != null) {
            kde kdeVar = p21Var.h;
            if (kdeVar.d == 0 && p21Var.i) {
                p21Var.a.J().commit();
                p21Var.i = false;
            }
            if (kdeVar.d != 0) {
                p21Var.i = true;
            }
        }
        while (this.p0.j() && this.p0.g(0) != null) {
            int i5 = this.p0.b;
            int i6 = 0;
            while (true) {
                deeVar = this.p0;
                if (i6 < i5) {
                    Function0 function0 = (Function0) deeVar.g(i6);
                    this.p0.o(i6, null);
                    if (function0 != null) {
                        function0.invoke();
                    }
                    i6++;
                }
            }
            deeVar.m(0, i5);
        }
    }

    public final void C(m3c m3cVar) {
        b41 b41Var = this.v;
        b41Var.x = true;
        if (b41Var.v()) {
            b41Var.w(m3cVar);
        }
        o41 o41Var = this.w;
        o41Var.f = true;
        if (o41Var.d()) {
            o41Var.g.b(Unit.a);
        }
    }

    public final void D(m3c m3cVar, boolean z, boolean z2, boolean z3) {
        m3c m3cVarU;
        m3c m3cVarU2;
        d37 d37Var = this.P;
        if (!z) {
            if (d37Var.A(m3cVar, z2) && z3) {
                M(m3cVar);
                return;
            }
            return;
        }
        d5o d5oVar = (d5o) d37Var.d;
        m3c m3cVar2 = m3cVar.h;
        q3c q3cVar = m3cVar.G;
        if (m3cVar2 == null) {
            a8b.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = q3cVar.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    h9o.p();
                    return;
                }
                if (!q3cVar.e || z2) {
                    q3cVar.e = true;
                    q3cVar.p.u = true;
                    if (m3cVar.Q) {
                        return;
                    }
                    if ((Intrinsics.a(m3cVar.J(), Boolean.TRUE) || d37.n(m3cVar)) && ((m3cVarU = m3cVar.u()) == null || !m3cVarU.G.e)) {
                        d5oVar.n(m3cVar, kjb.a);
                    } else if ((m3cVar.I() || d37.o(m3cVar)) && ((m3cVarU2 = m3cVar.u()) == null || !m3cVarU2.q())) {
                        d5oVar.n(m3cVar, kjb.c);
                    }
                    if (d37Var.b || !z3) {
                        return;
                    }
                    M(m3cVar);
                    return;
                }
                return;
            }
        }
        ((dfe) d37Var.g).c(new qfd(m3cVar, true, z2));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(defpackage.m3c r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v31.F(m3c, boolean, boolean):void");
    }

    public final void G() {
        b41 b41Var = this.v;
        b41Var.x = true;
        Handler handler = b41Var.d.getHandler();
        if (b41Var.v() && !b41Var.I && handler != null) {
            b41Var.I = true;
            handler.post(b41Var.K);
        }
        o41 o41Var = this.w;
        o41Var.f = true;
        Handler handler2 = o41Var.a.getHandler();
        if (!o41Var.d() || o41Var.l || handler2 == null) {
            return;
        }
        o41Var.l = true;
        handler2.post(o41Var.m);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(android.view.ViewStructure r14) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v31.H(android.view.ViewStructure):void");
    }

    public final void I() {
        if (this.a0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.W) {
            this.W = jCurrentAnimationTimeMillis;
            q84 q84Var = q84.a;
            Matrix matrix = this.T;
            float[] fArr = this.U;
            int[] iArr = this.R;
            q84Var.a(this, fArr, matrix, iArr);
            aib.y(fArr, this.V);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = iArr[0];
            float f4 = f2 - iArr[1];
            this.b0 = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
        }
    }

    public final void J(MotionEvent motionEvent) {
        this.W = AnimationUtils.currentAnimationTimeMillis();
        Matrix matrix = this.T;
        int[] iArr = this.R;
        q84 q84Var = q84.a;
        float[] fArr = this.U;
        q84Var.a(this, fArr, matrix, iArr);
        aib.y(fArr, this.V);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jB = afd.b(fArr, (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.b0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final boolean K() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void L(Function0 function0) {
        i72 i72Var = this.h;
        boolean zIsEmpty = i72Var.isEmpty();
        i72Var.addLast(function0);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.i);
            } else {
                qp2.o("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    public final void M(m3c m3cVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (m3cVar != null) {
            while (m3cVar != null && m3cVar.r() == k3c.a) {
                if (!this.O) {
                    m3c m3cVarU = m3cVar.u();
                    if (m3cVarU == null) {
                        break;
                    }
                    long j = ((j8b) m3cVarU.F.b).d;
                    if (yo5.f(j) && yo5.e(j)) {
                        break;
                    }
                }
                m3cVar = m3cVar.u();
            }
            if (m3cVar == this.r) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long N(long j) {
        I();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.b0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.b0 & 4294967295L));
        return afd.b(this.V, (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    public final int O(MotionEvent motionEvent) {
        Object obj;
        if (this.B0) {
            this.B0 = false;
            h7c h7cVar = o().t;
            d2o.a.setValue(new tmg(motionEvent.getMetaState()));
        }
        cae caeVar = this.D;
        k5o k5oVarC = caeVar.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        s14 s14Var = this.E;
        if (k5oVarC == null) {
            if (!s14Var.b) {
                ((j1d) ((lld) s14Var.e).b).b();
                ((lea) s14Var.d).c();
            }
            return 0;
        }
        ArrayList arrayList = (ArrayList) k5oVarC.b;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = arrayList.get(size);
                if (!((nmg) obj).e || (actionMasked != 0 && actionMasked != 5)) {
                    if (i < 0) {
                        break;
                    }
                    size = i;
                } else {
                    break;
                }
            }
            obj = null;
        } else {
            obj = null;
        }
        nmg nmgVar = (nmg) obj;
        if (nmgVar != null) {
            this.b = nmgVar.d;
        }
        int iF = s14Var.F(k5oVarC, this, u(motionEvent));
        k5oVarC.c = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iF & 1) != 0) {
            return iF;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        caeVar.c.delete(pointerId);
        caeVar.b.delete(pointerId);
        return iF;
    }

    public final void P(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || actionIndex > i4) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            long jX = x((Float.floatToRawIntBits(pointerCoords.x) << 32) | (Float.floatToRawIntBits(pointerCoords.y) & 4294967295L));
            pointerCoords.x = Float.intBitsToFloat((int) (jX >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jX & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        this.E.F(this.D.c(motionEventObtain, this), this, true);
        motionEventObtain.recycle();
    }

    public final void Q(fh5 fh5Var) {
        CoroutineContext coroutineContext = this.m;
        fh5Var.e();
        if (coroutineContext != fh5Var.c.j() && !((bee) this.r.n()).isEmpty()) {
            a8b.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        ttj ttjVarT = bwg.t();
        Function1 function1E = ttjVarT != null ? ttjVarT.e() : null;
        ttj ttjVarX = bwg.x(ttjVarT);
        try {
            fh5 fh5VarO = o();
            if (fh5Var != fh5VarO) {
                if (isAttachedToWindow()) {
                    fh5VarO.b();
                    fh5Var.c();
                }
                this.a.setValue(fh5Var);
                fh5Var.e();
                this.m = fh5Var.c.j();
            }
        } finally {
            bwg.A(ttjVarT, ttjVarX, function1E);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(s71 r9, nt5 r10) throws pxb {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.u31
            if (r0 == 0) goto L13
            r0 = r10
            u31 r0 = (defpackage.u31) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            u31 r0 = new u31
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2d
            if (r2 == r3) goto L29
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return
        L29:
            defpackage.ybh.y(r10)
            goto L4b
        L2d:
            defpackage.ybh.y(r10)
            r10 = r3
            h31 r3 = new h31
            r2 = 0
            r3.<init>(r8, r2)
            r0.v = r10
            jj4 r2 = new jj4
            r6 = 0
            r7 = 16
            java.util.concurrent.atomic.AtomicReference r4 = r8.f0
            r5 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r8 = defpackage.sgb.q(r2, r0)
            if (r8 != r1) goto L4b
            return
        L4b:
            defpackage.t3p.v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v31.R(s71, nt5):void");
    }

    public final void S(Configuration configuration) {
        t0g t0gVar = this.F;
        Configuration configuration2 = (Configuration) t0gVar.getValue();
        if (Intrinsics.a(configuration2, configuration)) {
            return;
        }
        t0gVar.setValue(new Configuration(configuration));
        if (configuration2.fontScale == configuration.fontScale && configuration2.densityDpi == configuration.densityDpi) {
            return;
        }
        this.j.setValue(fsp.a(getContext()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v31.T():void");
    }

    public final void U(float f) {
        if (s()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.q0) || f > this.q0) {
                    this.q0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.r0) || f < this.r0) {
                    this.r0 = f;
                }
            }
        }
    }

    @Override // defpackage.cg9
    public final void a(vg9 vg9Var, vg9 vg9Var2) throws pxb {
        tah tahVar;
        boolean z;
        tah tahVar2;
        boolean z2;
        if (vg9Var != null) {
            vg9 vg9Var3 = vg9Var;
            if (!vg9Var3.a.n) {
                a8b.b("visitAncestors called on an unattached node");
            }
            b8e b8eVar = vg9Var3.a;
            m3c m3cVarE0 = ui6.e0(vg9Var);
            tee teeVar = null;
            ArrayList arrayList = null;
            while (m3cVarE0 != null) {
                if ((((b8e) m3cVarE0.F.g).d & 2097152) != 0) {
                    while (b8eVar != null) {
                        if ((b8eVar.c & 2097152) != 0) {
                            b8e b8eVarU = b8eVar;
                            dfe dfeVar = null;
                            while (b8eVarU != null) {
                                if (b8eVarU instanceof v6b) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(b8eVarU);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (b8eVarU.c & 2097152) != 0 && (b8eVarU instanceof i17)) {
                                    int i = 0;
                                    for (b8e b8eVar2 = ((i17) b8eVarU).p; b8eVar2 != null; b8eVar2 = b8eVar2.f) {
                                        if ((b8eVar2.c & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                b8eVarU = b8eVar2;
                                            } else {
                                                if (dfeVar == null) {
                                                    dfeVar = new dfe(new b8e[16]);
                                                }
                                                if (b8eVarU != null) {
                                                    dfeVar.c(b8eVarU);
                                                    b8eVarU = null;
                                                }
                                                dfeVar.c(b8eVar2);
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                b8eVarU = ui6.U(dfeVar);
                            }
                        }
                        b8eVar = b8eVar.e;
                    }
                }
                m3cVarE0 = m3cVarE0.u();
                b8eVar = (m3cVarE0 == null || (tahVar2 = m3cVarE0.F) == null) ? null : (lbl) tahVar2.f;
            }
            if (arrayList != null) {
                if (vg9Var2 != null) {
                    if (!vg9Var2.a.n) {
                        a8b.b("visitAncestors called on an unattached node");
                    }
                    b8e b8eVar3 = vg9Var2.a;
                    m3c m3cVarE02 = ui6.e0(vg9Var2);
                    tee teeVar2 = null;
                    while (m3cVarE02 != null) {
                        if ((((b8e) m3cVarE02.F.g).d & 2097152) != 0) {
                            while (b8eVar3 != null) {
                                if ((b8eVar3.c & 2097152) != 0) {
                                    b8e b8eVarU2 = b8eVar3;
                                    dfe dfeVar2 = null;
                                    while (b8eVarU2 != null) {
                                        if (b8eVarU2 instanceof v6b) {
                                            if (teeVar2 == null) {
                                                tee teeVar3 = jmi.a;
                                                teeVar2 = new tee();
                                            }
                                            teeVar2.a(b8eVarU2);
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        if (z && (b8eVarU2.c & 2097152) != 0 && (b8eVarU2 instanceof i17)) {
                                            int i2 = 0;
                                            for (b8e b8eVar4 = ((i17) b8eVarU2).p; b8eVar4 != null; b8eVar4 = b8eVar4.f) {
                                                if ((b8eVar4.c & 2097152) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        b8eVarU2 = b8eVar4;
                                                    } else {
                                                        if (dfeVar2 == null) {
                                                            dfeVar2 = new dfe(new b8e[16]);
                                                        }
                                                        if (b8eVarU2 != null) {
                                                            dfeVar2.c(b8eVarU2);
                                                            b8eVarU2 = null;
                                                        }
                                                        dfeVar2.c(b8eVar4);
                                                    }
                                                }
                                            }
                                            if (i2 != 1) {
                                            }
                                        }
                                        b8eVarU2 = ui6.U(dfeVar2);
                                    }
                                }
                                b8eVar3 = b8eVar3.e;
                            }
                        }
                        m3cVarE02 = m3cVarE02.u();
                        b8eVar3 = (m3cVarE02 == null || (tahVar = m3cVarE02.F) == null) ? null : (lbl) tahVar.f;
                    }
                    teeVar = teeVar2;
                }
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    v6b v6bVar = (v6b) arrayList.get(i3);
                    if (!(teeVar != null ? teeVar.c(v6bVar) : false)) {
                        v6bVar.q0();
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        gg9 gg9Var = this.l;
        vg9 vg9Var = gg9Var.c;
        if (!vg9Var.n) {
            return;
        }
        if (!vg9Var.a.n) {
            a8b.b("visitSubtreeIf called on an unattached node");
        }
        dfe dfeVar = new dfe(new b8e[16]);
        b8e b8eVar = vg9Var.a;
        b8e b8eVar2 = b8eVar.f;
        if (b8eVar2 == null) {
            ui6.h(dfeVar, b8eVar);
        } else {
            dfeVar.c(b8eVar2);
        }
        while (true) {
            int i3 = dfeVar.c;
            if (i3 == 0) {
                return;
            }
            b8e b8eVar3 = (b8e) dfeVar.l(i3 - 1);
            if ((b8eVar3.d & 1024) != 0) {
                for (b8e b8eVar4 = b8eVar3; b8eVar4 != null && b8eVar4.n; b8eVar4 = b8eVar4.f) {
                    if ((b8eVar4.c & 1024) != 0) {
                        b8e b8eVarU = b8eVar4;
                        dfe dfeVar2 = null;
                        while (b8eVarU != null) {
                            int i4 = 0;
                            if (b8eVarU instanceof vg9) {
                                vg9 vg9Var2 = (vg9) b8eVarU;
                                if (vg9Var2.n && vg9Var2.V0().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    vg9 vg9Var3 = gg9Var.c;
                                    if (vg9Var3.n) {
                                        if (!vg9Var3.a.n) {
                                            a8b.b("visitSubtreeIf called on an unattached node");
                                        }
                                        dfe dfeVar3 = new dfe(new b8e[16]);
                                        b8e b8eVar5 = vg9Var3.a;
                                        b8e b8eVar6 = b8eVar5.f;
                                        if (b8eVar6 == null) {
                                            ui6.h(dfeVar3, b8eVar5);
                                        } else {
                                            dfeVar3.c(b8eVar6);
                                        }
                                        while (true) {
                                            int i5 = dfeVar3.c;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            b8e b8eVar7 = (b8e) dfeVar3.l(i5 - 1);
                                            if ((b8eVar7.d & 1024) != 0) {
                                                for (b8e b8eVar8 = b8eVar7; b8eVar8 != null && b8eVar8.n; b8eVar8 = b8eVar8.f) {
                                                    if ((b8eVar8.c & 1024) != 0) {
                                                        b8e b8eVarU2 = b8eVar8;
                                                        dfe dfeVar4 = null;
                                                        while (b8eVarU2 != null) {
                                                            if (b8eVarU2 instanceof vg9) {
                                                                vg9 vg9Var4 = (vg9) b8eVarU2;
                                                                if (vg9Var4.n) {
                                                                    ig9 ig9VarV0 = vg9Var4.V0();
                                                                    if (vg9Var4.n && !vg9Var4.o && ig9VarV0.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((b8eVarU2.c & 1024) != 0 && (b8eVarU2 instanceof i17)) {
                                                                int i6 = 0;
                                                                for (b8e b8eVar9 = ((i17) b8eVarU2).p; b8eVar9 != null; b8eVar9 = b8eVar9.f) {
                                                                    if ((b8eVar9.c & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            b8eVarU2 = b8eVar9;
                                                                        } else {
                                                                            if (dfeVar4 == null) {
                                                                                dfeVar4 = new dfe(new b8e[16]);
                                                                            }
                                                                            if (b8eVarU2 != null) {
                                                                                dfeVar4.c(b8eVarU2);
                                                                                b8eVarU2 = null;
                                                                            }
                                                                            dfeVar4.c(b8eVar9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 != 1) {
                                                                }
                                                            }
                                                            b8eVarU2 = ui6.U(dfeVar4);
                                                        }
                                                    }
                                                }
                                            }
                                            ui6.h(dfeVar3, b8eVar7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((b8eVarU.c & 1024) != 0 && (b8eVarU instanceof i17)) {
                                for (b8e b8eVar10 = ((i17) b8eVarU).p; b8eVar10 != null; b8eVar10 = b8eVar10.f) {
                                    if ((b8eVar10.c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            b8eVarU = b8eVar10;
                                        } else {
                                            if (dfeVar2 == null) {
                                                dfeVar2 = new dfe(new b8e[16]);
                                            }
                                            if (b8eVarU != null) {
                                                dfeVar2.c(b8eVarU);
                                                b8eVarU = null;
                                            }
                                            dfeVar2.c(b8eVar10);
                                        }
                                    }
                                }
                                if (i4 != 1) {
                                }
                            }
                            b8eVarU = ui6.U(dfeVar2);
                        }
                    }
                }
            }
            ui6.h(dfeVar, b8eVar3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        f0j f0jVarW;
        Function1 function1;
        Function1 function12;
        p21 p21Var = this.I;
        if (p21Var != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                m3c m3cVar = (m3c) ((jde) p21Var.b.c).e(iKeyAt);
                if (m3cVar != null && (f0jVarW = m3cVar.w()) != null) {
                    see seeVar = f0jVarW.a;
                    Object objG = seeVar.g(e0j.g);
                    if (objG == null) {
                        objG = null;
                    }
                    c8 c8Var = (c8) objG;
                    if (c8Var != null && (function12 = c8Var.b) != null) {
                    }
                    Object objG2 = seeVar.g(e0j.h);
                    c8 c8Var2 = (c8) (objG2 != null ? objG2 : null);
                    if (c8Var2 != null && (function1 = c8Var2.b) != null) {
                    }
                }
            }
        }
        d5o d5oVar = this.H;
        if (d5oVar != null) {
            LinkedHashMap linkedHashMap = ((zu2) d5oVar.b).a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (linkedHashMap.get(Integer.valueOf(iKeyAt2)) != null) {
                        h9o.t();
                        return;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new g0f("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new g0f("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new g0f("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    public final void b(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        b41 b41Var = this.v;
        if (Intrinsics.a(str, b41Var.D)) {
            int iD2 = b41Var.B.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!Intrinsics.a(str, b41Var.E) || (iD = b41Var.C.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.v.m(i, this.b, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.v.m(i, this.b, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        dee deeVar = this.z;
        boolean zIsAttachedToWindow = isAttachedToWindow();
        m3c m3cVar = this.r;
        if (!zIsAttachedToWindow) {
            q(m3cVar);
        }
        y(true);
        ytj.h().m();
        this.B = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            a31 a31Var = (a31) o().u.b;
            Canvas canvas2 = a31Var.a;
            a31Var.a = canvas;
            m3cVar.i(a31Var, null);
            a31Var.a = canvas2;
            if (deeVar.j()) {
                int i = deeVar.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((s3a) ((evf) deeVar.g(i2))).g();
                }
            }
            int i3 = k7n.a;
            deeVar.d();
            this.B = false;
            Trace.endSection();
            dee deeVar2 = this.A;
            if (deeVar2 != null) {
                deeVar.b(deeVar2);
                deeVar2.d();
            }
            if (s()) {
                if (Float.compare(this.q0, this.s0) != 0) {
                    float f = this.q0;
                    this.s0 = f;
                    lg1.a(this, f);
                }
                View view = this.k;
                if (view != null) {
                    if (Float.compare(this.r0, this.t0) != 0) {
                        float f2 = this.r0;
                        this.t0 = f2;
                        lg1.a(view, f2);
                    }
                    if (!Float.isNaN(this.r0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.q0 = Float.NaN;
                this.r0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0493 A[PHI: r5
      0x0493: PHI (r5v53 dfe) = (r5v89 dfe), (r5v90 dfe), (r5v91 dfe) binds: [B:273:0x0456, B:275:0x045a, B:290:0x048c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0661 A[PHI: r4
      0x0661: PHI (r4v45 dfe) = (r4v84 dfe), (r4v85 dfe), (r4v86 dfe) binds: [B:402:0x0628, B:404:0x062c, B:419:0x065c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0738  */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r36v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [b8e] */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67, types: [b8e] */
    /* JADX WARN: Type inference failed for: r4v76 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r40) throws pxb {
        /*
            Method dump skipped, instructions count: 1865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v31.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0157, code lost:
    
        if (v(r25) == false) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r25) throws pxb {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v31.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zIsFocused = isFocused();
        gg9 gg9Var = this.l;
        if (!zIsFocused) {
            return gg9Var.d(keyEvent, new x2(this, keyEvent, (byte) 9));
        }
        h7c h7cVar = o().t;
        d2o.a.setValue(new tmg(keyEvent.getMetaState()));
        return gg9Var.d(keyEvent, new be8((byte) 9)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) throws pxb {
        tah tahVar;
        if (isFocused()) {
            gg9 gg9Var = this.l;
            if (gg9Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                vg9 vg9VarR = gyg.r(gg9Var.c);
                if (vg9VarR != null) {
                    if (!vg9VarR.a.n) {
                        a8b.b("visitAncestors called on an unattached node");
                    }
                    b8e b8eVar = vg9VarR.a;
                    m3c m3cVarE0 = ui6.e0(vg9VarR);
                    while (m3cVarE0 != null) {
                        if ((((b8e) m3cVarE0.F.g).d & 131072) != 0) {
                            while (b8eVar != null) {
                                if ((b8eVar.c & 131072) != 0) {
                                    b8e b8eVarU = b8eVar;
                                    dfe dfeVar = null;
                                    while (b8eVarU != null) {
                                        if ((b8eVarU.c & 131072) != 0 && (b8eVarU instanceof i17)) {
                                            int i = 0;
                                            for (b8e b8eVar2 = ((i17) b8eVarU).p; b8eVar2 != null; b8eVar2 = b8eVar2.f) {
                                                if ((b8eVar2.c & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        b8eVarU = b8eVar2;
                                                    } else {
                                                        if (dfeVar == null) {
                                                            dfeVar = new dfe(new b8e[16]);
                                                        }
                                                        if (b8eVarU != null) {
                                                            dfeVar.c(b8eVarU);
                                                            b8eVarU = null;
                                                        }
                                                        dfeVar.c(b8eVar2);
                                                    }
                                                }
                                            }
                                            if (i != 1) {
                                            }
                                        }
                                        b8eVarU = ui6.U(dfeVar);
                                    }
                                }
                                b8eVar = b8eVar.e;
                            }
                        }
                        m3cVarE0 = m3cVarE0.u();
                        b8eVar = (m3cVarE0 == null || (tahVar = m3cVarE0.F) == null) ? null : (lbl) tahVar.f;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        this.C0 = true;
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            this.C0 = false;
            H(viewStructure);
        } catch (Throwable th) {
            this.C0 = false;
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) throws Throwable {
        Object rl2Var;
        gg9 gg9Var;
        vg9 vg9VarF;
        if (this.w0) {
            n31 n31Var = this.v0;
            removeCallbacks(n31Var);
            MotionEvent motionEvent2 = this.m0;
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.w0 = false;
            } else {
                n31Var.run();
            }
        }
        if (!t(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || v(motionEvent))) {
            int iP = p(motionEvent);
            if ((iP & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (rl2Var = view.getTag(2131362083)) == null) {
                    rl2Var = new rl2();
                }
                if (rl2Var.equals(new rl2()) && (vg9VarF = (gg9Var = this.l).f()) != null) {
                    wye wyeVarD0 = ui6.d0(vg9VarF);
                    if (!rm5.v(wyeVarD0).y(wyeVarD0, true).a((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L))) {
                        gg9Var.b(8, false, true);
                    }
                }
            }
            if ((iP & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void f(m3c m3cVar, boolean z) {
        this.P.l(m3cVar, z);
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        voh vohVarA;
        if (view == null || this.P.a) {
            return super.focusSearch(view, i);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), view, i);
        if (viewFindNextFocus == null || !i41.o(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        gg9 gg9Var = this.l;
        if (view == this) {
            vg9 vg9VarR = gyg.r(gg9Var.c);
            vohVarA = vg9VarR != null ? gyg.t(vg9VarR) : null;
            if (vohVarA == null) {
                vohVarA = ag9.a(view, this);
            }
        } else {
            vohVarA = ag9.a(view, this);
        }
        lf9 lf9VarD = ag9.d(i);
        byte b = lf9VarD != null ? lf9VarD.a : (byte) 6;
        pqh pqhVar = new pqh();
        if (gg9Var.e(b, vohVarA, new j31(pqhVar, (byte) 0)) == null) {
            return view;
        }
        Object obj = pqhVar.a;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || b == 1 || b == 2 || xgh.p(gyg.t((vg9) obj), ag9.a(viewFindNextFocus, this), vohVarA, b)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public final nc1 g() {
        if (this.M == null) {
            nc1 nc1Var = new nc1(getContext());
            this.M = nc1Var;
            addView((View) nc1Var, -1);
            requestLayout();
        }
        return this.M;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        voh vohVarI = i();
        if (vohVarI != null) {
            rect.left = Math.round(vohVarI.a);
            rect.top = Math.round(vohVarI.b);
            rect.right = Math.round(vohVarI.c);
            rect.bottom = Math.round(vohVarI.d);
            return;
        }
        if (Intrinsics.a(this.l.e(6, null, new y2((byte) 25)), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
        }
    }

    @Override // android.view.View
    public final int getImportantForAutofill() {
        return 1;
    }

    public final n27 h() {
        return (n27) this.j.getValue();
    }

    public final voh i() {
        if (isFocused()) {
            vg9 vg9VarR = gyg.r(this.l.c);
            if (vg9VarR != null) {
                return gyg.t(vg9VarR);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return ag9.a(viewFindFocus, this);
        }
        return null;
    }

    public final c9b j() {
        c9b c9bVar = this.j0;
        if (c9bVar == null) {
            c9bVar = new c9b(isInTouchMode() ? 1 : 2);
            this.j0 = c9bVar;
        }
        return c9bVar;
    }

    public final cjl k() {
        cjl cjlVar = this.d0;
        if (cjlVar != null) {
            return cjlVar;
        }
        cjl cjlVar2 = new cjl(this, this, new k31(this, (byte) 0));
        this.d0 = cjlVar2;
        return cjlVar2;
    }

    public final v31 l() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public final boolean m() {
        foi foiVar;
        if (Build.VERSION.SDK_INT >= 31 && (foiVar = this.D0) != null && ((Boolean) ((t0g) foiVar.a).getValue()).booleanValue()) {
            return true;
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof v31) {
                return ((v31) parent).m();
            }
        }
        return false;
    }

    public final boolean n() {
        return Build.VERSION.SDK_INT >= 30 ? gg1.a.a(this) : this.L;
    }

    public final fh5 o() {
        return (fh5) this.a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws pxb {
        ga6 ga6Var;
        Object obj;
        super.onAttachedToWindow();
        m3c m3cVar = this.r;
        if (!m3cVar.H()) {
            m3cVar.d(this);
        }
        this.o.setValue(Boolean.TRUE);
        if (Build.VERSION.SDK_INT < 30) {
            this.L = x1p.y();
        }
        this.q.onViewAttachedToWindow(this);
        o().c();
        r(m3cVar);
        q(m3cVar);
        ((tuj) this.K.a).f();
        v31 v31VarL = l();
        if (v31VarL == null) {
            qp2.n("Expected the view to be attached to window.");
            return;
        }
        v31VarL.L(new i31(this, (byte) 1));
        fh5 fh5VarO = o();
        fh5VarO.e();
        ndc ndcVar = fh5VarO.d;
        fh5 fh5VarO2 = o();
        fh5VarO2.e();
        w7n w7nVar = fh5VarO2.f;
        y7o y7oVar = this.d;
        if (ndcVar == null || w7nVar == null || y7oVar == null) {
            ga6Var = null;
        } else {
            plk plkVar = new plk(w7nVar.getViewModelStore(), new s7n(), e06.b);
            s15 s15VarA = uqh.a(tdc.class);
            String strB = s15VarA.b();
            if (strB == null) {
                qp2.o("Local and anonymous classes can not be ViewModels");
                return;
            }
            tdc tdcVar = (tdc) plkVar.n(s15VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            int id = ((View) getParent()).getId();
            jde jdeVar = tdcVar.b;
            Object objE = jdeVar.e(id);
            if (objE == null) {
                objE = new dee(1);
                jdeVar.i(id, objE);
            }
            dee deeVar = (dee) objE;
            Object[] objArr = deeVar.a;
            int i = deeVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((sdc) obj).c) {
                    break;
                } else {
                    i2++;
                }
            }
            sdc sdcVar = (sdc) obj;
            if (sdcVar == null) {
                sdcVar = new sdc();
                deeVar.a(sdcVar);
            }
            sdcVar.c = true;
            this.e = sdcVar;
            ga6Var = sdcVar.b;
        }
        if (ga6Var == null) {
            ga6Var = ulp.g;
        }
        this.g = ga6Var;
        gil gilVar = this.c0;
        if (gilVar != null) {
            gilVar.invoke(o());
            this.c0 = null;
        }
        fh5 fh5VarO3 = o();
        fh5VarO3.e();
        tcc lifecycle = fh5VarO3.d.getLifecycle();
        lifecycle.a(this);
        lifecycle.a(this.w);
        j().a.setValue(new b9b(isInTouchMode() ? (byte) 1 : (byte) 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            f41.a.b(this);
        }
        gg9 gg9Var = this.l;
        p21 p21Var = this.I;
        if (p21Var != null) {
            gg9Var.g.a(p21Var);
            ((dee) this.u.d).a(p21Var);
        }
        gg9Var.g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        b4j b4jVar = (b4j) this.f0.get();
        n91 n91Var = (n91) (b4jVar != null ? b4jVar.b : null);
        if (n91Var == null) {
            return k().d;
        }
        b4j b4jVar2 = (b4j) n91Var.d.get();
        a9b a9bVar = (a9b) (b4jVar2 != null ? b4jVar2.b : null);
        return a9bVar != null && (a9bVar.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        S(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r18) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v31.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        o41 o41Var = this.w;
        o41Var.getClass();
        m41.B(o41Var, jArr, consumer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.o.setValue(Boolean.FALSE);
        this.q.onViewDetachedFromWindow(this);
        View view = this.k;
        if (s() && view != null) {
            removeView(view);
        }
        dee deeVar = J0;
        synchronized (deeVar) {
            deeVar.k(this);
        }
        o().b();
        tuj tujVar = (tuj) this.K.a;
        txi txiVar = (txi) tujVar.j;
        if (txiVar != null) {
            txiVar.d();
        }
        tujVar.c();
        fh5 fh5VarO = o();
        fh5VarO.e();
        tcc lifecycle = fh5VarO.d.getLifecycle();
        lifecycle.b(this.w);
        lifecycle.b(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        sdc sdcVar = this.e;
        if (sdcVar != null) {
            sdcVar.c = false;
        }
        this.e = null;
        if (Build.VERSION.SDK_INT >= 31) {
            f41.a.a(this);
        }
        p21 p21Var = this.I;
        if (p21Var != null) {
            ((dee) this.u.d).k(p21Var);
            this.l.g.k(p21Var);
        }
        yoh yohVar = this.t;
        yohVar.g = yohVar.d.b(0L, 0L, null, 0, 0);
        this.t.a();
        yoh yohVar2 = this.t;
        c4 c4Var = yohVar2.i;
        if (c4Var != null) {
            yohVar2.b.removeCallbacks(c4Var);
            yohVar2.i = null;
        }
        this.l.g.k(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        gg9 gg9Var = this.l;
        k1g.X(gg9Var.c, true);
        if (gg9Var.f() != null) {
            vg9 vg9VarF = gg9Var.f();
            gg9Var.i(null);
            if (vg9VarF != null) {
                vg9VarF.U0(qg9.a, qg9.c);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.W = 0L;
        T();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        S(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.W = 0L;
            this.P.s(this.z0);
            this.N = null;
            T();
            if (this.M != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                g().layout(0, 0, i3 - i, i4 - i2);
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        d37 d37Var = this.P;
        m3c m3cVar = this.r;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            boolean zH = m3cVar.H();
            q3c q3cVar = m3cVar.G;
            if (!zH) {
                m3cVar.d(this);
            }
            if (!isAttachedToWindow()) {
                r(m3cVar);
            }
            long jD = d(i);
            igm igmVar = jgm.b;
            long jD2 = d(i2);
            long jE = vtp.E((int) (jD >>> 32), (int) (jD & 4294967295L), (int) (jD2 >>> 32), (int) (jD2 & 4294967295L));
            yo5 yo5Var = this.N;
            if (yo5Var == null) {
                this.N = new yo5(jE);
                this.O = false;
            } else if (!yo5.b(yo5Var.a, jE)) {
                this.O = true;
            }
            d37Var.D(jE);
            d37Var.u();
            sfd sfdVar = q3cVar.p;
            setMeasuredDimension(sfdVar.a, sfdVar.b);
            if (this.M != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                g().measure(View.MeasureSpec.makeMeasureSpec(q3cVar.p.a, 1073741824), View.MeasureSpec.makeMeasureSpec(q3cVar.p.b, 1073741824));
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure == null || this.C0) {
            return;
        }
        H(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        o91 o91Var;
        int toolType = motionEvent.getToolType(i);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (o91Var = this.F0.a) == null) ? super.onResolvePointerIcon(motionEvent, i) : PointerIcon.getSystemIcon(getContext(), o91Var.b);
    }

    public final void onResume(ndc ndcVar) {
        ph4 ph4VarS;
        if (Build.VERSION.SDK_INT < 30) {
            this.L = x1p.y();
        }
        sdc sdcVar = this.e;
        if (sdcVar != null) {
            y7o y7oVar = this.d;
            hu3 hu3Var = (hu3) sdcVar.a.b;
            if (!hu3Var.a || hu3Var.c) {
                return;
            }
            try {
                ph4VarS = y7oVar.a.s(new q4b(sdcVar, (byte) 13));
            } catch (CancellationException unused) {
                if (!hu3Var.b) {
                    if (hu3Var.c) {
                        cpg.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    hu3Var.a();
                    hu3Var.c = true;
                }
                ph4VarS = null;
            }
            ph4 ph4Var = sdcVar.d;
            if (ph4Var != null) {
                ph4Var.cancel();
            }
            sdcVar.d = ph4VarS;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.c) {
            int[] iArr = ag9.a;
            d2c d2cVar = i != 0 ? i != 1 ? null : d2c.b : d2c.a;
            if (d2cVar == null) {
                d2cVar = d2c.a;
            }
            this.i0.setValue(d2cVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        foi foiVar;
        if (Build.VERSION.SDK_INT < 31 || (foiVar = this.D0) == null) {
            return;
        }
        foiVar.a(this, this.u, this.m, consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        T();
    }

    public final void onStop(ndc ndcVar) {
        sdc sdcVar = this.e;
        if (sdcVar != null) {
            hu3 hu3Var = (hu3) sdcVar.a.b;
            if (hu3Var.a && !hu3Var.c) {
                ph4 ph4Var = sdcVar.d;
                if (ph4Var != null) {
                    ph4Var.cancel();
                }
                sdcVar.d = null;
                return;
            }
            if (hu3Var.b) {
                return;
            }
            if (!hu3Var.c) {
                cpg.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!((see) hu3Var.d).i()) {
                cpg.a("Attempted to start retaining exited values with pending exited values");
            }
            hu3Var.c = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        j().a.setValue(new b9b(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        o41 o41Var = this.w;
        o41Var.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (Intrinsics.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            m41.e(o41Var, longSparseArray);
        } else {
            o41Var.a.post(new xa(o41Var, longSparseArray, (byte) 11));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zY;
        this.B0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || n() == (zY = x1p.y())) {
            return;
        }
        this.L = zY;
        q(this.r);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015c A[Catch: all -> 0x01ca, TryCatch #2 {all -> 0x01ca, blocks: (B:4:0x001d, B:6:0x0026, B:49:0x00b6, B:51:0x00bd, B:59:0x00ce, B:61:0x00d6, B:63:0x00da, B:64:0x00dd, B:66:0x00e1, B:68:0x00e7, B:70:0x00eb, B:72:0x00f1, B:75:0x00f9, B:78:0x0101, B:79:0x010d, B:81:0x0113, B:83:0x0119, B:85:0x011f, B:87:0x0125, B:89:0x0129, B:90:0x012d, B:96:0x0140, B:98:0x0144, B:100:0x014b, B:107:0x015c, B:108:0x0166, B:110:0x016e, B:111:0x0171, B:112:0x0178), top: B:145:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016e A[Catch: all -> 0x01ca, TryCatch #2 {all -> 0x01ca, blocks: (B:4:0x001d, B:6:0x0026, B:49:0x00b6, B:51:0x00bd, B:59:0x00ce, B:61:0x00d6, B:63:0x00da, B:64:0x00dd, B:66:0x00e1, B:68:0x00e7, B:70:0x00eb, B:72:0x00f1, B:75:0x00f9, B:78:0x0101, B:79:0x010d, B:81:0x0113, B:83:0x0119, B:85:0x011f, B:87:0x0125, B:89:0x0129, B:90:0x012d, B:96:0x0140, B:98:0x0144, B:100:0x014b, B:107:0x015c, B:108:0x0166, B:110:0x016e, B:111:0x0171, B:112:0x0178), top: B:145:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0171 A[Catch: all -> 0x01ca, TryCatch #2 {all -> 0x01ca, blocks: (B:4:0x001d, B:6:0x0026, B:49:0x00b6, B:51:0x00bd, B:59:0x00ce, B:61:0x00d6, B:63:0x00da, B:64:0x00dd, B:66:0x00e1, B:68:0x00e7, B:70:0x00eb, B:72:0x00f1, B:75:0x00f9, B:78:0x0101, B:79:0x010d, B:81:0x0113, B:83:0x0119, B:85:0x011f, B:87:0x0125, B:89:0x0129, B:90:0x012d, B:96:0x0140, B:98:0x0144, B:100:0x014b, B:107:0x015c, B:108:0x0166, B:110:0x016e, B:111:0x0171, B:112:0x0178), top: B:145:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0182 A[Catch: all -> 0x01c7, TRY_ENTER, TryCatch #1 {all -> 0x01c7, blocks: (B:12:0x0035, B:14:0x003f, B:19:0x004e, B:21:0x0054, B:27:0x0060, B:30:0x0068, B:36:0x0091, B:45:0x00a4, B:47:0x00aa, B:114:0x0182, B:115:0x018e, B:31:0x0074, B:33:0x0079), top: B:143:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00da A[Catch: all -> 0x01ca, TryCatch #2 {all -> 0x01ca, blocks: (B:4:0x001d, B:6:0x0026, B:49:0x00b6, B:51:0x00bd, B:59:0x00ce, B:61:0x00d6, B:63:0x00da, B:64:0x00dd, B:66:0x00e1, B:68:0x00e7, B:70:0x00eb, B:72:0x00f1, B:75:0x00f9, B:78:0x0101, B:79:0x010d, B:81:0x0113, B:83:0x0119, B:85:0x011f, B:87:0x0125, B:89:0x0129, B:90:0x012d, B:96:0x0140, B:98:0x0144, B:100:0x014b, B:107:0x015c, B:108:0x0166, B:110:0x016e, B:111:0x0171, B:112:0x0178), top: B:145:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00eb A[Catch: all -> 0x01ca, TryCatch #2 {all -> 0x01ca, blocks: (B:4:0x001d, B:6:0x0026, B:49:0x00b6, B:51:0x00bd, B:59:0x00ce, B:61:0x00d6, B:63:0x00da, B:64:0x00dd, B:66:0x00e1, B:68:0x00e7, B:70:0x00eb, B:72:0x00f1, B:75:0x00f9, B:78:0x0101, B:79:0x010d, B:81:0x0113, B:83:0x0119, B:85:0x011f, B:87:0x0125, B:89:0x0129, B:90:0x012d, B:96:0x0140, B:98:0x0144, B:100:0x014b, B:107:0x015c, B:108:0x0166, B:110:0x016e, B:111:0x0171, B:112:0x0178), top: B:145:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010d A[Catch: all -> 0x01ca, TryCatch #2 {all -> 0x01ca, blocks: (B:4:0x001d, B:6:0x0026, B:49:0x00b6, B:51:0x00bd, B:59:0x00ce, B:61:0x00d6, B:63:0x00da, B:64:0x00dd, B:66:0x00e1, B:68:0x00e7, B:70:0x00eb, B:72:0x00f1, B:75:0x00f9, B:78:0x0101, B:79:0x010d, B:81:0x0113, B:83:0x0119, B:85:0x011f, B:87:0x0125, B:89:0x0129, B:90:0x012d, B:96:0x0140, B:98:0x0144, B:100:0x014b, B:107:0x015c, B:108:0x0166, B:110:0x016e, B:111:0x0171, B:112:0x0178), top: B:145:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011f A[Catch: all -> 0x01ca, TryCatch #2 {all -> 0x01ca, blocks: (B:4:0x001d, B:6:0x0026, B:49:0x00b6, B:51:0x00bd, B:59:0x00ce, B:61:0x00d6, B:63:0x00da, B:64:0x00dd, B:66:0x00e1, B:68:0x00e7, B:70:0x00eb, B:72:0x00f1, B:75:0x00f9, B:78:0x0101, B:79:0x010d, B:81:0x0113, B:83:0x0119, B:85:0x011f, B:87:0x0125, B:89:0x0129, B:90:0x012d, B:96:0x0140, B:98:0x0144, B:100:0x014b, B:107:0x015c, B:108:0x0166, B:110:0x016e, B:111:0x0171, B:112:0x0178), top: B:145:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0129 A[Catch: all -> 0x01ca, TryCatch #2 {all -> 0x01ca, blocks: (B:4:0x001d, B:6:0x0026, B:49:0x00b6, B:51:0x00bd, B:59:0x00ce, B:61:0x00d6, B:63:0x00da, B:64:0x00dd, B:66:0x00e1, B:68:0x00e7, B:70:0x00eb, B:72:0x00f1, B:75:0x00f9, B:78:0x0101, B:79:0x010d, B:81:0x0113, B:83:0x0119, B:85:0x011f, B:87:0x0125, B:89:0x0129, B:90:0x012d, B:96:0x0140, B:98:0x0144, B:100:0x014b, B:107:0x015c, B:108:0x0166, B:110:0x016e, B:111:0x0171, B:112:0x0178), top: B:145:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0144 A[Catch: all -> 0x01ca, TryCatch #2 {all -> 0x01ca, blocks: (B:4:0x001d, B:6:0x0026, B:49:0x00b6, B:51:0x00bd, B:59:0x00ce, B:61:0x00d6, B:63:0x00da, B:64:0x00dd, B:66:0x00e1, B:68:0x00e7, B:70:0x00eb, B:72:0x00f1, B:75:0x00f9, B:78:0x0101, B:79:0x010d, B:81:0x0113, B:83:0x0119, B:85:0x011f, B:87:0x0125, B:89:0x0129, B:90:0x012d, B:96:0x0140, B:98:0x0144, B:100:0x014b, B:107:0x015c, B:108:0x0166, B:110:0x016e, B:111:0x0171, B:112:0x0178), top: B:145:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int p(android.view.MotionEvent r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v31.p(android.view.MotionEvent):int");
    }

    public final void r(m3c m3cVar) {
        this.P.A(m3cVar, false);
        dfe dfeVarZ = m3cVar.z();
        Object[] objArr = dfeVarZ.a;
        int i = dfeVarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            r((m3c) objArr[i2]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        byte b = 1;
        if (!isFocused()) {
            lf9 lf9VarD = ag9.d(i);
            byte b2 = lf9VarD != null ? lf9VarD.a : (byte) 7;
            voh vohVar = rect != null ? new voh(rect.left, rect.top, rect.right, rect.bottom) : null;
            m31 m31Var = new m31((byte) 0, b2);
            gg9 gg9Var = this.l;
            Boolean boolE = gg9Var.e(b2, vohVar, m31Var);
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.a(boolE, bool) && !Intrinsics.a(gg9Var.e(b2, null, new m31(b, b2)), bool)) {
                if (hasFocus() && (b2 == 1 || b2 == 2)) {
                    return gg9Var.h(b2);
                }
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean u(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean v(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.m0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void w(float[] fArr) {
        I();
        afd.e(fArr, this.U);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.b0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.b0 & 4294967295L));
        float[] fArr2 = this.S;
        afd.d(fArr2);
        afd.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        float fS = i41.s(0, 0, fArr2, fArr);
        float fS2 = i41.s(0, 1, fArr2, fArr);
        float fS3 = i41.s(0, 2, fArr2, fArr);
        float fS4 = i41.s(0, 3, fArr2, fArr);
        float fS5 = i41.s(1, 0, fArr2, fArr);
        float fS6 = i41.s(1, 1, fArr2, fArr);
        float fS7 = i41.s(1, 2, fArr2, fArr);
        float fS8 = i41.s(1, 3, fArr2, fArr);
        float fS9 = i41.s(2, 0, fArr2, fArr);
        float fS10 = i41.s(2, 1, fArr2, fArr);
        float fS11 = i41.s(2, 2, fArr2, fArr);
        float fS12 = i41.s(2, 3, fArr2, fArr);
        float fS13 = i41.s(3, 0, fArr2, fArr);
        float fS14 = i41.s(3, 1, fArr2, fArr);
        float fS15 = i41.s(3, 2, fArr2, fArr);
        float fS16 = i41.s(3, 3, fArr2, fArr);
        fArr[0] = fS;
        fArr[1] = fS2;
        fArr[2] = fS3;
        fArr[3] = fS4;
        fArr[4] = fS5;
        fArr[5] = fS6;
        fArr[6] = fS7;
        fArr[7] = fS8;
        fArr[8] = fS9;
        fArr[9] = fS10;
        fArr[10] = fS11;
        fArr[11] = fS12;
        fArr[12] = fS13;
        fArr[13] = fS14;
        fArr[14] = fS15;
        fArr[15] = fS16;
    }

    public final long x(long j) {
        I();
        long jB = afd.b(this.U, j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.b0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.b0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public final void y(boolean z) {
        d37 d37Var = this.P;
        if (((d5o) d37Var.d).E() || ((dfe) ((s6h) d37Var.e).a).c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if (d37Var.s(z ? this.z0 : this.A0)) {
                    requestLayout();
                }
                d37Var.e(false);
                this.t.a();
                if (this.C) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.C = false;
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void z(m3c m3cVar, long j) {
        d37 d37Var = this.P;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            d37Var.t(m3cVar, j);
            if (!((d5o) d37Var.d).E()) {
                d37Var.e(false);
                this.t.a();
                this.A0.invoke();
                if (this.C) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.C = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }
}
