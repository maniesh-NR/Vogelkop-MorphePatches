package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class yqo {
    public static WindowManager a;
    public static final String[] b = {"x", "y", "width", "height"};
    public static float c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i, int i2, int i3, int i4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / c);
            jSONObject.put("y", i2 / c);
            jSONObject.put("width", i3 / c);
            jSONObject.put("height", i4 / c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void b(JSONObject jSONObject, String str, Object obj) throws JSONException {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException unused) {
        }
    }

    public static void c(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static HashMap d(JSONObject jSONObject) throws JSONException {
        try {
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    map.put(next, (String) obj);
                }
            }
            return map;
        } catch (Exception e) {
            h9o.s("Failed to parse JSON to Map", e);
            return null;
        }
    }

    public static void e(JSONObject jSONObject) throws JSONException {
        float f;
        float f2;
        if (a != null) {
            Point point = new Point(0, 0);
            a.getDefaultDisplay().getRealSize(point);
            float f3 = point.x;
            float f4 = c;
            f = f3 / f4;
            f2 = point.y / f4;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        try {
            jSONObject.put("width", f);
            jSONObject.put("height", f2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (r5 >= r4.length()) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        if (r4.optString(r5, "").equals(r2.optString(r5, "")) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bd, code lost:
    
        if (r2 >= r8.length()) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cb, code lost:
    
        if (f(r8.optJSONObject(r2), r9.optJSONObject(r2)) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(org.json.JSONObject r8, org.json.JSONObject r9) {
        /*
            r0 = 0
            r1 = 1
            if (r8 != 0) goto L7
            if (r9 == 0) goto Ld5
            return r0
        L7:
            if (r9 == 0) goto Ld6
            r2 = r0
        La:
            r3 = 4
            if (r2 >= r3) goto L20
            java.lang.String[] r3 = defpackage.yqo.b
            r3 = r3[r2]
            double r4 = r8.optDouble(r3)
            double r6 = r9.optDouble(r3)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 != 0) goto Ld6
            int r2 = r2 + 1
            goto La
        L20:
            java.lang.String r2 = "adSessionId"
            java.lang.String r3 = ""
            java.lang.String r4 = r8.optString(r2, r3)
            java.lang.String r2 = r9.optString(r2, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Ld6
            java.lang.String r2 = "noOutputDevice"
            boolean r4 = r8.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r9.optBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Ld6
            java.lang.String r2 = "hasWindowFocus"
            boolean r4 = r8.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r9.optBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Ld6
            java.lang.String r2 = "isFriendlyObstructionFor"
            org.json.JSONArray r4 = r8.optJSONArray(r2)
            org.json.JSONArray r2 = r9.optJSONArray(r2)
            if (r4 != 0) goto L70
            if (r2 == 0) goto L99
        L70:
            if (r4 != 0) goto L75
            if (r2 != 0) goto Ld6
            goto L81
        L75:
            if (r2 == 0) goto Ld6
            int r5 = r4.length()
            int r6 = r2.length()
            if (r5 != r6) goto Ld6
        L81:
            r5 = r0
        L82:
            int r6 = r4.length()
            if (r5 >= r6) goto L99
            java.lang.String r6 = r4.optString(r5, r3)
            java.lang.String r7 = r2.optString(r5, r3)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto Ld6
            int r5 = r5 + 1
            goto L82
        L99:
            java.lang.String r2 = "childViews"
            org.json.JSONArray r8 = r8.optJSONArray(r2)
            org.json.JSONArray r9 = r9.optJSONArray(r2)
            if (r8 != 0) goto La7
            if (r9 == 0) goto Ld0
        La7:
            if (r8 != 0) goto Lac
            if (r9 != 0) goto Ld2
            goto Lb8
        Lac:
            if (r9 == 0) goto Ld2
            int r2 = r8.length()
            int r3 = r9.length()
            if (r2 != r3) goto Ld2
        Lb8:
            r2 = r0
        Lb9:
            int r3 = r8.length()
            if (r2 >= r3) goto Ld0
            org.json.JSONObject r3 = r8.optJSONObject(r2)
            org.json.JSONObject r4 = r9.optJSONObject(r2)
            boolean r3 = f(r3, r4)
            if (r3 == 0) goto Ld2
            int r2 = r2 + 1
            goto Lb9
        Ld0:
            r8 = r1
            goto Ld3
        Ld2:
            r8 = r0
        Ld3:
            if (r8 == 0) goto Ld6
        Ld5:
            return r1
        Ld6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqo.f(org.json.JSONObject, org.json.JSONObject):boolean");
    }
}
