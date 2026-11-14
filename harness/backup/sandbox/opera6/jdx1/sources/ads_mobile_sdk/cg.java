package ads_mobile_sdk;

import defpackage.hlo;
import defpackage.mip;
import defpackage.tso;
import defpackage.vkp;

/* loaded from: classes.dex */
public final class cg implements hlo {
    public final ah0 a;
    public final tso b;
    public final tso c;
    public final tso d;
    public final tso e;
    public final tso f;
    public final tso g;
    public final tso h;
    public final /* synthetic */ byte i = 0;

    public cg(ah0 ah0Var, tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5, tso tsoVar6, tso tsoVar7) {
        this.a = ah0Var;
        this.b = tsoVar;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.f = tsoVar5;
        this.g = tsoVar6;
        this.h = tsoVar7;
    }

    public cg(tso tsoVar, tso tsoVar2, tso tsoVar3, ah0 ah0Var, tso tsoVar4, tso tsoVar5, tso tsoVar6, tso tsoVar7) {
        this.b = tsoVar;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.a = ah0Var;
        this.e = tsoVar4;
        this.f = tsoVar5;
        this.g = tsoVar6;
        this.h = tsoVar7;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.i;
        tso tsoVar = this.h;
        tso tsoVar2 = this.g;
        tso tsoVar3 = this.f;
        tso tsoVar4 = this.e;
        ah0 ah0Var = this.a;
        tso tsoVar5 = this.d;
        tso tsoVar6 = this.c;
        tso tsoVar7 = this.b;
        switch (b) {
            case 0:
                return new bg((nx5) ah0Var.get(), (nx5) tsoVar7.get(), (qr0) tsoVar6.get(), (mip) tsoVar5.get(), (vkp) tsoVar4.get(), (we) tsoVar3.get(), (ef) tsoVar2.get(), (ux2) tsoVar.get());
            default:
                return new cs1((ki0) tsoVar7.get(), (bq1) tsoVar6.get(), (nx5) tsoVar5.get(), (nx5) ah0Var.get(), (vkp) tsoVar4.get(), (g0) tsoVar3.get(), (ux2) tsoVar2.get(), (kh3) tsoVar.get());
        }
    }
}
