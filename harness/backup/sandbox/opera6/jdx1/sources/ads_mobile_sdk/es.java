package ads_mobile_sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import defpackage.ato;
import defpackage.b11;
import defpackage.prb;
import defpackage.wpb;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class es implements ato {
    public final Context a;
    public final ah3 b;

    public es(Context context, ah3 ah3Var) {
        this.a = context;
        this.b = ah3Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        int i;
        boolean z;
        ResolveInfo resolveInfoResolveActivity;
        ah3 ah3Var = this.b;
        String str = (String) map.get("data");
        if (str == null) {
            xh3.a("Missing data argument for canOpenIntents gmsg", null, 6);
            Object objA = cy0Var.a(new prb(), "openableIntents", mt5Var);
            return objA == px5.a ? objA : Unit.a;
        }
        try {
            wpb wpbVarE = bw2.e((prb) new m5a().b(prb.class, str), "intents");
            if (wpbVarE == null) {
                xh3.a("Missing intents parameter for canOpenIntents gmsg", null, 6);
                Object objA2 = cy0Var.a(new prb(), "openableIntents", mt5Var);
                return objA2 == px5.a ? objA2 : Unit.a;
            }
            prb prbVar = new prb();
            int i2 = 0;
            for (int size = wpbVarE.a.size(); i2 < size; size = i) {
                prb prbVarA = bw2.a(wpbVarE, i2);
                if (prbVarA == null) {
                    i = size;
                } else {
                    String strA = bw2.a(prbVarA, "id", "");
                    Intent intent = (Intent) xug.c(bw2.a(prbVarA, "intent_url", ""), new b11((Object) this, (byte) 27));
                    if (intent == null) {
                        intent = new Intent();
                        i = size;
                        xug.c(bw2.a(prbVarA, "u", ""), new as(intent, (byte) 3));
                        xug.c(bw2.a(prbVarA, "i", ""), new as(intent, (byte) 4));
                        xug.c(bw2.a(prbVarA, "m", ""), new as(intent, (byte) 0));
                        z = true;
                        xug.c(bw2.a(prbVarA, "p", ""), new as(intent, (byte) 1));
                        xug.c(bw2.a(prbVarA, "c", ""), new as(intent, (byte) 2));
                    } else {
                        i = size;
                        z = true;
                    }
                    try {
                        resolveInfoResolveActivity = this.a.getPackageManager().resolveActivity(intent, 65536);
                    } catch (Exception e) {
                        ah3Var.a("Failed resolving intent: " + intent, (Throwable) e);
                        resolveInfoResolveActivity = Unit.a;
                    }
                    prbVar.q(strA, Boolean.valueOf(resolveInfoResolveActivity != null ? z : false));
                }
                i2++;
            }
            String str2 = (String) map.get("ad_mid");
            if (str2 != null && !StringsKt.N(str2)) {
                prbVar.r("ad_mid", str2);
            }
            Object objA3 = cy0Var.a(prbVar, "openableIntents", mt5Var);
            return objA3 == px5.a ? objA3 : Unit.a;
        } catch (Exception e2) {
            xh3.a("Invalid JSON data for canOpenIntents gmsg", e2, 4);
            ah3Var.a("Invalid JSON data for canOpenIntents gmsg", (Throwable) e2);
            Object objA4 = cy0Var.a(new prb(), "openableIntents", mt5Var);
            return objA4 == px5.a ? objA4 : Unit.a;
        }
    }

    @Override // defpackage.ato
    public final int b() {
        return 33;
    }
}
