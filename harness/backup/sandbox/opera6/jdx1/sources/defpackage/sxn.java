package defpackage;

import android.webkit.WebView;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class sxn extends nr9 implements Function1 {
    public static final sxn a = new sxn(1, qyn.class, "defaultWebViewFactory", "defaultWebViewFactory(Lcom/multiplatform/webview/web/WebViewFactoryParam;)Landroid/webkit/WebView;", 1);

    public final Object invoke(Object obj) {
        return new WebView(((ywn) obj).a);
    }
}
