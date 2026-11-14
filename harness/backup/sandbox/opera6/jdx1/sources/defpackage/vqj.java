package defpackage;

import j$.util.Collection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import vqj.c;

/* loaded from: classes.dex */
public class vqj extends AbstractMap {
    static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private static final int MAX_ARRAY_SIZE = 2147483639;
    private Object[] entries;
    private boolean isImmutable;
    private volatile boolean isSortedAndDedupped;
    private volatile c lazyEntrySet;
    private int size;

    public class a implements Map.Entry, Comparable {
        private final e09 key;
        private Object value;

        public a(e09 e09Var, Object obj) {
            this.key = e09Var;
            this.value = obj;
        }

        private boolean equals(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        public int compareTo(vqj.a aVar) {
            return getKey().compareTo(aVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return equals(this.key, entry.getKey()) && equals(this.value, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public e09 getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            e09 e09Var = this.key;
            int iHashCode = e09Var == null ? 0 : e09Var.hashCode();
            Object obj = this.value;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            vqj.this.checkMutable();
            Object obj2 = this.value;
            this.value = obj;
            return obj2;
        }

        public String toString() {
            return this.key + "=" + this.value;
        }
    }

    public class b implements Iterator {
        private int pos;

        private b() {
            this.pos = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            vqj.this.ensureSortedAndDeduplicated();
            return this.pos + 1 < vqj.this.size;
        }

        @Override // java.util.Iterator
        public Map.Entry<e09, Object> next() {
            vqj.this.ensureSortedAndDeduplicated();
            if (!hasNext()) {
                t3p.y();
                return null;
            }
            Object[] objArr = vqj.this.entries;
            int i = this.pos + 1;
            this.pos = i;
            return (a) objArr[i];
        }
    }

    public class c extends AbstractSet implements Collection {
        private c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = vqj.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<e09, Object>> iterator() {
            vqj.this.ensureSortedAndDeduplicated();
            return new b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return vqj.this.size();
        }
    }

    public vqj() {
        this.isImmutable = false;
        this.entries = null;
        this.size = 0;
        this.isSortedAndDedupped = true;
    }

    public vqj(int i) {
        this.isImmutable = false;
        this.entries = new Object[i];
        this.size = 0;
        this.isSortedAndDedupped = true;
    }

    private int binarySearch(e09 e09Var) {
        int i = this.size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iCompareTo = ((a) this.entries[i3]).getKey().compareTo(e09Var);
            if (iCompareTo < 0) {
                i2 = i3 + 1;
            } else {
                if (iCompareTo <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkMutable() {
        if (this.isImmutable) {
            t3p.o();
        }
    }

    private void ensureCapacity(int i) {
        Object[] objArr = this.entries;
        if (objArr == null || objArr.length == 0) {
            this.entries = new Object[Math.max(16, i)];
            return;
        }
        if (i > objArr.length) {
            if (!this.isSortedAndDedupped) {
                ensureSortedAndDeduplicated();
                if (i <= this.entries.length) {
                    return;
                }
            }
            Object[] objArr2 = this.entries;
            int length = objArr2.length;
            int i2 = length + (length >> 1);
            if (i2 - i >= 0) {
                i = i2;
            }
            if (i - MAX_ARRAY_SIZE > 0) {
                i = MAX_ARRAY_SIZE;
            }
            this.entries = Arrays.copyOf(objArr2, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[Catch: all -> 0x005c, TryCatch #0 {, blocks: (B:7:0x0009, B:9:0x000d, B:11:0x000f, B:13:0x0014, B:15:0x0016, B:16:0x001d, B:18:0x0021, B:20:0x0029, B:22:0x003d, B:24:0x0048, B:23:0x0042, B:26:0x004d, B:27:0x0056, B:28:0x0058), top: B:35:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ensureSortedAndDeduplicated() {
        /*
            r7 = this;
            boolean r0 = r7.isImmutable
            if (r0 != 0) goto L5e
            boolean r0 = r7.isSortedAndDedupped
            if (r0 != 0) goto L5e
            monitor-enter(r7)
            boolean r0 = r7.isSortedAndDedupped     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto Lf
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5c
            return
        Lf:
            int r0 = r7.size     // Catch: java.lang.Throwable -> L5c
            r1 = 1
            if (r0 > r1) goto L16
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5c
            return
        L16:
            java.lang.Object[] r2 = r7.entries     // Catch: java.lang.Throwable -> L5c
            r3 = 0
            java.util.Arrays.sort(r2, r3, r0)     // Catch: java.lang.Throwable -> L5c
            r0 = r3
        L1d:
            int r2 = r7.size     // Catch: java.lang.Throwable -> L5c
            if (r3 >= r2) goto L4b
            java.lang.Object[] r2 = r7.entries     // Catch: java.lang.Throwable -> L5c
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L5c
            vqj$a r4 = (vqj.a) r4     // Catch: java.lang.Throwable -> L5c
            if (r0 <= 0) goto L42
            int r5 = r0 + (-1)
            r2 = r2[r5]     // Catch: java.lang.Throwable -> L5c
            vqj$a r2 = (vqj.a) r2     // Catch: java.lang.Throwable -> L5c
            e09 r2 = r2.getKey()     // Catch: java.lang.Throwable -> L5c
            e09 r6 = r4.getKey()     // Catch: java.lang.Throwable -> L5c
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L42
            java.lang.Object[] r2 = r7.entries     // Catch: java.lang.Throwable -> L5c
            r2[r5] = r4     // Catch: java.lang.Throwable -> L5c
            goto L48
        L42:
            java.lang.Object[] r2 = r7.entries     // Catch: java.lang.Throwable -> L5c
            r2[r0] = r4     // Catch: java.lang.Throwable -> L5c
            int r0 = r0 + 1
        L48:
            int r3 = r3 + 1
            goto L1d
        L4b:
            if (r0 >= r2) goto L56
            r7.size = r0     // Catch: java.lang.Throwable -> L5c
            java.lang.Object[] r2 = r7.entries     // Catch: java.lang.Throwable -> L5c
            int r3 = r2.length     // Catch: java.lang.Throwable -> L5c
            r4 = 0
            java.util.Arrays.fill(r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L5c
        L56:
            r7.isSortedAndDedupped = r1     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5c
            return
        L5a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5c
            throw r0
        L5c:
            r0 = move-exception
            goto L5a
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqj.ensureSortedAndDeduplicated():void");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        checkMutable();
        if (this.size != 0) {
            this.entries = null;
            this.size = 0;
            this.isSortedAndDedupped = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        ensureSortedAndDeduplicated();
        return binarySearch((e09) obj) >= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<e09, Object>> entrySet() {
        ensureSortedAndDeduplicated();
        if (this.lazyEntrySet == null) {
            this.lazyEntrySet = new c();
        }
        return this.lazyEntrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqj)) {
            return super.equals(obj);
        }
        vqj vqjVar = (vqj) obj;
        int size = size();
        if (size != vqjVar.size()) {
            return false;
        }
        Object[] objArr = this.entries;
        Object[] objArr2 = vqjVar.entries;
        for (int i = 0; i < size; i++) {
            if (!objArr[i].equals(objArr2[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        ensureSortedAndDeduplicated();
        int iBinarySearch = binarySearch((e09) obj);
        if (iBinarySearch >= 0) {
            return ((a) this.entries[iBinarySearch]).getValue();
        }
        return null;
    }

    public Map.Entry<e09, Object> getArrayEntryAt(int i) {
        ensureSortedAndDeduplicated();
        if (i < this.size) {
            return (a) this.entries[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int size = size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += this.entries[i].hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        ensureSortedAndDeduplicated();
        if (this.entries != null) {
            for (int i = 0; i < this.size; i++) {
                a aVar = (a) this.entries[i];
                if (aVar.getKey().isRepeated()) {
                    aVar.setValue(Collections.unmodifiableList((List) aVar.getValue()));
                }
            }
        }
        this.isImmutable = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(e09 e09Var, Object obj) {
        checkMutable();
        Objects.requireNonNull(e09Var);
        boolean z = this.isSortedAndDedupped;
        int i = this.size;
        if (i > 0) {
            int iCompareTo = e09Var.compareTo(((a) this.entries[i - 1]).getKey());
            if (iCompareTo < 0) {
                z = false;
            } else if (iCompareTo == 0) {
                ((a) this.entries[this.size - 1]).setValue(obj);
                return null;
            }
        }
        ensureCapacity(this.size + 1);
        Object[] objArr = this.entries;
        int i2 = this.size;
        this.size = i2 + 1;
        objArr[i2] = new a(e09Var, obj);
        this.isSortedAndDedupped = z;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<e09, ?> map) {
        checkMutable();
        boolean z = map instanceof vqj;
        int i = this.size;
        if (!z) {
            ensureCapacity(map.size() + i);
            for (Map.Entry<e09, ?> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return;
        }
        vqj vqjVar = (vqj) map;
        ensureCapacity(i + vqjVar.size);
        int i2 = this.size;
        int i3 = vqjVar.size + i2;
        for (int i4 = i2; i4 < i3; i4++) {
            a aVar = (a) vqjVar.entries[i4 - i2];
            put(aVar.getKey(), aVar.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        checkMutable();
        ensureSortedAndDeduplicated();
        int iBinarySearch = binarySearch((e09) obj);
        if (iBinarySearch < 0) {
            return null;
        }
        Object value = ((a) this.entries[iBinarySearch]).getValue();
        Object[] objArr = this.entries;
        System.arraycopy(objArr, iBinarySearch + 1, objArr, iBinarySearch, (this.size - iBinarySearch) - 1);
        Object[] objArr2 = this.entries;
        int i = this.size - 1;
        this.size = i;
        objArr2[i] = null;
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        ensureSortedAndDeduplicated();
        return this.size;
    }
}
