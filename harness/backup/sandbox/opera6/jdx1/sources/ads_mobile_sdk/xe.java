package ads_mobile_sdk;

import android.content.Context;
import defpackage.eyo;
import defpackage.hlo;
import defpackage.mip;
import defpackage.oap;
import defpackage.rzo;
import defpackage.tso;

/* loaded from: classes.dex */
public final class xe implements hlo {
    public final ob1 a;
    public final tso b;
    public final tso c;
    public final tso d;
    public final tso e;
    public final ah0 f;
    public final tso g;
    public final tso h;
    public final tso i;
    public final tso j;
    public final tso k;
    public final tso l;
    public final /* synthetic */ byte m = 0;

    public xe(ob1 ob1Var, tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, ah0 ah0Var, tso tsoVar5, tso tsoVar6, tso tsoVar7, tso tsoVar8, tso tsoVar9, tso tsoVar10) {
        this.a = ob1Var;
        this.b = tsoVar;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.f = ah0Var;
        this.g = tsoVar5;
        this.h = tsoVar6;
        this.i = tsoVar7;
        this.j = tsoVar8;
        this.k = tsoVar9;
        this.l = tsoVar10;
    }

    public xe(tso tsoVar, ob1 ob1Var, ob1 ob1Var2, tso tsoVar2, tso tsoVar3, ah0 ah0Var, tso tsoVar4, tso tsoVar5, tso tsoVar6, tso tsoVar7, ob1 ob1Var3, tso tsoVar8) {
        this.b = tsoVar;
        this.a = ob1Var;
        this.k = ob1Var2;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.f = ah0Var;
        this.e = tsoVar4;
        this.g = tsoVar5;
        this.h = tsoVar6;
        this.i = tsoVar7;
        this.l = ob1Var3;
        this.j = tsoVar8;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.m;
        tso tsoVar = this.j;
        tso tsoVar2 = this.l;
        tso tsoVar3 = this.i;
        tso tsoVar4 = this.h;
        tso tsoVar5 = this.g;
        tso tsoVar6 = this.e;
        ah0 ah0Var = this.f;
        tso tsoVar7 = this.d;
        tso tsoVar8 = this.c;
        tso tsoVar9 = this.k;
        ob1 ob1Var = this.a;
        tso tsoVar10 = this.b;
        switch (b) {
            case 0:
                return new we((Context) ob1Var.a, (i41) tsoVar10.get(), (String) tsoVar8.get(), (String) tsoVar7.get(), (mip) tsoVar6.get(), (vz) ah0Var.get(), (ws) tsoVar5.get(), (qr0) tsoVar4.get(), (kj0) tsoVar3.get(), (eyo) tsoVar.get(), (ek) tsoVar9.get(), (mi0) tsoVar2.get());
            default:
                String str = (String) tsoVar10.get();
                a2 a2Var = (a2) ob1Var.a;
                xv xvVar = (xv) ((ob1) tsoVar9).a;
                kh3 kh3Var = (kh3) tsoVar8.get();
                return new rzo(str, a2Var, xvVar, kh3Var, (z2) ah0Var.get(), (ph0) tsoVar6.get(), (oap) tsoVar5.get(), (se2) tsoVar4.get(), (jz2) tsoVar3.get(), (ve2) ((ob1) tsoVar2).a, (defpackage.r83) tsoVar.get());
        }
    }
}
