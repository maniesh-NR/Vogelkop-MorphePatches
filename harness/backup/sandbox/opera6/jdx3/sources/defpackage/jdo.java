package defpackage;

import J.N;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.i;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.chromium.OperaBrowserContextHandle;
import com.opera.android.settings.SettingsManager;
import com.opera.android.undo.UndoBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jdo extends lj implements jvk, kkm, lkm {
    public final SettingsManager r;
    public final lw3 s;
    public MenuItem t;
    public SearchView u;
    public d83 v;
    public UndoBar w;
    public final mvk x;

    public jdo(SettingsManager settingsManager, lw3 lw3Var) {
        super(2132022712, 2131755067);
        this.r = settingsManager;
        this.s = lw3Var;
        this.x = nvk.v(2132018539);
    }

    public final void G0(OperaBrowserContextHandle operaBrowserContextHandle, double d, String str) {
        if (!Intrinsics.a(str, "%reader_mode%")) {
            N.MvtzH5Ni(operaBrowserContextHandle, BrowserUtils.getHostString(str), d);
            N.M3MkeCX1(str);
        } else {
            SettingsManager settingsManager = this.r;
            settingsManager.getClass();
            settingsManager.V(-1, "reader_mode_zoom_level");
            settingsManager.V(-1, "reader_mode_text_wrap");
        }
    }

    public final void H0() {
        d83 d83Var = this.v;
        if (d83Var == null) {
            d83Var = null;
        }
        boolean z = !(((ArrayList) d83Var.c).size() == ((TreeSet) d83Var.e).size());
        MenuItem menuItemR0 = r0(2131364146);
        if (menuItemR0 != null) {
            menuItemR0.setVisible(z);
        }
        MenuItem menuItemR02 = r0(2131362507);
        if (menuItemR02 != null) {
            menuItemR02.setVisible(z);
        }
    }

    @Override // defpackage.kkm
    public final e5d N(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(k95.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new guh((String) it.next(), -1));
        }
        return new e5d(arrayList, l08.a, (byte) 2);
    }

    @Override // defpackage.kkm
    public final void O(l46 l46Var) {
    }

    public final void R(ArrayList arrayList) {
        OperaBrowserContextHandle operaBrowserContextHandle = (OperaBrowserContextHandle) N.M4QvXpDD();
        double dMNitnPWj = N.MNitnPWj(operaBrowserContextHandle);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            G0(operaBrowserContextHandle, dMNitnPWj, (String) obj);
        }
        d83 d83Var = this.v;
        if (d83Var == null) {
            d83Var = null;
        }
        d83Var.getClass();
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            String str = (String) obj2;
            o95.v((ArrayList) d83Var.c, new u5f(str, (byte) 15));
            o95.v((ArrayList) d83Var.d, new u5f(str, (byte) 16));
            ((TreeSet) d83Var.e).remove(str);
        }
        this.r.Q("text_wrap");
    }

    @Override // defpackage.jvk
    public final void h(i iVar, hvk[] hvkVarArr) {
        mvk mvkVar = this.x;
        hvkVarArr[0] = mvkVar;
        hvkVarArr[1] = mvkVar;
    }

    @Override // defpackage.jvk
    public final void k(i iVar, hvk hvkVar) {
        String str = ((mdo) iVar).c;
        if (str != null) {
            d83 d83Var = this.v;
            if (d83Var == null) {
                d83Var = null;
            }
            ((UndoBar) d83Var.b).c(Collections.singletonList(str));
            ((TreeSet) d83Var.e).add(str);
            new c83(d83Var, (byte) 4).filter((CharSequence) d83Var.f);
        }
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        MenuItem menuItem = this.t;
        if (menuItem != null && menuItem.isActionViewExpanded()) {
            MenuItem menuItem2 = this.t;
            if (menuItem2 != null) {
                menuItem2.collapseActionView();
                return;
            }
            return;
        }
        UndoBar undoBar = this.w;
        if (undoBar == null) {
            undoBar = null;
        }
        undoBar.a(true);
        super.l0(z);
    }

    @Override // defpackage.jvk
    public final boolean n(i iVar) {
        return true;
    }

    @Override // defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131362507) {
            g25.b(requireActivity(), 0, 2132020894, 2132020895, new sk(this, (byte) 14));
        }
        return true;
    }

    @Override // defpackage.kkm
    public final void t(e5d e5dVar) {
        d83 d83Var = this.v;
        if (d83Var == null) {
            d83Var = null;
        }
        d83Var.getClass();
        Iterator it = e5dVar.iterator();
        while (it.hasNext()) {
            ((TreeSet) d83Var.e).remove(((guh) it.next()).a);
        }
        new c83(d83Var, (byte) 4).filter((CharSequence) d83Var.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004b A[SYNTHETIC] */
    @Override // defpackage.ltl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v0(android.view.LayoutInflater r24, android.view.ViewGroup r25) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jdo.v0(android.view.LayoutInflater, android.view.ViewGroup):void");
    }

    @Override // defpackage.ltl
    public final void x0(itd itdVar) {
        MenuItem menuItemFindItem = itdVar.findItem(2131364146);
        this.t = menuItemFindItem;
        View actionView = menuItemFindItem != null ? menuItemFindItem.getActionView() : null;
        SearchView searchView = actionView instanceof SearchView ? (SearchView) actionView : null;
        this.u = searchView;
        if (searchView != null) {
            searchView.setQueryHint(getString(2132017282));
        }
        SearchView searchView2 = this.u;
        if (searchView2 != null) {
            searchView2.setOnQueryTextListener(new dcl(this));
        }
    }
}
