package defpackage;

import androidx.collection.ArrayMap;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ynd extends cod {
    public final ArrayList w;
    public final ArrayMap x;

    public ynd(bod bodVar, String str, String str2) {
        super(bodVar, str, str2, false);
        this.w = new ArrayList();
        this.x = new ArrayMap(0);
    }

    public final boolean n() {
        dod.b();
        return dod.c().e().contains(this);
    }

    public final boolean o(cod codVar) {
        qnd qndVar = (qnd) this.x.get(codVar.c);
        return qndVar != null && qndVar.d;
    }

    public final void p(ArrayList arrayList) {
        this.v.clear();
        ArrayList arrayList2 = this.w;
        arrayList2.clear();
        ArrayMap arrayMap = this.x;
        arrayMap.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            qnd qndVar = (qnd) obj;
            cod codVarA = this.a.a(qndVar.a.d());
            if (codVarA != null) {
                arrayList2.add(codVarA);
                arrayMap.put(codVarA.c, qndVar);
                int i2 = qndVar.b;
                if (i2 == 2 || i2 == 3) {
                    this.v.add(codVarA);
                }
            }
        }
        dod.c().a.b(259, this);
    }
}
