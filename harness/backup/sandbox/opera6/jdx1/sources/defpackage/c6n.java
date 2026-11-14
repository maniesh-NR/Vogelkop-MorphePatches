package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c6n extends ViewGroup implements mle, eg5, ivf, bcf {
    public static final k51 F = new k51((byte) 6);
    public final View A;
    public p8f B;
    public Function1 C;
    public Function1 D;
    public Function1 E;
    public final s9i a;
    public final View b;
    public final v31 c;
    public Function0 d;
    public boolean e;
    public Function0 f;
    public Function0 g;
    public c8e h;
    public final q3 i;
    public n27 j;
    public final z3 k;
    public ndc l;
    public rki m;
    public final int[] n;
    public long o;
    public g3o p;
    public Function1 q;
    public final ec1 r;
    public final ec1 s;
    public final v91 t;
    public final int[] u;
    public int v;
    public int w;
    public final fr x;
    public boolean y;
    public final m3c z;

    public c6n(Context context, Function1 function1, tt9 tt9Var, vji vjiVar, int i, v31 v31Var) throws pxb {
        View view = (View) function1.invoke(context);
        s9i s9iVar = new s9i((byte) 21);
        super(context);
        this.a = s9iVar;
        this.b = view;
        this.c = v31Var;
        if (tt9Var != null) {
            see seeVar = z3o.a;
            setTag(2131362030, tt9Var);
        }
        byte b = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        fc1 fc1Var = new fc1(this, b);
        WeakHashMap weakHashMap = r5n.a;
        n2o.a(this, fc1Var);
        h5n.c(this, this);
        this.d = new lb((byte) 15);
        this.f = new lb((byte) 16);
        this.g = new lb((byte) 17);
        z7e z7eVar = z7e.b;
        this.h = z7eVar;
        this.j = xf8.i();
        byte b2 = 2;
        this.n = new int[2];
        this.o = 0L;
        this.r = new ec1(this, b);
        byte b3 = 1;
        this.s = new ec1(this, b3);
        this.u = new int[2];
        this.v = LinearLayoutManager.INVALID_OFFSET;
        this.w = LinearLayoutManager.INVALID_OFFSET;
        this.x = new fr((byte) 17, false);
        m3c m3cVar = new m3c(3);
        m3cVar.o = this;
        c8e c8eVarA = h0j.a(alo.c0(z7eVar, a26.b, s9iVar), true, new k51((byte) 7));
        smg smgVar = new smg();
        smgVar.b = new dc1(this, (byte) 2);
        v91 v91Var = new v91();
        v91 v91Var2 = smgVar.c;
        if (v91Var2 != null) {
            v91Var2.b = null;
        }
        smgVar.c = v91Var;
        v91Var.b = smgVar;
        this.t = v91Var;
        c8e c8eVarD = na2.H(fr3.D(c8eVarA.d(smgVar), new f9(this, m3cVar, this, (byte) 1)), new cc1(this, m3cVar, b)).d(new ls3(new dc1(this, (byte) 0)));
        m3cVar.e0(this.h.d(c8eVarD));
        this.i = new q3(m3cVar, c8eVarD, (byte) 10);
        m3cVar.a0(this.j);
        this.k = new z3(m3cVar, (byte) 22);
        m3cVar.M = new cc1(this, m3cVar, b3);
        m3cVar.N = new dc1(this, (byte) 1);
        m3cVar.d0(new gc1(this, m3cVar));
        this.z = m3cVar;
        this.A = view;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objE = vjiVar != null ? vjiVar.e(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objE instanceof SparseArray ? (SparseArray) objE : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (vjiVar != null) {
            p8f p8fVarA = vjiVar.a(strValueOf, new ec1(this, b2));
            p8f p8fVar = this.B;
            if (p8fVar != null) {
                p8fVar.K();
            }
            this.B = p8fVarA;
        }
        k51 k51Var = nb6.b;
        this.C = k51Var;
        this.D = k51Var;
        this.E = k51Var;
    }

    public static r9b f(r9b r9bVar, int i, int i2, int i3, int i4) {
        int i5 = r9bVar.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = r9bVar.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = r9bVar.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = r9bVar.d - i4;
        return r9b.c(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    public static int j(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(djh.c(i3, i, i2), 1073741824);
        }
        if (i3 == -2 && i2 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i2, LinearLayoutManager.INVALID_OFFSET);
        }
        if (i3 != -1 || i2 == Integer.MAX_VALUE) {
            return 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
    }

    public final boolean Z() {
        return isAttachedToWindow();
    }

    public final void a() {
        this.f.invoke();
        removeAllViewsInLayout();
    }

    public final void b(int i, View view) {
        fr frVar = this.x;
        if (i == 1) {
            frVar.c = 0;
        } else {
            frVar.b = 0;
        }
    }

    public final void c() {
        this.g.invoke();
    }

    public final void d(View view, View view2, int i, int i2) {
        fr frVar = this.x;
        if (i2 == 1) {
            frVar.c = i;
        } else {
            frVar.b = i;
        }
    }

    public final void e(View view, int i, int i2, int[] iArr, int i3) {
        if (this.b.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (Float.floatToRawIntBits(i * (-1.0f)) << 32) | (Float.floatToRawIntBits(i2 * (-1.0f)) & 4294967295L);
            int i4 = i3 == 0 ? 1 : 2;
            hle hleVar = (hle) this.a.b;
            hle hleVarU0 = hleVar != null ? hleVar.U0() : null;
            long jV = hleVarU0 != null ? hleVarU0.v(i4, jFloatToRawIntBits) : 0L;
            iArr[0] = zed.b(Float.intBitsToFloat((int) (jV >> 32))) * (-1);
            iArr[1] = zed.b(Float.intBitsToFloat((int) (jV & 4294967295L))) * (-1);
        }
    }

    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.b.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (Float.floatToRawIntBits(i * (-1.0f)) << 32) | (Float.floatToRawIntBits(i2 * (-1.0f)) & 4294967295L);
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(i3 * (-1.0f)) << 32) | (Float.floatToRawIntBits(i4 * (-1.0f)) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            hle hleVar = (hle) this.a.b;
            hle hleVarU0 = hleVar != null ? hleVar.U0() : null;
            long jK = hleVarU0 != null ? hleVarU0.K(i6, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[0] = zed.b(Float.intBitsToFloat((int) (jK >> 32))) * (-1);
            iArr[1] = zed.b(Float.intBitsToFloat((int) (jK & 4294967295L))) * (-1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.u;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // android.view.View
    public final ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.x.j();
    }

    public final g3o h(g3o g3oVar) {
        d3o d3oVar = g3oVar.a;
        r9b r9bVarI = d3oVar.i(-1);
        r9b r9bVar = r9b.e;
        if (!r9bVarI.equals(r9bVar) || !d3oVar.j(-9).equals(r9bVar) || d3oVar.h() != null) {
            j8b j8bVar = (j8b) this.z.F.b;
            if (j8bVar.b0.n) {
                long jF0 = scd.f0(j8bVar.U(0L));
                int i = (int) (jF0 >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jF0 & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jH = rm5.v(j8bVar).h();
                int i3 = (int) (jH >> 32);
                int i4 = (int) (jH & 4294967295L);
                long j = j8bVar.c;
                long jF02 = scd.f0(j8bVar.U((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                int i5 = i3 - ((int) (jF02 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (jF02 & 4294967295L));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return g3oVar.a.r(i, i2, i5, i7);
                }
            }
        }
        return g3oVar;
    }

    public final void i(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.b.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (Float.floatToRawIntBits(i * (-1.0f)) << 32) | (Float.floatToRawIntBits(i2 * (-1.0f)) & 4294967295L);
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(i3 * (-1.0f)) << 32) | (Float.floatToRawIntBits(i4 * (-1.0f)) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            hle hleVar = (hle) this.a.b;
            hle hleVarU0 = hleVar != null ? hleVar.U0() : null;
            if (hleVarU0 != null) {
                hleVarU0.K(i6, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) throws pxb {
        super.invalidateChildInParent(iArr, rect);
        if (!this.y) {
            this.z.C();
            return null;
        }
        this.b.postOnAnimation(new c4(this.s, (byte) 23));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.b.isNestedScrollingEnabled();
    }

    public final boolean k(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // defpackage.bcf
    public final g3o l0(View view, g3o g3oVar) {
        this.p = new g3o(g3oVar);
        return h(g3oVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) throws pxb {
        super.onDescendantInvalidated(view, view2);
        if (!this.y) {
            this.z.C();
            return;
        }
        this.b.postOnAnimation(new c4(this.s, (byte) 23));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDetachedFromWindow() {
        /*
            r22 = this;
            r0 = r22
            super.onDetachedFromWindow()
            boolean r1 = r0.isAttachedToWindow()
            if (r1 != 0) goto L10
            java.lang.String r1 = "Expected AndroidViewHolder to be attached when observing reads."
            defpackage.a8b.b(r1)
        L10:
            v31 r1 = r0.c
            p12 r1 = r1.K
            java.lang.Object r1 = r1.a
            tuj r1 = (defpackage.tuj) r1
            java.lang.Object r2 = r1.i
            monitor-enter(r2)
            java.lang.Object r1 = r1.h     // Catch: java.lang.Throwable -> Lb1
            dfe r1 = (defpackage.dfe) r1     // Catch: java.lang.Throwable -> Lb1
            int r3 = r1.c     // Catch: java.lang.Throwable -> Lb1
            r5 = 0
            r6 = 0
        L23:
            java.lang.Object[] r7 = r1.a     // Catch: java.lang.Throwable -> Lb1
            if (r5 >= r3) goto La7
            r7 = r7[r5]     // Catch: java.lang.Throwable -> Lb1
            suj r7 = (defpackage.suj) r7     // Catch: java.lang.Throwable -> Lb1
            see r8 = r7.f     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r8 = r8.k(r0)     // Catch: java.lang.Throwable -> Lb1
            zde r8 = (defpackage.zde) r8     // Catch: java.lang.Throwable -> Lb1
            if (r8 == 0) goto L8c
            java.lang.Object[] r9 = r8.b     // Catch: java.lang.Throwable -> Lb1
            int[] r10 = r8.c     // Catch: java.lang.Throwable -> Lb1
            long[] r8 = r8.a     // Catch: java.lang.Throwable -> Lb1
            int r11 = r8.length     // Catch: java.lang.Throwable -> Lb1
            int r11 = r11 + (-2)
            if (r11 < 0) goto L8c
            r12 = 0
        L41:
            r13 = r8[r12]     // Catch: java.lang.Throwable -> Lb1
            r16 = r5
            long r4 = ~r13     // Catch: java.lang.Throwable -> Lb1
            r17 = 7
            long r4 = r4 << r17
            long r4 = r4 & r13
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r17
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 == 0) goto L85
            int r4 = r12 - r11
            int r4 = ~r4     // Catch: java.lang.Throwable -> Lb1
            int r4 = r4 >>> 31
            r5 = 8
            int r4 = 8 - r4
            r15 = 0
        L60:
            if (r15 >= r4) goto L83
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r13 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L7a
            int r18 = r12 << 3
            int r18 = r18 + r15
            r19 = r5
            r5 = r9[r18]     // Catch: java.lang.Throwable -> Lb1
            r18 = r10[r18]     // Catch: java.lang.Throwable -> Lb1
            r7.c(r0, r5)     // Catch: java.lang.Throwable -> Lb1
            goto L7c
        L7a:
            r19 = r5
        L7c:
            long r13 = r13 >> r19
            int r15 = r15 + 1
            r5 = r19
            goto L60
        L83:
            if (r4 != r5) goto L8e
        L85:
            if (r12 == r11) goto L8e
            int r12 = r12 + 1
            r5 = r16
            goto L41
        L8c:
            r16 = r5
        L8e:
            see r4 = r7.f     // Catch: java.lang.Throwable -> Lb1
            boolean r4 = r4.j()     // Catch: java.lang.Throwable -> Lb1
            if (r4 != 0) goto L99
            int r6 = r6 + 1
            goto La3
        L99:
            if (r6 <= 0) goto La3
            java.lang.Object[] r4 = r1.a     // Catch: java.lang.Throwable -> Lb1
            int r5 = r16 - r6
            r7 = r4[r16]     // Catch: java.lang.Throwable -> Lb1
            r4[r5] = r7     // Catch: java.lang.Throwable -> Lb1
        La3:
            int r5 = r16 + 1
            goto L23
        La7:
            int r0 = r3 - r6
            r4 = 0
            java.util.Arrays.fill(r7, r0, r3, r4)     // Catch: java.lang.Throwable -> Lb1
            r1.c = r0     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r2)
            return
        Lb1:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6n.onDetachedFromWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.v = i;
        this.w = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        na2.B(this.a.Q(), null, null, new hc1(z, this, w0h.a(f * (-1.0f), f2 * (-1.0f)), null, (byte) 0), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        na2.B(this.a.Q(), null, null, new ic1((byte) 0, w0h.a(f * (-1.0f), f2 * (-1.0f)), (mt5) null, this), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Function1 function1 = this.q;
        if (function1 == null) {
            return true;
        }
        function1.invoke(rect != null ? new voh(rect.left, rect.top, rect.right, rect.bottom) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        smg smgVar;
        v91 v91Var = this.t;
        if (v91Var != null && (smgVar = (smg) v91Var.b) != null) {
            smgVar.d = z;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
