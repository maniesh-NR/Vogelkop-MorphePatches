package com.opera.android.browser.chromium;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.SecurityInfo;
import com.opera.android.browser.UrlMangler;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.browser.dialog.DialogDelegate;
import com.opera.api.Callback;
import defpackage.ard;
import defpackage.az4;
import defpackage.bz4;
import defpackage.cm;
import defpackage.cz4;
import defpackage.dx3;
import defpackage.dz4;
import defpackage.eej;
import defpackage.ez4;
import defpackage.fz4;
import defpackage.g1j;
import defpackage.g7f;
import defpackage.gz4;
import defpackage.h1a;
import defpackage.h42;
import defpackage.h7f;
import defpackage.i7f;
import defpackage.ipk;
import defpackage.iwi;
import defpackage.iz4;
import defpackage.j5m;
import defpackage.jv0;
import defpackage.jwi;
import defpackage.jz4;
import defpackage.kwi;
import defpackage.kze;
import defpackage.l2g;
import defpackage.lqm;
import defpackage.lsc;
import defpackage.lyg;
import defpackage.mwi;
import defpackage.np1;
import defpackage.ns5;
import defpackage.nwi;
import defpackage.o2g;
import defpackage.ole;
import defpackage.pt3;
import defpackage.qp2;
import defpackage.qq6;
import defpackage.qy4;
import defpackage.r4h;
import defpackage.t59;
import defpackage.ty3;
import defpackage.u59;
import defpackage.vml;
import defpackage.vz5;
import defpackage.wln;
import defpackage.wqm;
import defpackage.wx;
import defpackage.x5f;
import defpackage.xbf;
import defpackage.ype;
import defpackage.yqa;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import org.chromium.components.autofill.AutofillProvider;
import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.content.browser.RenderWidgetHostViewImpl;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.WebContents;
import org.chromium.content_public.common.ResourceRequestBody;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class ChromiumContent extends WebContentsWrapper {
    public static final GURL V = new GURL("about:blank");
    public static final fr W = new fr();
    public zg A;
    public int B;
    public final h7f C;
    public int D;
    public int E;
    public x5f F;
    public eej G;
    public final np1 H;
    public final HashSet I;
    public xr5 J;
    public pt3 K;
    public d7h L;
    public final t59 M;
    public gz4 N;
    public int O;
    public yqa P;
    public yqa Q;
    public vz5 R;
    public boolean S;
    public AutofillProvider T;
    public int U;
    public int l;
    public ez4 m;
    public long n;
    public final jz4 o;
    public DialogDelegate p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public boolean w;
    public OperaWebContentsDelegate x;
    public fz4 y;
    public ard z;

    public ChromiumContent(jz4 jz4Var, qi qiVar, WebContents webContents, boolean z, boolean z2, int i) {
        super(qiVar);
        fr frVar = W;
        int i2 = frVar.c + 1;
        frVar.c = i2;
        this.l = fr.k(fr.k(i2) ^ frVar.b);
        this.q = true;
        this.v = -1;
        this.C = new h7f();
        this.D = 1;
        this.E = 0;
        this.H = new np1(this);
        this.I = new HashSet();
        this.M = new t59((byte) 5);
        this.o = jz4Var;
        this.t = z;
        this.u = z2;
        long jMIJLdULo = N.MIJLdULo(this, webContents, ((z ? 0 : 13) | (z2 ? 0 : 18)) & (~i));
        this.n = jMIJLdULo;
        long jM$rBGBlo = N.M$rBGBlo(jMIJLdULo);
        this.a = jM$rBGBlo;
        if (jM$rBGBlo != 0) {
            return;
        }
        qp2.n("Failed to create a native instance.");
        throw null;
    }

    public static void callRequestPageCaptureCallback(@NonNull Callback callback, @NonNull String str) {
        callback.run(str);
    }

    @NonNull
    public static SecurityInfo createInsecureSecurityInfo(int i) {
        if (i != 0 && i == 2) {
            return new iwi();
        }
        return new mwi();
    }

    @NonNull
    public static SSLError createSSLError(int i, long j, long j2, long j3) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case SizeUtil.textSize0_1 /* 18 */:
            case 19:
            case SizeUtil.textSize0 /* 20 */:
                return new SSLError(i, j, j2, j3);
            case 12:
            default:
                return new SSLError(11, -1L, -1L, -1L);
        }
    }

    @NonNull
    public static SecurityInfo createSecurityInfo(int i, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, boolean z, boolean z2, @Nullable String str5, @Nullable SSLError sSLError, @NonNull byte[][] bArr, boolean z3, @Nullable String str6, @Nullable byte[][] bArr2) {
        if (i == 1) {
            return new kwi(str, str3, str4, z, z2, str5, bArr, str2, z3, str6, bArr2);
        }
        if (i != 3) {
            return new mwi();
        }
        return new jwi(str, str3, str4, z, z2, str5, bArr, sSLError == null ? new SSLError(11, -1L, -1L, -1L) : sSLError, z3, str6, bArr2);
    }

    public static void onScreenshotFinished(@NonNull Callback callback, @Nullable Bitmap bitmap) {
        callback.run(bitmap);
    }

    public final void A(int i) {
        if (this.U == i || h()) {
            return;
        }
        this.U = i;
        RenderWidgetHostViewImpl renderWidgetHostViewImplR = e().r();
        if (renderWidgetHostViewImplR != null) {
            renderWidgetHostViewImplR.a();
            N.Myd8R_Wn(renderWidgetHostViewImplR.a);
        }
    }

    public final void B() {
        if (this.s) {
            this.s = false;
            WebContents webContentsF = f();
            if (webContentsF != null) {
                webContentsF.q().a();
                webContentsF.q().u();
            }
        }
        if (this.q) {
            this.q = false;
            e().y1(2);
        }
    }

    @Override // com.opera.android.browser.WebContentsWrapper
    public final ViewAndroidDelegate a(xr5 xr5Var) {
        this.J = xr5Var;
        jpf jpfVar = new jpf(xr5Var);
        jpfVar.h = this;
        return jpfVar;
    }

    public final void activeNavigationEntryChanged() {
        h7f h7fVar = this.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).getClass();
        }
    }

    @NonNull
    public final String buildReaderModeUrl(@NonNull String str, @NonNull String str2) {
        String string = c().getString(2132020640);
        UrlMangler.Builder builder = new UrlMangler.Builder("readermode", new Uri.Builder().scheme("opera-distiller").authority("readermode").path(str2).appendQueryParameter("ext_url", str).build().toString());
        builder.externalUrl(str);
        builder.displayString(string);
        return builder.build();
    }

    public final void didUpdateAudioMutingState(boolean z) {
        h7f h7fVar = this.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).d(z);
        }
    }

    public final void findReply(int i, int i2, int i3) {
        h7f h7fVar = this.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).t(i, i2, i3);
        }
    }

    public final void focus() {
        this.m.d();
    }

    @Nullable
    public final DialogDelegate getDialogDelegate() {
        return this.p;
    }

    public final int getDisplayMode() {
        int i = this.D;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final boolean getLimitAdTracking() {
        return this.o.D();
    }

    public final boolean getPictureInPictureEnabled() {
        return rm5.D(t8.a);
    }

    public final void k(iz4 iz4Var) {
        this.C.b(iz4Var);
    }

    public final void l() {
        if (this.n == 0) {
            return;
        }
        if (this.r) {
            e().z1();
            s();
            e().v1(0);
            this.r = false;
        }
        h7f h7fVar = this.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).j(this);
        }
        h7fVar.clear();
        ard ardVar = this.z;
        ardVar.a();
        ardVar.c();
        ardVar.c = null;
        ardVar.d = null;
        ardVar.b = null;
        this.o.o(this);
        AutofillProvider autofillProvider = this.T;
        if (autofillProvider != null) {
            uu2 uu2Var = autofillProvider.g;
            if (uu2Var != null) {
                uu2Var.c();
            }
            long j = autofillProvider.f;
            if (j != 0) {
                autofillProvider.f = 0L;
                N.M5T72OHd(j);
            }
            ht2 ht2Var = autofillProvider.b;
            if (ht2Var != null) {
                ht2Var.b();
            }
            this.T = null;
        }
        fz4 fz4Var = this.y;
        if (fz4Var != null) {
            fz4Var.c((WebContents) null);
            this.y = null;
        }
        gz4 gz4Var = this.N;
        if (gz4Var != null) {
            ((i7f) gz4Var.a.M.c).c(gz4Var);
            this.N = null;
        }
        this.s = false;
        np1 np1Var = this.H;
        np1Var.b = true;
        ((r4h) np1Var.d).a();
        b();
        this.n = 0L;
        this.x = null;
    }

    public final GURL m() {
        if (h()) {
            return zs9.a;
        }
        GURL gurlS = e().s();
        return gurlS.b ? gurlS : V;
    }

    public final String n() {
        GURL gurlM = !this.H.a ? null : d().m() != null ? d().m().a : m();
        if (gurlM != null) {
            return gurlM.g();
        }
        return null;
    }

    public final void navigationHistoryPruned(int i, int i2) {
        h7f h7fVar = this.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).getClass();
        }
    }

    public final nwi o() {
        int iMbX9gHpF = N.MbX9gHpF(this.n);
        nwi nwiVar = nwi.a;
        return iMbX9gHpF != 0 ? iMbX9gHpF != 1 ? iMbX9gHpF != 2 ? iMbX9gHpF != 3 ? nwiVar : nwi.d : nwi.c : nwi.b : nwiVar;
    }

    public final void onAudioStateChanged(boolean z) {
        h7f h7fVar = this.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).g(z);
        }
    }

    public final void onElementClicked(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        h7f h7fVar = this.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).q(str, str2, str3, str4);
        }
    }

    public final void onLanguageDetermined(@NonNull String str, boolean z, @NonNull String str2, @NonNull String str3) {
        yqa yqaVar = new yqa(str, str2, str3, z);
        this.P = this.Q;
        this.Q = yqaVar;
        h7f h7fVar = this.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).v(yqaVar);
        }
    }

    public final void onPictureInPictureStateChanged(int i) {
        h7f h7fVar = this.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).x(i);
        }
    }

    public final void onReaderModeStateChanged(int i, int i2) {
        h7f h7fVar = this.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).y(i, i2);
        }
    }

    public final void onRenderViewReady() {
        if (!this.q) {
            e().y1(2);
        }
        h7f h7fVar = this.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).A(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTranslateRequestDone(int r6, int r7, int r8) {
        /*
            r5 = this;
            vz5 r5 = r5.R
            if (r5 == 0) goto L58
            java.lang.Object r5 = r5.f
            kze r5 = (defpackage.kze) r5
            java.lang.Object r5 = r5.g()
            j5m r5 = (defpackage.j5m) r5
            r8 = 0
            r0 = 7
            r1 = 5
            r2 = 4
            r3 = 3
            if (r7 == r3) goto L1b
            if (r7 == r2) goto L1b
            if (r7 == r1) goto L1b
            if (r7 != r0) goto L24
        L1b:
            java.lang.Runnable r4 = r5.j
            if (r4 == 0) goto L24
            r4.run()
            r5.j = r8
        L24:
            int r4 = r5.a
            if (r4 != r6) goto L58
            r6 = 1
            if (r7 == 0) goto L51
            if (r7 == r6) goto L4b
            r6 = 2
            if (r7 == r6) goto L45
            if (r7 == r3) goto L45
            if (r7 == r1) goto L3f
            r6 = 6
            if (r7 == r6) goto L45
            if (r7 != r0) goto L56
            a5m r8 = new a5m
            r8.<init>(r0)
            goto L56
        L3f:
            b5m r8 = new b5m
            r8.<init>(r6)
            goto L56
        L45:
            b5m r8 = new b5m
            r8.<init>(r1)
            goto L56
        L4b:
            b5m r8 = new b5m
            r8.<init>(r2)
            goto L56
        L51:
            b5m r8 = new b5m
            r8.<init>(r6)
        L56:
            if (r8 != 0) goto L59
        L58:
            return
        L59:
            r5.d(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.browser.chromium.ChromiumContent.onTranslateRequestDone(int, int, int):void");
    }

    public final void onUpdateBytesTransferred(long j, long j2) {
        x5f x5fVar = this.F;
        if (x5fVar != null) {
            x5fVar.J(j, j2, "page_loads");
        }
    }

    public final void onWebLanguageDetectionDetails(@NonNull String str, @NonNull String str2) {
        h7f h7fVar = this.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).J(str, str2);
        }
    }

    public final String p() {
        long j = this.n;
        return j == 0 ? "" : (String) N.MdMAB$tA(j);
    }

    public final vz5 q() {
        vz5 vz5Var = this.R;
        if (vz5Var != null) {
            return vz5Var;
        }
        vz5 vz5Var2 = new vz5(new cz4(this), vml.d, this.L);
        this.R = vz5Var2;
        return vz5Var2;
    }

    public final String r() {
        return m().h();
    }

    public final void requestPermissionDialog(int i, @NonNull String str, @NonNull PermissionDialogDelegate permissionDialogDelegate) {
        DialogDelegate dialogDelegate = this.p;
        if (dialogDelegate == null) {
            return;
        }
        ole oleVar = new ole();
        oleVar.a = permissionDialogDelegate;
        dialogDelegate.h(i, str, oleVar);
    }

    public final void resolvePartnerSuggestionUrl(@NonNull String str, long j) {
        pt3 pt3Var = this.K;
        if (pt3Var == null) {
            N.MYhVVL5A(this.n, "", j);
            return;
        }
        az4 az4Var = new az4(this, j, (byte) 0);
        BrowserActivity browserActivity = pt3Var.b;
        int i = BrowserActivity.E1;
        ipk ipkVarL0 = browserActivity.L0();
        wx wxVar = new wx((Object) str, (Object) az4Var, (byte) 22);
        xbf xbfVar = ipkVarL0.k;
        h42 h42Var = (h42) xbfVar.g;
        Map map = (Map) h42Var.g();
        if (map != null) {
            wxVar.run((l2g) map.get(str));
        } else {
            h42Var.k(new o2g(xbfVar, wxVar, str));
        }
    }

    public final void s() {
        if (this.q) {
            return;
        }
        this.q = true;
        e().y1(0);
    }

    public final void setPendingPrint(int i, int i2) {
        lyg lygVarC = lyg.c(this.b);
        dx3 dx3VarC = c();
        if (dx3VarC == null) {
            return;
        }
        vz5 vz5VarQ = q();
        ((j5m) ((kze) vz5VarQ.f).g()).a(new bz4(this, lygVarC, dx3VarC, this, i, i2));
    }

    public final void t(qy4 qy4Var, g1j g1jVar, qp2 qp2Var, InterceptNavigationDelegate interceptNavigationDelegate, ype ypeVar, x5f x5fVar, eej eejVar, pt3 pt3Var, d7h d7hVar, jv0 jv0Var) {
        int i;
        N.MM5u3hgR(this.n);
        this.F = x5fVar;
        this.G = eejVar;
        if (interceptNavigationDelegate != null) {
            j(interceptNavigationDelegate);
        }
        OperaWebContentsDelegate operaWebContentsDelegate = new OperaWebContentsDelegate(this, ypeVar, qp2Var);
        this.x = operaWebContentsDelegate;
        N.MyM9eIxb(this.n, operaWebContentsDelegate);
        g(new qq6(new zy9(this), (byte) 11));
        xr5 xr5Var = this.J;
        Objects.requireNonNull(xr5Var);
        boolean zM8lncpsK = (this.n == 0 || h()) ? false : N.M8lncpsK(this.n);
        qi qiVar = this.b;
        if (zM8lncpsK) {
            WebContents webContentsE = e();
            AutofillProvider autofillProvider = this.T;
            if (autofillProvider == null) {
                b2b b2bVar = ((WindowAndroid) qiVar).f;
                xr5 xr5Var2 = this.J;
                Context context = (Context) b2bVar.get();
                Objects.requireNonNull(context);
                this.T = new AutofillProvider(b2bVar, xr5Var2, webContentsE, context.getString(2132017591));
                N.M3aEETQK(this.n);
            } else if (webContentsE != autofillProvider.d) {
                uu2 uu2Var = autofillProvider.g;
                if (uu2Var != null) {
                    uu2Var.c();
                }
                if (autofillProvider.d != null) {
                    autofillProvider.e = null;
                }
                autofillProvider.d = webContentsE;
                long j = autofillProvider.f;
                if (j != 0) {
                    autofillProvider.f = 0L;
                    N.M5T72OHd(j);
                }
                if (autofillProvider.d != null) {
                    N.MP6qv$HX(autofillProvider, webContentsE);
                }
            }
            SelectionPopupControllerImpl selectionPopupControllerImplFromWebContents = SelectionPopupControllerImpl.fromWebContents(webContentsE);
            if (selectionPopupControllerImplFromWebContents != null) {
                u59 u59Var = new u59((byte) 15);
                u59Var.b = new u59(this.T, (byte) 2);
                selectionPopupControllerImplFromWebContents.M = u59Var;
            }
            i = 1;
        } else {
            AutofillProvider autofillProvider2 = this.T;
            if (autofillProvider2 != null) {
                uu2 uu2Var2 = autofillProvider2.g;
                if (uu2Var2 != null) {
                    uu2Var2.c();
                }
                long j2 = autofillProvider2.f;
                if (j2 != 0) {
                    autofillProvider2.f = 0L;
                    N.M5T72OHd(j2);
                }
                ht2 ht2Var = autofillProvider2.b;
                if (ht2Var != null) {
                    ht2Var.b();
                }
                this.T = null;
            }
            i = 8;
        }
        xr5Var.setImportantForAutofill(i);
        new ns5(e(), (ViewGroup) getView(), qy4Var, g1jVar, jv0Var, wln.d);
        zg zgVar = new zg();
        ty3 ty3Var = new ty3(zgVar, (byte) 4);
        zgVar.b = e();
        zgVar.a = 0;
        k(ty3Var);
        this.A = zgVar;
        this.z = new ard(this, vml.d);
        this.K = pt3Var;
        this.L = d7hVar;
        this.y = new fz4(this, this);
        this.o.A(this);
        fb7 fb7Var = ((WindowAndroid) qiVar).d;
        e().y0(fb7Var.f, fb7Var.g);
        this.N = new gz4(this);
    }

    public final boolean u() {
        RenderWidgetHostViewImpl renderWidgetHostViewImplR;
        WebContents webContentsF = f();
        if (webContentsF != null && (renderWidgetHostViewImplR = webContentsF.r()) != null) {
            renderWidgetHostViewImplR.a();
            if (N.MZn2HluM(renderWidgetHostViewImplR.a)) {
                return true;
            }
        }
        return false;
    }

    public final void v(lsc lscVar) {
        String str = lscVar.a;
        String[] strArr = wqm.a;
        if (str == null || !str.startsWith("javascript:")) {
            if ((!str.startsWith("file://") && !UrlMangler.isOffline(str)) || r9n.X(t8.a)) {
                w(lscVar);
                return;
            }
            wx wxVar = new wx((Object) this, (Object) lscVar, (byte) 26);
            if (Build.VERSION.SDK_INT >= 33) {
                wxVar.run(Boolean.FALSE);
            } else {
                f03.U(this.b, "android.permission.READ_EXTERNAL_STORAGE", new dz4(this, wxVar));
            }
        }
    }

    public final void w(lsc lscVar) {
        String str;
        int i;
        long j = this.n;
        if (j != 0) {
            String str2 = lscVar.a;
            boolean z = lscVar.c;
            int i2 = lscVar.d;
            cm cmVar = lscVar.e;
            if (cmVar != null) {
                str = cmVar.c;
                i = cmVar.b;
            } else {
                str = null;
                i = 0;
            }
            String strA = lscVar.a();
            ResourceRequestBody resourceRequestBody = lscVar.i;
            boolean z2 = lscVar.j;
            boolean z3 = lscVar.k;
            boolean z4 = lscVar.m;
            boolean z5 = lscVar.n;
            boolean z6 = lscVar.l;
            byte[] bArr = lscVar.o;
            N.M62NJvGd(j, str2, z ? 1 : 0, i2, str, i, strA, resourceRequestBody, (Object) null, (Object) null, (Object) null, false, z2, z3, z4, z5, z6, bArr);
        }
    }

    public final void x(boolean z) {
        String strA;
        if (UrlMangler.isOffline(r()) && (strA = UrlMangler.a(r(), "external_url")) != null) {
            lsc lscVarF = wqm.f(strA, null, lqm.d);
            if (lscVarF != null) {
                v(lscVarF);
                return;
            }
            return;
        }
        NavigationController navigationControllerD = d();
        if (navigationControllerD == null) {
            return;
        }
        if (z) {
            navigationControllerD.p();
        } else {
            navigationControllerD.b();
        }
    }

    public final void y(iz4 iz4Var) {
        this.C.c(iz4Var);
    }

    public final void z(boolean z) {
        if (z) {
            e().v1(2);
            B();
            this.r = true;
        } else if (this.r) {
            e().z1();
            s();
            e().v1(0);
            this.r = false;
        }
        this.o.u(this, z);
        if (z) {
            ard ardVar = this.z;
            if (!ardVar.e()) {
                int i = ardVar.b.i;
                SparseArray sparseArray = lkd.a;
                Integer num = (Integer) lkd.b.get(Pair.create(Integer.valueOf(i), 2131363343));
                hkd hkdVar = (hkd) lkd.a.get(num != null ? num.intValue() : 2131363343);
                if (hkdVar != null) {
                    hkdVar.a(i);
                }
            }
            WebContents webContentsE = e();
            r1j r1jVar = WebContentsAccessibilityImpl.P;
            WebContentsAccessibilityImpl webContentsAccessibilityImplX = webContentsE.X(WebContentsAccessibilityImpl.class, mtn.a);
            webContentsAccessibilityImplX.B = true;
            webContentsAccessibilityImplX.C = true;
            webContentsAccessibilityImplX.N = true;
        }
    }
}
