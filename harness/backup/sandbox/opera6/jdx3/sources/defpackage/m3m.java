package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.opera.android.custom_views.BottomIndicatorButton;
import com.opera.android.custom_views.StylingImageView;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class m3m extends o73 {
    public final Context j;
    public final ala k;
    public MenuItem l;
    public MenuItem m;
    public MenuItem n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public String s = "";
    public boolean t;

    public m3m(Context context, ala alaVar) {
        this.j = context;
        this.k = alaVar;
    }

    public static boolean q(Set set, szb szbVar, int i) {
        if (szbVar == null) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            i0c i0cVar = (i0c) it.next();
            if (i0cVar.a.equals(szbVar)) {
                return i0cVar.b == i;
            }
        }
        return false;
    }

    public static void r(MenuItem menuItem, String str, boolean z) {
        ov0 ov0VarE = ov0.e(menuItem.getActionView());
        ((TextView) ov0VarE.d).setText(str);
        ((StylingImageView) ov0VarE.c).setVisibility(z ? 0 : 4);
    }

    @Override // defpackage.o73
    public final boolean j(View view) {
        return true;
    }

    @Override // defpackage.o73
    public final void m(r9i r9iVar, View view) {
        r9iVar.L(2131755068);
        m66 m66Var = (m66) r9iVar.c;
        this.l = m66Var.findItem(2131363459);
        this.m = m66Var.findItem(2131363502);
        this.n = m66Var.findItem(2131363503);
        s();
    }

    @Override // defpackage.dog
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        ala alaVar = this.k;
        if (itemId == 2131363501) {
            ((y0f) alaVar.e).c(rs0.g);
            z3m z3mVar = (z3m) alaVar.i;
            BottomIndicatorButton bottomIndicatorButton = (BottomIndicatorButton) ((pt1) alaVar.a).g;
            r4m r4mVar = (r4m) alaVar.g;
            Objects.requireNonNull(r4mVar);
            z3mVar.o = new j4m(r4mVar, (byte) 0);
            z3mVar.p = null;
            z3mVar.q = true;
            z3mVar.p(bottomIndicatorButton);
            return true;
        }
        if (itemId == 2131363459) {
            alaVar.k(0);
            return true;
        }
        if (itemId == 2131363502) {
            alaVar.k(1);
            return true;
        }
        if (itemId != 2131363503) {
            if (itemId != 2131363506) {
                return false;
            }
            ((y0f) alaVar.e).c(rs0.k);
            alaVar.p(false);
            return true;
        }
        ((y0f) alaVar.e).c(rs0.j);
        r4m r4mVar2 = (r4m) alaVar.g;
        String str = r4mVar2.a.d;
        if (str == null) {
            return true;
        }
        r4mVar2.c0(new npl(r4mVar2, str, (byte) 12));
        return true;
    }

    public final void s() {
        MenuItem menuItem = this.l;
        if (menuItem == null || this.m == null || this.n == null) {
            return;
        }
        menuItem.setVisible(this.t);
        this.m.setVisible(this.t);
        this.n.setVisible(!this.t || this.o);
        MenuItem menuItem2 = this.n;
        boolean z = this.o;
        ((TextView) ov0.e(menuItem2.getActionView()).d).setEnabled(z);
        menuItem2.setEnabled(z);
        Resources resources = this.j.getResources();
        if (this.t) {
            r(this.l, resources.getString(2132017541, this.s), this.p);
            r(this.m, resources.getString(2132019978, this.s), this.q);
        }
        r(this.n, resources.getString(2132019979), this.r);
    }
}
