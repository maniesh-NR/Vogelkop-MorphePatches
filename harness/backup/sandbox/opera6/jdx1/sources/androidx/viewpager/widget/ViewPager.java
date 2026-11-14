package androidx.viewpager.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.tabs.TabLayout;
import defpackage.a8n;
import defpackage.b8n;
import defpackage.c8n;
import defpackage.d8n;
import defpackage.e8n;
import defpackage.f8n;
import defpackage.g3;
import defpackage.g8n;
import defpackage.h5n;
import defpackage.i8n;
import defpackage.p3p;
import defpackage.r5n;
import defpackage.sgb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.viewpager.widget.ViewPager";
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private int mActivePointerId;
    PagerAdapter mAdapter;
    private List<d8n> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private boolean mDragInGutterEnabled;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private e8n mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<b8n> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;

    @NonNull
    public EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private g8n mObserver;
    private int mOffscreenPageLimit;
    private e8n mOnPageChangeListener;
    private List<e8n> mOnPageChangeListeners;
    private int mPageMargin;
    private f8n mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;

    @NonNull
    public EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final b8n mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    private static final Comparator<b8n> COMPARATOR = new w8l((byte) 9);
    private static final Interpolator sInterpolator = new alb((byte) 7);
    private static final i8n sPositionComparator = new i8n();

    public static class SavedState extends g3 {
        public static final Parcelable.Creator<SavedState> CREATOR = new b();
        public Parcelable c;
        public final ClassLoader d;
        int position;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.position = parcel.readInt();
            this.c = parcel.readParcelable(classLoader);
            this.d = classLoader;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return p3p.k(this.position, "}", sb);
        }

        @Override // defpackage.g3, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.c, i);
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new b8n();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mDragInGutterEnabled = true;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mEndScrollRunnable = new ssi(this, (byte) 21);
        this.mScrollState = 0;
        initViewPager(context, null);
    }

    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new b8n();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mDragInGutterEnabled = true;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mEndScrollRunnable = new ssi(this, (byte) 21);
        this.mScrollState = 0;
        initViewPager(context, attributeSet);
    }

    public final void a(boolean z) {
        boolean z2 = this.mScrollState == 2;
        if (z2) {
            o(DEBUG);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        j(currX);
                    }
                }
            }
        }
        this.mPopulatePending = DEBUG;
        for (int i = 0; i < this.mItems.size(); i++) {
            b8n b8nVar = this.mItems.get(i);
            if (b8nVar.c) {
                b8nVar.c = DEBUG;
                z2 = true;
            }
        }
        if (z2) {
            Runnable runnable = this.mEndScrollRunnable;
            if (!z) {
                runnable.run();
            } else {
                WeakHashMap weakHashMap = r5n.a;
                postOnAnimation(runnable);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        b8n b8nVarInfoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (b8nVarInfoForChild = infoForChild(childAt)) != null && b8nVarInfoForChild.b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    public b8n addNewItem(int i, int i2) {
        b8n b8nVar = new b8n();
        b8nVar.b = i;
        b8nVar.a = this.mAdapter.instantiateItem((ViewGroup) this, i);
        b8nVar.d = this.mAdapter.getPageWidth(i);
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(b8nVar);
            return b8nVar;
        }
        this.mItems.add(i2, b8nVar);
        return b8nVar;
    }

    public void addOnAdapterChangeListener(@NonNull d8n d8nVar) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(d8nVar);
    }

    public void addOnPageChangeListener(@NonNull e8n e8nVar) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(e8nVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        b8n b8nVarInfoForChild;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (b8nVarInfoForChild = infoForChild(childAt)) != null && b8nVarInfoForChild.b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        c8n c8nVar = (c8n) layoutParams;
        boolean z = c8nVar.a | (view.getClass().getAnnotation(a8n.class) != null ? true : DEBUG);
        c8nVar.a = z;
        if (!this.mInLayout) {
            super.addView(view, i, layoutParams);
        } else if (z) {
            qp2.n("Cannot add pager decor view during layout");
        } else {
            c8nVar.d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean arrowScroll(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 == r4) goto L42
            if (r0 == 0) goto L43
            android.view.ViewParent r2 = r0.getParent()
        Ld:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L18
            if (r2 == r4) goto L43
            android.view.ViewParent r2 = r2.getParent()
            goto Ld
        L18:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.<init>(r3)
            android.view.ViewParent r0 = r0.getParent()
        L29:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L42
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L29
        L42:
            r0 = r1
        L43:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto L93
            if (r1 == r0) goto L93
            if (r5 != r3) goto L73
            android.graphics.Rect r2 = r4.mTempRect
            android.graphics.Rect r2 = r4.e(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.mTempRect
            android.graphics.Rect r3 = r4.e(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L6e
            if (r2 < r3) goto L6e
            boolean r0 = r4.pageLeft()
            goto La8
        L6e:
            boolean r0 = r1.requestFocus()
            goto La8
        L73:
            if (r5 != r2) goto L9d
            android.graphics.Rect r2 = r4.mTempRect
            android.graphics.Rect r2 = r4.e(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.mTempRect
            android.graphics.Rect r3 = r4.e(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L8e
            if (r2 > r3) goto L8e
            boolean r0 = r4.pageRight()
            goto La8
        L8e:
            boolean r0 = r1.requestFocus()
            goto La8
        L93:
            if (r5 == r3) goto La4
            r0 = 1
            if (r5 == r0) goto La4
            if (r5 == r2) goto L9f
            r0 = 2
            if (r5 == r0) goto L9f
        L9d:
            r0 = 0
            goto La8
        L9f:
            boolean r0 = r4.pageRight()
            goto La8
        La4:
            boolean r0 = r4.pageLeft()
        La8:
            if (r0 == 0) goto Lb1
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Lb1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.arrowScroll(int):boolean");
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return DEBUG;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.mFakeDragBeginTime = jUptimeMillis;
        return true;
    }

    public final int c(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity || sgb.E(this.mLeftEdge) != 0.0f || sgb.E(this.mRightEdge) != 0.0f) {
            i += (int) (f + (i >= this.mCurItem ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.mItems.size() > 0) {
            return Math.max(this.mItems.get(0).b, Math.min(i, ((b8n) am2.k(1, this.mItems)).b));
        }
        return i;
    }

    public boolean canScroll(@NonNull View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return DEBUG;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.mAdapter == null) {
            return DEBUG;
        }
        int iF = f();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (iF * this.mFirstOffset))) {
                return true;
            }
            return DEBUG;
        }
        if (i <= 0 || scrollX >= ((int) (iF * this.mLastOffset))) {
            return DEBUG;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof c8n) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return DEBUG;
    }

    public void clearOnPageChangeListeners() {
        List<e8n> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!j(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    public final void d(int i) {
        e8n e8nVar = this.mOnPageChangeListener;
        if (e8nVar != null) {
            e8nVar.onPageSelected(i);
        }
        List<e8n> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                e8n e8nVar2 = this.mOnPageChangeListeners.get(i2);
                if (e8nVar2 != null) {
                    e8nVar2.onPageSelected(i);
                }
            }
        }
        e8n e8nVar3 = this.mInternalPageChangeListener;
        if (e8nVar3 != null) {
            e8nVar3.onPageSelected(i);
        }
    }

    public void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z = this.mItems.size() < (this.mOffscreenPageLimit << 1) + 1 && this.mItems.size() < count;
        int iMax = this.mCurItem;
        int i = 0;
        boolean z2 = false;
        while (i < this.mItems.size()) {
            b8n b8nVar = this.mItems.get(i);
            int itemPosition = this.mAdapter.getItemPosition(b8nVar.a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i);
                    i--;
                    if (!z2) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, b8nVar.b, b8nVar.a);
                    int i2 = this.mCurItem;
                    if (i2 == b8nVar.b) {
                        iMax = Math.max(0, Math.min(i2, count - 1));
                    }
                } else {
                    int i3 = b8nVar.b;
                    if (i3 != itemPosition) {
                        if (i3 == this.mCurItem) {
                            iMax = itemPosition;
                        }
                        b8nVar.b = itemPosition;
                    }
                }
                z = true;
            }
            i++;
        }
        if (z2) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                c8n c8nVar = (c8n) getChildAt(i4).getLayoutParams();
                if (!c8nVar.a) {
                    c8nVar.c = 0.0f;
                }
            }
            setCurrentItemInternal(iMax, DEBUG, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent)) {
            return true;
        }
        return DEBUG;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        b8n b8nVarInfoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (b8nVarInfoForChild = infoForChild(childAt)) != null && b8nVarInfoForChild.b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return DEBUG;
    }

    public float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = DEBUG;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.mAdapter) != null && pagerAdapter.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                zDraw = this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.mRightEdge.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                zDraw |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final Rect e(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public void endFakeDrag() throws Resources.NotFoundException {
        if (!this.mFakeDragging) {
            qp2.n("No fake drag in progress. Call beginFakeDrag first.");
            return;
        }
        if (this.mAdapter != null) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int iF = f();
            int scrollX = getScrollX();
            b8n b8nVarG = g();
            setCurrentItemInternal(c(b8nVarG.b, ((scrollX / iF) - b8nVarG.e) / b8nVarG.d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
        }
        this.mIsBeingDragged = DEBUG;
        this.mIsUnableToDrag = DEBUG;
        VelocityTracker velocityTracker2 = this.mVelocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.mVelocityTracker = null;
        }
        this.mFakeDragging = DEBUG;
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return DEBUG;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyCode != 21 ? keyCode != 22 ? keyCode == 61 ? keyEvent.hasNoModifiers() ? arrowScroll(2) : keyEvent.hasModifiers(1) ? arrowScroll(1) : DEBUG : DEBUG : keyEvent.hasModifiers(2) ? pageRight() : arrowScroll(66) : keyEvent.hasModifiers(2) ? pageLeft() : arrowScroll(17);
    }

    public final int f() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void fakeDragBy(float f) {
        if (!this.mFakeDragging) {
            qp2.n("No fake drag in progress. Call beginFakeDrag first.");
            return;
        }
        if (this.mAdapter == null) {
            return;
        }
        this.mLastMotionX += f;
        float scrollX = getScrollX() - f;
        float f2 = f();
        float f3 = this.mFirstOffset * f2;
        float f4 = this.mLastOffset * f2;
        b8n b8nVar = this.mItems.get(0);
        b8n b8nVar2 = (b8n) am2.k(1, this.mItems);
        if (b8nVar.b != 0) {
            f3 = b8nVar.e * f2;
        }
        if (b8nVar2.b != this.mAdapter.getCount() - 1) {
            f4 = b8nVar2.e * f2;
        }
        if (scrollX < f3) {
            scrollX = f3;
        } else if (scrollX > f4) {
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.mLastMotionX = (scrollX - i) + this.mLastMotionX;
        scrollTo(i, getScrollY());
        j(i);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final b8n g() {
        float scrollX;
        float f;
        int i;
        int iF = f();
        float f2 = 0.0f;
        if (iF > 0) {
            scrollX = getScrollX() / iF;
            f = this.mPageMargin / iF;
        } else {
            scrollX = 0.0f;
            f = 0.0f;
        }
        int i2 = 0;
        boolean z = true;
        b8n b8nVar = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.mItems.size()) {
            b8n b8nVar2 = this.mItems.get(i2);
            if (!z && b8nVar2.b != (i = i3 + 1)) {
                b8nVar2 = this.mTempItem;
                b8nVar2.e = f2 + f3 + f;
                b8nVar2.b = i;
                b8nVar2.d = this.mAdapter.getPageWidth(i);
                i2--;
            }
            b8n b8nVar3 = b8nVar2;
            f2 = b8nVar3.e;
            float f4 = b8nVar3.d + f2 + f;
            if (!z && scrollX < f2) {
                break;
            }
            if (scrollX < f4 || i2 == this.mItems.size() - 1) {
                return b8nVar3;
            }
            int i4 = b8nVar3.b;
            float f5 = b8nVar3.d;
            i2++;
            i3 = i4;
            f3 = f5;
            b8nVar = b8nVar3;
            z = false;
        }
        return b8nVar;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c8n c8nVar = new c8n(-1, -1);
        c8nVar.c = 0.0f;
        return c8nVar;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        c8n c8nVar = new c8n(context, attributeSet);
        c8nVar.c = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        c8nVar.b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return c8nVar;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Nullable
    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((c8n) this.mDrawingOrderedChildren.get(i2).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public final void h(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public b8n infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (!(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public b8n infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            b8n b8nVar = this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, b8nVar.a)) {
                return b8nVar;
            }
        }
        return null;
    }

    public b8n infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            b8n b8nVar = this.mItems.get(i2);
            if (b8nVar.b == i) {
                return b8nVar;
            }
        }
        return null;
    }

    public void initViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        setWillNotDraw(DEBUG);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        r5n.l(this, new a(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        h5n.c(this, new mcj(this));
    }

    public boolean isDragInGutterEnabled() {
        return this.mDragInGutterEnabled;
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    public final boolean j(int i) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return DEBUG;
            }
            this.mCalledSuper = DEBUG;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return DEBUG;
            }
            qp2.n("onPageScrolled did not call superclass implementation");
            return DEBUG;
        }
        b8n b8nVarG = g();
        int iF = f();
        int i2 = this.mPageMargin;
        int i3 = iF + i2;
        float f = iF;
        int i4 = b8nVarG.b;
        float f2 = ((i / f) - b8nVarG.e) / (b8nVarG.d + (i2 / f));
        this.mCalledSuper = DEBUG;
        onPageScrolled(i4, f2, (int) (i3 * f2));
        if (this.mCalledSuper) {
            return true;
        }
        qp2.n("onPageScrolled did not call superclass implementation");
        return DEBUG;
    }

    public final boolean k(float f, float f2) {
        boolean z;
        float f3 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        float height = f2 / getHeight();
        float width = f3 / getWidth();
        float fT = (sgb.E(this.mLeftEdge) != 0.0f ? -sgb.T(this.mLeftEdge, -width, 1.0f - height) : sgb.E(this.mRightEdge) != 0.0f ? sgb.T(this.mRightEdge, width, height) : 0.0f) * getWidth();
        float f4 = f3 - fT;
        boolean z2 = true;
        boolean z3 = DEBUG;
        boolean z4 = fT != 0.0f;
        if (Math.abs(f4) < 1.0E-4f) {
            return z4;
        }
        float scrollX = getScrollX() + f4;
        float f5 = f();
        float f6 = this.mFirstOffset * f5;
        float f7 = this.mLastOffset * f5;
        b8n b8nVar = this.mItems.get(0);
        b8n b8nVar2 = (b8n) am2.k(1, this.mItems);
        if (b8nVar.b != 0) {
            f6 = b8nVar.e * f5;
            z = false;
        } else {
            z = true;
        }
        if (b8nVar2.b != this.mAdapter.getCount() - 1) {
            f7 = b8nVar2.e * f5;
        } else {
            z3 = true;
        }
        if (scrollX < f6) {
            if (z) {
                sgb.T(this.mLeftEdge, (f6 - scrollX) / f5, 1.0f - (f2 / getHeight()));
            } else {
                z2 = z4;
            }
            z4 = z2;
            scrollX = f6;
        } else if (scrollX > f7) {
            if (z3) {
                sgb.T(this.mRightEdge, (scrollX - f7) / f5, f2 / getHeight());
            } else {
                z2 = z4;
            }
            z4 = z2;
            scrollX = f7;
        }
        int i = (int) scrollX;
        this.mLastMotionX = (scrollX - i) + this.mLastMotionX;
        scrollTo(i, getScrollY());
        j(i);
        return z4;
    }

    public final void l(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(f() * getCurrentItem());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        b8n b8nVarInfoForPosition = infoForPosition(this.mCurItem);
        int iMin = (int) ((b8nVarInfoForPosition != null ? Math.min(b8nVarInfoForPosition.e, this.mLastOffset) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            a(DEBUG);
            scrollTo(iMin, getScrollY());
        }
    }

    public final boolean m() {
        this.mActivePointerId = -1;
        this.mIsBeingDragged = DEBUG;
        this.mIsUnableToDrag = DEBUG;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        if (this.mLeftEdge.isFinished() && this.mRightEdge.isFinished()) {
            return DEBUG;
        }
        return true;
    }

    public final void n(int i, int i2, boolean z, boolean z2) throws Resources.NotFoundException {
        int iMax;
        b8n b8nVarInfoForPosition = infoForPosition(i);
        if (b8nVarInfoForPosition != null) {
            iMax = (int) (Math.max(this.mFirstOffset, Math.min(b8nVarInfoForPosition.e, this.mLastOffset)) * f());
        } else {
            iMax = 0;
        }
        if (z) {
            smoothScrollTo(iMax, 0, i2);
            if (z2) {
                d(i);
                return;
            }
            return;
        }
        if (z2) {
            d(i);
        }
        a(DEBUG);
        scrollTo(iMax, 0);
        j(iMax);
    }

    public final void o(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int i;
        float f;
        int i2;
        super.onDraw(canvas);
        if (this.mPageMargin <= 0 || this.mMarginDrawable == null || this.mItems.size() <= 0 || this.mAdapter == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f2 = this.mPageMargin / width;
        int i3 = 0;
        b8n b8nVar = this.mItems.get(0);
        float f3 = b8nVar.e;
        int size = this.mItems.size();
        int i4 = b8nVar.b;
        int i5 = this.mItems.get(size - 1).b;
        while (i4 < i5) {
            while (true) {
                i = b8nVar.b;
                if (i4 <= i || i3 >= size) {
                    break;
                }
                i3++;
                b8nVar = this.mItems.get(i3);
            }
            if (i4 == i) {
                float f4 = b8nVar.e;
                float f5 = b8nVar.d;
                f = (f4 + f5) * width;
                f3 = f4 + f5 + f2;
            } else {
                float pageWidth = this.mAdapter.getPageWidth(i4);
                f = (f3 + pageWidth) * width;
                f3 = pageWidth + f2 + f3;
            }
            if (this.mPageMargin + f > scrollX) {
                i2 = scrollX;
                this.mMarginDrawable.setBounds(Math.round(f), this.mTopPageBounds, Math.round(this.mPageMargin + f), this.mBottomPageBounds);
                this.mMarginDrawable.draw(canvas);
            } else {
                i2 = scrollX;
            }
            if (f > i2 + r2) {
                return;
            }
            i4++;
            scrollX = i2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m();
            return DEBUG;
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = DEBUG;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                this.mScroller.abortAnimation();
                this.mPopulatePending = DEBUG;
                populate();
                this.mIsBeingDragged = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            } else if (sgb.E(this.mLeftEdge) == 0.0f && sgb.E(this.mRightEdge) == 0.0f) {
                a(DEBUG);
                this.mIsBeingDragged = DEBUG;
            } else {
                this.mIsBeingDragged = true;
                setScrollState(1);
                if (sgb.E(this.mLeftEdge) != 0.0f) {
                    sgb.T(this.mLeftEdge, 0.0f, 1.0f - (this.mLastMotionY / getHeight()));
                }
                if (sgb.E(this.mRightEdge) != 0.0f) {
                    sgb.T(this.mRightEdge, 0.0f, this.mLastMotionY / getHeight());
                }
            }
        } else {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return DEBUG;
            }
            if (action == 2) {
                int i = this.mActivePointerId;
                if (i != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float f = x2 - this.mLastMotionX;
                    float fAbs = Math.abs(f);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.mInitialMotionY);
                    if (f != 0.0f) {
                        float f2 = this.mLastMotionX;
                        if ((this.mDragInGutterEnabled || ((f2 >= this.mGutterSize || f <= 0.0f) && (f2 <= getWidth() - this.mGutterSize || f >= 0.0f))) && canScroll(this, DEBUG, (int) f, (int) x2, (int) y2)) {
                            this.mLastMotionX = x2;
                            this.mLastMotionY = y2;
                            this.mIsUnableToDrag = true;
                            return DEBUG;
                        }
                    }
                    float f3 = this.mTouchSlop;
                    if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                        this.mIsBeingDragged = true;
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        setScrollState(1);
                        float f4 = this.mInitialMotionX;
                        float f5 = this.mTouchSlop;
                        this.mLastMotionX = f > 0.0f ? f4 + f5 : f4 - f5;
                        this.mLastMotionY = y2;
                        o(true);
                    } else if (fAbs2 > f3) {
                        this.mIsUnableToDrag = true;
                    }
                    if (this.mIsBeingDragged && k(x2, y2)) {
                        postInvalidateOnAnimation();
                    }
                }
            } else if (action == 6) {
                h(motionEvent);
            }
        }
        VelocityTracker velocityTrackerObtain = this.mVelocityTracker;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.mVelocityTracker = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) throws Resources.NotFoundException {
        c8n c8nVar;
        c8n c8nVar2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (c8nVar2 = (c8n) childAt.getLayoutParams()) != null && c8nVar2.a) {
                int i6 = c8nVar2.b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = LinearLayoutManager.INVALID_OFFSET;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) c8nVar2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) c8nVar2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = DEBUG;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c8nVar = (c8n) childAt2.getLayoutParams()) == null || !c8nVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c8nVar.c), 1073741824), iMakeMeasureSpec);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPageScrolled(int r19, float r20, int r21) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onPageScrolled(int, float, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        b8n b8nVarInfoForChild;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (b8nVarInfoForChild = infoForChild(childAt)) != null && b8nVarInfoForChild.b == this.mCurItem && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return DEBUG;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        ClassLoader classLoader = savedState.d;
        super.onRestoreInstanceState(savedState.a);
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.c, classLoader);
            setCurrentItemInternal(savedState.position, DEBUG, true);
        } else {
            this.mRestoredCurItem = savedState.position;
            this.mRestoredAdapterState = savedState.c;
            this.mRestoredClassLoader = classLoader;
        }
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.position = this.mCurItem;
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            savedState.c = pagerAdapter.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.mPageMargin;
            l(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    public boolean pageLeft() throws Resources.NotFoundException {
        int i = this.mCurItem;
        if (i <= 0) {
            return DEBUG;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    public boolean pageRight() throws Resources.NotFoundException {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || this.mCurItem >= pagerAdapter.getCount() - 1) {
            return DEBUG;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    public void populate() throws Resources.NotFoundException {
        populate(this.mCurItem);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5 A[PHI: r7 r10 r14
      0x00f5: PHI (r7v14 int) = (r7v13 int), (r7v4 int), (r7v17 int) binds: [B:60:0x00ea, B:57:0x00d4, B:51:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r10v39 int) = (r10v1 int), (r10v38 int), (r10v42 int) binds: [B:60:0x00ea, B:57:0x00d4, B:51:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r14v6 float) = (r14v4 float), (r14v5 float), (r14v3 float) binds: [B:60:0x00ea, B:57:0x00d4, B:51:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018a A[PHI: r3 r12
      0x018a: PHI (r3v42 float) = (r3v40 float), (r3v41 float), (r3v39 float) binds: [B:94:0x017f, B:91:0x0165, B:85:0x0149] A[DONT_GENERATE, DONT_INLINE]
      0x018a: PHI (r12v8 int) = (r12v6 int), (r12v7 int), (r12v5 int) binds: [B:94:0x017f, B:91:0x0165, B:85:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void populate(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.populate(int):void");
    }

    public void removeOnAdapterChangeListener(@NonNull d8n d8nVar) {
        List<d8n> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(d8nVar);
        }
    }

    public void removeOnPageChangeListener(@NonNull e8n e8nVar) {
        List<e8n> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(e8nVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(@Nullable PagerAdapter pagerAdapter) throws Resources.NotFoundException {
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            pagerAdapter2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                b8n b8nVar = this.mItems.get(i);
                this.mAdapter.destroyItem((ViewGroup) this, b8nVar.b, b8nVar.a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((c8n) getChildAt(i2).getLayoutParams()).a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (pagerAdapter != null) {
            g8n g8nVar = this.mObserver;
            if (g8nVar == null) {
                g8nVar = new g8n(this);
                this.mObserver = g8nVar;
            }
            this.mAdapter.setViewPagerObserver(g8nVar);
            this.mPopulatePending = DEBUG;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, DEBUG, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (z) {
                requestLayout();
            } else {
                populate();
            }
        }
        List<d8n> list = this.mAdapterChangeListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.mAdapterChangeListeners.size();
        for (int i3 = 0; i3 < size; i3++) {
            i5l i5lVar = (d8n) this.mAdapterChangeListeners.get(i3);
            TabLayout tabLayout = i5lVar.b;
            if (tabLayout.K == this) {
                tabLayout.h(pagerAdapter, i5lVar.a);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = DEBUG;
        setCurrentItemInternal(i, !this.mFirstLayout, DEBUG);
    }

    public void setCurrentItem(int i, boolean z) throws Resources.NotFoundException {
        this.mPopulatePending = DEBUG;
        setCurrentItemInternal(i, z, DEBUG);
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2) throws Resources.NotFoundException {
        setCurrentItemInternal(i, z, z2, 0);
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) throws Resources.NotFoundException {
        PagerAdapter pagerAdapter = this.mAdapter;
        boolean z3 = DEBUG;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            o(DEBUG);
            return;
        }
        if (!z2 && this.mCurItem == i && this.mItems.size() != 0) {
            o(DEBUG);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.mAdapter.getCount()) {
            i = this.mAdapter.getCount() - 1;
        }
        int i3 = this.mOffscreenPageLimit;
        int i4 = this.mCurItem;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.mItems.size(); i5++) {
                this.mItems.get(i5).c = true;
            }
        }
        if (this.mCurItem != i) {
            z3 = true;
        }
        if (!this.mFirstLayout) {
            populate(i);
            n(i, i2, z, z3);
        } else {
            this.mCurItem = i;
            if (z3) {
                d(i);
            }
            requestLayout();
        }
    }

    public void setDragInGutterEnabled(boolean z) {
        this.mDragInGutterEnabled = z;
    }

    public e8n setInternalPageChangeListener(e8n e8nVar) {
        e8n e8nVar2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = e8nVar;
        return e8nVar2;
    }

    public void setOffscreenPageLimit(int i) throws Resources.NotFoundException {
        if (i < 1) {
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(e8n e8nVar) {
        this.mOnPageChangeListener = e8nVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        l(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getDrawable(i));
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        boolean z;
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = DEBUG;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setPageTransformer(boolean z, @Nullable f8n f8nVar) throws Resources.NotFoundException {
        setPageTransformer(z, f8nVar, 2);
    }

    @SuppressLint({"LambdaLast"})
    public void setPageTransformer(boolean z, @Nullable f8n f8nVar, int i) throws Resources.NotFoundException {
        boolean z2 = f8nVar != null;
        boolean z3 = z2 != (this.mPageTransformer != null);
        this.mPageTransformer = f8nVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.mDrawingOrder = z ? 2 : 1;
            this.mPageTransformerLayerType = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z3) {
            populate();
        }
    }

    public void setScrollState(int i) {
        if (this.mScrollState != i) {
            this.mScrollState = i;
            if (this.mPageTransformer != null) {
                boolean z = i != 0;
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    getChildAt(i2).setLayerType(z ? this.mPageTransformerLayerType : 0, null);
                }
            }
            e8n e8nVar = this.mOnPageChangeListener;
            if (e8nVar != null) {
                e8nVar.onPageScrollStateChanged(i);
            }
            List<e8n> list = this.mOnPageChangeListeners;
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    e8n e8nVar2 = this.mOnPageChangeListeners.get(i3);
                    if (e8nVar2 != null) {
                        e8nVar2.onPageScrollStateChanged(i);
                    }
                }
            }
            e8n e8nVar3 = this.mInternalPageChangeListener;
            if (e8nVar3 != null) {
                e8nVar3.onPageScrollStateChanged(i);
            }
        }
    }

    public void smoothScrollTo(int i, int i2, int i3) throws Resources.NotFoundException {
        int scrollX;
        if (getChildCount() == 0) {
            o(DEBUG);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            boolean z = this.mIsScrollStarted;
            Scroller scroller2 = this.mScroller;
            scrollX = z ? scroller2.getCurrX() : scroller2.getStartX();
            this.mScroller.abortAnimation();
            o(DEBUG);
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            a(DEBUG);
            populate();
            setScrollState(0);
            return;
        }
        o(true);
        setScrollState(2);
        int iF = f();
        int i7 = iF / 2;
        float f = iF;
        float f2 = i7;
        float fDistanceInfluenceForSnapDuration = (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2) + f2;
        int iAbs = Math.abs(i3);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fDistanceInfluenceForSnapDuration / iAbs) * 1000.0f) << 2 : (int) (((Math.abs(i5) / ((this.mAdapter.getPageWidth(this.mCurItem) * f) + this.mPageMargin)) + 1.0f) * 100.0f), MAX_SETTLE_DURATION);
        this.mIsScrollStarted = DEBUG;
        this.mScroller.startScroll(i4, scrollY, i5, i6, iMin);
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.mMarginDrawable) {
            return true;
        }
        return DEBUG;
    }
}
