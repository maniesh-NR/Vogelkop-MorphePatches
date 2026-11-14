package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gb9 implements mbe, k9i {
    public final w62 a;
    public final z62 b;
    public final float c;
    public final j26 d;
    public final float e;
    public final db9 f;

    public gb9(w62 w62Var, z62 z62Var, float f, j26 j26Var, float f2, db9 db9Var) {
        this.a = w62Var;
        this.b = z62Var;
        this.c = f;
        this.d = j26Var;
        this.e = f2;
        this.f = db9Var;
    }

    public static int k(List list, int i, int i2, int i3, db9 db9Var) {
        int iZ;
        int iE;
        boolean z;
        int iE2;
        boolean z2;
        long jA = tbb.a(0, 0);
        if (!list.isEmpty()) {
            int i4 = Integer.MAX_VALUE;
            ab9 ab9Var = new ab9(db9Var, ap5.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            pfd pfdVar = (pfd) CollectionsKt.M(0, list);
            if (pfdVar != null) {
                iZ = pfdVar.z(i);
                iE = pfdVar.E(iZ);
            } else {
                iZ = 0;
                iE = 0;
            }
            boolean z3 = true;
            if (list.size() > 1) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            int i5 = 0;
            if (ab9Var.b(z3, 0, tbb.a(i, Integer.MAX_VALUE), pfdVar == null ? null : new tbb(tbb.a(iE, iZ)), 0, 0, 0, false, false).b) {
                db9Var.getClass();
                cb9 cb9Var = cb9.a;
                jA = jA;
            } else {
                int size = list.size();
                int i6 = i;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i9 >= size) {
                        break;
                    }
                    int i12 = i6 - iE;
                    int i13 = i9 + 1;
                    int iMax = Math.max(i8, iZ);
                    pfd pfdVar2 = (pfd) CollectionsKt.M(i13, list);
                    if (pfdVar2 != null) {
                        iZ = pfdVar2.z(i);
                        iE2 = pfdVar2.E(iZ) + i2;
                    } else {
                        iZ = 0;
                        iE2 = 0;
                    }
                    if (i9 + 2 < list.size()) {
                        i9 = i13;
                        z2 = z;
                    } else {
                        i9 = i13;
                        z2 = false;
                    }
                    int i14 = i9 - i11;
                    int i15 = i7;
                    int i16 = iE2;
                    za9 za9VarB = ab9Var.b(z2, i14, tbb.a(i12, i4), pfdVar2 == null ? null : new tbb(tbb.a(iE2, iZ)), i15, i5, iMax, false, false);
                    if (za9VarB.a) {
                        int i17 = iMax + i3 + i5;
                        ab9Var.a(za9VarB, pfdVar2 != null, i15, i17, i12, i14);
                        int i18 = i16 - i2;
                        i7 = i15 + 1;
                        if (za9VarB.b) {
                            i10 = i9;
                            i5 = i17;
                            break;
                        }
                        i6 = i;
                        i11 = i9;
                        iE = i18;
                        i5 = i17;
                        i8 = 0;
                    } else {
                        iE = i16;
                        i6 = i12;
                        i7 = i15;
                        i8 = iMax;
                    }
                    i10 = i9;
                    i4 = Integer.MAX_VALUE;
                    z = true;
                }
                jA = tbb.a(i5 - i3, i10);
            }
        }
        return (int) (jA >> 32);
    }

    @Override // defpackage.mbe
    public final int a(shb shbVar, List list, int i) {
        List list2 = (List) CollectionsKt.M(1, list);
        pfd pfdVar = list2 != null ? (pfd) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.M(2, list);
        this.f.a(pfdVar, list3 != null ? (pfd) CollectionsKt.firstOrNull(list3) : null, ap5.b(0, 0, 0, i, 7));
        l08 l08Var = (List) CollectionsKt.firstOrNull(list);
        if (l08Var == null) {
            l08Var = l08.a;
        }
        int iM = shbVar.M(this.c);
        int size = ((Collection) l08Var).size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iJ = ((pfd) l08Var.get(i2)).J(i) + iM;
            int i5 = i2 + 1;
            if (i5 - i3 == Integer.MAX_VALUE || i5 == l08Var.size()) {
                iMax = Math.max(iMax, (i4 + iJ) - iM);
                i3 = i2;
                i4 = 0;
            } else {
                i4 += iJ;
            }
            i2 = i5;
        }
        return iMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mbe
    public final ufd b(vfd vfdVar, List list, long j) {
        float f;
        boolean z;
        pfd pfdVar;
        pfd pfdVar2;
        Iterator it;
        pfd pfdVar3;
        int i;
        int i2;
        pqh pqhVar;
        int i3;
        tbb tbbVar;
        Integer numValueOf;
        Integer num;
        za9 za9Var;
        int i4;
        int i5;
        pfd pfdVar4;
        pqh pqhVar2;
        pfd pfdVar5;
        int i6;
        tbb tbbVar2;
        Integer numValueOf2;
        Integer numValueOf3;
        int i7;
        Integer num2;
        tbb tbbVar3;
        za9 za9Var2;
        int i8;
        long jA;
        long jA2;
        if (!((ArrayList) list).isEmpty()) {
            int iG = yo5.g(j);
            db9 db9Var = this.f;
            if (iG != 0) {
                List list2 = (List) CollectionsKt.K(list);
                if (list2.isEmpty()) {
                    return vfdVar.b0(0, 0, n08.a, new d58((byte) 20));
                }
                List list3 = (List) CollectionsKt.M(1, list);
                pfd pfdVar6 = list3 != null ? (pfd) CollectionsKt.firstOrNull(list3) : null;
                List list4 = (List) CollectionsKt.M(2, list);
                pfd pfdVar7 = list4 != null ? (pfd) CollectionsKt.firstOrNull(list4) : null;
                list2.size();
                db9Var.getClass();
                a4c a4cVar = a4c.a;
                long jP = aib.P(aib.s(10, aib.p(j, a4cVar)));
                if (pfdVar6 == null) {
                    f = 0.0f;
                    z = true;
                } else if (joh.o(joh.m(pfdVar6)) == 0.0f) {
                    joh.m(pfdVar6);
                    ifg ifgVarN = pfdVar6.N(jP);
                    f = 0.0f;
                    z = true;
                    new tbb(tbb.a(ifgVarN.Y(), ifgVarN.X()));
                    ifgVarN.Y();
                    ifgVarN.X();
                } else {
                    f = 0.0f;
                    z = true;
                    pfdVar6.z(pfdVar6.E(Integer.MAX_VALUE));
                }
                if (pfdVar7 != null) {
                    if (joh.o(joh.m(pfdVar7)) == f) {
                        joh.m(pfdVar7);
                        ifg ifgVarN2 = pfdVar7.N(jP);
                        new tbb(tbb.a(ifgVarN2.Y(), ifgVarN2.X()));
                        ifgVarN2.Y();
                        ifgVarN2.X();
                    } else {
                        pfdVar7.z(pfdVar7.E(Integer.MAX_VALUE));
                    }
                }
                Iterator it2 = list2.iterator();
                long jP2 = aib.p(j, a4cVar);
                dfe dfeVar = new dfe(new ufd[16]);
                int iH = yo5.h(jP2);
                int iJ = yo5.j(jP2);
                int iG2 = yo5.g(jP2);
                jde jdeVar = xbb.a;
                jde jdeVar2 = new jde();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(vfdVar.o0(this.c));
                int iCeil2 = (int) Math.ceil(vfdVar.o0(this.e));
                long jA3 = ap5.a(0, iH, 0, iG2);
                long jP3 = aib.P(aib.s(14, jA3));
                pqh pqhVar3 = new pqh();
                if (it2.hasNext()) {
                    try {
                        pfdVar = (pfd) it2.next();
                    } catch (IndexOutOfBoundsException unused) {
                        pfdVar = null;
                    }
                    pfdVar2 = pfdVar;
                } else {
                    pfdVar2 = null;
                }
                if (pfdVar2 != null) {
                    if (joh.o(joh.m(pfdVar2)) == f) {
                        joh.m(pfdVar2);
                        it = it2;
                        ifg ifgVarN3 = pfdVar2.N(jP3);
                        pqhVar3.a = ifgVarN3;
                        i = iJ;
                        jA2 = tbb.a(ifgVarN3.Y(), ifgVarN3.X());
                        pqhVar = pqhVar3;
                    } else {
                        it = it2;
                        i = iJ;
                        int iE = pfdVar2.E(Integer.MAX_VALUE);
                        pqhVar = pqhVar3;
                        jA2 = tbb.a(iE, pfdVar2.z(iE));
                    }
                    pfdVar3 = pfdVar2;
                    i2 = iCeil;
                    i3 = iCeil2;
                    tbbVar = new tbb(jA2);
                } else {
                    it = it2;
                    pfdVar3 = pfdVar2;
                    i = iJ;
                    i2 = iCeil;
                    pqhVar = pqhVar3;
                    i3 = iCeil2;
                    tbbVar = null;
                }
                if (tbbVar != null) {
                    long j2 = tbbVar.a;
                    Integer numValueOf4 = Integer.valueOf((int) (j2 >> 32));
                    numValueOf = Integer.valueOf((int) (j2 & 4294967295L));
                    num = numValueOf4;
                } else {
                    numValueOf = null;
                    num = null;
                }
                tbb tbbVar4 = tbbVar;
                int i9 = i2;
                int[] iArr = new int[16];
                int[] iArr2 = new int[16];
                int i10 = i3;
                kde kdeVar = new kde();
                db9 db9Var2 = this.f;
                ab9 ab9Var = new ab9(db9Var2, jP2, i9, i10);
                za9 za9VarB = ab9Var.b(it.hasNext(), 0, tbb.a(iH, iG2), tbbVar4, 0, 0, 0, false, false);
                int i11 = i9;
                if (za9VarB.b) {
                    za9Var = za9VarB;
                    ab9Var.a(za9Var, tbbVar4 != null ? z : false, -1, 0, iH, 0);
                } else {
                    za9Var = za9VarB;
                }
                int i12 = iH;
                Integer num3 = num;
                kde kdeVar2 = kdeVar;
                za9 za9Var3 = za9Var;
                int i13 = i;
                pfd pfdVar8 = pfdVar3;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int[] iArrCopyOf = iArr;
                Integer num4 = numValueOf;
                int[] iArrCopyOf2 = iArr2;
                int i20 = 0;
                int i21 = 0;
                int i22 = iG2;
                while (!za9Var3.b && pfdVar8 != null) {
                    int iIntValue = num3.intValue();
                    int iIntValue2 = num4.intValue();
                    int i23 = i15;
                    int i24 = i16 + iIntValue;
                    int iMax = Math.max(i14, iIntValue2);
                    int i25 = i12 - iIntValue;
                    int i26 = i20 + 1;
                    db9Var2.getClass();
                    arrayList.add(pfdVar8);
                    jdeVar2.i(i20, pqhVar.a);
                    pfdVar8.p();
                    int i27 = i26 - i17;
                    if (it.hasNext()) {
                        try {
                            pfdVar4 = (pfd) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                        }
                    } else {
                        pfdVar4 = null;
                    }
                    pqhVar.a = null;
                    if (pfdVar4 != null) {
                        if (joh.o(joh.m(pfdVar4)) == f) {
                            joh.m(pfdVar4);
                            ifg ifgVarN4 = pfdVar4.N(jP3);
                            pqhVar.a = ifgVarN4;
                            pqhVar2 = pqhVar;
                            jA = tbb.a(ifgVarN4.Y(), ifgVarN4.X());
                        } else {
                            pqhVar2 = pqhVar;
                            int iE2 = pfdVar4.E(Integer.MAX_VALUE);
                            jA = tbb.a(iE2, pfdVar4.z(iE2));
                        }
                        pfdVar5 = pfdVar4;
                        long j3 = jA;
                        i6 = i26;
                        tbbVar2 = new tbb(j3);
                    } else {
                        pqhVar2 = pqhVar;
                        pfdVar5 = pfdVar4;
                        i6 = i26;
                        tbbVar2 = null;
                    }
                    if (tbbVar2 != null) {
                        long j4 = tbbVar2.a;
                        numValueOf3 = Integer.valueOf(((int) (j4 >> 32)) + i11);
                        numValueOf2 = Integer.valueOf((int) (j4 & 4294967295L));
                    } else {
                        numValueOf2 = null;
                        numValueOf3 = null;
                    }
                    boolean zHasNext = it.hasNext();
                    int i28 = i18;
                    long jA4 = tbb.a(i25, i22);
                    if (tbbVar2 == null) {
                        i7 = i25;
                        num2 = numValueOf2;
                        tbbVar3 = null;
                    } else {
                        i7 = i25;
                        num2 = numValueOf2;
                        tbbVar3 = new tbb(tbb.a(numValueOf3.intValue(), numValueOf2.intValue()));
                    }
                    za9 za9VarB2 = ab9Var.b(zHasNext, i27, jA4, tbbVar3, i28, i19, iMax, false, false);
                    if (za9VarB2.a) {
                        int iMin = Math.min(Math.max(i13, i24), iH);
                        int i29 = i19 + iMax;
                        za9Var2 = za9VarB2;
                        ab9Var.a(za9Var2, tbbVar2 != null ? z : false, i28, i29, i7, i27);
                        int i30 = i23 + 1;
                        if (iArrCopyOf2.length < i30) {
                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, Math.max(i30, (iArrCopyOf2.length * 3) / 2));
                        }
                        iArrCopyOf2[i23] = iMax;
                        i15 = i23 + 1;
                        i22 = (iG2 - i29) - i10;
                        int i31 = i21 + 1;
                        if (iArrCopyOf.length < i31) {
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i31, (iArrCopyOf.length * 3) / 2));
                        }
                        iArrCopyOf[i21] = i6;
                        i21++;
                        i18 = i28 + 1;
                        i19 = i29 + i10;
                        numValueOf3 = numValueOf3 != null ? Integer.valueOf(numValueOf3.intValue() - i11) : null;
                        i13 = iMin;
                        i7 = iH;
                        i17 = i6;
                        i8 = 0;
                        i14 = 0;
                    } else {
                        za9Var2 = za9VarB2;
                        i8 = i24;
                        i15 = i23;
                        i18 = i28;
                        i14 = iMax;
                    }
                    pfdVar8 = pfdVar5;
                    pqhVar = pqhVar2;
                    i20 = i6;
                    num3 = numValueOf3;
                    i12 = i7;
                    num4 = num2;
                    i16 = i8;
                    za9Var3 = za9Var2;
                }
                int i32 = i15;
                int size = arrayList.size();
                ArrayList arrayList2 = arrayList;
                ifg[] ifgVarArr = new ifg[size];
                for (int i33 = 0; i33 < size; i33++) {
                    ifgVarArr[i33] = jdeVar2.e(i33);
                }
                int[] iArr3 = new int[i21];
                int[] iArr4 = new int[i21];
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                while (i34 < i21) {
                    ArrayList arrayList3 = arrayList2;
                    int i37 = i13;
                    int i38 = iArrCopyOf[i34];
                    if (i34 < 0 || i34 >= (i5 = i32)) {
                        zwg.u("Index must be between 0 and size");
                        throw null;
                    }
                    int iG3 = iArrCopyOf2[i34];
                    kde kdeVar3 = kdeVar2;
                    if (!kdeVar3.c(i34)) {
                        iG3 = yo5.g(jA3) == Integer.MAX_VALUE ? Integer.MAX_VALUE : yo5.g(jA3) - i36;
                    }
                    kdeVar2 = kdeVar3;
                    int[] iArr5 = iArrCopyOf2;
                    int[] iArr6 = iArrCopyOf;
                    int i39 = i11;
                    int i40 = i21;
                    int i41 = i34;
                    ufd ufdVarP = xug.p(this, i37, yo5.i(jA3), yo5.h(jA3), iG3, i39, vfdVar, arrayList3, ifgVarArr, i35, i38, iArr3, i41);
                    int width = ufdVarP.getWidth();
                    int height = ufdVarP.getHeight();
                    iArr4[i41] = height;
                    i36 += height;
                    int iMax2 = Math.max(i37, width);
                    dfeVar.c(ufdVarP);
                    i34 = i41 + 1;
                    i35 = i38;
                    i32 = i5;
                    i21 = i40;
                    iArrCopyOf = iArr6;
                    i11 = i39;
                    iArrCopyOf2 = iArr5;
                    i13 = iMax2;
                    arrayList2 = arrayList3;
                }
                int i42 = i13;
                if (dfeVar.c == 0) {
                    i42 = 0;
                    i4 = 0;
                } else {
                    i4 = i36;
                }
                z62 z62Var = this.b;
                int iM = ((dfeVar.c - 1) * vfdVar.M(z62Var.b())) + i4;
                int i43 = yo5.i(jP2);
                int iG4 = yo5.g(jP2);
                if (iM < i43) {
                    iM = i43;
                }
                if (iM <= iG4) {
                    iG4 = iM;
                }
                z62Var.e(vfdVar, iG4, iArr4, iArr3);
                int iJ2 = yo5.j(jP2);
                int iH2 = yo5.h(jP2);
                if (i42 < iJ2) {
                    i42 = iJ2;
                }
                if (i42 <= iH2) {
                    iH2 = i42;
                }
                return vfdVar.b0(iH2, iG4, n08.a, new tu7(dfeVar, (byte) 12));
            }
            db9Var.getClass();
            cb9 cb9Var = cb9.a;
            cb9 cb9Var2 = cb9.a;
        }
        return vfdVar.b0(0, 0, n08.a, new d58((byte) 19));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0242 A[SYNTHETIC] */
    @Override // defpackage.mbe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(defpackage.shb r37, java.util.List r38, int r39) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb9.c(shb, java.util.List, int):int");
    }

    @Override // defpackage.mbe
    public final int d(shb shbVar, List list, int i) {
        List list2 = (List) CollectionsKt.M(1, list);
        pfd pfdVar = list2 != null ? (pfd) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.M(2, list);
        pfd pfdVar2 = list3 != null ? (pfd) CollectionsKt.firstOrNull(list3) : null;
        long jB = ap5.b(0, i, 0, 0, 13);
        db9 db9Var = this.f;
        db9Var.a(pfdVar, pfdVar2, jB);
        l08 l08Var = (List) CollectionsKt.firstOrNull(list);
        if (l08Var == null) {
            l08Var = l08.a;
        }
        return k(l08Var, i, shbVar.M(this.c), shbVar.M(this.e), db9Var);
    }

    @Override // defpackage.mbe
    public final int e(shb shbVar, List list, int i) {
        List list2 = (List) CollectionsKt.M(1, list);
        pfd pfdVar = list2 != null ? (pfd) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.M(2, list);
        pfd pfdVar2 = list3 != null ? (pfd) CollectionsKt.firstOrNull(list3) : null;
        long jB = ap5.b(0, i, 0, 0, 13);
        db9 db9Var = this.f;
        db9Var.a(pfdVar, pfdVar2, jB);
        l08 l08Var = (List) CollectionsKt.firstOrNull(list);
        if (l08Var == null) {
            l08Var = l08.a;
        }
        return k(l08Var, i, shbVar.M(this.c), shbVar.M(this.e), db9Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb9)) {
            return false;
        }
        gb9 gb9Var = (gb9) obj;
        return this.a.equals(gb9Var.a) && this.b.equals(gb9Var.b) && gh7.b(this.c, gb9Var.c) && this.d.equals(gb9Var.d) && gh7.b(this.e, gb9Var.e) && Intrinsics.a(this.f, gb9Var.f);
    }

    public final void f(int i, int[] iArr, int[] iArr2, vfd vfdVar) {
        this.a.c(vfdVar, i, iArr, vfdVar.getLayoutDirection(), iArr2);
    }

    public final ufd g(final ifg[] ifgVarArr, vfd vfdVar, final int i, final int[] iArr, int i2, final int i3, final int[] iArr2, final int i4, final int i5, final int i6) {
        final d2c d2cVar = d2c.a;
        return vfdVar.b0(i2, i3, n08.a, new Function1() { // from class: eb9
            public final Object invoke(Object obj) {
                wxe wxeVar;
                p1d p1dVar = (p1d) obj;
                int[] iArr3 = iArr2;
                int i7 = iArr3 != null ? iArr3[i4] : 0;
                int i8 = i5;
                for (int i9 = i8; i9 < i6; i9++) {
                    ifg ifgVar = ifgVarArr[i9];
                    Object objP = ifgVar.p();
                    l9i l9iVar = objP instanceof l9i ? (l9i) objP : null;
                    if (l9iVar == null || (wxeVar = l9iVar.c) == null) {
                        wxeVar = this.d;
                    }
                    p1d.f(p1dVar, ifgVar, iArr[i9 - i8], wxeVar.g(i3, ifgVar.X(), d2cVar, ifgVar, i) + i7);
                }
                return Unit.a;
            }
        });
    }

    public final int h(ifg ifgVar) {
        return ifgVar.X();
    }

    public final int hashCode() {
        return this.f.hashCode() + ((((((Float.hashCode(this.e) + ((this.d.m.hashCode() + sko.d(this.c, (this.b.hashCode() + ((this.a.hashCode() + 38161) * 31)) * 31, 31)) * 31)) * 31) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31);
    }

    public final int i(ifg ifgVar) {
        return ifgVar.Y();
    }

    public final long j(int i, int i2, int i3, boolean z) {
        o9i o9iVar = m9i.a;
        return !z ? ap5.a(i, i2, 0, i3) : vtp.F(i, i2, 0, i3);
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + gh7.c(this.c) + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + gh7.c(this.e) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f + ")";
    }
}
