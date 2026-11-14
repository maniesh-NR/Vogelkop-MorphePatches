package ads_mobile_sdk;

import android.content.Context;
import defpackage.hlo;
import defpackage.k3p;
import defpackage.mip;
import defpackage.tso;
import defpackage.zzo;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class xs implements hlo {
    public final hlo a;
    public final tso b;
    public final tso c;
    public final tso d;
    public final tso e;
    public final /* synthetic */ byte f = 0;

    public xs(ah0 ah0Var, ah0 ah0Var2, tso tsoVar, tso tsoVar2, tso tsoVar3) {
        this.a = ah0Var;
        this.b = ah0Var2;
        this.c = tsoVar;
        this.d = tsoVar2;
        this.e = tsoVar3;
    }

    public xs(ah0 ah0Var, ob1 ob1Var, ah0 ah0Var2, ob1 ob1Var2, tso tsoVar) {
        this.a = ah0Var;
        this.d = ob1Var;
        this.b = ah0Var2;
        this.e = ob1Var2;
        this.c = tsoVar;
    }

    public xs(ah0 ah0Var, tso tsoVar, tso tsoVar2, e6 e6Var, tso tsoVar3) {
        this.a = ah0Var;
        this.c = tsoVar;
        this.d = tsoVar2;
        this.b = e6Var;
        this.e = tsoVar3;
    }

    public xs(ah0 ah0Var, tso tsoVar, tso tsoVar2, tso tsoVar3, ab0 ab0Var) {
        this.a = ah0Var;
        this.c = tsoVar;
        this.d = tsoVar2;
        this.e = tsoVar3;
        this.b = ab0Var;
    }

    public xs(ob1 ob1Var, ah0 ah0Var, tso tsoVar, ah0 ah0Var2, b23 b23Var) {
        this.d = ob1Var;
        this.a = ah0Var;
        this.c = tsoVar;
        this.b = ah0Var2;
        this.e = b23Var;
    }

    public xs(ob1 ob1Var, tso tsoVar, ob1 ob1Var2, ah0 ah0Var, tso tsoVar2) {
        this.b = ob1Var;
        this.c = tsoVar;
        this.e = ob1Var2;
        this.a = ah0Var;
        this.d = tsoVar2;
    }

    public xs(ob1 ob1Var, tso tsoVar, ob1 ob1Var2, ob1 ob1Var3, tso tsoVar2) {
        this.a = ob1Var;
        this.c = tsoVar;
        this.b = ob1Var2;
        this.e = ob1Var3;
        this.d = tsoVar2;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.f;
        tso tsoVar = this.d;
        tso tsoVar2 = this.e;
        tso tsoVar3 = this.b;
        tso tsoVar4 = this.c;
        hlo hloVar = this.a;
        switch (b) {
            case 0:
                return new ws((nx5) ((ah0) hloVar).get(), (ko3) ((ah0) tsoVar3).get(), (ux2) tsoVar4.get(), (qr0) tsoVar.get(), (ax0) tsoVar2.get());
            case 1:
                x33 x33Var = new x33();
                new pfe();
                return x33Var;
            case 2:
                return new if2((nx5) ((ah0) hloVar).get(), (mip) tsoVar4.get(), (qr0) tsoVar.get(), (pb1) ((e6) tsoVar3).get(), (ux2) tsoVar2.get());
            case 3:
                return new ne3((nx5) ((ah0) hloVar).get(), (zzo) ((ob1) tsoVar).a, (z2) ((ah0) tsoVar3).get(), (a2) ((ob1) tsoVar2).a, (zv1) tsoVar4.get());
            case 4:
                return new qf2((a2) ((ob1) tsoVar3).a, (mip) tsoVar4.get(), (xv) ((ob1) tsoVar2).a, (nx5) ((ah0) hloVar).get(), (ux2) tsoVar.get());
            case 5:
                return new p22((Context) ((ob1) tsoVar).a, (nx5) ((ah0) hloVar).get(), (mip) tsoVar4.get(), (ah3) ((ah0) tsoVar3).get(), (Set) ((b23) tsoVar2).get());
            default:
                return new ar2((k3p) ((ob1) hloVar).a, (rp1) tsoVar4.get(), (Map) ((ob1) tsoVar3).a, (Context) ((ob1) tsoVar2).a, (th3) tsoVar.get(), (byte) 1);
        }
    }
}
