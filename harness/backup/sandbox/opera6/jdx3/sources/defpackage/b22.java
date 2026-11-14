package defpackage;

import android.view.ViewGroup;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.settings.SettingsManager;
import com.opera.android.widget.ThemeableLottieAnimationView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b22 extends x22 {
    public final du3 A;
    public final ji B;
    public final zv3 C;
    public final Lazy D;
    public final j4c E;
    public final rw3 F;
    public final du3 G;
    public final gjm H;
    public final hw3 I;
    public final BrowserActivity v;
    public final tcc w;
    public final zv3 x;
    public final zv3 y;
    public final du3 z;

    public b22(BrowserActivity browserActivity, k6l k6lVar, tcc tccVar, dll dllVar, zv3 zv3Var, zv3 zv3Var2, du3 du3Var, du3 du3Var2, du3 du3Var3, ji jiVar, zv3 zv3Var3, Lazy lazy, rvg rvgVar, Lazy lazy2, ViewGroup viewGroup, wv1 wv1Var, j4c j4cVar, rw3 rw3Var, du3 du3Var4, gjm gjmVar, hw3 hw3Var, y22 y22Var, ji jiVar2, j4c j4cVar2, qim qimVar) {
        super(browserActivity, k6lVar, tccVar, dllVar, du3Var2, rvgVar, lazy2, viewGroup, wv1Var, y22Var, jiVar2, j4cVar2, qimVar);
        this.v = browserActivity;
        this.w = tccVar;
        this.x = zv3Var;
        this.y = zv3Var2;
        this.z = du3Var;
        this.A = du3Var3;
        this.B = jiVar;
        this.C = zv3Var3;
        this.D = lazy;
        this.E = j4cVar;
        this.F = rw3Var;
        this.G = du3Var4;
        this.H = gjmVar;
        this.I = hw3Var;
    }

    @Override // defpackage.x22
    public final r22 a(b2l b2lVar, m02 m02Var, v22 v22Var, u22 u22Var, q2 q2Var) {
        int i;
        ChromiumContent chromiumContentH = uy3.H(b2lVar);
        if (chromiumContentH == null) {
            return null;
        }
        d7l d7lVar = (d7l) b2lVar;
        zg zgVarB = BrowserUtils.b(d7lVar.j.getUrl());
        if (zgVarB == null || (i = zgVarB.a) == 0) {
            i = 2;
        }
        j62 j62Var = (j62) this.x.get();
        boolean zM = d7lVar.j.m();
        f9 f9Var = new f9((Object) this, (Object) m02Var, (Object) q2Var, (byte) 7);
        fp1 fp1Var = j62Var.a;
        gjm gjmVar = j62Var.c;
        yk6 yk6Var = (yk6) j62Var.e.get();
        a52 a52Var = (a52) j62Var.f.get();
        Lazy lazy = j62Var.g;
        xb xbVar = (xb) j62Var.h.b.get();
        SettingsManager settingsManagerJ = j62Var.d.b.J();
        g7m g7mVarB = j62Var.b();
        yv3 yv3Var = j62Var.i;
        qsh qshVar = (qsh) j62Var.j.get();
        wyn wynVar = j62Var.k;
        ky1 ky1Var = (ky1) j62Var.s.get();
        k42 k42Var = (k42) j62Var.l.get();
        l02 l02Var = (l02) j62Var.m.get();
        qb qbVar = (qb) j62Var.n.get();
        r2 r2Var = j62Var.t;
        ekc ekcVar = (ekc) j62Var.u.getValue();
        int i2 = i;
        byte b = 1;
        final xy3 xy3Var = new xy3(chromiumContentH, zM, m02Var, new wth((Object) m02Var, (byte) 10), l02Var, new h62(xbVar, k42Var, b), new f62(zM, yk6Var, settingsManagerJ, ekcVar, (byte) 1), settingsManagerJ, lazy, g7mVarB, new p12(fp1Var, gjmVar, yv3Var, qshVar, g7mVarB), wynVar, ky1Var, yk6Var, a52Var, qbVar, new g62(k42Var, b), this.I, f9Var, r2Var, j62Var.o, fp1Var.getResources());
        new ga7(chromiumContentH.e().J0().b);
        final byte b2 = 1;
        v22Var.getLifecycle().a(new d62(xy3Var, new vy3(this.v, v22Var, new fx0(u22Var, this, (byte) 7), new g9(u22Var, b2lVar, this, (byte) 3), new f23(this, b2lVar, chromiumContentH, (byte) 5), new fx0(this, b2lVar, (byte) 8), this.D, this.z, c(), new wx((Object) this, (Object) b2lVar, (byte) 9), new whf(chromiumContentH, (byte) 7), this.B, g7mVarB, (k42) this.C.get(), (v5n) this.k.getValue(), m02Var, this.H), b2));
        z zVar = xy3Var.m;
        tcc tccVar = this.w;
        zVar.t(tccVar);
        qyj qyjVarF = xy3Var.f();
        qyjVarF.getClass();
        tccVar.a(new ob((Object) qyjVarF, (byte) 16));
        final byte b3 = 0;
        byte b4 = 7;
        vsn vsnVar = new vsn(new ize(Boolean.valueOf(d7lVar.j.m())), r9n.A(this.v), xy3Var, new Function2(this) { // from class: z12
            public final /* synthetic */ b22 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                byte b5 = b3;
                xy3 xy3Var2 = xy3Var;
                b22 b22Var = this.b;
                String str = (String) obj;
                List list = (List) obj2;
                switch (b5) {
                    case 0:
                        new c5o(b22Var.v, (byte) 3).i(list, (o52) xy3Var2.p.c.g(), str);
                        break;
                    default:
                        new c5o(b22Var.v, (byte) 3).E(list, (o52) xy3Var2.p.c.g(), str);
                        break;
                }
                return Unit.a;
            }
        }, new Function2(this) { // from class: z12
            public final /* synthetic */ b22 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                byte b5 = b2;
                xy3 xy3Var2 = xy3Var;
                b22 b22Var = this.b;
                String str = (String) obj;
                List list = (List) obj2;
                switch (b5) {
                    case 0:
                        new c5o(b22Var.v, (byte) 3).i(list, (o52) xy3Var2.p.c.g(), str);
                        break;
                    default:
                        new c5o(b22Var.v, (byte) 3).E(list, (o52) xy3Var2.p.c.g(), str);
                        break;
                }
                return Unit.a;
            }
        }, new vx(this, b4), ((yk6) this.E.get()).k, new q02(this, b4), (urn) this.F.get(), this.G);
        xf8.B(vsnVar.q).j(v22Var, new pb(new y12(this, b3), (byte) 11));
        w7d.i(vsnVar.p, cqp.V(v22Var.f), new c71(this, vsnVar, (mt5) null, (byte) 1));
        tccVar.a(new ob(xy3Var, b2));
        return new a22(this, xy3Var, vsnVar, i2);
    }

    @Override // defpackage.x22
    public final void h(r22 r22Var) {
        if (r22Var instanceof a22) {
            a22 a22Var = (a22) r22Var;
            vsn vsnVar = a22Var.f;
            vsnVar.l.r(ng.a);
            vsnVar.e(a22Var.g == 5 ? nv0.e : nv0.d, csn.a, null);
            r22Var.l();
            ode odeVar = vsnVar.c.f().i;
            mrn mrnVar = this.l;
            ndc ndcVar = mrnVar.z;
            if (ndcVar != null) {
                xbf xbfVar = mrnVar.u;
                if (((vbn) xbfVar.f).i(ndcVar, odeVar)) {
                    return;
                }
                ((vbn) xbfVar.f).destroy();
                plk plkVar = new plk(xbfVar, ndcVar, odeVar);
                xbfVar.f = plkVar;
                o2g o2gVarJ = plkVar.j();
                if (o2gVarJ != ((o2g) xbfVar.c)) {
                    xbfVar.c = o2gVarJ;
                    ((ThemeableLottieAnimationView) xbfVar.b).invalidate();
                    xbfVar.E((s75) o2gVarJ.c, null);
                }
            }
        }
    }
}
