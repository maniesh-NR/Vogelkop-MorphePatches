package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class jhi implements Iterable {
    public ghi a;
    public ghi b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public final Object b(Object obj, Object obj2) {
        for (ghi ghiVar = this.a; ghiVar != null; ghiVar = ghiVar.c) {
            if (ghiVar.a.equals(obj)) {
                return ghiVar.b;
            }
        }
        ghi ghiVar2 = new ghi(obj, obj2);
        this.d++;
        ghi ghiVar3 = this.b;
        if (ghiVar3 == null) {
            this.a = ghiVar2;
            this.b = ghiVar2;
            return null;
        }
        ghiVar3.c = ghiVar2;
        ghiVar2.d = ghiVar3;
        this.b = ghiVar2;
        return null;
    }

    public final Object c(Object obj) {
        for (ghi ghiVar = this.a; ghiVar != null; ghiVar = ghiVar.c) {
            if (ghiVar.a.equals(obj)) {
                this.d--;
                WeakHashMap weakHashMap = this.c;
                if (!weakHashMap.isEmpty()) {
                    Iterator it = weakHashMap.keySet().iterator();
                    while (it.hasNext()) {
                        ((ihi) it.next()).a(ghiVar);
                    }
                }
                ghi ghiVar2 = ghiVar.d;
                ghi ghiVar3 = ghiVar.c;
                if (ghiVar2 != null) {
                    ghiVar2.c = ghiVar3;
                } else {
                    this.a = ghiVar3;
                }
                ghi ghiVar4 = ghiVar.c;
                if (ghiVar4 != null) {
                    ghiVar4.d = ghiVar2;
                } else {
                    this.b = ghiVar2;
                }
                ghiVar.c = null;
                ghiVar.d = null;
                return ghiVar.b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if (((defpackage.fhi) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.jhi
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            jhi r6 = (defpackage.jhi) r6
            int r1 = r5.d
            int r3 = r6.d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            fhi r1 = (defpackage.fhi) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L43
            r3 = r6
            fhi r3 = (defpackage.fhi) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3c
            if (r3 != 0) goto L42
            goto L1b
        L3c:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L42:
            return r2
        L43:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L52
            fhi r6 = (defpackage.fhi) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L52
            return r0
        L52:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhi.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            fhi fhiVar = (fhi) it;
            if (!fhiVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) fhiVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ghi ghiVar = this.a;
        ghi ghiVar2 = this.b;
        fhi fhiVar = new fhi();
        fhiVar.a = ghiVar2;
        fhiVar.b = ghiVar;
        this.c.put(fhiVar, Boolean.FALSE);
        return fhiVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            fhi fhiVar = (fhi) it;
            if (!fhiVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) fhiVar.next()).toString());
            if (fhiVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
