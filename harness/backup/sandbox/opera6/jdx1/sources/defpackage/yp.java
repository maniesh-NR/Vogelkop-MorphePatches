package defpackage;

import android.webkit.WebView;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class yp {
    public final String a;
    public zy9 c;
    public qe6 d;
    public long f = System.nanoTime();
    public int e = 1;
    public b2b b = new b2b((Object) null, (byte) 3);

    public yp(String str) {
        this.a = str;
    }

    public static JSONArray a(List list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((v5p) ((nno) it.next())).getClass();
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

    public void b(uio uioVar, ne5 ne5Var) throws JSONException {
        c(uioVar, ne5Var, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.uio r8, defpackage.ne5 r9, org.json.JSONObject r10) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp.c(uio, ne5, org.json.JSONObject):void");
    }

    public final void d(String str, JSONObject jSONObject) {
        qii.p.m(g(), "publishMediaEvent", str, jSONObject, this.a);
    }

    public final void e(Date date) throws JSONException {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        yqo.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        qii.p.m(g(), "setLastActivity", jSONObject);
    }

    public void f() {
        this.b.clear();
    }

    public final WebView g() {
        return (WebView) this.b.get();
    }

    public void h() {
    }
}
