package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ztf implements tfd {
    public final Function1 a;
    public final boolean b;
    public final mhl c;
    public final fhl d;
    public final zvf e;
    public final float f;

    public ztf(Function1 function1, boolean z, mhl mhlVar, fhl fhlVar, zvf zvfVar, float f) {
        this.a = function1;
        this.b = z;
        this.c = mhlVar;
        this.d = fhlVar;
        this.e = zvfVar;
        this.f = f;
    }

    public static final int j(int i, ztf ztfVar, int i2, int i3, ifg ifgVar, ifg ifgVar2) {
        if (ztfVar.b) {
            i3 = Math.round(((i2 - ifgVar2.b) / 2.0f) * 1.0f);
        }
        return Math.max(i + i3, (ifgVar != null ? ifgVar.b : 0) / 2);
    }

    @Override // defpackage.tfd
    public final int a(shb shbVar, List list, int i) {
        return i(shbVar, list, i, new nf8((byte) 25));
    }

    @Override // defpackage.tfd
    public final ufd b(final vfd vfdVar, List list, long j) throws pxb {
        Object obj;
        int i;
        int i2;
        List list2;
        Object obj2;
        ifg ifgVar;
        int i3;
        ifg ifgVarN;
        Object obj3;
        ifg ifgVar2;
        ifg ifgVarN2;
        Object obj4;
        int i4;
        ifg ifgVarN3;
        Object obj5;
        long jFloatToRawIntBits;
        Object obj6;
        Object obj7;
        ifg ifgVar3;
        int i5;
        ifg ifgVar4;
        int i6;
        ifg ifgVar5;
        int i7;
        pqh pqhVar;
        int i8;
        vfd vfdVar2;
        ifg ifgVar6;
        int i9;
        ifg ifgVar7;
        ifg ifgVar8;
        ztf ztfVar;
        ifg ifgVar9;
        pfd pfdVar;
        ifg ifgVar10;
        int i10;
        int i11;
        ifg ifgVar11;
        ifg ifgVar12;
        int i12;
        pqh pqhVar2;
        int i13;
        int i14;
        ztf ztfVar2;
        vfd vfdVar3;
        float f;
        List list3 = list;
        float fInvoke = this.d.invoke();
        zvf zvfVar = this.e;
        int iM = vfdVar.M(zvfVar.d);
        long jA = yo5.a(0, 0, 0, 0, 10, j);
        List list4 = list3;
        int size = list4.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                obj = null;
                break;
            }
            obj = list3.get(i15);
            if (Intrinsics.a(j14.R((pfd) obj), "Leading")) {
                break;
            }
            i15++;
        }
        pfd pfdVar2 = (pfd) obj;
        ifg ifgVarN4 = pfdVar2 != null ? pfdVar2.N(jA) : null;
        if (ifgVarN4 != null) {
            i = ifgVarN4.a;
            i2 = ifgVarN4.b;
        } else {
            i = 0;
            i2 = 0;
        }
        int iMax = Math.max(0, i2);
        int size2 = list4.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size2) {
                list2 = list4;
                obj2 = null;
                break;
            }
            obj2 = list3.get(i16);
            list2 = list4;
            if (Intrinsics.a(j14.R((pfd) obj2), "Trailing")) {
                break;
            }
            i16++;
            list4 = list2;
        }
        pfd pfdVar3 = (pfd) obj2;
        if (pfdVar3 != null) {
            ifgVar = ifgVarN4;
            i3 = i;
            ifgVarN = pfdVar3.N(ap5.j(-i, 0, 2, jA));
        } else {
            ifgVar = ifgVarN4;
            i3 = i;
            ifgVarN = null;
        }
        int i17 = i3 + (ifgVarN != null ? ifgVarN.a : 0);
        int iMax2 = Math.max(iMax, ifgVarN != null ? ifgVarN.b : 0);
        int size3 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list3.get(i18);
            int i19 = size3;
            if (Intrinsics.a(j14.R((pfd) obj3), "Prefix")) {
                break;
            }
            i18++;
            size3 = i19;
        }
        pfd pfdVar4 = (pfd) obj3;
        if (pfdVar4 != null) {
            ifgVar2 = ifgVarN;
            ifgVarN2 = pfdVar4.N(ap5.j(-i17, 0, 2, jA));
        } else {
            ifgVar2 = ifgVarN;
            ifgVarN2 = null;
        }
        int i20 = i17 + (ifgVarN2 != null ? ifgVarN2.a : 0);
        int iMax3 = Math.max(iMax2, ifgVarN2 != null ? ifgVarN2.b : 0);
        int size4 = list2.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list3.get(i21);
            int i22 = size4;
            if (Intrinsics.a(j14.R((pfd) obj4), "Suffix")) {
                break;
            }
            i21++;
            size4 = i22;
        }
        pfd pfdVar5 = (pfd) obj4;
        if (pfdVar5 != null) {
            i4 = i20;
            ifgVarN3 = pfdVar5.N(ap5.j(-i20, 0, 2, jA));
        } else {
            i4 = i20;
            ifgVarN3 = null;
        }
        int i23 = i4 + (ifgVarN3 != null ? ifgVarN3.a : 0);
        int iMax4 = Math.max(iMax3, ifgVarN3 != null ? ifgVarN3.b : 0);
        int size5 = list2.size();
        int i24 = 0;
        while (true) {
            if (i24 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list3.get(i24);
            int i25 = size5;
            int i26 = i24;
            if (Intrinsics.a(j14.R((pfd) obj5), "Label")) {
                break;
            }
            i24 = i26 + 1;
            size5 = i25;
        }
        pfd pfdVar6 = (pfd) obj5;
        pqh pqhVar3 = new pqh();
        int iM2 = vfdVar.M(zvfVar.c(vfdVar.getLayoutDirection())) + vfdVar.M(zvfVar.b(vfdVar.getLayoutDirection()));
        ifg ifgVar13 = ifgVar;
        int i27 = -iM;
        ifg ifgVar14 = ifgVarN2;
        ifg ifgVarN5 = pfdVar6 != null ? pfdVar6.N(ap5.i(-yi4.H(fInvoke, i23 + iM2, iM2), i27, jA)) : null;
        pqhVar3.a = ifgVarN5;
        if (ifgVarN5 != null) {
            jFloatToRawIntBits = (Float.floatToRawIntBits(ifgVarN5.a) << 32) | (Float.floatToRawIntBits(ifgVarN5.b) & 4294967295L);
        } else {
            jFloatToRawIntBits = 0;
        }
        this.a.invoke(new bpj(jFloatToRawIntBits));
        int size6 = list2.size();
        int i28 = 0;
        while (true) {
            if (i28 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list3.get(i28);
            if (Intrinsics.a(j14.R((pfd) obj6), "Supporting")) {
                break;
            }
            i28++;
        }
        pfd pfdVar7 = (pfd) obj6;
        int iZ = pfdVar7 != null ? pfdVar7.z(yo5.j(j)) : 0;
        ifg ifgVar15 = (ifg) pqhVar3.a;
        int iMax5 = Math.max((ifgVar15 != null ? ifgVar15.b : 0) / 2, vfdVar.M(zvfVar.b));
        int i29 = (i27 - iMax5) - iZ;
        long j2 = j;
        long jA2 = yo5.a(0, 0, 0, 0, 11, ap5.i(-i23, i29, j2));
        int size7 = list2.size();
        int i30 = 0;
        while (i30 < size7) {
            pfd pfdVar8 = pfdVar7;
            pfd pfdVar9 = (pfd) list3.get(i30);
            int i31 = iMax5;
            if (Intrinsics.a(j14.R(pfdVar9), "TextField")) {
                ifg ifgVarN6 = pfdVar9.N(jA2);
                long jA3 = yo5.a(0, 0, 0, 0, 14, jA2);
                List list5 = list3;
                int size8 = list5.size();
                int i32 = 0;
                while (true) {
                    if (i32 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list3.get(i32);
                    int i33 = size8;
                    if (Intrinsics.a(j14.R((pfd) obj7), "Hint")) {
                        break;
                    }
                    i32++;
                    size8 = i33;
                }
                pfd pfdVar10 = (pfd) obj7;
                ifg ifgVarN7 = pfdVar10 != null ? pfdVar10.N(jA3) : null;
                int iMax6 = Math.max(iMax4, Math.max(ifgVarN6.b, ifgVarN7 != null ? ifgVarN7.b : 0) + i31 + iM);
                int i34 = ifgVar13 != null ? ifgVar13.a : 0;
                ifg ifgVar16 = ifgVar2;
                int i35 = ifgVar2 != null ? ifgVar16.a : 0;
                if (ifgVar14 != null) {
                    ifgVar3 = ifgVar13;
                    i5 = ifgVar14.a;
                } else {
                    ifgVar3 = ifgVar13;
                    i5 = 0;
                }
                if (ifgVarN3 != null) {
                    i6 = ifgVarN3.a;
                    ifgVar4 = ifgVar16;
                } else {
                    ifgVar4 = ifgVar16;
                    i6 = 0;
                }
                ifg ifgVar17 = ifgVarN3;
                int i36 = ifgVarN6.a;
                ifg ifgVar18 = ifgVar4;
                ifg ifgVar19 = (ifg) pqhVar3.a;
                if (ifgVar19 != null) {
                    ifgVar5 = ifgVar14;
                    i7 = ifgVar19.a;
                } else {
                    ifgVar5 = ifgVar14;
                    i7 = 0;
                }
                if (ifgVarN7 != null) {
                    pqhVar = pqhVar3;
                    i8 = ifgVarN7.a;
                    ifgVar6 = ifgVarN7;
                    i9 = iMax6;
                    ifgVar7 = ifgVar17;
                    ifgVar8 = ifgVar5;
                    ztfVar = this;
                    ifgVar9 = ifgVarN6;
                    pfdVar = pfdVar8;
                    vfdVar2 = vfdVar;
                } else {
                    pqhVar = pqhVar3;
                    i8 = 0;
                    vfdVar2 = vfdVar;
                    ifgVar6 = ifgVarN7;
                    i9 = iMax6;
                    ifgVar7 = ifgVar17;
                    ifgVar8 = ifgVar5;
                    ztfVar = this;
                    ifgVar9 = ifgVarN6;
                    pfdVar = pfdVar8;
                }
                int iG = ztfVar.g(vfdVar2, i34, i35, i5, i6, i36, i7, i8, j2, fInvoke);
                long jA4 = yo5.a(0, iG, 0, 0, 9, ap5.j(0, -i9, 1, jA));
                int i37 = iG;
                ifg ifgVarN8 = pfdVar != null ? pfdVar.N(jA4) : null;
                int i38 = ifgVarN8 != null ? ifgVarN8.b : 0;
                final ifg ifgVar20 = ifgVar3;
                int i39 = ifgVar3 != null ? ifgVar20.b : 0;
                int i40 = ifgVar18 != null ? ifgVar18.b : 0;
                ifg ifgVar21 = ifgVar8;
                int i41 = ifgVar21 != null ? ifgVar21.b : 0;
                final ifg ifgVar22 = ifgVar7;
                int i42 = ifgVar22 != null ? ifgVar22.b : 0;
                ifg ifgVar23 = ifgVar9;
                int i43 = ifgVar23.b;
                pqh pqhVar4 = pqhVar;
                ifg ifgVar24 = (ifg) pqhVar4.a;
                int i44 = ifgVar24 != null ? ifgVar24.b : 0;
                int i45 = i38;
                final ifg ifgVar25 = ifgVar6;
                int i46 = ifgVar25 != null ? ifgVar25.b : 0;
                if (ifgVarN8 != null) {
                    ifgVar10 = ifgVar23;
                    i10 = i46;
                    i11 = ifgVarN8.b;
                    ifgVar11 = ifgVar21;
                    ifgVar12 = ifgVar18;
                    i12 = i42;
                    pqhVar2 = pqhVar4;
                    i13 = i44;
                    i14 = 0;
                    vfdVar3 = vfdVar;
                    f = fInvoke;
                    ztfVar2 = this;
                } else {
                    ifgVar10 = ifgVar23;
                    i10 = i46;
                    i11 = 0;
                    ifgVar11 = ifgVar21;
                    ifgVar12 = ifgVar18;
                    i12 = i42;
                    pqhVar2 = pqhVar4;
                    i13 = i44;
                    i14 = 0;
                    ztfVar2 = this;
                    vfdVar3 = vfdVar;
                    f = fInvoke;
                }
                final int iF = ztfVar2.f(vfdVar3, i39, i40, i41, i12, i43, i13, i10, i11, j, f);
                final float f2 = f;
                int i47 = iF - i45;
                int size9 = list5.size();
                int i48 = i14;
                while (i48 < size9) {
                    pfd pfdVar11 = (pfd) list.get(i48);
                    if (Intrinsics.a(j14.R(pfdVar11), "Container")) {
                        final ifg ifgVarN9 = pfdVar11.N(ap5.a(i37 != Integer.MAX_VALUE ? i37 : i14, i37, i47 != Integer.MAX_VALUE ? i47 : i14, i47));
                        final ifg ifgVar26 = ifgVarN8;
                        final int i49 = i37;
                        final ifg ifgVar27 = ifgVar12;
                        final ifg ifgVar28 = ifgVar11;
                        final ifg ifgVar29 = ifgVar10;
                        final pqh pqhVar5 = pqhVar2;
                        return vfdVar.b0(i49, iF, n08.a, new Function1() { // from class: ytf
                            public final Object invoke(Object obj8) {
                                int i50;
                                ztf ztfVar3;
                                int i51;
                                int i52;
                                ztf ztfVar4;
                                int i53;
                                float f3;
                                float f4;
                                float f5;
                                float f6;
                                float f7;
                                p1d p1dVar = (p1d) obj8;
                                ifg ifgVar30 = (ifg) pqhVar5.a;
                                vfd vfdVar4 = vfdVar;
                                float fB = vfdVar4.b();
                                d2c layoutDirection = vfdVar4.getLayoutDirection();
                                ztf ztfVar5 = this.a;
                                float fO0 = vfdVar4.o0(ztfVar5.f);
                                mhl mhlVar = ztfVar5.c;
                                zvf zvfVar2 = ztfVar5.e;
                                p1d.f(p1dVar, ifgVarN9, 0, 0);
                                ifg ifgVar31 = ifgVar26;
                                int i54 = iF - (ifgVar31 != null ? ifgVar31.b : 0);
                                int iB = zed.b(zvfVar2.b * fB);
                                ifg ifgVar32 = ifgVar20;
                                if (ifgVar32 != null) {
                                    p1d.h(p1dVar, ifgVar32, 0, Math.round(((i54 - ifgVar32.b) / 2.0f) * 1.0f));
                                }
                                int i55 = i49;
                                ifg ifgVar33 = ifgVar27;
                                if (ifgVar30 != null) {
                                    int iRound = ztfVar5.b ? Math.round(((i54 - ifgVar30.b) / 2.0f) * 1.0f) : iB;
                                    int i56 = -(ifgVar30.b / 2);
                                    i50 = i55;
                                    float f8 = f2;
                                    int iH = yi4.H(f8, iRound, i56);
                                    float fQ = a26.q(zvfVar2, layoutDirection) * fB;
                                    float fP = a26.p(zvfVar2, layoutDirection) * fB;
                                    if (ifgVar32 == null) {
                                        f4 = fQ;
                                        f3 = 0.0f;
                                    } else {
                                        f3 = 0.0f;
                                        float f9 = ifgVar32.a;
                                        float f10 = fQ - fO0;
                                        if (f10 < 0.0f) {
                                            f10 = 0.0f;
                                        }
                                        f4 = f9 + f10;
                                    }
                                    ztfVar3 = ztfVar5;
                                    if (ifgVar33 == null) {
                                        f5 = fP;
                                    } else {
                                        float f11 = ifgVar33.a;
                                        float f12 = fP - fO0;
                                        if (f12 < f3) {
                                            f12 = f3;
                                        }
                                        f5 = f11 + f12;
                                    }
                                    if (layoutDirection == d2c.a) {
                                        f6 = fQ;
                                        f7 = f4;
                                    } else {
                                        f6 = fP;
                                        f7 = f5;
                                    }
                                    float fRound = Math.round((1.0f + (layoutDirection == d2c.a ? -1.0f : (-1.0f) * (-1.0f))) * (((i50 - zed.b(f4 + f5)) - ifgVar30.a) / 2.0f)) + f7;
                                    hn9.k(mhlVar);
                                    p1d.f(p1dVar, ifgVar30, zed.b(yi4.G(fRound, Math.round((1.0f + (layoutDirection != d2c.a ? (-1.0f) * (-1.0f) : -1.0f)) * (((i50 - zed.b(fQ + fP)) - ifgVar30.a) / 2.0f)) + f6, f8)), iH);
                                } else {
                                    i50 = i55;
                                    ztfVar3 = ztfVar5;
                                }
                                ifg ifgVar34 = ifgVar28;
                                if (ifgVar34 != null) {
                                    i51 = iB;
                                    i52 = i54;
                                    ztfVar4 = ztfVar3;
                                    i53 = 0;
                                    p1d.h(p1dVar, ifgVar34, ifgVar32 != null ? ifgVar32.a : 0, ztf.j(0, ztfVar4, i52, i51, ifgVar30, ifgVar34));
                                } else {
                                    i51 = iB;
                                    i52 = i54;
                                    ztfVar4 = ztfVar3;
                                    i53 = 0;
                                }
                                int i57 = (ifgVar32 != null ? ifgVar32.a : 0) + (ifgVar34 != null ? ifgVar34.a : 0);
                                ifg ifgVar35 = ifgVar29;
                                p1d.h(p1dVar, ifgVar35, i57, ztf.j(i53, ztfVar4, i52, i51, ifgVar30, ifgVar35));
                                ifg ifgVar36 = ifgVar25;
                                if (ifgVar36 != null) {
                                    p1d.h(p1dVar, ifgVar36, i57, ztf.j(i53, ztfVar4, i52, i51, ifgVar30, ifgVar36));
                                }
                                ifg ifgVar37 = ifgVar22;
                                if (ifgVar37 != null) {
                                    p1d.h(p1dVar, ifgVar37, (i50 - (ifgVar33 != null ? ifgVar33.a : 0)) - ifgVar37.a, ztf.j(i53, ztfVar4, i52, i51, ifgVar30, ifgVar37));
                                }
                                if (ifgVar33 != null) {
                                    p1d.h(p1dVar, ifgVar33, i50 - ifgVar33.a, Math.round(((i52 - ifgVar33.b) / 2.0f) * 1.0f));
                                }
                                if (ifgVar31 != null) {
                                    p1d.h(p1dVar, ifgVar31, 0, i52);
                                }
                                return Unit.a;
                            }
                        });
                    }
                    i48++;
                    i37 = i37;
                    iF = iF;
                }
                tic.b("Collection contains no element matching the predicate.");
                t3p.v();
                return null;
            }
            i30++;
            pfdVar7 = pfdVar8;
            j2 = j;
            ifgVar2 = ifgVar2;
            iMax5 = i31;
            ifgVarN3 = ifgVarN3;
            list3 = list3;
            jA2 = jA2;
        }
        tic.b("Collection contains no element matching the predicate.");
        t3p.v();
        return null;
    }

    @Override // defpackage.tfd
    public final int c(shb shbVar, List list, int i) {
        return i(shbVar, list, i, new nf8((byte) 27));
    }

    @Override // defpackage.tfd
    public final int d(shb shbVar, List list, int i) {
        return h(shbVar, list, i, new nf8((byte) 26));
    }

    @Override // defpackage.tfd
    public final int e(shb shbVar, List list, int i) {
        return h(shbVar, list, i, new nf8((byte) 24));
    }

    public final int f(n27 n27Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int[] iArr = {i7, i3, i4, yi4.H(f, i6, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        zvf zvfVar = this.e;
        float fO0 = n27Var.o0(zvfVar.b);
        return ap5.f(Math.max(i, Math.max(i2, zed.b(yi4.G(fO0, Math.max(fO0, i6 / 2.0f), f) + i5 + n27Var.o0(zvfVar.d)))) + i8, j);
    }

    public final int g(n27 n27Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, yi4.H(f, i6, 0))) + i + i2;
        d2c d2cVar = d2c.a;
        zvf zvfVar = this.e;
        return ap5.g(Math.max(iMax, zed.b((i6 + n27Var.o0(zvfVar.c(d2cVar) + zvfVar.b(d2cVar))) * f)), j);
    }

    public final int h(shb shbVar, List list, int i, Function2 function2) throws pxb {
        Object obj;
        int iA0;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        int i2;
        Object obj6;
        Object obj7;
        ztf ztfVar = this;
        float fInvoke = ztfVar.d.invoke();
        List list2 = list;
        int size = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i3);
            if (Intrinsics.a(xf8.M((pfd) obj), "Leading")) {
                break;
            }
            i3++;
        }
        pfd pfdVar = (pfd) obj;
        if (pfdVar != null) {
            iA0 = xf8.A0(i, pfdVar.J(Integer.MAX_VALUE));
            iIntValue = ((Number) function2.invoke(pfdVar, Integer.valueOf(i))).intValue();
        } else {
            iA0 = i;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (Intrinsics.a(xf8.M((pfd) obj2), "Trailing")) {
                break;
            }
            i4++;
        }
        pfd pfdVar2 = (pfd) obj2;
        if (pfdVar2 != null) {
            iA0 = xf8.A0(iA0, pfdVar2.J(Integer.MAX_VALUE));
            iIntValue2 = ((Number) function2.invoke(pfdVar2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i5);
            if (Intrinsics.a(xf8.M((pfd) obj3), "Label")) {
                break;
            }
            i5++;
        }
        pfd pfdVar3 = (pfd) obj3;
        int iIntValue5 = pfdVar3 != null ? ((Number) function2.invoke(pfdVar3, Integer.valueOf(yi4.H(fInvoke, iA0, i)))).intValue() : 0;
        int size4 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i6);
            if (Intrinsics.a(xf8.M((pfd) obj4), "Prefix")) {
                break;
            }
            i6++;
        }
        pfd pfdVar4 = (pfd) obj4;
        if (pfdVar4 != null) {
            iIntValue3 = ((Number) function2.invoke(pfdVar4, Integer.valueOf(iA0))).intValue();
            iA0 = xf8.A0(iA0, pfdVar4.J(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i7);
            if (Intrinsics.a(xf8.M((pfd) obj5), "Suffix")) {
                break;
            }
            i7++;
        }
        pfd pfdVar5 = (pfd) obj5;
        if (pfdVar5 != null) {
            iIntValue4 = ((Number) function2.invoke(pfdVar5, Integer.valueOf(iA0))).intValue();
            iA0 = xf8.A0(iA0, pfdVar5.J(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list2.size();
        int i8 = 0;
        while (i8 < size6) {
            Object obj8 = list.get(i8);
            if (Intrinsics.a(xf8.M((pfd) obj8), "TextField")) {
                int iIntValue6 = ((Number) function2.invoke(obj8, Integer.valueOf(iA0))).intValue();
                int size7 = list2.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        i2 = iIntValue6;
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i9);
                    i2 = iIntValue6;
                    if (Intrinsics.a(xf8.M((pfd) obj6), "Hint")) {
                        break;
                    }
                    i9++;
                    iIntValue6 = i2;
                }
                pfd pfdVar6 = (pfd) obj6;
                int iIntValue7 = pfdVar6 != null ? ((Number) function2.invoke(pfdVar6, Integer.valueOf(iA0))).intValue() : 0;
                int size8 = list2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i10);
                    if (Intrinsics.a(xf8.M((pfd) obj7), "Supporting")) {
                        break;
                    }
                    i10++;
                }
                pfd pfdVar7 = (pfd) obj7;
                return ztfVar.f(shbVar, iIntValue, iIntValue2, iIntValue3, iIntValue4, i2, iIntValue5, iIntValue7, pfdVar7 != null ? ((Number) function2.invoke(pfdVar7, Integer.valueOf(i))).intValue() : 0, ap5.b(0, 0, 0, 0, 15), fInvoke);
            }
            i8++;
            iIntValue3 = iIntValue3;
            ztfVar = this;
        }
        tic.b("Collection contains no element matching the predicate.");
        t3p.v();
        return 0;
    }

    public final int i(shb shbVar, List list, int i, Function2 function2) throws pxb {
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
                    if (Intrinsics.a(xf8.M((pfd) obj4), "Leading")) {
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
                    if (Intrinsics.a(xf8.M((pfd) obj5), "Prefix")) {
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
                    if (Intrinsics.a(xf8.M((pfd) obj6), "Suffix")) {
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
                return g(shbVar, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, pfdVar6 != null ? ((Number) function2.invoke(pfdVar6, Integer.valueOf(i))).intValue() : 0, ap5.b(0, 0, 0, 0, 15), this.d.invoke());
            }
        }
        tic.b("Collection contains no element matching the predicate.");
        t3p.v();
        return 0;
    }
}
