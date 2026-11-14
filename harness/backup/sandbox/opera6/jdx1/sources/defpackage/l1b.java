package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public abstract class l1b implements Map, Serializable {
    public static k1b d() {
        return new k1b(4);
    }

    public static k1b g(int i) {
        scd.q(i, "expectedSize");
        return new k1b(i);
    }

    public static l1b h(Map map) {
        if ((map instanceof l1b) && !(map instanceof SortedMap)) {
            return (l1b) map;
        }
        Set setEntrySet = map.entrySet();
        k1b k1bVar = new k1b(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        k1bVar.g(setEntrySet);
        return k1bVar.b(true);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return l().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return na2.s(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return nxg.q(j());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract esh j();

    public abstract fsh k();

    public x0b l() {
        return ((bsh) this).e.k();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return na2.X(this);
    }
}
