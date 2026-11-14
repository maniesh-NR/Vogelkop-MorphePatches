package ads_mobile_sdk;

import android.content.Context;
import defpackage.hlo;
import defpackage.mip;
import defpackage.tso;
import defpackage.uie;

/* loaded from: classes.dex */
public final class hl implements hlo {
    public final ob1 a;
    public final tso b;
    public final tso c;
    public final ah0 d;
    public final tso e;
    public final tso f;
    public final tso g;
    public final /* synthetic */ byte h = 1;

    public hl(ah0 ah0Var, ob1 ob1Var, tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5) {
        this.d = ah0Var;
        this.a = ob1Var;
        this.b = tsoVar;
        this.c = tsoVar2;
        this.e = tsoVar3;
        this.f = tsoVar4;
        this.g = tsoVar5;
    }

    public hl(ob1 ob1Var, tso tsoVar, tso tsoVar2, ah0 ah0Var, tso tsoVar3, tso tsoVar4, tso tsoVar5) {
        this.a = ob1Var;
        this.b = tsoVar;
        this.c = tsoVar2;
        this.d = ah0Var;
        this.e = tsoVar3;
        this.f = tsoVar4;
        this.g = tsoVar5;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.h;
        tso tsoVar = this.g;
        tso tsoVar2 = this.f;
        tso tsoVar3 = this.e;
        tso tsoVar4 = this.c;
        tso tsoVar5 = this.b;
        ob1 ob1Var = this.a;
        ah0 ah0Var = this.d;
        switch (b) {
            case 0:
                return new gl((Context) ob1Var.a, (qr0) tsoVar5.get(), (yi) tsoVar4.get(), (nx5) ah0Var.get(), (mip) tsoVar3.get(), (ux2) tsoVar2.get(), (g0) tsoVar.get());
            default:
                nx5 nx5Var = (nx5) ah0Var.get();
                uie uieVar = (uie) ob1Var.a;
                iv1 iv1Var = (iv1) tsoVar4.get();
                defpackage.r83 r83Var = (defpackage.r83) tsoVar3.get();
                ax0 ax0Var = (ax0) tsoVar2.get();
                int iIntValue = ((Integer) tsoVar.get()).intValue();
                defpackage.pr prVar = new defpackage.pr();
                prVar.b = nx5Var;
                prVar.c = uieVar;
                prVar.d = iv1Var;
                prVar.e = r83Var;
                prVar.f = ax0Var;
                prVar.a = iIntValue;
                return prVar;
        }
    }
}
