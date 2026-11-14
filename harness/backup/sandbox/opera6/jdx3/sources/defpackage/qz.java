package defpackage;

import J.N;
import android.net.Uri;
import android.os.SystemClock;
import com.leanplum.internal.Clock;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.LoadingView;
import com.opera.android.PushedContentHandler;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.SessionStore;
import com.opera.android.browser.TabInfo;
import com.opera.android.browser.UrlMangler;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.net.GURLUtils;

/* loaded from: classes.dex */
public final class qz extends y08 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ qz(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void D(b2l b2lVar, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 5:
                ((h85) obj).b0();
                break;
            case 29:
                ((h5l) obj).c0();
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void E(b2l b2lVar, NavigationHandle navigationHandle) {
        byte b = this.a;
        ijm ijmVar = ijm.b;
        byte b2 = 2;
        boolean z = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wjh) obj).f(b2lVar);
                break;
            case 1:
                x22 x22Var = (x22) obj;
                if (!navigationHandle.c && !navigationHandle.i) {
                    if (!navigationHandle.h || navigationHandle.j || !x22Var.k(navigationHandle.e)) {
                        x22Var.g.setVisibility(8);
                        v22 v22VarG = x22Var.g(b2lVar);
                        if (v22VarG != null) {
                            v22VarG.a();
                            v22VarG.c = false;
                            v22VarG.b();
                            break;
                        }
                    } else {
                        v22 v22VarE = x22Var.e(b2lVar);
                        v22VarE.a();
                        v22VarE.c = true;
                        v22VarE.b();
                        break;
                    }
                }
                break;
            case 2:
                q82 q82Var = (q82) obj;
                if (navigationHandle.h && !navigationHandle.c) {
                    if (!q82Var.c || !q82Var.d() || !navigationHandle.j) {
                        if (q82Var.c && q82Var.d() && q82Var.e.a.equals(((d7l) q82Var.j).f0())) {
                            z = false;
                        }
                        q82Var.b(((d7l) q82Var.j).n0(), z);
                        if (q82Var.d()) {
                            q82Var.a();
                            break;
                        }
                    } else {
                        if (!q82Var.f) {
                            q82Var.f = true;
                        }
                        h7f h7fVar = q82Var.a;
                        g7f g7fVarH = am2.h(h7fVar, h7fVar);
                        while (g7fVarH.hasNext()) {
                            ((r82) g7fVarH.next()).b(UrlMangler.d(((d7l) q82Var.j).j.getUrl()), false);
                        }
                        q82Var.b(false, true);
                        break;
                    }
                }
                break;
            case 3:
                if (navigationHandle.h && ((d7l) b2lVar).j.isActive()) {
                    ((jt3) obj).a(b2lVar);
                    break;
                }
                break;
            case 6:
                iv7 iv7Var = (iv7) obj;
                if (iv7Var.l == 0) {
                    iv7Var.f();
                    break;
                }
                break;
            case 8:
                if (!navigationHandle.o || !ic4.v(Uri.parse(navigationHandle.e.g()))) {
                    if (navigationHandle.e.c().equals("lens.google")) {
                        d7l d7lVar = (d7l) b2lVar;
                        d7lVar.H(this);
                        d7lVar.Z((lsc) obj);
                        break;
                    }
                } else {
                    ((d7l) b2lVar).H(this);
                    break;
                }
                break;
            case 14:
                if (navigationHandle.h && BrowserUtils.d(navigationHandle.d)) {
                    rwe rweVar = (rwe) obj;
                    ((nrl) rweVar.a.c).d(new yqd(rweVar, (byte) 18));
                    break;
                }
                break;
            case 15:
                ((mbf) obj).R(b2lVar);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                l0h l0hVar = (l0h) obj;
                SettingsManager settingsManager = l0hVar.i;
                BrowserActivity browserActivity = l0hVar.a;
                if (navigationHandle.h && BrowserUtils.d(navigationHandle.d)) {
                    d7l d7lVar2 = (d7l) b2lVar;
                    if (!d7lVar2.n0() && (navigationHandle.d & 16777216) == 0) {
                        l0hVar.h++;
                        if (!ui6.x(GURLUtils.getOrigin(d7lVar2.i0()), ui6.n, d7lVar2.j.m()).isEmpty()) {
                            if (l0hVar.h < 2 || !l0h.a(browserActivity, settingsManager) || !l0hVar.c.k0()) {
                                if (!l0h.a(browserActivity, settingsManager)) {
                                    l0hVar.b.getLifecycle().b(l0hVar);
                                    l0hVar.f.v(l0hVar.g);
                                    break;
                                }
                            } else {
                                gbf gbfVar = l0hVar.e;
                                if (gbfVar.b.q() && gbfVar.q() != null) {
                                    oz3 oz3Var = l0hVar.d;
                                    kt3 kt3Var = new kt3(l0hVar, b2);
                                    oz3Var.getClass();
                                    oz3Var.b(kt3Var, ijmVar);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 19:
                if (navigationHandle.h && BrowserUtils.d(navigationHandle.d)) {
                    q0h q0hVar = (q0h) obj;
                    BrowserActivity browserActivity2 = q0hVar.b;
                    qz qzVar = q0hVar.f;
                    k6l k6lVar = q0hVar.e;
                    int i = q0hVar.g + 1;
                    q0hVar.g = i;
                    fp1 fp1Var = q0hVar.a;
                    if (i >= 4 && ru9.c(fp1Var).a.getBoolean("privacy_settings.promotion.can_show", false) && q0hVar.c.k0()) {
                        long j = ru9.c(fp1Var).a.getLong("privacy_monitor.promotion.shown.timestamp", 0L);
                        if (j != 0 && System.currentTimeMillis() - j >= Clock.DAY_MILLIS) {
                            k6lVar.v(qzVar);
                            browserActivity2.getLifecycle().b(q0hVar);
                            eej eejVar = q0hVar.d;
                            pjg pjgVar = new pjg(q0hVar, (byte) 10);
                            nej nejVar = eejVar.a;
                            xq3 xq3Var = new xq3(eejVar.c, pjgVar, (byte) 6);
                            nejVar.getClass();
                            nejVar.b(xq3Var, ijmVar);
                            break;
                        }
                    }
                    if (!ru9.c(fp1Var).a.getBoolean("privacy_settings.promotion.can_show", false)) {
                        k6lVar.v(qzVar);
                        browserActivity2.getLifecycle().b(q0hVar);
                        break;
                    }
                }
                break;
            case SizeUtil.textSize0 /* 20 */:
                ((PushedContentHandler) obj).a();
                break;
            case SizeUtil.textSize1 /* 22 */:
                d7l d7lVar3 = (d7l) b2lVar;
                if (UrlMangler.isOffline(d7lVar3.j.getUrl())) {
                    glh glhVar = (glh) obj;
                    glhVar.d.n(new oml(glhVar.c.c(new q2g(glhVar, d7lVar3.h0(), (byte) 21))), null);
                    break;
                }
                break;
            case 23:
                if (navigationHandle.h && (navigationHandle.d & 16777216) == 0) {
                    d7l d7lVar4 = (d7l) b2lVar;
                    if (!d7lVar4.j.m()) {
                        String url = d7lVar4.j.getUrl();
                        Uri uri = Uri.parse(url);
                        String strO = aik.o(dti.a(url) ? uri.getQueryParameter("q") : dti.b.matcher(aik.s(url, aik.a)).matches() ? uri.getQueryParameter("text") : "");
                        if (strO != null) {
                            s28 s28Var = (s28) obj;
                            if (s28Var.d) {
                                ((ko7) s28Var.h).f(new wr9((byte) 15, s28Var, strO, z));
                                break;
                            }
                        }
                    }
                }
                break;
            case 26:
                oji ojiVar = (oji) obj;
                String strG = navigationHandle.e.g();
                if (!wqm.w(strG) && navigationHandle.h && BrowserUtils.d(navigationHandle.d)) {
                    if (navigationHandle.c) {
                        if (!(((d7l) b2lVar).i0().equals(strG) ? false : strG.contains("/amp/"))) {
                        }
                    }
                    ojiVar.G(7);
                    ojiVar.G(2);
                    break;
                }
                break;
            case 27:
                if (navigationHandle.h) {
                    ((i3j) obj).P(b2lVar);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void G(b2l b2lVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                x22 x22Var = (x22) obj;
                if (b2lVar == null || !x22Var.j(((d7l) b2lVar).j.getUrl())) {
                    x22Var.g.setVisibility(8);
                    break;
                }
                break;
            case 6:
                ((iv7) obj).f();
                break;
            case 7:
                ((xg) obj).c(((d7l) b2lVar).j.Y() == 1);
                break;
            case 11:
                pyl pylVar = (pyl) obj;
                if (b2lVar != ((d7l) pylVar.e)) {
                    ((LoadingView) pylVar.c).a(false);
                    pylVar.e = null;
                }
                pylVar.u(b2lVar);
                break;
            case 15:
                ((mbf) obj).R(b2lVar);
                break;
            case 17:
                kwf.u(((m66) ((kwf) ((s9i) obj).e).f().c).findItem(2131363823), b2lVar);
                break;
            case 21:
                W(b2lVar, ((d7l) b2lVar).j.P());
                break;
            case 27:
                int iIndexOf = ((ArrayList) ((i3j) obj).a).indexOf(b2lVar);
                if (iIndexOf != -1) {
                    N.MWNGpfpJ(iIndexOf);
                    break;
                }
                break;
            case 29:
                ((h5l) obj).Z();
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void J(b2l b2lVar, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 5:
                ((h85) obj).b0();
                break;
            case 29:
                ((h5l) obj).c0();
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void Q(b2l b2lVar, NavigationHandle navigationHandle) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wjh) obj).A();
                break;
            case 1:
                x22 x22Var = (x22) obj;
                if (x22Var.k(navigationHandle.e)) {
                    x22Var.e(b2lVar).a();
                    break;
                }
                break;
            case 4:
                qx3 qx3Var = (qx3) obj;
                if (b2lVar == qx3Var.b) {
                    qx3Var.a(b2lVar);
                    break;
                }
                break;
            case 11:
                ((pyl) obj).u(b2lVar);
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void R(d7l d7lVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wjh) obj).A();
                break;
            case 13:
                e0e e0eVar = (e0e) obj;
                e0eVar.l = null;
                e0eVar.Z();
                break;
            case 29:
                h5l h5lVar = (h5l) obj;
                h5lVar.h = null;
                h5lVar.e0();
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void S(d7l d7lVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wjh) obj).A();
                break;
            case 29:
                ((h5l) obj).Z();
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void T(b2l b2lVar, TabInfo tabInfo) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                if (tabInfo.d != ((d7l) b2lVar).j.a().d) {
                    ((v8a) obj).a();
                    break;
                }
                break;
            case 12:
                ((b0e) obj).k.N();
                break;
            case SizeUtil.textSize2 /* 24 */:
                if (((d7l) b2lVar).j.a().d != tabInfo.d) {
                    ((s9i) obj).b0();
                    break;
                }
                break;
            case 25:
                SessionStore sessionStore = (SessionStore) obj;
                d7l d7lVar = (d7l) b2lVar;
                if (!d7lVar.j.m()) {
                    TabInfo tabInfoA = d7lVar.j.a();
                    N.Mbsb$YyE(sessionStore.a, d7lVar.j.getId(), tabInfoA.a, tabInfoA.b, tabInfoA.c, tabInfoA.d);
                    break;
                }
                break;
            case 28:
                x2l x2lVar = (x2l) obj;
                x2lVar.m.f();
                d7l d7lVar2 = (d7l) b2lVar;
                if (d7lVar2.j.isActive() && tabInfo.d != d7lVar2.j.a().d) {
                    x2lVar.j.r(d7lVar2.j.a().d);
                    break;
                }
                break;
            case 29:
                ((h5l) obj).a0();
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void V(b2l b2lVar, int i) {
        switch (this.a) {
            case 7:
                ((xg) this.b).c(i == 1);
                break;
        }
    }

    public final void W(b2l b2lVar, int i) {
        ukh ukhVar;
        boolean zC = UrlMangler.c(((d7l) b2lVar).j.getUrl());
        boolean z = i == 3;
        boolean z2 = zC || (i == 1 && !UrlMangler.isMangled(((d7l) b2lVar).j.getUrl()));
        p8f p8fVar = (p8f) this.b;
        boolean z3 = z2 && !z;
        ukh ukhVar2 = ukh.e;
        if (z3) {
            ukhVar = new ukh(z3, zC, false, (byte) 0);
            p8fVar.d = ukhVar;
        } else {
            p8fVar.d = ukhVar2;
            ukhVar = ukhVar2;
        }
        ukh ukhVar3 = (ukh) p8fVar.c;
        if (ukhVar3.b || ukhVar == ukhVar2) {
            ukhVar = ukhVar3;
        }
        i7f i7fVar = (i7f) p8fVar.b;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((sbf) g7fVarC.next()).a(ukhVar);
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void e(b2l b2lVar, int i, int i2) {
        switch (this.a) {
            case 21:
                W(b2lVar, i);
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void j(b2l b2lVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 11:
                pyl pylVar = (pyl) obj;
                if (((d7l) pylVar.e) == b2lVar && ((d7l) b2lVar).o0()) {
                    pylVar.m();
                    break;
                }
                break;
            case 17:
                kwf.u(((m66) ((kwf) ((s9i) obj).e).f().c).findItem(2131363823), b2lVar);
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void p(b2l b2lVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 27:
                ((i3j) obj).P(b2lVar);
                break;
            case 29:
                h5l h5lVar = (h5l) obj;
                u2l u2lVar = h5lVar.i;
                if (u2lVar != null) {
                    h5lVar.b.g.setText(((d7l) u2lVar.a).l0());
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void r(d7l d7lVar) {
        switch (this.a) {
            case 3:
                if (d7lVar.j.isActive()) {
                    ((jt3) this.b).a(d7lVar);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void u(b2l b2lVar) {
        switch (this.a) {
            case 11:
                pyl pylVar = (pyl) this.b;
                if (((d7l) pylVar.e) == b2lVar && ((d7l) b2lVar).o0()) {
                    pylVar.m();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void v(b2l b2lVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 17:
                kwf.u(((m66) ((kwf) ((s9i) obj).e).f().c).findItem(2131363823), b2lVar);
                break;
            case 27:
                dxk dxkVar = (dxk) ((i3j) obj).d;
                dxkVar.getClass();
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (dxkVar.l == null) {
                    dxkVar.d.getClass();
                    if (zwk.f() && jUptimeMillis - dxkVar.k >= 3600000) {
                        dxkVar.k = jUptimeMillis;
                        dxkVar.R();
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void x(b2l b2lVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                g5a g5aVar = (g5a) obj;
                kol kolVar = g5aVar.c;
                b2l b2lVar2 = g5aVar.a;
                String strH0 = ((d7l) b2lVar2).h0();
                kolVar.j(new fol(((d7l) b2lVar2).j.getId(), b2lVar2.T(), strH0));
                break;
            case 13:
                ((e0e) obj).Y();
                break;
            case 16:
                ((pgf) obj).b(b2lVar);
                break;
            case 27:
                ((i3j) obj).P(b2lVar);
                break;
            case 29:
                ((h5l) obj).b0();
                break;
        }
    }
}
