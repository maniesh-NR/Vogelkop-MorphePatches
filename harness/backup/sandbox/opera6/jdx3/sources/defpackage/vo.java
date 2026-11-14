package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vo {
    public final String a;
    public final String b;
    public final String c;
    public final yo d;
    public final int e;
    public final int f;
    public final int g;

    public vo(String str, String str2, String str3, yo yoVar, int i, int i2, int i3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = yoVar;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public static vo a(r9i r9iVar) throws JSONException {
        String str = (String) r9iVar.d;
        String str2 = (String) r9iVar.e;
        orb orbVar = (orb) r9iVar.b;
        JSONObject jSONObject = orbVar.a;
        if (str2.equals("online")) {
            String str3 = (String) r9iVar.c;
            String strE = orbVar.e("id");
            yo yoVar = yo.GB_ONLINE;
            int iB = b(0, orbVar);
            int iOptInt = jSONObject.optInt("validity", yo.g(yoVar, rm.NATIVE));
            boolean zEqualsIgnoreCase = orbVar.m("pricing", "").equalsIgnoreCase("cpd");
            return new wo(str3, str, strE, iB, iOptInt, zEqualsIgnoreCase ? 1 : 0, orbVar.e("sdkSource"), orbVar.e("sdkPlcKey"), jSONObject.optInt("successBackoff", 0), jSONObject.optInt("failureBackoff", 10));
        }
        y55 y55Var = null;
        if (!str2.equals("sdk")) {
            qp2.o(str2);
            return null;
        }
        yo yoVarD = yo.d(orbVar.e("sdkSource"));
        String strE2 = orbVar.e("sdkPlcKey");
        rm rmVarD = rm.d(orbVar.m("format", ""));
        int iOptInt2 = jSONObject.optInt("validity", yo.g(yoVarD, rmVarD));
        String strM = orbVar.m("mediationChannel", null);
        if (strM != null) {
            yo.d(strM);
            orbVar.e("mediationUnitId");
        }
        String strM2 = orbVar.m("bidUnitId", null);
        String strM3 = orbVar.m("bidFormatId", null);
        if (strM2 != null && strM3 != null) {
            y55Var = new y55();
        }
        y55 y55Var2 = y55Var;
        String str4 = (String) r9iVar.c;
        String strE3 = orbVar.e("id");
        int iB2 = b(50, orbVar);
        boolean zEqualsIgnoreCase2 = orbVar.m("pricing", "").equalsIgnoreCase("cpd");
        return new xo(str4, str, strE3, yoVarD, rmVarD, strE2, iB2, iOptInt2, zEqualsIgnoreCase2 ? 1 : 0, y55Var2, orbVar.f("contentMapping"));
    }

    public static int b(int i, orb orbVar) {
        JSONObject jSONObject = orbVar.a;
        if (jSONObject.has("weight")) {
            return jSONObject.optInt("weight", i);
        }
        int iOptInt = jSONObject.optInt("rank", i);
        return (iOptInt < 0 || iOptInt > 100) ? i : iOptInt;
    }
}
