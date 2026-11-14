package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import org.chromium.third_party.android.swiperefresh.SwipeRefreshLayout;

/* loaded from: classes.dex */
public final class xw8 {
    public SparseArray A;
    public igi B;
    public boolean C;
    public boolean D;
    public final boolean E;
    public final FrameLayout a;
    public final bwf b;
    public final boolean c;
    public final boolean d;
    public final tcc e;
    public final y73 f;
    public final RecyclerView g;
    public final ow8 h;
    public final rw8 i;
    public final f92 j;
    public final v82 k;
    public final Object l;
    public final vu8 m;
    public final uv8 n;
    public final kue o;
    public final x5f p;
    public final ete q;
    public final SettingsManager r;
    public final qie s;
    public final cq5 t;
    public final isd u;
    public final pde v;
    public final hv2 w;
    public final ww8 x;
    public final s9i y;
    public final vw8 z;

    /* JADX WARN: Multi-variable type inference failed */
    public xw8(BrowserActivity browserActivity, nue nueVar, kue kueVar, ViewGroup viewGroup, bwf bwfVar, boolean z, SparseArray sparseArray, u37 u37Var, isd isdVar, x5f x5fVar, x5f x5fVar2, umi umiVar, cq5 cq5Var, SettingsManager settingsManager, fqe fqeVar, qie qieVar, View.OnLongClickListener onLongClickListener, kze kzeVar, qq6 qq6Var, pde pdeVar) {
        y73 y73Var = new y73((Object) this, (byte) 2);
        this.f = y73Var;
        v82 v82Var = new v82(this);
        v82 v82Var2 = new v82((byte) 1);
        v82Var2.b = v82Var;
        this.k = v82Var2;
        Object obj = new Object();
        this.l = obj;
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) browserActivity.getApplication();
        tcc lifecycle = browserActivity.getLifecycle();
        this.e = lifecycle;
        au8 au8Var = (au8) operaApplication.w.get();
        this.b = bwfVar;
        this.v = pdeVar;
        this.c = z;
        this.d = "cur_city_id".equals(bwfVar.a());
        this.A = sparseArray;
        this.o = kueVar;
        this.p = x5fVar;
        this.q = (ete) operaApplication.r.f0.get();
        this.r = settingsManager;
        this.s = qieVar;
        this.t = cq5Var;
        this.u = isdVar;
        au8Var.getClass();
        f92 f92Var = (f92) au8Var.a(bwfVar, new ge5(au8Var, bwfVar, (byte) 20));
        this.j = f92Var;
        ow8 ow8Var = new ow8(this, browserActivity.l);
        this.h = ow8Var;
        boolean z2 = false;
        z2 = false;
        this.m = new vu8(ow8Var, f92Var.d(), obj, new nw8(this, z2 ? (byte) 1 : (byte) 0));
        hv2 hv2Var = (hv2) f92Var.e.get();
        this.w = hv2Var;
        if (!hv2Var.h) {
            hv2Var.e();
        }
        this.x = new ww8(hv2Var, new dg7(this, (byte) 16));
        this.z = new vw8(this);
        lifecycle.a(y73Var);
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(viewGroup.getContext()).inflate(2131558832, viewGroup, false);
        this.a = frameLayout;
        RecyclerView recyclerViewFindViewById = frameLayout.findViewById(2131362937);
        this.g = recyclerViewFindViewById;
        new eqh(recyclerViewFindViewById, onLongClickListener);
        recyclerViewFindViewById.t = true;
        recyclerViewFindViewById.D0(u37Var);
        lv2 lv2Var = new lv2((byte) 1);
        lv2Var.g = false;
        recyclerViewFindViewById.B0(lv2Var);
        recyclerViewFindViewById.n(new pw8(this, ViewConfiguration.get(recyclerViewFindViewById.getContext()).getScaledTouchSlop(), new nw8(this, (byte) 1)));
        Context context = frameLayout.getContext();
        rv8.b.getClass();
        h(r9n.i(context).width() > z7h.h(context, 976.0f) ? rv8.GRID : rv8.LIST);
        this.y = new s9i(frameLayout);
        izj izjVarK0 = browserActivity.K0();
        ndc ndcVar = browserActivity;
        fa2 fa2Var = (iu8) au8Var.a(bwfVar, new vw1(au8Var, ndcVar, nueVar, this, kueVar.j, x5fVar, x5fVar2, umiVar, qq6Var));
        if (fa2Var != null) {
            ow8Var.G(fa2Var);
            wy wyVarX0 = ndcVar.x0();
            k5k k5kVar = new k5k(wyVarX0.a, wyVarX0, wyVarX0.j, wyVarX0.b, wyVarX0.i, z);
            x5f x5fVar3 = ((OperaApplication) ndcVar.getApplication()).L().c;
            hx hxVar = new hx((byte) 7);
            int i = ix.o;
            hxVar.a(new hx(kzeVar, z2 ? (byte) 1 : (byte) 0));
            int i2 = mx.H;
            hx hxVar2 = new hx((byte) 1);
            hxVar2.b = kzeVar;
            hxVar.a(hxVar2);
            int i3 = lx.n;
            hxVar.a(new kx(kzeVar, izjVarK0));
            qyf qyfVar = (qyf) ep7.a.get();
            if (qyfVar.a0()) {
                ea2 ea2Var = (ea2) mzg.k((String) qyfVar.a, "createViewHolderFactory", new Class[]{ize.class}, new Object[]{kzeVar});
                Objects.requireNonNull(ea2Var);
                hxVar.a(ea2Var);
            }
            int i4 = eu9.E;
            hxVar.a(new hx(kzeVar, (byte) 4));
            int i5 = l00.D;
            hxVar.a(new kx(x5fVar3, kzeVar));
            int i6 = ix.o;
            hxVar.a(new hx(kzeVar, (byte) 5));
            int i7 = mx.H;
            hxVar.a(new hx(kzeVar, (byte) 6));
            hxVar.a(new da2(no.class, 2131558779, 2131558779, new ox((byte) 0)));
            int i8 = so8.D;
            hxVar.a(new hx(kzeVar, (byte) 3));
            int i9 = ix.o;
            hxVar.a(new hx(kzeVar, (byte) 2));
            ow8Var.G(new eu8(recyclerViewFindViewById, ow8Var, hxVar, k5kVar, wyVarX0));
            Iterator it = Collections.EMPTY_LIST.iterator();
            while (it.hasNext()) {
                ow8Var.G((fa2) it.next());
            }
            qieVar.getClass();
        } else {
            qieVar.getClass();
        }
        r16 r16Var = new r16();
        if (this.c && fa2Var != null) {
            z2 = true;
        }
        this.E = z2;
        if (z2) {
            sz4 sz4Var = ndcVar.h;
            Objects.requireNonNull(sz4Var);
            ow8Var.G(new iw8(ndcVar, sz4Var, browserActivity, this.p, r16Var, this.h));
            ow8Var.G(new ew8(browserActivity, r16Var, this.h, kueVar.i, this.p, fqeVar));
            ow8 ow8Var2 = this.h;
            mw8 mw8Var = new mw8(browserActivity, r16Var, ow8Var2, this.r, this.t, this.p, browserActivity.P0());
            ndcVar = browserActivity;
            ow8Var2.G(mw8Var);
        }
        if (this.d) {
            ow8Var.G(new avc(xuc.class));
        }
        ow8Var.G(this.m);
        uv8 uv8Var = new uv8(this.j.d(), this.l, ow8Var);
        this.n = uv8Var;
        ow8Var.G(uv8Var);
        this.g.y0(this.h);
        kqd kqdVar = fa2Var != null ? new kqd(fa2Var, (byte) 10) : i82.Do;
        u82 u82VarC = this.j.c();
        rw8 rw8Var = new rw8(u82VarC, this.h, kqdVar, new eq6(this));
        this.i = rw8Var;
        u82VarC.a(rw8Var);
        this.v.j(ndcVar, new ks6(this, (byte) 12));
        Context context2 = this.a.getContext();
        rv8.b.getClass();
        h(r9n.i(context2).width() > z7h.h(context2, 976.0f) ? rv8.GRID : rv8.LIST);
    }

    public final void a() {
        SparseArray<Parcelable> sparseArray = this.A;
        if (sparseArray == null) {
            return;
        }
        this.a.restoreHierarchyState(sparseArray);
        u0g u0gVar = (Parcelable) this.A.get(2131361921);
        boolean z = u0gVar instanceof u0g;
        ow8 ow8Var = this.h;
        if (z) {
            ow8Var.I(u0gVar);
        } else {
            ow8Var.I(null);
        }
        this.A = null;
    }

    public final void b() {
        Context context = this.a.getContext();
        rv8.b.getClass();
        h(r9n.i(context).width() > z7h.h(context, 976.0f) ? rv8.GRID : rv8.LIST);
    }

    public final void c(boolean z) {
        this.g.y0((d) null);
        hv2 hv2Var = this.w;
        if (hv2Var.h) {
            hv2Var.h = false;
            c53 c53Var = hv2Var.g;
            if (c53Var != null) {
                hv2Var.e.accept(c53Var);
                hv2Var.g = null;
                hv2Var.f = true;
            }
        }
        if (z) {
            if (hv2Var.i) {
                vml.a(hv2Var.j);
                hv2Var.i = false;
            }
            hv2Var.d.m(hv2Var);
        } else {
            hv2Var.e();
        }
        ww8 ww8Var = this.x;
        if (ww8Var.d) {
            ww8Var.d = false;
            vml.a(ww8Var);
        }
        this.h.onDestroy();
        rw8 rw8Var = this.i;
        rw8Var.a.b(rw8Var);
        this.j.d().m(this.l);
        this.k.b = null;
        this.e.b(this.f);
        this.y.T();
        if (this.D) {
            this.s.getClass();
        }
    }

    public final void d() {
        boolean z = this.D && this.C && this.f.b;
        ww8 ww8Var = this.x;
        if (ww8Var.e == z) {
            return;
        }
        ww8Var.e = z;
        wr9 wr9Var = ww8Var.a;
        Boolean boolValueOf = Boolean.valueOf(z);
        Object obj = wr9Var.c;
        wr9Var.c = boolValueOf;
        ww8Var.a(obj == null);
    }

    public final void e(int i, boolean z) {
        qie qieVar = this.s;
        if (((c5k) qieVar.b).n.b) {
            return;
        }
        if (i == 1) {
            this.g.x0(0);
        } else if (i == 2) {
            g();
        }
        if (z) {
            c5k c5kVar = (c5k) qieVar.b;
            NestedScrollView nestedScrollView = c5kVar.l;
            if (nestedScrollView.getScrollY() >= c5kVar.Q && (nestedScrollView.computeVerticalScrollRange() - nestedScrollView.computeVerticalScrollExtent()) - nestedScrollView.getScrollY() < nestedScrollView.getHeight() / 2) {
                c5kVar.f();
            }
            SwipeRefreshLayout swipeRefreshLayout = c5kVar.n;
            if (!swipeRefreshLayout.b) {
                swipeRefreshLayout.b = true;
                boolean z2 = swipeRefreshLayout.x;
                float f = swipeRefreshLayout.t;
                if (!z2) {
                    f += swipeRefreshLayout.n;
                }
                swipeRefreshLayout.d(((int) f) - swipeRefreshLayout.e);
                swipeRefreshLayout.u = false;
                uvk uvkVar = swipeRefreshLayout.A;
                swipeRefreshLayout.j.setVisibility(0);
                swipeRefreshLayout.o.setAlpha(255);
                if (swipeRefreshLayout.p == null) {
                    wvk wvkVar = new wvk(swipeRefreshLayout, (byte) 0);
                    swipeRefreshLayout.p = wvkVar;
                    wvkVar.setDuration(swipeRefreshLayout.d);
                }
                if (uvkVar != null) {
                    swipeRefreshLayout.j.a = uvkVar;
                }
                swipeRefreshLayout.j.clearAnimation();
                swipeRefreshLayout.j.startAnimation(swipeRefreshLayout.p);
            } else {
                swipeRefreshLayout.c(true, false);
            }
        }
        bmb it = sfe.R(this.h.b.values(), zsh.class).iterator();
        while (true) {
            bmb bmbVar = it;
            if (!bmbVar.hasNext()) {
                this.j.e(this.l, null, this.k);
                return;
            }
            ((zsh) bmbVar.next()).c();
        }
    }

    public final SparseArray f() {
        SparseArray sparseArray = this.A;
        if (sparseArray != null) {
            return sparseArray;
        }
        SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
        this.a.saveHierarchyState(sparseArray2);
        ow8 ow8Var = this.h;
        bmb it = sfe.R((i7f) ow8Var.d.a, ya2.class).iterator();
        while (true) {
            bmb bmbVar = it;
            if (!bmbVar.hasNext()) {
                break;
            }
            ((ya2) bmbVar.next()).t();
        }
        u0g u0gVar = new u0g();
        boolean zEquals = ja2.class.equals(ja2.class);
        ArrayList arrayList = ow8Var.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ja2 ja2Var = (ja2) arrayList.get(size);
            if ((zEquals || ja2.class.isInstance(ja2Var)) && ja2Var.d()) {
                u0gVar.put(ja2Var.hashCode(), ja2Var.a);
            }
        }
        Iterator it2 = Collections.unmodifiableCollection(ow8Var.b.values()).iterator();
        while (it2.hasNext()) {
            ((fa2) it2.next()).getClass();
        }
        sparseArray2.put(2131361921, u0gVar);
        return sparseArray2;
    }

    public final void g() {
        ArrayList arrayList = this.h.a;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            ja2 ja2Var = (ja2) obj;
            if ((ja2Var instanceof j82) || (ja2Var instanceof mq)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        this.g.H0(i);
    }

    public final void h(rv8 rv8Var) {
        igi igiVar = this.B;
        fr frVar = null;
        if (igiVar != null) {
            if (((rv8) igiVar.b) == rv8Var) {
                return;
            }
            xw8 xw8Var = (xw8) igiVar.g;
            RecyclerView recyclerView = xw8Var.g;
            recyclerView.q0((qv8) igiVar.d);
            recyclerView.t0((z6b) igiVar.e);
            tw8 tw8Var = (tw8) igiVar.f;
            if (tw8Var != null) {
                xw8Var.h.unregisterAdapterDataObserver(tw8Var);
            }
            fr frVar2 = new fr((LinearLayoutManager) igiVar.c);
            this.B = null;
            frVar = frVar2;
        }
        igi igiVar2 = new igi(this, rv8Var);
        this.B = igiVar2;
        qv8 qv8Var = (qv8) igiVar2.d;
        int iIntValue = ((Integer) this.v.g()).intValue();
        if (qv8Var.f != iIntValue) {
            qv8Var.f = iIntValue;
        }
        this.g.C0((LinearLayoutManager) this.B.c);
        if (frVar != null) {
            igi igiVar3 = this.B;
            igiVar3.getClass();
            int i = frVar.b;
            if (i >= 0) {
                ((LinearLayoutManager) igiVar3.c).scrollToPositionWithOffset(i, frVar.c);
            }
        }
    }

    public final void i(boolean z) {
        ow8 ow8Var = this.h;
        ow8Var.getClass();
        bmb it = sfe.R(ow8Var.b.values(), e5k.class).iterator();
        while (true) {
            bmb bmbVar = it;
            if (!bmbVar.hasNext()) {
                return;
            } else {
                ((e5k) bmbVar.next()).p(z);
            }
        }
    }

    public final void j(boolean z) {
        this.C = z;
        d();
        this.h.b(new ix8(this.D, this.C));
    }

    public final void k(boolean z) {
        this.D = z;
        d();
        this.h.b(new ix8(this.D, this.C));
        if (!this.D) {
            this.j.d().m(this.l);
        }
        boolean z2 = this.D;
        qie qieVar = this.s;
        if (z2) {
            qieVar.getClass();
        } else {
            qieVar.getClass();
        }
        if (this.D && this.C) {
            x5f x5fVar = this.p;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                x56VarF.E(zpaVar).z(zpaVar).e(2);
                x5fVar.U0(x56VarF);
            }
        }
        this.z.a();
    }

    public final void l() {
        this.h.c.d();
    }
}
