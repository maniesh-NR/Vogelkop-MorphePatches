package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class vpb {
    public final JSONArray a;

    public vpb() {
        this.a = new JSONArray();
    }

    public vpb(Object obj) throws JSONException {
        this.a = new JSONArray();
        if (!obj.getClass().isArray()) {
            throw new JSONException("Not a primitive array: " + obj.getClass());
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.a.put(orb.t(Array.get(obj, i)));
        }
    }

    public vpb(String str) {
        this.a = new JSONArray(str);
    }

    public vpb(Collection collection) {
        this.a = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.a.put(orb.t(it.next()));
        }
    }

    public vpb(JSONArray jSONArray) {
        this.a = jSONArray;
    }

    public vpb(JSONTokener jSONTokener) {
        this.a = new JSONArray(jSONTokener);
    }

    public final void a(Object obj) {
        this.a.put(orb.t(obj));
    }

    public final Object b(int i) {
        return orb.u(this.a.get(i));
    }

    public final orb c(int i) {
        return new orb(this.a.getJSONObject(i));
    }

    public final String d(int i) throws JSONException {
        Object obj = this.a.get(i);
        if (obj != JSONObject.NULL) {
            return String.valueOf(obj);
        }
        throw new JSONException(u35.g(i, " is null"));
    }

    public final orb e(int i) {
        JSONObject jSONObjectOptJSONObject = this.a.optJSONObject(i);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new orb(jSONObjectOptJSONObject);
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != vpb.class) {
            return false;
        }
        return this.a.equals(((vpb) obj).a);
    }

    public final String f(int i) {
        Object objOpt = this.a.opt(i);
        return (objOpt == null || objOpt == JSONObject.NULL) ? "" : String.valueOf(objOpt);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
