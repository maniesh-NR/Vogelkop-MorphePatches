package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class i7p implements Map {
    public v6p a;
    public int b;
    public int c;

    @Override // java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object put(CharSequence charSequence, Object obj) {
        if (charSequence == null) {
            t3p.q("Null keys are not handled");
            return null;
        }
        if (obj == null) {
            t3p.q("Null values are not handled");
            return null;
        }
        v6p v6pVar = this.a;
        if (v6pVar == null) {
            v6pVar = new v6p();
            this.a = v6pVar;
        }
        Object objB = v6pVar.b(charSequence, obj, 0);
        if (objB != null) {
            return objB;
        }
        int length = charSequence.length();
        if (length > this.b) {
            this.b = length;
        }
        this.c++;
        return null;
    }

    public final Map.Entry b(CharSequence charSequence) {
        v6p v6pVar = this.a;
        if (v6pVar == null || charSequence == null) {
            return null;
        }
        return v6pVar.f(0, charSequence);
    }

    @Override // java.util.Map
    public final void clear() {
        this.a = null;
        this.b = -1;
        this.c = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        v6p v6pVar = this.a;
        if (v6pVar == null) {
            return false;
        }
        return v6pVar.e(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        HashSet hashSet = new HashSet(this.c);
        v6p v6pVar = this.a;
        if (v6pVar == null) {
            return hashSet;
        }
        v6pVar.c(new StringBuilder(), hashSet);
        return hashSet;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map)) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        v6p v6pVar = this.a;
        if (v6pVar == null || obj == null || !(obj instanceof CharSequence)) {
            return null;
        }
        return v6pVar.a(0, (CharSequence) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        HashSet hashSet = new HashSet(this.c);
        v6p v6pVar = this.a;
        if (v6pVar == null) {
            return hashSet;
        }
        v6pVar.g(new StringBuilder(), hashSet);
        return hashSet;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put((CharSequence) entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{ ");
        Iterator it = ((HashSet) entrySet()).iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(entry.toString());
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        ArrayList arrayList = new ArrayList(this.c);
        v6p v6pVar = this.a;
        if (v6pVar == null) {
            return arrayList;
        }
        v6pVar.d(arrayList);
        return arrayList;
    }
}
