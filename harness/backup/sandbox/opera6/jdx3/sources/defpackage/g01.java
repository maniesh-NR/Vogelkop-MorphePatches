package defpackage;

import J.N;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.chromium.OperaBrowserContextHandle;
import com.opera.android.settings.SettingsManager;
import com.opera.android.undo.UndoBar;
import com.opera.android.widget.RecyclerViewEmptyViewSwitcher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g01 extends lj implements jvk, kkm, lkm, q9g {
    public final s9g r;
    public final gjm s;
    public MenuItem t;
    public SearchView u;
    public final SettingsManager v;
    public qmj w;
    public UndoBar x;
    public final l45 y;
    public final mvk z;

    public g01(s9g s9gVar, gjm gjmVar, SettingsManager settingsManager) {
        super(2132017533, 2131755067);
        l45 l45Var = new l45();
        l45Var.c = this;
        l45Var.a = new ArrayList(s9g.h.i(false));
        this.y = l45Var;
        this.z = nvk.v(2132018539);
        this.r = s9gVar;
        this.s = gjmVar;
        this.v = settingsManager;
    }

    @Override // defpackage.q9g
    public final void A() {
        G0();
    }

    public final void G0() {
        l45 l45Var = this.y;
        l45Var.getClass();
        l45Var.a = new ArrayList(s9g.h.i(false));
        l45Var.b = null;
        ((g01) l45Var.c).w.L(l45Var.z());
    }

    @Override // defpackage.kkm
    public final e5d N(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new guh((String) it.next(), -1));
        }
        return new e5d(arrayList, Collections.EMPTY_LIST, (byte) 2);
    }

    @Override // defpackage.kkm
    public final void O(l46 l46Var) {
    }

    public final void R(ArrayList arrayList) {
        OperaBrowserContextHandle operaBrowserContextHandle = (OperaBrowserContextHandle) N.M4QvXpDD();
        double dMNitnPWj = N.MNitnPWj(operaBrowserContextHandle);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            s9g.h.c(str);
            lx3.a(str, true);
            hj.b(0, 3, str, false);
            N.MvtzH5Ni(operaBrowserContextHandle, BrowserUtils.getHostString(str), dMNitnPWj);
            N.M6qCWyJt(str);
        }
        this.w.H(arrayList);
        this.v.Q("text_wrap");
    }

    @Override // defpackage.q9g
    public final void d(List list) {
        G0();
    }

    @Override // defpackage.jvk
    public final void h(i iVar, hvk[] hvkVarArr) {
        mvk mvkVar = this.z;
        hvkVarArr[1] = mvkVar;
        hvkVarArr[0] = mvkVar;
    }

    @Override // defpackage.jvk
    public final void k(i iVar, hvk hvkVar) {
        this.w.J(((pmj) iVar).c);
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        MenuItem menuItem = this.t;
        if (menuItem != null && menuItem.isActionViewExpanded()) {
            this.t.collapseActionView();
        } else {
            this.x.a(true);
            super.l0(z);
        }
    }

    @Override // defpackage.jvk
    public final boolean n(i iVar) {
        return true;
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        this.r.H(this);
        super.onDestroyView();
    }

    @Override // defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131362507) {
            g25.b(getActivity(), 2132021545, 2132021544, 2132018535, new sk(this, (byte) 1));
        }
        return true;
    }

    @Override // defpackage.kkm
    public final void t(e5d e5dVar) {
        this.w.K(e5dVar);
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        UndoBar undoBar = new UndoBar(getActivity(), this.n, this, this, true);
        this.x = undoBar;
        undoBar.e(2131886177);
        this.w = new qmj(getContext(), this.y.z(), this.x, new ab(this, (byte) 8));
        layoutInflater.inflate(2131558486, viewGroup);
        RecyclerViewEmptyViewSwitcher recyclerViewEmptyViewSwitcher = (RecyclerViewEmptyViewSwitcher) viewGroup.findViewById(2131362019);
        RecyclerView recyclerViewFindViewById = recyclerViewEmptyViewSwitcher.findViewById(2131362020);
        getContext();
        recyclerViewFindViewById.C0(new LinearLayoutManager());
        recyclerViewFindViewById.y0(this.w);
        this.w.registerAdapterDataObserver(new f01(this, recyclerViewEmptyViewSwitcher));
        qmj qmjVar = this.w;
        Objects.requireNonNull(qmjVar);
        recyclerViewEmptyViewSwitcher.a(new bi(qmjVar, (byte) 17));
        flb flbVar = new flb(new nvk(getContext(), this));
        flbVar.e(recyclerViewFindViewById);
        recyclerViewEmptyViewSwitcher.b = new e01(flbVar, (byte) 0);
        r0(2131364146).setVisible(!this.w.I());
        r0(2131362507).setVisible(!this.w.I());
        this.r.F(this);
    }

    @Override // defpackage.ltl
    public final void x0(itd itdVar) {
        MenuItem menuItemFindItem = itdVar.findItem(2131364146);
        this.t = menuItemFindItem;
        SearchView actionView = menuItemFindItem.getActionView();
        this.u = actionView;
        actionView.setQueryHint(getString(2132017282));
        this.u.setOnQueryTextListener(new pjn(this, (byte) 7));
    }
}
