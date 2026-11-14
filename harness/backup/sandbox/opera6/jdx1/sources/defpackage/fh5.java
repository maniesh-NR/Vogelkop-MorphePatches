package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fh5 {
    public final View a;
    public boolean b;
    public zh5 c;
    public ndc d;
    public rki e;
    public w7n f;
    public final b0b g;
    public final zyh h;
    public final Configuration i;
    public final t0g j;
    public final o21 k;
    public final tb1 l;
    public final g31 m;
    public final f31 n;
    public final v61 o;
    public final t0g p;
    public final fgg q;
    public final bc1 r;
    public final o3c s;
    public final h7c t;
    public final pjn u;
    public int v;
    public final r94 w;
    public ra1 x;
    public final eh5 y;

    public fh5(fh5 fh5Var, View view, zh5 zh5Var, ndc ndcVar, rki rkiVar, w7n w7nVar) {
        boolean zA = Intrinsics.a(fh5Var != null ? fh5Var.a.getContext() : null, view.getContext());
        this.a = view;
        this.c = zh5Var;
        this.d = ndcVar;
        this.e = rkiVar;
        this.f = w7nVar;
        this.g = zA ? fh5Var.g : new b0b();
        this.h = fh5Var != null ? fh5Var.h : new zyh();
        Configuration configuration = zA ? fh5Var.i : new Configuration(view.getContext().getResources().getConfiguration());
        this.i = configuration;
        this.j = zA ? fh5Var.j : hyg.k(new Configuration(configuration));
        this.k = zA ? fh5Var.k : new o21(view.getContext());
        this.l = zA ? fh5Var.l : new tb1(view.getContext(), (byte) 0);
        g31 g31Var = zA ? fh5Var.m : new g31(view.getContext());
        this.m = g31Var;
        this.n = zA ? fh5Var.n : new f31(g31Var);
        this.o = zA ? fh5Var.o : new v61(view.getContext());
        this.p = zA ? fh5Var.p : new t0g(mkh.o(view.getContext()), ujp.n);
        this.q = view == (fh5Var != null ? fh5Var.a : null) ? fh5Var.q : new fgg(view);
        this.r = zA ? fh5Var.r : new bc1(ViewConfiguration.get(view.getContext()));
        this.s = fh5Var != null ? fh5Var.s : new o3c();
        this.t = new h7c();
        this.u = fh5Var != null ? fh5Var.u : new pjn((byte) 22);
        this.w = new r94(this, (byte) 13);
        this.y = new eh5(this);
    }

    public final void a(v31 v31Var, ue5 ue5Var, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(123858079);
        int i2 = (vt9Var.h(v31Var) ? 4 : 2) | i | (vt9Var.h(ue5Var) ? 32 : 16) | (vt9Var.h(this) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        if (vt9Var.N(i2 & 1, (i2 & 147) != 146)) {
            Object tag = v31Var.getTag(2131363223);
            Set set = null;
            Set set2 = (!(tag instanceof Set) || ((tag instanceof ptb) && !(tag instanceof utb))) ? null : (Set) tag;
            if (set2 == null) {
                Object parent = v31Var.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(2131363223) : null;
                if ((tag2 instanceof Set) && (!(tag2 instanceof ptb) || (tag2 instanceof utb))) {
                    set = (Set) tag2;
                }
            } else {
                set = set2;
            }
            if (set != null) {
                set.add(vt9Var.v());
                vt9Var.q = true;
                vt9Var.C = true;
                vt9Var.c.c();
                vt9Var.H.c();
                lqj lqjVar = vt9Var.I;
                iqj iqjVar = lqjVar.a;
                lqjVar.e = iqjVar.j;
                lqjVar.f = iqjVar.k;
            }
            boolean zF = vt9Var.f(v31Var);
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (zF || objK == zpaVar) {
                objK = new h9n(v31Var);
                vt9Var.g0(objK);
            }
            h9n h9nVar = (h9n) objK;
            hp7 hp7Var = tuc.a;
            e();
            k7h k7hVarA = hp7Var.a(this.d);
            g7h g7hVar = ovc.a;
            e();
            k7h k7hVarA2 = g7hVar.a(this.e);
            k7h k7hVarA3 = j41.d.a(this.g);
            k7h k7hVarA4 = j41.e.a(this.h);
            hp7 hp7Var2 = mi5.v;
            boolean zH = vt9Var.h(this);
            Object objK2 = vt9Var.K();
            if (zH || objK2 == zpaVar) {
                objK2 = new wg5(this, (byte) 1);
                vt9Var.g0(objK2);
            }
            k7h k7hVarC = hp7Var2.c((Function1) objK2);
            k7h k7hVarA5 = j41.b.a(v31Var.getContext());
            k7h k7hVarA6 = dab.a.a(set);
            k7h k7hVarA7 = j41.a.a((Configuration) v31Var.F.getValue());
            hp7 hp7Var3 = xji.a;
            boolean zH2 = vt9Var.h(v31Var);
            Object objK3 = vt9Var.K();
            if (zH2 || objK3 == zpaVar) {
                objK3 = new h31(v31Var, (byte) 3);
                vt9Var.g0(objK3);
            }
            k7h k7hVarC2 = hp7Var3.c((Function1) objK3);
            k7h k7hVarA8 = j41.f.a(v31Var);
            hp7 hp7Var4 = mi5.x;
            boolean zH3 = vt9Var.h(v31Var);
            Object objK4 = vt9Var.K();
            if (zH3 || objK4 == zpaVar) {
                objK4 = new h31(v31Var, (byte) 4);
                vt9Var.g0(objK4);
            }
            kfo.d(new k7h[]{k7hVarA, k7hVarA2, k7hVarA3, k7hVarA4, k7hVarC, k7hVarA5, k7hVarA6, k7hVarA7, k7hVarC2, k7hVarA8, hp7Var4.c((Function1) objK4), mi5.t.a(v31Var.o().r), hha.a.a(h9nVar)}, gyg.P(1317454175, new dh5(v31Var, this, ue5Var), vt9Var), vt9Var, 56);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new dh5(this, v31Var, ue5Var, i);
        }
    }

    public final void b() {
        int i = this.v - 1;
        this.v = i;
        if (i < 0) {
            i = 0;
            this.v = 0;
        }
        if (i == 0) {
            View view = this.a;
            Context context = view.getContext();
            eh5 eh5Var = this.y;
            context.unregisterComponentCallbacks(eh5Var);
            h7c h7cVar = this.t;
            if (h7cVar.b == null) {
                h7cVar.a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(eh5Var);
        }
    }

    public final void c() {
        int i = this.v + 1;
        this.v = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            eh5 eh5Var = this.y;
            context.registerComponentCallbacks(eh5Var);
            d(view.getResources().getConfiguration());
            boolean zHasWindowFocus = view.hasWindowFocus();
            h7c h7cVar = this.t;
            h7cVar.c.setValue(Boolean.valueOf(zHasWindowFocus));
            t0g t0gVar = h7cVar.b;
            r94 r94Var = this.w;
            if (t0gVar == null) {
                h7cVar.a = r94Var;
            }
            if (t0gVar != null) {
                t0gVar.setValue(r94Var.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(eh5Var);
        }
    }

    public final void d(Configuration configuration) {
        int iUpdateFrom = this.i.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.g.a.entrySet().iterator();
            while (it.hasNext()) {
                zza zzaVar = (zza) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (zzaVar == null || Configuration.needNewResources(iUpdateFrom, zzaVar.b)) {
                    it.remove();
                }
            }
            this.j.setValue(new Configuration(configuration));
            zyh zyhVar = this.h;
            synchronized (zyhVar) {
                zyhVar.a.a();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.p.setValue(mkh.o(this.a.getContext()));
            }
            if ((iUpdateFrom & 805248384) != 0) {
                h7c h7cVar = this.t;
                r94 r94Var = this.w;
                t0g t0gVar = h7cVar.b;
                if (t0gVar != null) {
                    t0gVar.setValue(r94Var.invoke());
                }
            }
        }
    }

    public final void e() {
        if (this.b) {
            return;
        }
        this.b = true;
        zh5 zh5Var = this.c;
        View view = this.a;
        if (zh5Var == null) {
            zh5 zh5VarA = z3o.a(view);
            if (zh5VarA == null) {
                Object parent = view.getParent();
                while (zh5VarA == null && (parent instanceof View)) {
                    View view2 = (View) parent;
                    zh5VarA = z3o.a(view2);
                    parent = y7h.h(view2);
                }
            }
            if (zh5VarA == null) {
                zh5VarA = z3o.b(view);
            }
            this.c = zh5VarA;
        }
        if (this.d == null) {
            ndc ndcVarJ = z7h.j(view);
            if (ndcVarJ == null) {
                qp2.n("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            this.d = ndcVarJ;
        }
        if (this.e == null) {
            rki rkiVarE = b8h.e(view);
            if (rkiVarE == null) {
                qp2.n("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return;
            }
            this.e = rkiVarE;
        }
        if (this.f == null) {
            this.f = w8h.k(view);
        }
    }
}
