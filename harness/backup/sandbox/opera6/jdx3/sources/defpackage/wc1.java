package defpackage;

import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class wc1 {
    public final WebView a;
    public final kxn b;

    public wc1(WebView webView, kxn kxnVar) {
        this.a = webView;
        this.b = kxnVar;
        if (kxnVar != null) {
            webView.addJavascriptInterface(this, "androidJsBridge");
        }
    }

    public final void a(String str, final q0n q0nVar) {
        String strJ = sko.j("javascript:", str);
        otb otbVar = otb.d;
        String str2 = ((hzc) otbVar).b;
        eaj eajVar = eaj.b;
        if (((hzc) otbVar).a.a.compareTo(eajVar) <= 0) {
            otbVar.b(eajVar, str2, "evaluateJavaScript: ".concat(strJ), (Throwable) null);
        }
        this.a.evaluateJavascript(strJ, q0nVar != null ? new ValueCallback() { // from class: vc1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                q0nVar.invoke((String) obj);
            }
        } : null);
    }

    @JavascriptInterface
    public final void call(@NotNull String str) {
        otb otbVar = otb.d;
        String str2 = ((hzc) otbVar).b;
        eaj eajVar = eaj.b;
        if (((hzc) otbVar).a.a.compareTo(eajVar) <= 0) {
            otbVar.b(eajVar, str2, sko.j("call from JS: ", str), (Throwable) null);
        }
        qpb qpbVar = rpb.d;
        qpbVar.getClass();
        ppb ppbVar = (ppb) qpbVar.a(str, ppb.Companion.serializer());
        String str3 = ((hzc) otbVar).b;
        if (((hzc) otbVar).a.a.compareTo(eajVar) <= 0) {
            otbVar.b(eajVar, str3, "call from JS: " + ppbVar, (Throwable) null);
        }
        kxn kxnVar = this.b;
        if (kxnVar != null) {
            kxnVar.a(ppbVar);
        }
    }

    @JavascriptInterface
    public final void callAndroid(int i, @NotNull String str, @NotNull String str2) {
        otb otbVar = otb.d;
        String str3 = ((hzc) otbVar).b;
        eaj eajVar = eaj.b;
        if (((hzc) otbVar).a.a.compareTo(eajVar) <= 0) {
            StringBuilder sbP = p3p.p(i, "callAndroid call from JS: ", ", ", str, ", ");
            sbP.append(str2);
            otbVar.b(eajVar, str3, sbP.toString(), (Throwable) null);
        }
        kxn kxnVar = this.b;
        if (kxnVar != null) {
            kxnVar.a(new ppb(i, str, str2));
        }
    }
}
