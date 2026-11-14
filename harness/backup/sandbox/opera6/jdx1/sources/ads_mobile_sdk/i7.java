package ads_mobile_sdk;

import android.content.Context;
import defpackage.anp;
import defpackage.hlo;
import defpackage.tso;

/* loaded from: classes.dex */
public final class i7 implements hlo {
    public final tso a;
    public final tso b;
    public final tso c;
    public final tso d;
    public final tso e;
    public final tso f;
    public final ob1 g;
    public final /* synthetic */ byte h = 1;

    public i7(ob1 ob1Var, tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5, tso tsoVar6) {
        this.g = ob1Var;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.c = tsoVar3;
        this.d = tsoVar4;
        this.e = tsoVar5;
        this.f = tsoVar6;
    }

    public i7(tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5, tso tsoVar6, ob1 ob1Var) {
        this.a = tsoVar;
        this.b = tsoVar2;
        this.c = tsoVar3;
        this.d = tsoVar4;
        this.e = tsoVar5;
        this.f = tsoVar6;
        this.g = ob1Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.h;
        tso tsoVar = this.f;
        tso tsoVar2 = this.e;
        tso tsoVar3 = this.d;
        tso tsoVar4 = this.c;
        tso tsoVar5 = this.b;
        tso tsoVar6 = this.a;
        ob1 ob1Var = this.g;
        switch (b) {
            case 0:
                return new h7((n61) tsoVar6.get(), (u83) tsoVar5.get(), (ia3) tsoVar4.get(), (th3) tsoVar3.get(), (anp) tsoVar2.get(), nj0.a(tsoVar), (l7) ob1Var.a);
            default:
                return new k8((Context) ob1Var.a, (qr0) tsoVar6.get(), (ax0) tsoVar5.get(), (g0) tsoVar4.get(), (qw) tsoVar3.get(), (String) tsoVar2.get(), (ux2) tsoVar.get());
        }
    }
}
