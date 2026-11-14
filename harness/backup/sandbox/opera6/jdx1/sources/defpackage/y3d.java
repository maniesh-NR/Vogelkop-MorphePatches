package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class y3d {
    private int createCount;
    private int evictionCount;
    private int hitCount;

    @NotNull
    private final kyc lock;

    @NotNull
    private final z3d map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public y3d(int i) {
        this.maxSize = i;
        if (i <= 0) {
            zwg.t("maxSize <= 0");
            throw null;
        }
        this.map = new z3d();
        this.lock = new kyc();
    }

    public final int a(Object obj, Object obj2) {
        int iSizeOf = sizeOf(obj, obj2);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException("Negative size: " + obj + '=' + obj2);
    }

    public Object create(@NotNull Object obj) {
        return null;
    }

    public final int createCount() {
        int i;
        synchronized (this.lock) {
            i = this.createCount;
        }
        return i;
    }

    public void entryRemoved(boolean z, @NotNull Object obj, @NotNull Object obj2, Object obj3) {
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this.lock) {
            i = this.evictionCount;
        }
        return i;
    }

    public final Object get(@NotNull Object obj) {
        Object objPut;
        synchronized (this.lock) {
            Object obj2 = this.map.a.get(obj);
            if (obj2 != null) {
                this.hitCount++;
                return obj2;
            }
            this.missCount++;
            Object objCreate = create(obj);
            if (objCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                this.createCount++;
                objPut = this.map.a.put(obj, objCreate);
                if (objPut != null) {
                    this.map.a.put(obj, objPut);
                } else {
                    this.size += a(obj, objCreate);
                }
            }
            if (objPut != null) {
                entryRemoved(false, obj, objCreate, objPut);
                return objPut;
            }
            trimToSize(this.maxSize);
            return objCreate;
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this.lock) {
            i = this.hitCount;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.lock) {
            i = this.maxSize;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.lock) {
            i = this.missCount;
        }
        return i;
    }

    public final Object put(@NotNull Object obj, @NotNull Object obj2) {
        Object objPut;
        synchronized (this.lock) {
            this.putCount++;
            this.size += a(obj, obj2);
            objPut = this.map.a.put(obj, obj2);
            if (objPut != null) {
                this.size -= a(obj, objPut);
            }
        }
        if (objPut != null) {
            entryRemoved(false, obj, objPut, obj2);
        }
        trimToSize(this.maxSize);
        return objPut;
    }

    public final int putCount() {
        int i;
        synchronized (this.lock) {
            i = this.putCount;
        }
        return i;
    }

    public final Object remove(@NotNull Object obj) {
        Object objRemove;
        synchronized (this.lock) {
            objRemove = this.map.a.remove(obj);
            if (objRemove != null) {
                this.size -= a(obj, objRemove);
            }
        }
        if (objRemove != null) {
            entryRemoved(false, obj, objRemove, null);
        }
        return objRemove;
    }

    public void resize(int i) {
        if (i <= 0) {
            zwg.t("maxSize <= 0");
            throw null;
        }
        synchronized (this.lock) {
            this.maxSize = i;
        }
        trimToSize(i);
    }

    public final int size() {
        int i;
        synchronized (this.lock) {
            i = this.size;
        }
        return i;
    }

    public int sizeOf(@NotNull Object obj, @NotNull Object obj2) {
        return 1;
    }

    @NotNull
    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            linkedHashMap = new LinkedHashMap(this.map.a.entrySet().size());
            for (Map.Entry entry : this.map.a.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        String str;
        synchronized (this.lock) {
            int i = this.hitCount;
            int i2 = this.missCount + i;
            str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void trimToSize(int r6) {
        /*
            r5 = this;
        L0:
            kyc r0 = r5.lock
            monitor-enter(r0)
            int r1 = r5.size     // Catch: java.lang.Throwable -> L65
            if (r1 < 0) goto L5d
            z3d r1 = r5.map     // Catch: java.lang.Throwable -> L65
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L65
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L15
            int r1 = r5.size     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L5d
        L15:
            int r1 = r5.size     // Catch: java.lang.Throwable -> L65
            if (r1 <= r6) goto L5b
            z3d r1 = r5.map     // Catch: java.lang.Throwable -> L65
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L65
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L5b
            z3d r1 = r5.map     // Catch: java.lang.Throwable -> L65
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L65
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L65
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L65
            java.lang.Object r1 = kotlin.collections.CollectionsKt.L(r1)     // Catch: java.lang.Throwable -> L65
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L37
            monitor-exit(r0)
            return
        L37:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L65
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L65
            z3d r3 = r5.map     // Catch: java.lang.Throwable -> L65
            java.util.LinkedHashMap r3 = r3.a     // Catch: java.lang.Throwable -> L65
            r3.remove(r2)     // Catch: java.lang.Throwable -> L65
            int r3 = r5.size     // Catch: java.lang.Throwable -> L65
            int r4 = r5.a(r2, r1)     // Catch: java.lang.Throwable -> L65
            int r3 = r3 - r4
            r5.size = r3     // Catch: java.lang.Throwable -> L65
            int r3 = r5.evictionCount     // Catch: java.lang.Throwable -> L65
            r4 = 1
            int r3 = r3 + r4
            r5.evictionCount = r3     // Catch: java.lang.Throwable -> L65
            monitor-exit(r0)
            r0 = 0
            r5.entryRemoved(r4, r2, r1, r0)
            goto L0
        L5b:
            monitor-exit(r0)
            return
        L5d:
            java.lang.String r5 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L65
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L65
            throw r6     // Catch: java.lang.Throwable -> L65
        L65:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y3d.trimToSize(int):void");
    }
}
