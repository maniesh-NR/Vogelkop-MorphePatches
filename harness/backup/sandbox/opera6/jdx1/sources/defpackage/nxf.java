package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.f;

/* loaded from: classes.dex */
public final class nxf extends qtj {
    public gsf a;
    public gsf b;

    public static int w(View view, hsf hsfVar) {
        return ((hsfVar.c(view) / 2) + hsfVar.e(view)) - ((hsfVar.l() / 2) + hsfVar.k());
    }

    public static View x(f fVar, hsf hsfVar) {
        int childCount = fVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iL = (hsfVar.l() / 2) + hsfVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = fVar.getChildAt(i2);
            int iAbs = Math.abs(((hsfVar.c(childAt) / 2) + hsfVar.e(childAt)) - iL);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    public final int[] calculateDistanceToFinalSnap(f fVar, View view) {
        int[] iArr = new int[2];
        if (fVar.canScrollHorizontally()) {
            iArr[0] = w(view, y(fVar));
        } else {
            iArr[0] = 0;
        }
        if (fVar.canScrollVertically()) {
            iArr[1] = w(view, z(fVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final View findSnapView(f fVar) {
        if (fVar.canScrollVertically()) {
            return x(fVar, z(fVar));
        }
        if (fVar.canScrollHorizontally()) {
            return x(fVar, y(fVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int findTargetSnapPosition(f fVar, int i, int i2) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = fVar.getItemCount();
        if (itemCount != 0) {
            View view = null;
            hsf hsfVarZ = fVar.canScrollVertically() ? z(fVar) : fVar.canScrollHorizontally() ? y(fVar) : null;
            if (hsfVarZ != null) {
                int childCount = fVar.getChildCount();
                boolean z = false;
                int i3 = Integer.MAX_VALUE;
                int i4 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = fVar.getChildAt(i5);
                    if (childAt != null) {
                        int iW = w(childAt, hsfVarZ);
                        if (iW <= 0 && iW > i4) {
                            view2 = childAt;
                            i4 = iW;
                        }
                        if (iW >= 0 && iW < i3) {
                            view = childAt;
                            i3 = iW;
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
        }
        return -1;
    }

    public final hsf y(f fVar) {
        gsf gsfVar = this.b;
        if (gsfVar != null && gsfVar.a == fVar) {
            return gsfVar;
        }
        gsf gsfVar2 = new gsf(fVar, (byte) 0);
        this.b = gsfVar2;
        return gsfVar2;
    }

    public final hsf z(f fVar) {
        gsf gsfVar = this.a;
        if (gsfVar != null && gsfVar.a == fVar) {
            return gsfVar;
        }
        gsf gsfVar2 = new gsf(fVar, (byte) 1);
        this.a = gsfVar2;
        return gsfVar2;
    }
}
