package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import com.opera.android.widget.spotlightcarousel.SpotlightCarouselLayoutManager;

/* loaded from: classes.dex */
public final class v1k extends ifc {
    public final /* synthetic */ int a;
    public final /* synthetic */ SpotlightCarouselLayoutManager b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1k(int i, Context context, SpotlightCarouselLayoutManager spotlightCarouselLayoutManager) {
        super(context);
        this.a = i;
        this.b = spotlightCarouselLayoutManager;
        setTargetPosition(i);
    }

    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 30.0f / displayMetrics.densityDpi;
    }

    public final int calculateTimeForDeceleration(int i) {
        if (i == 0) {
            return 0;
        }
        return super.calculateTimeForDeceleration(i);
    }

    public final void onTargetFound(View view, vph vphVar, sph sphVar) {
        int iMin;
        SpotlightCarouselLayoutManager spotlightCarouselLayoutManager = this.b;
        if (spotlightCarouselLayoutManager.e == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(spotlightCarouselLayoutManager.r() * this.a, spotlightCarouselLayoutManager.q(spotlightCarouselLayoutManager.getItemCount())) - spotlightCarouselLayoutManager.g;
            if (spotlightCarouselLayoutManager.getLayoutDirection() == 1) {
                iMin = -iMin;
            }
        }
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.abs(iMin));
        if (iCalculateTimeForDeceleration > 0) {
            sphVar.b(iMin, 0, iCalculateTimeForDeceleration, ((ifc) this).mDecelerateInterpolator);
        }
    }
}
