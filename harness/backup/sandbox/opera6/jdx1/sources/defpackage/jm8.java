package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class jm8 implements r1o {
    public final /* synthetic */ tm8 a;
    public final /* synthetic */ GURL b;
    public final /* synthetic */ GURL c;
    public final /* synthetic */ Intent d;
    public final /* synthetic */ bpd e;

    public jm8(bpd bpdVar, tm8 tm8Var, GURL gurl, GURL gurl2, Intent intent) {
        this.a = tm8Var;
        this.b = gurl;
        this.c = gurl2;
        this.d = intent;
        this.e = bpdVar;
    }

    public final void a(int i, Intent intent) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        tm8 tm8Var = this.a;
        d23 d23Var = tm8Var.u;
        if (intent == null) {
            d23Var.onResult(sm8.c());
            return;
        }
        if (!intent.getAction().equals("android.intent.action.CREATE_SHORTCUT")) {
            Intent intent2 = this.d;
            intent2.setSelector(null);
            intent2.setPackage(intent.getComponent().getPackageName());
            this.e.Y(intent2, tm8Var, false, null, null, null, null);
            d23Var.onResult(sm8.a(tm8Var, true));
            return;
        }
        iqh iqhVar = (iqh) tm8Var.g.b;
        if (iqhVar != null) {
            iqhVar.c = true;
        }
        GURL gurl = this.b;
        if (vqm.b(gurl)) {
            d23Var.onResult(sm8.b(gurl, tm8Var));
            return;
        }
        GURL gurl2 = this.c;
        if (gurl2.a.isEmpty()) {
            d23Var.onResult(sm8.c());
        } else {
            d23Var.onResult(sm8.b(gurl2, tm8Var));
        }
    }
}
