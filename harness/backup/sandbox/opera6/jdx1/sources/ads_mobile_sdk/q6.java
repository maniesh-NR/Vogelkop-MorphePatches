package ads_mobile_sdk;

import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import defpackage.ajp;
import defpackage.alp;
import defpackage.ouo;
import defpackage.w5p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q6 {
    public final o6 a;
    public b2b c;
    public s6 d;
    public final String g;
    public final os h;
    public final gs0 b = new gs0();
    public boolean e = false;
    public boolean f = false;

    public q6(n6 n6Var, o6 o6Var, String str) throws JSONException {
        s6 alpVar;
        os osVar = new os();
        osVar.a = new b2b((Object) null, (byte) 4);
        this.h = osVar;
        this.a = o6Var;
        this.g = str;
        this.c = new b2b((Object) null, (byte) 4);
        p6 p6Var = (p6) o6Var.h;
        if (p6Var == p6.b || p6Var == p6.c) {
            WebView webView = (WebView) o6Var.b;
            alpVar = new alp(str);
            if (webView != null && sk.a(pb1.b.a).a().size() > 0) {
                webView.setWebViewClient(new sno(webView.getWebViewClient(), (byte) 1));
            }
            if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            alpVar.b = new b2b(webView, (byte) 5);
            this.d = alpVar;
        } else {
            alpVar = new xu1(str, Collections.unmodifiableMap((HashMap) o6Var.d));
            this.d = alpVar;
        }
        alpVar.c();
        r6.c.a.add(this);
        s6 s6Var = this.d;
        bw2 bw2Var = bw2.a$1;
        WebView webView2 = (WebView) s6Var.b.get();
        String str2 = s6Var.a;
        JSONObject jSONObject = new JSONObject();
        v62.a(jSONObject, "impressionOwner", n6Var.a);
        v62.a(jSONObject, "mediaEventsOwner", n6Var.b);
        v62.a(jSONObject, "creativeType", n6Var.d);
        v62.a(jSONObject, "impressionType", n6Var.e);
        v62.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(n6Var.c));
        bw2Var.a(webView2, "init", jSONObject, str2);
    }

    public final void a() {
        if (this.f) {
            return;
        }
        os osVar = this.h;
        View view = (View) ((b2b) osVar.a).get();
        if (view != null) {
            t6 t6Var = (t6) osVar.c;
            if (t6Var != null) {
                view.removeOnAttachStateChangeListener(t6Var);
                osVar.c = null;
            }
            if (((ajp) osVar.b) != null) {
                if (view.getViewTreeObserver().isAlive()) {
                    view.getViewTreeObserver().removeOnWindowFocusChangeListener((ajp) osVar.b);
                }
                osVar.b = null;
            }
        }
        ((b2b) osVar.a).clear();
        this.c.clear();
        if (!this.f) {
            this.b.a.clear();
        }
        this.f = true;
        s6 s6Var = this.d;
        bw2.a$1.a((WebView) s6Var.b.get(), "finishSession", s6Var.a);
        r6 r6Var = r6.c;
        ArrayList arrayList = r6Var.b;
        byte b = 0;
        boolean z = arrayList.size() > 0;
        r6Var.a.remove(this);
        arrayList.remove(this);
        if (z && arrayList.size() <= 0) {
            w5p w5pVarA = w5p.a();
            ri3 ri3Var = ri3.g;
            ri3Var.getClass();
            Handler handler = ri3.i;
            if (handler != null) {
                handler.removeCallbacks(ri3.k);
                ri3.i = null;
            }
            ri3Var.a.clear();
            ri3.h.post(new oi3(ri3Var, b));
            m6 m6Var = m6.d;
            m6Var.b = false;
            m6Var.e = null;
            ouo ouoVar = (ouo) w5pVarA.c;
            ouoVar.c.getContentResolver().unregisterContentObserver(ouoVar);
        }
        this.d.b();
        this.d = null;
    }

    public final void a(View view) {
        if (this.f || ((View) this.c.get()) == view) {
            return;
        }
        os osVar = this.h;
        View view2 = (View) ((b2b) osVar.a).get();
        if (view2 != null) {
            t6 t6Var = (t6) osVar.c;
            if (t6Var != null) {
                view2.removeOnAttachStateChangeListener(t6Var);
                osVar.c = null;
            }
            if (((ajp) osVar.b) != null) {
                if (view2.getViewTreeObserver().isAlive()) {
                    view2.getViewTreeObserver().removeOnWindowFocusChangeListener((ajp) osVar.b);
                }
                osVar.b = null;
            }
        }
        ((b2b) osVar.a).clear();
        if (view != null) {
            osVar.a = new b2b(view, (byte) 4);
            t6 t6Var2 = new t6(osVar);
            osVar.c = t6Var2;
            view.addOnAttachStateChangeListener(t6Var2);
            if (view.isAttachedToWindow()) {
                osVar.a(view);
            }
        }
        this.c = new b2b(view, (byte) 4);
        s6 s6Var = this.d;
        s6Var.getClass();
        s6Var.d = System.nanoTime();
        s6Var.c = (byte) 1;
        Collection<q6> collectionUnmodifiableCollection = Collections.unmodifiableCollection(r6.c.a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (q6 q6Var : collectionUnmodifiableCollection) {
            if (q6Var != this && ((View) q6Var.c.get()) == view) {
                q6Var.c.clear();
            }
        }
    }

    public final void b() throws JSONException {
        if (this.e || this.d == null) {
            return;
        }
        this.e = true;
        r6 r6Var = r6.c;
        boolean z = r6Var.b.size() > 0;
        r6Var.b.add(this);
        if (!z) {
            w5p w5pVarA = w5p.a();
            m6 m6Var = m6.d;
            m6Var.e = w5pVarA;
            m6Var.b = true;
            boolean zA = m6Var.a();
            m6Var.c = zA;
            m6Var.a(zA);
            ri3.g.getClass();
            if (ri3.i == null) {
                Handler handler = new Handler(Looper.getMainLooper());
                ri3.i = handler;
                handler.post(ri3.j);
                ri3.i.postDelayed(ri3.k, 200L);
            }
            ouo ouoVar = (ouo) w5pVarA.c;
            ouoVar.g.submit(new oi3(ouoVar, (byte) 3));
            ouoVar.c.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, ouoVar);
        }
        float f = w5p.a().b;
        s6 s6Var = this.d;
        bw2 bw2Var = bw2.a$1;
        bw2Var.a((WebView) s6Var.b.get(), "setDeviceVolume", Float.valueOf(f), s6Var.a);
        s6 s6Var2 = this.d;
        Date date = p.f.b;
        Date date2 = date != null ? (Date) date.clone() : null;
        s6Var2.getClass();
        if (date2 != null) {
            JSONObject jSONObject = new JSONObject();
            v62.a(jSONObject, "timestamp", Long.valueOf(date2.getTime()));
            bw2Var.a((WebView) s6Var2.b.get(), "setLastActivity", jSONObject);
        }
        s6 s6Var3 = this.d;
        ArrayList arrayListA = sk.a(pb1.b.a).a();
        s6Var3.getClass();
        try {
            JSONArray jSONArrayA = s6.a(arrayListA);
            JSONObject jSONObject2 = new JSONObject();
            v62.a(jSONObject2, "supportedAttestationMechanisms", jSONArrayA);
            bw2Var.a((WebView) s6Var3.b.get(), "setSupportedAttestations", jSONObject2);
        } catch (JSONException unused) {
        }
        this.d.a(this, this.a);
    }
}
