package com.opera.android.history;

import android.view.MenuItem;
import android.view.View;
import defpackage.dda;
import defpackage.e5f;
import defpackage.ga6;
import defpackage.ghf;
import defpackage.i4d;
import defpackage.m66;
import defpackage.o73;
import defpackage.r9i;
import defpackage.ztn;
import java.util.Collections;

/* loaded from: classes.dex */
public final class h extends o73 {
    public final /* synthetic */ ztn j;
    public final /* synthetic */ g k;

    public h(ztn ztnVar, g gVar) {
        this.j = ztnVar;
        this.k = gVar;
    }

    @Override // defpackage.o73
    public final void m(r9i r9iVar, View view) {
        r9iVar.L(2131755024);
        m66 m66Var = (m66) r9iVar.c;
        m66Var.findItem(2131363476).setVisible(false);
        m66Var.findItem(2131363490).setVisible(false);
    }

    @Override // defpackage.dog
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        ztn ztnVar = this.j;
        g gVar = this.k;
        if (itemId == 2131363482) {
            ga6 ga6Var = ztnVar.c;
            ((dda) ga6Var.b).L0().h(Collections.singletonList(gVar), false);
            return true;
        }
        if (menuItem.getItemId() == 2131363481) {
            ga6 ga6Var2 = ztnVar.c;
            ((dda) ga6Var2.b).L0().h(Collections.singletonList(gVar), true);
            return true;
        }
        if (menuItem.getItemId() == 2131363473) {
            ztnVar.getClass();
            ztnVar.L(j95.j(new Long[]{Long.valueOf(gVar.b.getId())}));
            return true;
        }
        if (menuItem.getItemId() == 2131363470) {
            lcp.m(ztnVar.a, gVar.a.a.getUrl());
            return true;
        }
        if (menuItem.getItemId() != 2131363489) {
            return false;
        }
        new ghf(new i4d(new e5f(gVar.a.a.getUrl(), (String) gVar.e.get(), (byte) 10))).I(ztnVar.a);
        return true;
    }
}
