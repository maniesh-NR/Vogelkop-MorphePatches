package defpackage;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class qdc extends tcc {
    public final boolean b;
    public g77 c;
    public final znn d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public qcc i;
    public final nak j;

    public qdc(ndc ndcVar, boolean z) {
        this.a = new wth((byte) 13);
        this.b = z;
        this.c = new g77((byte) 10);
        this.d = new znn(ndcVar);
        this.h = new ArrayList();
        qcc qccVar = qcc.b;
        this.i = qccVar;
        this.j = z4o.f(qccVar);
    }

    @Override // defpackage.tcc
    public final void a(mdc mdcVar) {
        idc el5Var;
        pdc pdcVar;
        ndc ndcVar;
        d("addObserver");
        qcc qccVar = this.i;
        qcc qccVar2 = qcc.a;
        if (qccVar != qccVar2) {
            qccVar2 = qcc.b;
        }
        pdc pdcVar2 = new pdc();
        pdcVar2.a = qccVar2;
        HashMap map = ydc.a;
        boolean z = mdcVar instanceof idc;
        boolean z2 = mdcVar instanceof as6;
        byte b = 2;
        Object obj = null;
        byte b2 = 1;
        if (z && z2) {
            el5Var = new el5((as6) mdcVar, (idc) mdcVar, b2);
        } else if (z2) {
            el5Var = new el5((as6) mdcVar, obj, b2);
        } else if (z) {
            el5Var = (idc) mdcVar;
        } else {
            Class<?> cls = mdcVar.getClass();
            if (ydc.b(cls) == 2) {
                List list = (List) ydc.b.get(cls);
                if (list.size() == 1) {
                    ydc.a((Constructor) list.get(0), mdcVar);
                    el5Var = new slj();
                } else {
                    int size = list.size();
                    vu9[] vu9VarArr = new vu9[size];
                    for (int i = 0; i < size; i++) {
                        ydc.a((Constructor) list.get(i), mdcVar);
                        vu9VarArr[i] = null;
                    }
                    el5Var = new uoh(vu9VarArr, b);
                }
            } else {
                el5Var = new el5(mdcVar);
            }
        }
        pdcVar2.b = el5Var;
        g77 g77Var = this.c;
        see seeVar = (see) g77Var.a;
        dq8 dq8Var = (dq8) seeVar.g(mdcVar);
        if (dq8Var != null) {
            pdcVar = dq8Var.b;
        } else {
            dq8 dq8Var2 = new dq8(mdcVar, pdcVar2);
            seeVar.m(mdcVar, dq8Var2);
            dq8 dq8Var3 = (dq8) g77Var.c;
            if (dq8Var3 == null) {
                g77Var.b = dq8Var2;
                g77Var.c = dq8Var2;
            } else {
                dq8Var3.c = dq8Var2;
                dq8Var2.d = dq8Var3;
                g77Var.c = dq8Var2;
            }
            pdcVar = null;
        }
        if (pdcVar != null || (ndcVar = (ndc) this.d.a.get()) == null) {
            return;
        }
        boolean z3 = this.e != 0 || this.f;
        qcc qccVarC = c(mdcVar);
        this.e++;
        while (pdcVar2.a.compareTo(qccVarC) < 0 && ((see) this.c.a).c(mdcVar)) {
            qcc qccVar3 = pdcVar2.a;
            ArrayList arrayList = this.h;
            arrayList.add(qccVar3);
            mcc mccVar = occ.Companion;
            qcc qccVar4 = pdcVar2.a;
            mccVar.getClass();
            int iOrdinal = qccVar4.ordinal();
            occ occVar = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : occ.ON_RESUME : occ.ON_START : occ.ON_CREATE;
            if (occVar == null) {
                j9h.u(pdcVar2.a, "no event up from ");
                return;
            } else {
                pdcVar2.a(ndcVar, occVar);
                o95.y(arrayList);
                qccVarC = c(mdcVar);
            }
        }
        if (!z3) {
            h();
        }
        this.e--;
    }

    @Override // defpackage.tcc
    public final void b(mdc mdcVar) {
        d("removeObserver");
        g77 g77Var = this.c;
        dq8 dq8Var = (dq8) ((see) g77Var.a).k(mdcVar);
        if (dq8Var == null) {
            return;
        }
        dq8 dq8Var2 = dq8Var.d;
        dq8 dq8Var3 = dq8Var.c;
        if (dq8Var2 == null) {
            g77Var.b = dq8Var3;
        } else {
            dq8Var2.c = dq8Var3;
        }
        dq8 dq8Var4 = dq8Var.c;
        if (dq8Var4 == null) {
            g77Var.c = dq8Var2;
        } else {
            dq8Var4.d = dq8Var2;
        }
        dq8Var.e = true;
    }

    public final qcc c(mdc mdcVar) {
        dq8 dq8Var = (dq8) ((see) this.c.a).g(mdcVar);
        dq8 dq8Var2 = dq8Var != null ? dq8Var.d : null;
        qcc qccVar = dq8Var2 != null ? dq8Var2.b.a : null;
        ArrayList arrayList = this.h;
        qcc qccVar2 = arrayList.isEmpty() ? null : (qcc) am2.k(1, arrayList);
        qcc qccVar3 = this.i;
        if (qccVar == null || qccVar.compareTo(qccVar3) >= 0) {
            qccVar = qccVar3;
        }
        return (qccVar2 == null || qccVar2.compareTo(qccVar) >= 0) ? qccVar : qccVar2;
    }

    public final void d(String str) {
        if (!this.b || cx1.C().a.C()) {
            return;
        }
        t14.c(sko.k("Method ", str, " must be called on the main thread"));
    }

    public final void e(occ occVar) {
        d("handleLifecycleEvent");
        f(occVar.d());
    }

    public final void f(qcc qccVar) {
        if (this.i != qccVar) {
            ndc ndcVar = (ndc) this.d.a.get();
            qcc qccVar2 = this.i;
            if (qccVar2 == qcc.b && qccVar == qcc.a) {
                throw new IllegalStateException(("State must be at least '" + qcc.c + "' to be moved to '" + qccVar + "' in component " + ndcVar).toString());
            }
            qcc qccVar3 = qcc.a;
            if (qccVar2 == qccVar3 && qccVar2 != qccVar) {
                throw new IllegalStateException(("State is '" + qccVar3 + "' and cannot be moved to `" + qccVar + "` in component " + ndcVar).toString());
            }
            this.i = qccVar;
            if (this.f || this.e != 0) {
                this.g = true;
                return;
            }
            this.f = true;
            h();
            this.f = false;
            if (this.i == qccVar3) {
                this.c = new g77((byte) 10);
            }
        }
    }

    public final void g(qcc qccVar) {
        d("setCurrentState");
        f(qccVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        r7.g = false;
        r7.j.j(r7.i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Type inference failed for: r2v7, types: [odc] */
    /* JADX WARN: Type inference failed for: r2v8, types: [odc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r7 = this;
            znn r0 = r7.d
            java.lang.ref.WeakReference r0 = r0.a
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L9c
            ndc r0 = (defpackage.ndc) r0
        Lc:
            g77 r1 = r7.c
            java.lang.Object r2 = r1.a
            see r2 = (defpackage.see) r2
            int r2 = r2.e
            r3 = 0
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.b
            dq8 r2 = (defpackage.dq8) r2
            java.lang.String r4 = "Collection is empty."
            if (r2 == 0) goto L98
            pdc r5 = r2.b
            qcc r5 = r5.a
            java.lang.Object r1 = r1.c
            dq8 r1 = (defpackage.dq8) r1
            if (r1 == 0) goto L94
            pdc r1 = r1.b
            qcc r1 = r1.a
            if (r5 != r1) goto L3d
            qcc r6 = r7.i
            if (r6 != r1) goto L3d
        L33:
            r7.g = r3
            nak r0 = r7.j
            qcc r7 = r7.i
            r0.j(r7)
            return
        L3d:
            r7.g = r3
            qcc r1 = r7.i
            if (r2 == 0) goto L90
            int r1 = r1.compareTo(r5)
            if (r1 >= 0) goto L60
            g77 r1 = r7.c
            odc r2 = new odc
            r2.<init>(r7)
            java.lang.Object r1 = r1.c
            dq8 r1 = (defpackage.dq8) r1
        L54:
            if (r1 == 0) goto L60
            boolean r3 = r1.e
            if (r3 != 0) goto L5d
            r2.invoke(r1)
        L5d:
            dq8 r1 = r1.d
            goto L54
        L60:
            g77 r1 = r7.c
            java.lang.Object r1 = r1.c
            dq8 r1 = (defpackage.dq8) r1
            boolean r2 = r7.g
            if (r2 != 0) goto Lc
            if (r1 == 0) goto Lc
            qcc r2 = r7.i
            pdc r1 = r1.b
            qcc r1 = r1.a
            int r1 = r2.compareTo(r1)
            if (r1 <= 0) goto Lc
            g77 r1 = r7.c
            odc r2 = new odc
            r3 = 1
            r2.<init>(r7)
            java.lang.Object r1 = r1.b
            dq8 r1 = (defpackage.dq8) r1
        L84:
            if (r1 == 0) goto Lc
            boolean r3 = r1.e
            if (r3 != 0) goto L8d
            r2.invoke(r1)
        L8d:
            dq8 r1 = r1.c
            goto L84
        L90:
            h9o.h(r4)
            return
        L94:
            h9o.h(r4)
            return
        L98:
            h9o.h(r4)
            return
        L9c:
            java.lang.String r7 = "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."
            qp2.n(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdc.h():void");
    }
}
