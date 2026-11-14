package ads_mobile_sdk;

import defpackage.hlo;
import defpackage.tso;

/* loaded from: classes.dex */
public final class g93 implements hlo {
    public final ah0 a;
    public final tso b;
    public final ah0 c;
    public final /* synthetic */ byte d;

    public /* synthetic */ g93(ah0 ah0Var, tso tsoVar, ah0 ah0Var2, byte b) {
        this.d = b;
        this.a = ah0Var;
        this.b = tsoVar;
        this.c = ah0Var2;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.d;
        ah0 ah0Var = this.c;
        tso tsoVar = this.b;
        ah0 ah0Var2 = this.a;
        switch (b) {
            case 0:
                return new f93((d91) ah0Var2.get(), (qr0) tsoVar.get(), (ah3) ah0Var.get());
            default:
                return new mu0((vz) ah0Var2.get(), (qr0) tsoVar.get(), (ah3) ah0Var.get());
        }
    }
}
