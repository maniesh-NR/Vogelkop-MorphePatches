package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.qr.ScanQrCodeActivity;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class dbf extends t0h implements gim, him {
    public final hv3 a;
    public final x5f b;
    public final wt3 c;
    public final umi d;
    public final hv3 e;
    public final gjm f;
    public final z77 g;
    public final nej h;
    public final cdn i;
    public final x5f j;
    public final wt3 k;
    public final wt3 l;
    public oim m;
    public k18 n;
    public cbf o;
    public boolean p;
    public final /* synthetic */ gbf q;

    public dbf(gbf gbfVar, umi umiVar, hv3 hv3Var, gjm gjmVar, z77 z77Var, nej nejVar, cdn cdnVar, x5f x5fVar, wt3 wt3Var, wt3 wt3Var2) {
        this.q = gbfVar;
        this.a = hv3Var;
        this.b = x5fVar;
        this.c = wt3Var;
        this.d = umiVar;
        this.e = hv3Var;
        this.f = gjmVar;
        this.g = z77Var;
        this.h = nejVar;
        this.i = cdnVar;
        this.j = x5fVar;
        this.k = wt3Var;
        this.l = wt3Var2;
    }

    public static boolean u(oim oimVar) {
        return (oimVar == null || oimVar.isFinished()) ? false : true;
    }

    public final void A(qk0 qk0Var) {
        mbf mbfVar = (mbf) this.c.get();
        tk0 tk0Var = (tk0) mbfVar.c.g();
        sk0 sk0Var = (sk0) mbfVar.d.g();
        boolean zBooleanValue = ((Boolean) mbfVar.f.g()).booleanValue();
        x5f x5fVar = this.b;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            ck0 ck0Var = new ck0(zpaVar, x56VarF);
            ((pk0) ck0Var.i.getValue()).a.o(0, 1, 1);
            ck0Var.b(new ha1((Object) qk0Var, (Object) tk0Var, (Object) sk0Var, zBooleanValue, (byte) 2));
            x5fVar.U0(x56VarF);
        }
    }

    public final void B() {
        if (u(this.n)) {
            return;
        }
        gbf gbfVar = this.q;
        bp bpVarI = gbfVar.b.i();
        SettingsManager settingsManager = gbfVar.c;
        s9g s9gVar = gbfVar.d;
        cbf cbfVar = new cbf(this, (byte) 0);
        boolean z = gbfVar.e;
        p0h p0hVar = new p0h(settingsManager, s9gVar);
        umi umiVar = this.d;
        x5f x5fVar = this.j;
        gjm gjmVar = this.f;
        wt3 wt3Var = this.l;
        this.n = bpVarI != null ? new k18(new xzg(bpVarI, umiVar, p0hVar, x5fVar, gjmVar, wt3Var, false, z ? 1 : 0), p0hVar, cbfVar) : new k18(new xzg(null, umiVar, p0hVar, x5fVar, gjmVar, wt3Var, true, z ? 1 : 0), p0hVar, cbfVar);
        b2l b2lVar = gbfVar.h.o;
        if (b2lVar != null) {
            C(b2lVar);
        }
        this.g.a(this.n);
    }

    public final void C(b2l b2lVar) {
        if (u(this.n)) {
            k18 k18Var = this.n;
            tbf tbfVar = this.q.j.t;
            p0h p0hVar = (p0h) k18Var.c;
            p0hVar.e.r(BrowserUtils.getRendererUrl(tbfVar.b.c));
            p0hVar.f.r(tbfVar.a());
            p0hVar.g.r(Boolean.valueOf(tbfVar.b.j));
            p0hVar.e(((d7l) b2lVar).j.y() == null ? 0L : ((d7l) b2lVar).j.y().b);
            d7l d7lVar = (d7l) b2lVar;
            p0hVar.h(d7lVar.j.y() != null ? d7lVar.j.y().a : 0L);
        }
    }

    @Override // defpackage.him
    public final void a(View view) {
        this.b.f0(ph0.d);
        this.a.u(view);
    }

    @Override // defpackage.gim
    public final void b(View view) {
        this.b.f0(ph0.e);
        this.a.k(view);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity, dx3, hjf] */
    public final void v(View view, taf tafVar, boolean z, hbf hbfVar) {
        hv3 hv3Var = this.a;
        ?? r1 = hv3Var.a;
        gbf gbfVar = this.q;
        bpd bpdVar = gbfVar.t;
        gbfVar.s();
        int iOrdinal = tafVar.ordinal();
        x5f x5fVar = this.b;
        hv3 hv3Var2 = this.e;
        switch (iOrdinal) {
            case 0:
                zqi zqiVar = (zqi) gbfVar.s.get();
                mri mriVar = zqiVar.a;
                if (!mriVar.k()) {
                    mriVar.o(zqiVar.c.findViewById(2131363320));
                } else if (mriVar.k()) {
                    mriVar.b();
                }
                A(qk0.g);
                break;
            case 1:
            case 2:
            case 31:
                int iOrdinal2 = tafVar.ordinal();
                if (iOrdinal2 == 1) {
                    A(qk0.h);
                } else if (iOrdinal2 == 2) {
                    A(qk0.f);
                }
                pkk pkkVar = new pkk(tafVar);
                xbf xbfVarG = bpdVar.y().g();
                xbfVarG.getClass();
                xbf.F(xbfVarG, pkkVar, 0, 6);
                break;
            case 3:
                A(qk0.k);
                hv3Var.s();
                break;
            case 4:
                A(qk0.l);
                hv3Var.m();
                break;
            case 5:
                A(qk0.i);
                BrowserActivity browserActivity = hv3Var.a;
                gbf gbfVar2 = browserActivity.M;
                if (gbfVar2 == null) {
                    gbfVar2 = null;
                }
                gbfVar2.l(null, hbfVar);
                gbf gbfVar3 = browserActivity.M;
                (gbfVar3 == null ? null : gbfVar3).b();
                break;
            case 6:
                A(qk0.j);
                int i = ScanQrCodeActivity.k;
                hv3 hv3Var3 = r1.Z0;
                if (!fr3.Q((Context) r1, "android.permission.CAMERA")) {
                    f03.U(r1.j, "android.permission.CAMERA", new rli(r1, hv3Var3));
                    break;
                } else {
                    l5b l5bVar = q9n.c;
                    q9n.v(r1.getWindow());
                    r1.D(new Intent((Context) r1, (Class<?>) ScanQrCodeActivity.class), new qj2(hv3Var3, (byte) 12));
                    break;
                }
            case 7:
                ((gbf) bpdVar.c).j.c();
                upm upmVar = (upm) bpdVar.b;
                if (upmVar != null) {
                    upmVar.c();
                }
                A(qk0.c);
                break;
            case 8:
                b(view);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                A(qk0.n);
                hv3Var.l();
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                A(qk0.m);
                hv3Var.l();
                break;
            case 11:
            case 12:
            case 13:
                B();
                x5fVar.f0(ph0.r);
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                if (!u(this.m)) {
                    z(new s14(gbfVar, this.f, this.i, false, hv3Var2));
                    break;
                }
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                if (!u(this.m)) {
                    z(new pad((byte) 26, gbfVar, hv3Var2, false));
                    break;
                }
                break;
            case 19:
                if (!u(this.m)) {
                    z(new i4d((Object) gbfVar, (byte) 9));
                    break;
                }
                break;
            case SizeUtil.textSize0 /* 20 */:
                A(qk0.p);
                hv3Var.q();
                break;
            case 21:
                A(qk0.q);
                hv3Var.t();
                break;
            case SizeUtil.textSize1 /* 22 */:
                A(qk0.r);
                gbf gbfVar4 = hv3Var.a.M;
                (gbfVar4 == null ? null : gbfVar4).t(true);
                break;
            case 23:
                A(qk0.s);
                hv3Var.n();
                break;
            case SizeUtil.textSize2 /* 24 */:
            case 25:
                boolean z2 = tafVar == taf.z;
                A(qk0.t);
                hv3Var.p(null, z2);
                break;
            case 26:
                A(qk0.v);
                hv3Var.d();
                break;
            case 27:
                A(qk0.w);
                hv3Var.c();
                break;
            case 28:
                A(qk0.B);
                hv3Var.g();
                break;
            case 29:
                A(qk0.x);
                int i2 = BrowserActivity.E1;
                r1.g0();
                break;
            case 30:
                A(qk0.y);
                int i3 = BrowserActivity.E1;
                b2l b2lVarW0 = r1.w0();
                if (b2lVarW0 != null) {
                    ((d7l) b2lVarW0).X();
                    break;
                }
                break;
            case 34:
                A(qk0.z);
                hv3Var.o();
                break;
            case 35:
                A(qk0.u);
                hv3Var.r();
                break;
            case 36:
                A(qk0.R);
                hv3Var.f(hw0.b);
                break;
            case 37:
                A(qk0.N);
                hw0 hw0Var = hw0.a;
                hv3Var.e();
                break;
            case 39:
                A(qk0.S);
                hv3Var.h();
                break;
        }
        if (z) {
            x5fVar.f0(ph0.c);
        }
    }

    public final boolean w(View view, taf tafVar, boolean z) {
        taf tafVar2 = taf.f;
        hv3 hv3Var = this.a;
        if (tafVar == tafVar2) {
            A(qk0.C);
            BrowserActivity browserActivity = hv3Var.a;
            int i = BrowserActivity.E1;
            browserActivity.getClass();
            browserActivity.A1(new xw(view.getContext(), (jbn) browserActivity.y.a.q.get()), view);
            return true;
        }
        if (tafVar == taf.i) {
            a(view);
            return true;
        }
        if (z) {
            this.b.f0(ph0.d);
            hv3Var.u(view);
            return true;
        }
        if (tafVar != taf.a) {
            return false;
        }
        zqi zqiVar = (zqi) this.q.s.get();
        mri mriVar = zqiVar.a;
        if (!mriVar.k()) {
            mriVar.o(zqiVar.c.findViewById(2131363320));
        } else if (mriVar.k()) {
            mriVar.b();
        }
        A(qk0.g);
        return true;
    }

    public final void x(boolean z) {
        gbf gbfVar = this.q;
        ay ayVar = gbfVar.s;
        View view = gbfVar.i;
        if (z) {
            cbf cbfVar = this.o;
            if (cbfVar != null) {
                view.removeCallbacks(cbfVar);
                this.o = null;
            }
            this.p = false;
            ((zqi) ayVar.get()).b.f();
            gbfVar.b.getClass();
            zqi zqiVar = (zqi) ayVar.get();
            if (zqiVar.b.d()) {
                return;
            }
            zqiVar.b.h(null);
            return;
        }
        if (gbfVar.t.y().i()) {
            return;
        }
        byte b = 1;
        if (!this.p) {
            gbfVar.m(true);
            zqi zqiVar2 = (zqi) ayVar.get();
            mri mriVar = zqiVar2.a;
            if (mriVar.k()) {
                mriVar.b();
            }
            zqiVar2.b.b();
            return;
        }
        this.p = false;
        cbf cbfVar2 = this.o;
        if (cbfVar2 != null) {
            view.removeCallbacks(cbfVar2);
        }
        cbf cbfVar3 = new cbf(this, b);
        this.o = cbfVar3;
        view.postOnAnimationDelayed(cbfVar3, 220L);
    }

    public final boolean y() {
        gbf gbfVar = this.q;
        View view = gbfVar.i;
        boolean zP = gbfVar.j.p();
        bpd bpdVar = gbfVar.t;
        if (zP) {
            bpdVar.y().f();
            return false;
        }
        upm upmVarY = bpdVar.y();
        gbfVar.l(null, hbf.b);
        upm upmVarY2 = bpdVar.y();
        if (upmVarY2 == upmVarY) {
            bpdVar.y().f();
            return false;
        }
        int iL = upmVarY.a().L();
        view.requestLayout();
        q9n.d(new g00(upmVarY2, iL, (byte) 5), view);
        return true;
    }

    public final void z(ebf ebfVar) {
        boolean z = this.q.e;
        ijm ijmVar = ijm.b;
        if (z) {
            xq3 xq3Var = new xq3(ebfVar);
            this.m = xq3Var;
            nej nejVar = this.h;
            nejVar.getClass();
            nejVar.b(xq3Var, ijmVar);
            return;
        }
        qvl qvlVar = new qvl(ebfVar);
        this.m = qvlVar;
        z77 z77Var = this.g;
        z77Var.getClass();
        z77Var.b(qvlVar, ijmVar);
    }
}
