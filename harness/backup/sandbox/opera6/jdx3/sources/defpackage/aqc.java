package defpackage;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ToLongFunction;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class aqc {
    public static final Map g = rbd.c(new Pair[]{new Pair(oi9.d, 0), new Pair(oi9.e, 0), new Pair(oi9.c, 1)});
    public static final Comparator h;
    public static final Comparator i;
    public final cq6 a;
    public List b = l08.a;
    public final LinkedHashMap c = new LinkedHashMap();
    public final zc5 d;
    public final zc5 e;
    public final zyk f;

    static {
        final byte b = 0;
        final byte b2 = 1;
        final g8c g8cVar = new g8c((byte) 21);
        h = Comparator.comparingLong(new ToLongFunction() { // from class: wpc
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                byte b3 = b;
                g8c g8cVar2 = (g8c) g8cVar;
                switch (b3) {
                }
                return ((Number) g8cVar2.invoke(obj)).longValue();
            }
        });
        final g8c g8cVar2 = new g8c((byte) 22);
        i = Comparator.comparingLong(new ToLongFunction() { // from class: wpc
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                byte b3 = b2;
                g8c g8cVar22 = (g8c) g8cVar2;
                switch (b3) {
                }
                return ((Number) g8cVar22.invoke(obj)).longValue();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [zc5] */
    /* JADX WARN: Type inference failed for: r4v6, types: [zc5] */
    public aqc(cq6 cq6Var) {
        this.a = cq6Var;
        final zpc zpcVar = new zpc(this, (byte) 0);
        final Comparator comparator = h;
        final Comparator comparator2 = new Comparator() { // from class: zc5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int iCompare = zpcVar.compare(obj, obj2);
                return iCompare != 0 ? iCompare : comparator.compare(obj, obj2);
            }
        };
        final Comparator comparator3 = i;
        this.d = new Comparator() { // from class: zc5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int iCompare = comparator2.compare(obj, obj2);
                return iCompare != 0 ? iCompare : comparator3.compare(obj, obj2);
            }
        };
        final zpc zpcVar2 = new zpc(this, (byte) 1);
        final Comparator comparator4 = new Comparator() { // from class: zc5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int iCompare = zpcVar2.compare(obj, obj2);
                return iCompare != 0 ? iCompare : comparator.compare(obj, obj2);
            }
        };
        this.e = new Comparator() { // from class: zc5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int iCompare = comparator4.compare(obj, obj2);
                return iCompare != 0 ? iCompare : comparator3.compare(obj, obj2);
            }
        };
        this.f = z4c.b(new q4b(this, (byte) 18));
    }

    public final Integer a(zmc zmcVar) {
        long j = zmcVar.a().a;
        Long lValueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = this.c;
        if (linkedHashMap.containsKey(lValueOf)) {
            return (Integer) linkedHashMap.get(Long.valueOf(j));
        }
        Integer num = (Integer) g.get(zmcVar.a().b);
        linkedHashMap.put(Long.valueOf(j), num);
        return num;
    }
}
