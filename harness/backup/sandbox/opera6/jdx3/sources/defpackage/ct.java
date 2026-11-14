package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.FadingNestedScrollView;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.custom_views.StylingTextView;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class ct extends ltl {
    public static final /* synthetic */ xtb[] C = {new d6h(ct.class, "searchAdapter", "getSearchAdapter()Lcom/opera/android/favorites/add/AddFavoriteAdapter;", 0), new d6h(ct.class, "suggestedForYouAdapter", "getSuggestedForYouAdapter()Lcom/opera/android/favorites/add/AddFavoriteAdapter;", 0), new d6h(ct.class, "categoryAdapter", "getCategoryAdapter()Lcom/opera/android/favorites/add/AddFavoriteCategoryAdapter;", 0), new d6h(ct.class, "frequentlyVisitedAdapter", "getFrequentlyVisitedAdapter()Lcom/opera/android/favorites/add/AddFavoriteAdapter;", 0), new d6h(ct.class, "toolsAdapter", "getToolsAdapter()Lcom/opera/android/favorites/add/AddFavoriteAdapter;", 0), new d6h(ct.class, "bookmarkAdapter", "getBookmarkAdapter()Lcom/opera/android/favorites/add/AddFavoriteAdapter;", 0)};
    public int A;
    public final uvi B;
    public final ua7 r;
    public wk9 s;
    public final zyk t;
    public final ks u;
    public final ks v;
    public final ps w;
    public final ks x;
    public final ks y;
    public final ks z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ct(gjm gjmVar) {
        u7k u7kVarJ = u7k.j(2131558868);
        u7kVarJ.s(2132017383);
        itl itlVar = (itl) u7kVarJ.a;
        itlVar.b = 2131755010;
        byte b = 1;
        itlVar.e = true;
        super(itlVar);
        this.r = new ua7((Fragment) this, gjmVar);
        byte b2 = 4;
        this.t = z4c.b(new t2(this, b2));
        byte b3 = 6;
        pjn pjnVar = new pjn(this, b3);
        this.u = new ks(pjnVar, true, new at(this, (byte) 2), new at(this, b));
        this.v = new ks(pjnVar, false, new at(this, (byte) 3), new at(this, b));
        this.w = new ps(new zs(this), new at(this, b2), new at(this, (byte) 0));
        this.x = new ks(pjnVar, false, new at(this, (byte) 5), new at(this, b));
        this.y = new ks(pjnVar, false, new at(this, b3), new at(this, b));
        this.z = new ks(pjnVar, false, new at(this, (byte) 7), new at(this, b));
        this.B = new uvi(new bt(this, b));
    }

    public static boolean H0(ygc ygcVar, LinearLayout linearLayout, SeparatorView separatorView, List list) {
        linearLayout.setVisibility(!list.isEmpty() ? 0 : 8);
        if (separatorView != null) {
            separatorView.setVisibility(0);
        }
        ygcVar.H(list);
        return !r0.isEmpty();
    }

    public final ju G0() {
        return (ju) this.t.getValue();
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        if (G0().d.c()) {
            return;
        }
        super.l0(z);
    }

    @Override // defpackage.ltl
    public final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        super.onConfigurationChanged(configuration);
        int integer = getResources().getInteger(2131493000);
        if (integer == this.A) {
            return;
        }
        this.A = integer;
        xtb[] xtbVarArr = C;
        xtb xtbVar = xtbVarArr[1];
        es esVar = (es) this.v.b(this);
        wk9 wk9Var = this.s;
        if (wk9Var == null) {
            wk9Var = null;
        }
        esVar.I((RecyclerView) wk9Var.h);
        xtb xtbVar2 = xtbVarArr[3];
        es esVar2 = (es) this.x.b(this);
        wk9 wk9Var2 = this.s;
        if (wk9Var2 == null) {
            wk9Var2 = null;
        }
        esVar2.I((RecyclerView) wk9Var2.f);
        xtb xtbVar3 = xtbVarArr[4];
        es esVar3 = (es) this.y.b(this);
        wk9 wk9Var3 = this.s;
        if (wk9Var3 == null) {
            wk9Var3 = null;
        }
        esVar3.I((RecyclerView) wk9Var3.i);
        xtb xtbVar4 = xtbVarArr[0];
        es esVar4 = (es) this.u.b(this);
        wk9 wk9Var4 = this.s;
        if (wk9Var4 == null) {
            wk9Var4 = null;
        }
        esVar4.I((RecyclerView) wk9Var4.g);
        G0().h(this.A);
        wk9 wk9Var5 = this.s;
        ((CoordinatorLayout) (wk9Var5 != null ? wk9Var5 : null).c).post(new c4(this, (byte) 9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1, types: [android.view.View, com.opera.android.custom_views.FadingNestedScrollView] */
    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        CoordinatorLayout coordinatorLayoutFindViewById = statusBarDrawingFrameLayout.findViewById(2131362473);
        int i = 2131362171;
        RecyclerView recyclerViewJ = w1h.j(2131362171, coordinatorLayoutFindViewById);
        if (recyclerViewJ != null) {
            i = 2131362172;
            LinearLayout linearLayout = (LinearLayout) w1h.j(2131362172, coordinatorLayoutFindViewById);
            if (linearLayout != null) {
                i = 2131362284;
                RecyclerView recyclerViewJ2 = w1h.j(2131362284, coordinatorLayoutFindViewById);
                if (recyclerViewJ2 != null) {
                    i = 2131362285;
                    LinearLayout linearLayout2 = (LinearLayout) w1h.j(2131362285, coordinatorLayoutFindViewById);
                    if (linearLayout2 != null) {
                        i = 2131362286;
                        SeparatorView separatorView = (SeparatorView) w1h.j(2131362286, coordinatorLayoutFindViewById);
                        if (separatorView != null) {
                            i = 2131362409;
                            FrameLayout frameLayout = (FrameLayout) w1h.j(2131362409, coordinatorLayoutFindViewById);
                            if (frameLayout != null) {
                                CoordinatorLayout coordinatorLayout = coordinatorLayoutFindViewById;
                                i = 2131363029;
                                RecyclerView recyclerViewJ3 = w1h.j(2131363029, coordinatorLayoutFindViewById);
                                if (recyclerViewJ3 != null) {
                                    i = 2131363030;
                                    LinearLayout linearLayout3 = (LinearLayout) w1h.j(2131363030, coordinatorLayoutFindViewById);
                                    if (linearLayout3 != null) {
                                        i = 2131363031;
                                        SeparatorView separatorView2 = (SeparatorView) w1h.j(2131363031, coordinatorLayoutFindViewById);
                                        if (separatorView2 != null) {
                                            i = 2131363385;
                                            LinearLayout linearLayout4 = (LinearLayout) w1h.j(2131363385, coordinatorLayoutFindViewById);
                                            if (linearLayout4 != null) {
                                                i = 2131364140;
                                                ?? r17 = (FadingNestedScrollView) w1h.j(2131364140, coordinatorLayoutFindViewById);
                                                if (r17 != 0) {
                                                    i = 2131364146;
                                                    StylingTextView stylingTextView = (StylingTextView) w1h.j(2131364146, coordinatorLayoutFindViewById);
                                                    if (stylingTextView != null) {
                                                        int i2 = 2131364163;
                                                        RecyclerView recyclerViewJ4 = w1h.j(2131364163, coordinatorLayoutFindViewById);
                                                        if (recyclerViewJ4 != null) {
                                                            i2 = 2131364602;
                                                            RecyclerView recyclerViewJ5 = w1h.j(2131364602, coordinatorLayoutFindViewById);
                                                            if (recyclerViewJ5 != null) {
                                                                i2 = 2131364603;
                                                                LinearLayout linearLayout5 = (LinearLayout) w1h.j(2131364603, coordinatorLayoutFindViewById);
                                                                if (linearLayout5 != null) {
                                                                    i2 = 2131364604;
                                                                    SeparatorView separatorView3 = (SeparatorView) w1h.j(2131364604, coordinatorLayoutFindViewById);
                                                                    if (separatorView3 != null) {
                                                                        i2 = 2131364619;
                                                                        SwipeRefreshLayout swipeRefreshLayoutJ = w1h.j(2131364619, coordinatorLayoutFindViewById);
                                                                        if (swipeRefreshLayoutJ != null) {
                                                                            i2 = 2131364801;
                                                                            RecyclerView recyclerViewJ6 = w1h.j(2131364801, coordinatorLayoutFindViewById);
                                                                            if (recyclerViewJ6 != null) {
                                                                                i2 = 2131364802;
                                                                                LinearLayout linearLayout6 = (LinearLayout) w1h.j(2131364802, coordinatorLayoutFindViewById);
                                                                                if (linearLayout6 != null) {
                                                                                    i2 = 2131364803;
                                                                                    SeparatorView separatorView4 = (SeparatorView) w1h.j(2131364803, coordinatorLayoutFindViewById);
                                                                                    if (separatorView4 != null) {
                                                                                        this.s = new wk9(coordinatorLayout, recyclerViewJ, linearLayout, recyclerViewJ2, linearLayout2, separatorView, frameLayout, recyclerViewJ3, linearLayout3, separatorView2, linearLayout4, (FadingNestedScrollView) r17, stylingTextView, recyclerViewJ4, recyclerViewJ5, linearLayout5, separatorView3, swipeRefreshLayoutJ, recyclerViewJ6, linearLayout6, separatorView4);
                                                                                        p0(statusBarDrawingFrameLayout, r17);
                                                                                        wk9 wk9Var = this.s;
                                                                                        NestedScrollView nestedScrollView = (FadingNestedScrollView) (wk9Var == null ? null : wk9Var).t;
                                                                                        if (wk9Var == null) {
                                                                                            wk9Var = null;
                                                                                        }
                                                                                        FrameLayout frameLayout2 = (FrameLayout) wk9Var.s;
                                                                                        uvi uviVar = this.B;
                                                                                        uviVar.getClass();
                                                                                        boolean zExists = false;
                                                                                        q9n.g(nestedScrollView, new tvi(uviVar, 0 == true ? 1 : 0));
                                                                                        q9n.g(frameLayout2, new tvi(uviVar, (byte) 1));
                                                                                        getViewLifecycleOwner().getLifecycle().a(uviVar);
                                                                                        gt gtVar = gt.a;
                                                                                        wk9 wk9Var2 = this.s;
                                                                                        if (wk9Var2 == null) {
                                                                                            wk9Var2 = null;
                                                                                        }
                                                                                        uviVar.R(gtVar, (LinearLayout) wk9Var2.m, 50);
                                                                                        gt gtVar2 = gt.b;
                                                                                        wk9 wk9Var3 = this.s;
                                                                                        if (wk9Var3 == null) {
                                                                                            wk9Var3 = null;
                                                                                        }
                                                                                        uviVar.R(gtVar2, (LinearLayout) wk9Var3.j, 99);
                                                                                        gt gtVar3 = gt.c;
                                                                                        wk9 wk9Var4 = this.s;
                                                                                        if (wk9Var4 == null) {
                                                                                            wk9Var4 = null;
                                                                                        }
                                                                                        uviVar.R(gtVar3, (LinearLayout) wk9Var4.k, 50);
                                                                                        gt gtVar4 = gt.d;
                                                                                        wk9 wk9Var5 = this.s;
                                                                                        if (wk9Var5 == null) {
                                                                                            wk9Var5 = null;
                                                                                        }
                                                                                        uviVar.R(gtVar4, (LinearLayout) wk9Var5.n, 50);
                                                                                        gt gtVar5 = gt.e;
                                                                                        wk9 wk9Var6 = this.s;
                                                                                        if (wk9Var6 == null) {
                                                                                            wk9Var6 = null;
                                                                                        }
                                                                                        uviVar.R(gtVar5, wk9Var6.b, 30);
                                                                                        wk9 wk9Var7 = this.s;
                                                                                        if (wk9Var7 == null) {
                                                                                            wk9Var7 = null;
                                                                                        }
                                                                                        AppBarLayout appBarLayoutY = q9n.y(2131362059, (CoordinatorLayout) wk9Var7.c);
                                                                                        wk9 wk9Var8 = this.s;
                                                                                        if (wk9Var8 == null) {
                                                                                            wk9Var8 = null;
                                                                                        }
                                                                                        CollapsingToolbarLayout collapsingToolbarLayoutFindViewById = ((CoordinatorLayout) wk9Var8.c).findViewById(2131362365);
                                                                                        wk9 wk9Var9 = this.s;
                                                                                        if (wk9Var9 == null) {
                                                                                            wk9Var9 = null;
                                                                                        }
                                                                                        View viewY = q9n.y(2131364164, (CoordinatorLayout) wk9Var9.c);
                                                                                        viewY.setVisibility(8);
                                                                                        wk9 wk9Var10 = this.s;
                                                                                        if (wk9Var10 == null) {
                                                                                            wk9Var10 = null;
                                                                                        }
                                                                                        byte b = 4;
                                                                                        ((StylingTextView) wk9Var10.u).setOnClickListener(new gf(this, b));
                                                                                        ju juVarG0 = G0();
                                                                                        MenuItem menuItemR0 = r0(2131364146);
                                                                                        wk9 wk9Var11 = this.s;
                                                                                        RecyclerView recyclerView = (RecyclerView) (wk9Var11 == null ? null : wk9Var11).g;
                                                                                        if (wk9Var11 == null) {
                                                                                            wk9Var11 = null;
                                                                                        }
                                                                                        NestedScrollView nestedScrollView2 = (FadingNestedScrollView) wk9Var11.t;
                                                                                        ot otVar = juVarG0.d;
                                                                                        otVar.j(menuItemR0, recyclerView, 2132017375, 17);
                                                                                        otVar.i(new j1c(null, appBarLayoutY, collapsingToolbarLayoutFindViewById, viewY, recyclerView, nestedScrollView2, null, null, 193));
                                                                                        try {
                                                                                            zExists = ((File) G0().b.a.d).exists();
                                                                                        } catch (SecurityException unused) {
                                                                                        }
                                                                                        boolean z = !zExists;
                                                                                        wk9 wk9Var12 = this.s;
                                                                                        if (wk9Var12 == null) {
                                                                                            wk9Var12 = null;
                                                                                        }
                                                                                        ((SwipeRefreshLayout) wk9Var12.v).setEnabled(z);
                                                                                        wk9 wk9Var13 = this.s;
                                                                                        if (wk9Var13 == null) {
                                                                                            wk9Var13 = null;
                                                                                        }
                                                                                        ((SwipeRefreshLayout) wk9Var13.v).m(z);
                                                                                        wk9 wk9Var14 = this.s;
                                                                                        if (wk9Var14 == null) {
                                                                                            wk9Var14 = null;
                                                                                        }
                                                                                        ((SwipeRefreshLayout) wk9Var14.v).b = new zs(this);
                                                                                        this.A = getResources().getInteger(2131493000);
                                                                                        G0().h(this.A);
                                                                                        ode odeVar = G0().h;
                                                                                        ndc viewLifecycleOwner = getViewLifecycleOwner();
                                                                                        wk9 wk9Var15 = this.s;
                                                                                        if (wk9Var15 == null) {
                                                                                            wk9Var15 = null;
                                                                                        }
                                                                                        xf8.i0(odeVar, viewLifecycleOwner, (CoordinatorLayout) wk9Var15.c, (List) null, new pb(this, b));
                                                                                        return;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        i = i2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(coordinatorLayoutFindViewById.getResources().getResourceName(i)));
    }

    @Override // defpackage.ltl
    public final void z0() {
        wk9 wk9Var = this.s;
        if (wk9Var == null) {
            wk9Var = null;
        }
        z4o.q0((FadingNestedScrollView) wk9Var.t);
        z4o.r0(this.k, (dxh) null);
    }
}
