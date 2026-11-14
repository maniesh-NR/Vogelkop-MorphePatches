package ads_mobile_sdk;

import android.os.Bundle;
import defpackage.dqo;
import defpackage.kta;
import defpackage.oie;
import defpackage.rap;
import defpackage.rgp;
import defpackage.rhe;
import defpackage.she;
import defpackage.skp;
import defpackage.tso;
import defpackage.uie;
import defpackage.xep;
import defpackage.ynh;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class cy1 implements rgp {
    public final tso a;
    public final k71 b;
    public final skp c;
    public final qr0 d;
    public final /* synthetic */ byte e;

    public /* synthetic */ cy1(tso tsoVar, k71 k71Var, skp skpVar, qr0 qr0Var, byte b) {
        this.e = b;
        this.a = tsoVar;
        this.b = k71Var;
        this.c = skpVar;
        this.d = qr0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rgp
    public final rap a(defpackage.hp hpVar, int i) {
        byte b = this.e;
        tso tsoVar = this.a;
        skp skpVar = this.c;
        switch (b) {
            case 0:
                uie uieVar = hpVar instanceof uie ? (uie) hpVar : null;
                if (uieVar == null) {
                    return new ev0(sko.j("Expected NativeRequest but received ", uqh.a(hpVar.getClass()).c()));
                }
                skpVar.getClass();
                rc0 rc0Var = (rc0) ynh.a((xep) ((ab0) tsoVar).get(), hpVar, av2.i, String.valueOf(new Random().nextInt(Integer.MAX_VALUE)), this.b, this.d);
                rc0Var.m = uieVar;
                rc0Var.l = Integer.valueOf(i);
                rc0Var.n = Boolean.FALSE;
                rc0Var.o = new dqo();
                return new hv0(rc0Var.a());
            default:
                kta ktaVar = hpVar instanceof kta ? (kta) hpVar : null;
                if (ktaVar == null) {
                    return new ev0(sko.j("Expected IconAdRequest but received ", uqh.a(hpVar.getClass()).c()));
                }
                skpVar.getClass();
                jc0 jc0Var = (jc0) ynh.a((xep) ((ab0) tsoVar).get(), hpVar, av2.g, String.valueOf(new Random().nextInt(Integer.MAX_VALUE)), this.b, this.d);
                jc0Var.m = ktaVar;
                String str = ktaVar.i;
                List listSingletonList = Collections.singletonList(rhe.a);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Bundle bundle = new Bundle();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                l08 l08Var = l08.a;
                she sheVar = she.a;
                defpackage.zk zkVar = defpackage.zk.TOP_RIGHT;
                if (str == null) {
                    qp2.o("Ad unit ID cannot be null.");
                    return null;
                }
                jc0Var.l = new oie(str, linkedHashSet, null, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null, CollectionsKt.k0(listSingletonList), l08Var, false, sheVar, zkVar, null, null, false, false, null, l08Var, false, true);
                jc0Var.n = Integer.valueOf(i);
                jc0Var.o = Boolean.FALSE;
                jc0Var.p = new dqo();
                return new hv0(jc0Var.a());
        }
    }
}
