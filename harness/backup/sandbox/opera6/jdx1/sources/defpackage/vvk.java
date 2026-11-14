package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public final class vvk implements Animation.AnimationListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ vvk(SwipeRefreshLayout swipeRefreshLayout, byte b) {
        this.a = b;
        this.b = swipeRefreshLayout;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        zvk zvkVar;
        byte b = this.a;
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        switch (b) {
            case 0:
                if (!swipeRefreshLayout.c) {
                    swipeRefreshLayout.l();
                    break;
                } else {
                    swipeRefreshLayout.y.setAlpha(255);
                    swipeRefreshLayout.y.start();
                    if (swipeRefreshLayout.D && (zvkVar = swipeRefreshLayout.b) != null) {
                        zvkVar.a();
                    }
                    swipeRefreshLayout.n = swipeRefreshLayout.t.getTop();
                    break;
                }
                break;
            default:
                xvk xvkVar = new xvk(swipeRefreshLayout, (byte) 1);
                swipeRefreshLayout.A = xvkVar;
                xvkVar.setDuration(150L);
                h05 h05Var = swipeRefreshLayout.t;
                h05Var.a = null;
                h05Var.clearAnimation();
                swipeRefreshLayout.t.startAnimation(swipeRefreshLayout.A);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        byte b = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        byte b = this.a;
    }
}
