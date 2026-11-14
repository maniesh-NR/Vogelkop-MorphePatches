package defpackage;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class fk4 {
    public final ai4 a;

    public fk4() {
        HashSet hashSet = new HashSet();
        fee feeVarK = fee.k();
        ArrayList arrayList = new ArrayList();
        bfe bfeVarA = bfe.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        wrf wrfVarF = wrf.f(feeVarK);
        ArrayList arrayList3 = new ArrayList(arrayList);
        hbl hblVar = hbl.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = bfeVarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        this.a = new ai4(arrayList2, wrfVarF, -1, arrayList3, new hbl(arrayMap));
    }
}
