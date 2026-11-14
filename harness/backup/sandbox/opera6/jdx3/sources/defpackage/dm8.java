package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.undo.UndoBar;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class dm8 extends lj implements kkm, lkm, q9g {
    public qmj A;
    public flb B;
    public flb C;
    public final gjm r;
    public final SettingsManager s;
    public final s9g t;
    public final vo7 u;
    public final ig v;
    public final mvk w;
    public y83 x;
    public UndoBar y;
    public qmj z;

    /* JADX WARN: Illegal instructions before constructor call */
    public dm8(gjm gjmVar, SettingsManager settingsManager, s9g s9gVar, vo7 vo7Var) {
        u7k u7kVarF = u7k.f(fki.a);
        u7kVarF.s(2132018993);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.b = 2131755066;
        super(itlVar);
        this.v = new ig(this, (byte) 27);
        this.w = nvk.v(2132020895);
        this.t = s9gVar;
        this.r = gjmVar;
        this.s = settingsManager;
        this.u = vo7Var;
    }

    public static void K0(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            s9g.h.b(lag.g, (String) it.next(), false);
        }
    }

    @Override // defpackage.q9g
    public final void A() {
        ig igVar = this.v;
        vml.a(igVar);
        vml.c(igVar);
    }

    public final HashSet G0() {
        vzk vzkVar = s9g.h.c;
        kag kagVar = kag.GRANTED;
        HashSet hashSetE = vzkVar.E(kagVar);
        HashSet hashSetE2 = s9g.h.c.E(kag.ASK);
        HashSet hashSet = new HashSet(hashSetE);
        Iterator it = hashSetE2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            vo7 vo7Var = this.u;
            vo7Var.getClass();
            uo7 uo7VarA = vo7Var.a(new GURL(str), false);
            if ((uo7VarA != null ? uo7VarA.d : null) == kagVar) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public final flb H0(qmj qmjVar, RecyclerView recyclerView) {
        flb flbVar = new flb(new nvk(requireContext(), new cm8(this, new dg7(qmjVar, (byte) 12))));
        flbVar.e(recyclerView);
        return flbVar;
    }

    public final qmj I0(RecyclerView recyclerView, HashSet hashSet) {
        qmj qmjVar = new qmj(requireContext(), hashSet, this.y, new dg7(this, (byte) 11));
        getContext();
        recyclerView.C0(new LinearLayoutManager());
        recyclerView.y0(qmjVar);
        return qmjVar;
    }

    public final void J0() {
        ((SeparatorView) this.x.f).setVisibility((this.z.I() && this.A.I()) ? 8 : 0);
        boolean z = (this.z.I() && this.A.I()) ? false : true;
        MenuItem menuItemR0 = r0(2131362507);
        if (menuItemR0 != null) {
            menuItemR0.setVisible(z);
        }
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
        K0(arrayList);
        this.z.H(arrayList);
        this.A.H(arrayList);
    }

    @Override // defpackage.q9g
    public final void d(List list) {
        if (list.stream().anyMatch(new nn((byte) 5))) {
            ig igVar = this.v;
            vml.a(igVar);
            vml.c(igVar);
        }
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        this.y.a(true);
        super.l0(z);
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.x = null;
        this.y.a(true);
        this.z = null;
        flb flbVar = this.B;
        if (flbVar != null) {
            flbVar.e(null);
            this.B = null;
        }
        this.A = null;
        flb flbVar2 = this.C;
        if (flbVar2 != null) {
            flbVar2.e(null);
            this.C = null;
        }
        this.t.H(this);
    }

    @Override // defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131362507) {
            g25.b(getActivity(), 0, 2132020894, 2132020895, new sk(this, (byte) 7));
        }
        return true;
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.z.registerAdapterDataObserver(new a83(this, new Runnable(this) { // from class: am8
            public final /* synthetic */ dm8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b = b;
                dm8 dm8Var = this.b;
                switch (b) {
                    case 0:
                        ((StylingTextView) dm8Var.x.g).setVisibility(dm8Var.z.I() ? 8 : 0);
                        dm8Var.J0();
                        break;
                    default:
                        ((StylingTextView) dm8Var.x.d).setVisibility(dm8Var.A.I() ? 8 : 0);
                        dm8Var.J0();
                        break;
                }
            }
        }));
        ((StylingTextView) this.x.g).setVisibility(this.z.I() ? 8 : 0);
        J0();
        final byte b = 1;
        this.A.registerAdapterDataObserver(new a83(this, new Runnable(this) { // from class: am8
            public final /* synthetic */ dm8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                dm8 dm8Var = this.b;
                switch (b2) {
                    case 0:
                        ((StylingTextView) dm8Var.x.g).setVisibility(dm8Var.z.I() ? 8 : 0);
                        dm8Var.J0();
                        break;
                    default:
                        ((StylingTextView) dm8Var.x.d).setVisibility(dm8Var.A.I() ? 8 : 0);
                        dm8Var.J0();
                        break;
                }
            }
        }));
        ((StylingTextView) this.x.d).setVisibility(this.A.I() ? (byte) 8 : (byte) 0);
        J0();
        this.t.F(this);
    }

    @Override // defpackage.kkm
    public final void t(e5d e5dVar) {
        this.z.K(e5dVar);
        this.A.K(e5dVar);
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131558714, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131362048;
        OperaListItem operaListItem = (OperaListItem) w1h.j(2131362048, viewInflate);
        if (operaListItem != null) {
            i = 2131363665;
            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363665, viewInflate);
            if (stylingTextView != null) {
                i = 2131363666;
                RecyclerView recyclerViewJ = w1h.j(2131363666, viewInflate);
                if (recyclerViewJ != null) {
                    i = 2131364221;
                    SeparatorView separatorView = (SeparatorView) w1h.j(2131364221, viewInflate);
                    if (separatorView != null) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        i = 2131365102;
                        StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131365102, viewInflate);
                        if (stylingTextView2 != null) {
                            i = 2131365103;
                            RecyclerView recyclerViewJ2 = w1h.j(2131365103, viewInflate);
                            if (recyclerViewJ2 != null) {
                                this.x = new y83((ViewGroup) linearLayout, (Object) operaListItem, (Object) stylingTextView, (View) recyclerViewJ, (View) separatorView, (Object) stylingTextView2, (View) recyclerViewJ2, (byte) 2);
                                operaListItem.t(this.s.i("page_menu_show_open_in_external_app"));
                                ((OperaListItem) this.x.c).u = new bm8(this, (byte) 0);
                                UndoBar undoBar = new UndoBar(requireActivity(), this.n, this, this, true);
                                this.y = undoBar;
                                undoBar.e(2131886177);
                                qmj qmjVarI0 = I0((RecyclerView) this.x.h, G0());
                                this.z = qmjVarI0;
                                this.B = H0(qmjVarI0, (RecyclerView) this.x.h);
                                qmj qmjVarI02 = I0((RecyclerView) this.x.e, s9g.h.c.E(kag.DENIED));
                                this.A = qmjVarI02;
                                this.C = H0(qmjVarI02, (RecyclerView) this.x.e);
                                return;
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
