package defpackage;

import android.app.ActivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class uio {
    public final ne5 a;
    public final s9i b;
    public final ozo c;
    public b2b d;
    public yp e;
    public boolean f;
    public boolean g;
    public final String h;
    public boolean i;
    public boolean j;

    public uio(s9i s9iVar, ne5 ne5Var) throws JSONException {
        yp pnoVar;
        String string = UUID.randomUUID().toString();
        this.c = new ozo();
        this.f = false;
        this.g = false;
        this.b = s9iVar;
        this.a = ne5Var;
        this.h = string;
        this.d = new b2b((Object) null, (byte) 2);
        vp vpVar = (vp) ne5Var.g;
        if (vpVar == vp.HTML || vpVar == vp.JAVASCRIPT) {
            WebView webView = (WebView) ne5Var.c;
            wio wioVar = new wio(string);
            if (webView != null && ((ArrayList) wqo.a(q1p.b.a).b()).size() > 0) {
                webView.setWebViewClient(new sno(webView.getWebViewClient(), (byte) 0));
            }
            if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            wioVar.b = new b2b(webView, (byte) 3);
            this.e = wioVar;
            pnoVar = wioVar;
        } else {
            pnoVar = new pno(string, Collections.unmodifiableMap((HashMap) ne5Var.a), (String) ne5Var.e);
            this.e = pnoVar;
        }
        pnoVar.h();
        xqo.c.a.add(this);
        yp ypVar = this.e;
        qii qiiVar = qii.p;
        WebView webViewG = ypVar.g();
        String str = ypVar.a;
        JSONObject jSONObject = new JSONObject();
        yqo.b(jSONObject, "impressionOwner", (gvf) s9iVar.b);
        yqo.b(jSONObject, "mediaEventsOwner", (gvf) s9iVar.c);
        yqo.b(jSONObject, "creativeType", (u06) s9iVar.d);
        yqo.b(jSONObject, "impressionType", (w3b) s9iVar.e);
        yqo.b(jSONObject, "isolateVerificationScripts", Boolean.FALSE);
        qiiVar.m(webViewG, "init", jSONObject, str);
    }

    public static uio b(s9i s9iVar, ne5 ne5Var) {
        if (c26.q.b) {
            return new uio(s9iVar, ne5Var);
        }
        qp2.n("Method called before OM SDK activation");
        return null;
    }

    public final void a(View view, pp9 pp9Var, String str) {
        if (this.g) {
            return;
        }
        ozo ozoVar = this.c;
        ozoVar.getClass();
        if (view == null) {
            qp2.o("FriendlyObstruction is null");
            return;
        }
        if (str.length() > 50) {
            qp2.o("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!ozo.b.matcher(str).matches()) {
            qp2.o("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        } else if (ozoVar.a(view) == null) {
            ozoVar.a.add(new wxo(view, pp9Var, str));
        }
    }

    public final void c() {
        if (this.g) {
            return;
        }
        this.d.clear();
        if (!this.g) {
            this.c.a.clear();
        }
        this.g = true;
        yp ypVar = this.e;
        qii.p.m(ypVar.g(), "finishSession", ypVar.a);
        xqo xqoVar = xqo.c;
        ArrayList arrayList = xqoVar.b;
        ArrayList arrayList2 = xqoVar.b;
        boolean z = arrayList.size() > 0;
        xqoVar.a.remove(this);
        arrayList2.remove(this);
        if (z && arrayList2.size() <= 0) {
            w5p w5pVarB = w5p.b();
            g6m g6mVar = g6m.f;
            g6mVar.getClass();
            Handler handler = g6m.h;
            if (handler != null) {
                handler.removeCallbacks(g6m.j);
                g6m.h = null;
            }
            g6mVar.a.clear();
            g6m.g.post(new ssi(g6mVar, (byte) 16));
            ono onoVar = ono.f;
            onoVar.b = false;
            onoVar.e = null;
            ouo ouoVar = (ouo) w5pVarB.c;
            ouoVar.c.getContentResolver().unregisterContentObserver(ouoVar);
        }
        this.e.f();
        this.e = null;
    }

    public final void d(View view) {
        if (this.g || ((View) this.d.get()) == view) {
            return;
        }
        this.d = new b2b(view, (byte) 2);
        yp ypVar = this.e;
        ypVar.getClass();
        ypVar.f = System.nanoTime();
        ypVar.e = 1;
        Collection<uio> collectionUnmodifiableCollection = Collections.unmodifiableCollection(xqo.c.a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (uio uioVar : collectionUnmodifiableCollection) {
            if (uioVar != this && ((View) uioVar.d.get()) == view) {
                uioVar.d.clear();
            }
        }
    }

    public final void e() {
        if (this.f || this.e == null) {
            return;
        }
        this.f = true;
        xqo xqoVar = xqo.c;
        boolean z = xqoVar.b.size() > 0;
        xqoVar.b.add(this);
        if (!z) {
            w5p w5pVarB = w5p.b();
            ono onoVar = ono.f;
            onoVar.e = w5pVarB;
            onoVar.b = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z2 = runningAppProcessInfo.importance == 100 || onoVar.d();
            onoVar.c = z2;
            onoVar.c(z2);
            g6m.f.getClass();
            g6m.b();
            ouo ouoVar = (ouo) w5pVarB.c;
            ouoVar.g.submit((Runnable) new ssi(ouoVar, (byte) 27));
            ouoVar.c.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, ouoVar);
        }
        float f = w5p.b().b;
        yp ypVar = this.e;
        qii qiiVar = qii.p;
        qiiVar.m(ypVar.g(), "setDeviceVolume", Float.valueOf(f), ypVar.a);
        yp ypVar2 = this.e;
        Date date = vio.f.b;
        ypVar2.e(date != null ? (Date) date.clone() : null);
        yp ypVar3 = this.e;
        List listB = wqo.a(q1p.b.a).b();
        ypVar3.getClass();
        try {
            JSONArray jSONArrayA = yp.a(listB);
            JSONObject jSONObject = new JSONObject();
            yqo.b(jSONObject, "supportedAttestationMechanisms", jSONArrayA);
            qiiVar.m(ypVar3.g(), "setSupportedAttestations", jSONObject);
        } catch (JSONException unused) {
        }
        this.e.b(this, this.a);
    }
}
