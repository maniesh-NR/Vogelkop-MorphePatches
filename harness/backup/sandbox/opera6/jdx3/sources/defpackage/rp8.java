package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.f;

/* loaded from: classes.dex */
public final class rp8 extends ifc {
    public final /* synthetic */ sp8 a;
    public final /* synthetic */ f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp8(sp8 sp8Var, f fVar, Context context) {
        super(context);
        this.a = sp8Var;
        this.b = fVar;
    }

    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public final void onTargetFound(View view, vph vphVar, sph sphVar) {
        int[] iArrCalculateDistanceToFinalSnap = this.a.calculateDistanceToFinalSnap(this.b, view);
        int i = iArrCalculateDistanceToFinalSnap[0];
        int i2 = iArrCalculateDistanceToFinalSnap[1];
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
        if (iCalculateTimeForDeceleration > 0) {
            sphVar.b(i, i2, iCalculateTimeForDeceleration, ((ifc) this).mDecelerateInterpolator);
        }
    }
}
