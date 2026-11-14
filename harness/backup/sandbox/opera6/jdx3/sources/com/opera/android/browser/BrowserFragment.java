package com.opera.android.browser;

import J.N;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.r;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.browser.chromium.ChromiumAdDelegate;
import com.opera.android.browser.chromium.ChromiumContainerView;
import com.opera.android.browser.chromium.OperaBrowserContext;
import com.opera.android.settings.SettingsManager;
import defpackage.aal;
import defpackage.ac8;
import defpackage.ala;
import defpackage.ami;
import defpackage.az3;
import defpackage.azn;
import defpackage.b2l;
import defpackage.b59;
import defpackage.b7f;
import defpackage.bg1;
import defpackage.bi2;
import defpackage.bz3;
import defpackage.ckf;
import defpackage.d7l;
import defpackage.dj9;
import defpackage.e00;
import defpackage.eq6;
import defpackage.eq9;
import defpackage.fv2;
import defpackage.g1j;
import defpackage.g7f;
import defpackage.grf;
import defpackage.gwi;
import defpackage.h7f;
import defpackage.hwf;
import defpackage.hz4;
import defpackage.iga;
import defpackage.io7;
import defpackage.ivn;
import defpackage.j4c;
import defpackage.j6l;
import defpackage.jv0;
import defpackage.k6l;
import defpackage.koi;
import defpackage.ks3;
import defpackage.l6l;
import defpackage.ld7;
import defpackage.lpe;
import defpackage.ltc;
import defpackage.m6l;
import defpackage.no7;
import defpackage.nw3;
import defpackage.nx3;
import defpackage.oml;
import defpackage.owe;
import defpackage.ox3;
import defpackage.px3;
import defpackage.q6e;
import defpackage.q9n;
import defpackage.qke;
import defpackage.qp2;
import defpackage.qx3;
import defpackage.r9i;
import defpackage.rc6;
import defpackage.rx3;
import defpackage.sv3;
import defpackage.sx3;
import defpackage.t5d;
import defpackage.tgi;
import defpackage.tw2;
import defpackage.tx3;
import defpackage.u7;
import defpackage.umi;
import defpackage.vml;
import defpackage.vp5;
import defpackage.vx;
import defpackage.vzk;
import defpackage.wd7;
import defpackage.x5f;
import defpackage.xbf;
import defpackage.xnh;
import defpackage.xw3;
import defpackage.y0h;
import defpackage.ysl;
import defpackage.z0h;
import defpackage.z2g;
import defpackage.zy4;
import defpackage.zz2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.chromium.components.embedder_support.view.ContentViewRenderView;
import org.chromium.ui.base.WindowAndroid;

/* loaded from: classes.dex */
public class BrowserFragment extends Fragment {
    public SettingsManager a;
    public vp5 e;
    public k6l g;
    public xbf h;
    public hz4 i;
    public az3 j;
    public aal k;
    public FrameLayout l;
    public int m;
    public int n;
    public int o;
    public ChromiumContainerView p;
    public boolean q;
    public ami r;
    public oml t;
    public BannerBlockerHelper u;
    public ChromiumAdDelegate v;
    public ujp w;
    public sx3 x;
    public final sv3 b = new sv3(this, (byte) 2);
    public final tx3 c = new tx3(this);
    public final b7f d = new b7f(null, false);
    public final rc6 f = new rc6((byte) 1);
    public final px3 s = new px3(this, 0);

    public final BrowserFragmentFrameLayout f0() {
        return (BrowserFragmentFrameLayout) super.getView();
    }

    public final void g0() {
        if (this.q || ((BrowserFragmentFrameLayout) super.getView()) == null) {
            return;
        }
        i0(false);
    }

    public final View getView() {
        return (BrowserFragmentFrameLayout) super.getView();
    }

    public final void h0(boolean z) {
        if (this.q != z) {
            this.q = z;
            if (z) {
                i0(true);
            } else {
                new oml(vml.d.d(new fv2(this, (byte) 21))).b(null, 100L, TimeUnit.MILLISECONDS, null);
            }
        }
    }

