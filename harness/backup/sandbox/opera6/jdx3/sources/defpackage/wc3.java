package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wc3 extends y1c {
    public final /* synthetic */ RecyclerView g;
    public final /* synthetic */ f h;
    public final /* synthetic */ zc3 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc3(RecyclerView recyclerView, f fVar, qsh qshVar, zc3 zc3Var) {
        super(recyclerView, (LinearLayoutManager) fVar, qshVar);
        this.g = recyclerView;
        this.h = fVar;
        this.i = zc3Var;
    }

    public final int calculateTimeForDeceleration(int i) {
        if (i == 0) {
            return 0;
        }
        pn7 pn7Var = this.i.e;
        return pn7Var != null ? (int) pn7.f(pn7Var.a) : super.calculateTimeForDeceleration(i);
    }

    public final void onTargetFound(View view, vph vphVar, sph sphVar) {
        f fVar = this.g.n;
        f fVar2 = this.h;
        if (Intrinsics.a(fVar, fVar2)) {
            int[] iArrCalculateDistanceToFinalSnap = this.i.calculateDistanceToFinalSnap(fVar2, view);
            int i = iArrCalculateDistanceToFinalSnap[0];
            int i2 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                sphVar.b(i, i2, iCalculateTimeForDeceleration, ((ifc) this).mDecelerateInterpolator);
            }
        }
    }
}
