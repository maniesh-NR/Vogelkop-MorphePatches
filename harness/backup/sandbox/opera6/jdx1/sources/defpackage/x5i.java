package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x5i {
    public final LinkedHashMap a;

    public x5i(byte b) {
        switch (b) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public final void a(ryd rydVar) {
        byte b = rydVar.a;
        byte b2 = rydVar.b;
        Integer numValueOf = Integer.valueOf(b);
        LinkedHashMap linkedHashMap = this.a;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(b2))) {
            Objects.toString(treeMap2.get(Integer.valueOf(b2)));
            rydVar.toString();
        }
        treeMap2.put(Integer.valueOf(b2), rydVar);
    }

    public final w8k b(w4o w4oVar) {
        return (w8k) this.a.remove(w4oVar);
    }

    public final List c(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (Intrinsics.a(((w4o) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((w4o) it.next());
        }
        return CollectionsKt.k0(linkedHashMap.values());
    }

    public final w8k d(w4o w4oVar) {
        LinkedHashMap linkedHashMap = this.a;
        Object w8kVar = linkedHashMap.get(w4oVar);
        if (w8kVar == null) {
            w8kVar = new w8k(w4oVar);
            linkedHashMap.put(w4oVar, w8kVar);
        }
        return (w8k) w8kVar;
    }
}
