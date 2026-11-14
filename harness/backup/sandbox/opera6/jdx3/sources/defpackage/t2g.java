package defpackage;

import J.N;
import com.opera.android.browser.SimpleUrlLoader;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class t2g {
    public final SimpleUrlLoader a;

    public t2g(String str, x2g x2gVar, String str2) throws JSONException {
        orb orbVar = new orb();
        orbVar.p(x2gVar.a, "gaid");
        orbVar.r("personalized", x2gVar.b);
        orbVar.p(x2gVar.c, "countryCode");
        orbVar.p(x2gVar.d, "abGroup");
        orbVar.p(x2gVar.e, "platform");
        SimpleUrlLoader simpleUrlLoader = new SimpleUrlLoader(str2, str, orbVar.a.toString(), "application/json", new kqd(this, (byte) 28));
        long j = simpleUrlLoader.a;
        if (j != 0) {
            N.M71SD119(j, 30);
        }
        this.a = simpleUrlLoader;
    }

    public static l2g a(orb orbVar, long j, long j2) {
        JSONObject jSONObject = orbVar.a;
        return new l2g(jSONObject.getInt("id"), orbVar.e("targetURL"), orbVar.e("domainURL"), orbVar.e("title"), 0.0d, orbVar.e("iconURL"), j, j2, jSONObject.optDouble("globalScore", 0.0d), jSONObject.optInt("autocompleteChars", 2), jSONObject.optInt("recommendChars", 2));
    }
}
