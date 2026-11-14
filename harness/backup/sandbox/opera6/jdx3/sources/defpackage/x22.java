package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.widget.ThemeableLottieAnimationView;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public abstract class x22 implements w6f {
    public final BrowserActivity a;
    public final k6l b;
    public final tcc c;
    public final dll d;
    public final esk e;
    public final rvg f;
    public final ViewGroup g;
    public final wv1 h;
    public final y22 i;
    public final zyk j;
    public final zyk k;
    public final mrn l;
    public final nrl m;
    public r22 n;
    public final i7f o;
    public final l32 p;
    public final qz q;
    public final n22 r;
    public final rw0 s;
    public final SparseArray t;
    public sba u;

    public x22(BrowserActivity browserActivity, k6l k6lVar, tcc tccVar, dll dllVar, esk eskVar, rvg rvgVar, Lazy lazy, ViewGroup viewGroup, wv1 wv1Var, y22 y22Var, esk eskVar2, j4c j4cVar, qim qimVar) {
        this.a = browserActivity;
        this.b = k6lVar;
        this.c = tccVar;
        this.d = dllVar;
        this.e = eskVar;
        this.f = rvgVar;
        this.g = viewGroup;
        this.h = wv1Var;
        this.i = y22Var;
        byte b = 0;
        this.j = z4c.b(new i22(this, b));
        byte b2 = 1;
        this.k = z4c.b(new i22(this, b2));
        this.l = new mrn(lazy, rvgVar, new tw2((Object) this, (byte) 8), new bi(this, (byte) 21), eskVar2);
        i22 i22Var = new i22(this, (byte) 2);
        i22 i22Var2 = new i22(this, (byte) 3);
        nrl nrlVar = new nrl();
        nrlVar.b = rvgVar;
        ((FrameLayout) rvgVar.b).addOnLayoutChangeListener(new z22(i22Var2, b));
        a32 a32Var = new a32(nrlVar, i22Var, i22Var2, b);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(viewGroup, a32Var);
        this.m = nrlVar;
        this.o = new i7f();
        this.p = (l32) j4cVar.get();
        this.q = new qz(this, b2);
        this.r = new n22(this);
        this.s = new rw0(this, b2);
        m22 m22Var = new m22(this);
        this.t = new SparseArray();
        tccVar.a(m22Var);
        qimVar.r.b(new j22(this, b));
        View view = (LinearLayout) rvgVar.p;
        z61 z61Var = new z61();
        if (view.isAttachedToWindow()) {
            z61Var.onViewAttachedToWindow(view);
        }
        view.addOnAttachStateChangeListener(z61Var);
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.o.b((bx0) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.o.c((bx0) obj);
    }

    public abstract r22 a(b2l b2lVar, m02 m02Var, v22 v22Var, u22 u22Var, q2 q2Var);

    public final void b(b2l b2lVar, Function1 function1) {
        s62 s62VarH;
        u42 u42Var;
        v22 v22VarG = g(b2lVar);
        if (v22VarG == null) {
            p0i p0iVar = t0i.b;
            function1.invoke(new t0i(new q0i(new IllegalStateException(""))));
            return;
        }
        k22 k22Var = new k22(function1, (byte) 0);
        r22 r22Var = v22VarG.h;
        if (r22Var == null || (s62VarH = r22Var.h()) == null || (u42Var = (u42) s62VarH.s.g()) == null) {
            return;
        }
        s62VarH.c().b(u42Var.c.a, new q3(k22Var, s62VarH, (byte) 18));
    }

    public final mlj c() {
        return (mlj) this.j.getValue();
    }

    public final v22 e(b2l b2lVar) {
        v22 v22VarG = g(b2lVar);
        if (v22VarG != null) {
            return v22VarG;
        }
        v22 v22Var = new v22(this, b2lVar);
        this.t.put(((d7l) b2lVar).j.getId(), v22Var);
        return v22Var;
    }

    public final void f(vsn vsnVar, hsn hsnVar) {
        s62 s62Var = vsnVar.c;
        boolean zA = Intrinsics.a(hsnVar, fsn.a);
        fp1 fp1Var = this.a;
        if (zA) {
            z5i.t0(fp1Var, s62Var.f().d(), c());
            return;
        }
        if (hsnVar instanceof esn) {
            c().a(((esn) hsnVar).a, 5000);
            return;
        }
        if (Intrinsics.a(hsnVar, fsn.b)) {
            z5i.u0(fp1Var, s62Var.f().d());
        } else if (hsnVar instanceof gsn) {
            c().b(((gsn) hsnVar).a, 5000, new rxh(2132020924), new pa((Object) vsnVar, (byte) 26));
        } else {
            if (hsnVar == null) {
                return;
            }
            h9o.p();
        }
    }

    public final v22 g(b2l b2lVar) {
        return (v22) this.t.get(((d7l) b2lVar).j.getId());
    }

    public void h(r22 r22Var) {
        r22Var.g().l.r(ng.a);
        if (!((Boolean) r22Var.h().t.g()).booleanValue()) {
            r22Var.h().k(z52.x);
        }
        r22Var.g().e(nv0.d, csn.a, null);
        r22Var.l();
        ode odeVar = r22Var.g().c.f().i;
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

    public final void i(xrn xrnVar) {
        if (w22.a[xrnVar.ordinal()] == 1) {
            c().a(new rxh(2132020435), 2500);
        } else {
            h9o.p();
        }
    }

    public boolean j(String str) {
        return z5i.a0(str);
    }

    public boolean k(GURL gurl) {
        return z5i.b0(gurl);
    }
}
