package ads_mobile_sdk;

import defpackage.cgp;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class s6 {
    public final String a;
    public long d = System.nanoTime();
    public byte c = 1;
    public b2b b = new b2b((Object) null, (byte) 5);

    public s6(String str) {
        this.a = str;
    }

    public static JSONArray a(ArrayList arrayList) {
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((sm0) ((cgp) obj)).getClass();
            for (String str : Collections.singletonList("1.0")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mechanism", "FireTVFOSDAT");
                jSONObject.put("executionEnvironment", "NATIVE");
                jSONObject.put("version", str);
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    public void a(q6 q6Var, o6 o6Var) {
        a(q6Var, o6Var, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(ads_mobile_sdk.q6 r9, ads_mobile_sdk.o6 r10, org.json.JSONObject r11) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.s6.a(ads_mobile_sdk.q6, ads_mobile_sdk.o6, org.json.JSONObject):void");
    }

    public void b() {
        this.b.clear();
    }

    public void c() {
    }
}
