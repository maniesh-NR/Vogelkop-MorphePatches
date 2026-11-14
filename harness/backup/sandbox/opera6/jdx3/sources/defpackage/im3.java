package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.CollapsibleActionView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.OperaApplication;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.bookmarks.h;
import com.opera.android.custom_views.ActionBarSearchView;
import com.opera.android.custom_views.FadingRecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final class im3 extends yyi implements on9 {
    public final gm3 A;
    public final pm3 B;
    public final hxk C;
    public final gjm D;
    public final ua7 E;
    public final rn9 F;
    public MenuItem G;
    public ActionBarSearchView H;
    public y83 I;
    public zwk J;
    public cq5 K;
    public xw L;
    public gn3 x;
    public int y;
    public b59 z;

    public im3(pm3 pm3Var, hxk hxkVar, gjm gjmVar) {
        super(2131558545, 2132020570, 2131755048, 2131755049);
        this.A = new gm3(this);
        this.F = new rn9((Object) this, (Object) this, (byte) 0);
        this.B = pm3Var;
        this.C = hxkVar;
        this.D = gjmVar;
        this.E = new ua7((Fragment) this, gjmVar);
    }

    @Override // defpackage.yyi
    public final boolean G0() {
        return !this.x.I && this.r.f > 0;
    }

    @Override // defpackage.on9
    public final qe6 H() {
        return this.j;
    }

    @Override // defpackage.yyi
    public final boolean H0(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131362153 || menuItem.getItemId() == 2131362156) {
            gn3 gn3Var = this.x;
            ArrayList arrayListC = gn3Var.c();
            if (arrayListC.size() > 1) {
                fl3 fl3Var = new fl3(gn3Var.b, new wx((Object) gn3Var, (Object) arrayListC, (byte) 19));
                fl3Var.setArguments(fl3.G0(alo.j(arrayListC), gn3Var.a(), 0));
                wzg wzgVar = new wzg(fl3Var, fl3.class, (byte) 4);
                new zhj(wzgVar, null, 2, 4097, null, false, Arrays.asList(new n6h[0])).c(gn3Var.p);
            } else {
                gn3Var.r(((qhc) arrayListC.get(0)).a);
            }
            gn3Var.u.d();
            return true;
        }
        if (menuItem.getItemId() == 2131362151) {
            gn3 gn3Var2 = this.x;
            gn3Var2.p(gn3Var2.c());
            return true;
        }
        if (menuItem.getItemId() == 2131362159) {
            this.x.t(false);
            se seVar = this.m;
            if (seVar != null) {
                seVar.a();
                return true;
            }
        } else {
            if (menuItem.getItemId() != 2131362160) {
                return super.H0(menuItem);
            }
            this.x.t(true);
            se seVar2 = this.m;
            if (seVar2 != null) {
                seVar2.a();
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.yyi
    public final void I0() {
        O0(2131362161, G0());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    @Override // defpackage.yyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J0(itd r9, int r10) {
        /*
            r8 = this;
            gn3 r0 = r8.x
            java.util.ArrayList r0 = r0.c()
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        Lc:
            r4 = 1
            if (r3 >= r1) goto L1d
            java.lang.Object r5 = r0.get(r3)
            int r3 = r3 + 1
            qhc r5 = (defpackage.qhc) r5
            int r5 = r5.b
            if (r5 == r4) goto Lc
            r0 = r2
            goto L1e
        L1d:
            r0 = r4
        L1e:
            gn3 r1 = r8.x
            java.util.ArrayList r1 = r1.c()
            int r3 = r1.size()
            r5 = r2
        L29:
            if (r5 >= r3) goto L43
            java.lang.Object r6 = r1.get(r5)
            int r5 = r5 + 1
            qhc r6 = (defpackage.qhc) r6
            al3 r6 = r6.a
            l5b r7 = new l5b
            r7.<init>(r4)
            r6.c(r7)
            boolean r6 = r7.b
            if (r6 == 0) goto L29
            r1 = r4
            goto L44
        L43:
            r1 = r2
        L44:
            r3 = r2
        L45:
            java.util.ArrayList r5 = r9.f
            int r5 = r5.size()
            if (r3 >= r5) goto Lc4
            android.view.MenuItem r5 = r9.getItem(r3)
            int r6 = r5.getItemId()
            r7 = 2131362153(0x7f0a0169, float:1.8344079E38)
            if (r6 != r7) goto L5f
            if (r0 == 0) goto L7a
            if (r10 != r4) goto L7a
            goto L78
        L5f:
            int r6 = r5.getItemId()
            r7 = 2131362156(0x7f0a016c, float:1.8344085E38)
            if (r6 != r7) goto L6d
            if (r0 == 0) goto L7a
            if (r10 <= r4) goto L7a
            goto L78
        L6d:
            int r6 = r5.getItemId()
            r7 = 2131362151(0x7f0a0167, float:1.8344074E38)
            if (r6 != r7) goto L7c
            if (r10 <= 0) goto L7a
        L78:
            r6 = r4
            goto Lbe
        L7a:
            r6 = r2
            goto Lbe
        L7c:
            int r6 = r5.getItemId()
            r7 = 2131362159(0x7f0a016f, float:1.834409E38)
            if (r6 != r7) goto L9d
            if (r10 <= r4) goto L92
            r6 = 2132020201(0x7f140be9, float:1.9678758E38)
            java.lang.String r6 = r8.getString(r6)
            r5.setTitle(r6)
            goto Lbd
        L92:
            r6 = 2132018428(0x7f1404fc, float:1.9675162E38)
            java.lang.String r6 = r8.getString(r6)
            r5.setTitle(r6)
            goto Lbd
        L9d:
            int r6 = r5.getItemId()
            r7 = 2131362160(0x7f0a0170, float:1.8344093E38)
            if (r6 != r7) goto Lc1
            if (r10 <= r4) goto Lb3
            r6 = 2132019767(0x7f140a37, float:1.9677878E38)
            java.lang.String r6 = r8.getString(r6)
            r5.setTitle(r6)
            goto Lbd
        Lb3:
            r6 = 2132018430(0x7f1404fe, float:1.9675166E38)
            java.lang.String r6 = r8.getString(r6)
            r5.setTitle(r6)
        Lbd:
            r6 = r1
        Lbe:
            r5.setVisible(r6)
        Lc1:
            int r3 = r3 + 1
            goto L45
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im3.J0(itd, int):void");
    }

    public final void K0() {
        q9n.u(this.H);
        this.H.clearFocus();
        if (this.G.isActionViewExpanded() && TextUtils.isEmpty(this.H.getQuery())) {
            this.G.collapseActionView();
        }
    }

    public final int L0() {
        int i;
        int i2 = this.y;
        if (i2 != 0) {
            return i2;
        }
        int i3 = ((SharedPreferences) this.z.get()).getInt("bookmarks_sort_order", 1);
        int[] iArrB = vep.B(6);
        int length = iArrB.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i = 3;
                break;
            }
            i = iArrB[i4];
            if (fki.i(i) == i3) {
                break;
            }
            i4++;
        }
        this.y = i;
        return i;
    }

    public final boolean M0(int i) {
        MenuItem menuItemR0 = r0(i);
        return menuItemR0 != null && menuItemR0.isVisible();
    }

    public final void N0() {
        I0();
        boolean z = true;
        O0(2131362162, !this.x.b.d());
        Q0();
        R0();
        boolean zM0 = M0(2131362155);
        boolean zM02 = M0(2131362154);
        if (!zM0 && !zM02) {
            z = false;
        }
        O0(2131362149, z);
    }

    public final void O0(int i, boolean z) {
        MenuItem menuItemR0 = r0(i);
        if (menuItemR0 != null) {
            menuItemR0.setVisible(z);
        }
    }

    public final void P0(ml3 ml3Var) {
        MenuItem menuItemR0 = r0(2131363476);
        MenuItem menuItemR02 = r0(2131363473);
        if (menuItemR0 == null || menuItemR02 == null) {
            return;
        }
        if (ml3Var == null || ml3Var.h() || alo.S(ml3Var) || alo.T(ml3Var)) {
            menuItemR0.setVisible(false);
            menuItemR02.setVisible(false);
        } else {
            menuItemR0.setVisible(true);
            menuItemR02.setVisible(true);
        }
    }

    public final void Q0() {
        O0(2131362154, (((f8f) this.K.getValue()).f() || this.x.b.d()) ? false : true);
    }

    public final void R0() {
        O0(2131362148, M0(2131362161) || M0(2131363476) || M0(2131363473) || M0(2131362162));
    }

    @Override // defpackage.on9
    public final oba a() {
        return null;
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        if (this.G.isActionViewExpanded()) {
            this.G.collapseActionView();
        } else {
            this.x.d();
        }
    }

    @Override // defpackage.k24
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.z = w1h.l(context, vml.d, "bookmarks", new bg1[0]);
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) context.getApplicationContext();
        this.J = operaApplication.N();
        this.K = ((lpe) operaApplication.A.get()).c;
        this.x = new gn3(this, this.r, new vx(this, (byte) 13), new iu2(this, (byte) 4), operaApplication.L().c, operaApplication.g(), this.J, operaApplication.b(), operaApplication.J(), this.K, this.B, this.C, operaApplication.k(), this.D);
        this.L = new xw(this);
        tcc lifecycle = getLifecycle();
        dxk dxkVar = getActivity().U;
        if (dxkVar == null) {
            dxkVar = null;
        }
        lifecycle.a(new mxk(dxkVar, this.J));
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        gn3 gn3Var = this.x;
        ne5 ne5Var = gn3Var.f;
        h hVar = (h) ne5Var.a;
        Runnable runnable = (Runnable) ne5Var.f;
        if (runnable != null) {
            ArrayList arrayList = (ArrayList) ((vl9) hVar.a.b).b;
            if (arrayList != null) {
                arrayList.remove(runnable);
            }
            ne5Var.f = null;
        }
        hVar.f((hn3) ne5Var.e);
        gn3Var.h.H(gn3Var.l);
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        ActionBarSearchView actionBarSearchView = this.H;
        if (actionBarSearchView != null) {
            actionBarSearchView.setActionViewObserver((CollapsibleActionView) null);
            this.H.setOnQueryTextListener((hti) null);
            this.H = null;
        }
        MenuItem menuItem = this.G;
        if (menuItem != null) {
            menuItem.setOnActionExpandListener(null);
            this.G = null;
        }
        gn3 gn3Var = this.x;
        gn3Var.A.a(true);
        h hVar = gn3Var.b;
        hVar.f(gn3Var.c);
        Runnable runnable = gn3Var.o;
        if (runnable != null) {
            ArrayList arrayList = (ArrayList) ((vl9) hVar.a.b).b;
            if (arrayList != null) {
                arrayList.remove(runnable);
            }
            gn3Var.o = null;
        }
        xm3 xm3Var = gn3Var.s;
        if (xm3Var != null) {
            hVar.f(xm3Var);
        }
        ac8.d(gn3Var.d);
        gn3Var.q = null;
        gn3Var.s = null;
        gn3Var.G = null;
        gn3Var.r = null;
        gn3Var.E = null;
        gn3Var.H = null;
        flb flbVar = gn3Var.F;
        if (flbVar != null) {
            flbVar.e(null);
            gn3Var.F = null;
        }
        gm3 gm3Var = this.A;
        gm3Var.a.J.H(gm3Var);
        this.I = null;
        super.onDestroyView();
    }

    @Override // defpackage.yyi, defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        byte b = 0;
        byte b2 = 1;
        if (menuItem.getItemId() == 2131362163) {
            View viewFindViewById = getView().findViewById(menuItem.getItemId());
            if (viewFindViewById == null) {
                return true;
            }
            new sm3(L0(), new va2(this, (byte) 18), b).o(viewFindViewById);
            return true;
        }
        if (menuItem.getItemId() == 2131362152) {
            this.L.p(this.l.findViewById(2131362152));
            return true;
        }
        if (menuItem.getItemId() == 2131362158) {
            gn3 gn3Var = this.x;
            gjm gjmVar = gn3Var.x;
            ml3 ml3VarA = gn3Var.a();
            as asVar = new as(gjmVar);
            Bundle bundle = new Bundle();
            if (ml3VarA != null) {
                bundle.putLong("bookmark-parent", ml3VarA.getId());
            }
            bundle.putBoolean("show-snackbar", false);
            bundle.putInt("dialog-source", 0);
            asVar.setArguments(bundle);
            asVar.x = null;
            zhj.a(asVar, 4097).c(gn3Var.p);
            return true;
        }
        if (menuItem.getItemId() == 2131362157) {
            gn3 gn3Var2 = this.x;
            gn3Var2.getClass();
            lkj lkjVarK = lkj.k(-1L, "", "");
            ml3 ml3VarA2 = gn3Var2.a();
            yr yrVar = new yr();
            Bundle bundle2 = new Bundle();
            if (lkjVarK.getId() == -1) {
                bundle2.putParcelable("bookmark", jkj.j(lkjVarK));
            } else {
                bundle2.putLong("bookmark-id", lkjVarK.getId());
            }
            if (ml3VarA2 != null) {
                bundle2.putLong("bookmark-parent", ml3VarA2.getId());
            }
            bundle2.putBoolean("show-snackbar", false);
            bundle2.putInt("dialog-source", 0);
            yrVar.setArguments(bundle2);
            yrVar.x = null;
            zhj.a(yrVar, 4097).c(gn3Var2.p);
            return true;
        }
        if (menuItem.getItemId() == 2131362169) {
            xih.u(getParentFragmentManager());
            return true;
        }
        if (menuItem.getItemId() == 2131362161) {
            this.r.c();
            return true;
        }
        if (menuItem.getItemId() == 2131363476) {
            if (this.x.a() != null) {
                gn3 gn3Var3 = this.x;
                gn3Var3.r(gn3Var3.a());
                return true;
            }
        } else if (menuItem.getItemId() == 2131363473) {
            ml3 ml3VarA3 = this.x.a();
            if (ml3VarA3 != null) {
                l0(true);
                gn3 gn3Var4 = this.x;
                gn3Var4.getClass();
                gn3Var4.p(Collections.singletonList(qhc.b(ml3VarA3)));
                return true;
            }
        } else {
            if (menuItem.getItemId() != 2131362162) {
                int itemId = menuItem.getItemId();
                pm3 pm3Var = this.B;
                if (itemId == 2131362155) {
                    pm3Var.a(new int[0]);
                    return true;
                }
                if (menuItem.getItemId() != 2131362154) {
                    return super.onMenuItemClick(menuItem);
                }
                qj2 qj2Var = new qj2(this, b2);
                z77 z77Var = (z77) pm3Var.b.get();
                wen wenVar = new wen(new gb3(pm3Var, qj2Var, (byte) 3), b2);
                z77Var.getClass();
                z77Var.b(wenVar, ijm.b);
                return true;
            }
            View actionView = menuItem.getActionView();
            if (actionView != null) {
                l5b l5bVar = q9n.c;
                SwitchCompat switchCompatFindViewById = actionView.findViewById(2131363261);
                Objects.requireNonNull(switchCompatFindViewById);
                switchCompatFindViewById.toggle();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Long l = ((xl3) this.E.p()).a;
        if (l == null) {
            return;
        }
        gn3 gn3Var = this.x;
        long jLongValue = l.longValue();
        xm3 xm3Var = gn3Var.s;
        int i = 0;
        while (true) {
            if (i >= xm3Var.e.h) {
                i = -1;
                break;
            } else if (xm3Var.H(i).a.getId() == jLongValue) {
                break;
            } else {
                i++;
            }
        }
        this.F.E((FadingRecyclerView) this.I.f, i);
    }

    @Override // defpackage.ltl
    public final MenuItem r0(int i) {
        MenuItem menuItemR0 = super.r0(i);
        if (menuItemR0 != null) {
            return menuItemR0;
        }
        m66 m66Var = (m66) this.L.k;
        if (m66Var != null) {
            return m66Var.findItem(i);
        }
        return null;
    }

    @Override // defpackage.yyi, defpackage.ltl
    public final void x0(itd itdVar) {
        super.x0(itdVar);
        MenuItem menuItemFindItem = itdVar.findItem(2131364146);
        this.G = menuItemFindItem;
        menuItemFindItem.setOnActionExpandListener(new z73(this, itdVar));
        ActionBarSearchView actionView = this.G.getActionView();
        this.H = actionView;
        actionView.setActionViewObserver(new fm3(this, (byte) 0));
        this.H.setQueryHint(getString(2132017282));
        this.H.setOnQueryTextListener(new wth((Object) this, (byte) 17));
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        y83 y83VarA = y83.a(statusBarDrawingFrameLayout.findViewById(2131362473));
        this.I = y83VarA;
        this.j = new qe6((FadingRecyclerView) y83VarA.f);
        ((FadingRecyclerView) this.I.f).n(new em3(this, (byte) 0));
        final gn3 gn3Var = this.x;
        y83 y83Var = this.I;
        r activity = getActivity();
        int iL0 = L0();
        qm9 qm9Var = this.n;
        gn3Var.p = activity;
        sl6 sl6Var = gn3Var.n;
        String[] strArr = OperaApplication.K;
        gn3Var.H = (som) ((OperaApplication) activity.getApplication()).r.b1.get();
        gn3Var.q = y83Var;
        FadingRecyclerView fadingRecyclerView = (FadingRecyclerView) y83Var.f;
        gn3Var.r = fadingRecyclerView;
        ((xkj) ((RecyclerView) fadingRecyclerView).M).g = false;
        fadingRecyclerView.C0(new LinearLayoutManager());
        gn3Var.r.o(new vm3(gn3Var));
        h hVar = gn3Var.b;
        xm3 xm3Var = new xm3(gn3Var, hVar, iL0);
        gn3Var.s = xm3Var;
        tzi tziVar = gn3Var.u;
        tziVar.b(new iy0(gn3Var, xm3Var));
        xm3 xm3Var2 = gn3Var.s;
        cm3 cm3Var = cm3.d;
        bm3 bm3Var = new bm3(xm3Var2, new am3(hVar.s() && sl6Var.b(), (((f8f) gn3Var.k.getValue()).f() || sl6Var.b()) ? false : true, gn3Var.q(), gn3Var.e, gn3Var.m, gn3Var.b, gn3Var.g));
        gn3Var.G = bm3Var;
        gn3Var.r.y0(bm3Var.c);
        vi7 vi7Var = gn3Var.C;
        vi7Var.t = false;
        vi7Var.g.e(gn3Var.r);
        flb flbVar = new flb(new nvk(gn3Var.p, gn3Var));
        gn3Var.F = flbVar;
        flbVar.e(gn3Var.r);
        gn3Var.o = hVar.a.d(new ig(gn3Var));
        hVar.a(gn3Var.c);
        ne5 ne5Var = gn3Var.f;
        h hVar2 = (h) ne5Var.a;
        hVar2.a((hn3) ne5Var.e);
        ne5Var.f = hVar2.a.d(new fv2(ne5Var, (byte) 16));
        gn3Var.h.F(gn3Var.l);
        ac8.c(gn3Var.d);
        if (gn3Var.a.isEmpty()) {
            gn3Var.g();
        }
        gn3Var.A = new um3(gn3Var, gn3Var.p, qm9Var, new va2(gn3Var, (byte) 19), gn3Var.s);
        tziVar.c.b(new qzi() { // from class: tm3
            @Override // defpackage.qzi
            public final void W(boolean z) {
                gn3 gn3Var2 = gn3Var;
                if (z) {
                    gn3Var2.A.a(true);
                } else {
                    gn3Var2.getClass();
                }
            }
        });
    }

    @Override // defpackage.ltl
    public final void z0() {
        z4o.q0((FadingRecyclerView) this.I.f);
        z4o.r0(this.k, (dxh) null);
    }
}
