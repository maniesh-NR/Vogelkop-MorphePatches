package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import defpackage.bfc;
import defpackage.cfc;
import defpackage.dfc;
import defpackage.ffc;
import defpackage.hsf;
import defpackage.ifc;
import defpackage.jph;
import defpackage.kph;
import defpackage.lph;
import defpackage.s8;
import defpackage.tph;
import defpackage.vph;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends f implements tph {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final bfc mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final cfc mLayoutChunkResult;
    private dfc mLayoutState;
    int mOrientation;
    hsf mOrientationHelper;
    ffc mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public LinearLayoutManager() {
        this(1, DEBUG);
    }

    public LinearLayoutManager(int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = DEBUG;
        this.mShouldReverseLayout = DEBUG;
        this.mStackFromEnd = DEBUG;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new bfc();
        this.mLayoutChunkResult = new cfc();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = DEBUG;
        this.mShouldReverseLayout = DEBUG;
        this.mStackFromEnd = DEBUG;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new bfc();
        this.mLayoutChunkResult = new cfc();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        kph properties = f.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.a);
        setReverseLayout(properties.c);
        setStackFromEnd(properties.d);
    }

    public final void A(int i, int i2, boolean z, vph vphVar) {
        int iK;
        this.mLayoutState.l = resolveIsInfinite();
        this.mLayoutState.f = i;
        int[] iArr = this.mReusableIntPair;
        boolean z2 = DEBUG;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(vphVar, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        if (i == 1) {
            z2 = true;
        }
        dfc dfcVar = this.mLayoutState;
        int i3 = z2 ? iMax2 : iMax;
        dfcVar.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        dfcVar.i = iMax;
        if (z2) {
            dfcVar.h = this.mOrientationHelper.h() + i3;
            View viewU = u();
            dfc dfcVar2 = this.mLayoutState;
            dfcVar2.e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(viewU);
            dfc dfcVar3 = this.mLayoutState;
            dfcVar2.d = position + dfcVar3.e;
            dfcVar3.b = this.mOrientationHelper.b(viewU);
            iK = this.mOrientationHelper.b(viewU) - this.mOrientationHelper.g();
        } else {
            View viewV = v();
            dfc dfcVar4 = this.mLayoutState;
            dfcVar4.h = this.mOrientationHelper.k() + dfcVar4.h;
            dfc dfcVar5 = this.mLayoutState;
            dfcVar5.e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(viewV);
            dfc dfcVar6 = this.mLayoutState;
            dfcVar5.d = position2 + dfcVar6.e;
            dfcVar6.b = this.mOrientationHelper.e(viewV);
            iK = (-this.mOrientationHelper.e(viewV)) + this.mOrientationHelper.k();
        }
        dfc dfcVar7 = this.mLayoutState;
        dfcVar7.c = i2;
        if (z) {
            dfcVar7.c = i2 - iK;
        }
        dfcVar7.g = iK;
    }

    public final void B(int i, int i2) {
        this.mLayoutState.c = this.mOrientationHelper.g() - i2;
        dfc dfcVar = this.mLayoutState;
        dfcVar.e = this.mShouldReverseLayout ? -1 : 1;
        dfcVar.d = i;
        dfcVar.f = 1;
        dfcVar.b = i2;
        dfcVar.g = INVALID_OFFSET;
    }

    public final void C(int i, int i2) {
        this.mLayoutState.c = i2 - this.mOrientationHelper.k();
        dfc dfcVar = this.mLayoutState;
        dfcVar.d = i;
        dfcVar.e = this.mShouldReverseLayout ? 1 : -1;
        dfcVar.f = -1;
        dfcVar.b = i2;
        dfcVar.g = INVALID_OFFSET;
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(vph vphVar, int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(vphVar);
        if (this.mLayoutState.f == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.f
    public boolean canScrollHorizontally() {
        if (this.mOrientation == 0) {
            return true;
        }
        return DEBUG;
    }

    @Override // androidx.recyclerview.widget.f
    public boolean canScrollVertically() {
        if (this.mOrientation == 1) {
            return true;
        }
        return DEBUG;
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i, int i2, vph vphVar, jph jphVar) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        A(i > 0 ? 1 : -1, Math.abs(i), true, vphVar);
        collectPrefetchPositionsForLayoutState(vphVar, this.mLayoutState, jphVar);
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i, jph jphVar) {
        boolean z;
        int i2;
        ffc ffcVar = this.mPendingSavedState;
        if (ffcVar == null || (i2 = ffcVar.a) < 0) {
            z();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = ffcVar.c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            ((a) jphVar).a(i2, 0);
            i2 += i3;
        }
    }

    public void collectPrefetchPositionsForLayoutState(vph vphVar, dfc dfcVar, jph jphVar) {
        int i = dfcVar.d;
        if (i < 0 || i >= vphVar.b()) {
            return;
        }
        ((a) jphVar).a(i, Math.max(0, dfcVar.g));
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(vph vphVar) {
        return p(vphVar);
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(vph vphVar) {
        return q(vphVar);
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(vph vphVar) {
        return r(vphVar);
    }

    @Override // defpackage.tph
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z = DEBUG;
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        int i2 = z != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(vph vphVar) {
        return p(vphVar);
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(vph vphVar) {
        return q(vphVar);
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(vph vphVar) {
        return r(vphVar);
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        if (i == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.mOrientation == 0) {
                return -1;
            }
            return INVALID_OFFSET;
        }
        if (i == 33) {
            if (this.mOrientation == 1) {
                return -1;
            }
            return INVALID_OFFSET;
        }
        if (i == 66) {
            if (this.mOrientation == 0) {
                return 1;
            }
            return INVALID_OFFSET;
        }
        if (i == 130 && this.mOrientation == 1) {
            return 1;
        }
        return INVALID_OFFSET;
    }

    public dfc createLayoutState() {
        dfc dfcVar = new dfc();
        dfcVar.a = true;
        dfcVar.h = 0;
        dfcVar.i = 0;
        dfcVar.k = null;
        return dfcVar;
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(g gVar, dfc dfcVar, vph vphVar, boolean z) {
        int i = dfcVar.c;
        int i2 = dfcVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                dfcVar.g = i2 + i;
            }
            x(gVar, dfcVar);
        }
        int i3 = dfcVar.c + dfcVar.h;
        cfc cfcVar = this.mLayoutChunkResult;
        while (true) {
            if ((!dfcVar.l && i3 <= 0) || !dfcVar.b(vphVar)) {
                break;
            }
            cfcVar.a = 0;
            cfcVar.b = DEBUG;
            cfcVar.c = DEBUG;
            cfcVar.d = DEBUG;
            layoutChunk(gVar, vphVar, dfcVar, cfcVar);
            if (!cfcVar.b) {
                int i4 = dfcVar.b;
                int i5 = cfcVar.a;
                dfcVar.b = (dfcVar.f * i5) + i4;
                if (!cfcVar.c || dfcVar.k != null || !vphVar.g) {
                    dfcVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = dfcVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    dfcVar.g = i7;
                    int i8 = dfcVar.c;
                    if (i8 < 0) {
                        dfcVar.g = i7 + i8;
                    }
                    x(gVar, dfcVar);
                }
                if (z && cfcVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - dfcVar.c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, DEBUG);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z, z2) : findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z, z2) : findOneVisibleChild(0, getChildCount(), z, z2);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), DEBUG, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, DEBUG);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, DEBUG, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 <= i && i2 >= i) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.e(getChildAt(i)) < this.mOrientationHelper.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i, i2, i3, i4) : this.mVerticalBoundCheck.a(i, i2, i3, i4);
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i, i2, i3, i4) : this.mVerticalBoundCheck.a(i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View findReferenceChild(androidx.recyclerview.widget.g r17, defpackage.vph r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.ensureLayoutState()
            int r1 = r0.getChildCount()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.getChildCount()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            hsf r7 = r0.mOrientationHelper
            int r7 = r7.k()
            hsf r8 = r0.mOrientationHelper
            int r8 = r8.g()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.getChildAt(r1)
            int r13 = r0.getPosition(r12)
            hsf r14 = r0.mOrientationHelper
            int r14 = r14.e(r12)
            hsf r15 = r0.mOrientationHelper
            int r15 = r15.b(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            lph r13 = (defpackage.lph) r13
            androidx.recyclerview.widget.i r13 = r13.a
            boolean r13 = r13.isRemoved()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6a
            if (r14 != 0) goto L6a
            return r12
        L6a:
            if (r19 == 0) goto L71
            if (r14 != 0) goto L73
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            return r9
        L7d:
            if (r10 == 0) goto L80
            return r10
        L80:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.findReferenceChild(androidx.recyclerview.widget.g, vph, boolean, boolean):android.view.View");
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public lph generateDefaultLayoutParams() {
        return new lph(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(vph vphVar) {
        if (vphVar.a != -1) {
            return this.mOrientationHelper.l();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.f
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return DEBUG;
    }

    @Override // androidx.recyclerview.widget.f
    public boolean isLayoutReversed() {
        return this.mReverseLayout;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public void layoutChunk(g gVar, vph vphVar, dfc dfcVar, cfc cfcVar) {
        int i;
        int i2;
        int paddingLeft;
        int i3;
        int iD;
        View viewC = dfcVar.c(gVar);
        if (viewC == null) {
            cfcVar.b = true;
            return;
        }
        lph lphVar = (lph) viewC.getLayoutParams();
        List list = dfcVar.k;
        boolean z = this.mShouldReverseLayout;
        int i4 = dfcVar.f;
        if (list == null) {
            if (z == (i4 == -1)) {
                addView(viewC);
            } else {
                addView(viewC, 0);
            }
        } else {
            if (z == (i4 == -1)) {
                addDisappearingView(viewC);
            } else {
                addDisappearingView(viewC, 0);
            }
        }
        measureChildWithMargins(viewC, 0, 0);
        cfcVar.a = this.mOrientationHelper.c(viewC);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iD = getWidth() - getPaddingRight();
                paddingLeft = iD - this.mOrientationHelper.d(viewC);
            } else {
                paddingLeft = getPaddingLeft();
                iD = this.mOrientationHelper.d(viewC) + paddingLeft;
            }
            int i5 = dfcVar.f;
            int i6 = dfcVar.b;
            int i7 = cfcVar.a;
            if (i5 == -1) {
                i3 = i6 - i7;
                i = i6;
            } else {
                i = i7 + i6;
                i3 = i6;
            }
            i2 = iD;
        } else {
            int paddingTop = getPaddingTop();
            int iD2 = this.mOrientationHelper.d(viewC) + paddingTop;
            int i8 = dfcVar.f;
            int i9 = dfcVar.b;
            int i10 = cfcVar.a;
            if (i8 == -1) {
                int i11 = i9 - i10;
                i2 = i9;
                i = iD2;
                paddingLeft = i11;
            } else {
                int i12 = i9 + i10;
                i = iD2;
                i2 = i12;
                paddingLeft = i9;
            }
            i3 = paddingTop;
        }
        layoutDecoratedWithMargins(viewC, paddingLeft, i3, i2, i);
        if (lphVar.a.isRemoved() || lphVar.a.isUpdated()) {
            cfcVar.c = true;
        }
        cfcVar.d = viewC.hasFocusable();
    }

    public void onAnchorReady(g gVar, vph vphVar, bfc bfcVar, int i) {
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, g gVar) {
        onDetachedFromWindow(recyclerView);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(gVar);
            gVar.a.clear();
            gVar.g();
        }
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i, g gVar, vph vphVar) {
        int iConvertFocusDirectionToLayoutDirection;
        z();
        if (getChildCount() != 0 && (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) != Integer.MIN_VALUE) {
            ensureLayoutState();
            A(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.l() * MAX_SCROLL_FACTOR), DEBUG, vphVar);
            dfc dfcVar = this.mLayoutState;
            dfcVar.g = INVALID_OFFSET;
            dfcVar.a = DEBUG;
            fill(gVar, dfcVar, vphVar, true);
            boolean z = this.mShouldReverseLayout;
            View viewFindOnePartiallyOrCompletelyInvisibleChild = iConvertFocusDirectionToLayoutDirection == -1 ? z ? findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1) : findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : z ? findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
            View viewV = iConvertFocusDirectionToLayoutDirection == -1 ? v() : u();
            if (!viewV.hasFocusable()) {
                return viewFindOnePartiallyOrCompletelyInvisibleChild;
            }
            if (viewFindOnePartiallyOrCompletelyInvisibleChild != null) {
                return viewV;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.f
    public void onInitializeAccessibilityNodeInfo(@NonNull g gVar, @NonNull vph vphVar, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(gVar, vphVar, accessibilityNodeInfoCompat);
        d dVar = this.mRecyclerView.m;
        if (dVar == null || dVar.getItemCount() <= 0) {
            return;
        }
        accessibilityNodeInfoCompat.b(s8.z);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019d  */
    @Override // androidx.recyclerview.widget.f
    @android.annotation.SuppressLint({"UnknownNullness"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayoutChildren(androidx.recyclerview.widget.g r17, defpackage.vph r18) {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.onLayoutChildren(androidx.recyclerview.widget.g, vph):void");
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(vph vphVar) {
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mAnchorInfo.c();
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof ffc) {
            ffc ffcVar = (ffc) parcelable;
            this.mPendingSavedState = ffcVar;
            if (this.mPendingScrollPosition != -1) {
                ffcVar.a = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        ffc ffcVar = this.mPendingSavedState;
        if (ffcVar != null) {
            ffc ffcVar2 = new ffc();
            ffcVar2.a = ffcVar.a;
            ffcVar2.b = ffcVar.b;
            ffcVar2.c = ffcVar.c;
            return ffcVar2;
        }
        ffc ffcVar3 = new ffc();
        if (getChildCount() <= 0) {
            ffcVar3.a = -1;
            return ffcVar3;
        }
        ensureLayoutState();
        boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        ffcVar3.c = z;
        if (z) {
            View viewU = u();
            ffcVar3.b = this.mOrientationHelper.g() - this.mOrientationHelper.b(viewU);
            ffcVar3.a = getPosition(viewU);
            return ffcVar3;
        }
        View viewV = v();
        ffcVar3.a = getPosition(viewV);
        ffcVar3.b = this.mOrientationHelper.e(viewV) - this.mOrientationHelper.k();
        return ffcVar3;
    }

    public final int p(vph vphVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return w8h.f(vphVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    @Override // androidx.recyclerview.widget.f
    public boolean performAccessibilityAction(int i, @Nullable Bundle bundle) {
        int iMin;
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.mOrientation == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return DEBUG;
                }
                RecyclerView recyclerView = this.mRecyclerView;
                iMin = Math.min(i2, getRowCountForAccessibility(recyclerView.c, recyclerView.h0) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return DEBUG;
                }
                RecyclerView recyclerView2 = this.mRecyclerView;
                iMin = Math.min(i3, getColumnCountForAccessibility(recyclerView2.c, recyclerView2.h0) - 1);
            }
            if (iMin >= 0) {
                scrollToPositionWithOffset(iMin, 0);
                return true;
            }
        }
        return DEBUG;
    }

    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        z();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c = position < position2 ? (char) 1 : (char) 65535;
        boolean z = this.mShouldReverseLayout;
        hsf hsfVar = this.mOrientationHelper;
        if (z) {
            if (c == 1) {
                scrollToPositionWithOffset(position2, hsfVar.g() - (this.mOrientationHelper.c(view) + this.mOrientationHelper.e(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, hsfVar.g() - this.mOrientationHelper.b(view2));
                return;
            }
        }
        if (c == 65535) {
            scrollToPositionWithOffset(position2, hsfVar.e(view2));
        } else {
            scrollToPositionWithOffset(position2, hsfVar.b(view2) - this.mOrientationHelper.c(view));
        }
    }

    public final int q(vph vphVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return w8h.g(vphVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public final int r(vph vphVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return w8h.h(vphVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public boolean resolveIsInfinite() {
        if (this.mOrientationHelper.i() == 0 && this.mOrientationHelper.f() == 0) {
            return true;
        }
        return DEBUG;
    }

    public final int s(int i, g gVar, vph vphVar, boolean z) {
        int iG;
        int iG2 = this.mOrientationHelper.g() - i;
        if (iG2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-iG2, gVar, vphVar);
        int i3 = i + i2;
        if (!z || (iG = this.mOrientationHelper.g() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.p(iG);
        return iG + i2;
    }

    public int scrollBy(int i, g gVar, vph vphVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        A(i2, iAbs, true, vphVar);
        dfc dfcVar = this.mLayoutState;
        int iFill = fill(gVar, dfcVar, vphVar, DEBUG) + dfcVar.g;
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i = i2 * iFill;
        }
        this.mOrientationHelper.p(-i);
        this.mLayoutState.j = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i, g gVar, vph vphVar) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, gVar, vphVar);
    }

    @Override // androidx.recyclerview.widget.f
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        ffc ffcVar = this.mPendingSavedState;
        if (ffcVar != null) {
            ffcVar.a = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        ffc ffcVar = this.mPendingSavedState;
        if (ffcVar != null) {
            ffcVar.a = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i, g gVar, vph vphVar) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, gVar, vphVar);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            qp2.o(sko.i(i, "invalid orientation:"));
            return;
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            hsf hsfVarA = hsf.a(this, i);
            this.mOrientationHelper = hsfVarA;
            this.mAnchorInfo.a = hsfVarA;
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z) {
            return;
        }
        this.mStackFromEnd = z;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.f
    public boolean shouldMeasureTwice() {
        if (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) {
            return DEBUG;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.f
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, vph vphVar, int i) {
        ifc ifcVar = new ifc(recyclerView.getContext());
        ifcVar.setTargetPosition(i);
        startSmoothScroll(ifcVar);
    }

    @Override // androidx.recyclerview.widget.f
    public boolean supportsPredictiveItemAnimations() {
        if (this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd) {
            return true;
        }
        return DEBUG;
    }

    public final int t(int i, g gVar, vph vphVar, boolean z) {
        int iK;
        int iK2 = i - this.mOrientationHelper.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(iK2, gVar, vphVar);
        int i3 = i + i2;
        if (!z || (iK = i3 - this.mOrientationHelper.k()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.p(-iK);
        return i2 - iK;
    }

    public final View u() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    public final View v() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    public void validateChildOrder() {
        getChildCount();
        if (getChildCount() >= 1) {
            int position = getPosition(getChildAt(0));
            int iE = this.mOrientationHelper.e(getChildAt(0));
            if (this.mShouldReverseLayout) {
                for (int i = 1; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    int position2 = getPosition(childAt);
                    int iE2 = this.mOrientationHelper.e(childAt);
                    if (position2 < position) {
                        w();
                        StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                        sb.append(iE2 < iE);
                        throw new RuntimeException(sb.toString());
                    }
                    if (iE2 > iE) {
                        w();
                        h9o.r("detected invalid location");
                        return;
                    }
                }
                return;
            }
            for (int i2 = 1; i2 < getChildCount(); i2++) {
                View childAt2 = getChildAt(i2);
                int position3 = getPosition(childAt2);
                int iE3 = this.mOrientationHelper.e(childAt2);
                if (position3 < position) {
                    w();
                    StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                    sb2.append(iE3 < iE);
                    throw new RuntimeException(sb2.toString());
                }
                if (iE3 < iE) {
                    w();
                    h9o.r("detected invalid location");
                    return;
                }
            }
        }
    }

    public final void w() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            getPosition(childAt);
            this.mOrientationHelper.e(childAt);
        }
    }

    public final void x(g gVar, dfc dfcVar) {
        if (!dfcVar.a || dfcVar.l) {
            return;
        }
        int i = dfcVar.g;
        int i2 = dfcVar.i;
        if (dfcVar.f == -1) {
            int childCount = getChildCount();
            if (i >= 0) {
                int iF = (this.mOrientationHelper.f() - i) + i2;
                if (this.mShouldReverseLayout) {
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = getChildAt(i3);
                        if (this.mOrientationHelper.e(childAt) < iF || this.mOrientationHelper.o(childAt) < iF) {
                            y(gVar, 0, i3);
                            return;
                        }
                    }
                    return;
                }
                int i4 = childCount - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View childAt2 = getChildAt(i5);
                    if (this.mOrientationHelper.e(childAt2) < iF || this.mOrientationHelper.o(childAt2) < iF) {
                        y(gVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i >= 0) {
            int i6 = i - i2;
            int childCount2 = getChildCount();
            if (!this.mShouldReverseLayout) {
                for (int i7 = 0; i7 < childCount2; i7++) {
                    View childAt3 = getChildAt(i7);
                    if (this.mOrientationHelper.b(childAt3) > i6 || this.mOrientationHelper.n(childAt3) > i6) {
                        y(gVar, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = childCount2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View childAt4 = getChildAt(i9);
                if (this.mOrientationHelper.b(childAt4) > i6 || this.mOrientationHelper.n(childAt4) > i6) {
                    y(gVar, i8, i9);
                    return;
                }
            }
        }
    }

    public final void y(g gVar, int i, int i2) {
        if (i != i2) {
            if (i2 <= i) {
                while (i > i2) {
                    removeAndRecycleViewAt(i, gVar);
                    i--;
                }
            } else {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    removeAndRecycleViewAt(i3, gVar);
                }
            }
        }
    }

    public final void z() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }
}
