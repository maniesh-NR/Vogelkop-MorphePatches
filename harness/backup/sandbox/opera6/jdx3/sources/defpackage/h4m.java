package defpackage;

import ads_mobile_sdk.ia3;
import ads_mobile_sdk.k43;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewCompat$WebViewStartUpCallback;
import androidx.webkit.WebViewStartUpConfig;
import com.google.common.util.concurrent.ListenableFuture;
import com.leanplum.utils.SizeUtil;
import com.opera.ads.internal.fullscreenad.AdActivity;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class h4m implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h4m(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ h4m(s14 s14Var, ilm ilmVar, ArrayList arrayList) {
        this.a = (byte) 7;
        this.b = s14Var;
        this.d = ilmVar;
        this.c = arrayList;
    }

    public /* synthetic */ h4m(yoo yooVar, Context context, i06 i06Var, vm vmVar) {
        this.a = (byte) 12;
        this.b = yooVar;
        this.c = context;
        this.d = vmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    @Override // java.lang.Runnable
    public final void run() {
        Unit unit;
        cm cmVar;
        Integer numValueOf;
        Exception exc;
        Throwable th;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        Long lValueOf;
        vho vhoVar;
        CoroutineContext coroutineContext;
        ulp ulpVar;
        byte b = 2;
        byte b2 = 1;
        HttpURLConnection httpURLConnection3 = null;
        ?? r3 = 0;
        switch (this.a) {
            case 0:
                xl xlVar = (xl) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                d4m d4mVar = (d4m) this.d;
                xlVar.g(new g4m(arrayList, ((g4m) xlVar.k).b));
                xlVar.k = new g4m(arrayList, ((g4m) xlVar.k).b);
                d4mVar.run(arrayList);
                return;
            case 1:
                r4m r4mVar = (r4m) this.b;
                yqa yqaVar = (yqa) this.c;
                b2l b2lVar = (b2l) this.d;
                b0c b0cVar = r4mVar.c;
                b0cVar.H0(yqaVar != null ? (szb) yqaVar.c : null, true);
                if (r4mVar.k == 1) {
                    v3m v3mVar = r4mVar.g;
                    if (!v3m.f(v3mVar.a) || (b0cVar.d == 2 && v3mVar.g() && v3mVar.b.i("translate_web_pages_backup_translation_method_enabled"))) {
                        r4mVar.c0(new o4m(r4mVar, (byte) 5));
                        r4mVar.k = (byte) 0;
                        r4mVar.a0();
                        return;
                    }
                }
                if (!((d5m) r4mVar.d.h.g()).b() && !r4mVar.X(b2lVar, r4mVar.k)) {
                    r4mVar.e.J0(false);
                }
                r4mVar.Z(b2lVar, r4mVar.k);
                r4mVar.k = (byte) 0;
                r4mVar.a0();
                return;
            case 2:
                pmm pmmVar = (pmm) this.b;
                odf odfVar = (odf) this.c;
                Object obj = this.d;
                pmmVar.getClass();
                odfVar.getClass();
                lyg lygVar = (lyg) obj;
                lygVar.a.t.c(lygVar);
                lygVar.e();
                return;
            case 3:
                ListenableFuture listenableFuture = (ListenableFuture) this.b;
                c5j c5jVar = (c5j) this.c;
                try {
                    try {
                        c5jVar.setFuture(((dd2) this.d).apply(yr9.a(listenableFuture)));
                        return;
                    } catch (Throwable th2) {
                        c5jVar.setException(th2);
                        return;
                    }
                } catch (Error | RuntimeException e) {
                    c5jVar.setException(e);
                    return;
                } catch (CancellationException unused) {
                    c5jVar.cancel(false);
                    return;
                } catch (ExecutionException e2) {
                    Throwable th3 = e2;
                    Throwable cause = th3.getCause();
                    if (cause != null) {
                        th3 = cause;
                    }
                    c5jVar.setException(th3);
                    return;
                }
            case 4:
                c5j c5jVar2 = (c5j) this.b;
                zr9 zr9Var = (zr9) this.c;
                e4j e4jVar = (e4j) this.d;
                try {
                    if (c5jVar2.isCancelled()) {
                        return;
                    }
                    zr9Var.run();
                    c5jVar2.set(e4jVar);
                    return;
                } catch (Throwable th4) {
                    c5jVar2.setException(th4);
                    return;
                }
            case 5:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                q3j q3jVar = (q3j) this.c;
                t2n t2nVar = (t2n) this.d;
                jpo.n("Surface update cancellation should only occur on main thread.", xug.n());
                atomicBoolean.set(true);
                ((ArrayList) ((p3j) q3jVar).b.e).remove(t2nVar);
                ((p3j) q3jVar).e.remove(t2nVar);
                return;
            case 6:
                vq8 vq8Var = (vq8) this.b;
                lt2 lt2Var = (lt2) this.c;
                String str = (String) this.d;
                if (vq8Var.a) {
                    lt2Var.run(null);
                    return;
                } else {
                    vq8Var.k(str, lt2Var);
                    return;
                }
            case 7:
                s14 s14Var = (s14) this.b;
                ((umi) s14Var.d).f(new vdi(s14Var, (ilm) this.d, (ArrayList) this.c)).a(null);
                return;
            case 8:
                qln qlnVar = (qln) this.b;
                orm ormVar = (orm) this.c;
                eej eejVar = (eej) this.d;
                ami amiVar = qlnVar.f;
                if (((vq8) amiVar.e).i() && zg.e == null) {
                    if (!((vq8) amiVar.e).i()) {
                        amiVar.r(new h4m((Object) qlnVar, (Object) ormVar, (Object) eejVar, (byte) 8));
                        return;
                    }
                    urj urjVar = new urj((byte) 9);
                    eejVar.getClass();
                    og5 og5Var = new og5(new zg(qlnVar), urjVar);
                    nej nejVar = eejVar.a;
                    nejVar.getClass();
                    nejVar.b(og5Var, ijm.b);
                    zg.e = og5Var;
                    return;
                }
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                WebViewStartUpConfig webViewStartUpConfig = (WebViewStartUpConfig) this.b;
                WebViewCompat$WebViewStartUpCallback webViewCompat$WebViewStartUpCallback = (WebViewCompat$WebViewStartUpCallback) this.c;
                Context context = (Context) this.d;
                Uri uri = WebViewCompat.a;
                WebView.getWebViewClassLoader();
                if (axn.t.a()) {
                    dxn.a.a(webViewStartUpConfig, new r2n((Object) webViewCompat$WebViewStartUpCallback, (byte) 19));
                    return;
                }
                if (webViewStartUpConfig.shouldRunUiThreadStartUpTasks()) {
                    WebSettings.getDefaultUserAgent(context.getApplicationContext());
                }
                new Handler(Looper.getMainLooper()).post(new ttn(webViewCompat$WebViewStartUpCallback, b));
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((t1h) ((wzg) this.b).b).f((w8k) this.c, (d7h) this.d);
                return;
            case 11:
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.b;
                l94 l94Var = (l94) this.c;
                Function0 function0 = (Function0) this.d;
                if (atomicBoolean2.get()) {
                    return;
                }
                try {
                    l94Var.b(function0.invoke());
                    return;
                } catch (Throwable th5) {
                    l94Var.d(th5);
                    return;
                }
            case 12:
                yoo yooVar = (yoo) this.b;
                Context context2 = (Context) this.c;
                vm vmVar = (vm) this.d;
                woo troVar = vmVar instanceof idf ? new tro(vmVar, (idf) vmVar) : new woo(vmVar);
                ((pro) yooVar.b.a).b.getClass();
                voo vooVar = yooVar.d;
                p7p p7pVar = yooVar.i;
                Pair pair = (vooVar == null || p7pVar == null) ? null : new Pair(vooVar, p7pVar);
                if (pair != null) {
                    ylp ylpVar = (ylp) pair.a;
                    p7p p7pVar2 = (p7p) pair.b;
                    if (!fko.c) {
                        LinkedHashSet linkedHashSet = p7p.c;
                        p7pVar2.g(1008, null);
                        cmVar = new cm(102, "App Not foreground.", (byte) 0);
                        troVar.C(cmVar);
                        return;
                    }
                    uro uroVarD = ocp.d(ylpVar);
                    mmo mmoVar = new mmo(yooVar, b2);
                    uroVarD.a = ylpVar;
                    uroVarD.b = p7pVar2;
                    uroVarD.c = troVar;
                    uroVarD.d = mmoVar;
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    if (!(context2 instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    intent.putExtra("extra_ad_format", ylpVar.b.b);
                    eio eioVar = ylpVar.E;
                    if (eioVar != null) {
                        int i = eioVar.a;
                        if (i != 0 && i == 1) {
                            b2 = 0;
                        }
                        numValueOf = Integer.valueOf(b2);
                    } else {
                        numValueOf = null;
                    }
                    intent.putExtra("extra_orientation", numValueOf);
                    intent.setClass(context2, AdActivity.class);
                    try {
                        context2.startActivity(intent);
                        p7pVar2.f();
                        unit = Unit.a;
                    } catch (Exception e3) {
                        uro uroVarD2 = ocp.d(ylpVar);
                        uroVarD2.a = null;
                        uroVarD2.b = null;
                        uroVarD2.c = null;
                        uroVarD2.d = null;
                        p7pVar2.g(1009, e3.getMessage());
                        String message = e3.getMessage();
                        if (message == null) {
                            message = "Failed to start activity.";
                        }
                        troVar.C(new cm(104, message, (byte) 0));
                        return;
                    }
                } else {
                    unit = null;
                }
                if (unit == null) {
                    p7p p7pVar3 = yooVar.i;
                    if (p7pVar3 != null) {
                        LinkedHashSet linkedHashSet2 = p7p.c;
                        p7pVar3.g(9108, null);
                    }
                    cmVar = new cm(-1, "Unknown error!", (byte) 0);
                    troVar.C(cmVar);
                    return;
                }
                return;
            case 13:
                String str2 = (String) this.b;
                h9o h9oVar = (h9o) this.c;
                g94 g94Var = (g94) this.d;
                try {
                    try {
                        httpURLConnection2 = (HttpURLConnection) new URL(str2).openConnection();
                    } catch (Throwable th6) {
                        th = th6;
                        httpURLConnection = r3;
                    }
                } catch (Exception e4) {
                    exc = e4;
                }
                try {
                    httpURLConnection2.setRequestMethod("HEAD");
                    switch (h9oVar.a) {
                        case SizeUtil.textSize1 /* 22 */:
                            lValueOf = Long.valueOf(httpURLConnection2.getContentLengthLong());
                            break;
                        default:
                            lValueOf = Long.valueOf(httpURLConnection2.getLastModified());
                            break;
                    }
                    r3 = 17;
                    gxo.c(new fmn((Object) g94Var, (Object) lValueOf, (byte) 17));
                    httpURLConnection2.disconnect();
                } catch (Exception e5) {
                    exc = e5;
                    httpURLConnection3 = httpURLConnection2;
                    exc.getMessage();
                    r3 = httpURLConnection3;
                    if (httpURLConnection3 != null) {
                        httpURLConnection3.disconnect();
                        r3 = httpURLConnection3;
                    }
                    return;
                } catch (Throwable th7) {
                    th = th7;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection == null) {
                        throw th;
                    }
                    httpURLConnection.disconnect();
                    throw th;
                }
                return;
            case 14:
                qio qioVar = (qio) this.b;
                String str3 = (String) this.c;
                File file = (File) this.d;
                qioVar.getClass();
                boolean z = qioVar instanceof lio;
                if (!z && (vhoVar = (vho) ((mio) qioVar).a) != null && str3.equals(vhoVar.e.a)) {
                    file.delete();
                    sjo.n().remove(vtp.r(str3)).apply();
                    sjo.n().remove(vtp.k(str3)).apply();
                }
                if (z) {
                    String str4 = ((zno) ((lio) qioVar).a).a.c;
                    return;
                }
                return;
            case 15:
                k43 k43Var = (k43) this.b;
                HashMap map = (HashMap) this.c;
                Context context3 = (Context) this.d;
                ia3 ia3Var = k43Var.f;
                ia3Var.getClass();
                HashMap map2 = new HashMap();
                Iterator it = ia3Var.a.iterator();
                while (it.hasNext()) {
                    ((opo) it.next()).a(map2);
                }
                map.putAll(map2);
                k43Var.a(map);
                map.put("f", "q");
                map.put("ctx", context3);
                return;
            default:
                ypi ypiVar = (ypi) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                r2p r2pVar = (r2p) this.d;
                try {
                    p0i p0iVar = t0i.b;
                    coroutineContext = w2p.a.b;
                    ulpVar = ulp.h;
                } catch (Throwable unused2) {
                    p0i p0iVar2 = t0i.b;
                }
                if (coroutineContext.get(ulpVar) == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                unb unbVar = w2p.b.b.get(ulpVar);
                if (unbVar == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                na2.B(w2p.a, (CoroutineContext) null, (rx5) null, new k54(ypiVar, arrayList2, r2pVar, (mt5) null, (byte) 13, false), 3);
                return;
        }
    }
}
