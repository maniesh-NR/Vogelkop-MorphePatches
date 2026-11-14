package ads_mobile_sdk;

import android.content.Context;
import defpackage.hlo;
import defpackage.mip;
import defpackage.npo;
import defpackage.pso;
import defpackage.sbp;
import defpackage.tso;
import defpackage.vkp;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class dh implements hlo {
    public final tso a;
    public final tso b;
    public final tso c;
    public final tso d;
    public final tso e;
    public final tso f;
    public final ob1 g;
    public final hlo h;
    public final hlo i;
    public final tso j;
    public final hlo k;
    public final tso l;
    public final tso m;
    public final tso n;
    public final tso o;
    public final hlo p;
    public final /* synthetic */ byte q;

    public dh(ab0 ab0Var, tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5, ob1 ob1Var, ob1 ob1Var2, ob1 ob1Var3, ob1 ob1Var4, ob1 ob1Var5, ob1 ob1Var6, ob1 ob1Var7, tso tsoVar6, tso tsoVar7, vh vhVar) {
        this.q = (byte) 0;
        this.a = ab0Var;
        this.b = tsoVar;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.f = tsoVar5;
        this.g = ob1Var;
        this.h = ob1Var2;
        this.i = ob1Var3;
        this.j = ob1Var4;
        this.k = ob1Var5;
        this.l = ob1Var6;
        this.m = ob1Var7;
        this.n = tsoVar6;
        this.o = tsoVar7;
        this.p = vhVar;
    }

    public dh(ah0 ah0Var, ah0 ah0Var2, ob1 ob1Var, tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5, ah0 ah0Var3, tso tsoVar6, tso tsoVar7, tso tsoVar8, ah0 ah0Var4, tso tsoVar9, tso tsoVar10, ah0 ah0Var5) {
        this.q = (byte) 2;
        this.a = ah0Var;
        this.h = ah0Var2;
        this.g = ob1Var;
        this.b = tsoVar;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.f = tsoVar5;
        this.i = ah0Var3;
        this.n = tsoVar6;
        this.o = tsoVar7;
        this.j = tsoVar8;
        this.k = ah0Var4;
        this.l = tsoVar9;
        this.m = tsoVar10;
        this.p = ah0Var5;
    }

    public /* synthetic */ dh(tso tsoVar, ob1 ob1Var, ob1 ob1Var2, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5, ob1 ob1Var3, ob1 ob1Var4, ob1 ob1Var5, ob1 ob1Var6, ob1 ob1Var7, tso tsoVar6, tso tsoVar7, tso tsoVar8, vh vhVar, byte b) {
        this.q = b;
        this.b = tsoVar;
        this.g = ob1Var;
        this.h = ob1Var2;
        this.c = tsoVar2;
        this.a = tsoVar3;
        this.d = tsoVar4;
        this.e = tsoVar5;
        this.i = ob1Var3;
        this.j = ob1Var4;
        this.k = ob1Var5;
        this.l = ob1Var6;
        this.m = ob1Var7;
        this.f = tsoVar6;
        this.n = tsoVar7;
        this.o = tsoVar8;
        this.p = vhVar;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.q;
        hlo hloVar = this.p;
        tso tsoVar = this.o;
        tso tsoVar2 = this.n;
        tso tsoVar3 = this.f;
        tso tsoVar4 = this.m;
        tso tsoVar5 = this.l;
        hlo hloVar2 = this.k;
        tso tsoVar6 = this.j;
        hlo hloVar3 = this.i;
        tso tsoVar7 = this.e;
        tso tsoVar8 = this.d;
        tso tsoVar9 = this.a;
        tso tsoVar10 = this.c;
        hlo hloVar4 = this.h;
        ob1 ob1Var = this.g;
        tso tsoVar11 = this.b;
        switch (b) {
            case 0:
                return new pso((ab0) tsoVar9, (q70) tsoVar11.get(), (oo3) tsoVar10.get(), (nx5) tsoVar8.get(), (y01) tsoVar.get(), (yi) tsoVar7.get(), (kh3) tsoVar3.get(), (defpackage.r83) ob1Var.a, (av2) ((ob1) hloVar4).a, ((Long) ((ob1) hloVar3).a).longValue(), ((Integer) ((ob1) tsoVar6).a).intValue(), (a2) ((ob1) hloVar2).a, (xv) ((ob1) tsoVar5).a, (n13) ((ob1) tsoVar4).a, (String) tsoVar2.get(), (ve2) ((vh) hloVar).get(), new v31());
            case 1:
                String str = (String) tsoVar11.get();
                a2 a2Var = (a2) ob1Var.a;
                n13 n13Var = (n13) ((ob1) hloVar4).a;
                kh3 kh3Var = (kh3) tsoVar10.get();
                q70 q70Var = (q70) tsoVar8.get();
                oo3 oo3Var = (oo3) tsoVar7.get();
                xv xvVar = (xv) ((ob1) hloVar3).a;
                defpackage.r83 r83Var = (defpackage.r83) ((ob1) tsoVar6).a;
                long jLongValue = ((Long) ((ob1) hloVar2).a).longValue();
                int iIntValue = ((Integer) ((ob1) tsoVar5).a).intValue();
                av2 av2Var = (av2) ((ob1) tsoVar4).a;
                return new npo((ab0) tsoVar9, q70Var, oo3Var, (nx5) tsoVar3.get(), (y01) tsoVar.get(), (yi) tsoVar2.get(), kh3Var, r83Var, av2Var, jLongValue, iIntValue, a2Var, xvVar, n13Var, str, (ve2) ((vh) hloVar).get());
            case 2:
                return new lx((CoroutineContext) ((ah0) tsoVar9).get(), (nx5) ((ah0) hloVar4).get(), (Context) ob1Var.a, (i41) tsoVar11.get(), (String) tsoVar10.get(), (bk1) tsoVar8.get(), (dk) tsoVar7.get(), (sb) tsoVar3.get(), (ah3) ((ah0) hloVar3).get(), (mip) tsoVar2.get(), (qr0) tsoVar.get(), (ux2) tsoVar6.get(), (vz) ((ah0) hloVar2).get(), (vkp) tsoVar5.get(), (ax0) tsoVar4.get(), nj0.a((ah0) hloVar));
            default:
                String str2 = (String) tsoVar11.get();
                a2 a2Var2 = (a2) ob1Var.a;
                n13 n13Var2 = (n13) ((ob1) hloVar4).a;
                kh3 kh3Var2 = (kh3) tsoVar10.get();
                q70 q70Var2 = (q70) tsoVar8.get();
                oo3 oo3Var2 = (oo3) tsoVar7.get();
                xv xvVar2 = (xv) ((ob1) hloVar3).a;
                defpackage.r83 r83Var2 = (defpackage.r83) ((ob1) tsoVar6).a;
                long jLongValue2 = ((Long) ((ob1) hloVar2).a).longValue();
                int iIntValue2 = ((Integer) ((ob1) tsoVar5).a).intValue();
                av2 av2Var2 = (av2) ((ob1) tsoVar4).a;
                return new sbp((ab0) tsoVar9, q70Var2, oo3Var2, (nx5) tsoVar3.get(), (y01) tsoVar.get(), (yi) tsoVar2.get(), kh3Var2, r83Var2, av2Var2, jLongValue2, iIntValue2, a2Var2, xvVar2, n13Var2, str2, (ve2) ((vh) hloVar).get());
        }
    }
}
