package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class sp8 extends qtj {
    public RecyclerView a;

    @Override // defpackage.qtj
    public final void attachToRecyclerView(RecyclerView recyclerView) {
        this.a = recyclerView;
        super.attachToRecyclerView(recyclerView);
    }

    @Override // defpackage.qtj
    public final uph createScroller(f fVar) {
        RecyclerView recyclerView;
        if (!(fVar instanceof tph) || (recyclerView = this.a) == null) {
            return null;
        }
        return new rp8(this, fVar, recyclerView.getContext());
    }

    @Override // defpackage.qtj
    public final View findSnapView(f fVar) {
        int childCount = fVar.getChildCount();
        View view = null;
        if (childCount != 0 && (fVar instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) fVar;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = fVar.getChildAt(i2);
                int iAbs = Math.abs(carouselLayoutManager.y(fVar.getPosition(childAt)));
                if (iAbs < i) {
                    view = childAt;
                    i = iAbs;
                }
            }
        }
        return view;
    }

    @Override // defpackage.qtj
    public final int findTargetSnapPosition(f fVar, int i, int i2) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = fVar.getItemCount();
        if (itemCount != 0) {
            int childCount = fVar.getChildCount();
            View view = null;
            boolean z = false;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = fVar.getChildAt(i5);
                if (childAt != null) {
                    CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) fVar;
                    int iY = carouselLayoutManager.y(carouselLayoutManager.getPosition(childAt));
                    if (iY <= 0 && iY > i4) {
                        view2 = childAt;
                        i4 = iY;
                    }
                    if (iY >= 0 && iY < i3) {
                        view = childAt;
                        i3 = iY;
                    }
                }
            }
            boolean z2 = !fVar.canScrollHorizontally() ? i2 <= 0 : i <= 0;
            if (z2) {
                if (view != null) {
                    return fVar.getPosition(view);
                }
                view = view2;
            } else if (view2 != null) {
                return fVar.getPosition(view2);
            }
            if (view != null) {
                int position = fVar.getPosition(view);
                int itemCount2 = fVar.getItemCount();
                if ((fVar instanceof tph) && (pointFComputeScrollVectorForPosition = ((tph) fVar).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f)) {
                    z = true;
                }
                int i6 = position + (z == z2 ? -1 : 1);
                if (i6 >= 0 && i6 < itemCount) {
                    return i6;
                }
            }
        }
        return -1;
    }
}
