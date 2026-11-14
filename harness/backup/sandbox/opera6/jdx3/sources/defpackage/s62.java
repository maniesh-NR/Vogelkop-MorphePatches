package defpackage;

import J.N;
import android.view.View;
import android.view.ViewGroup;
import com.opera.android.Lazy;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.browser.chromium.contextmenu.ContextMenuHelperBridge;
import com.opera.android.settings.SettingsManager;
import com.opera.android.webcore.WebcoreRpcBridge;
import kotlin.jvm.functions.Function1;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public abstract class s62 implements ndc {
    public r62 A;
    public r62 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final t62 a;
    public final WebContentsWrapper b;
    public final g7m c;
    public final p12 d;
    public final qb e;
    public final esk f;
    public final yv3 g;
    public final zyk h;
    public final zyk i;
    public final zyk j;
    public final zyk k;
    public final wth l;
    public final z m = new z(new m62(this, (byte) 1));
    public final qdc n;
    public final qdc o;
    public final q52 p;
    public final pde q;
    public final c12 r;
    public final ode s;
    public final kze t;
    public final kze u;
    public final u02 v;
    public final r9i w;
    public final g22 x;
    public final eyi y;
    public final zyk z;

    public s62(t62 t62Var, WebContentsWrapper webContentsWrapper, d12 d12Var, wth wthVar, l02 l02Var, Function1 function1, f62 f62Var, SettingsManager settingsManager, Lazy lazy, g7m g7mVar, p12 p12Var, wyn wynVar, ky1 ky1Var, yk6 yk6Var, a52 a52Var, qb qbVar, esk eskVar, Function1 function12, r2 r2Var, yv3 yv3Var) {
        byte b;
        c12 c12Var;
        tcc lifecycle;
        this.a = t62Var;
        this.b = webContentsWrapper;
        this.c = g7mVar;
        this.d = p12Var;
        this.e = qbVar;
        this.f = eskVar;
        this.g = yv3Var;
        byte b2 = 3;
        this.h = z4c.b(new hv(this, a52Var, function12, b2));
        this.i = z4c.b(new k62(this, b2));
        byte b3 = 4;
        this.j = z4c.b(new k62(this, b3));
        this.k = z4c.b(new x2((Object) this, (Object) lazy, (byte) 23));
        this.l = wthVar;
        qdc qdcVar = new qdc(this, true);
        this.n = qdcVar;
        this.o = qdcVar;
        q52 q52Var = (q52) function1.invoke(this);
        this.p = q52Var;
        pde pdeVar = new pde(new r52(0L, false));
        this.q = pdeVar;
        switch (f62Var.a) {
            case 0:
                b = 0;
                c12Var = new c12(f62Var.b, f62Var.c, q52Var, uyg.e(f62Var.d, "ga_usage_statistics", new f32(b3)), pdeVar, false, f62Var.e);
                break;
            default:
                boolean z = f62Var.b;
                yk6 yk6Var2 = f62Var.c;
                SettingsManager settingsManager2 = f62Var.d;
                ekc ekcVar = f62Var.e;
                tsd tsdVarE = uyg.e(settingsManager2, "ga_usage_statistics", new f32(b2));
                b = 0;
                c12Var = new c12(z, yk6Var2, q52Var, tsdVarE, pdeVar, true, ekcVar);
                break;
        }
        this.r = c12Var;
        this.s = new ode((Object) null);
        this.t = new kze(Boolean.FALSE);
        this.u = new kze(x52.a);
        c12 c12Var2 = c12Var;
        byte b4 = b;
        u02 u02Var = new u02(d12Var, wthVar, l02Var, c12Var2, new ab(this, (byte) 17), g7mVar, new t22(this, (byte) 1), new k62(this, b), new k62(this, (byte) 1), new pjn(this, (byte) 12), wynVar, yk6Var, a52Var, r2Var);
        this.v = u02Var;
        this.w = new r9i(webContentsWrapper.e(), u02Var);
        this.x = new g22(b4);
        this.y = new eyi(webContentsWrapper.e().m(), settingsManager);
        this.z = z4c.b(new x2((Object) ky1Var, (Object) this, (byte) 21));
        wnm wnmVar = c12Var2.i;
        xf8.g0(xf8.B(wnmVar), this, new k9((Object) this, (byte) 9));
        xf8.B(wnmVar).j(this, new ug(new l62(this, (byte) 4), (byte) 6));
        qdcVar.g(qcc.e);
        qdcVar.a(new n62(this, b4));
        dx3 dx3VarC = webContentsWrapper.c();
        if (dx3VarC != null && (lifecycle = dx3VarC.getLifecycle()) != null) {
            lifecycle.a(new n62(this, (byte) 1));
        }
        h();
    }

    public final void a() {
        if (l() || this.A != null) {
            return;
        }
        qyj qyjVarF = f();
        qyjVarF.f();
        qyjVarF.m();
        ode odeVar = this.s;
        u42 u42Var = (u42) odeVar.g();
        if (phj.a0(u42Var != null ? u42Var.a : null)) {
            this.n.e(occ.ON_DESTROY);
            return;
        }
        u42 u42Var2 = (u42) odeVar.g();
        if (phj.a0(u42Var2 != null ? u42Var2.a : null)) {
            a();
            return;
        }
        z zVar = this.m;
        zVar.b = 0;
        zVar.a = false;
        qdc qdcVar = new qdc(this, true);
        qdcVar.g(qcc.c);
        this.A = new r62(odeVar, new ab(new xa(this, qdcVar, (byte) 20), (byte) 18), (byte) 0);
        zVar.t(qdcVar);
    }

    public abstract void b(l62 l62Var);

    public final p62 c() {
        return (p62) this.h.getValue();
    }

    public final ekc d() {
        return (ekc) this.i.getValue();
    }

    public final iy1 e() {
        return (iy1) this.z.getValue();
    }

    public final qyj f() {
        return (qyj) this.k.getValue();
    }

    public abstract ikc g();

    public final tcc getLifecycle() {
        return this.o;
    }

    public final void h() {
        if (this.E) {
            return;
        }
        this.E = true;
        WebContentsWrapper webContentsWrapper = this.b;
        boolean zM = webContentsWrapper.e().m();
        u59 u59Var = new u59(this, (byte) 12);
        WebContents webContentsE = webContentsWrapper.e();
        View view = webContentsWrapper.getView();
        tn tnVar = new tn();
        p12 p12Var = this.d;
        tnVar.b = p12Var;
        tnVar.a = zM;
        tnVar.c = webContentsWrapper;
        tnVar.d = u59Var;
        qs7 qs7Var = (qs7) p12Var.f;
        y55 y55Var = (y55) p12Var.g;
        wln wlnVar = wln.h;
        ContextMenuHelperBridge contextMenuHelperBridge = (ContextMenuHelperBridge) N.Ma9TFgP9(webContentsE);
        ns5 ns5Var = contextMenuHelperBridge != null ? contextMenuHelperBridge.b : null;
        p12Var.h = ns5Var != null ? new os5(ns5Var, (ViewGroup) view, tnVar, qs7Var, y55Var) : new ns5(webContentsE, (ViewGroup) view, tnVar, qs7Var, y55Var, wlnVar);
    }

    public final void j() {
        boolean z = this.D;
        eyi eyiVar = this.y;
        if (z) {
            String str = (String) ((kze) eyiVar.d).g();
            r9i r9iVar = this.w;
            ((WebcoreRpcBridge) r9iVar.d).a(str);
            float fFloatValue = ((Number) g().g()).floatValue();
            long j = ((WebcoreRpcBridge) r9iVar.d).a;
            if (j != 0) {
                N.M0ycnTP5(j, fFloatValue);
            }
        } else {
            ((kze) eyiVar.d).j(this, new ug(new l62(this, (byte) 0), (byte) 6));
            g().j(this, new ug(new l62(this, (byte) 1), (byte) 6));
            this.D = true;
        }
        this.b.i();
    }

    public final void k(z5i z5iVar) {
        r62 r62Var = this.B;
        if (r62Var != null) {
            r62Var.cancel();
        }
        this.t.r(Boolean.FALSE);
        this.B = new r62(this.s, new wx((Object) this, (Object) z5iVar, (byte) 11), (byte) 1);
    }

    public final boolean l() {
        return this.o.i == qcc.a;
    }

    public void m() {
        this.b.b();
    }

    public void n() {
        if (this.C) {
            return;
        }
        this.C = true;
        if (l()) {
            return;
        }
        this.u.r(x52.a);
        b(new l62(this, (byte) 2));
    }
}
