package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class cz extends lyf {
    public cz(yo yoVar, rm rmVar, String str) {
        super(yoVar, str + "," + rmVar);
    }

    public static cz a(vo voVar, il ilVar) {
        String strValueOf;
        if (voVar instanceof xo) {
            xo xoVar = (xo) voVar;
            yo yoVar = xoVar.d;
            if (yoVar == yo.ADX) {
                strValueOf = String.valueOf(ilVar != null && ilVar.e);
            } else {
                strValueOf = "";
            }
            return new cz(yoVar, TextUtils.join(",", Arrays.asList(xoVar.a, xoVar.b, xoVar.c, xoVar.h, xoVar.i, String.valueOf(xoVar.e), strValueOf)));
        }
        if (!(voVar instanceof wo)) {
            qp2.o("unknown ad provider config");
            return null;
        }
        wo woVar = (wo) voVar;
        return new cz(woVar.d, woVar.a + "," + woVar.c + "," + woVar.i + "," + woVar.h + "," + woVar.e);
    }
}
