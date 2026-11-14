package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.view.Display;
import defpackage.prb;
import kotlin.Pair;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class bq1 {
    public final Context a;
    public final nx5 b;
    public final g0 c;
    public final kj0 d;

    public bq1(Context context, nx5 nx5Var, g0 g0Var, kj0 kj0Var) {
        this.a = context;
        this.b = nx5Var;
        this.c = g0Var;
        this.d = kj0Var;
    }

    public static Object a(cy0 cy0Var, int i, int i2, int i3, int i4, nr1 nr1Var) {
        prb prbVar = new prb();
        prbVar.p(new Integer(i), "x");
        prbVar.p(new Integer(i2), "y");
        prbVar.p(new Integer(i3), "width");
        prbVar.p(new Integer(i4), "height");
        Object objA = cy0Var.a(prbVar, "onSizeChanged", nr1Var);
        return objA == px5.a ? objA : Unit.a;
    }

    public static Object a(cy0 cy0Var, String str, String str2, kuk kukVar) {
        prb prbVar = new prb();
        prbVar.r("action", str2);
        prbVar.r("message", str);
        Object objA = cy0Var.a(prbVar, "onError", kukVar);
        return objA == px5.a ? objA : Unit.a;
    }

    public final Unit a(cy0 cy0Var) {
        kj0 kj0Var = this.d;
        Context context = this.a;
        Context contextC = kj0Var.c(context);
        Display displayA = kj0Var.a(context);
        mt5 mt5Var = null;
        if (displayA == null) {
            xu0.b("Unable to get Display in MraidAfmaDispatcher", null);
            return Unit.a;
        }
        int rotation = displayA.getRotation();
        float f = ioh.g(contextC).density;
        int iB = zed.b(r3.widthPixels / contextC.getResources().getDisplayMetrics().density);
        int iB2 = zed.b(r3.heightPixels / contextC.getResources().getDisplayMetrics().density);
        Activity activityB = this.c.b();
        Pair pairM = activityB != null ? ioh.m(activityB) : new Pair(new Integer(iB), new Integer(iB2));
        int iIntValue = ((Number) pairM.a).intValue();
        int iIntValue2 = ((Number) pairM.b).intValue();
        prb prbVar = new prb();
        prbVar.p(new Integer(iB), "width");
        prbVar.p(new Integer(iB2), "height");
        prbVar.p(new Integer(iIntValue), "maxSizeWidth");
        prbVar.p(new Integer(iIntValue2), "maxSizeHeight");
        prbVar.p(new Double(f), "density");
        prbVar.p(new Integer(rotation), "rotation");
        defpackage.na2.B(this.b, null, null, new aq1(cy0Var, prbVar, mt5Var, (byte) 0), 3);
        return Unit.a;
    }
}
