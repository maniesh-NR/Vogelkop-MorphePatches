package defpackage;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hf7 implements fji {
    public final String a;
    public final String b;
    public final long c;

    public /* synthetic */ hf7(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public static hf7 a(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new hf7(str, str2, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new hf7(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            e.toString();
            return null;
        }
    }

    @Override // defpackage.fji
    public final long b() {
        return this.c;
    }

    @Override // defpackage.fji
    public final String c() {
        return this.b;
    }

    @Override // defpackage.fji
    public final String d() {
        return this.a;
    }

    @Override // defpackage.fji
    public final String getFileName() {
        return this.a;
    }

    @Override // defpackage.fji
    public final boolean i() {
        return this.c > 0;
    }
}
