package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ise extends mse {
    @Override // defpackage.nse
    public final boolean c(List list) {
        boolean zRemoveAll;
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hse hseVar = (hse) obj;
            hse hseVarH = hd.h(this, hseVar.a);
            if (hseVarH != null) {
                ArrayList arrayList2 = (ArrayList) hseVarH.c.b;
                zRemoveAll = arrayList2.removeAll(Collections.unmodifiableList((ArrayList) hseVar.c.b));
                if (arrayList2.isEmpty() && ((ArrayList) this.b).remove(hseVarH)) {
                    zRemoveAll = true;
                }
            } else {
                zRemoveAll = false;
            }
            if (zRemoveAll) {
                z = true;
            }
        }
        return z;
    }
}
