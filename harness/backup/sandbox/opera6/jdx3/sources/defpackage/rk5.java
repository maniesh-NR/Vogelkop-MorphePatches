package defpackage;

import com.leanplum.Leanplum;
import com.leanplum.callbacks.StartCallback;

/* loaded from: classes.dex */
public final class rk5 extends StartCallback {
    public final /* synthetic */ uk5 a;
    public final /* synthetic */ String b;

    public rk5(uk5 uk5Var, String str) {
        this.a = uk5Var;
        this.b = str;
    }

    @Override // com.leanplum.callbacks.StartCallback
    public final void onResponse(boolean z) {
        uk5 uk5Var = this.a;
        if (!z) {
            uk5Var.run(new rw7(new dzh("Onboarding")));
        } else {
            Leanplum.setCustomParam("configBundle", this.b);
            Leanplum.forceContentUpdate(new qk5(uk5Var, (byte) 1));
        }
    }
}
