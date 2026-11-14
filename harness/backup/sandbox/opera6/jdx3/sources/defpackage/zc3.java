package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zc3 extends qtj {
    public gsf a;
    public gsf b;
    public qsh c;
    public pn7 e;
    public gsf g;
    public gsf h;
    public RecyclerView i;
    public float d = 1.0f;
    public vc3 f = new qp2(11);
    public int j = -1;
    public final yc3 k = new yc3(this, 0);

    @Override // defpackage.qtj
    public final void attachToRecyclerView(RecyclerView recyclerView) {
        if (!Intrinsics.a(recyclerView, this.i)) {
            RecyclerView recyclerView2 = this.i;
            yc3 yc3Var = this.k;
            if (recyclerView2 != null) {
                recyclerView2.t0(yc3Var);
            }
            this.i = recyclerView;
            if (recyclerView != null) {
                recyclerView.o(yc3Var);
            }
        }
        super.attachToRecyclerView(recyclerView);
    }

    @Override // defpackage.qtj
    public final int[] calculateDistanceToFinalSnap(f fVar, View view) {
        int[] iArr = new int[2];
        if (fVar.canScrollHorizontally()) {
            gsf gsfVar = this.b;
            if (gsfVar == null || ((hsf) gsfVar).a != fVar) {
                gsfVar = new gsf(fVar, (byte) 0);
                this.b = gsfVar;
            }
            iArr[0] = ((gsfVar.c(view) / 2) + gsfVar.e(view)) - ((gsfVar.l() / 2) + gsfVar.k());
        } else {
            iArr[0] = 0;
        }
        if (!fVar.canScrollVertically()) {
            iArr[1] = 0;
            return iArr;
        }
        gsf gsfVar2 = this.a;
        if (gsfVar2 == null || ((hsf) gsfVar2).a != fVar) {
            gsfVar2 = new gsf(fVar, (byte) 1);
            this.a = gsfVar2;
        }
        iArr[1] = ((gsfVar2.c(view) / 2) + gsfVar2.e(view)) - ((gsfVar2.l() / 2) + gsfVar2.k());
        return iArr;
    }

    @Override // defpackage.qtj
    public final uph createScroller(f fVar) {
        RecyclerView recyclerView = this.i;
        if (recyclerView == null) {
            return null;
        }
        qsh qshVar = this.c;
        return (qshVar == null || !(fVar instanceof LinearLayoutManager)) ? new xc3(this, recyclerView, fVar, recyclerView.getContext()) : new wc3(recyclerView, fVar, qshVar, this);
    }

    @Override // defpackage.qtj
    public final View findSnapView(f fVar) {
        if (fVar.canScrollVertically()) {
            hsf gsfVar = this.g;
            if (gsfVar == null || gsfVar.a != fVar) {
                gsfVar = new gsf(fVar, (byte) 1);
                this.g = gsfVar;
            }
            return x(fVar, gsfVar);
        }
        if (!fVar.canScrollHorizontally()) {
            return null;
        }
        hsf gsfVar2 = this.h;
        if (gsfVar2 == null || gsfVar2.a != fVar) {
            gsfVar2 = new gsf(fVar, (byte) 0);
            this.h = gsfVar2;
        }
        return x(fVar, gsfVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    @Override // defpackage.qtj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int findTargetSnapPosition(androidx.recyclerview.widget.f r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc3.findTargetSnapPosition(androidx.recyclerview.widget.f, int, int):int");
    }

    public final int w(f fVar, hsf hsfVar, int i, int i2) {
        int[] iArrCalculateScrollDistance = calculateScrollDistance(i, i2);
        int childCount = fVar.getChildCount();
        float f = 1.0f;
        if (childCount != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = fVar.getChildAt(i5);
                int position = fVar.getPosition(childAt);
                if (position != -1) {
                    if (position < i4) {
                        view = childAt;
                        i4 = position;
                    }
                    if (position > i3) {
                        view2 = childAt;
                        i3 = position;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(hsfVar.b(view), hsfVar.b(view2)) - Math.min(hsfVar.e(view), hsfVar.e(view2));
                if (iMax != 0) {
                    f = (iMax * 1.0f) / ((i3 - i4) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArrCalculateScrollDistance[0]) > Math.abs(iArrCalculateScrollDistance[1]) ? iArrCalculateScrollDistance[0] : iArrCalculateScrollDistance[1]) / f);
    }

    public final View x(f fVar, hsf hsfVar) {
        int childCount;
        i iVarT;
        RecyclerView recyclerView = this.i;
        View view = null;
        if (recyclerView == null || (childCount = fVar.getChildCount()) == 0) {
            return null;
        }
        int iL = (hsfVar.l() / 2) + hsfVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = fVar.getChildAt(i2);
            if (childAt != null && (iVarT = recyclerView.T(childAt)) != null) {
                if (this.f.d(iVarT.getBindingAdapterPosition())) {
                    int iAbs = (int) Math.abs(((hsfVar.c(childAt) / 2) + hsfVar.e(childAt)) - iL);
                    if (iAbs < i) {
                        view = childAt;
                        i = iAbs;
                    }
                }
            }
        }
        return view;
    }

    public final View y() {
        f fVar;
        RecyclerView recyclerView = this.i;
        if (recyclerView == null || (fVar = recyclerView.n) == null) {
            return null;
        }
        return findSnapView(fVar);
    }

    public final void z(View view, boolean z) {
        f fVar;
        RecyclerView recyclerView = this.i;
        if (recyclerView == null || (fVar = recyclerView.n) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(fVar, view);
        int i = iArrCalculateDistanceToFinalSnap[0];
        if (i == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        if (z) {
            recyclerView.G0(i, iArrCalculateDistanceToFinalSnap[1], false);
        } else {
            recyclerView.scrollBy(i, iArrCalculateDistanceToFinalSnap[1]);
        }
    }
}
