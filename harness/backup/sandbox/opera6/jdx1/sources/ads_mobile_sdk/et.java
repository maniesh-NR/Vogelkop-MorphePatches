package ads_mobile_sdk;

import android.content.Context;
import defpackage.hlo;
import defpackage.tso;

/* loaded from: classes.dex */
public final class et implements hlo {
    public final tso a;
    public final ah0 b;
    public final tso c;
    public final tso d;
    public final ob1 e;
    public final /* synthetic */ byte f;

    public et(ob1 ob1Var, tso tsoVar, ah0 ah0Var, tso tsoVar2, tso tsoVar3) {
        this.f = (byte) 1;
        this.e = ob1Var;
        this.a = tsoVar;
        this.b = ah0Var;
        this.c = tsoVar2;
        this.d = tsoVar3;
    }

    public /* synthetic */ et(tso tsoVar, ah0 ah0Var, tso tsoVar2, tso tsoVar3, ob1 ob1Var, byte b) {
        this.f = b;
        this.a = tsoVar;
        this.b = ah0Var;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.e = ob1Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.f;
        ob1 ob1Var = this.e;
        tso tsoVar = this.d;
        tso tsoVar2 = this.c;
        ah0 ah0Var = this.b;
        tso tsoVar3 = this.a;
        switch (b) {
            case 0:
                return new dt((k8) tsoVar3.get(), (z2) ah0Var.get(), (dl) tsoVar2.get(), (gn0) tsoVar.get(), (a2) ob1Var.a);
            case 1:
                return new zm1((Context) ob1Var.a, (String) tsoVar3.get(), (vz) ah0Var.get(), (ax0) tsoVar2.get(), (qr0) tsoVar.get());
            default:
                return new x92((u92) tsoVar3.get(), (ah3) ah0Var.get(), (qr0) tsoVar2.get(), (m5a) defpackage.i41.k.get(), (zv1) tsoVar.get(), (Context) ob1Var.a);
        }
    }
}
