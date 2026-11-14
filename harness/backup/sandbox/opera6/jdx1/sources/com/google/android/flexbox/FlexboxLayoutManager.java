package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.g;
import defpackage.b89;
import defpackage.c89;
import defpackage.gl;
import defpackage.gsf;
import defpackage.hsf;
import defpackage.ifc;
import defpackage.kph;
import defpackage.lph;
import defpackage.tph;
import defpackage.vph;
import defpackage.z79;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FlexboxLayoutManager extends f implements s79, tph {
    public static final Rect y = new Rect();
    public byte a;
    public final boolean b;
    public final byte c;
    public boolean e;
    public boolean f;
    public g i;
    public vph j;
    public b89 k;
    public final z79 l;
    public hsf m;
    public hsf n;
    public c89 o;
    public int p;
    public int q;
    public int r;
    public int s;
    public final SparseArray t;
    public final Context u;
    public View v;
    public int w;
    public final gl x;
    public final int d = -1;
    public List g = new ArrayList();
    public final x79 h = new x79(this);

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        z79 z79Var = new z79(this);
        this.l = z79Var;
        this.p = -1;
        this.q = LinearLayoutManager.INVALID_OFFSET;
        this.r = LinearLayoutManager.INVALID_OFFSET;
        this.s = LinearLayoutManager.INVALID_OFFSET;
        this.t = new SparseArray();
        this.w = -1;
        this.x = new gl();
        kph properties = f.getProperties(context, attributeSet, i, i2);
        int i3 = properties.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.c) {
                    G(3);
                } else {
                    G(2);
                }
            }
        } else if (properties.c) {
            G(1);
        } else {
            G(0);
        }
        boolean z = this.b;
        if (!z) {
            if (!z) {
                removeAllViews();
                this.g.clear();
                z79Var.b();
                z79Var.d = 0;
            }
            this.b = true;
            this.m = null;
            this.n = null;
            requestLayout();
        }
        if (this.c != 4) {
            removeAllViews();
            this.g.clear();
            z79Var.b();
            z79Var.d = 0;
            this.c = (byte) 4;
            requestLayout();
        }
        this.u = context;
    }

    public static boolean n(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public final int A(int i, g gVar, vph vphVar, boolean z) {
        int iC;
        int iG;
        if (l() || !this.e) {
            int iG2 = this.m.g() - i;
            if (iG2 <= 0) {
                return 0;
            }
            iC = -C(-iG2, gVar, vphVar);
        } else {
            int iK = i - this.m.k();
            if (iK <= 0) {
                return 0;
            }
            iC = C(iK, gVar, vphVar);
        }
        int i2 = i + iC;
        if (!z || (iG = this.m.g() - i2) <= 0) {
            return iC;
        }
        this.m.p(iG);
        return iG + iC;
    }

    public final int B(int i, g gVar, vph vphVar, boolean z) {
        int iC;
        int iK;
        if (l() || !this.e) {
            int iK2 = i - this.m.k();
            if (iK2 <= 0) {
                return 0;
            }
            iC = -C(iK2, gVar, vphVar);
        } else {
            int iG = this.m.g() - i;
            if (iG <= 0) {
                return 0;
            }
            iC = C(-iG, gVar, vphVar);
        }
        int i2 = i + iC;
        if (!z || (iK = i2 - this.m.k()) <= 0) {
            return iC;
        }
        this.m.p(-iK);
        return iC - iK;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int C(int r20, androidx.recyclerview.widget.g r21, defpackage.vph r22) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.C(int, androidx.recyclerview.widget.g, vph):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if ((r4 + r5) > 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if ((r4 + r5) >= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        return -r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int D(int r5) {
        /*
            r4 = this;
            int r0 = r4.getChildCount()
            if (r0 == 0) goto L58
            if (r5 == 0) goto L58
            r4.s()
            boolean r0 = r4.l()
            android.view.View r1 = r4.v
            if (r0 == 0) goto L1c
            int r0 = r1.getWidth()
            int r1 = r4.getWidth()
            goto L24
        L1c:
            int r0 = r1.getHeight()
            int r1 = r4.getHeight()
        L24:
            int r2 = r4.getLayoutDirection()
            r3 = 1
            z79 r4 = r4.l
            if (r2 != r3) goto L44
            int r2 = java.lang.Math.abs(r5)
            if (r5 >= 0) goto L3d
            int r4 = r4.d
            int r1 = r1 + r4
            int r1 = r1 - r0
            int r4 = java.lang.Math.min(r1, r2)
            int r4 = -r4
            return r4
        L3d:
            int r4 = r4.d
            int r0 = r4 + r5
            if (r0 <= 0) goto L55
            goto L56
        L44:
            if (r5 <= 0) goto L4f
            int r4 = r4.d
            int r1 = r1 - r4
            int r1 = r1 - r0
            int r4 = java.lang.Math.min(r1, r5)
            return r4
        L4f:
            int r4 = r4.d
            int r0 = r4 + r5
            if (r0 < 0) goto L56
        L55:
            return r5
        L56:
            int r4 = -r4
            return r4
        L58:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.D(int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(androidx.recyclerview.widget.g r10, defpackage.b89 r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.E(androidx.recyclerview.widget.g, b89):void");
    }

    public final void F() {
        int heightMode = l() ? getHeightMode() : getWidthMode();
        this.k.b = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(int i) {
        if (this.a != i) {
            removeAllViews();
            this.a = i;
            this.m = null;
            this.n = null;
            this.g.clear();
            z79 z79Var = this.l;
            z79Var.b();
            z79Var.d = 0;
            requestLayout();
        }
    }

    public final boolean H(View view, int i, int i2, a89 a89Var) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && n(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) a89Var).width) && n(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) a89Var).height)) ? false : true;
    }

    public final void I(int i) {
        View viewY = y(getChildCount() - 1, -1);
        if (i < (viewY != null ? getPosition(viewY) : -1)) {
            int childCount = getChildCount();
            x79 x79Var = this.h;
            x79Var.u(childCount);
            x79Var.v(childCount);
            x79Var.t(childCount);
            if (i < ((int[]) x79Var.c).length) {
                this.w = i;
                View childAt = getChildAt(0);
                if (childAt == null) {
                    return;
                }
                this.p = getPosition(childAt);
                if (l() || !this.e) {
                    this.q = this.m.e(childAt) - this.m.k();
                } else {
                    this.q = this.m.h() + this.m.b(childAt);
                }
            }
        }
    }

    public final void J(z79 z79Var, boolean z, boolean z2) {
        int i;
        if (z2) {
            F();
        } else {
            this.k.b = false;
        }
        if (l() || !this.e) {
            this.k.a = this.m.g() - z79Var.c;
        } else {
            this.k.a = z79Var.c - getPaddingRight();
        }
        b89 b89Var = this.k;
        b89Var.d = z79Var.a;
        b89Var.h = 1;
        b89Var.e = z79Var.c;
        b89Var.f = LinearLayoutManager.INVALID_OFFSET;
        b89Var.c = z79Var.b;
        if (!z || this.g.size() <= 1 || (i = z79Var.b) < 0 || i >= this.g.size() - 1) {
            return;
        }
        v79 v79Var = (v79) this.g.get(z79Var.b);
        b89 b89Var2 = this.k;
        b89Var2.c++;
        b89Var2.d += v79Var.h;
    }

    public final void K(z79 z79Var, boolean z, boolean z2) {
        if (z2) {
            F();
        } else {
            this.k.b = false;
        }
        if (l() || !this.e) {
            this.k.a = z79Var.c - this.m.k();
        } else {
            this.k.a = (this.v.getWidth() - z79Var.c) - this.m.k();
        }
        b89 b89Var = this.k;
        b89Var.d = z79Var.a;
        b89Var.h = -1;
        b89Var.e = z79Var.c;
        b89Var.f = LinearLayoutManager.INVALID_OFFSET;
        int i = z79Var.b;
        b89Var.c = i;
        if (!z || i <= 0) {
            return;
        }
        int size = this.g.size();
        int i2 = z79Var.b;
        if (size > i2) {
            v79 v79Var = (v79) this.g.get(i2);
            r2.c--;
            this.k.d -= v79Var.h;
        }
    }

    public final int b(int i, int i2, int i3) {
        return f.getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    public final void c(View view, int i, int i2, v79 v79Var) {
        calculateItemDecorationsForChild(view, y);
        if (l()) {
            int rightDecorationWidth = getRightDecorationWidth(view) + getLeftDecorationWidth(view);
            v79Var.e += rightDecorationWidth;
            v79Var.f += rightDecorationWidth;
            return;
        }
        int bottomDecorationHeight = getBottomDecorationHeight(view) + getTopDecorationHeight(view);
        v79Var.e += bottomDecorationHeight;
        v79Var.f += bottomDecorationHeight;
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean canScrollHorizontally() {
        if (!this.b) {
            return l();
        }
        if (!l()) {
            return true;
        }
        int width = getWidth();
        View view = this.v;
        return width > (view != null ? view.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean canScrollVertically() {
        if (!this.b) {
            return !l();
        }
        if (!l()) {
            int height = getHeight();
            View view = this.v;
            if (height <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean checkLayoutParams(lph lphVar) {
        return lphVar instanceof a89;
    }

    @Override // androidx.recyclerview.widget.f
    public final int computeHorizontalScrollExtent(vph vphVar) {
        return p(vphVar);
    }

    @Override // androidx.recyclerview.widget.f
    public final int computeHorizontalScrollOffset(vph vphVar) {
        return q(vphVar);
    }

    @Override // androidx.recyclerview.widget.f
    public final int computeHorizontalScrollRange(vph vphVar) {
        return r(vphVar);
    }

    @Override // defpackage.tph
    public final PointF computeScrollVectorForPosition(int i) {
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        int i2 = i < getPosition(childAt) ? -1 : 1;
        return l() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    @Override // androidx.recyclerview.widget.f
    public final int computeVerticalScrollExtent(vph vphVar) {
        return p(vphVar);
    }

    @Override // androidx.recyclerview.widget.f
    public final int computeVerticalScrollOffset(vph vphVar) {
        return q(vphVar);
    }

    @Override // androidx.recyclerview.widget.f
    public final int computeVerticalScrollRange(vph vphVar) {
        return r(vphVar);
    }

    public final View d(int i) {
        View view = (View) this.t.get(i);
        return view != null ? view : this.i.d(i);
    }

    public final int e(int i, int i2, int i3) {
        return f.getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    public final void f(v79 v79Var) {
    }

    public final int g(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (l()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return rightDecorationWidth + leftDecorationWidth;
    }

    @Override // androidx.recyclerview.widget.f
    public final lph generateLayoutParams(Context context, AttributeSet attributeSet) {
        a89 a89Var = new a89(context, attributeSet);
        a89Var.e = 0.0f;
        a89Var.f = 1.0f;
        a89Var.g = -1;
        a89Var.h = -1.0f;
        a89Var.k = 16777215;
        a89Var.l = 16777215;
        return a89Var;
    }

    public final int getAlignContent() {
        return 5;
    }

    public final int getAlignItems() {
        return this.c;
    }

    public final int getFlexDirection() {
        return this.a;
    }

    public final int getFlexItemCount() {
        return this.j.b();
    }

    public final List getFlexLinesInternal() {
        return this.g;
    }

    public final int getFlexWrap() {
        return this.b ? 1 : 0;
    }

    public final int getLargestMainSize() {
        if (this.g.size() == 0) {
            return 0;
        }
        int size = this.g.size();
        int iMax = LinearLayoutManager.INVALID_OFFSET;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((v79) this.g.get(i)).e);
        }
        return iMax;
    }

    public final int getMaxLine() {
        return this.d;
    }

    public final int getSumOfCrossSize() {
        int size = this.g.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((v79) this.g.get(i2)).g;
        }
        return i;
    }

    public final View h(int i) {
        return d(i);
    }

    public final void i(int i, View view) {
        this.t.put(i, view);
    }

    public final void j(ArrayList arrayList) {
        this.g = arrayList;
    }

    public final int k(View view, int i, int i2) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (l()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return bottomDecorationHeight + topDecorationHeight;
    }

    public final boolean l() {
        byte b = this.a;
        return b == 0 || b == 1;
    }

    @Override // androidx.recyclerview.widget.f
    public final void onAdapterChanged(d dVar, d dVar2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.f
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.v = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.f
    public final void onDetachedFromWindow(RecyclerView recyclerView, g gVar) {
        onDetachedFromWindow(recyclerView);
    }

    @Override // androidx.recyclerview.widget.f
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        I(i);
    }

    @Override // androidx.recyclerview.widget.f
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        super.onItemsMoved(recyclerView, i, i2, i3);
        I(Math.min(i, i2));
    }

    @Override // androidx.recyclerview.widget.f
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        I(i);
    }

    @Override // androidx.recyclerview.widget.f
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        super.onItemsUpdated(recyclerView, i, i2);
        I(i);
    }

    @Override // androidx.recyclerview.widget.f
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        I(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e2  */
    @Override // androidx.recyclerview.widget.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayoutChildren(androidx.recyclerview.widget.g r22, defpackage.vph r23) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.onLayoutChildren(androidx.recyclerview.widget.g, vph):void");
    }

    @Override // androidx.recyclerview.widget.f
    public final void onLayoutCompleted(vph vphVar) {
        this.o = null;
        this.p = -1;
        this.q = LinearLayoutManager.INVALID_OFFSET;
        this.w = -1;
        this.l.b();
        this.t.clear();
    }

    @Override // androidx.recyclerview.widget.f
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof c89) {
            this.o = (c89) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final Parcelable onSaveInstanceState() {
        c89 c89Var = this.o;
        if (c89Var != null) {
            c89 c89Var2 = new c89();
            c89Var2.a = c89Var.a;
            c89Var2.b = c89Var.b;
            return c89Var2;
        }
        c89 c89Var3 = new c89();
        if (getChildCount() <= 0) {
            c89Var3.a = -1;
            return c89Var3;
        }
        View childAt = getChildAt(0);
        c89Var3.a = getPosition(childAt);
        c89Var3.b = this.m.e(childAt) - this.m.k();
        return c89Var3;
    }

    public final int p(vph vphVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iB = vphVar.b();
        s();
        View viewU = u(iB);
        View viewW = w(iB);
        if (vphVar.b() == 0 || viewU == null || viewW == null) {
            return 0;
        }
        return Math.min(this.m.l(), this.m.b(viewW) - this.m.e(viewU));
    }

    public final int q(vph vphVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iB = vphVar.b();
        View viewU = u(iB);
        View viewW = w(iB);
        if (vphVar.b() == 0 || viewU == null || viewW == null) {
            return 0;
        }
        int position = getPosition(viewU);
        int position2 = getPosition(viewW);
        int iAbs = Math.abs(this.m.b(viewW) - this.m.e(viewU));
        int i = ((int[]) this.h.c)[position];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (iAbs / ((r3[position2] - i) + 1))) + (this.m.k() - this.m.e(viewU)));
    }

    public final int r(vph vphVar) {
        if (getChildCount() != 0) {
            int iB = vphVar.b();
            View viewU = u(iB);
            View viewW = w(iB);
            if (vphVar.b() != 0 && viewU != null && viewW != null) {
                View viewY = y(0, getChildCount());
                int position = viewY == null ? -1 : getPosition(viewY);
                return (int) ((Math.abs(this.m.b(viewW) - this.m.e(viewU)) / (((y(getChildCount() - 1, -1) != null ? getPosition(r4) : -1) - position) + 1)) * vphVar.b());
            }
        }
        return 0;
    }

    public final void s() {
        if (this.m != null) {
            return;
        }
        boolean zL = l();
        boolean z = this.b;
        if (zL) {
            if (z) {
                this.m = new gsf(this, (byte) 1);
                this.n = new gsf(this, (byte) 0);
                return;
            } else {
                this.m = new gsf(this, (byte) 0);
                this.n = new gsf(this, (byte) 1);
                return;
            }
        }
        if (z) {
            this.m = new gsf(this, (byte) 0);
            this.n = new gsf(this, (byte) 1);
        } else {
            this.m = new gsf(this, (byte) 1);
            this.n = new gsf(this, (byte) 0);
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final int scrollHorizontallyBy(int i, g gVar, vph vphVar) {
        if (!l() || !this.b) {
            int iC = C(i, gVar, vphVar);
            this.t.clear();
            return iC;
        }
        int iD = D(i);
        this.l.d += iD;
        this.n.p(-iD);
        return iD;
    }

    @Override // androidx.recyclerview.widget.f
    public final void scrollToPosition(int i) {
        this.p = i;
        this.q = LinearLayoutManager.INVALID_OFFSET;
        c89 c89Var = this.o;
        if (c89Var != null) {
            c89Var.a = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.f
    public final int scrollVerticallyBy(int i, g gVar, vph vphVar) {
        if (l() || !(this.b || l())) {
            int iC = C(i, gVar, vphVar);
            this.t.clear();
            return iC;
        }
        int iD = D(i);
        this.l.d += iD;
        this.n.p(-iD);
        return iD;
    }

    @Override // androidx.recyclerview.widget.f
    public final void smoothScrollToPosition(RecyclerView recyclerView, vph vphVar, int i) {
        ifc ifcVar = new ifc(recyclerView.getContext());
        ifcVar.setTargetPosition(i);
        startSmoothScroll(ifcVar);
    }

    public final int t(g gVar, vph vphVar, b89 b89Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        x79 x79Var;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        Rect rect;
        int i10;
        float f;
        x79 x79Var2;
        int i11 = b89Var.f;
        if (i11 != Integer.MIN_VALUE) {
            int i12 = b89Var.a;
            if (i12 < 0) {
                b89Var.f = i11 + i12;
            }
            E(gVar, b89Var);
        }
        int i13 = b89Var.a;
        boolean zL = l();
        int i14 = i13;
        int i15 = 0;
        while (true) {
            if (i14 <= 0 && !this.k.b) {
                break;
            }
            List list = this.g;
            int i16 = b89Var.d;
            if (i16 < 0 || i16 >= vphVar.b() || (i = b89Var.c) < 0 || i >= list.size()) {
                break;
            }
            v79 v79Var = (v79) this.g.get(b89Var.c);
            b89Var.d = v79Var.o;
            boolean zL2 = l();
            Rect rect2 = y;
            z79 z79Var = this.l;
            x79 x79Var3 = this.h;
            if (zL2) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int width = getWidth();
                int i17 = b89Var.e;
                if (b89Var.h == -1) {
                    i17 -= v79Var.g;
                }
                int i18 = b89Var.d;
                float f2 = z79Var.d;
                float rightDecorationWidth = paddingLeft - f2;
                float leftDecorationWidth = (width - paddingRight) - f2;
                int i19 = v79Var.h;
                i2 = i13;
                int i20 = i18;
                int i21 = 0;
                while (i20 < i20 + i19) {
                    int i22 = i19;
                    View viewD = d(i20);
                    if (viewD == null) {
                        i9 = i21;
                        i7 = i22;
                        z2 = zL;
                        i8 = i17;
                        rect = rect2;
                        i10 = i20;
                        x79Var2 = x79Var3;
                    } else {
                        i7 = i22;
                        z2 = zL;
                        if (b89Var.h == 1) {
                            calculateItemDecorationsForChild(viewD, rect2);
                            addView(viewD);
                        } else {
                            calculateItemDecorationsForChild(viewD, rect2);
                            addView(viewD, i21);
                            i21++;
                        }
                        i8 = i17;
                        long j = ((long[]) x79Var3.d)[i20];
                        int i23 = (int) j;
                        int i24 = (int) (j >> 32);
                        if (H(viewD, i23, i24, (a89) viewD.getLayoutParams())) {
                            viewD.measure(i23, i24);
                        }
                        float leftDecorationWidth2 = rightDecorationWidth + getLeftDecorationWidth(viewD) + ((ViewGroup.MarginLayoutParams) r6).leftMargin;
                        float rightDecorationWidth2 = leftDecorationWidth - (getRightDecorationWidth(viewD) + ((ViewGroup.MarginLayoutParams) r6).rightMargin);
                        int topDecorationHeight = getTopDecorationHeight(viewD) + i8;
                        boolean z3 = this.e;
                        Rect rect3 = rect2;
                        x79 x79Var4 = this.h;
                        if (z3) {
                            int iRound = Math.round(rightDecorationWidth2) - viewD.getMeasuredWidth();
                            x79 x79Var5 = x79Var3;
                            int iRound2 = Math.round(rightDecorationWidth2);
                            int measuredHeight = viewD.getMeasuredHeight() + topDecorationHeight;
                            i9 = i21;
                            rect = rect3;
                            f = rightDecorationWidth2;
                            x79Var2 = x79Var5;
                            i10 = i20;
                            x79Var4.K(viewD, v79Var, iRound, topDecorationHeight, iRound2, measuredHeight);
                        } else {
                            i9 = i21;
                            rect = rect3;
                            i10 = i20;
                            f = rightDecorationWidth2;
                            x79Var2 = x79Var3;
                            x79Var4.K(viewD, v79Var, Math.round(leftDecorationWidth2), topDecorationHeight, viewD.getMeasuredWidth() + Math.round(leftDecorationWidth2), viewD.getMeasuredHeight() + topDecorationHeight);
                        }
                        leftDecorationWidth = f - ((getLeftDecorationWidth(viewD) + (viewD.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).leftMargin)) + 0.0f);
                        rightDecorationWidth = getRightDecorationWidth(viewD) + viewD.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).rightMargin + 0.0f + leftDecorationWidth2;
                    }
                    i20 = i10 + 1;
                    rect2 = rect;
                    x79Var3 = x79Var2;
                    i19 = i7;
                    zL = z2;
                    i17 = i8;
                    i21 = i9;
                }
                z = zL;
                b89Var.c += this.k.h;
            } else {
                i2 = i13;
                z = zL;
                x79 x79Var6 = x79Var3;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i25 = b89Var.e;
                if (b89Var.h == -1) {
                    int i26 = v79Var.g;
                    i4 = i25 + i26;
                    i3 = i25 - i26;
                } else {
                    i3 = i25;
                    i4 = i3;
                }
                int i27 = b89Var.d;
                float f3 = height - paddingBottom;
                float f4 = z79Var.d;
                float bottomDecorationHeight = paddingTop - f4;
                float topDecorationHeight2 = f3 - f4;
                int i28 = v79Var.h;
                int i29 = i27;
                int i30 = 0;
                while (i29 < i27 + i28) {
                    int i31 = i29;
                    View viewD2 = d(i31);
                    if (viewD2 == null) {
                        x79Var = x79Var6;
                        i6 = i27;
                        i5 = i31;
                    } else {
                        x79Var = x79Var6;
                        float f5 = bottomDecorationHeight;
                        long j2 = ((long[]) x79Var6.d)[i31];
                        int i32 = (int) j2;
                        int i33 = (int) (j2 >> 32);
                        if (H(viewD2, i32, i33, (a89) viewD2.getLayoutParams())) {
                            viewD2.measure(i32, i33);
                        }
                        float topDecorationHeight3 = f5 + getTopDecorationHeight(viewD2) + ((ViewGroup.MarginLayoutParams) r5).topMargin;
                        float bottomDecorationHeight2 = topDecorationHeight2 - (getBottomDecorationHeight(viewD2) + ((ViewGroup.MarginLayoutParams) r5).rightMargin);
                        if (b89Var.h == 1) {
                            calculateItemDecorationsForChild(viewD2, rect2);
                            addView(viewD2);
                        } else {
                            calculateItemDecorationsForChild(viewD2, rect2);
                            addView(viewD2, i30);
                            i30++;
                        }
                        int i34 = i30;
                        int leftDecorationWidth3 = getLeftDecorationWidth(viewD2) + i3;
                        int rightDecorationWidth3 = i4 - getRightDecorationWidth(viewD2);
                        boolean z4 = this.e;
                        boolean z5 = this.f;
                        int i35 = i27;
                        x79 x79Var7 = this.h;
                        if (!z4) {
                            i5 = i31;
                            i6 = i35;
                            if (z5) {
                                x79Var7.L(viewD2, v79Var, z4, leftDecorationWidth3, Math.round(bottomDecorationHeight2) - viewD2.getMeasuredHeight(), viewD2.getMeasuredWidth() + leftDecorationWidth3, Math.round(bottomDecorationHeight2));
                            } else {
                                x79Var7.L(viewD2, v79Var, z4, leftDecorationWidth3, Math.round(topDecorationHeight3), viewD2.getMeasuredWidth() + leftDecorationWidth3, viewD2.getMeasuredHeight() + Math.round(topDecorationHeight3));
                            }
                        } else if (z5) {
                            i6 = i35;
                            i5 = i31;
                            x79Var7.L(viewD2, v79Var, z4, rightDecorationWidth3 - viewD2.getMeasuredWidth(), Math.round(bottomDecorationHeight2) - viewD2.getMeasuredHeight(), rightDecorationWidth3, Math.round(bottomDecorationHeight2));
                        } else {
                            i5 = i31;
                            i6 = i35;
                            x79Var7.L(viewD2, v79Var, z4, rightDecorationWidth3 - viewD2.getMeasuredWidth(), Math.round(topDecorationHeight3), rightDecorationWidth3, viewD2.getMeasuredHeight() + Math.round(topDecorationHeight3));
                        }
                        topDecorationHeight2 = bottomDecorationHeight2 - ((getTopDecorationHeight(viewD2) + (viewD2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r5).bottomMargin)) + 0.0f);
                        bottomDecorationHeight = getBottomDecorationHeight(viewD2) + viewD2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r5).topMargin + 0.0f + topDecorationHeight3;
                        i30 = i34;
                    }
                    i29 = i5 + 1;
                    x79Var6 = x79Var;
                    i27 = i6;
                }
                b89Var.c += this.k.h;
            }
            int i36 = v79Var.g;
            i15 += i36;
            if (z || !this.e) {
                b89Var.e += b89Var.h * i36;
            } else {
                b89Var.e -= b89Var.h * i36;
            }
            i14 -= i36;
            i13 = i2;
            zL = z;
        }
        int i37 = i13;
        int i38 = b89Var.a - i15;
        b89Var.a = i38;
        int i39 = b89Var.f;
        if (i39 != Integer.MIN_VALUE) {
            int i40 = i39 + i15;
            b89Var.f = i40;
            if (i38 < 0) {
                b89Var.f = i40 + i38;
            }
            E(gVar, b89Var);
        }
        return i37 - b89Var.a;
    }

    public final View u(int i) {
        View viewZ = z(0, getChildCount(), i);
        if (viewZ == null) {
            return null;
        }
        int i2 = ((int[]) this.h.c)[getPosition(viewZ)];
        if (i2 == -1) {
            return null;
        }
        return v(viewZ, (v79) this.g.get(i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View v(android.view.View r6, v79 r7) {
        /*
            r5 = this;
            boolean r0 = r5.l()
            int r7 = r7.h
            r1 = 1
        L7:
            if (r1 >= r7) goto L3e
            android.view.View r2 = r5.getChildAt(r1)
            if (r2 == 0) goto L3b
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 == r4) goto L3b
            boolean r3 = r5.e
            if (r3 == 0) goto L2c
            if (r0 != 0) goto L2c
            hsf r3 = r5.m
            int r3 = r3.b(r6)
            hsf r4 = r5.m
            int r4 = r4.b(r2)
            if (r3 >= r4) goto L3b
            goto L3a
        L2c:
            hsf r3 = r5.m
            int r3 = r3.e(r6)
            hsf r4 = r5.m
            int r4 = r4.e(r2)
            if (r3 <= r4) goto L3b
        L3a:
            r6 = r2
        L3b:
            int r1 = r1 + 1
            goto L7
        L3e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.v(android.view.View, v79):android.view.View");
    }

    public final View w(int i) {
        View viewZ = z(getChildCount() - 1, -1, i);
        if (viewZ == null) {
            return null;
        }
        return x(viewZ, (v79) this.g.get(((int[]) this.h.c)[getPosition(viewZ)]));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View x(android.view.View r6, v79 r7) {
        /*
            r5 = this;
            boolean r0 = r5.l()
            int r1 = r5.getChildCount()
            int r1 = r1 + (-2)
            int r2 = r5.getChildCount()
            int r7 = r7.h
            int r2 = r2 - r7
            int r2 = r2 + (-1)
        L13:
            if (r1 <= r2) goto L4a
            android.view.View r7 = r5.getChildAt(r1)
            if (r7 == 0) goto L47
            int r3 = r7.getVisibility()
            r4 = 8
            if (r3 == r4) goto L47
            boolean r3 = r5.e
            if (r3 == 0) goto L38
            if (r0 != 0) goto L38
            hsf r3 = r5.m
            int r3 = r3.e(r6)
            hsf r4 = r5.m
            int r4 = r4.e(r7)
            if (r3 <= r4) goto L47
            goto L46
        L38:
            hsf r3 = r5.m
            int r3 = r3.b(r6)
            hsf r4 = r5.m
            int r4 = r4.b(r7)
            if (r3 >= r4) goto L47
        L46:
            r6 = r7
        L47:
            int r1 = r1 + (-1)
            goto L13
        L4a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.x(android.view.View, v79):android.view.View");
    }

    public final View y(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View childAt = getChildAt(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int decoratedLeft = getDecoratedLeft(childAt) - ((ViewGroup.MarginLayoutParams) ((lph) childAt.getLayoutParams())).leftMargin;
            int decoratedTop = getDecoratedTop(childAt) - ((ViewGroup.MarginLayoutParams) ((lph) childAt.getLayoutParams())).topMargin;
            int decoratedRight = getDecoratedRight(childAt) + ((ViewGroup.MarginLayoutParams) ((lph) childAt.getLayoutParams())).rightMargin;
            int decoratedBottom = getDecoratedBottom(childAt) + ((ViewGroup.MarginLayoutParams) ((lph) childAt.getLayoutParams())).bottomMargin;
            boolean z = decoratedLeft >= width || decoratedRight >= paddingLeft;
            boolean z2 = decoratedTop >= height || decoratedBottom >= paddingTop;
            if (z && z2) {
                return childAt;
            }
            i += i3;
        }
        return null;
    }

    public final View z(int i, int i2, int i3) {
        int position;
        s();
        if (this.k == null) {
            b89 b89Var = new b89();
            b89Var.h = 1;
            this.k = b89Var;
        }
        int iK = this.m.k();
        int iG = this.m.g();
        int i4 = i2 <= i ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i3) {
                if (((lph) childAt.getLayoutParams()).a.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.m.e(childAt) >= iK && this.m.b(childAt) <= iG) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }
}