    public final void i0(boolean z) {
        this.q = z;
        this.l.findViewById(2131362116).setVisibility(z ? 0 : 8);
    }

    public final void j0(b2l b2lVar, int i) {
        if (i != 2) {
            d7l d7lVar = (d7l) b2lVar;
            if (d7lVar.O() || d7lVar.j.c0()) {
                return;
            }
            h0(true);
            px3 px3Var = this.s;
            d7lVar.H(px3Var);
            d7lVar.F(px3Var);
            oml omlVar = this.t;
            if (omlVar != null) {
                omlVar.cancel(false);
            }
            oml omlVar2 = new oml(vml.d.d(new bi2(this, d7lVar, (byte) 21)));
            this.t = omlVar2;
            omlVar2.b(null, 5L, TimeUnit.SECONDS, null);
        }
    }

    public final void k0() {
        ChromiumContainerView chromiumContainerView = this.p;
        boolean zC = getActivity().S().c();
        zy4 zy4Var = chromiumContainerView.b;
        if (zC != zy4Var.n) {
            zy4Var.n = zC;
            zy4Var.T();
            chromiumContainerView.requestApplyInsets();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g.z();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.app.Activity, dx3, java.lang.Object, t5d] */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ?? r3 = (t5d) getActivity();
        this.w = new ujp((byte) 25);
        this.j = new az3(r3.Z(), r3.S(), r3.v);
        iga activity = getActivity();
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) r3.getApplication();
        this.i = new hz4(r3, r3.Z(), r3.S(), (tgi) r3.n.j.get(), r3.j, new xw3(r3, (byte) 0), new xw3(r3, (byte) 1), r3.K(), r3.H(), new qp2((byte) 20), operaApplication.I(), operaApplication.L().c, r3.O(), r3.T(), r3.J(), r3.F(), operaApplication.J(), operaApplication.d());
        OperaApplication operaApplication2 = (OperaApplication) r3.getApplication();
        SettingsManager settingsManagerJ = operaApplication2.J();
        this.a = settingsManagerJ;
        this.v = new ChromiumAdDelegate(settingsManagerJ);
        this.u = new BannerBlockerHelper(this.a);
        r activity2 = getActivity();
        umi umiVar = vml.d;
        b59 b59VarL = w1h.l(activity2, umiVar, "BrowserFragmentPrefs", new bg1[0]);
        hz4 hz4Var = this.i;
        SettingsManager settingsManager = this.a;
        Objects.requireNonNull(settingsManager);
        xbf xbfVar = new xbf(new vzk(b59VarL, hz4Var, new nx3(settingsManager, (byte) 0)), activity, this.f, new tw2((Object) this, (byte) 14));
        this.h = xbfVar;
        Lazy lazyK = r3.s().k();
        SettingsManager settingsManager2 = this.a;
        r activity3 = getActivity();
        eq6 eq6Var = new eq6();
        eq6Var.a = (grf) no7.n(activity3, io7.l, grf.k);
        this.g = new k6l(this, umiVar, xbfVar, lazyK, settingsManager2, eq6Var, new nw3(operaApplication2, (byte) 28), (hwf) no7.n(operaApplication2.getApplicationContext(), io7.g, hwf.k), new nw3(operaApplication2, (byte) 29), xnh.t(operaApplication2), new ox3(operaApplication2, (byte) 0), new qp2((byte) 21), new ox3(operaApplication2, (byte) 1), ((lpe) operaApplication2.A.get()).p, dj9.t(operaApplication2.getApplicationContext()), operaApplication2.H);
        m6l m6lVar = (m6l) ((OperaApplication) r3.getApplication()).r.e1.get();
        k6l k6lVar = this.g;
        l6l l6lVar = m6lVar.b;
        ode odeVar = m6lVar.a;
        k6l k6lVar2 = (k6l) odeVar.g();
        if (k6lVar2 != null) {
            k6lVar2.H(l6lVar);
        }
        odeVar.r(k6lVar);
        k6lVar.F(l6lVar);
        this.g.F(new rx3(this));
        this.g.b(new px3(this, (byte) 1));
        k6l k6lVar3 = this.g;
        vp5 vp5Var = new vp5(k6lVar3, this.j.a);
        this.e = vp5Var;
        this.r = new ami(umiVar, this, vp5Var, k6lVar3, new vx(r3, (byte) 15));
        new y0h(getActivity(), this.g, operaApplication2.L().c);
        r activity4 = getActivity();
        k6l k6lVar4 = this.g;
        z0h z0hVar = new z0h();
        z0hVar.a = gwi.a(activity4);
        k6lVar4.F(z0hVar);
        b2l b2lVar = k6lVar4.o;
        if (b2lVar != null && ((d7l) b2lVar).j.m()) {
            z0hVar.a(true);
        }
        new r9i(this.g, this.a);
        this.x = new sx3(this.a);
        getLifecycle().a(this.x);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            qx3 qx3Var = new qx3(this.g);
            if (i >= 31) {
                r3.t = new koi(qx3Var.a);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(2131558569, viewGroup, false);
        this.l = frameLayout;
        q9n.f(frameLayout, new u7(this, (byte) 24));
        ChromiumContainerView chromiumContainerViewE0 = getActivity().e0();
        this.p = chromiumContainerViewE0;
        WindowAndroid windowAndroid = getActivity().j;
        ckf ckfVar = chromiumContainerViewE0.a;
        ckfVar.f(windowAndroid);
        windowAndroid.h = (SurfaceView) ((ContentViewRenderView) ckfVar).c.a;
        hz4 hz4Var = this.i;
        ChromiumContainerView chromiumContainerView = this.p;
        az3 az3Var = this.j;
        b7f b7fVar = this.x.b;
        hz4Var.e = az3Var;
        t5d t5dVar = (t5d) hz4Var.c;
        ysl yslVar = az3Var.a;
        ivn ivnVar = (ivn) hz4Var.j;
        g1j g1jVar = (g1j) hz4Var.k;
        q6e q6eVar = (q6e) hz4Var.m;
        x5f x5fVar = (x5f) hz4Var.n;
        jv0 jv0Var = (jv0) hz4Var.r;
        SettingsManager settingsManager = hz4Var.b;
        e00 e00Var = (e00) hz4Var.t;
        ala alaVar = new ala();
        alaVar.a = new HashMap();
        alaVar.b = t5dVar;
        alaVar.c = yslVar;
        alaVar.d = chromiumContainerView;
        alaVar.e = ivnVar;
        alaVar.f = g1jVar;
        alaVar.g = q6eVar;
        alaVar.h = x5fVar;
        alaVar.i = this.d;
        alaVar.j = b7fVar;
        alaVar.k = jv0Var;
        alaVar.l = e00Var;
        hz4Var.s = alaVar;
        vp5 vp5Var = this.e;
        ChromiumContainerView chromiumContainerView2 = this.p;
        vp5Var.f = chromiumContainerView2;
        vp5Var.c = chromiumContainerView2.getVisibility();
        getActivity().S().a(this.b);
        SettingsManager settingsManager2 = this.a;
        tx3 tx3Var = this.c;
        settingsManager2.F(tx3Var);
        int iA = tx3Var.a();
        tx3Var.a = iA;
        BrowserFragment browserFragment = tx3Var.b;
        az3 az3Var2 = browserFragment.j;
        boolean z = iA != 0;
        if (az3Var2.i != z) {
            az3Var2.i = z;
            az3Var2.N(3, false);
        }
        ChromiumContainerView chromiumContainerView3 = browserFragment.p;
        if (chromiumContainerView3 != null) {
            int i = browserFragment.m;
            int i2 = browserFragment.n;
            int i3 = browserFragment.o;
            int i4 = browserFragment.c.a;
            zy4 zy4Var = chromiumContainerView3.b;
            zy4Var.g = i;
            zy4Var.h = i2;
            zy4Var.i = i3;
            zy4Var.j = i4;
            zy4Var.T();
        }
        return this.l;
    }

