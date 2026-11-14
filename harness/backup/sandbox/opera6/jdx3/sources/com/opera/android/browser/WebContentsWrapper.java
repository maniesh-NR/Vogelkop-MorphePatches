package com.opera.android.browser;

import J.N;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.OperaApplication;
import com.opera.android.annotations.WeakOwner;
import com.opera.android.settings.SettingsManager;
import com.opera.api.Callback;
import defpackage.dx3;
import defpackage.g7f;
import defpackage.h7f;
import defpackage.koi;
import defpackage.leg;
import defpackage.oji;
import defpackage.q9n;
import defpackage.qp2;
import defpackage.qq6;
import defpackage.rtn;
import defpackage.zzi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public class WebContentsWrapper {
    public static int k = Integer.MAX_VALUE;
    public long a;
    public final qi b;
    public final h7f c;
    public final byte d;
    public int e;
    public boolean f;
    public boolean g;

    @Nullable
    @WeakOwner
    private InterceptNavigationDelegate h;
    public int i;
    public boolean j;

    static {
        SelectionPopupControllerImpl.R = true;
    }

    public WebContentsWrapper(qi qiVar) {
        this.c = new h7f();
        this.i = Integer.MIN_VALUE;
        this.b = qiVar;
        this.d = (byte) 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebContentsWrapper(qi qiVar, WebContents webContents, int i) {
        koi koiVar;
        this.c = new h7f();
        this.b = qiVar;
        this.d = i;
        int i2 = k;
        k = i2 - 1;
        this.i = i2;
        long jMEihbG12 = N.MEihbG12(this, webContents);
        this.a = jMEihbG12;
        if (jMEihbG12 == 0) {
            qp2.n("Failed to create a native instance.");
            throw null;
        }
        dx3 dx3VarC = c();
        if (dx3VarC == null || (koiVar = dx3VarC.t) == null) {
            return;
        }
        ArrayList arrayList = koiVar.e;
        if (koiVar.g || arrayList.contains(this) || h()) {
            return;
        }
        arrayList.add(this);
        koiVar.f.put(this, Boolean.FALSE);
        WebContents webContentsE = e();
        leg legVar = new leg(koiVar, webContentsE, this);
        if (webContentsE.getVisibility() == 2) {
            legVar.onVisibilityChanged(2);
        }
    }

    public static void receivedHtmlMetaData(@NonNull Object obj, @NonNull String[] strArr) {
        Callback callback = (Callback) obj;
        if (strArr.length == 0) {
            callback.run(Collections.EMPTY_LIST);
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        arrayList.add(map);
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            if (str == null) {
                map = new HashMap();
                arrayList.add(map);
            } else {
                i++;
                map.put(str, strArr[i]);
            }
            i++;
        }
        callback.run(arrayList);
    }

    public ViewAndroidDelegate a(xr5 xr5Var) {
        return new ViewAndroidDelegate(xr5Var);
    }

    public final void b() {
        long j = this.a;
        this.a = 0L;
        this.h = null;
        N.MqlMMZM3(j, (Object) null);
        N.MvxZAR9q(j);
    }

    public final dx3 c() {
        Object objD = t8.d((Context) ((WindowAndroid) this.b).f.get());
        if (objD instanceof dx3) {
            return (dx3) objD;
        }
        return null;
    }

    public final NavigationController d() {
        if (h()) {
            return null;
        }
        return e().q();
    }

    public final WebContents e() {
        long j = this.a;
        if (j != 0) {
            return (WebContents) N.MuToB3Z8(j);
        }
        qp2.n("Cannot call native method without a native instance.");
        return null;
    }

    public final WebContents f() {
        long j = this.a;
        if (j != 0) {
            return (WebContents) N.MuToB3Z8(j);
        }
        return null;
    }

    public final void g(qq6 qq6Var) {
        WebContentsImpl webContentsImplE = e();
        xr5 xr5Var = new xr5(c(), qq6Var, webContentsImplE);
        ViewAndroidDelegate viewAndroidDelegateA = a(xr5Var);
        qi qiVar = this.b;
        qiVar.getClass();
        Context context = t8.a;
        webContentsImplE.W0(context.getResources().getString(2132017591) + " " + r9n.u(context, context.getPackageName(), 0L).versionName, viewAndroidDelegateA, xr5Var, qiVar, new oji());
        SelectionPopupControllerImpl selectionPopupControllerImpl = (SelectionPopupControllerImpl) webContentsImplE.X(SelectionPopupControllerImpl.class, w7d.g);
        zzi zziVar = new zzi(webContentsImplE, webContentsImplE.g, xr5Var);
        wyi wyiVarF = wyi.f(webContentsImplE);
        if (wyiVarF != null) {
            xyi xyiVar = new xyi(Arrays.asList(wyiVarF, zziVar));
            selectionPopupControllerImpl.I = xyiVar;
            selectionPopupControllerImpl.J = xyiVar.d();
            selectionPopupControllerImpl.L = null;
        } else {
            selectionPopupControllerImpl.I = zziVar;
            selectionPopupControllerImpl.J = null;
            selectionPopupControllerImpl.L = null;
        }
        i();
        new leg(this, (WebContents) webContentsImplE, (WebContents) webContentsImplE);
    }

    public final boolean getDarkThemedUi() {
        if ((this.e & 1) != 0) {
            return false;
        }
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        SettingsManager settingsManagerJ = ((OperaApplication) context.getApplicationContext()).J();
        dx3 dx3VarP = q9n.p(c());
        return settingsManagerJ.P(dx3VarP != null ? dx3VarP.u() : null);
    }

    public final boolean getDarkmodeEnabled() {
        if ((this.e & 1) != 0 || this.f || (this.d & 2) != 0) {
            return false;
        }
        Context context = t8.a;
        dx3 dx3VarP = q9n.p(c());
        return x1p.D(context, dx3VarP != null ? dx3VarP.u() : null);
    }

    public final boolean getForceEnableZoom() {
        if ((this.e & 2) != 0 || (this.d & 1) != 0) {
            return false;
        }
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        return ((OperaApplication) context.getApplicationContext()).J().i("force_enable_zoom");
    }

    public final boolean getSupportResourceBlocking() {
        return (this.d & 4) == 0;
    }

    @Nullable
    public final View getView() {
        ViewAndroidDelegate viewAndroidDelegateJ0;
        if (h() || (viewAndroidDelegateJ0 = e().J0()) == null) {
            return null;
        }
        return viewAndroidDelegateJ0.b;
    }

    public final boolean h() {
        return this.a == 0;
    }

    public final void i() {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.MS1u5UBz(j);
    }

    public final boolean isReaderMode() {
        return this.g;
    }

    public final void j(InterceptNavigationDelegate interceptNavigationDelegate) {
        this.h = interceptNavigationDelegate;
        N.MfuBvJPx(this.a, interceptNavigationDelegate);
    }

    public final void onCertificateErrorPageBackPressed() {
        h7f h7fVar = this.c;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((rtn) g7fVarH.next()).h();
        }
    }

    public final void setUseDesktopUserAgent(boolean z) {
        NavigationController navigationControllerD = d();
        int iT = navigationControllerD.t();
        org.chromium.content_public.browser.NavigationEntry navigationEntryI = navigationControllerD.i(iT);
        if (navigationEntryI != null) {
            GURL gurl = navigationEntryI.c;
            if (!"opera-internal".equals(gurl.f())) {
                N.M3IU1D7D(this.a, iT);
            } else if (!gurl.equals(navigationEntryI.b)) {
                N.Ml0Adv5P(this.a, iT, gurl.g());
            }
        }
        navigationControllerD.k(z);
    }
}
