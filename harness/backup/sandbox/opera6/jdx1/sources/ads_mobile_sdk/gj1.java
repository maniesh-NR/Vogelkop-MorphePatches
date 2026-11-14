package ads_mobile_sdk;

import android.view.View;
import android.webkit.WebView;
import defpackage.cfp;
import defpackage.ui6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gj1 implements cfp {
    public final ji a;
    public final WebView b;
    public final boolean c;
    public final b2b d;
    public final HashMap e;
    public final gs0 f;
    public final ji g;

    public gj1(ji jiVar, WebView webView, boolean z) {
        HashMap map = new HashMap();
        this.e = map;
        this.f = new gs0();
        if (!ui6.r.a) {
            qp2.n("Method called before OM SDK activation");
            throw null;
        }
        if (webView == null) {
            qp2.o("WebView is null");
            throw null;
        }
        this.a = jiVar;
        this.b = webView;
        this.c = z;
        if (z) {
            b2b b2bVar = this.d;
            if ((b2bVar != null ? (View) b2bVar.get() : null) != webView) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((q6) it.next()).a(webView);
                }
                this.d = new b2b(webView, (byte) 4);
            }
        }
        ji jiVar2 = new ji(webView, (cfp) this);
        this.g = jiVar2;
        jiVar2.m3a();
    }

    @Override // defpackage.cfp
    public final String a() {
        return "omidJsSessionService";
    }

    public final void a(String str) throws JSONException {
        t00 t00Var = t00.b;
        z31 z31Var = z31.b;
        z92 z92Var = z92.c;
        int i = 0;
        n6 n6VarA = n6.a(t00Var, z31Var, z92Var, z92Var, false);
        WebView webView = this.b;
        boolean z = this.c;
        ji jiVar = this.a;
        q6 q6Var = new q6(n6VarA, z ? o6.a(jiVar, webView, null, null) : o6.b(jiVar, webView, null, null), str);
        this.e.put(str, q6Var);
        b2b b2bVar = this.d;
        q6Var.a(b2bVar != null ? (View) b2bVar.get() : null);
        ArrayList arrayList = this.f.a;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            es0 es0Var = (es0) obj;
            View view = (View) es0Var.a.get();
            fs0 fs0Var = es0Var.c;
            if (!q6Var.f) {
                q6Var.b.a(view, fs0Var);
            }
        }
        q6Var.b();
    }

    @Override // defpackage.cfp
    public final void a(String str, JSONObject jSONObject) throws JSONException {
        q6 q6Var;
        HashMap map = this.e;
        try {
            String string = jSONObject.getString("adSessionId");
            if (str.equals("startSession")) {
                a(string);
            } else {
                if (!str.equals("finishSession") || (q6Var = (q6) map.get(string)) == null) {
                    return;
                }
                q6Var.a();
                map.remove(string);
            }
        } catch (JSONException unused) {
        }
    }

    @Override // defpackage.cfp
    public final void b() {
        throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }
}
