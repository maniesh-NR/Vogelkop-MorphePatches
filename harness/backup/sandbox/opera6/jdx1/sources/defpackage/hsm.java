package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class hsm extends kuk implements Function1 {
    public boolean t;
    public final /* synthetic */ LinkedHashSet u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ ism w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsm(LinkedHashSet linkedHashSet, boolean z, ism ismVar, mt5 mt5Var) {
        super(1, mt5Var);
        this.u = linkedHashSet;
        this.v = z;
        this.w = ismVar;
    }

    public final mt5 create(mt5 mt5Var) {
        return new hsm(this.u, this.v, this.w, mt5Var);
    }

    public final Object invoke(Object obj) {
        return create((mt5) obj).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        ism ismVar = this.w;
        LinkedHashMap linkedHashMap = ismVar.k;
        px5 px5Var = px5.a;
        boolean z = this.t;
        boolean z2 = true;
        if (z) {
            if (z) {
                ybh.y(obj);
                return obj;
            }
            qp2.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ybh.y(obj);
        w3j w3jVar = new w3j(this.u, this.v);
        u3j u3jVar = ((t3j) w3jVar.e.getValue()).c() ? (u3j) w3jVar.f.getValue() : null;
        if (u3jVar == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashSet hashSet = new HashSet();
            fee feeVarK = fee.k();
            ArrayList arrayList = new ArrayList();
            bfe bfeVarA = bfe.a();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList(linkedHashSet);
            ArrayList arrayList6 = new ArrayList(arrayList2);
            ArrayList arrayList7 = new ArrayList(arrayList3);
            ArrayList arrayList8 = new ArrayList(arrayList4);
            ArrayList arrayList9 = new ArrayList(hashSet);
            wrf wrfVarF = wrf.f(feeVarK);
            ArrayList arrayList10 = new ArrayList(arrayList);
            hbl hblVar = hbl.b;
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = bfeVarA.a;
            for (String str : arrayMap2.keySet()) {
                arrayMap.put(str, arrayMap2.get(str));
            }
            z2 = true;
            u3jVar = new u3j(arrayList5, arrayList6, arrayList7, arrayList8, new ai4(arrayList9, wrfVarF, 1, arrayList10, new hbl(arrayMap)), null, null, 0, null);
        }
        ai4 ai4Var = u3jVar.g;
        yrm yrmVar = yrm.a;
        cd5 cd5Var = ism.l;
        k31 k31Var = ismVar.e.e;
        u59 u59Var = new u59((byte) 20);
        if (!ai4Var.a().equals(to2.h)) {
            ((fee) u59Var.b).s(gyg.q(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), ai4Var.a());
        }
        u59Var.K(ai4Var.b);
        ArrayMap arrayMap3 = ai4Var.e.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (String str2 : arrayMap3.keySet()) {
            linkedHashMap2.put(str2, arrayMap3.get(str2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
        List list = ai4Var.d;
        qb4 qb4Var = new qb4();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qb4Var.a((rb4) it.next(), k31Var);
        }
        linkedHashMap.put(yrmVar, new bsm(u59Var, linkedHashMap3, a5j.b(new ivh[]{qb4Var}), new wwh(ai4Var.c)));
        LinkedHashSet linkedHashSetB = ismVar.c.b(Collections.unmodifiableList(ai4Var.a));
        bsm bsmVarO = ism.o(linkedHashMap);
        this.t = z2;
        Object objR = ismVar.r(bsmVarO, linkedHashSetB, this);
        return objR == px5Var ? px5Var : objR;
    }
}
