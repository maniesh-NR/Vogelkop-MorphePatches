package ads_mobile_sdk;

import defpackage.hlo;
import defpackage.j3p;
import defpackage.mip;
import defpackage.tso;
import java.util.Optional;

/* loaded from: classes.dex */
public final class nt2 implements hlo {
    public final ah0 a;
    public final tso b;
    public final tso c;
    public final tso d;
    public final tso e;
    public final tso f;
    public final tso g;
    public final /* synthetic */ byte h = 0;

    public nt2(ah0 ah0Var, tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5, tso tsoVar6) {
        this.a = ah0Var;
        this.b = tsoVar;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.f = tsoVar5;
        this.g = tsoVar6;
    }

    public nt2(tso tsoVar, tso tsoVar2, ah0 ah0Var, tso tsoVar3, tso tsoVar4, tso tsoVar5, tso tsoVar6) {
        this.b = tsoVar;
        this.c = tsoVar2;
        this.a = ah0Var;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.f = tsoVar5;
        this.g = tsoVar6;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.h;
        tso tsoVar = this.g;
        tso tsoVar2 = this.f;
        tso tsoVar3 = this.e;
        tso tsoVar4 = this.d;
        ah0 ah0Var = this.a;
        tso tsoVar5 = this.c;
        tso tsoVar6 = this.b;
        switch (b) {
            case 0:
                return new mt2((nx5) ah0Var.get(), (mip) tsoVar6.get(), (tv2) tsoVar5.get(), (zm1) tsoVar4.get(), (j3p) tsoVar3.get(), (i8) tsoVar2.get(), ((Integer) tsoVar.get()).intValue());
            default:
                return new rr1((bq1) tsoVar6.get(), (nx5) tsoVar5.get(), (nx5) ah0Var.get(), (js1) tsoVar4.get(), (Optional) tsoVar3.get(), (g0) tsoVar2.get(), nj0.a(tsoVar));
        }
    }
}
