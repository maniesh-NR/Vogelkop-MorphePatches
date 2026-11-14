package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.List;

/* loaded from: classes.dex */
public final class uoj extends lj implements q9g {
    public final s9g r;
    public final gjm s;
    public final lag t;
    public y83 u;
    public yz7 v;
    public hag w;
    public pq3 x;
    public MenuItem y;
    public boolean z;

    /* JADX WARN: Illegal instructions before constructor call */
    public uoj(s9g s9gVar, gjm gjmVar, int i, lag lagVar) {
        u7k u7kVarF = u7k.f(fki.a);
        u7kVarF.s(i);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.b = 2131755067;
        itlVar.k = 1;
        super(itlVar);
        this.r = s9gVar;
        this.s = gjmVar;
        this.t = lagVar;
    }

    @Override // defpackage.q9g
    public final void A() {
        hag hagVar = this.w;
        hagVar.H(hagVar.e);
        G0(this.z);
    }

    public final void G0(boolean z) {
        this.z = z;
        r0(2131364146).setVisible(this.w.c.size() > 0);
        lag lagVar = lag.b;
        lag lagVar2 = this.t;
        boolean z2 = lagVar2 != lagVar;
        int i = (z || !z2) ? 8 : 0;
        boolean z3 = SettingsManager.K(lagVar2) && ui6.j(lagVar2).length > 2;
        y83 y83Var = this.u;
        if (z3) {
            ((OperaListItem) y83Var.d).setVisibility(i);
        } else {
            ((OperaListItem) y83Var.e).setVisibility(i);
        }
        ((OperaIconedMessage) this.u.g).setVisibility((lagVar2 == lag.d && !z && z2) ? 0 : 8);
        boolean z4 = this.w.c.size() == 0;
        ((SeparatorView) this.u.h).setVisibility(z2 && !z4 && !z ? 0 : 8);
        this.x.b.setVisibility((z4 || z) ? false : true ? 0 : 8);
    }

    public final void H0(OperaListItem operaListItem) {
        Context context = getContext();
        lag lagVar = this.t;
        String strS = ui6.S(context, lagVar);
        operaListItem.E(strS != null ? new qxh(strS) : null);
        v0g.m(operaListItem, ui6.R(getContext(), lagVar, s9g.h.b.k(lagVar), (String) null));
    }

    public final void I0(OperaListItem operaListItem) throws Resources.NotFoundException {
        Context context = getContext();
        lag lagVar = this.t;
        String strS = ui6.S(context, lagVar);
        operaListItem.E(strS != null ? new qxh(strS) : null);
        kag kagVarK = s9g.h.b.k(lagVar);
        operaListItem.C(new qxh(ui6.R(getContext(), lagVar, kagVarK, (String) null)));
        for (kag kagVar : ui6.j(lagVar)) {
            kag kagVar2 = kag.DENIED;
            if (kagVar == kagVar2) {
                operaListItem.setChecked(kagVarK != kagVar2);
                return;
            }
        }
        operaListItem.setChecked(kagVarK == kag.GRANTED);
    }

    @Override // defpackage.q9g
    public final void d(List list) {
        if (list.stream().anyMatch(new zx1(this, (byte) 16))) {
            hag hagVar = this.w;
            hagVar.H(hagVar.e);
            G0(this.z);
        }
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        MenuItem menuItem = this.y;
        if (menuItem == null || !menuItem.isActionViewExpanded()) {
            super.l0(z);
        } else {
            this.y.collapseActionView();
        }
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        this.r.H(this);
        super.onDestroyView();
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        G0(false);
        this.r.F(this);
    }

    @Override // defpackage.ltl
    public final void u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        pq3 pq3VarB = pq3.b(layoutInflater, viewGroup);
        this.x = pq3VarB;
        pq3VarB.d.setText(2132021561);
        this.x.d.setOnClickListener(new h4i((Object) this, (byte) 9));
        this.x.c.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
    @Override // defpackage.ltl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v0(android.view.LayoutInflater r13, android.view.ViewGroup r14) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uoj.v0(android.view.LayoutInflater, android.view.ViewGroup):void");
    }

    @Override // defpackage.ltl
    public final void x0(itd itdVar) {
        MenuItem menuItemFindItem = itdVar.findItem(2131364146);
        this.y = menuItemFindItem;
        SearchView actionView = menuItemFindItem.getActionView();
        actionView.setQueryHint(getString(2132017282));
        actionView.setOnQueryTextListener(new oji(this));
        this.y.setOnActionExpandListener(new utd(this, itdVar, (byte) 1));
    }
}
