package ads_mobile_sdk;

import android.content.Context;
import defpackage.hlo;
import defpackage.mip;
import defpackage.tso;

/* loaded from: classes.dex */
public final class cn0 implements hlo {
    public final ob1 a;
    public final ah0 b;
    public final tso c;
    public final tso d;
    public final /* synthetic */ byte e;

    public cn0(ah0 ah0Var, tso tsoVar, tso tsoVar2, ob1 ob1Var) {
        this.e = (byte) 2;
        this.b = ah0Var;
        this.c = tsoVar;
        this.d = tsoVar2;
        this.a = ob1Var;
    }

    public cn0(ob1 ob1Var, ah0 ah0Var, tso tsoVar, tso tsoVar2) {
        this.e = (byte) 0;
        this.a = ob1Var;
        this.b = ah0Var;
        this.c = tsoVar;
        this.d = tsoVar2;
    }

    public /* synthetic */ cn0(ob1 ob1Var, tso tsoVar, tso tsoVar2, ah0 ah0Var, byte b) {
        this.e = b;
        this.a = ob1Var;
        this.c = tsoVar;
        this.d = tsoVar2;
        this.b = ah0Var;
    }

    public cn0(tso tsoVar, tso tsoVar2, ob1 ob1Var, ah0 ah0Var) {
        this.e = (byte) 4;
        this.c = tsoVar;
        this.d = tsoVar2;
        this.a = ob1Var;
        this.b = ah0Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.e;
        ah0 ah0Var = this.b;
        ob1 ob1Var = this.a;
        tso tsoVar = this.d;
        tso tsoVar2 = this.c;
        switch (b) {
            case 0:
                return new bn0((Context) ob1Var.a, (ah3) ah0Var.get(), (ux2) tsoVar2.get(), (qr0) tsoVar.get());
            case 1:
                return new l23((Context) ob1Var.a, (qr0) tsoVar2.get(), (mip) tsoVar.get(), (nx5) ah0Var.get());
            case 2:
                return new bw2();
            case 3:
                return new ur0((Context) ob1Var.a, (qr0) tsoVar2.get(), (mip) tsoVar.get(), (nx5) ah0Var.get());
            default:
                return new wm0((defpackage.r83) tsoVar2.get(), (bn0) tsoVar.get(), (a2) ob1Var.a, (nx5) ah0Var.get());
        }
    }
}
