package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class euf implements AutoCloseable {
    public final n65 a;
    public final huf b;
    public boolean d;
    public final Object c = new Object();
    public long e = 1;
    public long f = Long.MIN_VALUE;
    public long g = Long.MIN_VALUE;
    public long h = Long.MIN_VALUE;
    public long i = Long.MIN_VALUE;
    public final ArrayList j = new ArrayList();
    public final LinkedHashMap k = new LinkedHashMap();

    public euf(n65 n65Var, huf hufVar) {
        this.a = n65Var;
        this.b = hufVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        synchronized (this.c) {
            if (this.d) {
                return;
            }
            this.d = true;
            ArrayList arrayList = new ArrayList(this.k.values());
            this.k.clear();
            ArrayList arrayList2 = new ArrayList(this.j);
            this.j.clear();
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                Object obj2 = ((muf) obj).a;
                n65 n65Var = this.a;
                if (!muf.a(obj2)) {
                    obj2 = null;
                }
                n65Var.a(obj2);
            }
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj3 = arrayList2.get(i);
                i++;
                duf dufVar = (duf) obj3;
                dufVar.getClass();
                dufVar.a(-1L, new ouf(11));
            }
        }
    }

    public final void h(long j) {
        synchronized (this.c) {
            if (this.d) {
                return;
            }
            this.h = j;
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            duf dufVar = null;
            boolean z = false;
            int i = 0;
            Object obj = null;
            while (true) {
                if (i >= size) {
                    if (!z) {
                        break;
                    }
                } else {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((duf) obj2).b == j) {
                        if (z) {
                            break;
                        }
                        obj = obj2;
                        z = true;
                    }
                }
            }
            obj = null;
            duf dufVar2 = (duf) obj;
            if (dufVar2 != null) {
                this.i = dufVar2.e;
                this.j.remove(dufVar2);
                dufVar = dufVar2;
            }
            if (dufVar != null) {
                dufVar.a(-1L, new ouf(10));
            }
        }
    }

    public final void k(long j, Object obj) throws Exception {
        int i;
        Object mufVar;
        ArrayList arrayList;
        Object obj2;
        synchronized (this.c) {
            i = 0;
            if (this.d || this.b.a(this.i, j)) {
                mufVar = new muf(obj);
            } else {
                ArrayList arrayList2 = this.j;
                int size = arrayList2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList2.get(i2);
                    i2++;
                    if (this.b.a(((duf) obj2).e, j)) {
                        break;
                    }
                }
                duf dufVar = (duf) obj2;
                if (dufVar != null) {
                    ArrayList arrayListM = m(dufVar.d, dufVar.e, dufVar.a);
                    dufVar.a(j, obj);
                    this.j.remove(dufVar);
                    arrayList = arrayListM;
                    mufVar = null;
                } else {
                    this.k.put(Long.valueOf(j), new muf(obj));
                    if (this.k.size() > 3) {
                        mufVar = this.k.remove(Long.valueOf(((Number) CollectionsKt.J(this.k.keySet())).longValue()));
                    } else {
                        mufVar = null;
                        arrayList = null;
                    }
                }
            }
            arrayList = null;
        }
        muf mufVar2 = (muf) mufVar;
        if (mufVar2 != null) {
            Object obj3 = mufVar2.a;
            Object obj4 = muf.a(obj3) ? obj3 : null;
            if (obj4 != null) {
                this.a.a(obj4);
            }
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj5 = arrayList.get(i);
                i++;
                duf dufVar2 = (duf) obj5;
                dufVar2.getClass();
                dufVar2.a(-1L, new ouf(12));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(long r21, long r23, long r25, defpackage.cuf r27) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euf.l(long, long, long, cuf):void");
    }

    public final ArrayList m(long j, long j2, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.j;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            duf dufVar = (duf) obj;
            if (dufVar.a == z && dufVar.d < j && dufVar.e < j2) {
                arrayList.add(obj);
            }
        }
        arrayList2.removeAll(arrayList);
        return arrayList;
    }
}
