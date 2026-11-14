package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.FadingRecyclerView;
import java.util.Collections;

/* loaded from: classes.dex */
public final class jh3 extends h53 implements jvk {
    public final yu2 A;
    public final w4g B;
    public MenuItem C;
    public SearchView D;
    public boolean E;
    public final y73 F;
    public yz7 G;
    public final z77 H;
    public final int t;
    public final boolean u;
    public final d83 v;
    public final mvk w;
    public final int x;
    public final int y;
    public final psp z;

    /* JADX WARN: Illegal instructions before constructor call */
    public jh3(psp pspVar, qp2 qp2Var, d8j d8jVar, yu2 yu2Var, w4g w4gVar, z77 z77Var) {
        u7k u7kVarE = u7k.e();
        u7kVarE.s(2132018908);
        itl itlVar = (itl) u7kVarE.a;
        itlVar.b = 2131755045;
        super(itlVar, true);
        d83 d83Var = new d83(this);
        this.v = d83Var;
        this.t = 2132018907;
        this.u = true;
        d83Var.registerAdapterDataObserver(new a83(this, (byte) 0));
        this.w = nvk.v(2132020895);
        this.x = 2132020321;
        this.y = 2132020895;
        this.z = pspVar;
        this.F = new y73(this, getLifecycle(), qp2Var);
        this.A = yu2Var;
        this.B = w4gVar;
        this.H = z77Var;
    }

    @Override // defpackage.ltl
    public final void B0(LayoutInflater layoutInflater, FadingRecyclerView fadingRecyclerView) {
        getContext();
        fadingRecyclerView.C0(new LinearLayoutManager());
        yz7 yz7Var = new yz7(this.v, 2, 2132020038, 2131951667, 0);
        this.G = yz7Var;
        fadingRecyclerView.y0(yz7Var.c);
        new flb(new nvk(getActivity(), this)).e(fadingRecyclerView);
    }

    public final boolean H0() {
        SearchView searchView;
        d83 d83Var = this.v;
        a4g a4gVar = (a4g) d83Var.b;
        if ((a4gVar == null ? 0 : Collections.unmodifiableList(a4gVar.a).size()) != 0) {
            return d83Var.getItemCount() == 0 && ((searchView = this.D) == null || TextUtils.isEmpty(searchView.getQuery()));
        }
        return true;
    }

    public final void I0(boolean z) {
        yz7 yz7Var = this.G;
        if (yz7Var == null || z == this.E) {
            return;
        }
        this.E = z;
        if (z) {
            yz7Var.a(2131951669);
            this.G.b(2132021308);
        } else {
            yz7Var.a(2131951667);
            this.G.b(2132020038);
        }
    }

    public final void J0() {
        if (this.D == null) {
            return;
        }
        boolean zH0 = H0();
        r0(2131364146).setVisible(!zH0);
        r0(2131363863).setVisible(!zH0);
    }

    @Override // defpackage.jvk
    public final void h(i iVar, hvk[] hvkVarArr) {
        mvk mvkVar = this.w;
        hvkVarArr[1] = mvkVar;
        hvkVarArr[0] = mvkVar;
    }

    @Override // defpackage.jvk
    public final void k(i iVar, hvk hvkVar) {
        w3g w3gVar = ((e83) iVar).b;
        if (w3gVar != null) {
            d83 d83Var = this.v;
            jh3 jh3Var = (jh3) d83Var.f;
            r activity = jh3Var.getActivity();
            if (((a4g) d83Var.b) == null || d83Var.c == null || activity == null) {
                return;
            }
            hy4 hy4Var = new hy4(jh3Var.getString(jh3Var.x, new Object[]{w3gVar.c}), jh3Var.getString(jh3Var.y), new xj(d83Var, w3gVar, (byte) 18));
            z77 z77Var = (z77) activity.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
            z77Var.getClass();
            z77Var.b(hy4Var, ijm.b);
        }
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        MenuItem menuItem = this.C;
        if (menuItem == null || !menuItem.isActionViewExpanded()) {
            super.l0(z);
        } else {
            this.C.collapseActionView();
        }
    }

    @Override // defpackage.jvk
    public final boolean n(i iVar) {
        this.G.getClass();
        return !(iVar instanceof xz7);
    }

    @Override // defpackage.i93, defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131363863) {
            return super.onMenuItemClick(menuItem);
        }
        r activity = getActivity();
        this.z.getClass();
        g25.b(activity, 0, 2132017314, 2132020895, new sk(this, (byte) 2));
        return true;
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        yqa yqaVar = (yqa) this.F.c;
        ndc viewLifecycleOwner = getViewLifecycleOwner();
        qcc qccVar = qcc.c;
        va2 va2Var = new va2(this, (byte) 13);
        yqaVar.getClass();
        if (viewLifecycleOwner.getLifecycle().i == qcc.a) {
            return;
        }
        dl5 dl5Var = new dl5(viewLifecycleOwner, va2Var);
        if (dl5Var.a.getLifecycle().i.d(qccVar)) {
            yqaVar.j(dl5Var);
        } else {
            viewLifecycleOwner.getLifecycle().a(new el5(dl5Var, new iu2(yqaVar, (byte) 22), (byte) 0));
        }
    }

    @Override // defpackage.ltl
    public final void x0(itd itdVar) {
        MenuItem menuItemFindItem = itdVar.findItem(2131364146);
        this.C = menuItemFindItem;
        SearchView actionView = menuItemFindItem.getActionView();
        this.D = actionView;
        actionView.setQueryHint(getString(2132017282));
        this.D.setOnQueryTextListener(new eme(this));
        this.C.setOnActionExpandListener(new z73((Object) this, (byte) 0));
        J0();
    }
}
