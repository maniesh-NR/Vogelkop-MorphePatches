package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final /* synthetic */ class eg implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xo8 b;

    public /* synthetic */ eg(xo8 xo8Var, byte b) {
        this.a = b;
        this.b = xo8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xo8 xo8Var = this.b;
        switch (b) {
            case 0:
                xo8Var.c(wo8.a);
                break;
            case 1:
                xo8Var.a();
                break;
            case 2:
                xo8Var.c.animate().alpha(0.0f).setDuration(pn7.f(xo8.k)).withEndAction(new eg(xo8Var, (byte) 3));
                break;
            default:
                FrameLayout frameLayout = xo8Var.c;
                ViewParent parent = frameLayout.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(frameLayout);
                    break;
                }
                break;
        }
    }
}
