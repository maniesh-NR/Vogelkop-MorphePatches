package defpackage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class orb {
    public final JSONObject a;

    public orb() {
        this.a = new JSONObject();
    }

    public orb(String str) {
        this.a = new JSONObject(str);
    }

    public orb(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public static Object t(Object obj) {
        return obj == null ? JSONObject.NULL : obj instanceof orb ? ((orb) obj).a : obj instanceof vpb ? ((vpb) obj).a : obj;
    }

    public static Object u(Object obj) {
        if (obj == null || obj == JSONObject.NULL) {
            return null;
        }
        return obj instanceof JSONObject ? new orb((JSONObject) obj) : obj instanceof JSONArray ? new vpb((JSONArray) obj) : obj;
    }

    public final Object a(String str) {
        return u(this.a.get(str));
    }

    public final vpb b(String str) {
        return new vpb(this.a.getJSONArray(str));
    }

    public final orb c(String str) {
        return new orb(this.a.getJSONObject(str));
    }

    public final long d(String str) {
        return this.a.getLong(str);
    }

    public final String e(String str) throws JSONException {
        Object objA = a(str);
        if (objA != null) {
            return String.valueOf(objA);
        }
        throw new JSONException(sko.u(str, " is null"));
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != orb.class) {
            return false;
        }
        return this.a.equals(((orb) obj).a);
    }

    public final boolean f(String str) {
        return this.a.optBoolean(str, false);
    }

    public final int g(String str) {
        return this.a.optInt(str, 0);
    }

    public final vpb h(String str) {
        JSONArray jSONArrayOptJSONArray = this.a.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        return new vpb(jSONArrayOptJSONArray);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final orb i(String str) {
        JSONObject jSONObjectOptJSONObject = this.a.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new orb(jSONObjectOptJSONObject);
    }

    public final long j(String str) {
        return this.a.optLong(str, 0L);
    }

    public final Boolean k(String str) {
        JSONObject jSONObject = this.a;
        if (jSONObject.optBoolean(str, false)) {
            return Boolean.TRUE;
        }
        if (jSONObject.optBoolean(str, true)) {
            return null;
        }
        return Boolean.FALSE;
    }

    public final Long l(String str) {
        JSONObject jSONObject = this.a;
        long jOptLong = jSONObject.optLong(str, Long.MIN_VALUE);
        if (jOptLong == Long.MIN_VALUE && jSONObject.optLong(str, 0L) == 0) {
            return null;
        }
        return Long.valueOf(jOptLong);
    }

    public final String m(String str, String str2) {
        Object objOpt = this.a.opt(str);
        return (objOpt == null || objOpt == JSONObject.NULL) ? str2 : String.valueOf(objOpt);
    }

    public final void n(int i, String str) throws JSONException {
        try {
            this.a.put(str, i);
        } catch (JSONException e) {
            t3p.n(e);
        }
    }

    public final void o(long j, String str) throws JSONException {
        try {
            this.a.put(str, j);
        } catch (JSONException e) {
            t3p.n(e);
        }
    }

    public final void p(Object obj, String str) throws JSONException {
        try {
            this.a.put(str, t(obj));
        } catch (JSONException e) {
            t3p.n(e);
        }
    }

    public final void q(String str, double d) throws JSONException {
        try {
            this.a.put(str, d);
        } catch (JSONException e) {
            t3p.n(e);
        }
    }

    public final void r(String str, boolean z) throws JSONException {
        try {
            this.a.put(str, z);
        } catch (JSONException e) {
            t3p.n(e);
        }
    }

    public final void s(Object obj, String str) throws JSONException {
        if (obj == null) {
            return;
        }
        p(obj, str);
    }

    public final String toString() {
        return this.a.toString();
    }
}
