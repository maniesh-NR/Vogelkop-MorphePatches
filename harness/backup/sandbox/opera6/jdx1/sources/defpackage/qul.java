package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qul implements tfd {
    public final u89 a;
    public final z62 b;
    public final rd3 c;
    public final int d;
    public final float e;

    public qul(u89 u89Var, z62 z62Var, rd3 rd3Var, int i, float f) {
        this.a = u89Var;
        this.b = z62Var;
        this.c = rd3Var;
        this.d = i;
        this.e = f;
    }

    @Override // defpackage.tfd
    public final int a(shb shbVar, List list, int i) {
        int size = list.size();
        int iJ = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iJ += ((pfd) list.get(i2)).J(i);
        }
        return iJ;
    }

    @Override // defpackage.tfd
    public final ufd b(final vfd vfdVar, List list, final long j) throws pxb {
        int iH;
        final qul qulVar = this;
        int size = list.size();
        final int i = 0;
        int i2 = 0;
        while (i2 < size) {
            pfd pfdVar = (pfd) list.get(i2);
            if (Intrinsics.a(j14.R(pfdVar), "navigationIcon")) {
                final ifg ifgVarN = pfdVar.N(yo5.a(0, 0, 0, 0, 14, j));
                List list2 = list;
                int size2 = list2.size();
                int i3 = 0;
                while (i3 < size2) {
                    pfd pfdVar2 = (pfd) list.get(i3);
                    if (Intrinsics.a(j14.R(pfdVar2), "actionIcons")) {
                        final ifg ifgVarN2 = pfdVar2.N(yo5.a(0, 0, 0, 0, 14, j));
                        if (yo5.h(j) == Integer.MAX_VALUE) {
                            iH = yo5.h(j);
                        } else {
                            iH = (yo5.h(j) - ifgVarN.a) - ifgVarN2.a;
                            if (iH < 0) {
                                iH = 0;
                            }
                        }
                        int i4 = iH;
                        int size3 = list2.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            pfd pfdVar3 = (pfd) list.get(i5);
                            if (Intrinsics.a(j14.R(pfdVar3), "title")) {
                                final ifg ifgVarN3 = pfdVar3.N(yo5.a(0, i4, 0, 0, 12, j));
                                mga mgaVar = vz0.b;
                                final int iW = ifgVarN3.W(mgaVar) != Integer.MIN_VALUE ? ifgVarN3.W(mgaVar) : 0;
                                float fInvoke = qulVar.a.invoke();
                                int iB = Float.isNaN(fInvoke) ? 0 : zed.b(fInvoke);
                                final int iMax = Math.max(vfdVar.M(qulVar.e), ifgVarN3.b);
                                if (yo5.g(j) == Integer.MAX_VALUE) {
                                    i = iMax;
                                } else {
                                    int i6 = iB + iMax;
                                    if (i6 >= 0) {
                                        i = i6;
                                    }
                                }
                                return vfdVar.b0(yo5.h(j), i, n08.a, new Function1() { // from class: pul
                                    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
                                    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final java.lang.Object invoke(java.lang.Object r14) {
                                        /*
                                            r13 = this;
                                            p1d r14 = (defpackage.p1d) r14
                                            ifg r0 = r1
                                            int r1 = r0.b
                                            int r2 = r2
                                            int r1 = r2 - r1
                                            int r1 = r1 / 2
                                            r3 = 0
                                            defpackage.p1d.h(r14, r0, r3, r1)
                                            float r1 = defpackage.so1.g
                                            vfd r4 = r7
                                            int r1 = r4.M(r1)
                                            int r0 = r0.a
                                            int r0 = java.lang.Math.max(r1, r0)
                                            ifg r1 = r4
                                            int r4 = r1.a
                                            qul r5 = r8
                                            rd3 r6 = r5.c
                                            ifg r7 = r3
                                            int r8 = r7.a
                                            long r9 = r5
                                            int r11 = defpackage.yo5.h(r9)
                                            d2c r12 = defpackage.d2c.a
                                            int r6 = r6.a(r8, r11, r12)
                                            if (r6 >= r0) goto L3b
                                            int r0 = r0 - r6
                                        L39:
                                            int r6 = r6 + r0
                                            goto L4f
                                        L3b:
                                            int r0 = r7.a
                                            int r0 = r0 + r6
                                            int r8 = defpackage.yo5.h(r9)
                                            int r8 = r8 - r4
                                            if (r0 <= r8) goto L4f
                                            int r0 = defpackage.yo5.h(r9)
                                            int r0 = r0 - r4
                                            int r4 = r7.a
                                            int r4 = r4 + r6
                                            int r0 = r0 - r4
                                            goto L39
                                        L4f:
                                            z62 r0 = r5.b
                                            ydp r4 = defpackage.b72.e
                                            boolean r4 = r0.equals(r4)
                                            if (r4 == 0) goto L60
                                            int r13 = r7.b
                                            int r13 = r2 - r13
                                            int r3 = r13 / 2
                                            goto L86
                                        L60:
                                            v62 r4 = defpackage.b72.d
                                            boolean r0 = r0.equals(r4)
                                            if (r0 == 0) goto L86
                                            int r0 = r5.d
                                            int r4 = r7.b
                                            if (r0 != 0) goto L71
                                            int r3 = r2 - r4
                                            goto L86
                                        L71:
                                            int r5 = r9
                                            int r5 = r4 - r5
                                            int r0 = r0 - r5
                                            int r5 = r0 + r4
                                            int r13 = r10
                                            if (r5 <= r13) goto L7e
                                            int r5 = r5 - r13
                                            int r0 = r0 - r5
                                        L7e:
                                            int r13 = r2 - r4
                                            int r0 = java.lang.Math.max(r3, r0)
                                            int r3 = r13 - r0
                                        L86:
                                            defpackage.p1d.h(r14, r7, r6, r3)
                                            int r13 = defpackage.yo5.h(r9)
                                            int r0 = r1.a
                                            int r13 = r13 - r0
                                            int r0 = r1.b
                                            int r2 = r2 - r0
                                            int r2 = r2 / 2
                                            defpackage.p1d.h(r14, r1, r13, r2)
                                            kotlin.Unit r13 = kotlin.Unit.a
                                            return r13
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.pul.invoke(java.lang.Object):java.lang.Object");
                                    }
                                });
                            }
                            i5++;
                            qulVar = this;
                        }
                        tic.b("Collection contains no element matching the predicate.");
                        t3p.v();
                        return null;
                    }
                    i3++;
                    qulVar = this;
                }
                tic.b("Collection contains no element matching the predicate.");
                t3p.v();
                return null;
            }
            i2++;
            qulVar = this;
        }
        tic.b("Collection contains no element matching the predicate.");
        t3p.v();
        return null;
    }

    @Override // defpackage.tfd
    public final int c(shb shbVar, List list, int i) {
        int size = list.size();
        int iE = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iE += ((pfd) list.get(i2)).E(i);
        }
        return iE;
    }

    @Override // defpackage.tfd
    public final int d(shb shbVar, List list, int i) {
        Integer numValueOf;
        int iM = shbVar.M(this.e);
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((pfd) list.get(0)).c(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((pfd) list.get(i2)).c(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return Math.max(iM, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // defpackage.tfd
    public final int e(shb shbVar, List list, int i) {
        Integer numValueOf;
        int iM = shbVar.M(this.e);
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((pfd) list.get(0)).z(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((pfd) list.get(i2)).z(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return Math.max(iM, numValueOf != null ? numValueOf.intValue() : 0);
    }
}
