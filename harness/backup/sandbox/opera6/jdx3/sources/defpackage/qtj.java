package defpackage;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public abstract class qtj extends zwg {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final oph mScrollListener = new vm3(this);

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.t0(this.mScrollListener);
                this.mRecyclerView.V = null;
            }
            this.mRecyclerView = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.V != null) {
                    qp2.n("An instance of OnFlingListener already set.");
                    return;
                }
                recyclerView.o(this.mScrollListener);
                this.mRecyclerView.V = this;
                this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
                snapToTargetExistingView();
            }
        }
    }

    public int[] calculateDistanceToFinalSnap(f fVar, View view) {
        if (!(fVar instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) fVar;
        int iY = carouselLayoutManager.y(carouselLayoutManager.getPosition(view));
        return carouselLayoutManager.C() ? new int[]{iY, 0} : fVar.canScrollVertically() ? new int[]{0, iY} : new int[]{0, 0};
    }

    @SuppressLint({"UnknownNullness"})
    public int[] calculateScrollDistance(int i, int i2) {
        this.mGravityScroller.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    public uph createScroller(f fVar) {
        if (fVar instanceof tph) {
            return new mxf(this, this.mRecyclerView.getContext(), (byte) 0);
        }
        return null;
    }

    @Nullable
    @Deprecated
    public ifc createSnapScroller(@NonNull f fVar) {
        if (fVar instanceof tph) {
            return new mxf(this, this.mRecyclerView.getContext(), (byte) 1);
        }
        return null;
    }

    public abstract View findSnapView(f fVar);

    public abstract int findTargetSnapPosition(f fVar, int i, int i2);

    public boolean onFling(int i, int i2) {
        uph uphVarCreateScroller;
        int iFindTargetSnapPosition;
        RecyclerView recyclerView = this.mRecyclerView;
        f fVar = recyclerView.n;
        if (fVar == null || recyclerView.m == null) {
            return false;
        }
        int i3 = recyclerView.W;
        if ((Math.abs(i2) <= i3 && Math.abs(i) <= i3) || !(fVar instanceof tph) || (uphVarCreateScroller = createScroller(fVar)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(fVar, i, i2)) == -1) {
            return false;
        }
        uphVarCreateScroller.setTargetPosition(iFindTargetSnapPosition);
        fVar.startSmoothScroll(uphVarCreateScroller);
        return true;
    }

    public void snapToTargetExistingView() {
        f fVar;
        View viewFindSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (fVar = recyclerView.n) == null || (viewFindSnapView = findSnapView(fVar)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(fVar, viewFindSnapView);
        int i = iArrCalculateDistanceToFinalSnap[0];
        if (i == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.G0(i, iArrCalculateDistanceToFinalSnap[1], false);
    }
}
