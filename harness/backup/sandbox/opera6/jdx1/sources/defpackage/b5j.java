package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class b5j extends a5j {
    public static LinkedHashSet c(Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(qbd.a(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && Intrinsics.a(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set d(Set set, Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            iterable = CollectionsKt.k0(iterable);
        }
        Collection<?> collection = (Collection) iterable;
        if (collection.isEmpty()) {
            return CollectionsKt.n0(set);
        }
        if (!(collection instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collection);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collection).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static LinkedHashSet e(Set set, Iterable iterable) {
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(qbd.a(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() << 1));
        linkedHashSet.addAll(set);
        o95.t(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet f(Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(qbd.a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
