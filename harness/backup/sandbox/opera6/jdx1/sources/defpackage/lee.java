package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class lee {
    public final LinkedHashMap a;
    public final zy9 b;

    public lee(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        zy9 zy9Var = new zy9();
        zy9Var.a = new AtomicBoolean(z);
        this.b = zy9Var;
    }

    public /* synthetic */ lee(boolean z) {
        this(new LinkedHashMap(), z);
    }

    public final Map a() {
        Pair pair;
        Set<Map.Entry> setEntrySet = this.a.entrySet();
        int iA = qbd.a(k95.o(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                pair = new Pair(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.a, pair.b);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public final void b() {
        if (((AtomicBoolean) this.b.a).get()) {
            qp2.n("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(hsg hsgVar) {
        Object obj = this.a.get(hsgVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final void d(hsg hsgVar, Object obj) {
        b();
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            b();
            linkedHashMap.remove(hsgVar);
        } else if (obj instanceof Set) {
            linkedHashMap.put(hsgVar, Collections.unmodifiableSet(CollectionsKt.n0((Set) obj)));
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(hsgVar, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(hsgVar, Arrays.copyOf(bArr, bArr.length));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.lee
            r1 = 0
            if (r0 == 0) goto L5c
            lee r6 = (defpackage.lee) r6
            java.util.LinkedHashMap r6 = r6.a
            java.util.LinkedHashMap r5 = r5.a
            r0 = 1
            if (r6 == r5) goto L5d
            int r2 = r6.size()
            int r3 = r5.size()
            if (r2 != r3) goto L5c
            boolean r2 = r6.isEmpty()
            if (r2 != 0) goto L5d
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L26:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r6.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r3 = r5.get(r3)
            if (r3 == 0) goto L59
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L54
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L59
            byte[] r2 = (byte[]) r2
            byte[] r3 = (byte[]) r3
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L59
            r2 = r0
            goto L5a
        L54:
            boolean r2 = kotlin.jvm.internal.Intrinsics.a(r2, r3)
            goto L5a
        L59:
            r2 = r1
        L5a:
            if (r2 != 0) goto L26
        L5c:
            return r1
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lee.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return CollectionsKt.P(this.a.entrySet(), ",\n", "{\n", "\n}", 0, new zbe((byte) 1), 24);
    }
}
