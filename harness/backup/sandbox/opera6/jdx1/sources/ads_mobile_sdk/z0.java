package ads_mobile_sdk;

import android.content.Context;
import defpackage.hlo;
import defpackage.k3p;
import defpackage.kap;
import defpackage.mip;
import defpackage.tso;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class z0 implements hlo {
    public final tso a;
    public final tso b;
    public final ob1 c;
    public final tso d;
    public final /* synthetic */ byte e;

    public /* synthetic */ z0(ob1 ob1Var, tso tsoVar, tso tsoVar2, tso tsoVar3, byte b) {
        this.e = b;
        this.c = ob1Var;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.d = tsoVar3;
    }

    public /* synthetic */ z0(tso tsoVar, ob1 ob1Var, tso tsoVar2, tso tsoVar3, byte b) {
        this.e = b;
        this.a = tsoVar;
        this.c = ob1Var;
        this.b = tsoVar2;
        this.d = tsoVar3;
    }

    public /* synthetic */ z0(tso tsoVar, tso tsoVar2, ob1 ob1Var, tso tsoVar3, byte b) {
        this.e = b;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.c = ob1Var;
        this.d = tsoVar3;
    }

    public /* synthetic */ z0(tso tsoVar, tso tsoVar2, tso tsoVar3, ob1 ob1Var, byte b) {
        this.e = b;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.d = tsoVar3;
        this.c = ob1Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.e;
        ob1 ob1Var = this.c;
        tso tsoVar = this.d;
        tso tsoVar2 = this.b;
        tso tsoVar3 = this.a;
        switch (b) {
            case 0:
                return new y0((k3p) tsoVar3.get(), (Map) tsoVar2.get(), (l7) ob1Var.a, (th3) tsoVar.get());
            case 1:
                return new y12((k3p) tsoVar3.get(), (rp1) tsoVar2.get(), (Map) ob1Var.a, (th3) tsoVar.get(), (byte) 1);
            case 2:
                return new qk2((k3p) tsoVar3.get(), (rp1) tsoVar2.get(), (l7) ob1Var.a, (th3) tsoVar.get());
            case 3:
                return new bq1((Context) ob1Var.a, (nx5) tsoVar3.get(), (g0) tsoVar2.get(), (kj0) tsoVar.get());
            case 4:
                return new f72((s52) tsoVar3.get(), (a2) ob1Var.a, (qr0) tsoVar2.get(), (CoroutineContext) tsoVar.get());
            case 5:
                return new la3((Context) ob1Var.a, (ki0) tsoVar3.get(), (qr0) tsoVar2.get(), (ax0) tsoVar.get());
            case 6:
                kap kapVarA = nj0.a(tsoVar3);
                kap kapVarA2 = nj0.a(tsoVar2);
                kap kapVarA3 = nj0.a(tsoVar);
                l7 l7Var = (l7) ob1Var.a;
                return new mk2(kapVarA, kapVarA2, kapVarA3, l7Var.J().v(), l7Var.J().o(), l7Var.A(), l7Var.M());
            case 7:
                return new qk2((k3p) tsoVar3.get(), (rp1) tsoVar2.get(), (Context) ob1Var.a, (th3) tsoVar.get(), (byte) 0);
            case 8:
                return new uq2((g9) tsoVar3.get(), (defpackage.r83) ob1Var.a, (ek) tsoVar2.get(), (defpackage.bu1) tsoVar.get());
            default:
                return new bj0(nj0.a(tsoVar3), (th3) tsoVar2.get(), (mip) tsoVar.get(), ((l7) ob1Var.a).J().s());
        }
    }
}
