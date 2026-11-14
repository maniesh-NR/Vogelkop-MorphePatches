package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import defpackage.ato;
import defpackage.prb;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class in3 implements ato {
    public final Context a;
    public final g0 b;

    public in3(Context context, g0 g0Var) {
        this.a = context;
        this.b = g0Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        int iWidth;
        int iHeight;
        WindowMetrics currentWindowMetrics;
        prb prbVar = new prb();
        int[] iArr = new int[2];
        cy0Var.getLocationInWindow(iArr);
        prbVar.p(new Integer(iArr[0]), "xInPixels");
        prbVar.p(new Integer(iArr[1]), "yInPixels");
        Context contextB = this.b.b();
        if (contextB == null) {
            contextB = this.a;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            WindowManager windowManager = (WindowManager) contextB.getSystemService(WindowManager.class);
            if (windowManager == null || (currentWindowMetrics = windowManager.getCurrentWindowMetrics()) == null) {
                return Unit.a;
            }
            iWidth = currentWindowMetrics.getBounds().width();
            iHeight = currentWindowMetrics.getBounds().height();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager2 = (WindowManager) contextB.getSystemService(WindowManager.class);
            Display defaultDisplay = windowManager2 != null ? windowManager2.getDefaultDisplay() : null;
            if (defaultDisplay == null) {
                return Unit.a;
            }
            defaultDisplay.getMetrics(displayMetrics);
            iWidth = displayMetrics.widthPixels;
            iHeight = displayMetrics.heightPixels;
        }
        prbVar.p(new Integer(iWidth), "windowWidthInPixels");
        prbVar.p(new Integer(iHeight), "windowHeightInPixels");
        Object objA = cy0Var.a(prbVar, "locationReady", mt5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 24;
    }
}