    public final void onDestroy() {
        qke qkeVar;
        super.onDestroy();
        oml omlVar = this.t;
        if (omlVar != null) {
            omlVar.cancel(false);
            this.t = null;
        }
        k6l k6lVar = this.g;
        h7f h7fVar = k6lVar.q;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            try {
                ((j6l) g7fVarH.next()).onDestroy();
            } catch (RuntimeException e) {
                ks3.D(e);
            }
        }
        h7fVar.clear();
        ltc ltcVar = k6lVar.f;
        if (ltcVar != null) {
            ltcVar.a.Y(ltcVar);
        }
        azn aznVar = k6lVar.g;
        if (aznVar != null) {
            aznVar.d.H(aznVar);
            aznVar.a.Y(aznVar);
            aznVar.e.v(aznVar);
        }
        z2g z2gVar = k6lVar.h;
        if (z2gVar != null) {
            z2gVar.b.H(z2gVar);
            z2gVar.a.Y(z2gVar);
        }
        ld7 ld7Var = k6lVar.i;
        if (ld7Var != null && (qkeVar = ld7Var.b) != null) {
            qkeVar.Y(ld7Var);
        }
        wd7 wd7Var = k6lVar.j;
        if (wd7Var != null) {
            wd7Var.h = true;
            if (wd7Var.i) {
                wd7Var.i = false;
                wd7Var.d.Y(wd7Var.k);
                wd7Var.e.H(wd7Var.l);
            }
        }
        ld7 ld7Var2 = k6lVar.k;
        if (ld7Var2 != null) {
            ld7Var2.b.Y(ld7Var2);
        }
        k6lVar.s.a.clear();
        ac8.d(k6lVar.r);
        owe.c.H(k6lVar.u);
        ArrayList arrayList = k6lVar.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((d7l) ((b2l) obj)).dispose();
        }
        this.f.a.clear();
        BannerBlockerHelper bannerBlockerHelper = this.u;
        bannerBlockerHelper.a.H(bannerBlockerHelper);
        ChromiumAdDelegate chromiumAdDelegate = this.v;
        chromiumAdDelegate.a.H(chromiumAdDelegate);
        ami amiVar = this.r;
        zz2 zz2Var = (zz2) amiVar.h;
        if (zz2Var != null) {
            zz2Var.a(true);
            amiVar.h = null;
        }
        az3 az3Var = this.j;
        if (az3Var != null) {
            az3Var.f.a(az3Var.g);
            bz3 bz3Var = az3Var.d;
            bz3Var.e = null;
            bz3Var.f = null;
        }
        ChromiumContainerView chromiumContainerView = this.p;
        if (chromiumContainerView != null) {
            ckf ckfVar = chromiumContainerView.a;
            c5o c5oVar = ((ContentViewRenderView) ckfVar).c;
            ((SurfaceView) c5oVar.a).getHolder().removeCallback((yr5) c5oVar.b);
            ((ContentViewRenderView) ckfVar).b = null;
            N.MTwjIV_e(((ContentViewRenderView) ckfVar).a);
            ((ContentViewRenderView) ckfVar).a = 0L;
            ckfVar.j = false;
            this.p = null;
        }
        if (this.w != null) {
            this.w = null;
        }
        this.x = null;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.a.H(this.c);
        eq9 eq9VarS = getActivity().S();
        eq9VarS.c.c(this.b);
    }

    public final void onPause() {
        j4c j4cVar = OperaBrowserContext.b;
        N.MP_D9iRv();
        Iterator it = Collections.unmodifiableList(this.g.b).iterator();
        while (it.hasNext()) {
            ((d7l) ((b2l) it.next())).M(true);
        }
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        b2l b2lVar = this.g.o;
        if (b2lVar != null) {
            ((d7l) b2lVar).show();
        }
    }

    public final void onStop() {
        b2l b2lVar = this.g.o;
        if (b2lVar != null) {
            ((d7l) b2lVar).d();
        }
        super.onStop();
    }
}
