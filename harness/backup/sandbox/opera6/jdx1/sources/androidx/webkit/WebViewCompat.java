package androidx.webkit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import defpackage.axn;
import defpackage.boi;
import defpackage.cxn;
import defpackage.cyn;
import defpackage.dwg;
import defpackage.dxn;
import defpackage.er3;
import defpackage.fr3;
import defpackage.fyn;
import defpackage.g4h;
import defpackage.gyn;
import defpackage.hyn;
import defpackage.ioj;
import defpackage.iun;
import defpackage.jj5;
import defpackage.jun;
import defpackage.li1;
import defpackage.lke;
import defpackage.lun;
import defpackage.lyj;
import defpackage.mke;
import defpackage.mun;
import defpackage.nun;
import defpackage.oun;
import defpackage.swn;
import defpackage.twn;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public class WebViewCompat {
    public static final Uri a = Uri.parse("*");
    public static final Uri b = Uri.parse("");
    public static final WeakHashMap c = new WeakHashMap();

    public static cyn a(WebView webView) {
        if (!axn.B.a()) {
            return new cyn(dxn.a.createWebView(webView));
        }
        WeakHashMap weakHashMap = c;
        cyn cynVar = (cyn) weakHashMap.get(webView);
        if (cynVar != null) {
            return cynVar;
        }
        cyn cynVar2 = new cyn(dxn.a.createWebView(webView));
        weakHashMap.put(webView, cynVar2);
        return cynVar2;
    }

    public static boi addDocumentStartJavaScript(WebView webView, String str, Set<String> set) {
        if (!axn.o.a()) {
            throw axn.a();
        }
        cyn cynVarA = a(webView);
        return new qie((ScriptHandlerBoundaryInterface) fr3.m(ScriptHandlerBoundaryInterface.class, cynVarA.a.addDocumentStartJavaScript(str, (String[]) set.toArray(new String[0]))), (byte) 17);
    }

    public static void addNavigationListener(WebView webView, Executor executor, lke lkeVar) {
        if (!axn.A.a()) {
            throw axn.a();
        }
        cyn cynVarA = a(webView);
        cynVarA.a.addWebViewNavigationListener(executor, new er3(new mke()));
    }

    public static void addNavigationListener(WebView webView, lke lkeVar) {
        addNavigationListener(webView, new jj5(new Handler(Looper.getMainLooper()), (byte) 0), lkeVar);
    }

    public static void addWebMessageListener(WebView webView, String str, Set<String> set, uwn uwnVar) {
        if (!axn.n.a()) {
            throw axn.a();
        }
        cyn cynVarA = a(webView);
        cynVarA.a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new er3(new oji(uwnVar)));
    }

    public static lun[] createWebMessageChannel(WebView webView) {
        WebMessagePort[] webMessagePortArrCreateWebMessageChannel = webView.createWebMessageChannel();
        if (webMessagePortArrCreateWebMessageChannel == null) {
            return null;
        }
        lun[] lunVarArr = new lun[webMessagePortArrCreateWebMessageChannel.length];
        for (int i = 0; i < webMessagePortArrCreateWebMessageChannel.length; i++) {
            WebMessagePort webMessagePort = webMessagePortArrCreateWebMessageChannel[i];
            mun munVar = new mun();
            munVar.a = webMessagePort;
            lunVarArr[i] = munVar;
        }
        return lunVarArr;
    }

    public static PackageInfo getCurrentLoadedWebViewPackage() {
        return WebView.getCurrentWebViewPackage();
    }

    public static PackageInfo getCurrentWebViewPackage(Context context) {
        PackageInfo currentLoadedWebViewPackage = getCurrentLoadedWebViewPackage();
        if (currentLoadedWebViewPackage != null) {
            return currentLoadedWebViewPackage;
        }
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str != null) {
                return context.getPackageManager().getPackageInfo(str, 0);
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return null;
    }

    public static Profile getProfile(WebView webView) {
        if (axn.q.a()) {
            return new g4h((ProfileBoundaryInterface) fr3.m(ProfileBoundaryInterface.class, a(webView).a.getProfile()));
        }
        throw axn.a();
    }

    public static Uri getSafeBrowsingPrivacyPolicyUrl() {
        axn.d.getClass();
        return WebView.getSafeBrowsingPrivacyPolicyUrl();
    }

    public static String getVariationsHeader() {
        if (axn.p.a()) {
            return dxn.a.getStatics().getVariationsHeader();
        }
        throw axn.a();
    }

    public static WebChromeClient getWebChromeClient(WebView webView) {
        axn.h.getClass();
        return webView.getWebChromeClient();
    }

    @Deprecated
    public static nun getWebNavigationClient(WebView webView) {
        if (!axn.z.a()) {
            throw axn.a();
        }
        InvocationHandler webViewNavigationClient = a(webView).a.getWebViewNavigationClient();
        if (webViewNavigationClient == null) {
            return null;
        }
        return null;
    }

    public static WebViewClient getWebViewClient(WebView webView) {
        axn.g.getClass();
        return webView.getWebViewClient();
    }

    public static fyn getWebViewRenderProcess(WebView webView) {
        axn.i.getClass();
        WebViewRenderProcess webViewRenderProcess = webView.getWebViewRenderProcess();
        if (webViewRenderProcess != null) {
            return hyn.a(webViewRenderProcess);
        }
        return null;
    }

    public static gyn getWebViewRenderProcessClient(WebView webView) {
        axn.j.getClass();
        webView.getWebViewRenderProcessClient();
        return null;
    }

    public static boolean isAudioMuted(WebView webView) {
        if (axn.r.a()) {
            return a(webView).a.isAudioMuted();
        }
        throw axn.a();
    }

    public static boolean isMultiProcessEnabled() {
        if (axn.k.a()) {
            return dxn.a.getStatics().isMultiProcessEnabled();
        }
        throw axn.a();
    }

    public static void postVisualStateCallback(WebView webView, long j, twn twnVar) {
        webView.postVisualStateCallback(j, new swn());
    }

    public static void postWebMessage(WebView webView, jun junVar, Uri uri) {
        boolean z;
        if (a.equals(uri)) {
            uri = b;
        }
        li1 li1Var = axn.f;
        if (!junVar.d) {
            String strB = junVar.b();
            lun[] lunVarArr = junVar.a;
            int length = lunVarArr.length;
            WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
            for (int i = 0; i < length; i++) {
                mun munVar = (mun) lunVarArr[i];
                WebMessagePort webMessagePort = munVar.a;
                if (webMessagePort == null) {
                    webMessagePort = (WebMessagePort) ((WebkitToCompatConverterBoundaryInterface) cxn.a.a).convertWebMessagePort(Proxy.getInvocationHandler(munVar.b));
                    munVar.a = webMessagePort;
                }
                webMessagePortArr[i] = webMessagePort;
            }
            webView.postWebMessage(new WebMessage(strB, webMessagePortArr), uri);
            return;
        }
        if (!li1Var.a() || ((z = junVar.d) && !(z && axn.e.a()))) {
            throw axn.a();
        }
        Looper webViewLooper = webView.getWebViewLooper();
        if (webViewLooper == Looper.myLooper()) {
            a(webView).a.postMessageToMainFrame(new er3(new iun(junVar)), uri);
            return;
        }
        StringBuilder sb = new StringBuilder("A WebView method was called on thread '");
        sb.append(Thread.currentThread().getName());
        sb.append("'. All WebView methods must be called on the same thread. (Expected Looper ");
        sb.append(webViewLooper);
        sb.append(" called on ");
        sb.append(Looper.myLooper());
        Looper mainLooper = Looper.getMainLooper();
        sb.append(", FYI main Looper is ");
        sb.append(mainLooper);
        sb.append(")");
        throw new RuntimeException(sb.toString());
    }

    public static void prerenderUrlAsync(WebView webView, String str, CancellationSignal cancellationSignal, Executor executor, dwg dwgVar) {
        if (!axn.w.a()) {
            throw axn.a();
        }
        cyn cynVarA = a(webView);
        cynVarA.a.prerenderUrl(str, cancellationSignal, executor, new z4d<>((byte) 3), new z4d<>((byte) 4));
    }

    public static void prerenderUrlAsync(WebView webView, String str, CancellationSignal cancellationSignal, Executor executor, lyj lyjVar, dwg dwgVar) {
        if (!axn.w.a()) {
            throw axn.a();
        }
        cyn cynVarA = a(webView);
        cynVarA.a.prerenderUrl(str, cancellationSignal, executor, new er3(new ioj((byte) 1)), new z4d<>((byte) 1), new z4d<>((byte) 2));
    }

    public static void removeNavigationListener(WebView webView, lke lkeVar) {
        if (!axn.A.a()) {
            throw axn.a();
        }
        cyn cynVarA = a(webView);
        cynVarA.a.removeWebViewNavigationListener(new er3(new mke()));
    }

    public static void removeWebMessageListener(WebView webView, String str) {
        if (!axn.n.a()) {
            throw axn.a();
        }
        a(webView).a.removeWebMessageListener(str);
    }

    public static void saveState(WebView webView, Bundle bundle, int i, boolean z) {
        if (!axn.y.a()) {
            throw axn.a();
        }
        a(webView).a.saveState(bundle, i, z);
    }

    public static void setAudioMuted(WebView webView, boolean z) {
        if (!axn.r.a()) {
            throw axn.a();
        }
        a(webView).a.setAudioMuted(z);
    }

    public static void setDefaultTrafficStatsTag(int i) {
        if (!axn.v.a()) {
            throw axn.a();
        }
        dxn.a.getStatics().setDefaultTrafficStatsTag(i);
    }

    public static void setProfile(WebView webView, String str) {
        if (!axn.q.a()) {
            throw axn.a();
        }
        a(webView).a.setProfile(str);
    }

    public static void setSafeBrowsingAllowlist(Set<String> set, ValueCallback<Boolean> valueCallback) {
        li1 li1Var = axn.c;
        li1 li1Var2 = axn.b;
        if (li1Var.a()) {
            dxn.a.getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        li1Var2.getClass();
        WebView.setSafeBrowsingWhitelist(arrayList, valueCallback);
    }

    @Deprecated
    public static void setSafeBrowsingWhitelist(List<String> list, ValueCallback<Boolean> valueCallback) {
        setSafeBrowsingAllowlist(new HashSet(list), valueCallback);
    }

    @Deprecated
    public static void setWebNavigationClient(WebView webView, nun nunVar) {
        if (!axn.z.a()) {
            throw axn.a();
        }
        cyn cynVarA = a(webView);
        cynVarA.a.setWebViewNavigationClient(new er3(new oun()));
    }

    public static void setWebViewRenderProcessClient(WebView webView, gyn gynVar) {
        axn.j.getClass();
        webView.setWebViewRenderProcessClient(null);
    }

    @SuppressLint({"LambdaLast"})
    public static void setWebViewRenderProcessClient(WebView webView, Executor executor, gyn gynVar) {
        axn.j.getClass();
        webView.setWebViewRenderProcessClient(executor, null);
    }

    @Deprecated
    public static void startSafeBrowsing(Context context, ValueCallback<Boolean> valueCallback) {
        axn.a.getClass();
        WebView.startSafeBrowsing(context, valueCallback);
    }

    public static void startUpWebView(Context context, WebViewStartUpConfig webViewStartUpConfig, WebViewStartUpCallback webViewStartUpCallback) {
        webViewStartUpConfig.getBackgroundExecutor().execute(new h4m(webViewStartUpConfig, webViewStartUpCallback, context, (byte) 9));
    }
}
