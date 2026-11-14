package ads_mobile_sdk;

import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xu1 extends s6 {
    public WebView e;
    public Long f;
    public final Map g;

    public xu1(String str, Map map) {
        super(str);
        this.f = null;
        this.g = map;
    }

    @Override // ads_mobile_sdk.s6
    public final void a(q6 q6Var, o6 o6Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap((HashMap) o6Var.d);
        Iterator it = mapUnmodifiableMap.keySet().iterator();
        if (!it.hasNext()) {
            a(q6Var, o6Var, jSONObject);
        } else {
            mapUnmodifiableMap.get((String) it.next()).getClass();
            h9o.t();
        }
    }

    public final void a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        renderProcessGoneDetail.toString();
        Objects.toString(webView);
        if (((WebView) this.b.get()) == webView) {
            this.b = new b2b((Object) null, (byte) 5);
        }
        if (webView != null) {
            webView.destroy();
        }
    }

    @Override // ads_mobile_sdk.s6
    public final void b() {
        this.b.clear();
        new Handler().postDelayed(new oi3(this), Math.max(4000 - (this.f == null ? 4000L : (System.nanoTime() - this.f.longValue()) / 1000000), 2000L));
        this.e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    @Override // ads_mobile_sdk.s6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r6 = this;
            ads_mobile_sdk.pb1 r0 = ads_mobile_sdk.pb1.b
            android.content.Context r1 = r0.a
            android.webkit.WebView r2 = new android.webkit.WebView
            r2.<init>(r1)
            r6.e = r2
            android.webkit.WebSettings r2 = r2.getSettings()
            r3 = 1
            r2.setJavaScriptEnabled(r3)
            android.webkit.WebView r2 = r6.e
            android.webkit.WebSettings r2 = r2.getSettings()
            r4 = 0
            r2.setAllowContentAccess(r4)
            android.webkit.WebView r2 = r6.e
            android.webkit.WebSettings r2 = r2.getSettings()
            r2.setAllowFileAccess(r4)
            android.webkit.WebView r2 = r6.e
            java.lang.String r5 = "WEB_MESSAGE_LISTENER"
            boolean r5 = defpackage.axn.b(r5)     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L50
            android.content.Context r0 = r0.a     // Catch: java.lang.Throwable -> L50
            ads_mobile_sdk.sk r0 = ads_mobile_sdk.sk.a(r0)     // Catch: java.lang.Throwable -> L50
            java.util.ArrayList r0 = r0.a()     // Catch: java.lang.Throwable -> L50
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L50
            if (r0 <= 0) goto L50
            tmj r0 = new tmj     // Catch: java.lang.Throwable -> L50
            r5 = 16
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L50
            ads_mobile_sdk.ji r5 = new ads_mobile_sdk.ji     // Catch: java.lang.Throwable -> L50
            r5.<init>(r2, r0)     // Catch: java.lang.Throwable -> L50
            r5.m3a()     // Catch: java.lang.Throwable -> L50
            goto L64
        L50:
            ads_mobile_sdk.sk r0 = ads_mobile_sdk.sk.a(r1)
            java.util.ArrayList r0 = r0.a()
            int r0 = r0.size()
            if (r0 <= 0) goto L64
            ads_mobile_sdk.uu1 r0 = new ads_mobile_sdk.uu1
            r0.<init>(r6, r4)
            goto L69
        L64:
            ads_mobile_sdk.uu1 r0 = new ads_mobile_sdk.uu1
            r0.<init>(r6, r3)
        L69:
            android.webkit.WebView r1 = r6.e
            r1.setWebViewClient(r0)
            android.webkit.WebView r0 = r6.e
            b2b r1 = new b2b
            r2 = 5
            r1.<init>(r0, r2)
            r6.b = r1
            android.webkit.WebView r0 = r6.e
            r1 = 0
            ads_mobile_sdk.bw2.a(r0, r1)
            java.util.Map r0 = r6.g
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L99
            long r0 = java.lang.System.nanoTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.f = r0
            return
        L99:
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.get(r6)
            r6.getClass()
            h9o.t()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xu1.c():void");
    }
}
