package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.AccountPicker;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q0a extends n1 {
    public final p1a c;

    public q0a(wjh wjhVar) {
        super((Object) wjhVar, (byte) 17);
        this.c = new p1a((Activity) wjhVar.b, new ga6(this, (byte) 15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.n1
    public final void D0() {
        p1a p1aVar = this.c;
        p1aVar.getClass();
        Intent intentNewChooseAccountIntent = AccountPicker.newChooseAccountIntent(new AccountPicker.AccountChooserOptions.Builder().setAllowableAccountsTypes(Arrays.asList("com.google")).build());
        Activity activity = p1aVar.b;
        if (!(activity instanceof hjf)) {
            p1aVar.a(1000, Integer.MIN_VALUE, null);
            return;
        }
        ((hjf) activity).c.put(1000, new m1a(p1aVar, 1000));
        activity.startActivityForResult(intentNewChooseAccountIntent, 1000);
    }
}
