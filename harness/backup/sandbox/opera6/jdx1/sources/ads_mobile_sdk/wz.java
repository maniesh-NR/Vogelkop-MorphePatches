package ads_mobile_sdk;

import android.content.Context;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory;
import defpackage.ayo;
import defpackage.hlo;
import defpackage.mip;
import defpackage.skp;
import defpackage.tso;
import defpackage.w7p;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Optional;

/* loaded from: classes.dex */
public final class wz implements hlo {
    public final ob1 a;
    public final ah0 b;
    public final tso c;
    public final ah0 d;
    public final /* synthetic */ byte e = 0;
    public final tso f;
    public final tso g;
    public final tso h;
    public final tso i;
    public final tso j;
    public final tso k;
    public final tso l;
    public final tso m;
    public final tso n;
    public final tso o;
    public final tso p;
    public final hlo q;
    public final tso r;
    public final tso s;
    public final tso t;
    public final tso u;
    public final tso v;

    public wz(ob1 ob1Var, ah0 ah0Var, tso tsoVar, ah0 ah0Var2, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5, tso tsoVar6, tso tsoVar7, tso tsoVar8, tso tsoVar9, tso tsoVar10, tso tsoVar11, tso tsoVar12, a3 a3Var, tso tsoVar13, tso tsoVar14, tso tsoVar15, tso tsoVar16, tso tsoVar17) {
        this.a = ob1Var;
        this.b = ah0Var;
        this.c = tsoVar;
        this.d = ah0Var2;
        this.f = tsoVar2;
        this.g = tsoVar3;
        this.h = tsoVar4;
        this.i = tsoVar5;
        this.j = tsoVar6;
        this.k = tsoVar7;
        this.l = tsoVar8;
        this.m = tsoVar9;
        this.n = tsoVar10;
        this.o = tsoVar11;
        this.p = tsoVar12;
        this.q = a3Var;
        this.r = tsoVar13;
        this.s = tsoVar14;
        this.t = tsoVar15;
        this.u = tsoVar16;
        this.v = tsoVar17;
    }

    public wz(tso tsoVar, tso tsoVar2, ob1 ob1Var, ob1 ob1Var2, tso tsoVar3, tso tsoVar4, ah0 ah0Var, tso tsoVar5, ob1 ob1Var3, tso tsoVar6, tso tsoVar7, tso tsoVar8, tso tsoVar9, tso tsoVar10, tso tsoVar11, tso tsoVar12, ah0 ah0Var2, ob1 ob1Var4, tso tsoVar13, ob1 ob1Var5, bc bcVar) {
        this.c = tsoVar;
        this.f = tsoVar2;
        this.a = ob1Var;
        this.s = ob1Var2;
        this.g = tsoVar3;
        this.h = tsoVar4;
        this.b = ah0Var;
        this.i = tsoVar5;
        this.t = ob1Var3;
        this.j = tsoVar6;
        this.k = tsoVar7;
        this.l = tsoVar8;
        this.m = tsoVar9;
        this.n = tsoVar10;
        this.o = tsoVar11;
        this.p = tsoVar12;
        this.d = ah0Var2;
        this.u = ob1Var4;
        this.r = tsoVar13;
        this.v = ob1Var5;
        this.q = bcVar;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.e;
        hlo hloVar = this.q;
        tso tsoVar = this.v;
        tso tsoVar2 = this.r;
        tso tsoVar3 = this.u;
        ah0 ah0Var = this.d;
        tso tsoVar4 = this.p;
        tso tsoVar5 = this.o;
        tso tsoVar6 = this.n;
        tso tsoVar7 = this.m;
        tso tsoVar8 = this.l;
        tso tsoVar9 = this.k;
        tso tsoVar10 = this.j;
        tso tsoVar11 = this.t;
        tso tsoVar12 = this.i;
        ah0 ah0Var2 = this.b;
        tso tsoVar13 = this.h;
        tso tsoVar14 = this.g;
        tso tsoVar15 = this.s;
        ob1 ob1Var = this.a;
        tso tsoVar16 = this.f;
        tso tsoVar17 = this.c;
        switch (b) {
            case 0:
                Context context = (Context) ob1Var.a;
                nx5 nx5Var = (nx5) ah0Var2.get();
                bk1 bk1Var = (bk1) tsoVar17.get();
                ah3 ah3Var = (ah3) ah0Var.get();
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
                return new vz(context, nx5Var, bk1Var, ah3Var, new m5a(bg8Var, 1, new HashMap(map), false, sj9Var, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, i, i2, new ArrayList(arrayDeque)), (qr0) tsoVar16.get(), (ax0) tsoVar14.get(), (ayo) tsoVar13.get(), (ki) tsoVar12.get(), (ha2) tsoVar10.get(), (gg3) tsoVar9.get(), (xk) tsoVar8.get(), (bn0) tsoVar7.get(), (mip) tsoVar6.get(), (ux2) tsoVar5.get(), (skp) tsoVar4.get(), (a3) hloVar, (w7p) tsoVar2.get(), (gr0) tsoVar15.get(), (xq0) tsoVar11.get(), (a80) tsoVar3.get(), (ae2) tsoVar.get());
            default:
                String str = (String) tsoVar16.get();
                a2 a2Var = (a2) ob1Var.a;
                xv xvVar = (xv) ((ob1) tsoVar15).a;
                kh3 kh3Var = (kh3) tsoVar14.get();
                z2 z2Var = (z2) ah0Var2.get();
                ph0 ph0Var = (ph0) tsoVar12.get();
                it1 it1Var = (it1) ((ob1) tsoVar11).a;
                zt1 zt1Var = (zt1) tsoVar10.get();
                iw1 iw1Var = (iw1) tsoVar9.get();
                qw1 qw1Var = (qw1) tsoVar8.get();
                we1 we1Var = (we1) tsoVar7.get();
                Optional optional = (Optional) tsoVar6.get();
                se2 se2Var = (se2) tsoVar5.get();
                jz2 jz2Var = (jz2) tsoVar4.get();
                defpackage.i41.k.get();
                return new InternalNativeAd(str, a2Var, xvVar, kh3Var, z2Var, ph0Var, it1Var, zt1Var, iw1Var, qw1Var, we1Var, optional, se2Var, jz2Var, (ve2) ((ob1) tsoVar3).a, (qr0) tsoVar2.get(), (defpackage.r83) ((ob1) tsoVar).a, (hg0) ((bc) hloVar).get());
        }
    }
}
