package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public final class xvk extends Animation {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ xvk(SwipeRefreshLayout swipeRefreshLayout, byte b) {
        this.a = b;
        this.b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        byte b = this.a;
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        switch (b) {
            case 0:
                swipeRefreshLayout.t.setScaleX(f);
                swipeRefreshLayout.t.setScaleY(f);
                break;
            case 1:
                float f2 = 1.0f - f;
                swipeRefreshLayout.t.setScaleX(f2);
                swipeRefreshLayout.t.setScaleY(f2);
                break;
            case 2:
                int iAbs = swipeRefreshLayout.x - Math.abs(swipeRefreshLayout.w);
                swipeRefreshLayout.o((swipeRefreshLayout.v + ((int) ((iAbs - r1) * f))) - swipeRefreshLayout.t.getTop());
                x05 x05Var = swipeRefreshLayout.y;
                float f3 = 1.0f - f;
                u05 u05Var = x05Var.a;
                if (f3 != u05Var.p) {
                    u05Var.p = f3;
                }
                x05Var.invalidateSelf();
                break;
            default:
                swipeRefreshLayout.j(f);
                break;
        }
    }
}
