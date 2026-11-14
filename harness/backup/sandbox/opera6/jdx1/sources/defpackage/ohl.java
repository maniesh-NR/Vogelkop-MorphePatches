package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ohl implements tfd {
    public final boolean a;
    public final mhl b;
    public final fhl c;
    public final zvf d;
    public final float e;

    public ohl(boolean z, mhl mhlVar, fhl fhlVar, zvf zvfVar, float f) {
        this.a = z;
        this.b = mhlVar;
        this.c = fhlVar;
        this.d = zvfVar;
        this.e = f;
    }

    public static int h(List list, int i, Function2 function2) throws pxb {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        List list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (Intrinsics.a(xf8.M((pfd) obj7), "TextField")) {
                int iIntValue = ((Number) function2.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (Intrinsics.a(xf8.M((pfd) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                pfd pfdVar = (pfd) obj2;
                int iIntValue2 = pfdVar != null ? ((Number) function2.invoke(pfdVar, Integer.valueOf(i))).intValue() : 0;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (Intrinsics.a(xf8.M((pfd) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                pfd pfdVar2 = (pfd) obj3;
                int iIntValue3 = pfdVar2 != null ? ((Number) function2.invoke(pfdVar2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (Intrinsics.a(xf8.M((pfd) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                pfd pfdVar3 = (pfd) obj4;
                int iIntValue4 = pfdVar3 != null ? ((Number) function2.invoke(pfdVar3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (Intrinsics.a(xf8.M((pfd) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                pfd pfdVar4 = (pfd) obj5;
                int iIntValue5 = pfdVar4 != null ? ((Number) function2.invoke(pfdVar4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list2.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (Intrinsics.a(xf8.M((pfd) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                pfd pfdVar5 = (pfd) obj6;
                int iIntValue6 = pfdVar5 != null ? ((Number) function2.invoke(pfdVar5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list2.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (Intrinsics.a(xf8.M((pfd) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                pfd pfdVar6 = (pfd) obj;
                int i9 = iIntValue4 + iIntValue5;
                return ap5.g(Math.max(iIntValue + i9, Math.max((pfdVar6 != null ? ((Number) function2.invoke(pfdVar6, Integer.valueOf(i))).intValue() : 0) + i9, iIntValue2)) + iIntValue6 + iIntValue3, ap5.b(0, 0, 0, 0, 15));
            }
        }
        tic.b("Collection contains no element matching the predicate.");
        t3p.v();
        return 0;
    }

    public static final int i(ohl ohlVar, int i, int i2, ifg ifgVar) {
        return ohlVar.a ? Math.round(((i - ifgVar.b) / 2.0f) * 1.0f) : i2;
    }

    @Override // defpackage.tfd
    public final int a(shb shbVar, List list, int i) {
        return h(list, i, new voj((byte) 23));
    }

    @Override // defpackage.tfd
    public final ufd b(final vfd vfdVar, List list, long j) throws pxb {
        Object obj;
        int i;
        int i2;
        Object obj2;
        ifg ifgVar;
        ifg ifgVarN;
        Object obj3;
        int i3;
        ifg ifgVarN2;
        ifg ifgVar2;
        Object obj4;
        int i4;
        ifg ifgVarN3;
        ifg ifgVar3;
        Object obj5;
        int i5;
        Object obj6;
        Object obj7;
        ifg ifgVar4;
        int i6;
        pqh pqhVar;
        int i7;
        int i8;
        pqh pqhVar2;
        int i9;
        ifg ifgVar5;
        int i10;
        ifg ifgVar6;
        float f;
        ifg ifgVar7;
        ifg ifgVar8;
        int i11;
        int i12;
        ifg ifgVar9;
        ifg ifgVar10;
        int i13;
        int i14;
        ohl ohlVar;
        final ifg ifgVar11;
        float fInvoke = this.c.invoke();
        zvf zvfVar = this.d;
        final int iM = vfdVar.M(zvfVar.b);
        int iM2 = vfdVar.M(zvfVar.d);
        long jA = yo5.a(0, 0, 0, 0, 10, j);
        List list2 = list;
        int size = list2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i15);
            if (Intrinsics.a(j14.R((pfd) obj), "Leading")) {
                break;
            }
            i15++;
        }
        pfd pfdVar = (pfd) obj;
        ifg ifgVarN4 = pfdVar != null ? pfdVar.N(jA) : null;
        if (ifgVarN4 != null) {
            i = ifgVarN4.a;
            i2 = ifgVarN4.b;
        } else {
            i = 0;
            i2 = 0;
        }
        int iMax = Math.max(0, i2);
        int size2 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i16);
            if (Intrinsics.a(j14.R((pfd) obj2), "Trailing")) {
                break;
            }
            i16++;
        }
        pfd pfdVar2 = (pfd) obj2;
        if (pfdVar2 != null) {
            ifgVar = ifgVarN4;
            ifgVarN = pfdVar2.N(ap5.j(-i, 0, 2, jA));
        } else {
            ifgVar = ifgVarN4;
            ifgVarN = null;
        }
        int i17 = i + (ifgVarN != null ? ifgVarN.a : 0);
        int iMax2 = Math.max(iMax, ifgVarN != null ? ifgVarN.b : 0);
        int size3 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i18);
            if (Intrinsics.a(j14.R((pfd) obj3), "Prefix")) {
                break;
            }
            i18++;
        }
        pfd pfdVar3 = (pfd) obj3;
        if (pfdVar3 != null) {
            i3 = i17;
            ifgVarN2 = pfdVar3.N(ap5.j(-i17, 0, 2, jA));
        } else {
            i3 = i17;
            ifgVarN2 = null;
        }
        int i19 = i3 + (ifgVarN2 != null ? ifgVarN2.a : 0);
        int iMax3 = Math.max(iMax2, ifgVarN2 != null ? ifgVarN2.b : 0);
        int size4 = list2.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size4) {
                ifgVar2 = ifgVarN;
                obj4 = null;
                break;
            }
            obj4 = list.get(i20);
            ifgVar2 = ifgVarN;
            if (Intrinsics.a(j14.R((pfd) obj4), "Suffix")) {
                break;
            }
            i20++;
            ifgVarN = ifgVar2;
        }
        pfd pfdVar4 = (pfd) obj4;
        if (pfdVar4 != null) {
            i4 = 0;
            ifgVarN3 = pfdVar4.N(ap5.j(-i19, 0, 2, jA));
        } else {
            i4 = 0;
            ifgVarN3 = null;
        }
        int i21 = i19 + (ifgVarN3 != null ? ifgVarN3.a : i4);
        int iMax4 = Math.max(iMax3, ifgVarN3 != null ? ifgVarN3.b : i4);
        int size5 = list2.size();
        int i22 = i4;
        while (true) {
            if (i22 >= size5) {
                ifgVar3 = ifgVarN3;
                obj5 = null;
                break;
            }
            obj5 = list.get(i22);
            ifgVar3 = ifgVarN3;
            if (Intrinsics.a(j14.R((pfd) obj5), "Label")) {
                break;
            }
            i22++;
            ifgVarN3 = ifgVar3;
        }
        pfd pfdVar5 = (pfd) obj5;
        pqh pqhVar3 = new pqh();
        int i23 = -i21;
        pqhVar3.a = pfdVar5 != null ? pfdVar5.N(ap5.i(i23, -iM2, jA)) : null;
        int size6 = list2.size();
        int i24 = 0;
        while (true) {
            if (i24 >= size6) {
                i5 = iM2;
                obj6 = null;
                break;
            }
            obj6 = list.get(i24);
            i5 = iM2;
            if (Intrinsics.a(j14.R((pfd) obj6), "Supporting")) {
                break;
            }
            i24++;
            iM2 = i5;
        }
        pfd pfdVar6 = (pfd) obj6;
        int iZ = pfdVar6 != null ? pfdVar6.z(yo5.j(j)) : 0;
        ifg ifgVar12 = (ifg) pqhVar3.a;
        int i25 = (ifgVar12 != null ? ifgVar12.b : 0) + iM;
        ifg ifgVar13 = ifgVar2;
        ifg ifgVar14 = ifgVar3;
        pfd pfdVar7 = pfdVar6;
        ifg ifgVar15 = ifgVar;
        pqh pqhVar4 = pqhVar3;
        long jI = ap5.i(i23, ((-i25) - i5) - iZ, yo5.a(0, 0, 0, 0, 11, j));
        int size7 = list2.size();
        int i26 = 0;
        while (i26 < size7) {
            pfd pfdVar8 = (pfd) list.get(i26);
            if (Intrinsics.a(j14.R(pfdVar8), "TextField")) {
                ifg ifgVarN5 = pfdVar8.N(jI);
                long jA2 = yo5.a(0, 0, 0, 0, 14, jI);
                List list3 = list;
                int size8 = list3.size();
                int i27 = 0;
                while (true) {
                    if (i27 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i27);
                    if (Intrinsics.a(j14.R((pfd) obj7), "Hint")) {
                        break;
                    }
                    i27++;
                }
                pfd pfdVar9 = (pfd) obj7;
                ifg ifgVarN6 = pfdVar9 != null ? pfdVar9.N(jA2) : null;
                int iMax5 = Math.max(iMax4, Math.max(ifgVarN5.b, ifgVarN6 != null ? ifgVarN6.b : 0) + i25 + i5);
                int i28 = ifgVar15 != null ? ifgVar15.a : 0;
                int i29 = ifgVar13 != null ? ifgVar13.a : 0;
                int i30 = ifgVarN2 != null ? ifgVarN2.a : 0;
                int i31 = ifgVar14 != null ? ifgVar14.a : 0;
                int i32 = ifgVarN5.a;
                ifg ifgVar16 = (ifg) pqhVar4.a;
                int i33 = i30 + i31;
                int iG = ap5.g(Math.max(i32 + i33, Math.max((ifgVarN6 != null ? ifgVarN6.a : 0) + i33, ifgVar16 != null ? ifgVar16.a : 0)) + i28 + i29, j);
                ifg ifgVarN7 = pfdVar7 != null ? pfdVar7.N(yo5.a(0, iG, 0, 0, 9, ap5.j(0, -iMax5, 1, jA))) : null;
                int i34 = ifgVarN7 != null ? ifgVarN7.b : 0;
                int i35 = ifgVarN5.b;
                ifg ifgVar17 = (ifg) pqhVar4.a;
                if (ifgVar17 != null) {
                    ifgVar4 = ifgVarN5;
                    i6 = ifgVar17.b;
                } else {
                    ifgVar4 = ifgVarN5;
                    i6 = 0;
                }
                if (ifgVar15 != null) {
                    pqhVar = pqhVar4;
                    i7 = i35;
                    i8 = ifgVar15.b;
                } else {
                    pqhVar = pqhVar4;
                    i7 = i35;
                    i8 = 0;
                }
                int i36 = ifgVar13 != null ? ifgVar13.b : 0;
                int i37 = ifgVarN2 != null ? ifgVarN2.b : 0;
                final ifg ifgVar18 = ifgVarN2;
                if (ifgVar14 != null) {
                    pqh pqhVar5 = pqhVar;
                    i9 = ifgVar14.b;
                    pqhVar2 = pqhVar5;
                } else {
                    pqhVar2 = pqhVar;
                    i9 = 0;
                }
                final pqh pqhVar6 = pqhVar2;
                if (ifgVarN6 != null) {
                    ifg ifgVar19 = ifgVar4;
                    i10 = ifgVarN6.b;
                    ifgVar5 = ifgVar19;
                } else {
                    ifgVar5 = ifgVar4;
                    i10 = 0;
                }
                if (ifgVarN7 != null) {
                    ifgVar7 = ifgVar5;
                    ifgVar6 = ifgVar14;
                    f = fInvoke;
                    ifgVar8 = ifgVarN6;
                    i11 = i36;
                    i12 = ifgVarN7.b;
                    ifgVar9 = ifgVar15;
                    ifgVar10 = ifgVar13;
                    i13 = iG;
                    i14 = 0;
                    ifgVar11 = ifgVarN7;
                    ohlVar = this;
                } else {
                    ifgVar6 = ifgVar14;
                    f = fInvoke;
                    ifgVar7 = ifgVar5;
                    ifgVar8 = ifgVarN6;
                    i11 = i36;
                    i12 = 0;
                    ifgVar9 = ifgVar15;
                    ifgVar10 = ifgVar13;
                    i13 = iG;
                    i14 = 0;
                    ohlVar = this;
                    ifgVar11 = ifgVarN7;
                }
                final int iF = ohlVar.f(vfdVar, i7, i6, i8, i11, i37, i9, i10, i12, j, f);
                final int i38 = iF - i34;
                int size9 = list3.size();
                for (int i39 = i14; i39 < size9; i39++) {
                    pfd pfdVar10 = (pfd) list.get(i39);
                    if (Intrinsics.a(j14.R(pfdVar10), "Container")) {
                        final ifg ifgVarN8 = pfdVar10.N(ap5.a(i13 != Integer.MAX_VALUE ? i13 : i14, i13, i38 != Integer.MAX_VALUE ? i38 : i14, i38));
                        final int i40 = i13;
                        final float f2 = f;
                        final ifg ifgVar20 = ifgVar6;
                        final ifg ifgVar21 = ifgVar8;
                        final ifg ifgVar22 = ifgVar7;
                        final ifg ifgVar23 = ifgVar9;
                        final ifg ifgVar24 = ifgVar10;
                        return vfdVar.b0(i40, iF, n08.a, new Function1() { // from class: nhl
                            /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
                            /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
                            /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
                            /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
                            /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
                            /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
                            /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
                            /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
                            /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
                            /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
                            /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
                            /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
                            /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
                            /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
                            /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
                            /* JADX WARN: Removed duplicated region for block: B:55:0x010f  */
                            /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
                            /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
                            /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
                            /* JADX WARN: Removed duplicated region for block: B:63:0x0121  */
                            /* JADX WARN: Removed duplicated region for block: B:68:0x0131  */
                            /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r22) {
                                /*
                                    Method dump skipped, instructions count: 481
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.nhl.invoke(java.lang.Object):java.lang.Object");
                            }
                        });
                    }
                }
                tic.b("Collection contains no element matching the predicate.");
                t3p.v();
                return null;
            }
            i26++;
            pfdVar7 = pfdVar7;
            ifgVarN2 = ifgVarN2;
            ifgVar14 = ifgVar14;
            pqhVar4 = pqhVar4;
            jI = jI;
        }
        tic.b("Collection contains no element matching the predicate.");
        t3p.v();
        return null;
    }

    @Override // defpackage.tfd
    public final int c(shb shbVar, List list, int i) {
        return h(list, i, new voj((byte) 22));
    }

    @Override // defpackage.tfd
    public final int d(shb shbVar, List list, int i) {
        return g(shbVar, list, i, new voj((byte) 25));
    }

    @Override // defpackage.tfd
    public final int e(shb shbVar, List list, int i) {
        return g(shbVar, list, i, new voj((byte) 24));
    }

    public final int f(n27 n27Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        zvf zvfVar = this.d;
        int iM = n27Var.M(zvfVar.d + zvfVar.b);
        int[] iArr = {i7, i5, i6, yi4.H(f, i2, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i = Math.max(i, iArr[i9]);
        }
        return ap5.f(Math.max(i3, Math.max(i4, iM + (i2 > 0 ? Math.max(n27Var.M(this.e * 2.0f), yi4.H(mae.a.c(f), 0, i2)) : 0) + i)) + i8, j);
    }

    public final int g(shb shbVar, List list, int i, Function2 function2) throws pxb {
        Object obj;
        int i2;
        int iA0;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i3;
        Object obj5;
        int i4;
        Object obj6;
        Object obj7;
        List list2 = list;
        int size = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (Intrinsics.a(xf8.M((pfd) obj), "Leading")) {
                break;
            }
            i5++;
        }
        pfd pfdVar = (pfd) obj;
        if (pfdVar != null) {
            i2 = i;
            iA0 = xf8.A0(i2, pfdVar.J(Integer.MAX_VALUE));
            iIntValue = ((Number) function2.invoke(pfdVar, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            iA0 = i2;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (Intrinsics.a(xf8.M((pfd) obj2), "Trailing")) {
                break;
            }
            i6++;
        }
        pfd pfdVar2 = (pfd) obj2;
        if (pfdVar2 != null) {
            iA0 = xf8.A0(iA0, pfdVar2.J(Integer.MAX_VALUE));
            iIntValue2 = ((Number) function2.invoke(pfdVar2, Integer.valueOf(i2))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i7);
            if (Intrinsics.a(xf8.M((pfd) obj3), "Label")) {
                break;
            }
            i7++;
        }
        pfd pfdVar3 = (pfd) obj3;
        int iIntValue3 = pfdVar3 != null ? ((Number) function2.invoke(pfdVar3, Integer.valueOf(iA0))).intValue() : 0;
        int size4 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i8);
            if (Intrinsics.a(xf8.M((pfd) obj4), "Prefix")) {
                break;
            }
            i8++;
        }
        pfd pfdVar4 = (pfd) obj4;
        if (pfdVar4 != null) {
            int iIntValue4 = ((Number) function2.invoke(pfdVar4, Integer.valueOf(iA0))).intValue();
            iA0 = xf8.A0(iA0, pfdVar4.J(Integer.MAX_VALUE));
            i3 = iIntValue4;
        } else {
            i3 = 0;
        }
        int size5 = list2.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i9);
            if (Intrinsics.a(xf8.M((pfd) obj5), "Suffix")) {
                break;
            }
            i9++;
        }
        pfd pfdVar5 = (pfd) obj5;
        if (pfdVar5 != null) {
            int iIntValue5 = ((Number) function2.invoke(pfdVar5, Integer.valueOf(iA0))).intValue();
            iA0 = xf8.A0(iA0, pfdVar5.J(Integer.MAX_VALUE));
            i4 = iIntValue5;
        } else {
            i4 = 0;
        }
        int size6 = list2.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj8 = list.get(i10);
            if (Intrinsics.a(xf8.M((pfd) obj8), "TextField")) {
                int iIntValue6 = ((Number) function2.invoke(obj8, Integer.valueOf(iA0))).intValue();
                int size7 = list2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i11);
                    if (Intrinsics.a(xf8.M((pfd) obj6), "Hint")) {
                        break;
                    }
                    i11++;
                }
                pfd pfdVar6 = (pfd) obj6;
                int iIntValue7 = pfdVar6 != null ? ((Number) function2.invoke(pfdVar6, Integer.valueOf(iA0))).intValue() : 0;
                int size8 = list2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj9 = list.get(i12);
                    if (Intrinsics.a(xf8.M((pfd) obj9), "Supporting")) {
                        obj7 = obj9;
                        break;
                    }
                    i12++;
                }
                pfd pfdVar7 = (pfd) obj7;
                return f(shbVar, iIntValue6, iIntValue3, iIntValue, iIntValue2, i3, i4, iIntValue7, pfdVar7 != null ? ((Number) function2.invoke(pfdVar7, Integer.valueOf(i2))).intValue() : 0, ap5.b(0, 0, 0, 0, 15), this.c.invoke());
            }
        }
        tic.b("Collection contains no element matching the predicate.");
        t3p.v();
        return 0;
    }
}
