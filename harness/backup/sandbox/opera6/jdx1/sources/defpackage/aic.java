package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class aic implements mbe {
    public static int f(shb shbVar, ArrayList arrayList, int i, Function2 function2) {
        int iIntValue;
        int iIntValue2;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        int iA0 = xf8.A0(i, shbVar.M(32.0f));
        pfd pfdVar = (pfd) CollectionsKt.firstOrNull(list4);
        if (pfdVar != null) {
            iIntValue = ((Number) function2.invoke(pfdVar, Integer.valueOf(iA0))).intValue();
            iA0 = xf8.A0(iA0, pfdVar.J(Integer.MAX_VALUE));
        } else {
            iIntValue = 0;
        }
        pfd pfdVar2 = (pfd) CollectionsKt.firstOrNull(list5);
        if (pfdVar2 != null) {
            iIntValue2 = ((Number) function2.invoke(pfdVar2, Integer.valueOf(iA0))).intValue();
            iA0 = xf8.A0(iA0, pfdVar2.J(Integer.MAX_VALUE));
        } else {
            iIntValue2 = 0;
        }
        pfd pfdVar3 = (pfd) CollectionsKt.firstOrNull(list2);
        int iIntValue3 = pfdVar3 != null ? ((Number) function2.invoke(pfdVar3, Integer.valueOf(iA0))).intValue() : 0;
        pfd pfdVar4 = (pfd) CollectionsKt.firstOrNull(list);
        int iIntValue4 = pfdVar4 != null ? ((Number) function2.invoke(pfdVar4, Integer.valueOf(iA0))).intValue() : 0;
        pfd pfdVar5 = (pfd) CollectionsKt.firstOrNull(list3);
        int iIntValue5 = pfdVar5 != null ? ((Number) function2.invoke(pfdVar5, Integer.valueOf(iA0))).intValue() : 0;
        boolean z = iIntValue5 > shbVar.t0(rih.p(30));
        boolean z2 = iIntValue3 > 0;
        boolean z3 = iIntValue5 > 0;
        int i2 = ((z2 && z3) || z) ? 3 : (z2 || z3) ? 2 : 1;
        return ic4.n(shbVar, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, i2, shbVar.M((i2 == 3 ? 12.0f : 8.0f) * 2.0f), ap5.b(0, 0, 0, 0, 15));
    }

    public static int g(shb shbVar, ArrayList arrayList, int i, Function2 function2) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        pfd pfdVar = (pfd) CollectionsKt.firstOrNull(list4);
        int iIntValue = pfdVar != null ? ((Number) function2.invoke(pfdVar, Integer.valueOf(i))).intValue() : 0;
        pfd pfdVar2 = (pfd) CollectionsKt.firstOrNull(list5);
        int iIntValue2 = pfdVar2 != null ? ((Number) function2.invoke(pfdVar2, Integer.valueOf(i))).intValue() : 0;
        pfd pfdVar3 = (pfd) CollectionsKt.firstOrNull(list);
        int iIntValue3 = pfdVar3 != null ? ((Number) function2.invoke(pfdVar3, Integer.valueOf(i))).intValue() : 0;
        pfd pfdVar4 = (pfd) CollectionsKt.firstOrNull(list2);
        int iIntValue4 = pfdVar4 != null ? ((Number) function2.invoke(pfdVar4, Integer.valueOf(i))).intValue() : 0;
        pfd pfdVar5 = (pfd) CollectionsKt.firstOrNull(list3);
        int iIntValue5 = pfdVar5 != null ? ((Number) function2.invoke(pfdVar5, Integer.valueOf(i))).intValue() : 0;
        int iM = shbVar.M(32.0f);
        long jB = ap5.b(0, 0, 0, 0, 15);
        return yo5.d(jB) ? yo5.h(jB) : vep.k(iM, iIntValue, Math.max(iIntValue3, Math.max(iIntValue4, iIntValue5)), iIntValue2);
    }

    @Override // defpackage.mbe
    public final int a(shb shbVar, List list, int i) {
        return g(shbVar, (ArrayList) list, i, xhc.a);
    }

    @Override // defpackage.mbe
    public final ufd b(vfd vfdVar, List list, long j) {
        float f;
        ifg ifgVarN;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        List list6 = (List) arrayList.get(4);
        long jA = yo5.a(0, 0, 0, 0, 10, j);
        int iM = vfdVar.M(32.0f);
        pfd pfdVar = (pfd) CollectionsKt.firstOrNull(list5);
        int iE = pfdVar != null ? pfdVar.E(yo5.g(j)) : 0;
        pfd pfdVar2 = (pfd) CollectionsKt.firstOrNull(list6);
        int iA0 = xf8.A0(yo5.h(jA), iE + (pfdVar2 != null ? pfdVar2.E(yo5.g(j)) : 0) + iM);
        pfd pfdVar3 = (pfd) CollectionsKt.firstOrNull(list4);
        long jI = ap5.i(-iM, -vfdVar.M(((((CollectionsKt.firstOrNull(list3) != null) && (CollectionsKt.firstOrNull(list4) != null)) || ((pfdVar3 != null ? pfdVar3.z(iA0) : 0) > vfdVar.t0(rih.p(30)))) ? 12.0f : 8.0f) * 2.0f), jA);
        pfd pfdVar4 = (pfd) CollectionsKt.firstOrNull(list5);
        ifg ifgVarN2 = pfdVar4 != null ? pfdVar4.N(jI) : null;
        int i = ifgVarN2 != null ? ifgVarN2.a : 0;
        pfd pfdVar5 = (pfd) CollectionsKt.firstOrNull(list6);
        if (pfdVar5 != null) {
            f = 2.0f;
            ifgVarN = pfdVar5.N(ap5.j(-i, 0, 2, jI));
        } else {
            f = 2.0f;
            ifgVarN = null;
        }
        int i2 = i + (ifgVarN != null ? ifgVarN.a : 0);
        pfd pfdVar6 = (pfd) CollectionsKt.firstOrNull(list2);
        ifg ifgVarN3 = pfdVar6 != null ? pfdVar6.N(ap5.j(-i2, 0, 2, jI)) : null;
        int i3 = ifgVarN3 != null ? ifgVarN3.b : 0;
        pfd pfdVar7 = (pfd) CollectionsKt.firstOrNull(list4);
        ifg ifgVarN4 = pfdVar7 != null ? pfdVar7.N(ap5.i(-i2, -i3, jI)) : null;
        int i4 = i3 + (ifgVarN4 != null ? ifgVarN4.b : 0);
        boolean z = (ifgVarN4 == null || ifgVarN4.W(vz0.a) == ifgVarN4.W(vz0.b)) ? false : true;
        pfd pfdVar8 = (pfd) CollectionsKt.firstOrNull(list3);
        ifg ifgVarN5 = pfdVar8 != null ? pfdVar8.N(ap5.i(-i2, -i4, jI)) : null;
        boolean z2 = ifgVarN5 != null;
        boolean z3 = ifgVarN4 != null;
        int i5 = ((z2 && z3) || z) ? 3 : (z2 || z3) ? 2 : 1;
        float f2 = i5 == 3 ? 12.0f : 8.0f;
        float f3 = f2 * f;
        final int iH = yo5.d(j) ? yo5.h(j) : vep.k(iM, ifgVarN2 != null ? ifgVarN2.a : 0, Math.max(ifgVarN3 != null ? ifgVarN3.a : 0, Math.max(ifgVarN5 != null ? ifgVarN5.a : 0, ifgVarN4 != null ? ifgVarN4.a : 0)), ifgVarN != null ? ifgVarN.a : 0);
        final ifg ifgVar = ifgVarN5;
        float f4 = f2;
        final int iN = ic4.n(vfdVar, ifgVarN2 != null ? ifgVarN2.b : 0, ifgVarN != null ? ifgVarN.b : 0, ifgVarN3 != null ? ifgVarN3.b : 0, ifgVarN5 != null ? ifgVarN5.b : 0, ifgVarN4 != null ? ifgVarN4.b : 0, i5, vfdVar.M(f3), j);
        final boolean z4 = i5 == 3;
        final int iM2 = vfdVar.M(16.0f);
        final int iM3 = vfdVar.M(16.0f);
        final int iM4 = vfdVar.M(f4);
        final ifg ifgVar2 = ifgVarN;
        final ifg ifgVar3 = ifgVarN3;
        final ifg ifgVar4 = ifgVarN4;
        final ifg ifgVar5 = ifgVarN2;
        return vfdVar.b0(iH, iN, n08.a, new Function1() { // from class: thc
            public final Object invoke(Object obj) {
                int iRound;
                int i6;
                p1d p1dVar = (p1d) obj;
                ifg ifgVar6 = ifgVar5;
                int i7 = iM2;
                boolean z5 = z4;
                int iRound2 = iM4;
                int i8 = iN;
                if (ifgVar6 != null) {
                    p1d.h(p1dVar, ifgVar6, i7, z5 ? iRound2 : Math.round(((i8 - ifgVar6.b) / 2.0f) * 1.0f));
                }
                int i9 = 0;
                int i10 = i7 + (ifgVar6 != null ? ifgVar6.a : 0);
                ifg ifgVar7 = ifgVar3;
                ifg ifgVar8 = ifgVar;
                ifg ifgVar9 = ifgVar4;
                if (z5) {
                    iRound = iRound2;
                } else {
                    iRound = Math.round(((i8 - (((ifgVar7 != null ? ifgVar7.b : 0) + (ifgVar8 != null ? ifgVar8.b : 0)) + (ifgVar9 != null ? ifgVar9.b : 0))) / 2.0f) * 1.0f);
                }
                if (ifgVar8 != null) {
                    p1d.h(p1dVar, ifgVar8, i10, iRound);
                    i6 = ifgVar8.b;
                } else {
                    i6 = 0;
                }
                int i11 = iRound + i6;
                if (ifgVar7 != null) {
                    p1d.h(p1dVar, ifgVar7, i10, i11);
                    i9 = ifgVar7.b;
                }
                int i12 = i11 + i9;
                if (ifgVar9 != null) {
                    p1d.h(p1dVar, ifgVar9, i10, i12);
                }
                ifg ifgVar10 = ifgVar2;
                if (ifgVar10 != null) {
                    int i13 = (iH - iM3) - ifgVar10.a;
                    if (!z5) {
                        iRound2 = Math.round(((i8 - ifgVar10.b) / 2.0f) * 1.0f);
                    }
                    p1d.h(p1dVar, ifgVar10, i13, iRound2);
                }
                return Unit.a;
            }
        });
    }

    @Override // defpackage.mbe
    public final int c(shb shbVar, List list, int i) {
        return g(shbVar, (ArrayList) list, i, zhc.a);
    }

    @Override // defpackage.mbe
    public final int d(shb shbVar, List list, int i) {
        return f(shbVar, (ArrayList) list, i, whc.a);
    }

    @Override // defpackage.mbe
    public final int e(shb shbVar, List list, int i) {
        return f(shbVar, (ArrayList) list, i, yhc.a);
    }
}
