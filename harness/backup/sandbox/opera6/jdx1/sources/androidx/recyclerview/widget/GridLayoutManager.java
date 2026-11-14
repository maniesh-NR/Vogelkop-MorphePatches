package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import defpackage.bfc;
import defpackage.dfc;
import defpackage.jph;
import defpackage.lph;
import defpackage.s8;
import defpackage.tx7;
import defpackage.vph;
import defpackage.w4a;
import defpackage.x4a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set l = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean a;
    public int b;
    public int[] c;
    public View[] d;
    public final SparseIntArray e;
    public final SparseIntArray f;
    public tx7 g;
    public final Rect h;
    public int i;
    public int j;
    public int k;

    public GridLayoutManager(int i) {
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new w4a();
        this.h = new Rect();
        this.i = -1;
        this.j = -1;
        this.k = -1;
        O(i);
    }

    public GridLayoutManager(int i, int i2) {
        super(i2, false);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new w4a();
        this.h = new Rect();
        this.i = -1;
        this.j = -1;
        this.k = -1;
        O(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new w4a();
        this.h = new Rect();
        this.i = -1;
        this.j = -1;
        this.k = -1;
        O(f.getProperties(context, attributeSet, i, i2).b);
    }

    public final void D(int i) {
        int i2;
        int[] iArr = this.c;
        int i3 = this.b;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.c = iArr;
    }

    public final void E() {
        View[] viewArr = this.d;
        if (viewArr == null || viewArr.length != this.b) {
            this.d = new View[this.b];
        }
    }

    public final int F(int i) {
        int i2 = this.mOrientation;
        RecyclerView recyclerView = this.mRecyclerView;
        return i2 == 0 ? K(i, recyclerView.c, recyclerView.h0) : L(i, recyclerView.c, recyclerView.h0);
    }

    public final int G(int i) {
        int i2 = this.mOrientation;
        RecyclerView recyclerView = this.mRecyclerView;
        return i2 == 1 ? K(i, recyclerView.c, recyclerView.h0) : L(i, recyclerView.c, recyclerView.h0);
    }

    public final HashSet H(int i) {
        return I(G(i), i);
    }

    public final HashSet I(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.mRecyclerView;
        int iM = M(i2, recyclerView.c, recyclerView.h0);
        for (int i3 = i; i3 < i + iM; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    public final int J(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.c;
        int i3 = this.b;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int K(int i, g gVar, vph vphVar) {
        if (!vphVar.g) {
            return this.g.b(i, this.b);
        }
        int iB = gVar.b(i);
        if (iB == -1) {
            return 0;
        }
        return this.g.b(iB, this.b);
    }

    public final int L(int i, g gVar, vph vphVar) {
        if (!vphVar.g) {
            return this.g.c(i, this.b);
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = gVar.b(i);
        if (iB == -1) {
            return 0;
        }
        return this.g.c(iB, this.b);
    }

    public final int M(int i, g gVar, vph vphVar) {
        if (!vphVar.g) {
            return this.g.f(i);
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = gVar.b(i);
        if (iB == -1) {
            return 1;
        }
        return this.g.f(iB);
    }

    public final void N(View view, int i, boolean z) {
        int childMeasureSpec;
        int childMeasureSpec2;
        x4a x4aVar = (x4a) view.getLayoutParams();
        Rect rect = x4aVar.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) x4aVar).topMargin + ((ViewGroup.MarginLayoutParams) x4aVar).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) x4aVar).leftMargin + ((ViewGroup.MarginLayoutParams) x4aVar).rightMargin;
        int iJ = J(x4aVar.e, x4aVar.f);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = f.getChildMeasureSpec(iJ, i, i3, ((ViewGroup.MarginLayoutParams) x4aVar).width, false);
            childMeasureSpec = f.getChildMeasureSpec(this.mOrientationHelper.l(), getHeightMode(), i2, ((ViewGroup.MarginLayoutParams) x4aVar).height, true);
        } else {
            int childMeasureSpec3 = f.getChildMeasureSpec(iJ, i, i2, ((ViewGroup.MarginLayoutParams) x4aVar).height, false);
            int childMeasureSpec4 = f.getChildMeasureSpec(this.mOrientationHelper.l(), getWidthMode(), i3, ((ViewGroup.MarginLayoutParams) x4aVar).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        lph lphVar = (lph) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, childMeasureSpec2, childMeasureSpec, lphVar) : shouldMeasureChild(view, childMeasureSpec2, childMeasureSpec, lphVar)) {
            view.measure(childMeasureSpec2, childMeasureSpec);
        }
    }

    public final void O(int i) {
        if (i == this.b) {
            return;
        }
        this.a = true;
        if (i < 1) {
            qp2.o(sko.i(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.b = i;
        this.g.h();
        requestLayout();
    }

    public final void P() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        D(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean checkLayoutParams(lph lphVar) {
        return lphVar instanceof x4a;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(vph vphVar, dfc dfcVar, jph jphVar) {
        int iF = this.b;
        for (int i = 0; i < this.b && dfcVar.b(vphVar) && iF > 0; i++) {
            int i2 = dfcVar.d;
            ((a) jphVar).a(i2, Math.max(0, dfcVar.g));
            iF -= this.g.f(i2);
            dfcVar.d += dfcVar.e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(g gVar, vph vphVar, boolean z, boolean z2) {
        int i;
        int childCount;
        int childCount2 = getChildCount();
        int i2 = 1;
        if (z2) {
            childCount = getChildCount() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
        }
        int iB = vphVar.b();
        ensureLayoutState();
        int iK = this.mOrientationHelper.k();
        int iG = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iB && L(position, gVar, vphVar) == 0) {
                if (((lph) childAt.getLayoutParams()).a.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.e(childAt) < iG && this.mOrientationHelper.b(childAt) >= iK) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f
    public final lph generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new x4a(-2, -1) : new x4a(-1, -2);
    }

    @Override // androidx.recyclerview.widget.f
    public final lph generateLayoutParams(Context context, AttributeSet attributeSet) {
        x4a x4aVar = new x4a(context, attributeSet);
        x4aVar.e = -1;
        x4aVar.f = 0;
        return x4aVar;
    }

    @Override // androidx.recyclerview.widget.f
    public final lph generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            x4a x4aVar = new x4a((ViewGroup.MarginLayoutParams) layoutParams);
            x4aVar.e = -1;
            x4aVar.f = 0;
            return x4aVar;
        }
        x4a x4aVar2 = new x4a(layoutParams);
        x4aVar2.e = -1;
        x4aVar2.f = 0;
        return x4aVar2;
    }

    @Override // androidx.recyclerview.widget.f
    public final int getColumnCountForAccessibility(g gVar, vph vphVar) {
        if (this.mOrientation == 1) {
            return Math.min(this.b, getItemCount());
        }
        if (vphVar.b() < 1) {
            return 0;
        }
        return K(vphVar.b() - 1, gVar, vphVar) + 1;
    }

    @Override // androidx.recyclerview.widget.f
    public final int getRowCountForAccessibility(g gVar, vph vphVar) {
        if (this.mOrientation == 0) {
            return Math.min(this.b, getItemCount());
        }
        if (vphVar.b() < 1) {
            return 0;
        }
        return K(vphVar.b() - 1, gVar, vphVar) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0230  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void layoutChunk(androidx.recyclerview.widget.g r18, defpackage.vph r19, defpackage.dfc r20, defpackage.cfc r21) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.layoutChunk(androidx.recyclerview.widget.g, vph, dfc, cfc):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(g gVar, vph vphVar, bfc bfcVar, int i) {
        super.onAnchorReady(gVar, vphVar, bfcVar, i);
        P();
        if (vphVar.b() > 0 && !vphVar.g) {
            boolean z = i == 1;
            int iL = L(bfcVar.b, gVar, vphVar);
            if (z) {
                while (iL > 0) {
                    int i2 = bfcVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    bfcVar.b = i3;
                    iL = L(i3, gVar, vphVar);
                }
            } else {
                int iB = vphVar.b() - 1;
                int i4 = bfcVar.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iL2 = L(i5, gVar, vphVar);
                    if (iL2 <= iL) {
                        break;
                    }
                    i4 = i5;
                    iL = iL2;
                }
                bfcVar.b = i4;
            }
        }
        E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cb, code lost:
    
        if (r13 == (r2 > r15)) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.g r26, defpackage.vph r27) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.g, vph):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f
    public final void onInitializeAccessibilityNodeInfo(g gVar, vph vphVar, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(gVar, vphVar, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.t(GridView.class.getName());
        d dVar = this.mRecyclerView.m;
        if (dVar == null || dVar.getItemCount() <= 1) {
            return;
        }
        accessibilityNodeInfoCompat.b(s8.N);
    }

    @Override // androidx.recyclerview.widget.f
    public void onInitializeAccessibilityNodeInfoForItem(g gVar, vph vphVar, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof x4a)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        x4a x4aVar = (x4a) layoutParams;
        int iK = K(x4aVar.a.getLayoutPosition(), gVar, vphVar);
        int i = this.mOrientation;
        int i2 = x4aVar.e;
        int i3 = x4aVar.f;
        if (i == 0) {
            accessibilityNodeInfoCompat.w(tw2.r(i2, i3, iK, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.w(tw2.r(iK, 1, i2, i3, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.g.h();
        this.g.g();
    }

    @Override // androidx.recyclerview.widget.f
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.g.h();
        this.g.g();
    }

    @Override // androidx.recyclerview.widget.f
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.g.h();
        this.g.g();
    }

    @Override // androidx.recyclerview.widget.f
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.g.h();
        this.g.g();
    }

    @Override // androidx.recyclerview.widget.f
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.g.h();
        this.g.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f
    public final void onLayoutChildren(g gVar, vph vphVar) {
        boolean z = vphVar.g;
        SparseIntArray sparseIntArray = this.f;
        SparseIntArray sparseIntArray2 = this.e;
        if (z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                x4a x4aVar = (x4a) getChildAt(i).getLayoutParams();
                int layoutPosition = x4aVar.a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, x4aVar.f);
                sparseIntArray.put(layoutPosition, x4aVar.e);
            }
        }
        super.onLayoutChildren(gVar, vphVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f
    public void onLayoutCompleted(vph vphVar) {
        View viewFindViewByPosition;
        super.onLayoutCompleted(vphVar);
        this.a = false;
        int i = this.i;
        if (i == -1 || (viewFindViewByPosition = findViewByPosition(i)) == null) {
            return;
        }
        viewFindViewByPosition.sendAccessibilityEvent(67108864);
        this.i = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x025f A[EDGE_INSN: B:189:0x025f->B:149:0x025f BREAK  A[LOOP:2: B:113:0x01a1->B:121:0x01c9, LOOP_LABEL: LOOP:2: B:113:0x01a1->B:121:0x01c9]] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0262  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performAccessibilityAction(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f
    public final int scrollHorizontallyBy(int i, g gVar, vph vphVar) {
        P();
        E();
        return super.scrollHorizontallyBy(i, gVar, vphVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f
    public final int scrollVerticallyBy(int i, g gVar, vph vphVar) {
        P();
        E();
        return super.scrollVerticallyBy(i, gVar, vphVar);
    }

    @Override // androidx.recyclerview.widget.f
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        if (this.c == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iChooseSize2 = f.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.c;
            iChooseSize = f.chooseSize(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = f.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.c;
            iChooseSize2 = f.chooseSize(i2, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z) {
        if (z) {
            yt7.k("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.setStackFromEnd(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.a;
    }
}
