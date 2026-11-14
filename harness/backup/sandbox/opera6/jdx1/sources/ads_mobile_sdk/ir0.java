package ads_mobile_sdk;

import android.os.Build;
import defpackage.prb;

/* loaded from: classes.dex */
public final class ir0 {
    public static final /* synthetic */ ir0 a;
    public static final prb b;

    static {
        Double dValueOf = Double.valueOf(0.5d);
        a = new ir0();
        prb prbVar = new prb();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            prbVar.p(1, "4");
            prbVar.p(1, "5");
            prbVar.p(dValueOf, "6");
            prbVar.p(dValueOf, "9");
            prbVar.p(0, "0");
            prbVar.p(0, "2");
            prbVar.p(0, "3");
            prbVar.p(0, "7");
            prbVar.p(-1, "12");
            prbVar.p(-1, "1");
            if (i >= 33) {
                prbVar.p(-1, "14");
            }
            prbVar.p(-1, "13");
            if (i >= 35) {
                prbVar.p(-1, "15");
                prbVar.p(-1, "16");
            }
            prbVar.p(-1, "8");
            prbVar.p(-1, "10");
            prbVar.p(-1, "11");
        }
        b = prbVar;
    }
}
