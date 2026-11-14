package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class wee implements utb, Set, ptb {
    public final tee a;
    public final tee b;

    public wee(tee teeVar) {
        this.a = teeVar;
        this.b = teeVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        tee teeVar = this.b;
        int i = teeVar.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            teeVar.k(it.next());
        }
        return i != teeVar.d;
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
        if (obj == null || wee.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((wee) obj).a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new lv9(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.b.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        tee teeVar = this.b;
        int i = teeVar.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            teeVar.i(it.next());
        }
        return i != teeVar.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(java.util.Collection r17) {
        /*
            r16 = this;
            r0 = r16
            tee r0 = r0.b
            java.lang.Object[] r1 = r0.b
            int r2 = r0.d
            long[] r3 = r0.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            if (r4 < 0) goto L53
            r6 = r5
        L11:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L4e
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r5
        L2b:
            if (r11 >= r9) goto L4c
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L48
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r17
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            r14 = r1[r12]
            boolean r13 = kotlin.collections.CollectionsKt.E(r13, r14)
            if (r13 != 0) goto L48
            r0.m(r12)
        L48:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L2b
        L4c:
            if (r9 != r10) goto L53
        L4e:
            if (r6 == r4) goto L53
            int r6 = r6 + 1
            goto L11
        L53:
            int r0 = r0.d
            if (r2 == r0) goto L59
            r0 = 1
            return r0
        L59:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wee.retainAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.d;
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
