package defpackage;

import ads_mobile_sdk.ae1;
import ads_mobile_sdk.av0;
import ads_mobile_sdk.ev0;
import ads_mobile_sdk.hv0;
import ads_mobile_sdk.uq;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class lip {
    public static rap a(rap rapVar) {
        String strN;
        String strN2;
        if (!(rapVar instanceof hv0)) {
            if (rapVar instanceof av0) {
                return rapVar;
            }
            h9o.p();
            return null;
        }
        prb prbVar = (prb) ((hv0) rapVar).b;
        pqb pqbVarU = prbVar.u("errors");
        String strN3 = pqbVarU != null ? pqbVarU.n() : null;
        pqb pqbVarU2 = prbVar.u("valid");
        if (pqbVarU2 == null || pqbVarU2.f() != 1) {
            return new ev0(sko.j("Error building request URL: ", strN3), ae1.b);
        }
        pqb pqbVarU3 = prbVar.u("url");
        String strN4 = pqbVarU3 != null ? pqbVarU3.n() : null;
        if (strN4 == null) {
            return new ev0("BuildAdUrlResult url is null");
        }
        pqb pqbVarU4 = prbVar.u("base_uri");
        String strN5 = pqbVarU4 != null ? pqbVarU4.n() : null;
        pqb pqbVarU5 = prbVar.u("post_parameters");
        String strN6 = pqbVarU5 != null ? pqbVarU5.n() : null;
        pqb pqbVarU6 = prbVar.u("cookies_include");
        boolean z = pqbVarU6 == null || (strN2 = pqbVarU6.n()) == null || strN2.equals("1") || strN2.equals("true");
        pqb pqbVarU7 = prbVar.u("csrb_errors");
        return new hv0(new uq(strN3 != null ? StringsKt.Y(strN3, new String[]{","}, 0, 6) : null, strN5, strN6, z, strN4, null, (pqbVarU7 == null || (strN = pqbVarU7.n()) == null) ? null : StringsKt.Y(strN, new String[]{","}, 0, 6)));
    }
}
