package defpackage;

import J.N;
import android.content.Context;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.opera.android.bar.FindInPage;
import com.opera.android.browser.TabInfo;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.browser.chromium.TabCrashView;
import com.opera.android.media.WebPictureInPictureActivity;
import com.opera.android.webapps.WebappActivity;
import java.util.HashMap;
import org.chromium.base.ApplicationStatus;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.MediaSession;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.third_party.android.swiperefresh.SwipeRefreshLayout;

/* loaded from: classes.dex */
public final class ty3 extends iz4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ty3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.iz4
    public final void A(ChromiumContent chromiumContent) {
        switch (this.a) {
            case 1:
                nz4 nz4Var = (nz4) this.b;
                View view = nz4Var.e;
                if (view != null && nz4Var.f != null) {
                    xr5 parent = view.getParent();
                    xr5 xr5Var = nz4Var.f.J;
                    if (parent == xr5Var) {
                        xr5Var.removeView(nz4Var.e);
                    }
                }
                nz4Var.e = null;
                break;
        }
    }

    @Override // defpackage.iz4
    public final void B() {
        switch (this.a) {
            case 0:
                h7f h7fVar = ((uy3) this.b).a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    d7l d7lVar = ((b7l) g7fVarH.next()).a;
                    h7f h7fVar2 = d7lVar.g;
                    g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
                    while (g7fVarH2.hasNext()) {
                        ((a2l) g7fVarH2.next()).I(d7lVar);
                    }
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void C(ChromiumContent chromiumContent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                h7f h7fVar = ((uy3) obj).a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    d7l d7lVar = ((b7l) g7fVarH.next()).a;
                    h7f h7fVar2 = d7lVar.g;
                    g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
                    while (g7fVarH2.hasNext()) {
                        ((a2l) g7fVarH2.next()).p(d7lVar);
                    }
                }
                break;
            case 7:
                ard ardVar = (ard) obj;
                String strTrim = chromiumContent.p().trim();
                if (strTrim.startsWith("▶")) {
                    strTrim = strTrim.substring(1).trim();
                }
                if (!TextUtils.equals(ardVar.m, strTrim)) {
                    ardVar.m = strTrim;
                    ardVar.i();
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                int i = WebappActivity.J;
                ((WebappActivity) obj).h0();
                break;
        }
    }

    @Override // defpackage.iz4
    public final void D(long j) {
        switch (this.a) {
            case 0:
                h7f h7fVar = ((uy3) this.b).a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    d7l d7lVar = ((b7l) g7fVarH.next()).a;
                    h7f h7fVar2 = d7lVar.g;
                    g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
                    while (g7fVarH2.hasNext()) {
                        ((a2l) g7fVarH2.next()).g(d7lVar, j);
                    }
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void E() {
        switch (this.a) {
            case 0:
                h7f h7fVar = ((uy3) this.b).a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    d7l d7lVar = ((b7l) g7fVarH.next()).a;
                    h7f h7fVar2 = d7lVar.g;
                    g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
                    while (g7fVarH2.hasNext()) {
                        ((a2l) g7fVarH2.next()).x(d7lVar);
                    }
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void G() {
        switch (this.a) {
            case 5:
                ((eq9) this.b).e();
                break;
        }
    }

    @Override // defpackage.iz4
    public final void H(ChromiumContent chromiumContent, qwi qwiVar) {
        switch (this.a) {
            case 0:
                h7f h7fVar = ((uy3) this.b).a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    d7l d7lVar = ((b7l) g7fVarH.next()).a;
                    h7f h7fVar2 = d7lVar.g;
                    g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
                    while (g7fVarH2.hasNext()) {
                        ((a2l) g7fVarH2.next()).i(d7lVar, qwiVar);
                    }
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void I(WebContents webContents, WebContents webContents2) {
        switch (this.a) {
            case 0:
                uy3 uy3Var = (uy3) this.b;
                vzk vzkVar = uy3Var.d;
                int i = uy3Var.e.d;
                boolean zM = webContents.m();
                if (!((Boolean) ((nx3) vzkVar.c).get()).booleanValue()) {
                    i = 0;
                }
                uy3 uy3VarT = vzkVar.t(new TabInfo(0, i, System.currentTimeMillis(), 0L), ((hz4) vzkVar.b).a(zM, webContents2));
                h7f h7fVar = uy3Var.a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    d7l d7lVar = ((b7l) g7fVarH.next()).a;
                    xbf xbfVar = d7lVar.h;
                    d7l d7lVar2 = new d7l(xbfVar, uy3VarT, (tw2) xbfVar.e, (aal) xbfVar.f, (iga) xbfVar.c, (rc6) xbfVar.d, lqm.d);
                    h7f h7fVar2 = d7lVar.g;
                    g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
                    while (g7fVarH2.hasNext()) {
                        ((a2l) g7fVarH2.next()).a(d7lVar, d7lVar2);
                    }
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void J(String str, String str2) {
        switch (this.a) {
            case 0:
                h7f h7fVar = ((uy3) this.b).a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    d7l d7lVar = ((b7l) g7fVarH.next()).a;
                    h7f h7fVar2 = d7lVar.g;
                    g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
                    while (g7fVarH2.hasNext()) {
                        ((a2l) g7fVarH2.next()).O(d7lVar, str, str2);
                    }
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void L(ChromiumContent chromiumContent) {
        switch (this.a) {
            case 6:
                ((aeb) this.b).f.b = null;
                break;
        }
    }

    @Override // defpackage.iz4
    public final void d(boolean z) {
        switch (this.a) {
            case 0:
                h7f h7fVar = ((uy3) this.b).a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    d7l d7lVar = ((b7l) g7fVarH.next()).a;
                    h7f h7fVar2 = d7lVar.g;
                    g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
                    while (g7fVarH2.hasNext()) {
                        ((a2l) g7fVarH2.next()).D(d7lVar, z);
                    }
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void e(MediaSession mediaSession) {
        switch (this.a) {
            case 7:
                ard ardVar = (ard) this.b;
                zqd zqdVar = ardVar.j;
                if (zqdVar == null || mediaSession != zqdVar.a) {
                    ardVar.a();
                    if (mediaSession != null) {
                        ardVar.j = new zqd(ardVar, mediaSession, mediaSession);
                    }
                    ardVar.f();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void f(long j) {
        switch (this.a) {
            case 0:
                h7f h7fVar = ((uy3) this.b).a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    d7l d7lVar = ((b7l) g7fVarH.next()).a;
                    h7f h7fVar2 = d7lVar.g;
                    g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
                    while (g7fVarH2.hasNext()) {
                        ((a2l) g7fVarH2.next()).U(d7lVar, j);
                    }
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void g(boolean z) {
        switch (this.a) {
            case 0:
                h7f h7fVar = ((uy3) this.b).a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    d7l d7lVar = ((b7l) g7fVarH.next()).a;
                    h7f h7fVar2 = d7lVar.g;
                    g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
                    while (g7fVarH2.hasNext()) {
                        ((a2l) g7fVarH2.next()).J(d7lVar, z);
                    }
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void j(ChromiumContent chromiumContent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                nz4 nz4Var = (nz4) obj;
                b7f b7fVar = nz4Var.j;
                if (b7fVar != null) {
                    b7fVar.a(nz4Var.k);
                    break;
                }
                break;
            case 3:
                mlf mlfVar = (mlf) obj;
                ((aeb) mlfVar.b).a.y((ty3) mlfVar.f);
                break;
            case 6:
                aeb aebVar = (aeb) obj;
                aebVar.a.y(aebVar.e);
                aebVar.g.b(null);
                aebVar.g = null;
                break;
            case 8:
                ((tgi) obj).b.remove(chromiumContent);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((WebPictureInPictureActivity) obj).finish();
                break;
        }
    }

    @Override // defpackage.iz4
    public final void k(int i) {
        switch (this.a) {
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                WebappActivity webappActivity = (WebappActivity) this.b;
                webappActivity.z = Integer.valueOf(i);
                webappActivity.h0();
                break;
        }
    }

    @Override // defpackage.iz4
    public final void l(ChromiumContent chromiumContent, NavigationHandle navigationHandle) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                uy3 uy3Var = (uy3) obj;
                if (navigationHandle.h) {
                    uy3Var.f = true;
                }
                h7f h7fVar = uy3Var.a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((b7l) g7fVarH.next()).a(navigationHandle);
                }
                break;
            case 2:
                if (!navigationHandle.c) {
                    uz4 uz4Var = (uz4) obj;
                    uz4Var.f = 0;
                    uz4Var.a.d(false, false);
                    break;
                }
                break;
            case 3:
                long j = navigationHandle.s;
                mlf mlfVar = (mlf) obj;
                ol5 ol5Var = (ol5) mlfVar.e;
                if (ol5Var != null && mlfVar.a != j) {
                    ol5Var.finish(hjm.b);
                    mlfVar.e = null;
                    break;
                }
                break;
            case 6:
                aeb aebVar = (aeb) obj;
                zdb zdbVar = aebVar.g;
                zdbVar.getClass();
                if (navigationHandle.h) {
                    aeb aebVar2 = zdbVar.b;
                    NavigationController navigationControllerQ = aebVar2.b().q();
                    if (zdbVar.f) {
                        navigationControllerQ.o();
                    } else if (zdbVar.g) {
                        int i = aebVar2.f.a;
                        for (int iE = zdbVar.e() - 1; iE > i; iE--) {
                            navigationControllerQ.j(iE);
                        }
                    }
                    zdbVar.f = false;
                    zdbVar.g = false;
                }
                if (navigationHandle.t) {
                    aebVar.f.b = null;
                    break;
                }
                break;
            case 7:
                ard ardVar = (ard) obj;
                if (navigationHandle.h && !navigationHandle.c) {
                    String strR = ardVar.b.r();
                    try {
                        strR = (String) N.MR6Af3ZS(strR, 0);
                    } catch (UnsatisfiedLinkError unused) {
                    }
                    ardVar.i = true;
                    ardVar.h = strR;
                    ardVar.f = null;
                    ardVar.e = null;
                    ardVar.n = null;
                    ardVar.o = ardVar.b();
                    ardVar.q = null;
                    if (!ardVar.e()) {
                        ikd ikdVar = ardVar.l;
                        ikdVar.c = ardVar.h;
                        ikdVar.g = ardVar.f;
                        ikdVar.h = ardVar.e;
                        ikdVar.a = ardVar.o;
                        ikdVar.m = ardVar.q;
                        ardVar.g();
                        break;
                    }
                }
                break;
            case 8:
                if (navigationHandle.h) {
                    ((tgi) obj).a(chromiumContent);
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                int i2 = WebappActivity.J;
                ((WebappActivity) obj).g0();
                break;
        }
    }

    @Override // defpackage.iz4
    public final void m(ChromiumContent chromiumContent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                h7f h7fVar = ((uy3) obj).a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    d7l d7lVar = ((b7l) g7fVarH.next()).a;
                    h7f h7fVar2 = d7lVar.g;
                    g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
                    while (g7fVarH2.hasNext()) {
                        ((a2l) g7fVarH2.next()).u(d7lVar);
                    }
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                uuj uujVar = ((WebappActivity) obj).B;
                ViewGroup viewGroup = (ViewGroup) uujVar.c;
                if (viewGroup != null) {
                    viewGroup.animate().alpha(0.0f).setStartDelay(uujVar.k()).withEndAction(new ssi(uujVar));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void n(ChromiumContent chromiumContent) {
        switch (this.a) {
            case 0:
                h7f h7fVar = ((uy3) this.b).a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((b7l) g7fVarH.next()).b();
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void o(ChromiumContent chromiumContent, NavigationHandle navigationHandle) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                h7f h7fVar = ((uy3) obj).a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((b7l) g7fVarH.next()).c(navigationHandle);
                }
                break;
            case 1:
                SelectionPopupControllerImpl.fromWebContents(chromiumContent.e()).r();
                break;
            case 3:
                long j = navigationHandle.s;
                mlf mlfVar = (mlf) obj;
                ol5 ol5Var = (ol5) mlfVar.e;
                if (ol5Var != null && mlfVar.a != j) {
                    ol5Var.finish(hjm.b);
                    mlfVar.e = null;
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((WebPictureInPictureActivity) obj).finish();
                break;
        }
    }

    @Override // defpackage.iz4
    public final void p(ChromiumContent chromiumContent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                h7f h7fVar = ((uy3) obj).a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((b7l) g7fVarH.next()).d();
                }
                break;
            case 1:
                cy3 cy3Var = ((nz4) obj).d;
                SwipeRefreshLayout swipeRefreshLayout = cy3Var.d;
                if (swipeRefreshLayout.b) {
                    ssi ssiVar = cy3Var.e;
                    if (ssiVar != null) {
                        swipeRefreshLayout.removeCallbacks(ssiVar);
                    }
                    ssi ssiVar2 = cy3Var.e;
                    if (ssiVar2 == null) {
                        ssiVar2 = new ssi(cy3Var, (byte) 8);
                        cy3Var.e = ssiVar2;
                    }
                    swipeRefreshLayout.postDelayed(ssiVar2, 500L);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void q(String str, String str2, String str3, String str4) {
        switch (this.a) {
            case 0:
                h7f h7fVar = ((uy3) this.b).a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    b7l b7lVar = (b7l) g7fVarH.next();
                    h7f h7fVar2 = b7lVar.a.g;
                    g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
                    while (g7fVarH2.hasNext()) {
                        ((a2l) g7fVarH2.next()).m(b7lVar.a, str, str2, str3, str4);
                    }
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void r(ChromiumContent chromiumContent, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                uz4 uz4Var = (uz4) obj;
                uz4Var.f = 0;
                uz4Var.a.d(false, false);
                break;
            case 5:
                eq9 eq9Var = (eq9) obj;
                d37 d37Var = eq9Var.a;
                d37Var.g = chromiumContent;
                d37Var.b = z;
                d37Var.j(chromiumContent, false);
                d37.C(chromiumContent, false);
                boolean z2 = d37Var.a;
                h7f h7fVar = eq9Var.c;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((iq9) g7fVarH.next()).F(true, z2);
                }
                eq9Var.e();
                break;
        }
    }

    @Override // defpackage.iz4
    public final void s(ChromiumContent chromiumContent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                uz4 uz4Var = (uz4) obj;
                uz4Var.f = 0;
                uz4Var.a.d(false, false);
                break;
            case 5:
                eq9 eq9Var = (eq9) obj;
                d37 d37Var = eq9Var.a;
                hq9 hq9Var = (hq9) d37Var.h;
                if (hq9Var != null) {
                    xy0 xy0Var = hq9Var.i;
                    xy0Var.removeMessages(1);
                    xy0Var.removeMessages(2);
                    xy0Var.removeMessages(3);
                    xy0Var.sendEmptyMessage(2);
                    d37Var.h = null;
                }
                d37Var.g = null;
                d37.C(chromiumContent, true);
                boolean z = d37Var.a;
                h7f h7fVar = eq9Var.c;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((iq9) g7fVarH.next()).F(false, z);
                }
                eq9Var.e();
                break;
        }
    }

    @Override // defpackage.iz4
    public final void t(int i, int i2, int i3) {
        FindInPage findInPage;
        switch (this.a) {
            case 4:
                zg zgVar = (zg) this.b;
                if (i == zgVar.a && (findInPage = (FindInPage) zgVar.d) != null) {
                    findInPage.e = i3;
                    findInPage.f = i2;
                    findInPage.g();
                    if (!findInPage.g && findInPage.e > 1) {
                        q9n.u(findInPage.findViewById(2131362964));
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void v(yqa yqaVar) {
        switch (this.a) {
            case 0:
                h7f h7fVar = ((uy3) this.b).a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    d7l d7lVar = ((b7l) g7fVarH.next()).a;
                    h7f h7fVar2 = d7lVar.g;
                    g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
                    while (g7fVarH2.hasNext()) {
                        ((a2l) g7fVarH2.next()).b(d7lVar, yqaVar);
                    }
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void w(int i) {
        switch (this.a) {
            case 0:
                h7f h7fVar = ((uy3) this.b).a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    d7l d7lVar = ((b7l) g7fVarH.next()).a;
                    h7f h7fVar2 = d7lVar.g;
                    g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
                    while (g7fVarH2.hasNext()) {
                        ((a2l) g7fVarH2.next()).l(d7lVar, i);
                    }
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void x(int i) {
        switch (this.a) {
            case 0:
                h7f h7fVar = ((uy3) this.b).a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    d7l d7lVar = ((b7l) g7fVarH.next()).a;
                    h7f h7fVar2 = d7lVar.g;
                    g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
                    while (g7fVarH2.hasNext()) {
                        ((a2l) g7fVarH2.next()).V(d7lVar, i);
                    }
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void y(int i, int i2) {
        switch (this.a) {
            case 0:
                h7f h7fVar = ((uy3) this.b).a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    d7l d7lVar = ((b7l) g7fVarH.next()).a;
                    h7f h7fVar2 = d7lVar.g;
                    g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
                    while (g7fVarH2.hasNext()) {
                        ((a2l) g7fVarH2.next()).e(d7lVar, i, i2);
                    }
                }
                break;
        }
    }

    @Override // defpackage.iz4
    public final void z(ChromiumContent chromiumContent) {
        long j;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                h7f h7fVar = ((uy3) obj).a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    d7l d7lVar = ((b7l) g7fVarH.next()).a;
                    h7f h7fVar2 = d7lVar.g;
                    g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
                    while (g7fVarH2.hasNext()) {
                        ((a2l) g7fVarH2.next()).f(d7lVar);
                    }
                }
                break;
            case 1:
                if (!chromiumContent.q) {
                    nz4 nz4Var = (nz4) obj;
                    if (nz4Var.e == null) {
                        ViewGroup viewGroup = nz4Var.f.J;
                        Context context = nz4Var.getContext();
                        cy3 cy3Var = nz4Var.d;
                        int i = TabCrashView.h;
                        View viewInflate = LayoutInflater.from(context).inflate(2131558599, viewGroup, false);
                        ((TabCrashView) viewInflate).a = cy3Var;
                        nz4Var.e = viewInflate;
                        viewGroup.addView(viewInflate, new FrameLayout.LayoutParams(-1, -1));
                        break;
                    }
                }
                break;
            case 7:
                k03 k03Var = ((ard) obj).u;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = k03Var.a;
                if (j2 >= 0) {
                    j = jElapsedRealtime - j2;
                } else {
                    long j3 = k03Var.b;
                    if (j3 >= 0 && jElapsedRealtime - j3 <= 1000) {
                        j = k03Var.c;
                    }
                }
                k03Var.a = -1L;
                k03Var.b = -1L;
                if (!k03Var.d && !ApplicationStatus.hasVisibleActivities()) {
                    k03Var.d = true;
                    HashMap map = new HashMap();
                    map.put("bps_played_s", String.valueOf(j / 1000));
                    map.put("bps_app_state", String.valueOf(ApplicationStatus.getStateForApplication()));
                    PowerManager powerManager = (PowerManager) t8.a.getSystemService("power");
                    if (powerManager != null) {
                        map.put("bps_screen_on", String.valueOf(powerManager.isInteractive()));
                    }
                    ks3.E(new yo8("BackgroundPlaybackStopped", "renderer_gone"), map);
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((WebPictureInPictureActivity) obj).finish();
                break;
        }
    }
}
