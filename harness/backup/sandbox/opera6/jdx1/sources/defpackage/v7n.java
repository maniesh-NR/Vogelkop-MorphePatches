package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.CharsKt;

/* loaded from: classes.dex */
public final class v7n {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Map mapI = rbd.i(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = mapI.values().iterator();
        while (it.hasNext()) {
            ((l7n) it.next()).c();
        }
    }

    public final String toString() {
        String strC = uqh.a(v7n.class).c();
        if (strC == null) {
            strC = "ViewModelStore";
        }
        return strC + "@" + Integer.toString(hashCode(), CharsKt.checkRadix(16)) + "(keys=" + CollectionsKt.n0(this.a.keySet()) + ")";
    }
}
