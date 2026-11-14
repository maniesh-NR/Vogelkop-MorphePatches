package defpackage;

import android.content.res.Resources;
import android.widget.FrameLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* loaded from: classes.dex */
public final class woi extends zwg {
    public final int a;
    public final /* synthetic */ xoi b;

    public woi(xoi xoiVar, Resources resources) {
        this.b = xoiVar;
        this.a = fan.a(1000.0f, resources);
    }

    public final boolean onFling(int i, int i2) {
        xoi xoiVar = this.b;
        s9i s9iVar = xoiVar.b;
        if (i2 >= (-this.a) || xoiVar.a() || !sle.d()) {
            s9iVar.U(xoiVar);
            return false;
        }
        FrameLayout frameLayout = (FrameLayout) s9iVar.b;
        ro9 ro9Var = (ro9) s9iVar.c;
        if (ro9Var != null && ((xoi) ro9Var.c).equals(xoiVar)) {
            ro9 ro9Var2 = (ro9) s9iVar.c;
            int i3 = ro9Var2.b;
            if (i3 == 2) {
                ((ExtendedFloatingActionButton) ro9Var2.d).animate().cancel();
                s9iVar.S(xoiVar, 6000L);
                return false;
            }
            if (i3 == 1) {
                return false;
            }
        }
        s9iVar.T();
        ro9 ro9Var3 = new ro9(xoiVar, frameLayout);
        s9iVar.c = ro9Var3;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) ro9Var3.d;
        frameLayout.addView(extendedFloatingActionButton);
        extendedFloatingActionButton.setAlpha(0.0f);
        extendedFloatingActionButton.setScaleX(0.0f);
        extendedFloatingActionButton.setScaleY(0.0f);
        extendedFloatingActionButton.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(0L).withEndAction(new wr9(s9iVar, xoiVar)).start();
        return false;
    }
}
