package defpackage;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dj8 {
    public final String a;

    public dj8(String str) {
        this.a = str;
    }

    public static dj8 a(JSONObject jSONObject) throws JSONException {
        jSONObject.getString("title");
        jSONObject.optString("summary");
        String string = jSONObject.getString("thumbnail");
        jSONObject.getString("news_id");
        String string2 = jSONObject.getString("news_entry_id");
        jSONObject.optString("publisher_name");
        String strOptString = jSONObject.optString("publisher_logo");
        Uri.parse(string);
        if (strOptString != null) {
            Uri.parse(strOptString);
        }
        return new dj8(string2);
    }
}
