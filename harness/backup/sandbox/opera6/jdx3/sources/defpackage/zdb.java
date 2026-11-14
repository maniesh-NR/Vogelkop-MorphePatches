package defpackage;

import J.N;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import com.opera.android.OperaApplication;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.settings.SettingsManager;
import java.net.URISyntaxException;
import org.chromium.base.Callback;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;
import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.NavigationEntry;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;
import org.chromium.url.Origin;

/* loaded from: classes.dex */
public final class zdb extends InterceptNavigationDelegate {
    public final aeb b;
    public WebContents c;
    public bpd d;
    public f53 e;
    public boolean f;
    public boolean g;
    public ig h;
    public d23 i;
    public final boolean j;
    public boolean k;
    public final /* synthetic */ aeb l;

    public zdb(aeb aebVar, aeb aebVar2) {
        this.l = aebVar;
        this.b = aebVar2;
        b(aebVar2.b());
        this.j = aebVar2.a.c() != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0284  */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.app.Activity, dx3] */
    @Override // org.chromium.components.navigation_interception.InterceptNavigationDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(org.chromium.content_public.browser.NavigationHandle r18, org.chromium.url.GURL r19, boolean r20, boolean r21, boolean r22, boolean r23, defpackage.d23 r24) throws java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zdb.a(org.chromium.content_public.browser.NavigationHandle, org.chromium.url.GURL, boolean, boolean, boolean, boolean, d23):void");
    }

    public final void b(WebContents webContents) {
        if (this.c != webContents) {
            while (true) {
                ig igVar = this.h;
                if (igVar == null) {
                    break;
                }
                igVar.b = null;
                this.h = null;
                d23 d23Var = this.i;
                this.i = null;
                d23Var.c(Boolean.FALSE);
            }
            if (this.c != null) {
                f53 f53Var = this.e;
                if (f53Var != null) {
                    f53Var.c((WebContents) null);
                    this.e = null;
                }
                N.Mt_C4q47(this.c);
            }
            this.c = webContents;
            if (webContents == null) {
                return;
            }
            if (this.d == null) {
                this.d = new bpd(new mlf(this.b));
            }
            N.Mjjyc5BV(this, this.c);
            this.e = new f53(this, this.c, (byte) 2);
        }
    }

    public final void c(GURL gurl, tm8 tm8Var) {
        if (tm8Var.o) {
            return;
        }
        ksc kscVar = new ksc(gurl, 0);
        cm cmVar = tm8Var.c;
        if (cmVar != null && !TextUtils.isEmpty(cmVar.c)) {
            kscVar.e = cmVar;
        }
        kscVar.j = tm8Var.q;
        kscVar.b = (Origin) N.MWkeKQbk();
        PostTask.c(7, new wr9((byte) 13, this, kscVar, false));
        this.g = true;
    }

    public final ea6 d(tm8 tm8Var, boolean z) {
        String str = null;
        TraceEvent traceEventN = TraceEvent.n("shouldOverrideUrlLoading", (String) null);
        try {
            WebContents webContentsB = this.b.b();
            ea6 ea6VarX = this.d.X(tm8Var);
            byte b = ea6VarX.b;
            GURL gurl = tm8Var.a;
            ioh.y(b, 8, "Android.TabNavigationInterceptResult.For".concat(z ? "ExternalProtocol" : "InternalProtocol"));
            int i = 3;
            if (b == 3) {
                i = 0;
            } else if (vqm.b(gurl)) {
                i = 2;
            } else if (!vqm.a(gurl)) {
                if ("mdoc".equals(gurl.f())) {
                    str = "ForMdoc";
                    i = 4;
                } else if (gurl.f().endsWith("openid4vp")) {
                    str = "ForOpenId4Vp";
                    i = 5;
                } else if ("openid-credential-offer".equals(gurl.f())) {
                    str = "ForOpenId4Vci";
                    i = 6;
                } else if ("haip-vp".equals(gurl.f())) {
                    str = "ForHaipVp";
                    i = 8;
                } else if ("haip-vci".equals(gurl.f())) {
                    str = "ForHaipVci";
                    i = 9;
                } else {
                    i = 1;
                }
            }
            if (str != null) {
                N.M_6SmRq4(webContentsB, 4948);
                ioh.y(b, 8, "Android.TabNavigationInterceptResult.".concat(str));
            }
            ioh.y(i, 10, "Android.TabNavigationIntercept.Scheme");
            if (traceEventN != null) {
                traceEventN.close();
            }
            return ea6VarX;
        } catch (Throwable th) {
            if (traceEventN != null) {
                try {
                    traceEventN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final int e() {
        aeb aebVar = this.b;
        if (aebVar.b() == null) {
            return -1;
        }
        return aebVar.b().q().t();
    }

    public final boolean f() {
        aeb aebVar = this.b;
        if (aebVar.b() == null) {
            return true;
        }
        NavigationController navigationControllerQ = aebVar.b().q();
        if (navigationControllerQ.d()) {
            return true;
        }
        NavigationEntry navigationEntryI = navigationControllerQ.i(navigationControllerQ.t());
        return navigationEntryI != null && navigationEntryI.e;
    }

    public final boolean g() {
        aeb aebVar = this.b;
        boolean z = false;
        if (aebVar.b() == null) {
            return false;
        }
        if (aebVar.b().p().a.isEmpty()) {
            return true;
        }
        iqh iqhVar = (iqh) aebVar.f.b;
        if (iqhVar == null) {
            return false;
        }
        if (iqhVar != null && iqhVar.a) {
            z = true;
        }
        return !z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(org.chromium.url.GURL r4) throws java.net.URISyntaxException {
        /*
            r3 = this;
            bpd r0 = r3.d
            r0.getClass()
            java.lang.String r0 = r4.g()
            java.lang.String r1 = "wtai://wp/mc;"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L2f
            java.lang.String r0 = r4.g()     // Catch: java.lang.Exception -> L33
            r1 = 1
            android.content.Intent r0 = android.content.Intent.parseUri(r0, r1)     // Catch: java.lang.Exception -> L33
            java.lang.String r1 = r0.getPackage()
            if (r1 != 0) goto L2f
            r1 = 65600(0x10040, float:9.1925E-41)
            java.util.List r0 = qvf.a(r1, r0)
            if (r0 == 0) goto L3e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3e
        L2f:
            r0 = 2132018022(0x7f140366, float:1.9674339E38)
            goto L41
        L33:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r2 = "Bad URI %s"
            java.lang.String.format(r0, r2, r1)
        L3e:
            r0 = 2132022048(0x7f141320, float:1.9682505E38)
        L41:
            aeb r3 = r3.b
            org.chromium.content_public.browser.WebContents r3 = r3.b()
            android.content.Context r1 = t8.a
            java.lang.String r4 = r4.g()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = r1.getString(r0, r4)
            r3.U0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zdb.h(org.chromium.url.GURL):void");
    }

    @Override // org.chromium.components.navigation_interception.InterceptNavigationDelegate
    public final GURL handleSubframeExternalProtocol(GURL gurl, int i, boolean z, Origin origin) throws URISyntaxException {
        bp bpVar = new bp();
        bpVar.a = -2;
        bpVar.d0(i, false, z, e(), f(), true);
        ea6 ea6VarL = l(bpVar, gurl, i, false, z, true, null, false, origin, true, false, new beb(this, (byte) 0), false, false, -1L, false, false);
        byte b = ea6VarL.b;
        if (b == 0) {
            return null;
        }
        if (b == 1) {
            return (GURL) ea6VarL.c;
        }
        if (b == 2) {
            return zs9.a;
        }
        h(gurl);
        return null;
    }

    public final void i(GURL gurl, boolean z) {
        int i;
        aeb aebVar = this.b;
        if (aebVar.b() != null) {
            boolean z2 = false;
            boolean z3 = z && g();
            boolean zD = aebVar.d();
            ioh.y(vqm.a(gurl) ? zD ? 3 : 0 : vqm.b(gurl) ? zD ? 5 : 2 : zD ? 4 : 1, 6, "Android.Intent.MainFrameIntentLaunch");
            if (zD && g()) {
                z2 = true;
            }
            ioh.t("Android.Intent.IntentLaunchFromTabCreation", z2);
            if (z3) {
                PostTask.c(7, new vl9(this, (byte) 5));
                return;
            }
            bp bpVar = aebVar.f;
            if (((iqh) bpVar.b) == null || e() <= (i = bpVar.a)) {
                return;
            }
            PostTask.c(7, new p94(this, i, (byte) 2));
        }
    }

    public final void j(ea6 ea6Var, GURL gurl, boolean z) throws URISyntaxException {
        aeb aebVar = this.b;
        vo7 vo7Var = (vo7) aebVar.c.get();
        byte b = ea6Var.b;
        uo7 uo7Var = vo7Var.h;
        boolean z2 = false;
        if (uo7Var != null) {
            GURL gurl2 = uo7Var.a;
            boolean z3 = b == 0;
            if (z3 && uo7Var.e) {
                if (!uo7Var.f) {
                    c37 c37Var = vo7Var.f;
                    String strG = gurl2.d().g();
                    esk eskVar = (esk) c37Var.a;
                    SettingsManager settingsManager = ((s9g) eskVar.get()).b;
                    lag lagVar = lag.g;
                    ((s9g) eskVar.get()).o(false, strG, lagVar, settingsManager.k(lagVar), true);
                }
                x77 x77Var = vo7Var.g;
                String strG2 = gurl2.g();
                nv6 nv6VarB = ((ru9) ((esk) x77Var.c).get()).b();
                SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB.a;
                editor.putString("dynamic_external_apps.open_in_opera_url", strG2);
                editor.putLong("dynamic_external_apps.open_in_opera_timestamp", System.currentTimeMillis());
                nv6VarB.w();
            }
            vo7Var.d.i(uo7Var.b, z3);
            vo7Var.h = null;
            vo7Var.i = null;
        }
        aebVar.h = null;
        this.h = null;
        if (b == 0) {
            i(gurl, true);
        } else {
            if (b != 1) {
                if (b != 2 && b != 4) {
                    if (z) {
                        h(gurl);
                    }
                }
                d23 d23Var = this.i;
                this.i = null;
                d23Var.c(Boolean.valueOf(z2));
            }
            c((GURL) ea6Var.c, (tm8) ea6Var.d);
        }
        z2 = true;
        d23 d23Var2 = this.i;
        this.i = null;
        d23Var2.c(Boolean.valueOf(z2));
    }

    public final void k(NavigationHandle navigationHandle, GURL gurl, boolean z, boolean z2, boolean z3, boolean z4, d23 d23Var) throws URISyntaxException {
        boolean z5;
        b2l b2lVarF;
        xr5 xr5Var;
        if (!navigationHandle.a) {
            throw new RuntimeException();
        }
        long j = navigationHandle.s;
        aeb aebVar = this.b;
        aebVar.j = j;
        bp bpVar = aebVar.f;
        bpVar.d0(navigationHandle.d, navigationHandle.q, navigationHandle.p, e(), f(), navigationHandle.b);
        boolean z6 = this.j;
        if (!z6 && f() && !navigationHandle.q) {
            d23Var.c(Boolean.FALSE);
            return;
        }
        if (z6) {
            z5 = z3;
        } else {
            if (!aebVar.d() || this.k) {
                d23Var.c(Boolean.FALSE);
                return;
            }
            ig igVar = this.h;
            if (igVar != null) {
                PostTask.b(7, new zr9(this, igVar, (byte) 10), 5000L);
            }
            z5 = true;
        }
        this.i = d23Var;
        int i = navigationHandle.d;
        boolean z7 = navigationHandle.q;
        boolean z8 = navigationHandle.p;
        boolean z9 = navigationHandle.b;
        GURL gurl2 = navigationHandle.f;
        cm cmVar = GURL.i(gurl2) ? null : new cm(gurl2.g(), navigationHandle.g, (byte) 8);
        boolean z10 = navigationHandle.a;
        cm cmVar2 = cmVar;
        Origin origin = navigationHandle.n;
        boolean z11 = navigationHandle.r;
        u59 u59Var = aebVar.b;
        b2l b2lVarF2 = u59Var.F();
        boolean z12 = false;
        if ((b2lVarF2 != null ? ((d7l) b2lVarF2).j.isActive() : ((ChromiumContent) u59Var.b).r) && (b2lVarF = u59Var.F()) != null && ((d7l) b2lVarF).o0() && (xr5Var = aebVar.a.J) != null && xr5Var.getVisibility() == 0) {
            z12 = true;
        }
        ea6 ea6VarL = l(bpVar, gurl, i, z7, z8, z9, cmVar2, z10, origin, z11, z12, new beb(this, (byte) 1), z, z2, navigationHandle.s, z5, z4);
        if (z5) {
            return;
        }
        j(ea6VarL, gurl, navigationHandle.r);
    }

    public final ea6 l(bp bpVar, GURL gurl, int i, boolean z, boolean z2, boolean z3, cm cmVar, boolean z4, Origin origin, boolean z5, boolean z6, Callback callback, boolean z7, boolean z8, long j, boolean z9, boolean z10) {
        boolean zG = g();
        aeb aebVar = this.b;
        ChromiumContent chromiumContent = aebVar.a;
        boolean zA = false;
        boolean z11 = aebVar.b().getVisibility() == 2;
        if (chromiumContent.t) {
            zA = true;
        } else {
            String strA = aebVar.a();
            if (strA == null) {
                strA = aebVar.h;
            }
            if (strA == null) {
                ChromiumContent chromiumContent2 = (ChromiumContent) aebVar.b.b;
                fp1 fp1VarC = chromiumContent2.c();
                String[] strArr = OperaApplication.K;
                ydn ydnVarR = ((OperaApplication) fp1VarC.getApplication()).R();
                if (!ydnVarR.c.isEnabled()) {
                    boolean z12 = chromiumContent2.t;
                    vdn vdnVar = ydnVarR.d;
                    zA = z12 ? vdnVar.a : vdnVar.a();
                }
            }
        }
        boolean zF = f();
        boolean z13 = chromiumContent.u;
        tm8 tm8Var = new tm8(gurl, zA, cmVar, i, z, bpVar, zG, !z11, z6, z4, z2, callback, z3, origin, zF, z7, z8, j, z13, !z13, z10);
        if (!z9) {
            return d(tm8Var, z5);
        }
        ig igVar = new ig(new cda((byte) 1, this, tm8Var, z5), (byte) 15);
        this.h = igVar;
        PostTask.c(7, igVar);
        return null;
    }

    @Override // org.chromium.components.navigation_interception.InterceptNavigationDelegate
    public final void onResourceRequestWithGesture() {
        if (this.h != null) {
            return;
        }
        this.b.f.d0(0, false, true, e(), false, true);
    }

    @Override // org.chromium.components.navigation_interception.InterceptNavigationDelegate
    public final void requestFinishPendingShouldIgnoreCheck() throws Resources.NotFoundException {
        ig igVar = this.h;
        if (igVar == null) {
            return;
        }
        igVar.run();
        ig igVar2 = this.h;
        if (igVar2 != null && igVar2 != null) {
            PostTask.b(7, new zr9(this, igVar2, (byte) 10), 5000L);
        }
        igVar.b = null;
    }
}
