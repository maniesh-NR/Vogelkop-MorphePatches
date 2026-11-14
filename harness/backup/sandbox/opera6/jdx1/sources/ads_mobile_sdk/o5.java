package ads_mobile_sdk;

import defpackage.hlo;
import defpackage.mip;
import defpackage.tso;
import defpackage.vkp;

/* loaded from: classes.dex */
public final class o5 implements hlo {
    public final tso a;
    public final tso b;
    public final ah0 c;
    public final /* synthetic */ byte d;

    public /* synthetic */ o5(ah0 ah0Var, tso tsoVar, tso tsoVar2, byte b) {
        this.d = b;
        this.c = ah0Var;
        this.a = tsoVar;
        this.b = tsoVar2;
    }

    public /* synthetic */ o5(tso tsoVar, ah0 ah0Var, tso tsoVar2, byte b) {
        this.d = b;
        this.a = tsoVar;
        this.c = ah0Var;
        this.b = tsoVar2;
    }

    public /* synthetic */ o5(tso tsoVar, tso tsoVar2, ah0 ah0Var, byte b) {
        this.d = b;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.c = ah0Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.d;
        tso tsoVar = this.b;
        tso tsoVar2 = this.a;
        ah0 ah0Var = this.c;
        switch (b) {
            case 0:
                return new n5((qr0) tsoVar2.get(), (vkp) tsoVar.get(), (nx5) ah0Var.get());
            case 1:
                return new d90((b90) tsoVar2.get(), (nx5) ah0Var.get(), (qr0) tsoVar.get());
            case 2:
                return new fa1((ah3) ah0Var.get(), (cu2) tsoVar2.get(), (yi) tsoVar.get());
            case 3:
                return new gn0((bn0) tsoVar2.get(), (nx5) ah0Var.get(), (qr0) tsoVar.get());
            case 4:
                return new t03((nx5) ah0Var.get(), (qr0) tsoVar2.get(), (bk1) tsoVar.get());
            case 5:
                return new tp((vkp) tsoVar2.get(), (qr0) tsoVar.get(), (ah3) ah0Var.get());
            case 6:
                return new ux2((g0) tsoVar2.get(), (ah3) ah0Var.get(), (mip) tsoVar.get());
            case 7:
                return new vs2((nx5) ah0Var.get(), (mip) tsoVar2.get(), (qr0) tsoVar.get());
            default:
                return new x03((nx5) ah0Var.get(), (qr0) tsoVar2.get(), (bk1) tsoVar.get());
        }
    }
}
