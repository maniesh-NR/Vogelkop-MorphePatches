package ads_mobile_sdk;

import android.content.Context;
import com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory;
import defpackage.glp;
import defpackage.hlo;
import defpackage.mip;
import defpackage.tso;
import defpackage.vkp;
import defpackage.zio;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Optional;
import java.util.Set;

/* loaded from: classes.dex */
public final class np implements hlo {
    public final tso a;
    public final ob1 b;
    public final ah0 c;
    public final tso d;
    public final tso e;
    public final tso f;
    public final /* synthetic */ byte g = 2;

    public np(ah0 ah0Var, tso tsoVar, tso tsoVar2, tso tsoVar3, ob1 ob1Var, tso tsoVar4) {
        this.c = ah0Var;
        this.a = tsoVar;
        this.d = tsoVar2;
        this.e = tsoVar3;
        this.b = ob1Var;
        this.f = tsoVar4;
    }

    public np(tso tsoVar, ah0 ah0Var, tso tsoVar2, tso tsoVar3, ob1 ob1Var, tso tsoVar4) {
        this.a = tsoVar;
        this.c = ah0Var;
        this.d = tsoVar2;
        this.e = tsoVar3;
        this.b = ob1Var;
        this.f = tsoVar4;
    }

    public np(tso tsoVar, ob1 ob1Var, ah0 ah0Var, tso tsoVar2, tso tsoVar3, tso tsoVar4) {
        this.a = tsoVar;
        this.b = ob1Var;
        this.c = ah0Var;
        this.d = tsoVar2;
        this.e = tsoVar3;
        this.f = tsoVar4;
    }

    public np(tso tsoVar, tso tsoVar2, ah0 ah0Var, tso tsoVar3, ob1 ob1Var, tso tsoVar4) {
        this.a = tsoVar;
        this.d = tsoVar2;
        this.c = ah0Var;
        this.e = tsoVar3;
        this.b = ob1Var;
        this.f = tsoVar4;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.g;
        tso tsoVar = this.f;
        ob1 ob1Var = this.b;
        tso tsoVar2 = this.e;
        tso tsoVar3 = this.d;
        ah0 ah0Var = this.c;
        tso tsoVar4 = this.a;
        switch (b) {
            case 0:
                return new mp((qr0) tsoVar4.get(), (Context) ob1Var.a, (nx5) ah0Var.get(), (mip) tsoVar3.get(), (ux2) tsoVar2.get(), (g0) tsoVar.get());
            case 1:
                return new zio((Set) tsoVar4.get(), (nx5) tsoVar3.get(), (nx5) ah0Var.get(), (qr0) tsoVar2.get(), (defpackage.r83) ob1Var.a, (glp) tsoVar.get());
            case 2:
                d91 d91Var = (d91) ah0Var.get();
                av2 av2Var = (av2) tsoVar4.get();
                Optional optional = (Optional) tsoVar3.get();
                String str = (String) tsoVar2.get();
                boolean zBooleanValue = ((Boolean) ob1Var.a).booleanValue();
                mip mipVar = (mip) tsoVar.get();
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
                return new j71(d91Var, av2Var, optional, str, zBooleanValue, mipVar, new m5a(bg8Var, 1, new HashMap(map), false, sj9Var, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, i, i2, new ArrayList(arrayDeque)));
            default:
                return new wr3((bn0) tsoVar4.get(), (nx5) ah0Var.get(), (ax0) tsoVar3.get(), (qr0) tsoVar2.get(), (a2) ob1Var.a, (vkp) tsoVar.get());
        }
    }
}
