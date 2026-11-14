package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class fad extends LinkedHashMap {
    private static final fad EMPTY_MAP_FIELD;
    private boolean isMutable;

    static {
        fad fadVar = new fad();
        EMPTY_MAP_FIELD = fadVar;
        fadVar.makeImmutable();
    }

    private fad() {
        this.isMutable = true;
    }

    private fad(Map<Object, Object> map) {
        super(map);
        this.isMutable = true;
    }

    public static <K, V> int calculateHashCodeForMap(Map<K, V> map) {
        int iCalculateHashCodeForObject = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iCalculateHashCodeForObject += calculateHashCodeForObject(entry.getKey()) ^ calculateHashCodeForObject(entry.getValue());
        }
        return iCalculateHashCodeForObject;
    }

    private static int calculateHashCodeForObject(Object obj) {
        if (obj instanceof byte[]) {
            return ifb.hashCode((byte[]) obj);
        }
        if (!(obj instanceof xeb)) {
            return obj.hashCode();
        }
        t3p.o();
        return 0;
    }

    private static void checkForNullKeysAndValues(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            ifb.checkNotNull(obj);
            ifb.checkNotNull(map.get(obj));
        }
    }

    private static Object copy(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> copy(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((map.size() << 2) / 3) + 1);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), copy(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static <K, V> fad emptyMapField() {
        return EMPTY_MAP_FIELD;
    }

    private void ensureMutable() {
        if (isMutable()) {
            return;
        }
        t3p.o();
    }

    private static boolean equals(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static <K, V> boolean equals(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        ensureMutable();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && equals((Map) this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return calculateHashCodeForMap(this);
    }

    public boolean isMutable() {
        return this.isMutable;
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public void mergeFrom(fad fadVar) {
        ensureMutable();
        if (fadVar.isEmpty()) {
            return;
        }
        putAll(fadVar);
    }

    public fad mutableCopy() {
        return isEmpty() ? new fad() : new fad(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        ensureMutable();
        ifb.checkNotNull(obj);
        ifb.checkNotNull(obj2);
        return super.put(obj, obj2);
    }

    public Object put(Map.Entry<Object, Object> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<Object, Object> map) {
        ensureMutable();
        checkForNullKeysAndValues(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        ensureMutable();
        return super.remove(obj);
    }
}
