package ads_mobile_sdk;

import defpackage.hlo;
import defpackage.mip;
import defpackage.tso;

/* loaded from: classes.dex */
public final class k6 implements hlo {
    public final tso a;
    public final tso b;
    public final ah0 c;
    public final tso d;
    public final tso e;
    public final tso f;
    public final /* synthetic */ byte g = 1;

    public k6(ah0 ah0Var, tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5) {
        this.c = ah0Var;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.f = tsoVar5;
    }

    public k6(tso tsoVar, tso tsoVar2, ah0 ah0Var, tso tsoVar3, tso tsoVar4, tso tsoVar5) {
        this.a = tsoVar;
        this.b = tsoVar2;
        this.c = ah0Var;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.f = tsoVar5;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.g;
        tso tsoVar = this.f;
        tso tsoVar2 = this.e;
        tso tsoVar3 = this.d;
        tso tsoVar4 = this.b;
        tso tsoVar5 = this.a;
        ah0 ah0Var = this.c;
        switch (b) {
            case 0:
                return new j6((qr0) tsoVar5.get(), (ki0) tsoVar4.get(), (nx5) ah0Var.get(), (mip) tsoVar3.get(), (ux2) tsoVar2.get(), (g0) tsoVar.get());
            default:
                return new mb1((nx5) ah0Var.get(), (nx5) tsoVar5.get(), (qr0) tsoVar4.get(), (a33) tsoVar3.get(), (ux2) tsoVar2.get(), (ya1) tsoVar.get());
        }
    }
}
