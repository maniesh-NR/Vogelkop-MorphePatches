package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public abstract class uph {
    private f mLayoutManager;
    private boolean mPendingInitialRun;
    private RecyclerView mRecyclerView;
    private final sph mRecyclingAction;
    private boolean mRunning;
    private boolean mStarted;
    private int mTargetPosition = -1;
    private View mTargetView;

    public uph() {
        sph sphVar = new sph();
        sphVar.d = -1;
        sphVar.f = false;
        sphVar.a = 0;
        sphVar.b = 0;
        sphVar.c = LinearLayoutManager.INVALID_OFFSET;
        sphVar.e = null;
        this.mRecyclingAction = sphVar;
    }

    @Nullable
    public PointF computeScrollVectorForPosition(int i) {
        Object layoutManager = getLayoutManager();
        if (layoutManager instanceof tph) {
            return ((tph) layoutManager).computeScrollVectorForPosition(i);
        }
        return null;
    }

    public View findViewByPosition(int i) {
        return this.mRecyclerView.n.findViewByPosition(i);
    }

    public int getChildCount() {
        return this.mRecyclerView.n.getChildCount();
    }

    public int getChildPosition(View view) {
        this.mRecyclerView.getClass();
        i iVarU = RecyclerView.U(view);
        if (iVarU != null) {
            return iVarU.getLayoutPosition();
        }
        return -1;
    }

    @Nullable
    public f getLayoutManager() {
        return this.mLayoutManager;
    }

    public int getTargetPosition() {
        return this.mTargetPosition;
    }

    @Deprecated
    public void instantScrollToPosition(int i) {
        this.mRecyclerView.x0(i);
    }

    public boolean isPendingInitialRun() {
        return this.mPendingInitialRun;
    }

    public boolean isRunning() {
        return this.mRunning;
    }

    public void normalize(@NonNull PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        pointF.x /= fSqrt;
        pointF.y /= fSqrt;
    }

    public void onAnimation(int i, int i2) {
        PointF pointFComputeScrollVectorForPosition;
        RecyclerView recyclerView = this.mRecyclerView;
        if (this.mTargetPosition == -1 || recyclerView == null) {
            stop();
        }
        if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
            float f = pointFComputeScrollVectorForPosition.x;
            if (f != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                recyclerView.w0((int) Math.signum(f), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
            }
        }
        this.mPendingInitialRun = false;
        View view = this.mTargetView;
        if (view != null) {
            if (getChildPosition(view) == this.mTargetPosition) {
                onTargetFound(this.mTargetView, recyclerView.h0, this.mRecyclingAction);
                this.mRecyclingAction.a(recyclerView);
                stop();
            } else {
                this.mTargetView = null;
            }
        }
        if (this.mRunning) {
            onSeekTargetStep(i, i2, recyclerView.h0, this.mRecyclingAction);
            sph sphVar = this.mRecyclingAction;
            boolean z = sphVar.d >= 0;
            sphVar.a(recyclerView);
            if (z && this.mRunning) {
                this.mPendingInitialRun = true;
                recyclerView.e0.b();
            }
        }
    }

    public void onChildAttachedToWindow(View view) {
        if (getChildPosition(view) == getTargetPosition()) {
            this.mTargetView = view;
            int[] iArr = RecyclerView.C0;
        }
    }

    public abstract void onSeekTargetStep(int i, int i2, vph vphVar, sph sphVar);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onTargetFound(View view, vph vphVar, sph sphVar);

    public void setTargetPosition(int i) {
        this.mTargetPosition = i;
    }

    public void start(RecyclerView recyclerView, f fVar) {
        h hVar = recyclerView.e0;
        hVar.g.removeCallbacks(hVar);
        hVar.c.abortAnimation();
        this.mRecyclerView = recyclerView;
        this.mLayoutManager = fVar;
        int i = this.mTargetPosition;
        if (i == -1) {
            qp2.o("Invalid target position");
            return;
        }
        recyclerView.h0.a = i;
        this.mRunning = true;
        this.mPendingInitialRun = true;
        this.mTargetView = findViewByPosition(getTargetPosition());
        onStart();
        this.mRecyclerView.e0.b();
        this.mStarted = true;
    }

    public final void stop() {
        if (this.mRunning) {
            this.mRunning = false;
            onStop();
            this.mRecyclerView.h0.a = -1;
            this.mTargetView = null;
            this.mTargetPosition = -1;
            this.mPendingInitialRun = false;
            this.mLayoutManager.onSmoothScrollerStopped(this);
            this.mLayoutManager = null;
            this.mRecyclerView = null;
        }
    }
}
