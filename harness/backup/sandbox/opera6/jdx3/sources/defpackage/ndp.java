package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ndp implements Map {
    public i7p a;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Unmodifiable Trie");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return Collections.unmodifiableSet(this.a.entrySet());
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Unmodifiable Trie");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Unmodifiable Trie");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        this.a.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.Map
    public final Collection values() {
        return Collections.unmodifiableCollection(this.a.values());
    }
}
