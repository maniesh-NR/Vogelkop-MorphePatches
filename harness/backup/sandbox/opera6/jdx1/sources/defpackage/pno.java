package defpackage;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pno extends yp {
    public WebView g;
    public Long h;
    public final Map i;
    public final String j;

    public pno(String str, Map map, String str2) {
        super(str);
        this.h = null;
        this.i = map;
        this.j = str2;
    }

    @Override // defpackage.yp
    public final void b(uio uioVar, ne5 ne5Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap((HashMap) ne5Var.a);
        for (String str : mapUnmodifiableMap.keySet()) {
            t1n t1nVar = (t1n) mapUnmodifiableMap.get(str);
            t1nVar.getClass();
            JSONObject jSONObject2 = new JSONObject();
            yqo.b(jSONObject2, "vendorKey", t1nVar.a);
            yqo.b(jSONObject2, "resourceUrl", t1nVar.b.toString());
            yqo.b(jSONObject2, "verificationParameters", t1nVar.c);
            yqo.b(jSONObject, str, jSONObject2);
        }
        c(uioVar, ne5Var, jSONObject);
    }

    @Override // defpackage.yp
    public final void f() {
        super.f();
        new Handler().postDelayed(new ssi(this), Math.max(4000 - (this.h == null ? 4000L : (System.nanoTime() - this.h.longValue()) / 1000000), 2000L));
        this.g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    @Override // defpackage.yp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pno.h():void");
    }
}
