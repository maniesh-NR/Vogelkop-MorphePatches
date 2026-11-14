package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.AccountPicker;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p1a {
    public final ga6 a;
    public final Activity b;
    public Account c;

    public p1a(Activity activity, ga6 ga6Var) {
        this.b = activity;
        this.a = ga6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i, int i2, Intent intent) {
        q0a q0aVar = (q0a) this.a.b;
        if (i == 1000) {
            if (i2 != -1) {
                if (i2 != 0) {
                    ((wjh) q0aVar.b).t(null);
                    return;
                } else {
                    ((wjh) q0aVar.b).t(null);
                    return;
                }
            }
            if (intent == null) {
                ((wjh) q0aVar.b).t(null);
                return;
            } else {
                this.c = new Account(intent.getStringExtra("authAccount"), intent.getStringExtra("accountType"));
                he2.a(new n1a(this, this.c), new Void[0]);
                return;
            }
        }
        if (i != 1001) {
            ((wjh) q0aVar.b).t(null);
            return;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                ((wjh) q0aVar.b).t(null);
                return;
            } else {
                ((wjh) q0aVar.b).t(null);
                return;
            }
        }
        if (this.c != null) {
            he2.a(new n1a(this, this.c), new Void[0]);
            return;
        }
        Intent intentNewChooseAccountIntent = AccountPicker.newChooseAccountIntent(new AccountPicker.AccountChooserOptions.Builder().setAllowableAccountsTypes(Arrays.asList("com.google")).build());
        Activity activity = this.b;
        if (!(activity instanceof hjf)) {
            a(1000, Integer.MIN_VALUE, null);
            return;
        }
        ((hjf) activity).c.put(1000, new m1a(this, 1000));
        activity.startActivityForResult(intentNewChooseAccountIntent, 1000);
    }
}
