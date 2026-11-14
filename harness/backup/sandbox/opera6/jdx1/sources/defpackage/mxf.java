package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.opera.android.flow.MyFlowMessageRoot;

/* loaded from: classes.dex */
public final class mxf extends ifc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mxf(Object obj, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.ifc
    public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        int iD;
        int i6;
        switch (this.a) {
            case 2:
                iD = z1m.d(i4, i3, 2, i3);
                i6 = (i2 - i) / 2;
                break;
            case 5:
                iD = z1m.d(i4, i3, 2, i3);
                i6 = (i2 - i) / 2;
                break;
            default:
                return super.calculateDtToFit(i, i2, i3, i4, i5);
        }
        return iD - (i6 + i);
    }

    @Override // defpackage.ifc
    public final int calculateDxToMakeVisible(View view, int i) {
        switch (this.a) {
            case 3:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.b;
                if (carouselLayoutManager.f == null || !carouselLayoutManager.C()) {
                    return 0;
                }
                int position = carouselLayoutManager.getPosition(view);
                return (int) (carouselLayoutManager.a - carouselLayoutManager.z(position, carouselLayoutManager.x(position)));
            default:
                return super.calculateDxToMakeVisible(view, i);
        }
    }

    @Override // defpackage.ifc
    public final int calculateDyToMakeVisible(View view, int i) {
        switch (this.a) {
            case 3:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.b;
                if (carouselLayoutManager.f == null || carouselLayoutManager.C()) {
                    return 0;
                }
                int position = carouselLayoutManager.getPosition(view);
                return (int) (carouselLayoutManager.a - carouselLayoutManager.z(position, carouselLayoutManager.x(position)));
            case 4:
                int iCalculateDyToMakeVisible = super.calculateDyToMakeVisible(view, i);
                if (iCalculateDyToMakeVisible >= 0 || !(view instanceof MyFlowMessageRoot)) {
                    return iCalculateDyToMakeVisible;
                }
                MyFlowMessageRoot myFlowMessageRoot = (MyFlowMessageRoot) view;
                int measuredHeight = myFlowMessageRoot.h.getMeasuredHeight();
                float measuredHeight2 = myFlowMessageRoot.h.getMeasuredHeight();
                ValueAnimator valueAnimator = myFlowMessageRoot.k;
                return iCalculateDyToMakeVisible - (measuredHeight - Math.round((valueAnimator != null ? ((Float) valueAnimator.getAnimatedValue()).floatValue() : myFlowMessageRoot.j ? 1.0f : 0.0f) * measuredHeight2));
            default:
                return super.calculateDyToMakeVisible(view, i);
        }
    }

    @Override // defpackage.ifc
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        int i;
        switch (this.a) {
            case 0:
                i = displayMetrics.densityDpi;
                break;
            case 1:
                i = displayMetrics.densityDpi;
                break;
            default:
                return super.calculateSpeedPerPixel(displayMetrics);
        }
        return 100.0f / i;
    }

    @Override // defpackage.ifc
    public final int calculateTimeForScrolling(int i) {
        switch (this.a) {
            case 0:
                return Math.min(100, super.calculateTimeForScrolling(i));
            case 1:
            case 3:
            default:
                return super.calculateTimeForScrolling(i);
            case 2:
                return Math.max(super.calculateTimeForScrolling(i), 100);
            case 4:
                return Math.max(super.calculateTimeForScrolling(i), 100);
            case 5:
                return Math.max(super.calculateTimeForScrolling(i), 100);
        }
    }

    @Override // defpackage.uph
    public final PointF computeScrollVectorForPosition(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                return ((w93) obj).computeScrollVectorForPosition(i);
            case 3:
                return ((CarouselLayoutManager) obj).computeScrollVectorForPosition(i);
            case 4:
                return ((dge) obj).computeScrollVectorForPosition(i);
            case 5:
                return ((dge) obj).computeScrollVectorForPosition(i);
            default:
                return super.computeScrollVectorForPosition(i);
        }
    }

    @Override // defpackage.ifc, defpackage.uph
    public final void onTargetFound(View view, vph vphVar, sph sphVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                nxf nxfVar = (nxf) obj;
                int[] iArrCalculateDistanceToFinalSnap = nxfVar.calculateDistanceToFinalSnap(((qtj) nxfVar).mRecyclerView.n, view);
                int i = iArrCalculateDistanceToFinalSnap[0];
                int i2 = iArrCalculateDistanceToFinalSnap[1];
                int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                if (iCalculateTimeForDeceleration > 0) {
                    sphVar.b(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                    break;
                }
                break;
            case 1:
                qtj qtjVar = (qtj) obj;
                RecyclerView recyclerView = qtjVar.mRecyclerView;
                if (recyclerView != null) {
                    int[] iArrCalculateDistanceToFinalSnap2 = qtjVar.calculateDistanceToFinalSnap(recyclerView.n, view);
                    int i3 = iArrCalculateDistanceToFinalSnap2[0];
                    int i4 = iArrCalculateDistanceToFinalSnap2[1];
                    int iCalculateTimeForDeceleration2 = calculateTimeForDeceleration(Math.max(Math.abs(i3), Math.abs(i4)));
                    if (iCalculateTimeForDeceleration2 > 0) {
                        sphVar.b(i3, i4, iCalculateTimeForDeceleration2, this.mDecelerateInterpolator);
                        break;
                    }
                }
                break;
            default:
                super.onTargetFound(view, vphVar, sphVar);
                break;
        }
    }
}
