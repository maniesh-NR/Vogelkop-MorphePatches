package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class iee implements utb, Set, ptb {
    public final gee a;
    public final gee b;

    public iee(gee geeVar) {
        this.a = geeVar;
        this.b = geeVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        gee geeVar = this.b;
        int i = geeVar.g;
        for (Object obj : collection) {
            int iD = geeVar.d(obj);
            geeVar.b[iD] = obj;
            long[] jArr = geeVar.c;
            int i2 = geeVar.d;
            jArr[iD] = (i2 & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = (jArr[i2] & (-4611686016279904257L)) | ((iD & 2147483647L) << 31);
            }
            geeVar.d = iD;
            if (geeVar.e == Integer.MAX_VALUE) {
                geeVar.e = iD;
            }
        }
        return i != geeVar.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.b.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iee.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((iee) obj).a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new lv9(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.b.g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        if (((r12 & ((~r12) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        r11 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r19) {
        /*
            r18 = this;
            r0 = r19
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = r18
            gee r1 = r1.b
            int r2 = r1.g
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r3 = r0.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L96
            java.lang.Object r3 = r0.next()
            if (r3 == 0) goto L21
            int r6 = r3.hashCode()
            goto L22
        L21:
            r6 = r5
        L22:
            r7 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r6 = r6 * r7
            int r7 = r6 << 16
            r6 = r6 ^ r7
            r7 = r6 & 127(0x7f, float:1.78E-43)
            int r8 = r1.f
            int r6 = r6 >>> 7
            r6 = r6 & r8
        L30:
            long[] r9 = r1.a
            int r10 = r6 >> 3
            r11 = r6 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            int r10 = r10 + r4
            r9 = r9[r10]
            int r14 = 64 - r11
            long r9 = r9 << r14
            long r14 = (long) r11
            long r14 = -r14
            r11 = 63
            long r14 = r14 >> r11
            long r9 = r9 & r14
            long r12 = r12 | r9
            long r9 = (long) r7
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r14
            long r9 = r9 ^ r12
            long r14 = r9 - r14
            long r9 = ~r9
            long r14 = r14 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r9
        L5a:
            r16 = 0
            int r11 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r11 == 0) goto L7d
            int r11 = java.lang.Long.numberOfTrailingZeros(r14)
            int r11 = r11 >> 3
            int r11 = r11 + r6
            r11 = r11 & r8
            r18 = r4
            java.lang.Object[] r4 = r1.b
            r4 = r4[r11]
            boolean r4 = kotlin.jvm.internal.Intrinsics.a(r4, r3)
            if (r4 != 0) goto L89
            r16 = 1
            long r16 = r14 - r16
            long r14 = r14 & r16
            r4 = r18
            goto L5a
        L7d:
            r18 = r4
            long r14 = ~r12
            r4 = 6
            long r14 = r14 << r4
            long r12 = r12 & r14
            long r12 = r12 & r9
            int r4 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r4 == 0) goto L8f
            r11 = -1
        L89:
            if (r11 < 0) goto Le
            r1.h(r11)
            goto Le
        L8f:
            int r5 = r5 + 8
            int r6 = r6 + r5
            r6 = r6 & r8
            r4 = r18
            goto L30
        L96:
            r18 = r4
            int r0 = r1.g
            if (r2 == r0) goto L9d
            return r18
        L9d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iee.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.b.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return lcp.K(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return lcp.L(this, objArr);
    }

    public final String toString() {
        return this.a.toString();
    }
}
