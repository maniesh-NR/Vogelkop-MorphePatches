package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.opera.android.OperaApplication;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class nf7 extends o73 {
    public final x77 j;
    public final re7 k;
    public final bf7 l = new bf7(this, (byte) 1);
    public final g1j m;
    public final jv0 n;

    public nf7(re7 re7Var, x77 x77Var, g1j g1jVar, jv0 jv0Var) {
        this.k = re7Var;
        this.j = x77Var;
        this.m = g1jVar;
        this.n = jv0Var;
    }

    public static void q(int i, Menu menu) {
        menu.findItem(i).setVisible(false);
    }

    @Override // defpackage.o73
    public final void m(r9i r9iVar, View view) {
        r9iVar.L(2131755029);
        itd itdVar = (m66) r9iVar.c;
        bf7 bf7Var = this.l;
        re7 re7Var = this.k;
        re7Var.u.b(bf7Var);
        boolean zR = wqm.r(re7Var.t.getUrl());
        if (!re7Var.k() || !rf7.g(re7Var).d()) {
            q(2131362583, itdVar);
            itdVar.findItem(2131362578).setVisible(false);
        }
        if (zR) {
            q(2131362580, itdVar);
            itdVar.findItem(2131362586).setVisible(false);
        }
        if (!re7Var.k()) {
            q(2131362584, itdVar);
            itdVar.findItem(2131362582).setVisible(false);
            itdVar.findItem(2131362585).setVisible(false);
            itdVar.findItem(2131362586).setVisible(false);
        }
        g1j g1jVar = this.m;
        if (g1jVar == null || !re7Var.k() || !g1jVar.isEnabled()) {
            q(2131362595, itdVar);
        }
        jv0 jv0Var = this.n;
        if (jv0Var == null || !re7Var.k() || !jv0Var.v() || jg7.a(re7Var) == null) {
            q(2131362579, itdVar);
        }
        if (re7Var.n()) {
            q(2131362583, itdVar);
            itdVar.findItem(2131362578).setVisible(false);
            itdVar.findItem(2131362582).setVisible(false);
            itdVar.findItem(2131362586).setVisible(false);
            itdVar.findItem(2131362584).setVisible(false);
            itdVar.findItem(2131362595).setVisible(false);
        }
    }

    @Override // defpackage.o73, android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        super.onDismiss();
        this.k.t(this.l);
        Object obj = this.j.d;
    }

    @Override // defpackage.dog
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        re7 re7Var = this.k;
        x77 x77Var = this.j;
        if (itemId == 2131362582) {
            jg7 jg7Var = (jg7) x77Var.d;
            ((x5f) jg7Var.i).O(oc0.g, re7Var.c());
            Context context = jg7Var.a.getContext();
            jg7.b(context, re7Var, new gg7(jg7Var, re7Var, context, true, (byte) 0), new hg7((Object) jg7Var, (Object) context, true));
            return true;
        }
        if (menuItem.getItemId() == 2131362580) {
            String url = re7Var.t.getUrl();
            jg7 jg7Var2 = (jg7) x77Var.d;
            ((x5f) jg7Var2.i).O(oc0.h, ((re7) x77Var.b).c());
            lcp.m(jg7Var2.a.getContext(), url);
            return true;
        }
        if (menuItem.getItemId() == 2131362586) {
            jg7 jg7Var3 = (jg7) x77Var.d;
            ((x5f) jg7Var3.i).O(oc0.i, re7Var.c());
            Context context2 = jg7Var3.a.getContext();
            jg7.b(context2, re7Var, new gl6(jg7Var3, re7Var, context2, (byte) 9), new ig7(jg7Var3));
            return true;
        }
        if (menuItem.getItemId() == 2131362584) {
            jg7 jg7Var4 = (jg7) x77Var.d;
            orm ormVar = jg7Var4.i;
            re7 re7Var2 = (re7) x77Var.b;
            ((x5f) ormVar).O(oc0.d, re7Var2.c());
            jg7Var4.g(Collections.singletonList(re7Var2), false);
            return true;
        }
        if (menuItem.getItemId() == 2131362585) {
            jg7 jg7Var5 = (jg7) x77Var.d;
            orm ormVar2 = jg7Var5.i;
            re7 re7Var3 = (re7) x77Var.b;
            ((x5f) ormVar2).O(oc0.l, re7Var3.c());
            Context context3 = jg7Var5.a.getContext();
            if (context3 != null) {
                bg7 bg7Var = new bg7(re7Var3, new a32(jg7Var5, context3, re7Var3, (byte) 8));
                z77 z77Var = (z77) context3.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
                z77Var.getClass();
                z77Var.b(bg7Var, ijm.b);
                return true;
            }
        } else {
            if (menuItem.getItemId() == 2131362581) {
                jg7 jg7Var6 = (jg7) x77Var.d;
                orm ormVar3 = jg7Var6.i;
                re7 re7Var4 = (re7) x77Var.b;
                ((x5f) ormVar3).O(oc0.f, re7Var4.c());
                jg7Var6.g(Collections.singletonList(re7Var4), true);
                return true;
            }
            if (menuItem.getItemId() == 2131362595) {
                this.m.t(re7Var);
                return true;
            }
            if (menuItem.getItemId() == 2131362583) {
                orm ormVar4 = ((jg7) x77Var.d).i;
                re7 re7Var5 = (re7) x77Var.b;
                ((x5f) ormVar4).O(oc0.j, re7Var5.c());
                Context context4 = ((View) x77Var.c).getContext();
                String[] strArr = OperaApplication.K;
                tjg tjgVarX = ((OperaApplication) context4.getApplicationContext()).x();
                egd[] egdVarArr = {new egd(re7Var5)};
                ujc ujcVar = tjgVarX.i;
                if (((gk9) ujcVar).b.getShuffleModeEnabled()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < ujcVar.p(); i++) {
                        arrayList.add(ujcVar.Q(i));
                    }
                    ArrayList arrayListC = w7d.C(ujcVar);
                    if (ujcVar.getShuffleModeEnabled()) {
                        uup.k(new evc(arrayList, arrayListC), true).a(new qie(tjgVarX, (byte) 8));
                        ujcVar.setShuffleModeEnabled(false);
                    }
                }
                tjgVarX.e(egdVarArr, new kjg(tjgVarX, (byte) 4));
                return true;
            }
            if (menuItem.getItemId() == 2131362578) {
                orm ormVar5 = ((jg7) x77Var.d).i;
                re7 re7Var6 = (re7) x77Var.b;
                ((x5f) ormVar5).O(oc0.k, re7Var6.c());
                Context context5 = ((View) x77Var.c).getContext();
                String[] strArr2 = OperaApplication.K;
                tjg tjgVarX2 = ((OperaApplication) context5.getApplicationContext()).x();
                egd[] egdVarArr2 = {new egd(re7Var6)};
                ujc ujcVar2 = tjgVarX2.i;
                if (((gk9) ujcVar2).b.getShuffleModeEnabled()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < ujcVar2.p(); i2++) {
                        arrayList2.add(ujcVar2.Q(i2));
                    }
                    ArrayList arrayListC2 = w7d.C(ujcVar2);
                    if (ujcVar2.getShuffleModeEnabled()) {
                        uup.k(new evc(arrayList2, arrayListC2), true).a(new qie(tjgVarX2, (byte) 8));
                        ujcVar2.setShuffleModeEnabled(false);
                    }
                }
                tjgVarX2.e(egdVarArr2, new kjg(tjgVarX2, (byte) 0));
                return true;
            }
            if (menuItem.getItemId() != 2131362579) {
                return false;
            }
            jg7 jg7Var7 = (jg7) x77Var.d;
            u92 u92VarA = jg7.a(re7Var);
            if (u92VarA != null) {
                ((x5f) jg7Var7.i).O(oc0.m, re7Var.c());
                jg7Var7.a.g0();
                jg7Var7.h.j(Collections.singletonList(u92VarA), x92.b);
            }
        }
        return true;
    }
}
