package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.ArrayMap;
import androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final class rg4 implements tsm {
    public final kb7 b;

    public rg4(Context context) {
        this.b = kb7.g.m(context);
        if ((context instanceof Application) && gyg.G(4, "CXCP")) {
            context.toString();
        }
    }

    @Override // defpackage.tsm
    public final tj5 a(ssm ssmVar, int i) {
        int i2;
        int i3;
        if (gyg.G(3, "CXCP")) {
            Objects.toString(ssmVar);
        }
        fee feeVarK = fee.k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        fee feeVarK2 = fee.k();
        ArrayList arrayList = new ArrayList();
        bfe bfeVarA = bfe.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int iOrdinal = ssmVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            i2 = 1;
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4 && iOrdinal != 5) {
                h9o.p();
                return null;
            }
            i2 = 1;
        } else {
            i2 = d77.a(PreviewUnderExposureQuirk.class) != null ? 1 : 3;
        }
        an2 an2Var = qsm.Hp;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        wrf wrfVarF = wrf.f(feeVarK2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        hbl hblVar = hbl.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = bfeVarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        feeVarK.s(an2Var, new u3j(arrayList5, arrayList6, arrayList7, arrayList8, new ai4(arrayList9, wrfVarF, i2, arrayList10, new hbl(arrayMap)), null, null, 0, null));
        HashSet hashSet2 = new HashSet();
        fee feeVarK3 = fee.k();
        ArrayList arrayList11 = new ArrayList();
        ArrayMap arrayMap3 = bfe.a().a;
        int iOrdinal2 = ssmVar.ordinal();
        if (iOrdinal2 == 0) {
            i3 = i == 2 ? 5 : 2;
        } else if (iOrdinal2 == 1 || iOrdinal2 == 2) {
            i3 = 1;
        } else if (iOrdinal2 != 3) {
            if (iOrdinal2 != 4 && iOrdinal2 != 5) {
                h9o.p();
                return null;
            }
            i3 = 1;
        } else {
            i3 = d77.a(PreviewUnderExposureQuirk.class) != null ? 1 : 3;
        }
        an2 an2Var2 = qsm.Ip;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        wrf wrfVarF2 = wrf.f(feeVarK3);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        hbl hblVar2 = hbl.b;
        ArrayMap arrayMap4 = new ArrayMap();
        for (String str2 : arrayMap3.keySet()) {
            arrayMap4.put(str2, arrayMap3.get(str2));
        }
        feeVarK.s(an2Var2, new ai4(arrayList12, wrfVarF2, i3, arrayList13, new hbl(arrayMap4)));
        feeVarK.s(qsm.Kp, ssmVar == ssm.a ? pg4.b : ng4.a);
        feeVarK.s(qsm.Jp, og4.a);
        ssm ssmVar2 = ssm.b;
        kb7 kb7Var = this.b;
        if (ssmVar == ssmVar2) {
            feeVarK.s(hya.rp, kb7Var.c());
        }
        an2 an2Var3 = hya.lp;
        a36 a36Var = kb7.g;
        feeVarK.s(an2Var3, Integer.valueOf(kb7Var.b(true).getRotation()));
        return wrf.f(feeVarK);
    }
}
