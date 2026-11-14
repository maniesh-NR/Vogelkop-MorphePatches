package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class dzo {
    public final bl a;
    public WeakReference b;
    public final nyo c;
    public final fio d;
    public boolean e;
    public boolean f;
    public long g;
    public final z4k h;
    public int i;
    public boolean j;

    public dzo(Context context, z4k z4kVar, bl blVar, fio fioVar) {
        lyo lyoVar = new lyo(this);
        lyo lyoVar2 = new lyo(this);
        nyo nyoVar = new nyo(context);
        WebSettings settings = nyoVar.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        nyoVar.setHorizontalScrollBarEnabled(false);
        nyoVar.setHorizontalScrollbarOverlay(false);
        nyoVar.setVerticalScrollBarEnabled(false);
        nyoVar.setVerticalScrollbarOverlay(false);
        nyoVar.setBackgroundColor(0);
        nyoVar.setLongClickable(false);
        nyoVar.setWebChromeClient(new myo(nyoVar, (byte) 0));
        nyoVar.setWebViewClient(new eho(lyoVar2, lyoVar));
        nyoVar.addJavascriptInterface(new cpb(), "OperaAdxSdk");
        this.c = nyoVar;
        this.a = blVar;
        this.d = fioVar;
        this.j = false;
        this.h = z4kVar;
    }

    public final void a(String str, ltm ltmVar, oam oamVar) {
        if (((Boolean) sjo.b.a()).booleanValue() && oamVar != null) {
            String str2 = (String) ezo.b.a();
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                str = vqo.b(str2, str).replace("[INSERT RESOURCE URL]", (String) oamVar.c);
            }
        }
        nyo nyoVar = this.c;
        WebSettings settings = nyoVar.getSettings();
        if (ltmVar != null) {
            settings.getUserAgentString();
            settings.setUserAgentString(ltmVar.k());
        }
        String strEncodeToString = Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 0);
        if (strEncodeToString == null) {
            nyoVar.loadData(str, "text/html", "UTF-8");
        } else {
            nyoVar.loadData(strEncodeToString, "text/html; charset=utf-8", "base64");
        }
        CookieManager.getInstance().setAcceptThirdPartyCookies(nyoVar, true);
    }
}
