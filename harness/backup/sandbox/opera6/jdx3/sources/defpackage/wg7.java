package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.google.android.material.chip.ChipGroup;
import com.opera.android.OperaApplication;
import com.opera.android.StatusBarDrawerAppBarLayout;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.downloads.DownloadFilterChip;
import com.opera.android.downloads.DownloadsPanel;
import com.opera.android.undo.UndoBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class wg7 extends yyi implements ssl, jvk, on9 {
    public yz7 A;
    public igi B;
    public final bg C;
    public final sf7 D;
    public final orm E;
    public final ah7 F;
    public final zg7 G;
    public boolean H;
    public pt1 I;
    public jv0 J;
    public jg7 K;
    public UndoBar L;
    public vvj M;
    public final mvk N;
    public final mvk O;
    public boolean P;
    public int Q;
    public final d8j R;
    public final rn9 S;
    public b59 x;
    public rf7 y;
    public ze7 z;

    public wg7(sf7 sf7Var, orm ormVar, d8j d8jVar) {
        super(2131558676, 2132020571, 2131755030, 2131755031);
        this.C = new bg(this, (byte) 1);
        this.N = nvk.v(2132018532);
        PointF pointF = k3d.a;
        this.O = new mvk(2130970918, 2132019238, 2130970919, 2131951678, new i3d(2130969282, 1, "states/on success", false), new i3d(2130969282, 2, "states/on success", false), new i3d(2130969323, 1, "states/success", false), new i3d(2130969323, 2, "states/success", false));
        this.S = new rn9((Object) this, (Object) this, (byte) 0);
        this.D = sf7Var;
        this.E = ormVar;
        ah7 ah7Var = new ah7(sf7Var.a, new vx(this, (byte) 18));
        this.F = ah7Var;
        this.G = new zg7(ah7Var, ormVar);
        this.R = d8jVar;
    }

    @Override // defpackage.yyi
    public final boolean G0() {
        return !this.G.e() && this.r.f > 0;
    }

    @Override // defpackage.on9
    public final qe6 H() {
        return this.j;
    }

    @Override // defpackage.yyi
    public final boolean H0(MenuItem menuItem) {
        if (this.K.d(menuItem)) {
            return true;
        }
        return super.H0(menuItem);
    }

    @Override // defpackage.yyi
    public final void J0(itd itdVar, int i) {
        boolean z;
        boolean z2 = false;
        itdVar.findItem(2131362605).setVisible(i > 0);
        MenuItem menuItemFindItem = itdVar.findItem(2131362608);
        ArrayList arrayListC = this.K.c();
        int size = arrayListC.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = !arrayListC.isEmpty();
                break;
            }
            Object obj = arrayListC.get(i2);
            i2++;
            if (!((re7) obj).l()) {
                z = false;
                break;
            }
        }
        menuItemFindItem.setVisible(z);
        boolean z3 = i > 0;
        ArrayList arrayListC2 = this.K.c();
        int size2 = arrayListC2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                break;
            }
            Object obj2 = arrayListC2.get(i3);
            i3++;
            if (!rf7.g((re7) obj2).d()) {
                z3 = false;
                break;
            }
        }
        itdVar.findItem(2131362606).setVisible(z3);
        itdVar.findItem(2131362607).setVisible(z3);
        jv0 jv0Var = this.J;
        if (jv0Var == null || !jv0Var.v()) {
            itdVar.findItem(2131362604).setVisible(false);
            return;
        }
        boolean z4 = i > 0 && i <= 3;
        ArrayList arrayListC3 = this.K.c();
        int size3 = arrayListC3.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                z2 = z4;
                break;
            }
            Object obj3 = arrayListC3.get(i4);
            i4++;
            re7 re7Var = (re7) obj3;
            if (!re7Var.k() || jg7.a(re7Var) == null) {
                break;
            }
        }
        itdVar.findItem(2131362604).setVisible(z2);
    }

    public final void K0() {
        boolean z = this.P;
        StatusBarDrawingFrameLayout statusBarDrawingFrameLayout = this.k;
        if (z) {
            statusBarDrawingFrameLayout.d(true);
            RecyclerView recyclerView = (FadingRecyclerView) this.I.c;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), ((FadingRecyclerView) this.I.c).getPaddingTop(), ((FadingRecyclerView) this.I.c).getPaddingRight(), 0);
        } else {
            statusBarDrawingFrameLayout.d(false);
            RecyclerView recyclerView2 = (FadingRecyclerView) this.I.c;
            recyclerView2.setPadding(recyclerView2.getPaddingLeft(), ((FadingRecyclerView) this.I.c).getPaddingTop(), ((FadingRecyclerView) this.I.c).getPaddingRight(), this.Q);
        }
    }

    public final vvj L0() {
        vvj vvjVar;
        vvj vvjVar2 = this.M;
        if (vvjVar2 != null) {
            return vvjVar2;
        }
        int i = ((SharedPreferences) this.x.get()).getInt("downloads_sort_order", 2);
        vvj[] vvjVarArrValues = vvj.values();
        int length = vvjVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                vvjVar = vvj.e;
                break;
            }
            vvjVar = vvjVarArrValues[i2];
            if (vvjVar.a == i) {
                break;
            }
            i2++;
        }
        this.M = vvjVar;
        return vvjVar;
    }

    public final /* synthetic */ qm9 M0() {
        return this.n;
    }

    @Override // defpackage.on9
    public final oba a() {
        return null;
    }

    @Override // defpackage.jvk
    public final void h(i iVar, hvk[] hvkVarArr) {
        boolean zW = cs5.W(iVar.itemView);
        re7 re7VarI = this.z.I(iVar.getItemId());
        mvk mvkVar = null;
        if (re7VarI != null && re7VarI.l()) {
            mvkVar = this.O;
        }
        mvk mvkVar2 = this.N;
        hvkVarArr[0] = zW ? mvkVar : mvkVar2;
        if (zW) {
            mvkVar = mvkVar2;
        }
        hvkVarArr[1] = mvkVar;
    }

    @Override // defpackage.jvk
    public final void k(i iVar, hvk hvkVar) {
        re7 re7VarI = this.z.I(iVar.getItemId());
        if (re7VarI == null) {
            return;
        }
        mvk mvkVar = this.N;
        orm ormVar = this.E;
        if (hvkVar == mvkVar) {
            ((x5f) ormVar).O(oc0.e, re7VarI.c());
            this.K.g(Collections.singletonList(re7VarI), true);
        } else {
            ((x5f) ormVar).O(oc0.c, re7VarI.c());
            this.K.g(Collections.singletonList(re7VarI), false);
        }
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        if (this.G.c()) {
            return;
        }
        super.l0(z);
    }

    @Override // defpackage.jvk
    public final boolean n(i iVar) {
        this.A.getClass();
        if ((iVar instanceof xz7) || this.m != null) {
            return false;
        }
        this.z.getClass();
        return iVar instanceof qg7;
    }

    @Override // defpackage.k24
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.x = w1h.l(context, vml.d, "downloads", new bg1[0]);
        sf7 sf7Var = this.D;
        igi igiVar = sf7Var.b;
        igiVar.getClass();
        for (vf7 vf7Var : vf7.values()) {
            igiVar.q(vf7Var);
        }
        jnm jnmVar = sf7Var.e;
        ((SharedPreferences) jnmVar.a.get()).edit().remove("unseen_download_ids").apply();
        jnmVar.c(false);
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        ((DownloadsPanel) this.I.f).a.y0((d) null);
        ze7 ze7Var = this.z;
        ze7Var.g.b(ze7Var.h);
        this.y.u(this.F);
        this.G.i(null);
        this.z.l = null;
        ((ChipGroup) this.B.d).g = null;
        this.B = null;
        this.L.a(true);
        this.K = null;
        this.L = null;
        ArrayList arrayList = this.D.c.b;
        bg bgVar = this.C;
        arrayList.remove(bgVar);
        bgVar.getClass();
        this.C.c(0L, 0L, false);
        this.A = null;
        this.z = null;
        this.y = null;
        this.I = null;
    }

    @Override // defpackage.yyi, defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131362616) {
            ((g8j) this.R).e(new int[0]);
            return true;
        }
        if (this.K.d(menuItem)) {
            return true;
        }
        return super.onMenuItemClick(menuItem);
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        g1j g1jVar;
        jv0 jv0Var;
        CoordinatorLayout coordinatorLayoutFindViewById = statusBarDrawingFrameLayout.findViewById(2131362473);
        int i = 2131362059;
        StatusBarDrawerAppBarLayout statusBarDrawerAppBarLayout = (StatusBarDrawerAppBarLayout) w1h.j(2131362059, coordinatorLayoutFindViewById);
        if (statusBarDrawerAppBarLayout != null) {
            i = 2131362409;
            if (((FrameLayout) w1h.j(2131362409, coordinatorLayoutFindViewById)) != null) {
                CoordinatorLayout coordinatorLayout = coordinatorLayoutFindViewById;
                i = 2131362614;
                DownloadsPanel downloadsPanel = (DownloadsPanel) w1h.j(2131362614, coordinatorLayoutFindViewById);
                if (downloadsPanel != null) {
                    i = 2131362615;
                    FadingRecyclerView fadingRecyclerView = (FadingRecyclerView) w1h.j(2131362615, coordinatorLayoutFindViewById);
                    if (fadingRecyclerView != null) {
                        i = 2131362961;
                        FrameLayout frameLayout = (FrameLayout) w1h.j(2131362961, coordinatorLayoutFindViewById);
                        if (frameLayout != null) {
                            i = 2131363522;
                            if (((FrameLayout) w1h.j(2131363522, coordinatorLayoutFindViewById)) != null) {
                                i = 2131364164;
                                View viewJ = w1h.j(2131364164, coordinatorLayoutFindViewById);
                                if (viewJ != null) {
                                    i = 2131364794;
                                    if (w1h.j(2131364794, coordinatorLayoutFindViewById) != null) {
                                        this.I = new pt1(coordinatorLayout, statusBarDrawerAppBarLayout, downloadsPanel, fadingRecyclerView, frameLayout, viewJ);
                                        Context context = getContext();
                                        String[] strArr = OperaApplication.K;
                                        xbf xbfVar = ((OperaApplication) context.getApplicationContext()).x().o;
                                        tzi tziVar = this.r;
                                        ze7 ze7Var = new ze7(tziVar, xbfVar);
                                        this.z = ze7Var;
                                        this.A = new yz7(ze7Var, 2, 2132018707, 2131951643, 0);
                                        sf7 sf7Var = this.D;
                                        this.y = sf7Var.a;
                                        p0(statusBarDrawingFrameLayout, (FadingRecyclerView) this.I.c);
                                        this.L = new UndoBar(getActivity(), this.n, new xm5(this), this.z, false);
                                        dx3 dx3VarP = q9n.p(statusBarDrawingFrameLayout.getContext());
                                        if (dx3VarP != null) {
                                            g1j g1jVarH = dx3VarP.H();
                                            jv0 jv0VarF = dx3VarP.F();
                                            this.J = jv0VarF;
                                            jv0Var = jv0VarF;
                                            g1jVar = g1jVarH;
                                        } else {
                                            this.J = null;
                                            g1jVar = null;
                                            jv0Var = null;
                                        }
                                        this.K = new jg7(this, this.r, this.y, this.G, this.z, this.L, this.n, g1jVar, jv0Var, this.E);
                                        tziVar.b(new iy0(this, this.z));
                                        ze7 ze7Var2 = this.z;
                                        ze7Var2.c = this.K;
                                        ze7Var2.g.a(ze7Var2.h);
                                        this.y.b(this.F);
                                        zg7 zg7Var = this.G;
                                        byte b = 1;
                                        ((h42) zg7Var.f).j(getViewLifecycleOwner(), new ks6(this, b));
                                        ((DownloadsPanel) this.I.f).c = new ug7(this);
                                        sf7Var.c.a(this.C);
                                        new flb(new nvk(getContext(), this)).e(((DownloadsPanel) this.I.f).a);
                                        FrameLayout frameLayout2 = (FrameLayout) this.I.b;
                                        View viewInflate = layoutInflater.inflate(2131558836, (ViewGroup) frameLayout2, false);
                                        frameLayout2.addView(viewInflate);
                                        int i2 = 2131362060;
                                        if (((DownloadFilterChip) w1h.j(2131362060, viewInflate)) != null) {
                                            i2 = 2131362062;
                                            if (((DownloadFilterChip) w1h.j(2131362062, viewInflate)) != null) {
                                                i2 = 2131362071;
                                                if (((DownloadFilterChip) w1h.j(2131362071, viewInflate)) != null) {
                                                    i2 = 2131362316;
                                                    LinearLayout linearLayout = (LinearLayout) w1h.j(2131362316, viewInflate);
                                                    if (linearLayout != null) {
                                                        i2 = 2131362317;
                                                        ChipGroup chipGroup = (ChipGroup) w1h.j(2131362317, viewInflate);
                                                        if (chipGroup != null) {
                                                            i2 = 2131362558;
                                                            if (((DownloadFilterChip) w1h.j(2131362558, viewInflate)) != null) {
                                                                i2 = 2131363151;
                                                                if (((HorizontalScrollView) w1h.j(2131363151, viewInflate)) != null) {
                                                                    i2 = 2131363188;
                                                                    if (((DownloadFilterChip) w1h.j(2131363188, viewInflate)) != null) {
                                                                        i2 = 2131363789;
                                                                        if (((DownloadFilterChip) w1h.j(2131363789, viewInflate)) != null) {
                                                                            i2 = 2131363870;
                                                                            if (((DownloadFilterChip) w1h.j(2131363870, viewInflate)) != null) {
                                                                                i2 = 2131365002;
                                                                                if (((DownloadFilterChip) w1h.j(2131365002, viewInflate)) != null) {
                                                                                    igi igiVar = new igi(this.z, chipGroup, linearLayout);
                                                                                    this.B = igiVar;
                                                                                    this.z.l = new dg7(igiVar, b);
                                                                                    zg7Var.j(r0(2131364146), (FadingRecyclerView) this.I.c, 2132017282, 1);
                                                                                    Toolbar toolbar = this.l;
                                                                                    pt1 pt1Var = this.I;
                                                                                    StatusBarDrawerAppBarLayout statusBarDrawerAppBarLayout2 = (StatusBarDrawerAppBarLayout) pt1Var.e;
                                                                                    View view = pt1Var.g;
                                                                                    RecyclerView recyclerView = (FadingRecyclerView) pt1Var.c;
                                                                                    zg7Var.i(new j1c(toolbar, statusBarDrawerAppBarLayout2, view, recyclerView, recyclerView, this.A));
                                                                                    return;
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
                                        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
                                        return;
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
        q9n.f(this.k, new pc5((Object) this, (byte) 4));
        RecyclerView recyclerView = (FadingRecyclerView) this.I.c;
        ug7 ug7Var = new ug7(this);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(recyclerView, ug7Var);
    }
}
