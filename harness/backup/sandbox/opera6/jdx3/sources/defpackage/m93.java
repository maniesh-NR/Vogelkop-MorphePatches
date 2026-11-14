package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.i;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.undo.UndoBar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m93 extends lj implements jvk, kkm, lkm {
    public qmj r;
    public yz7 s;
    public flb t;
    public UndoBar u;
    public MenuItem v;
    public final ig w;
    public final mvk x;
    public final int y;
    public final int z;

    /* JADX WARN: Illegal instructions before constructor call */
    public m93(int i, int i2) {
        u7k u7kVarE = u7k.e();
        itl itlVar = (itl) u7kVarE.a;
        itlVar.c = true;
        u7kVarE.s(2132018908);
        itlVar.b = 2131755067;
        super(itlVar);
        this.w = new ig((Object) this, (byte) 10);
        this.x = nvk.v(2132020895);
        this.y = i;
        this.z = i2;
    }

    @Override // defpackage.ltl
    public final void A0(FloatingActionButton floatingActionButton) {
        super.A0(floatingActionButton);
        floatingActionButton.setOnClickListener(new gf((Object) this, (byte) 21));
    }

    @Override // defpackage.ltl
    public final void B0(LayoutInflater layoutInflater, FadingRecyclerView fadingRecyclerView) {
        UndoBar undoBar = new UndoBar(getActivity(), this.n, this, this, true);
        this.u = undoBar;
        undoBar.e(2131886177);
        qmj qmjVar = new qmj(getContext(), H0(), this.u, null);
        this.r = qmjVar;
        qmjVar.registerAdapterDataObserver(new a83((Object) this, (byte) 1));
        getContext();
        fadingRecyclerView.C0(new LinearLayoutManager());
        yz7 yz7Var = new yz7(this.r, 2, 2132020038, this.y, this.z);
        this.s = yz7Var;
        fadingRecyclerView.y0(yz7Var.c);
        this.s.c();
        flb flbVar = new flb(new nvk(getContext(), this));
        this.t = flbVar;
        flbVar.e(fadingRecyclerView);
    }

    public abstract void G0(String str);

    public abstract Collection H0();

    public abstract void I0();

    public abstract void J0(ArrayList arrayList);

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
        J0(arrayList);
        this.r.H(arrayList);
    }

    @Override // defpackage.jvk
    public final void h(i iVar, hvk[] hvkVarArr) {
        mvk mvkVar = this.x;
        hvkVarArr[1] = mvkVar;
        hvkVarArr[0] = mvkVar;
    }

    @Override // defpackage.jvk
    public final void k(i iVar, hvk hvkVar) {
        this.r.J(((pmj) iVar).c);
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        MenuItem menuItem = this.v;
        if (menuItem != null && menuItem.isActionViewExpanded()) {
            this.v.collapseActionView();
        } else {
            this.u.a(true);
            super.l0(z);
        }
    }

    @Override // defpackage.jvk
    public final boolean n(i iVar) {
        this.s.getClass();
        return !(iVar instanceof xz7);
    }

    @Override // defpackage.ltl, defpackage.k24
    public void onDestroyView() {
        super.onDestroyView();
        this.u.a(true);
        this.r = null;
        this.s = null;
        flb flbVar = this.t;
        if (flbVar != null) {
            flbVar.e(null);
            this.t = null;
        }
    }

    @Override // defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131362507) {
            g25.b(getActivity(), 0, 2132017314, 2132020895, new sk(this, (byte) 3));
        }
        return true;
    }

    @Override // defpackage.k24
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        r0(2131364146).setVisible(!this.r.I());
        r0(2131362507).setVisible(!this.r.I());
    }

    @Override // defpackage.kkm
    public final void t(e5d e5dVar) {
        this.r.K(e5dVar);
    }

    @Override // defpackage.ltl
    public final void x0(itd itdVar) {
        MenuItem menuItemFindItem = itdVar.findItem(2131364146);
        this.v = menuItemFindItem;
        SearchView actionView = menuItemFindItem.getActionView();
        actionView.setQueryHint(getString(2132017282));
        actionView.setOnQueryTextListener(new pjn(this, (byte) 17));
    }
}
