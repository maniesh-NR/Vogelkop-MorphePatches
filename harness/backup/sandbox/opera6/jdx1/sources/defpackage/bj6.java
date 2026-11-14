package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class bj6 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public ry9 c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public e38 h;
    public trf i;
    public v74 j;
    public Class k;
    public boolean l;
    public boolean m;
    public hub n;
    public nyg o;
    public w97 p;
    public boolean q;
    public boolean r;

    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i = 0; i < size; i++) {
                u7e u7eVar = (u7e) arrayListB.get(i);
                hub hubVar = u7eVar.a;
                List list = u7eVar.b;
                if (!arrayList.contains(hubVar)) {
                    arrayList.add(u7eVar.a);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add(list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            List listU = this.c.b.u(this.d);
            int size = listU.size();
            for (int i = 0; i < size; i++) {
                u7e u7eVarA = ((v7e) listU.get(i)).a(this.d, this.e, this.f, this.i);
                if (u7eVarA != null) {
                    arrayList.add(u7eVarA);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hsc c(Class cls) {
        hsc hscVar;
        Class cls2;
        Class cls3;
        Class cls4;
        hsc hscVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        jzh jzhVar;
        Class cls5 = cls;
        tah tahVar = this.c.b;
        Class cls6 = this.g;
        Class cls7 = this.k;
        isc iscVar = (isc) tahVar.j;
        lbe lbeVar = (lbe) iscVar.b.getAndSet(null);
        if (lbeVar == null) {
            lbeVar = new lbe();
        }
        lbeVar.a = cls5;
        lbeVar.b = cls6;
        lbeVar.c = cls7;
        synchronized (iscVar.a) {
            hscVar = (hsc) iscVar.a.get(lbeVar);
        }
        iscVar.b.set(lbeVar);
        ((isc) tahVar.j).getClass();
        if (isc.c.equals(hscVar)) {
            return null;
        }
        if (hscVar != null) {
            return hscVar;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayListJ = ((mgh) tahVar.b).j(cls5, cls6);
        int size = arrayListJ.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            Class<?> cls8 = (Class) arrayListJ.get(i2);
            ArrayList arrayListA = ((vk) tahVar.g).a(cls8, cls7);
            int size2 = arrayListA.size();
            int i4 = 0;
            while (i4 < size2) {
                int i5 = i4 + 1;
                Class cls9 = (Class) arrayListA.get(i4);
                mgh mghVar = (mgh) tahVar.b;
                synchronized (mghVar) {
                    arrayList = new ArrayList();
                    ArrayList arrayList4 = (ArrayList) mghVar.b;
                    int size3 = arrayList4.size();
                    arrayList2 = arrayListA;
                    int i6 = 0;
                    while (i6 < size3) {
                        Object obj = arrayList4.get(i6);
                        int i7 = i6 + 1;
                        String str = (String) obj;
                        int i8 = size2;
                        List list = (List) ((HashMap) mghVar.c).get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                pyh pyhVar = (pyh) it.next();
                                Iterator it2 = it;
                                if (pyhVar.a.isAssignableFrom(cls5) && cls8.isAssignableFrom(pyhVar.b)) {
                                    arrayList.add(pyhVar.c);
                                }
                                it = it2;
                            }
                        }
                        size2 = i8;
                        i6 = i7;
                    }
                    i = size2;
                }
                vk vkVar = (vk) tahVar.g;
                synchronized (vkVar) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        ArrayList arrayList5 = vkVar.a;
                        int size4 = arrayList5.size();
                        int i9 = 0;
                        while (i9 < size4) {
                            Object obj2 = arrayList5.get(i9);
                            i9++;
                            t1m t1mVar = (t1m) obj2;
                            ArrayList arrayList6 = arrayList5;
                            if (t1mVar.a.isAssignableFrom(cls8) && cls9.isAssignableFrom(t1mVar.b)) {
                                jzhVar = t1mVar.c;
                            } else {
                                cls5 = cls;
                                arrayList5 = arrayList6;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    jzhVar = qii.o;
                }
                arrayList3.add(new dj6(cls5, cls8, cls9, arrayList, jzhVar, (ua7) tahVar.k));
                cls5 = cls;
                i4 = i5;
                arrayListA = arrayList2;
                size2 = i;
            }
            cls5 = cls;
            i2 = i3;
        }
        if (arrayList3.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            hscVar2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            hscVar2 = new hsc(cls2, cls3, cls4, arrayList3, (ua7) tahVar.k);
        }
        isc iscVar2 = (isc) tahVar.j;
        synchronized (iscVar2.a) {
            iscVar2.a.put(new lbe(cls2, cls3, cls4), hscVar2 != null ? hscVar2 : isc.c);
        }
        return hscVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r0 = r4.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u18 d(java.lang.Object r7) {
        /*
            r6 = this;
            ry9 r6 = r6.c
            tah r6 = r6.b
            java.lang.Object r6 = r6.d
            o28 r6 = (o28) r6
            java.lang.Class r0 = r7.getClass()
            monitor-enter(r6)
            java.util.ArrayList r1 = r6.a     // Catch: java.lang.Throwable -> L49
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L49
            r3 = 0
        L14:
            if (r3 >= r2) goto L2a
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L49
            int r3 = r3 + 1
            n28 r4 = (defpackage.n28) r4     // Catch: java.lang.Throwable -> L49
            java.lang.Class r5 = r4.a     // Catch: java.lang.Throwable -> L49
            boolean r5 = r5.isAssignableFrom(r0)     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L14
            u18 r0 = r4.b     // Catch: java.lang.Throwable -> L49
            monitor-exit(r6)
            goto L2c
        L2a:
            monitor-exit(r6)
            r0 = 0
        L2c:
            if (r0 == 0) goto L2f
            return r0
        L2f:
            yrh r6 = new yrh
            java.lang.Class r7 = r7.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to find source encoder for data class: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L47:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L49
            throw r7
        L49:
            r7 = move-exception
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj6.d(java.lang.Object):u18");
    }

    public final f2m e(Class cls) {
        f2m f2mVar = (f2m) this.j.get(cls);
        if (f2mVar == null) {
            Iterator it = ((l72) this.j.entrySet()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    f2mVar = (f2m) entry.getValue();
                    break;
                }
            }
        }
        if (f2mVar != null) {
            return f2mVar;
        }
        if (!this.j.isEmpty() || !this.q) {
            return ylm.b;
        }
        qp2.o(fki.q(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods."));
        return null;
    }
}
