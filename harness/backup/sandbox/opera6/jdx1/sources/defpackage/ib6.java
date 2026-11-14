package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class ib6 {
    public static final ib6 b;
    public final HashMap a;

    static {
        ib6 ib6Var = new ib6(new LinkedHashMap());
        cqp.H0(ib6Var);
        b = ib6Var;
    }

    public ib6(ib6 ib6Var) {
        this.a = new HashMap(ib6Var.a);
    }

    public ib6(LinkedHashMap linkedHashMap) {
        this.a = new HashMap(linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ib6 a(byte[] r5) throws java.io.IOException {
        /*
            int r0 = r5.length
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r1) goto L97
            int r0 = r5.length
            if (r0 != 0) goto Lb
            ib6 r5 = defpackage.ib6.b
            return r5
        Lb:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.ClassNotFoundException -> L7e java.io.IOException -> L88
            r1.<init>(r5)     // Catch: java.lang.ClassNotFoundException -> L7e java.io.IOException -> L88
            r5 = 2
            byte[] r5 = new byte[r5]     // Catch: java.lang.ClassNotFoundException -> L7e java.io.IOException -> L88
            r1.read(r5)     // Catch: java.lang.ClassNotFoundException -> L7e java.io.IOException -> L88
            r2 = 0
            r3 = r5[r2]     // Catch: java.lang.ClassNotFoundException -> L7e java.io.IOException -> L88
            r4 = -84
            if (r3 != r4) goto L29
            r3 = 1
            r5 = r5[r3]     // Catch: java.lang.ClassNotFoundException -> L7e java.io.IOException -> L88
            r4 = -19
            if (r5 == r4) goto L2a
        L29:
            r3 = r2
        L2a:
            r1.reset()     // Catch: java.lang.ClassNotFoundException -> L7e java.io.IOException -> L88
            if (r3 == 0) goto L53
            java.io.ObjectInputStream r5 = new java.io.ObjectInputStream     // Catch: java.lang.ClassNotFoundException -> L7e java.io.IOException -> L88
            r5.<init>(r1)     // Catch: java.lang.ClassNotFoundException -> L7e java.io.IOException -> L88
            int r1 = r5.readInt()     // Catch: java.lang.Throwable -> L4c
        L38:
            if (r2 >= r1) goto L48
            java.lang.String r3 = r5.readUTF()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r4 = r5.readObject()     // Catch: java.lang.Throwable -> L4c
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L4c
            int r2 = r2 + 1
            goto L38
        L48:
            r5.close()     // Catch: java.lang.ClassNotFoundException -> L7e java.io.IOException -> L88
            goto L91
        L4c:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L4e
        L4e:
            r2 = move-exception
            defpackage.vtp.v(r5, r1)     // Catch: java.lang.ClassNotFoundException -> L7e java.io.IOException -> L88
            throw r2     // Catch: java.lang.ClassNotFoundException -> L7e java.io.IOException -> L88
        L53:
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch: java.lang.ClassNotFoundException -> L7e java.io.IOException -> L88
            r5.<init>(r1)     // Catch: java.lang.ClassNotFoundException -> L7e java.io.IOException -> L88
            defpackage.cqp.S(r5)     // Catch: java.lang.Throwable -> L77
            int r1 = r5.readInt()     // Catch: java.lang.Throwable -> L77
        L5f:
            if (r2 >= r1) goto L73
            byte r3 = r5.readByte()     // Catch: java.lang.Throwable -> L77
            java.io.Serializable r3 = defpackage.cqp.T(r5, r3)     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = r5.readUTF()     // Catch: java.lang.Throwable -> L77
            r0.put(r4, r3)     // Catch: java.lang.Throwable -> L77
            int r2 = r2 + 1
            goto L5f
        L73:
            r5.close()     // Catch: java.lang.ClassNotFoundException -> L7e java.io.IOException -> L88
            goto L91
        L77:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L79
        L79:
            r2 = move-exception
            defpackage.vtp.v(r5, r1)     // Catch: java.lang.ClassNotFoundException -> L7e java.io.IOException -> L88
            throw r2     // Catch: java.lang.ClassNotFoundException -> L7e java.io.IOException -> L88
        L7e:
            int r5 = se6.a
            qs7 r5 = qs7.x()
            r5.getClass()
            goto L91
        L88:
            int r5 = se6.a
            qs7 r5 = qs7.x()
            r5.getClass()
        L91:
            ib6 r5 = new ib6
            r5.<init>(r0)
            return r5
        L97:
            java.lang.String r5 = "Data cannot occupy more than 10240 bytes when serialized"
            qp2.n(r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib6.a(byte[]):ib6");
    }

    public final boolean b(String str) {
        Object obj = this.a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 == r8) goto L61
            r1 = 0
            if (r8 == 0) goto L62
            java.lang.Class<ib6> r2 = defpackage.ib6.class
            java.lang.Class r3 = r8.getClass()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L62
            ib6 r8 = (defpackage.ib6) r8
            java.util.HashMap r8 = r8.a
            java.util.HashMap r7 = r7.a
            java.util.Set r2 = r7.keySet()
            java.util.Set r3 = r8.keySet()
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r2, r3)
            if (r3 == 0) goto L62
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L61
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r7.get(r3)
            java.lang.Object r3 = r8.get(r3)
            if (r4 == 0) goto L59
            if (r3 == 0) goto L59
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L54
            r5 = r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L54
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            boolean r3 = z72.b(r5, r3)
            goto L5e
        L54:
            boolean r3 = r4.equals(r3)
            goto L5e
        L59:
            if (r4 != r3) goto L5d
            r3 = r0
            goto L5e
        L5d:
            r3 = r1
        L5e:
            if (r3 != 0) goto L2a
            goto L62
        L61:
            return r0
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib6.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return z1m.l(new StringBuilder("Data {"), CollectionsKt.P(this.a.entrySet(), (CharSequence) null, (CharSequence) null, (String) null, 0, h50.r, 31), "}");
    }
}
