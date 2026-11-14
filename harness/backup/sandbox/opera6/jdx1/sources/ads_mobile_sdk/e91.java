package ads_mobile_sdk;

import android.content.Context;
import com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory;
import defpackage.hlo;
import defpackage.mip;
import defpackage.tso;
import defpackage.uie;
import defpackage.vkp;
import defpackage.yko;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e91 implements hlo {
    public final ob1 a;
    public final ah0 b;
    public final tso c;
    public final tso d;
    public final tso e;
    public final /* synthetic */ byte f = 0;
    public final tso g;
    public final tso h;
    public final tso i;
    public final tso j;
    public final tso k;
    public final tso l;
    public final ob1 m;
    public final tso n;
    public final tso o;
    public final tso p;
    public final tso q;
    public final tso r;
    public final tso s;
    public final tso t;
    public final tso u;

    public e91(ob1 ob1Var, ah0 ah0Var, tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5, tso tsoVar6, tso tsoVar7, tso tsoVar8, tso tsoVar9, ob1 ob1Var2, tso tsoVar10, tso tsoVar11, tso tsoVar12, tso tsoVar13, tso tsoVar14, ah0 ah0Var2, tso tsoVar15, tso tsoVar16) {
        this.a = ob1Var;
        this.b = ah0Var;
        this.c = tsoVar;
        this.d = tsoVar2;
        this.e = tsoVar3;
        this.g = tsoVar4;
        this.h = tsoVar5;
        this.i = tsoVar6;
        this.j = tsoVar7;
        this.k = tsoVar8;
        this.l = tsoVar9;
        this.m = ob1Var2;
        this.n = tsoVar10;
        this.o = tsoVar11;
        this.p = tsoVar12;
        this.q = tsoVar13;
        this.r = tsoVar14;
        this.s = ah0Var2;
        this.t = tsoVar15;
        this.u = tsoVar16;
    }

    public e91(ob1 ob1Var, tso tsoVar, tso tsoVar2, tso tsoVar3, ah0 ah0Var, tso tsoVar4, fp2 fp2Var, tso tsoVar5, tso tsoVar6, tso tsoVar7, ob1 ob1Var2, tso tsoVar8, tso tsoVar9, ob1 ob1Var3, tso tsoVar10, tso tsoVar11, tso tsoVar12, tso tsoVar13, ah0 ah0Var2, ob1 ob1Var4) {
        this.a = ob1Var;
        this.c = tsoVar;
        this.d = tsoVar2;
        this.e = tsoVar3;
        this.b = ah0Var;
        this.g = tsoVar4;
        this.r = fp2Var;
        this.h = tsoVar5;
        this.i = tsoVar6;
        this.j = tsoVar7;
        this.m = ob1Var2;
        this.k = tsoVar8;
        this.l = tsoVar9;
        this.t = ob1Var3;
        this.n = tsoVar10;
        this.o = tsoVar11;
        this.p = tsoVar12;
        this.q = tsoVar13;
        this.s = ah0Var2;
        this.u = ob1Var4;
    }

    public e91(tso tsoVar, ab0 ab0Var, ab0 ab0Var2, iy1 iy1Var, tso tsoVar2, ob1 ob1Var, m mVar, tso tsoVar3, tso tsoVar4, ob1 ob1Var2, ob1 ob1Var3, ob1 ob1Var4, ob1 ob1Var5, ob1 ob1Var6, ob1 ob1Var7, ob1 ob1Var8, tso tsoVar5, ah0 ah0Var, ob1 ob1Var9, vh vhVar) {
        this.c = tsoVar;
        this.s = ab0Var;
        this.i = ab0Var2;
        this.j = iy1Var;
        this.d = tsoVar2;
        this.a = ob1Var;
        this.k = mVar;
        this.e = tsoVar3;
        this.g = tsoVar4;
        this.m = ob1Var2;
        this.l = ob1Var3;
        this.n = ob1Var4;
        this.o = ob1Var5;
        this.p = ob1Var6;
        this.q = ob1Var7;
        this.r = ob1Var8;
        this.h = tsoVar5;
        this.b = ah0Var;
        this.t = ob1Var9;
        this.u = vhVar;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.f;
        tso tsoVar = this.h;
        tso tsoVar2 = this.q;
        tso tsoVar3 = this.e;
        tso tsoVar4 = this.d;
        tso tsoVar5 = this.u;
        tso tsoVar6 = this.t;
        ah0 ah0Var = this.b;
        tso tsoVar7 = this.r;
        tso tsoVar8 = this.p;
        tso tsoVar9 = this.o;
        tso tsoVar10 = this.n;
        tso tsoVar11 = this.l;
        ob1 ob1Var = this.m;
        tso tsoVar12 = this.g;
        tso tsoVar13 = this.k;
        ob1 ob1Var2 = this.a;
        tso tsoVar14 = this.j;
        tso tsoVar15 = this.i;
        tso tsoVar16 = this.s;
        tso tsoVar17 = this.c;
        switch (b) {
            case 0:
                Context context = (Context) ob1Var2.a;
                nx5 nx5Var = (nx5) ah0Var.get();
                String str = (String) tsoVar17.get();
                bg8 bg8Var = bg8.c;
                HashMap map = new HashMap();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                sj9 sj9Var = m5a.m;
                int i = m5a.o;
                int i2 = m5a.p;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayList.add(new AndroidBundleTypeAdapterFactory());
                ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
                arrayList3.addAll(arrayList);
                Collections.reverse(arrayList3);
                ArrayList arrayList4 = new ArrayList(arrayList2);
                Collections.reverse(arrayList4);
                arrayList3.addAll(arrayList4);
                boolean z = g2k.a;
                return new d91(context, nx5Var, str, this.d, this.e, new m5a(bg8Var, 1, new HashMap(map), false, sj9Var, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, i, i2, new ArrayList(arrayDeque)), (qr0) tsoVar12.get(), (mip) tsoVar.get(), (vkp) tsoVar15.get(), (ka1) tsoVar14.get(), (ng) tsoVar13.get(), (dk) tsoVar11.get(), (ba1) ob1Var.a, (oo3) tsoVar10.get(), (ux2) tsoVar9.get(), (cu2) tsoVar8.get(), this.q, (o71) tsoVar7.get(), (vz) ((ah0) tsoVar16).get(), (yi) tsoVar6.get(), (i41) tsoVar5.get());
            case 1:
                return new f92((Context) ob1Var2.a, (qr0) tsoVar17.get(), (ax0) tsoVar4.get(), (k8) tsoVar3.get(), (z2) ah0Var.get(), (g0) tsoVar12.get(), (fp2) tsoVar7, this.h, (rr1) tsoVar15.get(), (dl) tsoVar14.get(), (av2) ob1Var.a, (b90) tsoVar13.get(), (gn0) tsoVar11.get(), (a2) ((ob1) tsoVar6).a, (jz2) tsoVar10.get(), (o42) tsoVar9.get(), (qf2) tsoVar8.get(), (s01) tsoVar2.get(), (ah3) ((ah0) tsoVar16).get(), (xv) ((ob1) tsoVar5).a);
            default:
                return new su1((q70) tsoVar17.get(), (ab0) tsoVar16, (ab0) tsoVar15, (o6) ((iy1) tsoVar14).get(), (wt1) tsoVar4.get(), (uie) ob1Var2.a, (yko) ((m) tsoVar13).get(), (ux2) tsoVar3.get(), (kh3) tsoVar12.get(), (defpackage.r83) ob1Var.a, (av2) ((ob1) tsoVar11).a, ((Long) ((ob1) tsoVar10).a).longValue(), ((Integer) ((ob1) tsoVar9).a).intValue(), (a2) ((ob1) tsoVar8).a, (xv) ((ob1) tsoVar2).a, (n13) ((ob1) tsoVar7).a, (String) tsoVar.get(), (nx5) ah0Var.get(), ((Integer) ((ob1) tsoVar6).a).intValue(), (vh) tsoVar5);
        }
    }
}
