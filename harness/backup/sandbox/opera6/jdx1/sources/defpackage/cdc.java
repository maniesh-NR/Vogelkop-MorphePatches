package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class cdc {
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayDeque d = new ArrayDeque();
    public tc4 e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[Catch: all -> 0x00ac, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x001f, B:8:0x0021, B:10:0x002d, B:11:0x002f, B:13:0x0032, B:44:0x008b, B:45:0x008e, B:47:0x009e, B:48:0x00a1, B:51:0x00a4, B:52:0x00a9, B:18:0x0038, B:19:0x0039, B:20:0x003a, B:21:0x003e, B:23:0x0044, B:25:0x005b, B:27:0x0065, B:28:0x0067, B:35:0x0075, B:37:0x007b, B:38:0x007f, B:39:0x0086, B:41:0x0088, B:12:0x0030, B:29:0x0068, B:33:0x0072, B:32:0x006e), top: B:61:0x0003, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e A[Catch: all -> 0x00ac, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x001f, B:8:0x0021, B:10:0x002d, B:11:0x002f, B:13:0x0032, B:44:0x008b, B:45:0x008e, B:47:0x009e, B:48:0x00a1, B:51:0x00a4, B:52:0x00a9, B:18:0x0038, B:19:0x0039, B:20:0x003a, B:21:0x003e, B:23:0x0044, B:25:0x005b, B:27:0x0065, B:28:0x0067, B:35:0x0075, B:37:0x007b, B:38:0x007f, B:39:0x0086, B:41:0x0088, B:12:0x0030, B:29:0x0068, B:33:0x0072, B:32:0x006e), top: B:61:0x0003, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.xcc r6, bp3 r7, defpackage.tc4 r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.a
            monitor-enter(r0)
            java.lang.Object r1 = r7.h     // Catch: java.lang.Throwable -> Lac
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> Lac
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lac
            r1 = r1 ^ 1
            jpo.j(r1)     // Catch: java.lang.Throwable -> Lac
            r5.e = r8     // Catch: java.lang.Throwable -> Lac
            ndc r8 = r6.k()     // Catch: java.lang.Throwable -> Lac
            r5.e(r8)     // Catch: java.lang.Throwable -> Lac
            bdc r1 = r5.c(r8)     // Catch: java.lang.Throwable -> Lac
            if (r1 != 0) goto L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lac
            return
        L21:
            java.util.HashMap r2 = r5.c     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> Lac
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> Lac
            tc4 r2 = r5.e     // Catch: java.lang.Throwable -> Lac
            if (r2 == 0) goto L3a
            java.lang.Object r3 = r2.b     // Catch: java.lang.Throwable -> Lac
            monitor-enter(r3)     // Catch: java.lang.Throwable -> Lac
            boolean r2 = r2.f     // Catch: java.lang.Throwable -> L37
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
            r3 = 2
            if (r2 == r3) goto L8b
            goto L3a
        L37:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
            throw r5     // Catch: java.lang.Throwable -> Lac
        L3a:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lac
        L3e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lac
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lac
            xn2 r2 = (defpackage.xn2) r2     // Catch: java.lang.Throwable -> Lac
            java.util.HashMap r3 = r5.b     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> Lac
            xcc r2 = (defpackage.xcc) r2     // Catch: java.lang.Throwable -> Lac
            r2.getClass()     // Catch: java.lang.Throwable -> Lac
            boolean r3 = r2.equals(r6)     // Catch: java.lang.Throwable -> Lac
            if (r3 != 0) goto L3e
            java.util.List r3 = r2.r()     // Catch: java.lang.Throwable -> Lac
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> Lac
            if (r3 != 0) goto L3e
            java.lang.Object r3 = r2.a     // Catch: java.lang.Throwable -> Lac
            monitor-enter(r3)     // Catch: java.lang.Throwable -> Lac
            bp3 r4 = r2.f     // Catch: java.lang.Throwable -> L89
            if (r4 != 0) goto L6e
            r4 = 0
            goto L72
        L6e:
            boolean r4 = r4.c()     // Catch: java.lang.Throwable -> L89
        L72:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L89
            if (r4 != 0) goto L7f
            boolean r3 = r7.c()     // Catch: java.lang.Throwable -> Lac
            if (r3 != 0) goto L7f
            r2.u()     // Catch: java.lang.Throwable -> Lac
            goto L3e
        L7f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lac
            java.lang.String r6 = "Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lac
            throw r5     // Catch: java.lang.Throwable -> Lac
        L87:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L89
            throw r5     // Catch: java.lang.Throwable -> Lac
        L89:
            r5 = move-exception
            goto L87
        L8b:
            r6.c(r7)     // Catch: defpackage.kg4 -> La3 java.lang.Throwable -> Lac
            tcc r6 = r8.getLifecycle()     // Catch: java.lang.Throwable -> Lac
            qdc r6 = (defpackage.qdc) r6     // Catch: java.lang.Throwable -> Lac
            qcc r6 = r6.i     // Catch: java.lang.Throwable -> Lac
            qcc r7 = defpackage.qcc.d     // Catch: java.lang.Throwable -> Lac
            boolean r6 = r6.d(r7)     // Catch: java.lang.Throwable -> Lac
            if (r6 == 0) goto La1
            r5.g(r8)     // Catch: java.lang.Throwable -> Lac
        La1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lac
            return
        La3:
            r5 = move-exception
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lac
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Lac
            throw r6     // Catch: java.lang.Throwable -> Lac
        Laa:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lac
            throw r5
        Lac:
            r5 = move-exception
            goto Laa
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdc.a(xcc, bp3, tc4):void");
    }

    public final xcc b(ndc ndcVar, qg4 qg4Var, f8i f8iVar) {
        synchronized (this.a) {
            jpo.i("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", this.b.get(new xn2(System.identityHashCode(ndcVar), qg4Var.d)) == null);
            xcc xccVar = new xcc(ndcVar, qg4Var, f8iVar);
            if (((ArrayList) qg4Var.y()).isEmpty()) {
                xccVar.s();
            }
            if (((qdc) ndcVar.getLifecycle()).i == qcc.a) {
                return xccVar;
            }
            f(xccVar);
            return xccVar;
        }
    }

    public final bdc c(ndc ndcVar) {
        synchronized (this.a) {
            for (bdc bdcVar : this.c.keySet()) {
                if (ndcVar.equals(bdcVar.b)) {
                    return bdcVar;
                }
            }
            return null;
        }
    }

    public final boolean d(ndc ndcVar) {
        synchronized (this.a) {
            bdc bdcVarC = c(ndcVar);
            if (bdcVarC == null) {
                return false;
            }
            Iterator it = ((Set) this.c.get(bdcVarC)).iterator();
            while (it.hasNext()) {
                xcc xccVar = (xcc) this.b.get((xn2) it.next());
                xccVar.getClass();
                if (!xccVar.r().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void e(ndc ndcVar) {
        HashMap map;
        nr nrVar;
        bdc bdcVarC = c(ndcVar);
        if (bdcVarC != null) {
            HashSet hashSet = new HashSet();
            Set set = (Set) this.c.get(bdcVarC);
            Objects.requireNonNull(set);
            Iterator it = set.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = this.b;
                if (!zHasNext) {
                    break;
                }
                xn2 xn2Var = (xn2) it.next();
                xcc xccVar = (xcc) map.get(xn2Var);
                if (xccVar != null) {
                    qg4 qg4Var = xccVar.c;
                    if (qg4Var.a.a.l() || ((nrVar = qg4Var.b) != null && nrVar.a.l())) {
                        hashSet.add(xn2Var);
                    }
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            hashSet.size();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                xcc xccVar2 = (xcc) map.get((xn2) it2.next());
                Objects.requireNonNull(xccVar2);
                l(xccVar2);
            }
        }
    }

    public final void f(xcc xccVar) {
        synchronized (this.a) {
            ndc ndcVarK = xccVar.k();
            xn2 xn2Var = new xn2(System.identityHashCode(ndcVarK), xccVar.c.d);
            bdc bdcVarC = c(ndcVarK);
            Set hashSet = bdcVarC != null ? (Set) this.c.get(bdcVarC) : new HashSet();
            hashSet.add(xn2Var);
            this.b.put(xn2Var, xccVar);
            if (bdcVarC == null) {
                bdc bdcVar = new bdc(ndcVarK, this);
                this.c.put(bdcVar, hashSet);
                ndcVarK.getLifecycle().a(bdcVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038 A[Catch: all -> 0x004c, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000b, B:10:0x0013, B:26:0x0045, B:27:0x0048, B:11:0x0019, B:13:0x001d, B:14:0x001f, B:16:0x0022, B:21:0x0028, B:22:0x0029, B:23:0x002a, B:25:0x0038, B:15:0x0020), top: B:35:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.ndc r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            boolean r1 = r3.d(r4)     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            return
        Lb:
            java.util.ArrayDeque r1 = r3.d     // Catch: java.lang.Throwable -> L4c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L19
            java.util.ArrayDeque r1 = r3.d     // Catch: java.lang.Throwable -> L4c
            r1.push(r4)     // Catch: java.lang.Throwable -> L4c
            goto L45
        L19:
            tc4 r1 = r3.e     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L2a
            java.lang.Object r2 = r1.b     // Catch: java.lang.Throwable -> L4c
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L4c
            boolean r1 = r1.f     // Catch: java.lang.Throwable -> L27
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
            r2 = 2
            if (r1 == r2) goto L45
            goto L2a
        L27:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
            throw r3     // Catch: java.lang.Throwable -> L4c
        L2a:
            java.util.ArrayDeque r1 = r3.d     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r1.peek()     // Catch: java.lang.Throwable -> L4c
            ndc r1 = (defpackage.ndc) r1     // Catch: java.lang.Throwable -> L4c
            boolean r2 = r4.equals(r1)     // Catch: java.lang.Throwable -> L4c
            if (r2 != 0) goto L45
            r3.i(r1)     // Catch: java.lang.Throwable -> L4c
            java.util.ArrayDeque r1 = r3.d     // Catch: java.lang.Throwable -> L4c
            r1.remove(r4)     // Catch: java.lang.Throwable -> L4c
            java.util.ArrayDeque r1 = r3.d     // Catch: java.lang.Throwable -> L4c
            r1.push(r4)     // Catch: java.lang.Throwable -> L4c
        L45:
            r3.n(r4)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            return
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            throw r3
        L4c:
            r3 = move-exception
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdc.g(ndc):void");
    }

    public final void h(ndc ndcVar) {
        synchronized (this.a) {
            this.d.remove(ndcVar);
            i(ndcVar);
            if (!this.d.isEmpty()) {
                n((ndc) this.d.peek());
            }
        }
    }

    public final void i(ndc ndcVar) {
        synchronized (this.a) {
            bdc bdcVarC = c(ndcVar);
            if (bdcVarC == null) {
                return;
            }
            Iterator it = ((Set) this.c.get(bdcVarC)).iterator();
            while (it.hasNext()) {
                xcc xccVar = (xcc) this.b.get((xn2) it.next());
                xccVar.getClass();
                xccVar.s();
            }
        }
    }

    public final void j(bp3 bp3Var, HashSet hashSet) {
        synchronized (this.a) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                xn2 xn2Var = (xn2) it.next();
                if (this.b.containsKey(xn2Var)) {
                    xcc xccVar = (xcc) this.b.get(xn2Var);
                    boolean zIsEmpty = xccVar.r().isEmpty();
                    xccVar.t(bp3Var);
                    if (!zIsEmpty && xccVar.r().isEmpty()) {
                        h(xccVar.k());
                    }
                }
            }
        }
    }

    public final void k(HashSet hashSet) {
        synchronized (this.a) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                xcc xccVar = (xcc) this.b.get((xn2) it.next());
                if (xccVar != null) {
                    xccVar.u();
                    h(xccVar.k());
                }
            }
        }
    }

    public final void l(xcc xccVar) {
        synchronized (this.a) {
            ndc ndcVarK = xccVar.k();
            xn2 xn2Var = new xn2(System.identityHashCode(ndcVarK), xccVar.c.d);
            this.b.remove(xn2Var);
            HashSet hashSet = new HashSet();
            for (bdc bdcVar : this.c.keySet()) {
                if (ndcVarK.equals(bdcVar.b)) {
                    Set set = (Set) this.c.get(bdcVar);
                    set.remove(xn2Var);
                    if (set.isEmpty()) {
                        hashSet.add(bdcVar.b);
                    }
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                m((ndc) it.next());
            }
        }
    }

    public final void m(ndc ndcVar) {
        synchronized (this.a) {
            bdc bdcVarC = c(ndcVar);
            if (bdcVarC == null) {
                return;
            }
            h(ndcVar);
            Iterator it = ((Set) this.c.get(bdcVarC)).iterator();
            while (it.hasNext()) {
                this.b.remove((xn2) it.next());
            }
            this.c.remove(bdcVarC);
            bdcVarC.b.getLifecycle().b(bdcVarC);
        }
    }

    public final void n(ndc ndcVar) {
        synchronized (this.a) {
            Iterator it = ((Set) this.c.get(c(ndcVar))).iterator();
            while (it.hasNext()) {
                xcc xccVar = (xcc) this.b.get((xn2) it.next());
                xccVar.getClass();
                if (!xccVar.r().isEmpty()) {
                    xccVar.v();
                }
            }
        }
    }
}
