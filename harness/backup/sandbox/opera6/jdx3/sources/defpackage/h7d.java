package defpackage;

import android.R;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import com.opera.android.sheet.VelocityTrackingCoordinatorLayout;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h7d {
    public final vl6 a;
    public final pt1 b;
    public final Resources c;
    public final yzb d;
    public boolean e;
    public byte f = 4;

    public h7d(vl6 vl6Var, pt1 pt1Var, Resources resources, yzb yzbVar) {
        this.a = vl6Var;
        this.b = pt1Var;
        this.c = resources;
        this.d = yzbVar;
        Configuration configuration = resources.getConfiguration();
        this.e = !i7d.s0(configuration);
        a(i7d.s0(configuration));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.opera.android.sheet.VelocityTrackingCoordinatorLayout] */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.view.View, com.opera.android.sheet.VelocityTrackingCoordinatorLayout] */
    public final void a(boolean z) {
        vl6 vl6Var = this.a;
        pt1 pt1Var = this.b;
        if (z) {
            ?? r3 = (VelocityTrackingCoordinatorLayout) pt1Var.f;
            Resources resources = this.c;
            n1n n1nVar = new n1n(fan.a(360.0f, resources), (int) TypedValue.applyDimension(1, 400.0f, resources.getDisplayMetrics()), 0.3f);
            if (!Objects.equals(r3.B, n1nVar)) {
                r3.B = n1nVar;
                r3.requestLayout();
            }
            ViewGroup.LayoutParams layoutParams = r3.getLayoutParams();
            layoutParams.width = -2;
            r3.setLayoutParams(layoutParams);
            pt1Var.g.setVisibility(0);
            ((FrameLayout) pt1Var.b).setBackgroundResource(R.color.transparent);
            OperaBottomSheetBehavior operaBottomSheetBehavior = (OperaBottomSheetBehavior) vl6Var.b;
            operaBottomSheetBehavior.a = OperaBottomSheetBehavior.N;
            operaBottomSheetBehavior.p = false;
        } else {
            ?? r32 = (VelocityTrackingCoordinatorLayout) pt1Var.f;
            if (!Objects.equals(r32.B, null)) {
                r32.B = null;
                r32.requestLayout();
            }
            ViewGroup.LayoutParams layoutParams2 = r32.getLayoutParams();
            layoutParams2.width = -1;
            r32.setLayoutParams(layoutParams2);
            pt1Var.g.setVisibility(8);
            ((FrameLayout) pt1Var.b).setBackgroundResource(2131099819);
            OperaBottomSheetBehavior operaBottomSheetBehavior2 = (OperaBottomSheetBehavior) vl6Var.b;
            operaBottomSheetBehavior2.a = OperaBottomSheetBehavior.O;
            operaBottomSheetBehavior2.p = true;
        }
        this.e = !z;
    }
}
