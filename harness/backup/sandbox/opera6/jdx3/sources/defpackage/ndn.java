package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.opera.android.Lazy;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.widget.RecyclerViewEmptyViewSwitcher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ndn {
    public final Context a;
    public final vs b;
    public final ydn c;
    public final ode d;
    public final List e;
    public final qdn f;
    public final gdn g;
    public final RecyclerViewEmptyViewSwitcher h;
    public final vc7 i;
    public final gmk j;
    public final AppBarLayout k;
    public final CollapsingToolbarLayout l;
    public final View m;
    public List n;
    public List o;
    public fdn p;
    public boolean q;
    public boolean r;
    public final MenuItem s;
    public boolean t;

    public ndn(Context context, ndc ndcVar, vs vsVar, ydn ydnVar, List list, List list2, tni tniVar, Lazy lazy, itd itdVar, r2n r2nVar, yug yugVar, gmk gmkVar) {
        ode odeVar = new ode();
        this.d = odeVar;
        this.a = context;
        this.b = vsVar;
        this.k = q9n.y(2131362059, vsVar.b);
        CoordinatorLayout coordinatorLayout = vsVar.b;
        this.l = coordinatorLayout.findViewById(2131362365);
        View viewFindViewById = coordinatorLayout.findViewById(2131364164);
        Objects.requireNonNull(viewFindViewById);
        this.m = viewFindViewById;
        this.c = ydnVar;
        this.j = gmkVar;
        this.e = list2;
        this.q = ydnVar.c.isEnabled();
        this.r = a();
        c();
        tah tahVar = new tah(ydnVar, lazy, new y1n((Object) r2nVar, (byte) 11), vsVar.b, yugVar, gmkVar, new jjg(this, (byte) 14), new y1n((Object) this, (byte) 12));
        this.f = new qdn(list2, new m2g(odeVar, (byte) 3));
        FadingRecyclerView fadingRecyclerView = (FadingRecyclerView) vsVar.d;
        gdn gdnVar = new gdn(tniVar, list, this.o, this.n, this.p, this.q, this.r);
        this.g = gdnVar;
        ilm ilmVar = new ilm(this, (byte) 7);
        tcc lifecycle = ndcVar.getLifecycle();
        ((i7f) tahVar.c).b(ilmVar);
        lifecycle.a(new qs2(tahVar, ilmVar));
        gdnVar.G(new eve(context, tahVar));
        final byte b = 0;
        gdnVar.G(new nzb(tahVar, (byte) 0));
        gdnVar.G(new nzb(tahVar, (byte) 2));
        final byte b2 = 1;
        gdnVar.G(new nzb(tahVar, (byte) 1));
        fadingRecyclerView.y0(gdnVar);
        fadingRecyclerView.C0(new LinearLayoutManager(1, false));
        RecyclerViewEmptyViewSwitcher recyclerViewEmptyViewSwitcher = (RecyclerViewEmptyViewSwitcher) vsVar.c;
        this.h = recyclerViewEmptyViewSwitcher;
        odeVar.j(ndcVar, new f7f(this) { // from class: mdn
            public final /* synthetic */ ndn b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b;
                ndn ndnVar = this.b;
                switch (b3) {
                    case 0:
                        List list3 = (List) obj;
                        gdn gdnVar2 = ndnVar.g;
                        if (list3 == null) {
                            list3 = Collections.EMPTY_LIST;
                        }
                        gdnVar2.p = list3;
                        if (gdnVar2.q) {
                            ArrayList arrayList = gdnVar2.a;
                            arrayList.clear();
                            arrayList.addAll(gdnVar2.p);
                            gdnVar2.notifyDataSetChanged();
                        }
                        ndnVar.h.b();
                        break;
                    default:
                        ndnVar.b();
                        break;
                }
            }
        });
        recyclerViewEmptyViewSwitcher.a(new r2n((Object) this, (byte) 3));
        d(false);
        MenuItem menuItemFindItem = itdVar.findItem(2131364146);
        if (list2.isEmpty()) {
            menuItemFindItem.setVisible(false);
        } else {
            menuItemFindItem.setVisible(true);
            this.s = menuItemFindItem;
            menuItemFindItem.setOnActionExpandListener(new z73((Object) this, (byte) 4));
            SearchView actionView = this.s.getActionView();
            actionView.setQueryHint(context.getString(2132022172));
            actionView.setOnQueryTextListener(new bxk((Object) this, (byte) 10));
            fadingRecyclerView.n(new nwc(this, actionView));
            tahVar.f = new y1n((Object) actionView, (byte) 13);
        }
        vc7 vc7Var = new vc7(this, (byte) 2);
        this.i = vc7Var;
        ydnVar.F(vc7Var);
        gmkVar.a.j(ndcVar, new f7f(this) { // from class: mdn
            public final /* synthetic */ ndn b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b2;
                ndn ndnVar = this.b;
                switch (b3) {
                    case 0:
                        List list3 = (List) obj;
                        gdn gdnVar2 = ndnVar.g;
                        if (list3 == null) {
                            list3 = Collections.EMPTY_LIST;
                        }
                        gdnVar2.p = list3;
                        if (gdnVar2.q) {
                            ArrayList arrayList = gdnVar2.a;
                            arrayList.clear();
                            arrayList.addAll(gdnVar2.p);
                            gdnVar2.notifyDataSetChanged();
                        }
                        ndnVar.h.b();
                        break;
                    default:
                        ndnVar.b();
                        break;
                }
            }
        });
    }

    public final boolean a() {
        return (((uvg) this.j.a.g()) == uvg.ACTIVE) && ru9.c(this.a).a.getBoolean("vpn_pro.kill_switch.on", false);
    }

    public final void b() {
        boolean zIsEnabled = this.c.c.isEnabled();
        boolean zA = a();
        if (this.q == zIsEnabled && this.r == zA) {
            return;
        }
        this.q = zIsEnabled;
        this.r = zA;
        c();
        boolean z = this.q;
        boolean z2 = this.r;
        List list = this.n;
        fdn fdnVar = this.p;
        gdn gdnVar = this.g;
        gdnVar.getClass();
        gdnVar.m = gdn.Y(fdnVar, list);
        gdnVar.n = fdnVar;
        gdnVar.o = z;
        gdnVar.r = z2;
        gdnVar.Z(gdnVar.q);
    }

    public final void c() {
        boolean z = this.q;
        ydn ydnVar = this.c;
        this.p = z ? ydnVar.o() : ydnVar.n();
        ru9 ru9VarC = ru9.c(this.a);
        fdn fdnVar = this.p;
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (fdn fdnVar2 : this.e) {
            if (fdnVar2.b()) {
                arrayList.add(fdnVar2);
            }
            map.put(fdnVar2.b, fdnVar2);
        }
        ArrayList arrayListR = aik.r(true, ru9VarC.a.getString("settings.vpn.location.recently_used", ""), ';');
        ArrayList arrayList2 = new ArrayList();
        int size = arrayListR.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListR.get(i);
            i++;
            String str = (String) obj;
            if (str.equals(fdnVar.b)) {
                arrayList2.add(fdnVar);
            } else {
                fdn fdnVar3 = (fdn) map.get(str);
                if (fdnVar3 != null) {
                    arrayList2.add(fdnVar3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        Collections.sort(arrayList3, new omj((byte) 17));
        Pair pairCreate = Pair.create(arrayList2, arrayList3);
        this.n = (List) pairCreate.first;
        this.o = (List) pairCreate.second;
    }

    public final void d(boolean z) {
        this.g.Z(z);
        View view = this.m;
        vs vsVar = this.b;
        Context context = this.a;
        AppBarLayout appBarLayout = this.k;
        CollapsingToolbarLayout collapsingToolbarLayout = this.l;
        if (z) {
            if (collapsingToolbarLayout != null) {
                collapsingToolbarLayout.e(f03.G(context).getDefaultColor());
            }
            appBarLayout.l = false;
            appBarLayout.i = true;
            appBarLayout.l(false, true);
            appBarLayout.k(false, false, true);
            ((FadingRecyclerView) vsVar.d).setNestedScrollingEnabled(false);
            view.setVisibility(0);
        } else {
            if (collapsingToolbarLayout != null) {
                collapsingToolbarLayout.e(f03.W(2130969328, context).getDefaultColor());
            }
            appBarLayout.l = true;
            appBarLayout.i = false;
            ((FadingRecyclerView) vsVar.d).setNestedScrollingEnabled(true);
            view.setVisibility(4);
        }
        this.t = z;
        this.h.b();
    }
}
