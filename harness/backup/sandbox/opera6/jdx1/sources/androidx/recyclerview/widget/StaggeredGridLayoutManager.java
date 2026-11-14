package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import defpackage.a3k;
import defpackage.dqj;
import defpackage.e4c;
import defpackage.hsf;
import defpackage.ifc;
import defpackage.jph;
import defpackage.kph;
import defpackage.lph;
import defpackage.tph;
import defpackage.vph;
import defpackage.x2k;
import defpackage.y2k;
import defpackage.z2k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends f implements tph {
    public final int a;
    public final dqj[] b;
    public final hsf c;
    public final hsf d;
    public final int e;
    public int f;
    public final e4c g;
    public boolean h;
    public final BitSet j;
    public final jvg m;
    public final byte n;
    public boolean o;
    public boolean p;
    public a3k q;
    public int r;
    public final Rect s;
    public final x2k t;
    public boolean u;
    public final boolean v;
    public int[] w;
    public final ssi x;
    public boolean i = false;
    public int k = -1;
    public int l = LinearLayoutManager.INVALID_OFFSET;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.a = -1;
        this.h = false;
        jvg jvgVar = new jvg((byte) 6);
        this.m = jvgVar;
        this.n = (byte) 2;
        this.s = new Rect();
        this.t = new x2k(this);
        this.u = false;
        this.v = true;
        this.x = new ssi(this, (byte) 6);
        kph properties = f.getProperties(context, attributeSet, i, i2);
        int i3 = properties.a;
        if (i3 != 0 && i3 != 1) {
            qp2.o("invalid orientation.");
            throw null;
        }
        assertNotInLayoutOrScroll(null);
        if (i3 != this.e) {
            this.e = i3;
            hsf hsfVar = this.c;
            this.c = this.d;
            this.d = hsfVar;
            requestLayout();
        }
        int i4 = properties.b;
        assertNotInLayoutOrScroll(null);
        if (i4 != this.a) {
            jvgVar.q();
            requestLayout();
            this.a = i4;
            this.j = new BitSet(this.a);
            this.b = new dqj[this.a];
            for (int i5 = 0; i5 < this.a; i5++) {
                this.b[i5] = new dqj(this, i5);
            }
            requestLayout();
        }
        boolean z = properties.c;
        assertNotInLayoutOrScroll(null);
        a3k a3kVar = this.q;
        if (a3kVar != null && a3kVar.h != z) {
            a3kVar.h = z;
        }
        this.h = z;
        requestLayout();
        e4c e4cVar = new e4c();
        e4cVar.a = true;
        e4cVar.f = 0;
        e4cVar.g = 0;
        this.g = e4cVar;
        this.c = hsf.a(this, this.e);
        this.d = hsf.a(this, 1 - this.e);
    }

    public static int O(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.i
            if (r0 == 0) goto L9
            int r0 = r7.x()
            goto Ld
        L9:
            int r0 = r7.w()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1b
            if (r8 >= r9) goto L17
            int r2 = r9 + 1
        L15:
            r3 = r8
            goto L1e
        L17:
            int r2 = r8 + 1
            r3 = r9
            goto L1e
        L1b:
            int r2 = r8 + r9
            goto L15
        L1e:
            jvg r4 = r7.m
            r4.y(r3)
            r5 = 1
            if (r10 == r5) goto L36
            r6 = 2
            if (r10 == r6) goto L32
            if (r10 != r1) goto L39
            r4.A(r8, r5)
            r4.z(r9, r5)
            goto L39
        L32:
            r4.A(r8, r9)
            goto L39
        L36:
            r4.z(r8, r9)
        L39:
            if (r2 <= r0) goto L4d
            boolean r8 = r7.i
            if (r8 == 0) goto L44
            int r8 = r7.w()
            goto L48
        L44:
            int r8 = r7.x()
        L48:
            if (r3 > r8) goto L4d
            r7.requestLayout()
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View B() {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.B():android.view.View");
    }

    public final void C(View view, int i, int i2) {
        Rect rect = this.s;
        calculateItemDecorationsForChild(view, rect);
        y2k y2kVar = (y2k) view.getLayoutParams();
        int iO = O(i, ((ViewGroup.MarginLayoutParams) y2kVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) y2kVar).rightMargin + rect.right);
        int iO2 = O(i2, ((ViewGroup.MarginLayoutParams) y2kVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) y2kVar).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, iO, iO2, y2kVar)) {
            view.measure(iO, iO2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(androidx.recyclerview.widget.g r18, defpackage.vph r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.D(androidx.recyclerview.widget.g, vph, boolean):void");
    }

    public final boolean E(int i) {
        if (this.e == 0) {
            return (i == -1) != this.i;
        }
        return ((i == -1) == this.i) == isLayoutRTL();
    }

    public final void F(int i, vph vphVar) {
        int iW;
        int i2;
        if (i > 0) {
            iW = x();
            i2 = 1;
        } else {
            iW = w();
            i2 = -1;
        }
        e4c e4cVar = this.g;
        e4cVar.a = true;
        M(iW, vphVar);
        K(i2);
        e4cVar.c = iW + e4cVar.d;
        e4cVar.b = Math.abs(i);
    }

    public final void G(g gVar, e4c e4cVar) {
        if (!e4cVar.a || e4cVar.i) {
            return;
        }
        int i = e4cVar.b;
        int i2 = e4cVar.e;
        if (i == 0) {
            if (i2 == -1) {
                H(e4cVar.g, gVar);
                return;
            } else {
                I(e4cVar.f, gVar);
                return;
            }
        }
        int i3 = this.a;
        dqj[] dqjVarArr = this.b;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = e4cVar.f;
            int iL = dqjVarArr[0].l(i5);
            while (i4 < i3) {
                int iL2 = dqjVarArr[i4].l(i5);
                if (iL2 > iL) {
                    iL = iL2;
                }
                i4++;
            }
            int i6 = i5 - iL;
            int iMin = e4cVar.g;
            if (i6 >= 0) {
                iMin -= Math.min(i6, e4cVar.b);
            }
            H(iMin, gVar);
            return;
        }
        int i7 = e4cVar.g;
        int i8 = dqjVarArr[0].i(i7);
        while (i4 < i3) {
            int i9 = dqjVarArr[i4].i(i7);
            if (i9 < i8) {
                i8 = i9;
            }
            i4++;
        }
        int i10 = i8 - e4cVar.g;
        int iMin2 = e4cVar.f;
        if (i10 >= 0) {
            iMin2 += Math.min(i10, e4cVar.b);
        }
        I(iMin2, gVar);
    }

    public final void H(int i, g gVar) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            hsf hsfVar = this.c;
            if (hsfVar.e(childAt) < i || hsfVar.o(childAt) < i) {
                return;
            }
            y2k y2kVar = (y2k) childAt.getLayoutParams();
            if (y2kVar.f) {
                int i2 = 0;
                while (true) {
                    dqj[] dqjVarArr = this.b;
                    int i3 = this.a;
                    if (i2 >= i3) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            dqjVarArr[i4].m();
                        }
                    } else if (dqjVarArr[i2].a.size() == 1) {
                        return;
                    } else {
                        i2++;
                    }
                }
            } else if (y2kVar.e.a.size() == 1) {
                return;
            } else {
                y2kVar.e.m();
            }
            removeAndRecycleView(childAt, gVar);
        }
    }

    public final void I(int i, g gVar) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            hsf hsfVar = this.c;
            if (hsfVar.b(childAt) > i || hsfVar.n(childAt) > i) {
                return;
            }
            y2k y2kVar = (y2k) childAt.getLayoutParams();
            if (y2kVar.f) {
                int i2 = 0;
                while (true) {
                    dqj[] dqjVarArr = this.b;
                    int i3 = this.a;
                    if (i2 >= i3) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            dqjVarArr[i4].n();
                        }
                    } else if (dqjVarArr[i2].a.size() == 1) {
                        return;
                    } else {
                        i2++;
                    }
                }
            } else if (y2kVar.e.a.size() == 1) {
                return;
            } else {
                y2kVar.e.n();
            }
            removeAndRecycleView(childAt, gVar);
        }
    }

    public final void J() {
        if (this.e == 1 || !isLayoutRTL()) {
            this.i = this.h;
        } else {
            this.i = !this.h;
        }
    }

    public final void K(int i) {
        e4c e4cVar = this.g;
        e4cVar.e = i;
        e4cVar.d = this.i != (i == -1) ? -1 : 1;
    }

    public final void L(int i, int i2) {
        for (int i3 = 0; i3 < this.a; i3++) {
            dqj[] dqjVarArr = this.b;
            if (!dqjVarArr[i3].a.isEmpty()) {
                N(dqjVarArr[i3], i, i2);
            }
        }
    }

    public final void M(int i, vph vphVar) {
        int iL;
        int iL2;
        int i2;
        e4c e4cVar = this.g;
        boolean z = false;
        e4cVar.b = 0;
        e4cVar.c = i;
        if (!isSmoothScrolling() || (i2 = vphVar.a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            boolean z2 = this.i;
            boolean z3 = i2 < i;
            hsf hsfVar = this.c;
            if (z2 == z3) {
                iL = hsfVar.l();
                iL2 = 0;
            } else {
                iL2 = hsfVar.l();
                iL = 0;
            }
        }
        if (getClipToPadding()) {
            e4cVar.f = this.c.k() - iL2;
            e4cVar.g = this.c.g() + iL;
        } else {
            e4cVar.g = this.c.f() + iL;
            e4cVar.f = -iL2;
        }
        e4cVar.h = false;
        e4cVar.a = true;
        if (this.c.i() == 0 && this.c.f() == 0) {
            z = true;
        }
        e4cVar.i = z;
    }

    public final void N(dqj dqjVar, int i, int i2) {
        int i3 = dqjVar.d;
        int i4 = dqjVar.e;
        BitSet bitSet = this.j;
        if (i == -1) {
            int i5 = dqjVar.b;
            if (i5 == Integer.MIN_VALUE) {
                dqjVar.d();
                i5 = dqjVar.b;
            }
            if (i5 + i3 <= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = dqjVar.c;
        if (i6 == Integer.MIN_VALUE) {
            dqjVar.c();
            i6 = dqjVar.c;
        }
        if (i6 - i3 >= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean canScrollHorizontally() {
        return this.e == 0;
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean canScrollVertically() {
        return this.e == 1;
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean checkLayoutParams(lph lphVar) {
        return lphVar instanceof y2k;
    }

    @Override // androidx.recyclerview.widget.f
    public final void collectAdjacentPrefetchPositions(int i, int i2, vph vphVar, jph jphVar) {
        e4c e4cVar;
        int i3;
        if (this.e != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        F(i, vphVar);
        int[] iArr = this.w;
        int i4 = this.a;
        if (iArr == null || iArr.length < i4) {
            this.w = new int[i4];
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            e4cVar = this.g;
            if (i5 >= i4) {
                break;
            }
            int i7 = e4cVar.d;
            dqj[] dqjVarArr = this.b;
            if (i7 == -1) {
                int i8 = e4cVar.f;
                i3 = i8 - dqjVarArr[i5].l(i8);
            } else {
                i3 = dqjVarArr[i5].i(e4cVar.g) - e4cVar.g;
            }
            if (i3 >= 0) {
                this.w[i6] = i3;
                i6++;
            }
            i5++;
        }
        Arrays.sort(this.w, 0, i6);
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = e4cVar.c;
            if (i10 < 0 || i10 >= vphVar.b()) {
                return;
            }
            ((a) jphVar).a(e4cVar.c, this.w[i9]);
            e4cVar.c += e4cVar.d;
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final int computeHorizontalScrollExtent(vph vphVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.v;
        return w8h.f(vphVar, this.c, t(z), s(z), this, this.v);
    }

    @Override // androidx.recyclerview.widget.f
    public final int computeHorizontalScrollOffset(vph vphVar) {
        return q(vphVar);
    }

    @Override // androidx.recyclerview.widget.f
    public final int computeHorizontalScrollRange(vph vphVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.v;
        return w8h.h(vphVar, this.c, t(z), s(z), this, this.v);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    @Override // defpackage.tph
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF computeScrollVectorForPosition(int r4) {
        /*
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Ld
            boolean r4 = r3.i
            if (r4 == 0) goto L1b
            goto L1a
        Ld:
            int r0 = r3.w()
            if (r4 >= r0) goto L15
            r4 = r2
            goto L16
        L15:
            r4 = 0
        L16:
            boolean r0 = r3.i
            if (r4 != r0) goto L1b
        L1a:
            r1 = r2
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r3 = 0
            return r3
        L24:
            int r3 = r3.e
            r0 = 0
            if (r3 != 0) goto L2f
            float r3 = (float) r1
            r4.x = r3
            r4.y = r0
            return r4
        L2f:
            r4.x = r0
            float r3 = (float) r1
            r4.y = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.computeScrollVectorForPosition(int):android.graphics.PointF");
    }

    @Override // androidx.recyclerview.widget.f
    public final int computeVerticalScrollExtent(vph vphVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.v;
        return w8h.f(vphVar, this.c, t(z), s(z), this, this.v);
    }

    @Override // androidx.recyclerview.widget.f
    public final int computeVerticalScrollOffset(vph vphVar) {
        return q(vphVar);
    }

    @Override // androidx.recyclerview.widget.f
    public final int computeVerticalScrollRange(vph vphVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.v;
        return w8h.h(vphVar, this.c, t(z), s(z), this, this.v);
    }

    @Override // androidx.recyclerview.widget.f
    public final lph generateDefaultLayoutParams() {
        return this.e == 0 ? new y2k(-2, -1) : new y2k(-1, -2);
    }

    @Override // androidx.recyclerview.widget.f
    public final lph generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new y2k(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.f
    public final lph generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new y2k((ViewGroup.MarginLayoutParams) layoutParams) : new y2k(layoutParams);
    }

    @Override // androidx.recyclerview.widget.f
    public final int getColumnCountForAccessibility(g gVar, vph vphVar) {
        if (this.e == 1) {
            return Math.min(this.a, vphVar.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.f
    public final int getRowCountForAccessibility(g gVar, vph vphVar) {
        if (this.e == 0) {
            return Math.min(this.a, vphVar.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean isAutoMeasureEnabled() {
        return this.n != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean isLayoutReversed() {
        return this.h;
    }

    @Override // androidx.recyclerview.widget.f
    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.a; i2++) {
            dqj dqjVar = this.b[i2];
            int i3 = dqjVar.b;
            if (i3 != Integer.MIN_VALUE) {
                dqjVar.b = i3 + i;
            }
            int i4 = dqjVar.c;
            if (i4 != Integer.MIN_VALUE) {
                dqjVar.c = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.a; i2++) {
            dqj dqjVar = this.b[i2];
            int i3 = dqjVar.b;
            if (i3 != Integer.MIN_VALUE) {
                dqjVar.b = i3 + i;
            }
            int i4 = dqjVar.c;
            if (i4 != Integer.MIN_VALUE) {
                dqjVar.c = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final void onAdapterChanged(d dVar, d dVar2) {
        this.m.q();
        for (int i = 0; i < this.a; i++) {
            this.b[i].e();
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final void onDetachedFromWindow(RecyclerView recyclerView, g gVar) {
        onDetachedFromWindow(recyclerView);
        removeCallbacks(this.x);
        for (int i = 0; i < this.a; i++) {
            this.b[i].e();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004a  */
    @Override // androidx.recyclerview.widget.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onFocusSearchFailed(android.view.View r9, int r10, androidx.recyclerview.widget.g r11, defpackage.vph r12) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.g, vph):android.view.View");
    }

    @Override // androidx.recyclerview.widget.f
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewT = t(false);
            View viewS = s(false);
            if (viewT == null || viewS == null) {
                return;
            }
            int position = getPosition(viewT);
            int position2 = getPosition(viewS);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final void onInitializeAccessibilityNodeInfo(g gVar, vph vphVar, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(gVar, vphVar, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.t("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.f
    public final void onInitializeAccessibilityNodeInfoForItem(g gVar, vph vphVar, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof y2k)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        y2k y2kVar = (y2k) layoutParams;
        dqj dqjVar = y2kVar.e;
        int i = this.a;
        if (this.e == 0) {
            accessibilityNodeInfoCompat.w(tw2.r(dqjVar != null ? dqjVar.e : -1, y2kVar.f ? i : 1, -1, -1, false, false));
        } else {
            accessibilityNodeInfoCompat.w(tw2.r(-1, -1, dqjVar != null ? dqjVar.e : -1, y2kVar.f ? i : 1, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        A(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.f
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.m.q();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.f
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        A(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.f
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        A(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.f
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        A(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.f
    public final void onLayoutChildren(g gVar, vph vphVar) {
        D(gVar, vphVar, true);
    }

    @Override // androidx.recyclerview.widget.f
    public final void onLayoutCompleted(vph vphVar) {
        this.k = -1;
        this.l = LinearLayoutManager.INVALID_OFFSET;
        this.q = null;
        this.t.a();
    }

    @Override // androidx.recyclerview.widget.f
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof a3k) {
            a3k a3kVar = (a3k) parcelable;
            this.q = a3kVar;
            if (this.k != -1) {
                a3kVar.a = -1;
                a3kVar.b = -1;
                a3kVar.d = null;
                a3kVar.c = 0;
                a3kVar.e = 0;
                a3kVar.f = null;
                a3kVar.g = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final Parcelable onSaveInstanceState() {
        int iL;
        int iK;
        int[] iArr;
        a3k a3kVar = this.q;
        if (a3kVar != null) {
            a3k a3kVar2 = new a3k();
            a3kVar2.c = a3kVar.c;
            a3kVar2.a = a3kVar.a;
            a3kVar2.b = a3kVar.b;
            a3kVar2.d = a3kVar.d;
            a3kVar2.e = a3kVar.e;
            a3kVar2.f = a3kVar.f;
            a3kVar2.h = a3kVar.h;
            a3kVar2.i = a3kVar.i;
            a3kVar2.j = a3kVar.j;
            a3kVar2.g = a3kVar.g;
            return a3kVar2;
        }
        a3k a3kVar3 = new a3k();
        a3kVar3.h = this.h;
        a3kVar3.i = this.o;
        a3kVar3.j = this.p;
        jvg jvgVar = this.m;
        if (jvgVar == null || (iArr = (int[]) jvgVar.b) == null) {
            a3kVar3.e = 0;
        } else {
            a3kVar3.f = iArr;
            a3kVar3.e = iArr.length;
            a3kVar3.g = (ArrayList) jvgVar.c;
        }
        if (getChildCount() <= 0) {
            a3kVar3.a = -1;
            a3kVar3.b = -1;
            a3kVar3.c = 0;
            return a3kVar3;
        }
        a3kVar3.a = this.o ? x() : w();
        View viewS = this.i ? s(true) : t(true);
        a3kVar3.b = viewS != null ? getPosition(viewS) : -1;
        int i = this.a;
        a3kVar3.c = i;
        a3kVar3.d = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.o;
            hsf hsfVar = this.c;
            dqj[] dqjVarArr = this.b;
            if (z) {
                iL = dqjVarArr[i2].i(LinearLayoutManager.INVALID_OFFSET);
                if (iL != Integer.MIN_VALUE) {
                    iK = hsfVar.g();
                    iL -= iK;
                }
            } else {
                iL = dqjVarArr[i2].l(LinearLayoutManager.INVALID_OFFSET);
                if (iL != Integer.MIN_VALUE) {
                    iK = hsfVar.k();
                    iL -= iK;
                }
            }
            a3kVar3.d[i2] = iL;
        }
        return a3kVar3;
    }

    @Override // androidx.recyclerview.widget.f
    public final void onScrollStateChanged(int i) {
        if (i == 0) {
            p();
        }
    }

    public final boolean p() {
        int iW;
        int iX;
        if (getChildCount() != 0 && this.n != 0 && isAttachedToWindow()) {
            if (this.i) {
                iW = x();
                iX = w();
            } else {
                iW = w();
                iX = x();
            }
            jvg jvgVar = this.m;
            if (iW == 0 && B() != null) {
                jvgVar.q();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
            if (this.u) {
                int i = this.i ? -1 : 1;
                int i2 = iX + 1;
                z2k z2kVarV = jvgVar.v(iW, i2, i);
                if (z2kVarV == null) {
                    this.u = false;
                    jvgVar.u(i2);
                    return false;
                }
                z2k z2kVarV2 = jvgVar.v(iW, z2kVarV.a, i * (-1));
                if (z2kVarV2 == null) {
                    jvgVar.u(z2kVarV.a);
                } else {
                    jvgVar.u(z2kVarV2.a + 1);
                }
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    public final int q(vph vphVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.v;
        return w8h.g(vphVar, this.c, t(z), s(z), this, this.v, this.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0364  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int r(androidx.recyclerview.widget.g r25, defpackage.e4c r26, defpackage.vph r27) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r(androidx.recyclerview.widget.g, e4c, vph):int");
    }

    public final View s(boolean z) {
        hsf hsfVar = this.c;
        int iK = hsfVar.k();
        int iG = hsfVar.g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iE = hsfVar.e(childAt);
            int iB = hsfVar.b(childAt);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final int scrollBy(int i, g gVar, vph vphVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        F(i, vphVar);
        e4c e4cVar = this.g;
        int iR = r(gVar, e4cVar, vphVar);
        if (e4cVar.b >= iR) {
            i = i < 0 ? -iR : iR;
        }
        this.c.p(-i);
        this.o = this.i;
        e4cVar.b = 0;
        G(gVar, e4cVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.f
    public final int scrollHorizontallyBy(int i, g gVar, vph vphVar) {
        return scrollBy(i, gVar, vphVar);
    }

    @Override // androidx.recyclerview.widget.f
    public final void scrollToPosition(int i) {
        a3k a3kVar = this.q;
        if (a3kVar != null && a3kVar.a != i) {
            a3kVar.d = null;
            a3kVar.c = 0;
            a3kVar.a = -1;
            a3kVar.b = -1;
        }
        this.k = i;
        this.l = LinearLayoutManager.INVALID_OFFSET;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.f
    public final int scrollVerticallyBy(int i, g gVar, vph vphVar) {
        return scrollBy(i, gVar, vphVar);
    }

    @Override // androidx.recyclerview.widget.f
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.e == 1) {
            iChooseSize2 = f.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            iChooseSize = f.chooseSize(i, (this.f * this.a) + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = f.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            iChooseSize2 = f.chooseSize(i2, (this.f * this.a) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.f
    public void smoothScrollToPosition(RecyclerView recyclerView, vph vphVar, int i) {
        ifc ifcVar = new ifc(recyclerView.getContext());
        ifcVar.setTargetPosition(i);
        startSmoothScroll(ifcVar);
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean supportsPredictiveItemAnimations() {
        return this.q == null;
    }

    public final View t(boolean z) {
        hsf hsfVar = this.c;
        int iK = hsfVar.k();
        int iG = hsfVar.g();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int iE = hsfVar.e(childAt);
            if (hsfVar.b(childAt) > iK && iE < iG) {
                if (iE >= iK || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void u(g gVar, vph vphVar, boolean z) {
        int iG;
        int iY = y(LinearLayoutManager.INVALID_OFFSET);
        if (iY == Integer.MIN_VALUE || (iG = this.c.g() - iY) <= 0) {
            return;
        }
        int i = iG - (-scrollBy(-iG, gVar, vphVar));
        if (!z || i <= 0) {
            return;
        }
        this.c.p(i);
    }

    public final void v(g gVar, vph vphVar, boolean z) {
        int iK;
        int iZ = z(Integer.MAX_VALUE);
        if (iZ == Integer.MAX_VALUE || (iK = iZ - this.c.k()) <= 0) {
            return;
        }
        int iScrollBy = iK - scrollBy(iK, gVar, vphVar);
        if (!z || iScrollBy <= 0) {
            return;
        }
        this.c.p(-iScrollBy);
    }

    public final int w() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public final int x() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final int y(int i) {
        int i2 = this.b[0].i(i);
        for (int i3 = 1; i3 < this.a; i3++) {
            int i4 = this.b[i3].i(i);
            if (i4 > i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    public final int z(int i) {
        int iL = this.b[0].l(i);
        for (int i2 = 1; i2 < this.a; i2++) {
            int iL2 = this.b[i2].l(i);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }
}
