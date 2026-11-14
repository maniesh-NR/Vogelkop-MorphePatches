package ads_mobile_sdk;

import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.fvo;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class mw1 implements hap {
    public final zt1 a;
    public final e7 b = new e7((byte) 13, false);

    public mw1(zt1 zt1Var) {
        this.a = zt1Var;
    }

    public final Object a(boolean z, mt5 mt5Var) {
        FrameLayout frameLayoutC;
        if (z) {
            e7 e7Var = this.b;
            if (e7Var.a != null && (frameLayoutC = ((ew1) ((fvo) e7Var.a("The backing field has not yet been initialized."))).c()) != null) {
                Map mapB = ((ew1) ((fvo) e7Var.a("The backing field has not yet been initialized."))).b();
                ImageView.ScaleType scaleTypeE = ((ew1) ((fvo) e7Var.a("The backing field has not yet been initialized."))).e();
                if (scaleTypeE == null) {
                    scaleTypeE = iw1.i;
                }
                zt1 zt1Var = this.a;
                zt1Var.getClass();
                if (!zt1Var.a.getAndSet(true)) {
                    zt1Var.a(frameLayoutC, scaleTypeE, mapB);
                }
            }
        }
        return Unit.a;
    }
}
