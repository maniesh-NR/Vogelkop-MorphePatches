package ads_mobile_sdk;

import defpackage.t3p;
import defpackage.zfp;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class gn1 extends LinkedHashMap {
    public static final gn1 b;
    public boolean a = true;

    static {
        gn1 gn1Var = new gn1();
        b = gn1Var;
        gn1Var.a = false;
    }

    public final gn1 b() {
        if (isEmpty()) {
            return new gn1();
        }
        gn1 gn1Var = new gn1(this);
        gn1Var.a = true;
        return gn1Var;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (this.a) {
            super.clear();
        } else {
            t3p.o();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int iHashCode2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                byte[] bArr2 = yb1.a;
                iHashCode = bArr.length;
                for (byte b2 : bArr) {
                    iHashCode = (iHashCode * 31) + b2;
                }
                if (iHashCode == 0) {
                    iHashCode = 1;
                }
            } else {
                if (key instanceof zfp) {
                    t3p.o();
                    return 0;
                }
                iHashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = yb1.a;
                int length = bArr3.length;
                for (byte b3 : bArr3) {
                    length = (length * 31) + b3;
                }
                if (length != 0) {
                    iHashCode2 = length;
                }
            } else {
                if (value instanceof zfp) {
                    t3p.o();
                    return 0;
                }
                iHashCode2 = value.hashCode();
            }
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (!this.a) {
            t3p.o();
            return null;
        }
        byte[] bArr = yb1.a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        if (!this.a) {
            t3p.o();
            return;
        }
        for (Object obj : map.keySet()) {
            byte[] bArr = yb1.a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (this.a) {
            return super.remove(obj);
        }
        t3p.o();
        return null;
    }
}
