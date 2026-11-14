package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import androidx.core.app.NotificationCompat;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class k3o {
    public static final WeakHashMap x = new WeakHashMap();
    public final zc1 a;
    public final zc1 b;
    public final zc1 c;
    public final zc1 d;
    public final zc1 e;
    public final zc1 f;
    public final zc1 g;
    public final zc1 h;
    public final zc1 i;
    public final i0n j;
    public final t0g k;
    public final tlm l;
    public final tlm m;
    public final i0n n;
    public final i0n o;
    public final i0n p;
    public final i0n q;
    public final i0n r;
    public final i0n s;
    public final i0n t;
    public final boolean u;
    public int v;
    public final w9b w;

    public k3o(View view) {
        zc1 zc1Var = new zc1(4, "captionBar");
        this.a = zc1Var;
        zc1 zc1Var2 = new zc1(NotificationCompat.FLAG_HIGH_PRIORITY, "displayCutout");
        this.b = zc1Var2;
        zc1 zc1Var3 = new zc1(8, "ime");
        this.c = zc1Var3;
        zc1 zc1Var4 = new zc1(32, "mandatorySystemGestures");
        this.d = zc1Var4;
        zc1 zc1Var5 = new zc1(2, "navigationBars");
        this.e = zc1Var5;
        zc1 zc1Var6 = new zc1(1, "statusBars");
        this.f = zc1Var6;
        zc1 zc1Var7 = new zc1(519, "systemBars");
        this.g = zc1Var7;
        zc1 zc1Var8 = new zc1(16, "systemGestures");
        this.h = zc1Var8;
        zc1 zc1Var9 = new zc1(64, "tappableElement");
        this.i = zc1Var9;
        i0n i0nVar = new i0n(new bab(0, 0, 0, 0), "waterfall");
        this.j = i0nVar;
        this.k = hyg.k((Object) null);
        tlm tlmVar = new tlm(new tlm(zc1Var7, zc1Var3), zc1Var2);
        this.l = tlmVar;
        this.m = new tlm(tlmVar, new tlm(new tlm(new tlm(zc1Var9, zc1Var4), zc1Var8), i0nVar));
        this.n = fac.J(4, "captionBarIgnoringVisibility");
        this.o = fac.J(2, "navigationBarsIgnoringVisibility");
        this.p = fac.J(1, "statusBarsIgnoringVisibility");
        this.q = fac.J(519, "systemBarsIgnoringVisibility");
        this.r = fac.J(64, "tappableElementIgnoringVisibility");
        this.s = new i0n(new bab(0, 0, 0, 0), "imeAnimationTarget");
        this.t = new i0n(new bab(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(2131362408) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.u = bool != null ? bool.booleanValue() : false;
        this.w = new w9b(this);
        WeakHashMap weakHashMap = r5n.a;
        g3o g3oVarA = i5n.a(view);
        if (g3oVarA != null) {
            d3o d3oVar = g3oVarA.a;
            zc1Var.f(d3oVar.u(4));
            zc1Var2.f(d3oVar.u(NotificationCompat.FLAG_HIGH_PRIORITY));
            zc1Var3.f(d3oVar.u(8));
            zc1Var4.f(d3oVar.u(32));
            zc1Var5.f(d3oVar.u(2));
            zc1Var6.f(d3oVar.u(1));
            zc1Var7.f(d3oVar.u(519));
            zc1Var8.f(d3oVar.u(16));
            zc1Var9.f(d3oVar.u(64));
        }
    }

    public static void b(k3o k3oVar, g3o g3oVar) {
        boolean z = false;
        k3oVar.a.g(g3oVar, 0);
        k3oVar.c.g(g3oVar, 0);
        k3oVar.b.g(g3oVar, 0);
        k3oVar.e.g(g3oVar, 0);
        k3oVar.f.g(g3oVar, 0);
        k3oVar.g.g(g3oVar, 0);
        k3oVar.h.g(g3oVar, 0);
        k3oVar.i.g(g3oVar, 0);
        k3oVar.d.g(g3oVar, 0);
        k3oVar.n.f(y4h.r(g3oVar.a.j(4)));
        k3oVar.o.f(y4h.r(g3oVar.a.j(2)));
        k3oVar.p.f(y4h.r(g3oVar.a.j(1)));
        k3oVar.q.f(y4h.r(g3oVar.a.j(519)));
        k3oVar.r.f(y4h.r(g3oVar.a.j(64)));
        jb7 jb7VarH = g3oVar.a.h();
        k3oVar.j.f(y4h.r(jb7VarH != null ? jb7VarH.a() : r9b.e));
        d91 d91Var = null;
        if (jb7VarH != null) {
            Path pathN = Build.VERSION.SDK_INT >= 31 ? m41.n(jb7VarH.a) : null;
            if (pathN != null) {
                d91Var = new d91(pathN);
            }
        }
        k3oVar.k.setValue(d91Var);
        synchronized (ytj.c) {
            tee teeVar = ytj.j.h;
            if (teeVar != null) {
                if (teeVar.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            ytj.c();
        }
    }

    public final void a(View view) {
        if (this.v == 0) {
            w9b w9bVar = this.w;
            w9bVar.e = false;
            w9bVar.f = false;
            w9bVar.g = null;
            WeakHashMap weakHashMap = r5n.a;
            h5n.c(view, w9bVar);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(w9bVar);
            n2o.a(view, w9bVar);
        }
        this.v++;
    }
}
