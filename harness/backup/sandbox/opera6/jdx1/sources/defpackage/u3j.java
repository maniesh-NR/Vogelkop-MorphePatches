package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class u3j {
    public static final List j = Arrays.asList(1, 5, 3);
    public final ArrayList a;
    public final po2 b;
    public final List c;
    public final List d;
    public final List e;
    public final s3j f;
    public final ai4 g;
    public final int h;
    public final InputConfiguration i;

    public u3j(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ai4 ai4Var, s3j s3jVar, InputConfiguration inputConfiguration, int i, po2 po2Var) {
        this.a = arrayList;
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = Collections.unmodifiableList(arrayList3);
        this.e = Collections.unmodifiableList(arrayList4);
        this.f = s3jVar;
        this.g = ai4Var;
        this.i = inputConfiguration;
        this.h = i;
        this.b = po2Var;
    }

    public static u3j a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        fee feeVarK = fee.k();
        ArrayList arrayList5 = new ArrayList();
        bfe bfeVarA = bfe.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        wrf wrfVarF = wrf.f(feeVarK);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        hbl hblVar = hbl.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = bfeVarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new u3j(arrayList, arrayList2, arrayList3, arrayList4, new ai4(arrayList6, wrfVarF, -1, arrayList7, new hbl(arrayMap)), null, null, 0, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            po2 po2Var = (po2) obj;
            arrayList.add(po2Var.a);
            Iterator it = po2Var.b.iterator();
            while (it.hasNext()) {
                arrayList.add((g07) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
