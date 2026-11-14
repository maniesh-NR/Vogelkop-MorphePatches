package defpackage;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.webkit.WebViewCompat;
import com.google.ads.interactivemedia.v3.internal.zzei;
import com.google.ads.interactivemedia.v3.internal.zzpz;
import com.opera.android.custom_views.TabCountButton;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class plk implements ftm, vbn, xk7, o7h, bl, lsp {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;

    public plk(Context context, aoo aooVar, ltm ltmVar) {
        this.a = context;
        this.c = aooVar;
        this.d = ltmVar;
    }

    public plk(Handler handler, WebView webView, Uri uri) {
        this.b = handler;
        this.a = webView;
        webView.setBackgroundColor(0);
        this.d = new zzei();
        webView.getSettings().setMixedContentMode(0);
        webView.getSettings().setJavaScriptEnabled(true);
        if (axn.b("WEB_MESSAGE_LISTENER")) {
            String strV = sko.v(uri.getScheme(), "://", uri.getHost());
            if (uri.getPort() != -1) {
                strV = strV + ":" + uri.getPort();
            }
            WebViewCompat.addWebMessageListener(webView, "androidWebViewCompatSender", zzpz.s(strV), new uto(this, (byte) 4));
        }
        webView.setWebViewClient(new c5d(this, (byte) 6));
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(webView, true);
    }

    public plk(RecyclerView recyclerView, ujn ujnVar, yk7 yk7Var) {
        this.a = recyclerView;
        zk7 zk7Var = new zk7(yk7Var, this);
        this.b = zk7Var;
        recyclerView.m(zk7Var);
        this.c = ujnVar;
    }

    public plk(cvp cvpVar, qop qopVar, Intent intent, Context context) {
        this.d = cvpVar;
        this.a = qopVar;
        this.b = intent;
        this.c = context;
    }

    public plk(gao gaoVar) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = gaoVar;
    }

    public plk(gf4 gf4Var, xc4 xc4Var, zhb zhbVar) {
        this.a = gf4Var;
        this.b = xc4Var;
        this.c = zhbVar;
        this.d = z4c.b(new p7l((Object) this, (byte) 28));
    }

    public /* synthetic */ plk(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public plk(k6l k6lVar, TabCountButton tabCountButton, pde pdeVar) {
        this.a = k6lVar;
        this.b = tabCountButton;
        this.c = pdeVar;
        kze kzeVar = (kze) new z61(tabCountButton).b;
        a26.U(k6lVar, kzeVar, new j3l(this), new dnj(this, (byte) 24));
        a26.T(pdeVar, kzeVar, new qzg(this, (byte) 29));
    }

    public plk(v3m v3mVar, umi umiVar, k32 k32Var) {
        this.c = new ode(new HashSet());
        this.d = new ode(new HashSet());
        this.a = v3mVar;
        xl xlVar = new xl(umiVar, k32Var, new d4m(this, (byte) 0));
        this.b = xlVar;
        xlVar.h();
    }

    public plk(v7n v7nVar, r7n r7nVar, g06 g06Var) {
        this.a = v7nVar;
        this.b = r7nVar;
        this.c = g06Var;
        this.d = new urj((byte) 3);
    }

    public plk(xbf xbfVar, ndc ndcVar, ode odeVar) {
        this.a = ndcVar;
        this.c = odeVar;
        g9l g9lVar = new g9l(xbfVar, (byte) 10);
        this.b = g9lVar;
        this.d = new o2g(ndcVar, (rii) xbfVar.e, odeVar);
        odeVar.j(ndcVar, g9lVar);
    }

    public plk(ydn ydnVar, slk slkVar, db dbVar) {
        olk olkVar = new olk(ydnVar);
        klk klkVar = new klk(dbVar);
        ekc ekcVar = slkVar.b.h;
        h42 h42Var = new h42();
        this.d = h42Var;
        this.a = olkVar;
        this.b = klkVar;
        this.c = ekcVar;
        final byte b = 0;
        h42Var.s(olkVar, new f7f(this) { // from class: jlk
            public final /* synthetic */ plk b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                plk plkVar = this.b;
                switch (b2) {
                    case 0:
                        plkVar.v();
                        break;
                    case 1:
                        plkVar.v();
                        break;
                    default:
                        plkVar.v();
                        break;
                }
            }
        });
        final byte b2 = 1;
        h42Var.s(klkVar, new f7f(this) { // from class: jlk
            public final /* synthetic */ plk b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                plk plkVar = this.b;
                switch (b22) {
                    case 0:
                        plkVar.v();
                        break;
                    case 1:
                        plkVar.v();
                        break;
                    default:
                        plkVar.v();
                        break;
                }
            }
        });
        final byte b3 = 2;
        h42Var.s(ekcVar, new f7f(this) { // from class: jlk
            public final /* synthetic */ plk b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b3;
                plk plkVar = this.b;
                switch (b22) {
                    case 0:
                        plkVar.v();
                        break;
                    case 1:
                        plkVar.v();
                        break;
                    default:
                        plkVar.v();
                        break;
                }
            }
        });
    }

    @Override // defpackage.bl
    public final boolean a(String str) {
        Context context = (Context) this.a;
        try {
            if (str != null && "play.google.com".equals(Uri.parse(str).getHost()) && sjo.l(context, "com.android.vending")) {
                Intent intent = new Intent("android.intent.action.VIEW");
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setData(Uri.parse(str));
                intent.setPackage("com.android.vending");
                context.startActivity(intent);
            } else if (n5p.c(str)) {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                if (n5p.b(context, intent2)) {
                    f(intent2);
                    return true;
                }
            } else {
                if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str) || URLUtil.isAboutUrl(str) || URLUtil.isFileUrl(str) || URLUtil.isDataUrl(str)) {
                    i0p i0pVar = new i0p(context);
                    WebSettings settings = i0pVar.getSettings();
                    settings.setSupportMultipleWindows(false);
                    settings.setJavaScriptEnabled(true);
                    settings.setJavaScriptCanOpenWindowsAutomatically(false);
                    settings.setBlockNetworkImage(true);
                    settings.setGeolocationEnabled(false);
                    settings.setAllowContentAccess(false);
                    settings.setAllowFileAccess(false);
                    ltm ltmVar = (ltm) this.d;
                    if (ltmVar != null) {
                        settings.getUserAgentString();
                        settings.setUserAgentString(ltmVar.k());
                    }
                    i0pVar.setWebViewClient(new c5d(this, (byte) 2));
                    i0pVar.loadUrl(str);
                    CookieManager.getInstance().setAcceptThirdPartyCookies(i0pVar, true);
                    return true;
                }
                f(Intent.parseUri(str, 1));
            }
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // defpackage.xk7
    public final boolean b(int i) {
        String str = (String) this.d;
        return str != null && str.equals(((mkb) ((ArrayList) ((ujn) this.c).d).get(i)).a());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(pv r7, mt5 r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.d
            zyk r0 = (zyk) r0
            boolean r1 = r8 instanceof defpackage.gtm
            if (r1 == 0) goto L17
            r1 = r8
            gtm r1 = (defpackage.gtm) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.v = r2
            goto L1e
        L17:
            gtm r1 = new gtm
            nt5 r8 = (nt5) r8
            r1.<init>(r6, r8)
        L1e:
            java.lang.Object r8 = r1.t
            px5 r2 = px5.a
            int r3 = r1.v
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L34
            if (r3 != r5) goto L2e
            ybh.y(r8)
            goto L58
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r6)
            return r4
        L34:
            ybh.y(r8)
            java.lang.Object r8 = r0.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r8.getClass()
            java.lang.Object r8 = r0.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L4f
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L4f:
            r1.v = r5
            java.lang.Object r8 = r7.invoke(r1)
            if (r8 != r2) goto L58
            return r2
        L58:
            x61 r8 = (x61) r8
            if (r8 != 0) goto L5f
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L5f:
            android.hardware.camera2.CaptureResult$Key r7 = android.hardware.camera2.CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID
            java.lang.Object r7 = r8.c(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto Lb6
            java.lang.Object r8 = r6.b
            xc4 r8 = (xc4) r8
            sd4.a(r7)
            t94 r8 = r8.d()
            fb4 r8 = r8.c
            ge4 r7 = r8.a(r7)
            java.lang.Object r6 = r6.c
            zhb r6 = (zhb) r6
            r6.getClass()
            int r6 = r6.b(r7)     // Catch: java.lang.Exception -> La2
            float r6 = (float) r6
            float r8 = zhb.c(r7)     // Catch: java.lang.Exception -> L99
            float r7 = zhb.d(r7)     // Catch: java.lang.Exception -> L99
            int r7 = zhb.a(r8, r7)     // Catch: java.lang.Exception -> L99
            float r7 = (float) r7
            float r6 = r6 / r7
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch: java.lang.Exception -> La2
            goto La3
        L99:
            r6 = move-exception
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> La2
            java.lang.String r8 = "Failed to get a valid view angle"
            r7.<init>(r8, r6)     // Catch: java.lang.Exception -> La2
            throw r7     // Catch: java.lang.Exception -> La2
        La2:
            r6 = r4
        La3:
            if (r6 == 0) goto Lb6
            float r6 = r6.floatValue()
            r7 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto Lb1
            r6 = r5
            goto Lb2
        Lb1:
            r6 = 0
        Lb2:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
        Lb6:
            if (r4 == 0) goto Lbc
            boolean r5 = r4.booleanValue()
        Lbc:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.plk.c(pv, mt5):java.lang.Object");
    }

    public final boolean d() {
        return !((Boolean) ((zyk) this.d).getValue()).booleanValue();
    }

    @Override // defpackage.vbn
    public final void destroy() {
        o2g o2gVar = (o2g) this.d;
        ((ode) o2gVar.d).p(o2gVar);
        ((ode) this.c).p((g9l) this.b);
    }

    @Override // defpackage.bl
    public final boolean e(String str, String str2) {
        List list = sjo.a;
        Context context = (Context) phf.a.a;
        try {
            if (nb6.h(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                try {
                    Uri uri = Uri.parse(str);
                    DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
                    if (downloadManager != null) {
                        DownloadManager.Request request = new DownloadManager.Request(uri);
                        String strI = sjo.i(str);
                        if (!TextUtils.isEmpty(strI)) {
                            str2 = strI;
                        }
                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
                        request.setMimeType("application/vnd.android.package-archive");
                        request.setVisibleInDownloadsUi(true);
                        request.allowScanningByMediaScanner();
                        request.setTitle("Downloading " + str2);
                        sjo.h("reference", downloadManager.enqueue(request));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    e.getMessage();
                }
            }
        } catch (RuntimeException unused) {
        }
        aoo aooVar = (aoo) this.c;
        if (aooVar != null) {
            aooVar.m();
        }
        return true;
    }

    public final void f(Intent intent) {
        View view = (View) this.b;
        Activity activityE = view != null ? upj.e(view) : null;
        if (activityE != null) {
            activityE.startActivity(intent);
        } else {
            intent.addFlags(268435456);
            ((Context) this.a).startActivity(intent);
        }
    }

    public final boolean g(String str) throws URISyntaxException {
        try {
            Intent uri = Intent.parseUri(str, 1);
            if (!n5p.e(str) || !n5p.b((Context) this.a, uri)) {
                return false;
            }
            f(uri);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final Object get() {
        return new t9l((Executor) ((o7h) this.a).get(), (ydi) ((o7h) this.b).get(), (x77) ((shf) this.c).get(), (ydi) ((o7h) this.d).get());
    }

    @Override // defpackage.bl
    public final boolean h(String str) {
        return g(str);
    }

    @Override // defpackage.vbn
    public final boolean i(ndc ndcVar, ode odeVar) {
        return Intrinsics.a((ndc) this.a, ndcVar) && Intrinsics.a((ode) this.c, odeVar);
    }

    @Override // defpackage.vbn
    public final o2g j() {
        return (o2g) this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #0 {Exception -> 0x0039, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000f, B:9:0x0027, B:11:0x002b), top: B:14:0x0001 }] */
    @Override // defpackage.bl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 1
            java.lang.Object r1 = r4.b     // Catch: java.lang.Exception -> L39
            android.view.View r1 = (android.view.View) r1     // Catch: java.lang.Exception -> L39
            if (r1 == 0) goto L2b
            java.util.WeakHashMap r2 = r5n.a     // Catch: java.lang.Exception -> L39
            boolean r1 = r1.isAttachedToWindow()     // Catch: java.lang.Exception -> L39
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r4.a     // Catch: java.lang.Exception -> L39
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Exception -> L39
            java.lang.Object r2 = r4.b     // Catch: java.lang.Exception -> L39
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Exception -> L39
            java.lang.Object r3 = r4.d     // Catch: java.lang.Exception -> L39
            ltm r3 = (defpackage.ltm) r3     // Catch: java.lang.Exception -> L39
            t2p r5 = defpackage.t2p.b(r1, r5, r2, r3)     // Catch: java.lang.Exception -> L39
            java.lang.Object r4 = r4.c     // Catch: java.lang.Exception -> L39
            aoo r4 = (defpackage.aoo) r4     // Catch: java.lang.Exception -> L39
            r5.i = r4     // Catch: java.lang.Exception -> L39
            if (r4 == 0) goto L39
            r4.n()     // Catch: java.lang.Exception -> L39
            return r0
        L2b:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.Exception -> L39
            r1.<init>(r2, r5)     // Catch: java.lang.Exception -> L39
            r4.f(r1)     // Catch: java.lang.Exception -> L39
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.plk.k(java.lang.String):boolean");
    }

    public final oml l() {
        eyi eyiVar = (eyi) this.c;
        if (!eyiVar.b) {
            ynh.h(this);
            eyiVar.b = true;
        }
        return ((nml) eyiVar.d).a(eyiVar.c);
    }

    public final p1j m(qie qieVar) {
        eyi eyiVar = (eyi) this.c;
        if (!eyiVar.b) {
            ynh.h(this);
            eyiVar.b = true;
        }
        Object obj = eyiVar.c;
        nml nmlVar = (nml) eyiVar.d;
        nmlVar.getClass();
        return qieVar.n(new oml(nmlVar), obj);
    }

    public final l7n n(s15 s15Var, String str) {
        l7n l7nVar;
        l7n l7nVarC;
        synchronized (((urj) this.d)) {
            l7nVar = (l7n) ((v7n) this.a).a.get(str);
            if (s15Var.e(l7nVar)) {
                Object obj = (r7n) this.b;
                if (obj instanceof t7n) {
                    ((t7n) obj).d(l7nVar);
                }
            } else {
                dde ddeVar = new dde((g06) this.c);
                ddeVar.a(u7n.a, str);
                r7n r7nVar = (r7n) this.b;
                try {
                    try {
                        l7nVarC = r7nVar.b(s15Var, ddeVar);
                    } catch (AbstractMethodError unused) {
                        l7nVarC = r7nVar.a(s15Var.a, ddeVar);
                    }
                } catch (AbstractMethodError unused2) {
                    l7nVarC = r7nVar.c(s15Var.a);
                }
                l7nVar = l7nVarC;
                l7n l7nVar2 = (l7n) ((v7n) this.a).a.put(str, l7nVar);
                if (l7nVar2 != null) {
                    l7nVar2.c();
                }
            }
        }
        return l7nVar;
    }

    public final void p(List list) {
        Set setC = v3m.c(((v3m) this.a).a);
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j0c j0cVar = (j0c) it.next();
            String str = j0cVar.a;
            int i = j0cVar.b;
            szb szbVarD = szb.d(0, str);
            i0c i0cVar = szbVarD == null ? null : new i0c(szbVarD, i);
            if (i0cVar != null && setC.contains(i0cVar.a)) {
                hashSet.add(i0cVar);
            }
        }
        ((ode) this.c).n(hashSet);
    }

    public final void q(long j) {
        eyi eyiVar = (eyi) this.c;
        if (!eyiVar.b) {
            ynh.h(this);
            eyiVar.b = true;
        }
        nml nmlVar = (nml) eyiVar.d;
        nmlVar.getClass();
        coh.k(new oml(nmlVar), eyiVar.c, j);
    }

    public final void r(String str) {
        if (Objects.equals((String) this.d, str)) {
            return;
        }
        this.d = str;
        ((RecyclerView) this.a).a0();
        zk7 zk7Var = (zk7) this.b;
        Drawable drawable = zk7Var.c;
        if (drawable == null || !drawable.isVisible()) {
            return;
        }
        zk7Var.c.setVisible(false, true);
        zk7Var.c.setVisible(true, true);
    }

    public final void s(ArrayList arrayList) {
        xl xlVar = (xl) this.b;
        ((nrl) xlVar.l).d(new jbd(xlVar, arrayList, new d4m(this, (byte) 2), (byte) 29));
    }

    public final plk t(Function1 function1) {
        eek eekVar = new eek((Object) this, (Object) function1, (byte) 18);
        eyi eyiVar = (eyi) this.c;
        if (!eyiVar.b) {
            return new plk((tcl) this.a, (nml) eekVar.invoke(), eyiVar, this);
        }
        qp2.n("");
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, com.opera.android.custom_views.TabCountButton] */
    public final void u() {
        int iS = ((k6l) this.a).s(((Number) ((pde) this.c).g()).floatValue() > 0.5f ? p6l.b : p6l.a);
        ?? r1 = (TabCountButton) this.b;
        Integer num = (Integer) this.d;
        if (num == null || iS != num.intValue()) {
            this.d = Integer.valueOf(iS);
            r1.k.a(iS);
            r1.setContentDescription(String.valueOf(iS));
        }
    }

    public final void v() {
        olk olkVar = (olk) this.a;
        h42 h42Var = (h42) this.d;
        Boolean bool = (Boolean) ((klk) this.b).g();
        if (bool == null) {
            return;
        }
        eb8 eb8Var = (eb8) ((ode) this.c).g();
        if (eb8Var == null) {
            h42Var.r(new llk((mlk) olkVar.g(), bool.booleanValue(), false));
            return;
        }
        if (!eb8Var.b) {
            eb8Var.b = true;
            h42Var.r(new llk((mlk) olkVar.g(), bool.booleanValue(), true));
        } else {
            mlk mlkVar = (mlk) olkVar.g();
            boolean zBooleanValue = bool.booleanValue();
            llk llkVar = (llk) h42Var.g();
            if (llkVar == null) {
                llkVar = new llk(new mlk(false, false), false, false);
            }
            h42Var.r(new llk(mlkVar, zBooleanValue, llkVar.c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 1890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.plk.w(java.lang.String, java.lang.String):void");
    }

    @Override // defpackage.lsp
    public final void zza() {
        cvp cvpVar = (cvp) this.d;
        cvpVar.g.post(new avp(cvpVar, (qop) this.a, 5, 0));
    }

    @Override // defpackage.lsp
    public final void zzb(int i) {
        cvp cvpVar = (cvp) this.d;
        cvpVar.g.post(new avp(cvpVar, (qop) this.a, 6, i));
    }

    @Override // defpackage.lsp
    public final void zzc() {
        Intent intent = (Intent) this.b;
        if (intent.getBooleanExtra("triggered_from_app_after_verification", false)) {
            ((cvp) this.d).a.b("Splits copied and verified more than once.", new Object[0]);
        } else {
            intent.putExtra("triggered_from_app_after_verification", true);
            ((Context) this.c).sendBroadcast(intent);
        }
    }
}
