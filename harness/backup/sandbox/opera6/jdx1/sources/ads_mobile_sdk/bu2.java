package ads_mobile_sdk;

import android.content.Context;
import defpackage.eyo;
import defpackage.hlo;
import defpackage.skp;
import defpackage.tso;
import java.util.Optional;

/* loaded from: classes.dex */
public final class bu2 implements hlo {
    public final tso a;
    public final tso b;
    public final ah0 c;
    public final tso d;
    public final tso e;
    public final tso f;
    public final tso g;
    public final tso h;
    public final ob1 i;
    public final /* synthetic */ byte j = 1;

    public bu2(ah0 ah0Var, tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, ob1 ob1Var, tso tsoVar5, tso tsoVar6, tso tsoVar7) {
        this.c = ah0Var;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.i = ob1Var;
        this.f = tsoVar5;
        this.g = tsoVar6;
        this.h = tsoVar7;
    }

    public bu2(tso tsoVar, tso tsoVar2, ah0 ah0Var, tso tsoVar3, tso tsoVar4, tso tsoVar5, tso tsoVar6, tso tsoVar7, ob1 ob1Var) {
        this.a = tsoVar;
        this.b = tsoVar2;
        this.c = ah0Var;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.f = tsoVar5;
        this.g = tsoVar6;
        this.h = tsoVar7;
        this.i = ob1Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.j;
        tso tsoVar = this.h;
        tso tsoVar2 = this.g;
        tso tsoVar3 = this.f;
        ob1 ob1Var = this.i;
        tso tsoVar4 = this.e;
        tso tsoVar5 = this.d;
        tso tsoVar6 = this.b;
        tso tsoVar7 = this.a;
        ah0 ah0Var = this.c;
        switch (b) {
            case 0:
                return new au2((qr0) tsoVar7.get(), (ek) tsoVar6.get(), (ah3) ah0Var.get(), (wp) tsoVar5.get(), (Optional) tsoVar4.get(), (skp) tsoVar3.get(), (bk1) tsoVar2.get(), ((Integer) tsoVar.get()).intValue(), (Context) ob1Var.a);
            default:
                nx5 nx5Var = (nx5) ah0Var.get();
                return new p30(nx5Var, (qr0) tsoVar6.get(), (qw) tsoVar5.get(), (eyo) tsoVar4.get(), (Context) ob1Var.a, (ux2) tsoVar3.get(), (i41) tsoVar2.get(), (mi0) tsoVar.get());
        }
    }
}
