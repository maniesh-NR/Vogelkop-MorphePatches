package defpackage;

import J.N;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.opera.android.BrowserActivity;
import com.opera.android.bar.FindInPage;
import com.opera.android.bar.OmniBoxRoot;
import com.opera.android.bar.OmniButtonView;
import com.opera.android.custom_views.ToolbarProgressBar;
import com.opera.android.settings.SettingsManager;
import com.opera.android.widget.UrlFieldEditText;
import java.util.EnumMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class gbf implements czj, w6f {
    public final ode A;
    public final iuh B;
    public final BrowserActivity a;
    public final z43 b;
    public final SettingsManager c;
    public final s9g d;
    public final boolean e;
    public final ydn f;
    public final yz9 g;
    public final k6l h;
    public final View i;
    public final vbf j;
    public final hz4 k;
    public final zaf l;
    public final dbf m;
    public final shf n;
    public final b7f o;
    public final i7f p;
    public final i7f q;
    public final pt3 r;
    public final ay s;
    public final bpd t;
    public FindInPage u;
    public final kze v;
    public hh4 w;
    public boolean x;
    public int y;
    public qt3 z;

    /* JADX WARN: Multi-variable type inference failed */
    public gbf(z43 z43Var, int i, wt3 wt3Var, SettingsManager settingsManager, s9g s9gVar, ydn ydnVar, in3 in3Var, lg lgVar, swf swfVar, s28 s28Var, yz9 yz9Var, k6l k6lVar, View view, hv3 hv3Var, gjm gjmVar, z77 z77Var, nej nejVar, cdn cdnVar, x5f x5fVar, p8f p8fVar, xg xgVar, pt3 pt3Var, wth wthVar, BrowserActivity browserActivity, umi umiVar, pt3 pt3Var2, mdh mdhVar, qdh qdhVar, cul culVar, k5o k5oVar, igi igiVar, pde pdeVar, vx vxVar, wt3 wt3Var2, wt3 wt3Var3, wcd wcdVar, osf osfVar, wok wokVar, u0a u0aVar) {
        Boolean bool = Boolean.FALSE;
        this.o = uup.m(bool);
        this.p = new i7f();
        this.q = new i7f();
        ay ayVar = new ay((Object) this, (byte) 8);
        this.s = ayVar;
        bpd bpdVar = new bpd(this);
        this.t = bpdVar;
        this.v = new kze(bool);
        this.A = new ode();
        this.a = browserActivity;
        this.b = z43Var;
        this.c = settingsManager;
        this.d = s9gVar;
        boolean z = settingsManager.c().b;
        this.e = z;
        this.f = ydnVar;
        this.g = yz9Var;
        this.h = k6lVar;
        this.i = view;
        dbf dbfVar = new dbf(this, umiVar, hv3Var, gjmVar, z77Var, nejVar, cdnVar, x5fVar, wt3Var2, wt3Var3);
        this.m = dbfVar;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(2131363731);
        OmniBoxRoot omniBoxRoot = (OmniBoxRoot) view.findViewById(2131363732);
        iuh iuhVar = new iuh(new ole(osfVar));
        this.B = iuhVar;
        UrlFieldEditText urlFieldEditText = (UrlFieldEditText) omniBoxRoot.findViewById(2131364965);
        boolean zP = z43Var.p();
        omniBoxRoot.getContext();
        this.j = new vbf(i, settingsManager, s9gVar, k6lVar, ydnVar, swfVar, p8fVar, xgVar, in3Var, s28Var, frameLayout, omniBoxRoot, urlFieldEditText, zP, z43Var.o(), z43Var.b(omniBoxRoot, ydnVar, browserActivity, lgVar, settingsManager, wthVar, in3Var, k5oVar, (sw0) igiVar.e, u0aVar), dbfVar, dbfVar, pt3Var, umiVar, mdhVar, qdhVar, culVar, igiVar, pdeVar, vxVar, wcdVar, iuhVar, wokVar);
        this.k = new hz4(z ? 1 : 0, new d8e(wt3Var, (byte) 6), dbfVar, dbfVar, dbfVar, bpdVar, k6lVar, settingsManager, s28Var, umiVar, pt3Var, mdhVar, qdhVar, culVar, xnh.t(omniBoxRoot.getContext()), dbfVar, wcdVar, iuhVar, wokVar, new d8e(u0aVar, (byte) 7));
        ToolbarProgressBar toolbarProgressBar = (ToolbarProgressBar) view.findViewById(2131363061);
        if (toolbarProgressBar == null && (view.getParent() instanceof ViewGroup)) {
            toolbarProgressBar = (ToolbarProgressBar) ((ViewGroup) view.getParent()).findViewById(2131363061);
        }
        this.n = new shf(toolbarProgressBar);
        this.r = pt3Var2;
        zaf zafVar = new zaf(this);
        this.l = zafVar;
        aib.A(k6lVar.w, browserActivity.getLifecycle(), zafVar, new d8e(this, (byte) 8));
        ava.a.a(new yqd(ayVar, (byte) 24));
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.q.b((xvl) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.q.c((xvl) obj);
    }

    @Override // defpackage.czj
    public final void b() {
        this.t.y().b();
    }

    @Override // defpackage.czj
    public final void f() {
        this.t.y().f();
    }

    @Override // defpackage.czj
    public final boolean i() {
        return this.t.y().i();
    }

    public final void k(String str) {
        bpd bpdVar = this.t;
        ((gbf) bpdVar.c).j.k(str);
        upm upmVar = (upm) bpdVar.b;
        if (upmVar != null) {
            upmVar.k(str);
        }
    }

    public final void l(bsi bsiVar, hbf hbfVar) {
        tk0 tk0Var;
        this.z = bsiVar != null ? bsiVar.f : null;
        this.x = bsiVar != null && bsiVar.g;
        this.y = bsiVar != null ? bsiVar.c : 0;
        mbf mbfVar = (mbf) this.m.k.get();
        mbfVar.e.r(hbfVar);
        boolean z = mbfVar.h;
        int iOrdinal = hbfVar.ordinal();
        if (iOrdinal == 0) {
            tk0Var = tk0.c;
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                h9o.p();
                return;
            }
            tk0Var = z ? tk0.d : tk0.e;
        }
        mbfVar.g = tk0Var;
        xf8.F0(mbfVar.c, tk0Var);
        ((LinkedHashSet) this.B.c).clear();
        vbf vbfVar = this.j;
        if (!vbfVar.p()) {
            vbfVar.q();
            vbfVar.r(1L, true);
            vbfVar.l();
            vbfVar.u();
        }
        z43 z43Var = this.b;
        z43Var.s();
        this.o.d(Boolean.TRUE);
        s();
        z43Var.getClass();
        ay ayVar = this.s;
        ((zqi) ayVar.get()).b.f();
        zqi zqiVar = (zqi) ayVar.get();
        if (zqiVar.b.d()) {
            return;
        }
        zqiVar.b.h(bsiVar);
    }

    public final void m(boolean z) {
        qt3 qt3Var = this.z;
        this.z = null;
        z43 z43Var = this.b;
        z43Var.getClass();
        zqi zqiVar = (zqi) this.s.f();
        if (zqiVar != null) {
            mrk mrkVar = zqiVar.b;
            if (mrkVar.d() && mrkVar.d()) {
                qt6 qt6Var = mrkVar.W;
                qt6Var.a = false;
                vml.a((jrk) qt6Var.e);
                ((CoordinatorLayout) mrkVar.y.a).setVisibility(8);
                mrkVar.v.y0();
                mrkVar.u.a(false);
                c1f c1fVar = mrkVar.P;
                if (c1fVar != null) {
                    c1fVar.f(false);
                }
                mrkVar.O.b = false;
                m0a m0aVar = (m0a) ((d8e) mrkVar.G.d.c).invoke();
                m0aVar.d = v08.a;
                m0aVar.a.k();
                m0aVar.b();
                x77 x77Var = mrkVar.q;
                ((gm8) x77Var.c).e();
                eq6 eq6Var = (eq6) x77Var.d;
                if (eq6Var != null) {
                    eq6Var.K();
                }
                x77Var.d = null;
                N.MfA86TKh(mrkVar.J.a);
                iv7 iv7Var = mrkVar.h;
                iv7Var.l--;
                if (!mrkVar.U) {
                    iv7Var.f();
                }
                mrkVar.U = false;
                eyi eyiVar = mrkVar.z;
                if (!eyiVar.b) {
                    eyiVar.b = true;
                    ((mrk) eyiVar.d).b.post((qlk) eyiVar.c);
                }
            }
        }
        vbf vbfVar = this.j;
        if (vbfVar.p()) {
            vbfVar.q();
            vbfVar.r(1L, false);
            if (z) {
                vbfVar.l();
            }
            vbfVar.u();
        }
        u(this.h.o);
        z43Var.u();
        this.o.d(Boolean.FALSE);
        s();
        mbf mbfVar = (mbf) this.m.k.get();
        mbfVar.e.r((Object) null);
        mbfVar.g = null;
        xf8.F0(mbfVar.c, mbfVar.h ? tk0.d : tk0.e);
        if (!z || qt3Var == null) {
            return;
        }
        qt3Var.run();
    }

    public final void n() {
        View view = this.i;
        if (!view.isLaidOut() && q9n.x(view)) {
            q9n.d(new kqd((Object) this, (byte) 13), view);
            return;
        }
        this.j.n();
        Object objF = this.s.f();
        if (objF != null) {
            mrk mrkVar = ((zqi) objF).b;
            c1f c1fVar = mrkVar.P;
            if (c1fVar != null) {
                ((vqk) c1fVar.g).w = false;
                nga ngaVar = (nga) c1fVar.a;
                ((ViewGroup) ngaVar.c).animate().cancel();
                ((ViewGroup) ngaVar.c).animate().translationY(ngaVar.a).setInterpolator(lf1.l).setDuration(0L).start();
            }
            pv7 pv7Var = mrkVar.G.w;
            if (pv7Var != null) {
                pv7Var.d.a();
            }
        }
    }

    public final FindInPage o() {
        if (this.u == null) {
            FindInPage findInPage = (FindInPage) ((ViewStub) this.i.findViewById(2131362967)).inflate();
            this.u = findInPage;
            findInPage.v = new qie((Object) this, (byte) 2);
            new a49(this.a, findInPage, this.h);
        }
        return this.u;
    }

    public final View p() {
        View viewH = this.b.h();
        if (viewH != null) {
            return viewH;
        }
        for (OmniButtonView omniButtonView : ((EnumMap) this.j.r.b).values()) {
            bp bpVar = omniButtonView.g;
            if (bpVar != null && ((uaf) bpVar.b).a == taf.i) {
                return omniButtonView;
            }
        }
        return null;
    }

    public final OmniButtonView q() {
        taf tafVar;
        for (OmniButtonView omniButtonView : ((EnumMap) this.j.r.b).values()) {
            bp bpVar = omniButtonView.g;
            if (bpVar != null && ((tafVar = ((uaf) bpVar.b).a) == taf.l || tafVar == taf.m || tafVar == taf.n)) {
                return omniButtonView;
            }
        }
        return null;
    }

    public final View r() {
        taf tafVar;
        for (OmniButtonView omniButtonView : ((EnumMap) this.j.r.b).values()) {
            bp bpVar = omniButtonView.g;
            if (bpVar != null && ((tafVar = ((uaf) bpVar.b).a) == taf.o || tafVar == taf.p || tafVar == taf.r || tafVar == taf.q)) {
                return omniButtonView;
            }
        }
        return null;
    }

    public final void s() {
        i7f i7fVar = this.p;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((cz3) g7fVarC.next()).b();
        }
    }

    public final void t(boolean z) {
        kze kzeVar = this.v;
        if (((Boolean) kzeVar.g()).booleanValue() != z) {
            hh4 hh4Var = this.w;
            if (hh4Var != null) {
                hh4Var.cancel();
                this.w = null;
            }
            kzeVar.r(Boolean.valueOf(z));
            b2l b2lVar = this.h.o;
            if (z) {
                this.w = ((d7l) b2lVar).j.D(new hpd(this, b2lVar, (byte) 22));
            } else if (this.u != null) {
                o().f();
            }
        }
    }

    public final void u(b2l b2lVar) {
        ((v43) this.b.f).c(b2lVar);
        i7f i7fVar = this.q;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((xvl) g7fVarC.next()).a.o();
        }
    }
}
