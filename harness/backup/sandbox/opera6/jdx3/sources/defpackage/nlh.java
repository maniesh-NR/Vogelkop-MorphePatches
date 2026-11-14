package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.appsflyer.internal.j;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.opera.android.OperaApplication;
import com.opera.android.StatusBarDrawerAppBarLayout;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.settings.SettingsManager;
import com.opera.android.undo.UndoBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class nlh extends yyi implements jvk {
    public boolean A;
    public b59 B;
    public int C;
    public final glh D;
    public final SettingsManager E;
    public blh F;
    public UndoBar G;
    public final vi7 H;
    public final mvk I;
    public String J;
    public xbf K;
    public yz7 L;
    public y83 x;
    public final v8f y;
    public final zg7 z;

    public nlh(glh glhVar, x5f x5fVar, SettingsManager settingsManager) {
        super(2131558545, 2132020573, 2131755052, 2131755053);
        this.C = 1;
        this.I = nvk.v(2132018532);
        this.D = glhVar;
        this.E = settingsManager;
        v8f v8fVar = new v8f(glhVar);
        this.y = v8fVar;
        this.z = new zg7(v8fVar, x5fVar);
        vi7 vi7Var = new vi7(vml.d, 0, false, 0, null, false);
        this.H = vi7Var;
        vi7Var.t = false;
    }

    @Override // defpackage.yyi
    public final boolean G0() {
        return !this.z.e() && this.r.f > 0;
    }

    @Override // defpackage.yyi
    public final boolean H0(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131362505) {
            UndoBar undoBar = this.G;
            ArrayList arrayListG = this.F.G();
            undoBar.getClass();
            int size = arrayListG.size();
            if (arrayListG.isEmpty()) {
                return true;
            }
            undoBar.g = true;
            e5d e5dVarN = undoBar.e.N(arrayListG);
            if (!((ArrayList) e5dVarN.c).isEmpty()) {
                ((mhk) undoBar.c.b).g(new mkm(e5dVarN, size));
                undoBar.f();
                undoBar.b.u();
            }
            undoBar.g = false;
            return true;
        }
        int itemId = menuItem.getItemId();
        tzi tziVar = this.r;
        if (itemId == 2131362654) {
            ilh ilhVar = (ilh) this.F.G().get(0);
            tziVar.d();
            zhj.a(new f9c(ilhVar, new eof((Object) this, (Object) ilhVar, (byte) 11)), -1).c(getContext());
            return true;
        }
        if (menuItem.getItemId() == 2131363482) {
            K0(this.F.G(), true, false, true);
            tziVar.d();
            return true;
        }
        if (menuItem.getItemId() != 2131363481) {
            return super.H0(menuItem);
        }
        K0(this.F.G(), true, true, true);
        tziVar.d();
        return true;
    }

    public final void K0(List list, boolean z, boolean z2, boolean z3) {
        if (list.isEmpty()) {
            return;
        }
        vx3 vx3VarA = null;
        if (z3) {
            int size = list.size();
            glh glhVar = this.D;
            if (size != 1) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (glhVar.g.contains(Long.valueOf(((ilh) it.next()).a))) {
                        it.remove();
                    }
                }
                if (list.isEmpty()) {
                    return;
                }
            } else if (glhVar.g.contains(Long.valueOf(((ilh) list.get(0)).a))) {
                ilh ilhVar = (ilh) list.get(0);
                rxh rxhVar = new rxh(2132018697);
                oid oidVar = new oid(this, ilhVar, z, z2);
                z77 z77VarU = sfe.U(requireActivity());
                gkj gkjVar = new gkj(false, false);
                gkjVar.a = null;
                gkjVar.b = null;
                gkjVar.c = null;
                gkjVar.d = null;
                gkjVar.e = null;
                gkjVar.f = null;
                gkjVar.g = null;
                gkjVar.h = oidVar;
                gkjVar.i = null;
                gkjVar.j = null;
                gkjVar.k = 2132018696;
                gkjVar.l = 2132018111;
                gkjVar.m = 2132018698;
                gkjVar.n = true;
                gkjVar.o = rxhVar;
                z77VarU.getClass();
                z77VarU.b(gkjVar, ijm.b);
                return;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            ilh ilhVar2 = (ilh) list.get(i);
            boolean z4 = ilhVar2.g;
            lqm lqmVar = lqm.m;
            if (z4 || ilhVar2.h) {
                String strB = olh.b(ilhVar2, this.J);
                if (i == 0) {
                    vx3VarA = ay3.a(strB, lqmVar, true);
                } else {
                    vx3VarA.b(strB, true);
                }
            } else {
                String str = ilhVar2.b;
                if (i == 0) {
                    vx3VarA = ay3.a(str, lqmVar, false);
                } else {
                    vx3VarA.b(str, false);
                }
            }
        }
        vx3VarA.a(!z || (this.E.C() == q7j.FOREGROUND));
        vx3VarA.d(z);
        vx3VarA.f = !z;
        vx3VarA.c(z);
        vx3VarA.e(z2);
        ac8.a(new ay3(vx3VarA));
    }

    public final void L0(ArrayList arrayList) {
        j.c((SharedPreferences) this.B.get(), "item_order", TextUtils.join(",", arrayList));
    }

    @Override // defpackage.jvk
    public final void h(i iVar, hvk[] hvkVarArr) {
        mvk mvkVar = this.I;
        hvkVarArr[1] = mvkVar;
        hvkVarArr[0] = mvkVar;
    }

    @Override // defpackage.jvk
    public final void k(i iVar, hvk hvkVar) {
        blh blhVar = this.F;
        this.G.c(Collections.singletonList(((wkh) blhVar.e.f(iVar.getAdapterPosition())).a));
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        if (this.z.c()) {
            return;
        }
        super.l0(z);
    }

    @Override // defpackage.jvk
    public final boolean n(i iVar) {
        this.L.getClass();
        return !(iVar instanceof xz7);
    }

    @Override // defpackage.k24
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.B = w1h.l(context, vml.d, "readinglist", new bg1[0]);
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.z.i(null);
        this.D.b.c(this.y);
        this.G.a(true);
    }

    @Override // defpackage.yyi, defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        byte b = 1;
        if (menuItem.getItemId() == 2131363491) {
            new sm3(this.C, new r9g((Object) this, (byte) 18), b).p(this.l.findViewById(menuItem.getItemId()));
            return true;
        }
        if (menuItem.getItemId() != 2131363728) {
            return super.onMenuItemClick(menuItem);
        }
        olh.d(getActivity(), false);
        return true;
    }

    @Override // defpackage.ltl
    public final void onPause() {
        super.onPause();
        xbf xbfVar = this.K;
        if (xbfVar != null) {
            xbfVar.g = null;
            this.K = null;
        }
    }

    @Override // defpackage.ltl
    public final void onResume() {
        super.onResume();
        Context context = getContext();
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) context.getApplicationContext();
        this.K = new xbf(getContext(), vml.d, this.E, operaApplication.H(), new pjg(this, (byte) 17));
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        int i;
        y83 y83VarA = y83.a(statusBarDrawingFrameLayout.findViewById(2131362473));
        this.x = y83VarA;
        ((CircularProgressIndicator) y83VarA.h).setVisibility(8);
        FadingRecyclerView fadingRecyclerView = (FadingRecyclerView) this.x.f;
        vi7 vi7Var = this.H;
        vi7Var.g.e(fadingRecyclerView);
        int i2 = ((SharedPreferences) this.B.get()).getInt("sort_order", 0);
        byte b = 4;
        int[] iArrB = vep.B(4);
        int length = iArrB.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i = 1;
                break;
            }
            i = iArrB[i3];
            if (fki.j(i) == i2) {
                break;
            } else {
                i3++;
            }
        }
        this.C = i;
        ArrayList arrayList = new ArrayList();
        String string = ((SharedPreferences) this.B.get()).getString("item_order", "");
        if (!string.isEmpty()) {
            for (String str : string.split(",")) {
                try {
                    arrayList.add(Long.valueOf(str));
                } catch (NumberFormatException unused) {
                }
            }
        }
        blh blhVar = new blh(this.D, this.z, this.r, this, vi7Var, i, arrayList);
        this.F = blhVar;
        this.L = new yz7(blhVar, 2, 2132020151, 2131951661, 0);
        this.r.b(new mlh(this.F, (byte) 0));
        r activity = getActivity();
        qm9 qm9Var = this.n;
        blh blhVar2 = this.F;
        UndoBar undoBar = new UndoBar(activity, qm9Var, blhVar2, blhVar2, true);
        this.G = undoBar;
        undoBar.e(2131886162);
        getContext();
        fadingRecyclerView.C0(new LinearLayoutManager(1, false));
        new flb(new nvk(getActivity(), this)).e(fadingRecyclerView);
        this.D.b.b(this.y);
        zg7 zg7Var = this.z;
        ((h42) zg7Var.f).j(getViewLifecycleOwner(), new wj(this, fadingRecyclerView, b));
        this.J = getString(2132020148);
        zg7Var.j(r0(2131364146), (FadingRecyclerView) this.x.f, 2132017282, 1);
        Toolbar toolbar = this.l;
        y83 y83Var = this.x;
        StatusBarDrawerAppBarLayout statusBarDrawerAppBarLayout = (StatusBarDrawerAppBarLayout) y83Var.c;
        View view = (View) y83Var.g;
        RecyclerView recyclerView = (FadingRecyclerView) y83Var.f;
        zg7Var.i(new j1c(toolbar, statusBarDrawerAppBarLayout, view, recyclerView, recyclerView, this.L));
    }

    @Override // defpackage.ltl
    public final void z0() {
        z4o.q0((FadingRecyclerView) this.x.f);
        z4o.r0(this.k, (dxh) null);
    }
}
