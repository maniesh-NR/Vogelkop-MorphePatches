package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.R;
import com.opera.android.widget.spotlightcarousel.SpotlightCarouselLayoutManager;
import defpackage.b5n;
import defpackage.c5n;
import defpackage.f7n;
import defpackage.hkj;
import defpackage.jph;
import defpackage.kph;
import defpackage.lph;
import defpackage.r5n;
import defpackage.uph;
import defpackage.vph;
import defpackage.zv4;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class f {
    boolean mAutoMeasure;
    zv4 mChildHelper;
    private int mHeight;
    private int mHeightMode;
    c5n mHorizontalBoundCheck;
    private final b5n mHorizontalBoundCheckCallback;
    boolean mIsAttachedToWindow;
    private boolean mItemPrefetchEnabled;
    private boolean mMeasurementCacheEnabled;
    int mPrefetchMaxCountObserved;
    boolean mPrefetchMaxObservedInInitialPrefetch;
    RecyclerView mRecyclerView;
    boolean mRequestedSimpleAnimations;

    @Nullable
    uph mSmoothScroller;
    c5n mVerticalBoundCheck;
    private final b5n mVerticalBoundCheckCallback;
    private int mWidth;
    private int mWidthMode;

    public f() {
        qie qieVar = new qie(this, (byte) 11);
        this.mHorizontalBoundCheckCallback = qieVar;
        i4d i4dVar = new i4d(this, (byte) 20);
        this.mVerticalBoundCheckCallback = i4dVar;
        this.mHorizontalBoundCheck = new c5n(qieVar);
        this.mVerticalBoundCheck = new c5n(i4dVar);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = true;
        this.mItemPrefetchEnabled = true;
    }

    public static int chooseSize(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L19
            if (r7 >= 0) goto L1b
            if (r7 != r1) goto L2d
            if (r5 == r2) goto L1f
            if (r5 == 0) goto L2d
            if (r5 == r3) goto L1f
            goto L2d
        L19:
            if (r7 < 0) goto L1d
        L1b:
            r5 = r3
            goto L2f
        L1d:
            if (r7 != r1) goto L21
        L1f:
            r7 = r4
            goto L2f
        L21:
            if (r7 != r0) goto L2d
            if (r5 == r2) goto L2a
            if (r5 == r3) goto L2a
            r7 = r4
            r5 = r6
            goto L2f
        L2a:
            r7 = r4
            r5 = r2
            goto L2f
        L2d:
            r5 = r6
            r7 = r5
        L2f:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f.getChildMeasureSpec(int, int, int, int, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000f A[PHI: r3
      0x000f: PHI (r3v3 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:6:0x000d, B:10:0x0014, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
        /*
            int r1 = r1 - r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto Ld
            if (r3 < 0) goto L1d
            goto Lf
        Ld:
            if (r3 < 0) goto L11
        Lf:
            r2 = r0
            goto L1e
        L11:
            r4 = -1
            if (r3 != r4) goto L16
            r3 = r1
            goto Lf
        L16:
            r4 = -2
            if (r3 != r4) goto L1d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1
            goto L1e
        L1d:
            r3 = r2
        L1e:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f.getChildMeasureSpec(int, int, int, boolean):int");
    }

    public static kph getProperties(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        kph kphVar = new kph();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecyclerView, i, i2);
        kphVar.a = typedArrayObtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 1);
        kphVar.b = typedArrayObtainStyledAttributes.getInt(R.styleable.RecyclerView_spanCount, 1);
        kphVar.c = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RecyclerView_reverseLayout, false);
        kphVar.d = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RecyclerView_stackFromEnd, false);
        typedArrayObtainStyledAttributes.recycle();
        return kphVar;
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

    @SuppressLint({"UnknownNullness"})
    public void addDisappearingView(View view) {
        addDisappearingView(view, -1);
    }

    @SuppressLint({"UnknownNullness"})
    public void addDisappearingView(View view, int i) {
        m(view, i, true);
    }

    @SuppressLint({"UnknownNullness"})
    public void addView(View view) {
        addView(view, -1);
    }

    @SuppressLint({"UnknownNullness"})
    public void addView(View view, int i) {
        m(view, i, false);
    }

    public void assertInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || recyclerView.b0()) {
            return;
        }
        if (str == null) {
            qp2.n("Cannot call this method unless RecyclerView is computing a layout or scrolling".concat(recyclerView.F()));
        } else {
            qp2.n(str.concat(recyclerView.F()));
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.p(str);
        }
    }

    public void attachView(@NonNull View view) {
        attachView(view, -1);
    }

    public void attachView(@NonNull View view, int i) {
        attachView(view, i, (lph) view.getLayoutParams());
    }

    public void attachView(@NonNull View view, int i, lph lphVar) {
        i iVarU = RecyclerView.U(view);
        boolean zIsRemoved = iVarU.isRemoved();
        RecyclerView recyclerView = this.mRecyclerView;
        if (zIsRemoved) {
            hkj hkjVar = (hkj) recyclerView.g.b;
            f7n f7nVarA = (f7n) hkjVar.get(iVarU);
            if (f7nVarA == null) {
                f7nVarA = f7n.a();
                hkjVar.put(iVarU, f7nVarA);
            }
            f7nVarA.a |= 1;
        } else {
            recyclerView.g.F(iVarU);
        }
        this.mChildHelper.b(view, i, lphVar, iVarU.isRemoved());
    }

    public void calculateItemDecorationsForChild(@NonNull View view, @NonNull Rect rect) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public boolean canScrollHorizontally() {
        return this instanceof SpotlightCarouselLayoutManager;
    }

    public boolean canScrollVertically() {
        return false;
    }

    public boolean checkLayoutParams(lph lphVar) {
        return lphVar != null;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, vph vphVar, jph jphVar) {
    }

    public void collectInitialPrefetchPositions(int i, jph jphVar) {
    }

    public int computeHorizontalScrollExtent(vph vphVar) {
        return 0;
    }

    public int computeHorizontalScrollOffset(vph vphVar) {
        return 0;
    }

    public int computeHorizontalScrollRange(vph vphVar) {
        return 0;
    }

    public int computeVerticalScrollExtent(vph vphVar) {
        return 0;
    }

    public int computeVerticalScrollOffset(vph vphVar) {
        return 0;
    }

    public int computeVerticalScrollRange(vph vphVar) {
        return 0;
    }

    public void detachAndScrapAttachedViews(@NonNull g gVar) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            o(gVar, childCount, getChildAt(childCount));
        }
    }

    public void detachAndScrapView(@NonNull View view, @NonNull g gVar) {
        o(gVar, this.mChildHelper.j(view), view);
    }

    public void detachAndScrapViewAt(int i, @NonNull g gVar) {
        o(gVar, i, getChildAt(i));
    }

    public void detachView(@NonNull View view) {
        int iJ = this.mChildHelper.j(view);
        if (iJ >= 0) {
            this.mChildHelper.c(iJ);
        }
    }

    public void detachViewAt(int i) {
        getChildAt(i);
        this.mChildHelper.c(i);
    }

    public void dispatchAttachedToWindow(RecyclerView recyclerView) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(recyclerView);
    }

    public void dispatchDetachedFromWindow(RecyclerView recyclerView, g gVar) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(recyclerView, gVar);
    }

    @SuppressLint({"UnknownNullness"})
    public void endAnimation(View view) {
        e eVar = this.mRecyclerView.M;
        if (eVar != null) {
            eVar.e(RecyclerView.U(view));
        }
    }

    @Nullable
    public View findContainingItemView(@NonNull View view) {
        View viewI;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (viewI = recyclerView.I(view)) == null || this.mChildHelper.c.contains(viewI)) {
            return null;
        }
        return viewI;
    }

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            i iVarU = RecyclerView.U(childAt);
            if (iVarU != null && iVarU.getLayoutPosition() == i && !iVarU.shouldIgnore() && (this.mRecyclerView.h0.g || !iVarU.isRemoved())) {
                return childAt;
            }
        }
        return null;
    }

    public lph generateDefaultLayoutParams() {
        a89 a89Var = new a89(-2, -2);
        a89Var.e = 0.0f;
        a89Var.f = 1.0f;
        a89Var.g = -1;
        a89Var.h = -1.0f;
        a89Var.k = 16777215;
        a89Var.l = 16777215;
        return a89Var;
    }

    @SuppressLint({"UnknownNullness"})
    public lph generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new lph(context, attributeSet);
    }

    @SuppressLint({"UnknownNullness"})
    public lph generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof lph ? new lph((lph) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new lph((ViewGroup.MarginLayoutParams) layoutParams) : new lph(layoutParams);
    }

    public int getBaseline() {
        return -1;
    }

    public int getBottomDecorationHeight(@NonNull View view) {
        return ((lph) view.getLayoutParams()).b.bottom;
    }

    @Nullable
    public View getChildAt(int i) {
        zv4 zv4Var = this.mChildHelper;
        if (zv4Var != null) {
            return zv4Var.d(i);
        }
        return null;
    }

    public int getChildCount() {
        zv4 zv4Var = this.mChildHelper;
        if (zv4Var != null) {
            return zv4Var.e();
        }
        return 0;
    }

    public boolean getClipToPadding() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.h;
    }

    public int getColumnCountForAccessibility(@NonNull g gVar, @NonNull vph vphVar) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || recyclerView.m == null || !canScrollHorizontally()) {
            return 1;
        }
        return this.mRecyclerView.m.getItemCount();
    }

    public int getDecoratedBottom(@NonNull View view) {
        return getBottomDecorationHeight(view) + view.getBottom();
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        RecyclerView.V(rect, view);
    }

    public int getDecoratedLeft(@NonNull View view) {
        return view.getLeft() - getLeftDecorationWidth(view);
    }

    public int getDecoratedMeasuredHeight(@NonNull View view) {
        Rect rect = ((lph) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public int getDecoratedMeasuredWidth(@NonNull View view) {
        Rect rect = ((lph) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int getDecoratedRight(@NonNull View view) {
        return getRightDecorationWidth(view) + view.getRight();
    }

    public int getDecoratedTop(@NonNull View view) {
        return view.getTop() - getTopDecorationHeight(view);
    }

    @Nullable
    public View getFocusedChild() {
        View focusedChild;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.c.contains(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getHeightMode() {
        return this.mHeightMode;
    }

    public int getItemCount() {
        RecyclerView recyclerView = this.mRecyclerView;
        d dVar = recyclerView != null ? recyclerView.m : null;
        if (dVar != null) {
            return dVar.getItemCount();
        }
        return 0;
    }

    public int getItemViewType(@NonNull View view) {
        return RecyclerView.U(view).getItemViewType();
    }

    public int getLayoutDirection() {
        return this.mRecyclerView.getLayoutDirection();
    }

    public int getLeftDecorationWidth(@NonNull View view) {
        return ((lph) view.getLayoutParams()).b.left;
    }

    public int getMinimumHeight() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = r5n.a;
        return recyclerView.getMinimumHeight();
    }

    public int getMinimumWidth() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = r5n.a;
        return recyclerView.getMinimumWidth();
    }

    public int getPaddingBottom() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int getPaddingEnd() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = r5n.a;
        return recyclerView.getPaddingEnd();
    }

    public int getPaddingLeft() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int getPaddingRight() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int getPaddingStart() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = r5n.a;
        return recyclerView.getPaddingStart();
    }

    public int getPaddingTop() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int getPosition(@NonNull View view) {
        return ((lph) view.getLayoutParams()).a.getLayoutPosition();
    }

    public int getRightDecorationWidth(@NonNull View view) {
        return ((lph) view.getLayoutParams()).b.right;
    }

    public int getRowCountForAccessibility(@NonNull g gVar, @NonNull vph vphVar) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || recyclerView.m == null || !canScrollVertically()) {
            return 1;
        }
        return this.mRecyclerView.m.getItemCount();
    }

    public int getSelectionModeForAccessibility(@NonNull g gVar, @NonNull vph vphVar) {
        return 0;
    }

    public int getTopDecorationHeight(@NonNull View view) {
        return ((lph) view.getLayoutParams()).b.top;
    }

    public void getTransformedBoundingBox(@NonNull View view, boolean z, @NonNull Rect rect) {
        Matrix matrix;
        if (z) {
            Rect rect2 = ((lph) view.getLayoutParams()).b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.mRecyclerView.l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getWidthMode() {
        return this.mWidthMode;
    }

    public boolean hasFlexibleChildInBothOrientations() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFocus() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public void ignoreView(@NonNull View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.mRecyclerView;
        if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
            qp2.o("View should be fully attached to be ignored".concat(this.mRecyclerView.F()));
            return;
        }
        i iVarU = RecyclerView.U(view);
        iVarU.addFlags(NotificationCompat.FLAG_HIGH_PRIORITY);
        this.mRecyclerView.g.G(iVarU);
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttachedToWindow;
    }

    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isFocused() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.isFocused();
    }

    public final boolean isItemPrefetchEnabled() {
        return this.mItemPrefetchEnabled;
    }

    public boolean isLayoutHierarchical(@NonNull g gVar, @NonNull vph vphVar) {
        return false;
    }

    public boolean isLayoutReversed() {
        return false;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public boolean isSmoothScrolling() {
        uph uphVar = this.mSmoothScroller;
        return uphVar != null && uphVar.isRunning();
    }

    public boolean isViewPartiallyVisible(@NonNull View view, boolean z, boolean z2) {
        boolean z3 = this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view);
        return z ? z3 : !z3;
    }

    public void layoutDecorated(@NonNull View view, int i, int i2, int i3, int i4) {
        Rect rect = ((lph) view.getLayoutParams()).b;
        view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
    }

    public void layoutDecoratedWithMargins(@NonNull View view, int i, int i2, int i3, int i4) {
        lph lphVar = (lph) view.getLayoutParams();
        Rect rect = lphVar.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) lphVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) lphVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) lphVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) lphVar).bottomMargin);
    }

    public final void m(View view, int i, boolean z) {
        i iVarU = RecyclerView.U(view);
        if (z || iVarU.isRemoved()) {
            hkj hkjVar = (hkj) this.mRecyclerView.g.b;
            f7n f7nVarA = (f7n) hkjVar.get(iVarU);
            if (f7nVarA == null) {
                f7nVarA = f7n.a();
                hkjVar.put(iVarU, f7nVarA);
            }
            f7nVarA.a |= 1;
        } else {
            this.mRecyclerView.g.F(iVarU);
        }
        lph lphVar = (lph) view.getLayoutParams();
        if (iVarU.wasReturnedFromScrap() || iVarU.isScrap()) {
            if (iVarU.isScrap()) {
                iVarU.unScrap();
            } else {
                iVarU.clearReturnedFromScrapFlag();
            }
            this.mChildHelper.b(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            zv4 zv4Var = this.mChildHelper;
            if (parent == recyclerView) {
                int iJ = zv4Var.j(view);
                if (i == -1) {
                    i = this.mChildHelper.e();
                }
                if (iJ == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.F());
                }
                if (iJ != i) {
                    this.mRecyclerView.n.moveView(iJ, i);
                }
            } else {
                zv4Var.a(view, i, false);
                lphVar.c = true;
                uph uphVar = this.mSmoothScroller;
                if (uphVar != null && uphVar.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
        }
        if (lphVar.d) {
            iVarU.itemView.invalidate();
            lphVar.d = false;
        }
    }

    public void measureChild(@NonNull View view, int i, int i2) {
        lph lphVar = (lph) view.getLayoutParams();
        Rect rectW = this.mRecyclerView.W(view);
        int i3 = rectW.left + rectW.right + i;
        int i4 = rectW.top + rectW.bottom + i2;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i3, ((ViewGroup.MarginLayoutParams) lphVar).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i4, ((ViewGroup.MarginLayoutParams) lphVar).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, lphVar)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void measureChildWithMargins(@NonNull View view, int i, int i2) {
        lph lphVar = (lph) view.getLayoutParams();
        Rect rectW = this.mRecyclerView.W(view);
        int i3 = rectW.left + rectW.right + i;
        int i4 = rectW.top + rectW.bottom + i2;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lphVar).leftMargin + ((ViewGroup.MarginLayoutParams) lphVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) lphVar).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) lphVar).topMargin + ((ViewGroup.MarginLayoutParams) lphVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) lphVar).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, lphVar)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void moveView(int i, int i2) {
        View childAt = getChildAt(i);
        if (childAt != null) {
            detachViewAt(i);
            attachView(childAt, i2);
        } else {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
        }
    }

    public final void o(g gVar, int i, View view) {
        i iVarU = RecyclerView.U(view);
        if (iVarU.shouldIgnore()) {
            return;
        }
        if (iVarU.isInvalid() && !iVarU.isRemoved() && !this.mRecyclerView.m.hasStableIds()) {
            removeViewAt(i);
            gVar.j(iVarU);
        } else {
            detachViewAt(i);
            gVar.k(view);
            this.mRecyclerView.g.F(iVarU);
        }
    }

    public void offsetChildrenHorizontal(int i) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            int iE = recyclerView.f.e();
            for (int i2 = 0; i2 < iE; i2++) {
                recyclerView.f.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void offsetChildrenVertical(int i) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            int iE = recyclerView.f.e();
            for (int i2 = 0; i2 < iE; i2++) {
                recyclerView.f.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void onAdapterChanged(@Nullable d dVar, @Nullable d dVar2) {
    }

    public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i, int i2) {
        return false;
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    @Deprecated
    public void onDetachedFromWindow(RecyclerView recyclerView) {
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, g gVar) {
        onDetachedFromWindow(recyclerView);
    }

    public View onFocusSearchFailed(View view, int i, g gVar, vph vphVar) {
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityEvent(recyclerView.c, recyclerView.h0, accessibilityEvent);
    }

    public void onInitializeAccessibilityEvent(@NonNull g gVar, @NonNull vph vphVar, @NonNull AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        d dVar = this.mRecyclerView.m;
        if (dVar != null) {
            accessibilityEvent.setItemCount(dVar.getItemCount());
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(recyclerView.c, recyclerView.h0, accessibilityNodeInfoCompat);
    }

    public void onInitializeAccessibilityNodeInfo(g gVar, vph vphVar, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
            accessibilityNodeInfoCompat.a(8192);
            accessibilityNodeInfoCompat.z(true);
            accessibilityNodeInfoCompat.q(67108864, true);
        }
        if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
            accessibilityNodeInfoCompat.a(4096);
            accessibilityNodeInfoCompat.z(true);
            accessibilityNodeInfoCompat.q(67108864, true);
        }
        accessibilityNodeInfoCompat.v(u59.M(getRowCountForAccessibility(gVar, vphVar), getColumnCountForAccessibility(gVar, vphVar), getSelectionModeForAccessibility(gVar, vphVar), isLayoutHierarchical(gVar, vphVar)));
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        i iVarU = RecyclerView.U(view);
        if (iVarU == null || iVarU.isRemoved()) {
            return;
        }
        zv4 zv4Var = this.mChildHelper;
        if (zv4Var.c.contains(iVarU.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(recyclerView.c, recyclerView.h0, view, accessibilityNodeInfoCompat);
    }

    public void onInitializeAccessibilityNodeInfoForItem(@NonNull g gVar, @NonNull vph vphVar, @NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.w(tw2.r(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false, false));
    }

    @Nullable
    public View onInterceptFocusSearch(@NonNull View view, int i) {
        return null;
    }

    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i2) {
    }

    public void onItemsChanged(@NonNull RecyclerView recyclerView) {
    }

    public void onItemsMoved(@NonNull RecyclerView recyclerView, int i, int i2, int i3) {
    }

    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i2) {
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2) {
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2, @Nullable Object obj) {
        onItemsUpdated(recyclerView, i, i2);
    }

    public abstract void onLayoutChildren(g gVar, vph vphVar);

    public void onLayoutCompleted(vph vphVar) {
    }

    public void onMeasure(@NonNull g gVar, @NonNull vph vphVar, int i, int i2) {
        this.mRecyclerView.v(i, i2);
    }

    @Deprecated
    public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, @Nullable View view2) {
        return isSmoothScrolling() || recyclerView.b0();
    }

    public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull vph vphVar, @NonNull View view, @Nullable View view2) {
        return onRequestChildFocus(recyclerView, view, view2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onSmoothScrollerStopped(uph uphVar) {
        if (this.mSmoothScroller == uphVar) {
            this.mSmoothScroller = null;
        }
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityAction(recyclerView.c, recyclerView.h0, i, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[PHI: r8
      0x008b: PHI (r8v8 int) = (r8v5 int), (r8v18 int) binds: [B:25:0x007e, B:18:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean performAccessibilityAction(@androidx.annotation.NonNull androidx.recyclerview.widget.g r8, @androidx.annotation.NonNull defpackage.vph r9, int r10, @androidx.annotation.Nullable android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f.performAccessibilityAction(androidx.recyclerview.widget.g, vph, int, android.os.Bundle):boolean");
    }

    public boolean performAccessibilityActionForItem(@NonNull View view, int i, @Nullable Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityActionForItem(recyclerView.c, recyclerView.h0, view, i, bundle);
    }

    public boolean performAccessibilityActionForItem(@NonNull g gVar, @NonNull vph vphVar, @NonNull View view, int i, @Nullable Bundle bundle) {
        return false;
    }

    public void postOnAnimation(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            WeakHashMap weakHashMap = r5n.a;
            recyclerView.postOnAnimation(runnable);
        }
    }

    public void removeAllViews() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            this.mChildHelper.k(childCount);
        }
    }

    public void removeAndRecycleAllViews(@NonNull g gVar) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (!RecyclerView.U(getChildAt(childCount)).shouldIgnore()) {
                removeAndRecycleViewAt(childCount, gVar);
            }
        }
    }

    public void removeAndRecycleScrapInt(g gVar) {
        ArrayList arrayList;
        int size = gVar.a.size();
        int i = size - 1;
        while (true) {
            arrayList = gVar.a;
            if (i < 0) {
                break;
            }
            View view = ((i) arrayList.get(i)).itemView;
            i iVarU = RecyclerView.U(view);
            if (!iVarU.shouldIgnore()) {
                iVarU.setIsRecyclable(false);
                if (iVarU.isTmpDetached()) {
                    this.mRecyclerView.removeDetachedView(view, false);
                }
                e eVar = this.mRecyclerView.M;
                if (eVar != null) {
                    eVar.e(iVarU);
                }
                iVarU.setIsRecyclable(true);
                i iVarU2 = RecyclerView.U(view);
                iVarU2.mScrapContainer = null;
                iVarU2.mInChangeScrap = false;
                iVarU2.clearReturnedFromScrapFlag();
                gVar.j(iVarU2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = gVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.mRecyclerView.invalidate();
        }
    }

    public void removeAndRecycleView(@NonNull View view, @NonNull g gVar) {
        removeView(view);
        gVar.i(view);
    }

    public void removeAndRecycleViewAt(int i, @NonNull g gVar) {
        View childAt = getChildAt(i);
        removeViewAt(i);
        gVar.i(childAt);
    }

    public boolean removeCallbacks(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.removeCallbacks(runnable);
        }
        return false;
    }

    public void removeDetachedView(@NonNull View view) {
        this.mRecyclerView.removeDetachedView(view, false);
    }

    @SuppressLint({"UnknownNullness"})
    public void removeView(View view) {
        zv4 zv4Var = this.mChildHelper;
        isd isdVar = zv4Var.a;
        byte b = zv4Var.d;
        if (b == 1) {
            qp2.n("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (b == 2) {
            qp2.n("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            zv4Var.d = (byte) 1;
            zv4Var.e = view;
            int iIndexOfChild = ((RecyclerView) isdVar.b).indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (zv4Var.b.q(iIndexOfChild)) {
                    zv4Var.l(view);
                }
                isdVar.I(iIndexOfChild);
            }
        } finally {
            zv4Var.d = (byte) 0;
            zv4Var.e = null;
        }
    }

    public void removeViewAt(int i) {
        if (getChildAt(i) != null) {
            this.mChildHelper.k(i);
        }
    }

    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z) {
        return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean requestChildRectangleOnScreen(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r9, @androidx.annotation.NonNull android.view.View r10, @androidx.annotation.NonNull android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.getPaddingLeft()
            int r1 = r8.getPaddingTop()
            int r2 = r8.getWidth()
            int r3 = r8.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r8.getHeight()
            int r4 = r8.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L5f
            if (r2 != 0) goto L66
            int r2 = java.lang.Math.max(r6, r10)
            goto L66
        L5f:
            if (r6 != 0) goto L65
            int r6 = java.lang.Math.min(r4, r2)
        L65:
            r2 = r6
        L66:
            if (r1 != 0) goto L6c
            int r1 = java.lang.Math.min(r5, r11)
        L6c:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb1
            android.view.View r13 = r9.getFocusedChild()
            if (r13 == 0) goto Lb5
            int r1 = r8.getPaddingLeft()
            int r2 = r8.getPaddingTop()
            int r3 = r8.getWidth()
            int r4 = r8.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r8.getHeight()
            int r5 = r8.getPaddingBottom()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.mRecyclerView
            android.graphics.Rect r5 = r5.j
            r8.getDecoratedBoundsWithMargins(r13, r5)
            int r8 = r5.left
            int r8 = r8 - r11
            if (r8 >= r3) goto Lb5
            int r8 = r5.right
            int r8 = r8 - r11
            if (r8 <= r1) goto Lb5
            int r8 = r5.top
            int r8 = r8 - r10
            if (r8 >= r4) goto Lb5
            int r8 = r5.bottom
            int r8 = r8 - r10
            if (r8 <= r2) goto Lb5
        Lb1:
            if (r11 != 0) goto Lb6
            if (r10 != 0) goto Lb6
        Lb5:
            return r0
        Lb6:
            if (r12 == 0) goto Lbc
            r9.scrollBy(r11, r10)
            return r7
        Lbc:
            r9.G0(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f.requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public void requestLayout() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void requestSimpleAnimationsInNextLayout() {
        this.mRequestedSimpleAnimations = true;
    }

    public int scrollHorizontallyBy(int i, g gVar, vph vphVar) {
        return 0;
    }

    public void scrollToPosition(int i) {
        int[] iArr = RecyclerView.C0;
    }

    public int scrollVerticallyBy(int i, g gVar, vph vphVar) {
        return 0;
    }

    @Deprecated
    public void setAutoMeasureEnabled(boolean z) {
        this.mAutoMeasure = z;
    }

    public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
        setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void setItemPrefetchEnabled(boolean z) {
        if (z != this.mItemPrefetchEnabled) {
            this.mItemPrefetchEnabled = z;
            this.mPrefetchMaxCountObserved = 0;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.c.n();
            }
        }
    }

    public void setMeasureSpecs(int i, int i2) {
        this.mWidth = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.mWidthMode = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.C0;
        }
        this.mHeight = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.mHeightMode = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.C0;
        }
    }

    public void setMeasuredDimension(int i, int i2) {
        this.mRecyclerView.setMeasuredDimension(i, i2);
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        setMeasuredDimension(chooseSize(i, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i2, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
    }

    public void setMeasuredDimensionFromChildren(int i, int i2) {
        int childCount = getChildCount();
        if (childCount == 0) {
            this.mRecyclerView.v(i, i2);
            return;
        }
        int i3 = LinearLayoutManager.INVALID_OFFSET;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            Rect rect = this.mRecyclerView.j;
            getDecoratedBoundsWithMargins(childAt, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.mRecyclerView.j.set(i6, i4, i3, i5);
        setMeasuredDimension(this.mRecyclerView.j, i, i2);
    }

    public void setMeasurementCacheEnabled(boolean z) {
        this.mMeasurementCacheEnabled = z;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.mRecyclerView = null;
            this.mChildHelper = null;
            this.mWidth = 0;
            this.mHeight = 0;
        } else {
            this.mRecyclerView = recyclerView;
            this.mChildHelper = recyclerView.f;
            this.mWidth = recyclerView.getWidth();
            this.mHeight = recyclerView.getHeight();
        }
        this.mWidthMode = 1073741824;
        this.mHeightMode = 1073741824;
    }

    public boolean shouldMeasureChild(View view, int i, int i2, lph lphVar) {
        return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && n(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) lphVar).width) && n(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) lphVar).height)) ? false : true;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public boolean shouldReMeasureChild(View view, int i, int i2, lph lphVar) {
        return (this.mMeasurementCacheEnabled && n(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) lphVar).width) && n(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) lphVar).height)) ? false : true;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, vph vphVar, int i) {
    }

    @SuppressLint({"UnknownNullness"})
    public void startSmoothScroll(uph uphVar) {
        uph uphVar2 = this.mSmoothScroller;
        if (uphVar2 != null && uphVar != uphVar2 && uphVar2.isRunning()) {
            this.mSmoothScroller.stop();
        }
        this.mSmoothScroller = uphVar;
        uphVar.start(this.mRecyclerView, this);
    }

    public void stopIgnoringView(@NonNull View view) {
        i iVarU = RecyclerView.U(view);
        iVarU.stopIgnoring();
        iVarU.resetInternal();
        iVarU.addFlags(4);
    }

    public void stopSmoothScroller() {
        uph uphVar = this.mSmoothScroller;
        if (uphVar != null) {
            uphVar.stop();
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
