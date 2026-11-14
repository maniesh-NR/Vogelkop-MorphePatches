package defpackage;

import ads_mobile_sdk.cy0;
import ads_mobile_sdk.xu0;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class w1p implements ato {
    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        String str = (String) map.get("urls");
        if (str == null || str.length() == 0) {
            xu0.c("URLs missing in canOpenURLs GMSG.", null);
            return Unit.a;
        }
        List<String> listY = StringsKt.Y(str, new String[]{","}, 0, 6);
        prb prbVar = new prb();
        PackageManager packageManager = cy0Var.getContext().getPackageManager();
        for (String str2 : listY) {
            List listY2 = StringsKt.Y(str2, new String[]{";"}, 2, 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(listY2.size() > 1 ? StringsKt.l0((String) listY2.get(1)).toString() : "android.intent.action.VIEW", Uri.parse(StringsKt.l0((String) listY2.get(0)).toString())), 65536) == null) {
                z = false;
            }
            prbVar.q(str2, Boolean.valueOf(z));
        }
        String str3 = (String) map.get("ad_mid");
        if (str3 != null && !StringsKt.N(str3)) {
            prbVar.r("ad_mid", str3);
        }
        Object objA = cy0Var.a(prbVar, "openableURLs", mt5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 22;
    }
}
