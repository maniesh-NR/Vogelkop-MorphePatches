package defpackage;

import android.view.View;
import android.webkit.WebView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class sxo {
    public uio a;
    public zy9 b;
    public qe6 c;

    static {
        uqh.a(sxo.class).c();
    }

    public sxo(View view, String str, mzo mzoVar) {
        a(view, str, mzoVar);
    }

    public void a(View view, String str, mzo mzoVar) {
        WebView webView = (WebView) view;
        w3b w3bVar = w3b.b;
        gvf gvfVar = gvf.c;
        uio uioVarB = uio.b(s9i.E(u06.b, w3bVar, gvfVar, gvfVar), ne5.v(gd7.a("2.14.0"), webView, str));
        uioVarB.d(webView);
        uioVarB.e();
        this.a = uioVarB;
    }

    public void b() {
        qe6 qe6Var = this.c;
        if (qe6Var != null) {
            uio uioVar = (uio) qe6Var.b;
            zch.c(uioVar);
            JSONObject jSONObject = new JSONObject();
            yqo.b(jSONObject, "interactionType", sdb.CLICK);
            uioVar.e.d("adUserInteraction", jSONObject);
        }
    }

    public void c() {
        zy9 zy9Var = this.b;
        if (zy9Var != null) {
            zy9Var.L();
        }
    }
}
