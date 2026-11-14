package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xc3 extends ifc {
    public final /* synthetic */ zc3 a;
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc3(zc3 zc3Var, RecyclerView recyclerView, f fVar, Context context) {
        super(context);
        this.a = zc3Var;
        this.b = recyclerView;
        this.c = fVar;
    }

    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public final int calculateTimeForDeceleration(int i) {
        if (i == 0) {
            return 0;
        }
        pn7 pn7Var = this.a.e;
        return pn7Var != null ? (int) pn7.f(pn7Var.a) : super.calculateTimeForDeceleration(i);
    }

    public final void onTargetFound(View view, vph vphVar, sph sphVar) {
        f fVar = this.b.n;
        f fVar2 = this.c;
        if (Intrinsics.a(fVar, fVar2)) {
            int[] iArrCalculateDistanceToFinalSnap = this.a.calculateDistanceToFinalSnap(fVar2, view);
            int i = iArrCalculateDistanceToFinalSnap[0];
            int i2 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                sphVar.b(i, i2, iCalculateTimeForDeceleration, ((ifc) this).mDecelerateInterpolator);
            }
        }
    }
}
