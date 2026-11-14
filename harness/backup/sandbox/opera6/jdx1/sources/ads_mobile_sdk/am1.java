package ads_mobile_sdk;

import android.content.Context;
import defpackage.anp;
import defpackage.dkp;
import defpackage.glo;
import defpackage.hlo;
import defpackage.k3p;
import defpackage.kyo;
import defpackage.mip;
import defpackage.tso;
import defpackage.yjp;
import java.util.Map;
import java.util.Optional;

/* loaded from: classes.dex */
public final class am1 implements hlo {
    public final tso a;
    public final tso b;
    public final ob1 c;
    public final tso d;
    public final tso e;
    public final tso f;
    public final /* synthetic */ byte g;

    public /* synthetic */ am1(ob1 ob1Var, tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5, byte b) {
        this.g = b;
        this.c = ob1Var;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.f = tsoVar5;
    }

    public /* synthetic */ am1(tso tsoVar, tso tsoVar2, ob1 ob1Var, tso tsoVar3, tso tsoVar4, tso tsoVar5, byte b) {
        this.g = b;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.c = ob1Var;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.f = tsoVar5;
    }

    public am1(tso tsoVar, tso tsoVar2, tso tsoVar3, ob1 ob1Var, tso tsoVar4, tso tsoVar5) {
        this.g = (byte) 3;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.d = tsoVar3;
        this.c = ob1Var;
        this.e = tsoVar4;
        this.f = tsoVar5;
    }

    public am1(tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5, ob1 ob1Var) {
        this.g = (byte) 4;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.f = tsoVar5;
        this.c = ob1Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.g;
        tso tsoVar = this.f;
        tso tsoVar2 = this.e;
        tso tsoVar3 = this.d;
        tso tsoVar4 = this.b;
        tso tsoVar5 = this.a;
        ob1 ob1Var = this.c;
        switch (b) {
            case 0:
                return new zl1((qr0) tsoVar5.get(), (zt1) tsoVar4.get(), (kyo) ob1Var.a, (zv1) tsoVar3.get(), (nx5) tsoVar2.get(), (s02) tsoVar.get());
            case 1:
                return new zq1((Context) ob1Var.a, (g0) tsoVar5.get(), (bq1) tsoVar4.get(), (String) tsoVar3.get(), (nx5) tsoVar2.get(), (ki0) tsoVar.get());
            case 2:
                return new a13((String) tsoVar5.get(), (qr0) tsoVar4.get(), (Context) ob1Var.a, (ax0) tsoVar3.get(), (String) tsoVar2.get(), (i41) tsoVar.get());
            case 3:
                return new d03((k3p) tsoVar5.get(), (rp1) tsoVar4.get(), (ga3) tsoVar3.get(), (Context) ob1Var.a, (Map) tsoVar2.get(), (th3) tsoVar.get());
            case 4:
                dkp dkpVar = (dkp) tsoVar5.get();
                glo gloVar = (glo) tsoVar4.get();
                yjp yjpVar = (yjp) tsoVar3.get();
                th3 th3Var = (th3) tsoVar2.get();
                anp anpVar = (anp) tsoVar.get();
                l7 l7Var = (l7) ob1Var.a;
                return new wl3(dkpVar, gloVar, yjpVar, th3Var, anpVar, l7Var.J().q(), l7Var.J().r(), l7Var.J().u());
            default:
                return new w12((Context) ob1Var.a, (String) tsoVar5.get(), (String) tsoVar4.get(), (yi) tsoVar3.get(), (Optional) tsoVar2.get(), (mip) tsoVar.get());
        }
    }
}
