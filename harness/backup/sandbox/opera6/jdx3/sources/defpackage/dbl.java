package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class dbl extends o73 {
    public final Context j;
    public final wv1 k;
    public final du3 l;
    public final nue m;
    public final du3 n;
    public final nwf o;
    public final esk p;
    public final kze q;

    public dbl(Context context, wv1 wv1Var, du3 du3Var, nue nueVar, du3 du3Var2, esk eskVar, kze kzeVar, nwf nwfVar) {
        this.j = context;
        this.k = wv1Var;
        this.l = du3Var;
        this.m = nueVar;
        this.n = du3Var2;
        this.o = nwfVar;
        this.p = eskVar;
        this.q = kzeVar;
    }

    public static void r(Menu menu, boolean z) {
        menu.add(0, 2131363822, 0, 2132021945).setIcon(2131232212).setEnabled(z);
    }

    @Override // defpackage.o73
    public final void m(r9i r9iVar, View view) {
        b2l b2lVar;
        itd itdVar = (m66) r9iVar.c;
        o66 o66Var = (o66) r9iVar.d;
        ntl ntlVar = (ntl) this.p.get();
        boolean z = ntlVar.a;
        boolean z2 = ntlVar.b;
        boolean z3 = (z || z2 || ntlVar.c) ? false : true;
        boolean z4 = (z3 || z2) ? false : true;
        du3 du3Var = this.n;
        k6l k6lVar = (k6l) du3Var.get();
        boolean z5 = (k6lVar == null || (b2lVar = k6lVar.o) == null || !((d7l) b2lVar).j.m()) ? false : true;
        boolean zA = r9n.A(this.j);
        boolean z6 = t() && !z3;
        boolean z7 = !z5 || zA || z6;
        if (z5 && !zA && !z6 && !z3) {
            r(itdVar, false);
        } else if (j(view)) {
            if (!z5) {
                itdVar.add(0, 2131363811, 0, 2132018462).setIcon(2131232284);
            }
            if (zA) {
                s(itdVar);
            }
            if (z6) {
                r(itdVar, true);
            }
            if (z4) {
                kze kzeVar = o66Var.F;
                k6l k6lVar2 = (k6l) du3Var.get();
                if (k6lVar2 != null) {
                    ptd ptdVarAdd = itdVar.add(0, 2131363814, 0, 2132021916);
                    ptdVarAdd.setIcon(2131231990);
                    new c37(kzeVar, k6lVar2, ptdVarAdd);
                }
            }
            if (z3) {
                if (z7) {
                    ptd ptdVarAdd2 = itdVar.add(0, 0, 0, "");
                    ptdVarAdd2.setActionView(2131558670);
                    ptdVarAdd2.setEnabled(false);
                }
                q(itdVar);
            }
        } else {
            if (z3) {
                q(itdVar);
                if (z7) {
                    ptd ptdVarAdd3 = itdVar.add(0, 0, 0, "");
                    ptdVarAdd3.setActionView(2131558670);
                    ptdVarAdd3.setEnabled(false);
                }
            }
            if (z4) {
                kze kzeVar2 = o66Var.F;
                k6l k6lVar3 = (k6l) du3Var.get();
                if (k6lVar3 != null) {
                    ptd ptdVarAdd4 = itdVar.add(0, 2131363814, 0, 2132021916);
                    ptdVarAdd4.setIcon(2131231990);
                    new c37(kzeVar2, k6lVar3, ptdVarAdd4);
                }
            }
            if (z6) {
                r(itdVar, true);
            }
            if (zA) {
                s(itdVar);
            }
            if (!z5) {
                itdVar.add(0, 2131363811, 0, 2132018462).setIcon(2131232284);
            }
        }
        r9iVar.S(true);
    }

    @Override // defpackage.dog
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        nwf nwfVar = this.o;
        if (itemId == 2131363822) {
            nwfVar.getClass();
            new c7k(nwfVar, (byte) 4);
            return true;
        }
        byte b = 0;
        if (menuItem.getItemId() == 2131363814) {
            nwfVar.u(false);
            return true;
        }
        if (menuItem.getItemId() == 2131363826) {
            nwfVar.getClass();
            new c7k(nwfVar, (byte) 5);
            return true;
        }
        if (menuItem.getItemId() != 2131363811) {
            return false;
        }
        nwfVar.getClass();
        new c7k(nwfVar, b);
        return true;
    }

    public final void q(Menu menu) {
        MenuItem actionView = menu.add(0, 2131363834, 0, "").setActionView(2131559200);
        actionView.setEnabled(false);
        pt1 pt1VarB = pt1.b(actionView.getActionView());
        k6l k6lVar = (k6l) this.n.get();
        if (k6lVar == null) {
            return;
        }
        new igi(k6lVar, pt1VarB, new eu3(this, (byte) 3), this.o, new cbl(this, (byte) 0), this.q);
    }

    public final void s(Menu menu) {
        boolean z = ru9.c(this.j).a.getBoolean("qr.google_lens_supported", false);
        menu.add(0, 2131363826, 0, z ? 2132019372 : 2132020980).setIcon(z ? 2131232227 : 2131232200);
    }

    public final boolean t() {
        b2l b2lVar;
        k6l k6lVar = (k6l) this.n.get();
        if (k6lVar != null && (b2lVar = k6lVar.o) != null && ((d7l) b2lVar).j.m()) {
            return false;
        }
        if (((lue) this.m.getVisibility().g()).d()) {
            return true;
        }
        wv1 wv1Var = this.k;
        return ((SettingsManager) wv1Var.b.get()).i("speed_dial.enabled") && ((SettingsManager) wv1Var.b.get()).A((xnh) this.l.get());
    }
}
