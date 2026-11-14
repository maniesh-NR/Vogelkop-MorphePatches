package defpackage;

import ads_mobile_sdk.ax0;
import ads_mobile_sdk.cg0;
import ads_mobile_sdk.of0;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final /* synthetic */ class kso implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cg0 b;

    public /* synthetic */ kso(cg0 cg0Var, byte b) {
        this.a = b;
        this.b = cg0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        cg0 cg0Var = this.b;
        switch (b) {
            case 0:
                cg0Var.k.set(false);
                break;
            case 1:
                ax0 ax0Var = cg0Var.g;
                Intent intent = new Intent("android.intent.action.VIEW", cg0.q);
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                String str = cg0Var.p;
                bundle.putString("com.android.browser.application_id", str != null ? str : null);
                intent.putExtras(bundle);
                ax0Var.a(intent);
                break;
            case 2:
                cg0Var.k.set(false);
                break;
            default:
                na2.B(cg0Var.b, h.a, null, new fsg(new of0(cg0Var, str, (byte) 1), str, (byte) 3), 2);
                break;
        }
    }
}
