package ads_mobile_sdk;

import defpackage.fjp;
import defpackage.hlo;
import defpackage.tso;
import defpackage.uie;
import java.util.Optional;

/* loaded from: classes.dex */
public final class kx1 implements hlo {
    public final ob1 a;
    public final tso b;
    public final ah0 c;
    public final tso d;
    public final tso e;
    public final tso f;
    public final tso g;
    public final tso h;
    public final /* synthetic */ byte i = 0;

    public kx1(ob1 ob1Var, tso tsoVar, ah0 ah0Var, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5, tso tsoVar6) {
        this.a = ob1Var;
        this.b = tsoVar;
        this.c = ah0Var;
        this.d = tsoVar2;
        this.e = tsoVar3;
        this.f = tsoVar4;
        this.g = tsoVar5;
        this.h = tsoVar6;
    }

    public kx1(tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5, ob1 ob1Var, tso tsoVar6, ah0 ah0Var) {
        this.b = tsoVar;
        this.d = tsoVar2;
        this.e = tsoVar3;
        this.f = tsoVar4;
        this.g = tsoVar5;
        this.a = ob1Var;
        this.h = tsoVar6;
        this.c = ah0Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.i;
        ah0 ah0Var = this.c;
        tso tsoVar = this.h;
        ob1 ob1Var = this.a;
        tso tsoVar2 = this.g;
        tso tsoVar3 = this.f;
        tso tsoVar4 = this.e;
        tso tsoVar5 = this.d;
        tso tsoVar6 = this.b;
        switch (b) {
            case 0:
                uie uieVar = (uie) ob1Var.a;
                tp tpVar = (tp) tsoVar6.get();
                ah3 ah3Var = (ah3) ah0Var.get();
                xy1 xy1Var = (xy1) tsoVar5.get();
                oo3 oo3Var = (oo3) tsoVar4.get();
                return new jx1(uieVar, tpVar, ah3Var, xy1Var, oo3Var, (nx5) tsoVar2.get(), (ux2) tsoVar.get());
            default:
                return new xb2((n13) tsoVar6.get(), (ae2) tsoVar5.get(), (sc2) tsoVar4.get(), (defpackage.r83) tsoVar3.get(), (av2) tsoVar2.get(), (Optional) ob1Var.a, (fjp) tsoVar.get(), (ah3) ah0Var.get());
        }
    }
}
