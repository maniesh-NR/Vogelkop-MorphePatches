package ads_mobile_sdk;

import android.content.Context;
import defpackage.hlo;
import defpackage.l3p;
import defpackage.tso;

/* loaded from: classes.dex */
public final class ge3 implements hlo {
    public final ah0 a;
    public final ah0 b;
    public final tso c;
    public final ob1 d;
    public final /* synthetic */ byte e = 0;

    public ge3(ah0 ah0Var, ah0 ah0Var2, tso tsoVar, ob1 ob1Var) {
        this.a = ah0Var;
        this.b = ah0Var2;
        this.c = tsoVar;
        this.d = ob1Var;
    }

    public ge3(ob1 ob1Var, ah0 ah0Var, ah0 ah0Var2, tso tsoVar) {
        this.d = ob1Var;
        this.a = ah0Var;
        this.b = ah0Var2;
        this.c = tsoVar;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.e;
        tso tsoVar = this.c;
        ah0 ah0Var = this.b;
        ah0 ah0Var2 = this.a;
        ob1 ob1Var = this.d;
        switch (b) {
            case 0:
                return new fe3((nx5) ah0Var2.get(), (z2) ah0Var.get(), (ae3) tsoVar.get(), (l3p) ob1Var.a);
            default:
                return new lg3((Context) ob1Var.a, (vz) ah0Var2.get(), (ah3) ah0Var.get(), (qr0) tsoVar.get());
        }
    }
}
