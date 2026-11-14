package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class qyc extends eog implements MenuItem.OnMenuItemClickListener {
    public final SettingsManager i;
    public final t02 j;
    public n7j k;
    public boolean l;

    public qyc(SettingsManager settingsManager, t02 t02Var) {
        this.i = settingsManager;
        this.j = t02Var;
    }

    public final void onCreate(Bundle bundle) {
        super/*androidx.fragment.app.i*/.onCreate(bundle);
        Context contextRequireContext = requireContext();
        ps5 ps5Var = new ps5(contextRequireContext);
        ps5Var.c = this;
        ps5Var.e = this;
        qtd qtdVarA = ps5Var.a(1, 2, 0, n7j.NEVER_LOCKED.d(contextRequireContext.getResources()));
        qtd qtdVarA2 = ps5Var.a(1, 3, 0, n7j.TEN_MINUTES_UNLOCKED.d(contextRequireContext.getResources()));
        qtd qtdVarA3 = ps5Var.a(1, 1, 0, n7j.ALWAYS_LOCKED.d(contextRequireContext.getResources()));
        int iOrdinal = this.i.p().ordinal();
        if (iOrdinal == 0) {
            qtdVarA = qtdVarA3;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                h9o.p();
                return;
            }
            qtdVarA = qtdVarA2;
        }
        qtdVarA.setChecked(true);
        ps5Var.setHeaderTitle(2132021344);
        ps5Var.setGroupCheckable(1, true, true);
        this.d = ps5Var;
        this.h = this;
    }

    @Override // defpackage.uim
    public final void onDestroy() {
        super.onDestroy();
        this.h = null;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super/*androidx.fragment.app.i*/.onDismiss(dialogInterface);
        if (this.l) {
            return;
        }
        this.l = true;
        n7j n7jVar = this.k;
        if (n7jVar != null) {
            this.j.invoke(n7jVar);
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        n7j n7jVar;
        int itemId = menuItem.getItemId();
        n7j[] n7jVarArrValues = n7j.values();
        int length = n7jVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                n7jVar = null;
                break;
            }
            n7jVar = n7jVarArrValues[i];
            if (n7jVar.a == itemId) {
                break;
            }
            i++;
        }
        if (n7jVar == null) {
            n7jVar = n7j.ALWAYS_LOCKED;
        }
        if (n7jVar != n7j.NEVER_LOCKED) {
            SettingsManager settingsManager = this.i;
            settingsManager.getClass();
            settingsManager.V(n7jVar.d, "lock_password_manager");
            this.k = n7jVar;
            return true;
        }
        lqh lqhVar = new lqh();
        rxh rxhVar = new rxh(2132021346);
        mt2 mt2Var = new mt2(lqhVar, (byte) 2);
        mt2 mt2Var2 = new mt2(lqhVar, (byte) 3);
        z0c z0cVar = new z0c(lqhVar, this, (byte) 5);
        gkj gkjVar = new gkj(false, false);
        gkjVar.a = null;
        gkjVar.b = null;
        gkjVar.c = null;
        gkjVar.d = null;
        gkjVar.e = null;
        gkjVar.f = z0cVar;
        gkjVar.g = null;
        gkjVar.h = mt2Var;
        gkjVar.i = mt2Var2;
        gkjVar.j = null;
        gkjVar.k = 2132021347;
        gkjVar.l = 2132018111;
        gkjVar.m = 2132021348;
        gkjVar.n = true;
        gkjVar.o = rxhVar;
        z77 z77VarU = sfe.U(getContext());
        z77VarU.getClass();
        z77VarU.b(gkjVar, ijm.b);
        return true;
    }
}
