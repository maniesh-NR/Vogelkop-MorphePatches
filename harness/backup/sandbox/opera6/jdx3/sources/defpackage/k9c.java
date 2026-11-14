package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import com.opera.android.custom_views.MaxHeightLayoutDirectionFrameLayout;
import com.opera.android.widget.AspectRatioFrameLayout;
import com.opera.android.widget.AspectRatioImageView;
import com.opera.android.widget.LottieAnimationView;

/* loaded from: classes.dex */
public final class k9c extends dej {
    public final tah c;
    public MaxHeightLayoutDirectionFrameLayout d;
    public AspectRatioFrameLayout e;
    public AspectRatioImageView f;

    public k9c(mej mejVar, tah tahVar) {
        super(mejVar);
        this.c = tahVar;
    }

    public static void d(Resources resources, MaxHeightLayoutDirectionFrameLayout maxHeightLayoutDirectionFrameLayout) {
        boolean z = resources.getConfiguration().orientation == 1;
        float f = resources.getConfiguration().screenHeightDp;
        Rect rect = fan.a;
        maxHeightLayoutDirectionFrameLayout.c = (int) (((int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics())) * (z ? 0.75d : 0.9d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.opera.android.widget.LottieAnimationView, n2d] */
    public static void e(Configuration configuration, AspectRatioFrameLayout aspectRatioFrameLayout, AspectRatioImageView aspectRatioImageView) {
        ?? r0 = (LottieAnimationView) aspectRatioFrameLayout.findViewById(2131363365);
        int i = 8;
        if (r0.getVisibility() == 8 && aspectRatioImageView.getVisibility() == 8) {
            return;
        }
        boolean z = configuration.orientation == 1;
        boolean z2 = configuration.screenHeightDp >= 600;
        if (z && z2) {
            i = 0;
        }
        aspectRatioFrameLayout.setVisibility(i);
        if (((n2d) r0).m != null) {
            if (z && z2) {
                r0.h();
            } else {
                r0.f();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0154 A[PHI: r4
      0x0154: PHI (r4v2 int) = (r4v1 int), (r4v3 int), (r4v4 int), (r4v5 int), (r4v6 int), (r4v7 int) binds: [B:5:0x0023, B:7:0x002e, B:9:0x0039, B:11:0x0044, B:13:0x004f, B:15:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ImageView, androidx.appcompat.widget.AppCompatImageView, com.opera.android.widget.AspectRatioImageView] */
    @Override // defpackage.dej
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View a(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9c.a(android.content.Context):android.view.View");
    }
}
