package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;

/* loaded from: classes.dex */
public final class ixf implements m5c {
    public final /* synthetic */ gu6 a;
    public final /* synthetic */ zvf b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ydp d;
    public final /* synthetic */ vtb e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ sd3 g;
    public final /* synthetic */ n9a h;
    public final /* synthetic */ nx5 i;

    public ixf(gu6 gu6Var, zvf zvfVar, float f, ydp ydpVar, vtb vtbVar, Function0 function0, sd3 sd3Var, n9a n9aVar, nx5 nx5Var) {
        fsf fsfVar = fsf.a;
        this.a = gu6Var;
        this.b = zvfVar;
        this.c = f;
        this.d = ydpVar;
        this.e = vtbVar;
        this.f = function0;
        this.g = sd3Var;
        this.h = n9aVar;
        this.i = nx5Var;
    }

    public final ufd a(n5c n5cVar, long j) throws pxb {
        int i;
        sd3 sd3Var;
        int i2;
        int i3;
        int i4;
        int i5;
        long j2;
        int i6;
        int i7;
        sd3 sd3Var2;
        int i8;
        int i9;
        int i10;
        sd3 sd3Var3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        sd3 sd3Var4;
        int i16;
        int i17;
        i72 i72Var;
        int i18;
        int i19;
        wfd wfdVar;
        ArrayList arrayList;
        int i20;
        ArrayList arrayList2;
        int i21;
        int i22;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i23;
        boolean z;
        ikk ikkVar;
        fsf fsfVar;
        i72 i72Var2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        l08 arrayList7;
        l08 arrayList8;
        Object obj;
        jxf jxfVar;
        gu6 gu6Var;
        boolean z2;
        ikk ikkVar2;
        n5c n5cVar2;
        sd3 sd3Var5;
        int i24;
        ArrayList arrayList9;
        fsf fsfVar2;
        long j3;
        int i25;
        int i26;
        int i27;
        ide ideVar;
        int i28;
        ixf ixfVar = this;
        gu6 gu6Var2 = ixfVar.a;
        gu6Var2.A.getValue();
        fsf fsfVar3 = fsf.b;
        fsf fsfVar4 = fsf.a;
        wxe.o(j, fsfVar3);
        ikk ikkVar3 = n5cVar.b;
        d2c layoutDirection = ikkVar3.getLayoutDirection();
        zvf zvfVar = ixfVar.b;
        int iM = ikkVar3.M(a26.q(zvfVar, layoutDirection));
        int iM2 = ikkVar3.M(a26.p(zvfVar, ikkVar3.getLayoutDirection()));
        int iM3 = ikkVar3.M(zvfVar.b);
        int iM4 = ikkVar3.M(zvfVar.d) + iM3;
        int i29 = iM2 + iM;
        int i30 = i29 - iM;
        long jI = ap5.i(-i29, -iM4, j);
        gu6Var2.n = n5cVar;
        int iM5 = ikkVar3.M(ixfVar.c);
        int iH = yo5.h(j) - i29;
        int i31 = iM4;
        int i32 = i29;
        long j4 = (iM << 32) | (iM3 & 4294967295L);
        ixfVar.d.getClass();
        int i33 = iH < 0 ? 0 : iH;
        ap5.b(0, i33, 0, yo5.g(jI), 5);
        hxf hxfVar = (hxf) ixfVar.e.invoke();
        n9a n9aVar = ixfVar.h;
        ttj ttjVarT = bwg.t();
        fsf fsfVar5 = fsfVar3;
        Function1 function1E = ttjVarT != null ? ttjVarT.e() : null;
        ttj ttjVarX = bwg.x(ttjVarT);
        try {
            int iK = gu6Var2.k();
            long j5 = jI;
            hd hdVar = gu6Var2.d;
            int iW = qbe.w(iK, hxfVar, hdVar.f);
            if (iK != iW) {
                i = iM5;
                ((q0g) hdVar.d).i(iW);
                ((o5c) hdVar.g).b(iK);
            } else {
                i = iM5;
            }
            gu6Var2.k();
            float fL = gu6Var2.l();
            gu6Var2.n();
            n9aVar.getClass();
            int i34 = i33 + i;
            int iB = zed.b(0.0f - (fL * i34));
            bwg.A(ttjVarT, ttjVarX, function1E);
            ide ideVarM = aib.m(hxfVar, gu6Var2.y, gu6Var2.u);
            jde jdeVar = xbb.a;
            jde jdeVar2 = new jde();
            int iIntValue = ((Number) ixfVar.f.invoke()).intValue();
            afe afeVar = gu6Var2.z;
            if (iM < 0) {
                d8b.a("negative beforeContentPadding");
            }
            if (i30 < 0) {
                d8b.a("negative afterContentPadding");
            }
            int i35 = i34 < 0 ? 0 : i34;
            int i36 = iB;
            hxf hxfVar2 = hxfVar;
            int i37 = iIntValue < 0 ? iIntValue : 0;
            long jB = ap5.b(0, i33, 0, yo5.g(j5), 5);
            n9a n9aVar2 = ixfVar.h;
            jde jdeVar3 = jdeVar2;
            nx5 nx5Var = ixfVar.i;
            if (iIntValue <= 0) {
                jxfVar = new jxf(l08.a, i33, i, i30, -iM, iH + i30, i37, n9aVar2, ikkVar3.b0(ap5.g(yo5.j(j5) + i32, j), ap5.f(yo5.i(j5) + i31, j), n08.a, new w5f((byte) 27)), nx5Var, n5cVar, jB);
                n5cVar2 = n5cVar;
                ikkVar2 = ikkVar3;
                gu6Var = gu6Var2;
                z2 = true;
            } else {
                int i38 = i33;
                ikk ikkVar4 = ikkVar3;
                long j6 = j4;
                while (iW > 0 && i36 > 0) {
                    iW--;
                    i36 -= i35;
                }
                int i39 = i36 * (-1);
                if (iW >= iIntValue) {
                    iW = iIntValue - 1;
                    i39 = 0;
                }
                i72 i72Var3 = new i72();
                int i40 = -iM;
                int i41 = i40 + (i < 0 ? i : 0);
                int i42 = iW;
                int i43 = i39 + i41;
                int iMax = 0;
                while (true) {
                    sd3Var = ixfVar.g;
                    if (i43 >= 0 || i42 <= 0) {
                        break;
                    }
                    i42--;
                    int i44 = iMax;
                    long j7 = j5;
                    int i45 = iM;
                    int i46 = i35;
                    i72 i72Var4 = i72Var3;
                    int i47 = i38;
                    hxf hxfVar3 = hxfVar2;
                    long j8 = jB;
                    long j9 = j6;
                    wfd wfdVarW = gyg.w(n5cVar, i42, j8, hxfVar3, j9, sd3Var, ikkVar4.getLayoutDirection(), i47, jdeVar3);
                    i72Var4.add(0, wfdVarW);
                    iMax = Math.max(i44, wfdVarW.h);
                    int i48 = i43 + i46;
                    hxfVar2 = hxfVar3;
                    iIntValue = iIntValue;
                    j6 = j9;
                    jB = j8;
                    i38 = i47;
                    jdeVar3 = jdeVar3;
                    i72Var3 = i72Var4;
                    ikkVar4 = ikkVar4;
                    i31 = i31;
                    i32 = i32;
                    i35 = i46;
                    iM = i45;
                    j5 = j7;
                    i37 = i37;
                    i43 = i48;
                    ixfVar = this;
                }
                hxf hxfVar4 = hxfVar2;
                int i49 = iIntValue;
                long j10 = j6;
                long j11 = jB;
                int i50 = iMax;
                int i51 = i43;
                int i52 = i37;
                long j12 = j5;
                int i53 = i38;
                int i54 = iM;
                int i55 = i35;
                int i56 = i32;
                i72 i72Var5 = i72Var3;
                jde jdeVar4 = jdeVar3;
                int i57 = i31;
                ikk ikkVar5 = ikkVar4;
                if (i51 < i41) {
                    i51 = i41;
                }
                int i58 = i51 - i41;
                int i59 = iH + i30;
                int i60 = i59 < 0 ? 0 : i59;
                int i61 = -i58;
                int i62 = 0;
                boolean z3 = false;
                int i63 = i42;
                while (i62 < i72Var5.c) {
                    if (i61 >= i60) {
                        i72Var5.g(i62);
                        z3 = true;
                    } else {
                        i63++;
                        i61 += i55;
                        i62++;
                    }
                }
                int i64 = i58;
                int i65 = i61;
                int i66 = i49;
                boolean z4 = z3;
                int i67 = i50;
                int i68 = i63;
                while (true) {
                    if (i68 >= i66) {
                        i2 = i59;
                        i3 = i64;
                        i4 = i66;
                        i5 = i67;
                        j2 = j11;
                        i6 = iH;
                        break;
                    }
                    if (i65 >= i60 && i65 > 0 && !i72Var5.isEmpty()) {
                        i2 = i59;
                        i3 = i64;
                        i6 = iH;
                        i4 = i66;
                        i5 = i67;
                        j2 = j11;
                        break;
                    }
                    int i69 = i67;
                    int i70 = i59;
                    int i71 = i64;
                    int i72 = i66;
                    long j13 = j11;
                    int i73 = i60;
                    int i74 = i68;
                    wfd wfdVarW2 = gyg.w(n5cVar, i74, j13, hxfVar4, j10, sd3Var, ikkVar5.getLayoutDirection(), i53, jdeVar4);
                    int i75 = i72 - 1;
                    i65 += i74 == i75 ? i53 : i55;
                    if (i65 > i41 || i74 == i75) {
                        int iMax2 = Math.max(i69, wfdVarW2.h);
                        i72Var5.addLast(wfdVarW2);
                        i67 = iMax2;
                    } else {
                        i42 = i74 + 1;
                        i71 -= i55;
                        i67 = i69;
                        z4 = true;
                    }
                    i68 = i74 + 1;
                    i59 = i70;
                    i60 = i73;
                    j11 = j13;
                    i66 = i72;
                    i64 = i71;
                }
                if (i65 < i6) {
                    int i76 = i6 - i65;
                    int i77 = i3 - i76;
                    int i78 = i65 + i76;
                    int i79 = i5;
                    int i80 = i77;
                    int iMax3 = i79;
                    while (true) {
                        i28 = i54;
                        if (i80 >= i28 || i42 <= 0) {
                            break;
                        }
                        i42--;
                        int i81 = iMax3;
                        i54 = i28;
                        wfd wfdVarW3 = gyg.w(n5cVar, i42, j2, hxfVar4, j10, sd3Var, ikkVar5.getLayoutDirection(), i53, jdeVar4);
                        i72Var5.add(0, wfdVarW3);
                        iMax3 = Math.max(i81, wfdVarW3.h);
                        sd3Var = sd3Var;
                        i68 = i68;
                        i80 += i55;
                        i78 = i78;
                    }
                    i54 = i28;
                    int i82 = i80;
                    i8 = i78;
                    i7 = i68;
                    sd3Var2 = sd3Var;
                    i10 = iMax3;
                    if (i82 < 0) {
                        i8 += i82;
                        i9 = 0;
                    } else {
                        i9 = i82;
                    }
                } else {
                    int i83 = i5;
                    i7 = i68;
                    sd3Var2 = sd3Var;
                    i8 = i65;
                    i9 = i3;
                    i10 = i83;
                }
                if (i9 < 0) {
                    d8b.a("invalid currentFirstPageScrollOffset");
                }
                int i84 = -i9;
                wfd wfdVar2 = (wfd) i72Var5.first();
                if (i54 > 0 || i < 0) {
                    sd3Var3 = sd3Var2;
                    int iD = i72Var5.d();
                    wfd wfdVar3 = wfdVar2;
                    int i85 = 0;
                    while (i85 < iD && i9 != 0) {
                        i11 = i10;
                        i12 = i55;
                        if (i12 > i9) {
                            break;
                        }
                        int i86 = iD;
                        if (i85 == i72Var5.d() - 1) {
                            break;
                        }
                        i9 -= i12;
                        i85++;
                        wfdVar3 = (wfd) i72Var5.get(i85);
                        i55 = i12;
                        i10 = i11;
                        iD = i86;
                    }
                    i11 = i10;
                    i12 = i55;
                    wfdVar2 = wfdVar3;
                } else {
                    sd3Var3 = sd3Var2;
                    i11 = i10;
                    i12 = i55;
                }
                int i87 = i9;
                fsf fsfVar6 = fsf.a;
                int iMax4 = Math.max(0, i42 - i52);
                int i88 = i42 - 1;
                if (iMax4 <= i88) {
                    ArrayList arrayList10 = null;
                    while (true) {
                        if (arrayList10 == null) {
                            arrayList10 = new ArrayList();
                        }
                        i14 = i7;
                        arrayList = arrayList10;
                        fsf fsfVar7 = fsf.a;
                        i15 = i12;
                        i16 = i8;
                        i17 = iMax4;
                        i18 = i6;
                        wfdVar = wfdVar2;
                        i13 = i84;
                        sd3Var4 = sd3Var3;
                        i72Var = i72Var5;
                        i19 = i52;
                        arrayList.add(gyg.w(n5cVar, i88, j2, hxfVar4, j10, sd3Var4, ikkVar5.getLayoutDirection(), i53, jdeVar4));
                        if (i88 == i17) {
                            break;
                        }
                        i88--;
                        iMax4 = i17;
                        i52 = i19;
                        wfdVar2 = wfdVar;
                        i72Var5 = i72Var;
                        i6 = i18;
                        i12 = i15;
                        i8 = i16;
                        sd3Var3 = sd3Var4;
                        i84 = i13;
                        arrayList10 = arrayList;
                        i7 = i14;
                    }
                } else {
                    i13 = i84;
                    i14 = i7;
                    i15 = i12;
                    sd3Var4 = sd3Var3;
                    i16 = i8;
                    i17 = iMax4;
                    i72Var = i72Var5;
                    i18 = i6;
                    i19 = i52;
                    wfdVar = wfdVar2;
                    arrayList = null;
                }
                ide ideVar2 = ideVarM;
                int[] iArr = ideVar2.a;
                int i89 = ideVar2.b;
                ArrayList arrayList11 = arrayList;
                int i90 = 0;
                while (i90 < i89) {
                    int[] iArr2 = iArr;
                    int i91 = iArr2[i90];
                    if (i91 < i17) {
                        if (arrayList11 == null) {
                            arrayList11 = new ArrayList();
                        }
                        i26 = i90;
                        ArrayList arrayList12 = arrayList11;
                        fsf fsfVar8 = fsf.a;
                        i27 = i17;
                        i25 = i89;
                        ideVar = ideVar2;
                        arrayList12.add(gyg.w(n5cVar, i91, j2, hxfVar4, j10, sd3Var4, ikkVar5.getLayoutDirection(), i53, jdeVar4));
                        arrayList11 = arrayList12;
                    } else {
                        i25 = i89;
                        i26 = i90;
                        i27 = i17;
                        ideVar = ideVar2;
                    }
                    i90 = i26 + 1;
                    ideVar2 = ideVar;
                    iArr = iArr2;
                    i17 = i27;
                    i89 = i25;
                }
                ide ideVar3 = ideVar2;
                if (arrayList11 == null) {
                    arrayList11 = l08.a;
                }
                ArrayList arrayList13 = arrayList11;
                int iMax5 = i11;
                int i92 = 0;
                for (int size = arrayList13.size(); i92 < size; size = size) {
                    iMax5 = Math.max(iMax5, ((wfd) arrayList13.get(i92)).h);
                    i92++;
                }
                int i93 = ((wfd) i72Var.last()).a;
                fsf fsfVar9 = fsf.a;
                int iMin = Math.min(i19, (i4 - i93) - 1) + i93;
                int i94 = i93 + 1;
                if (i94 <= iMin) {
                    ArrayList arrayList14 = null;
                    while (true) {
                        if (arrayList14 == null) {
                            arrayList14 = new ArrayList();
                        }
                        i21 = i19;
                        arrayList3 = arrayList14;
                        fsf fsfVar10 = fsf.a;
                        i20 = iMax5;
                        arrayList2 = arrayList13;
                        i22 = iMin;
                        int i95 = i94;
                        arrayList3.add(gyg.w(n5cVar, i95, j2, hxfVar4, j10, sd3Var4, ikkVar5.getLayoutDirection(), i53, jdeVar4));
                        if (i95 == i22) {
                            break;
                        }
                        i94 = i95 + 1;
                        iMin = i22;
                        arrayList13 = arrayList2;
                        iMax5 = i20;
                        arrayList14 = arrayList3;
                        i19 = i21;
                    }
                } else {
                    i20 = iMax5;
                    arrayList2 = arrayList13;
                    i21 = i19;
                    i22 = iMin;
                    arrayList3 = null;
                }
                int[] iArr3 = ideVar3.a;
                int i96 = ideVar3.b;
                ArrayList arrayList15 = arrayList3;
                int i97 = 0;
                while (true) {
                    arrayList4 = arrayList15;
                    if (i97 >= i96) {
                        break;
                    }
                    int i98 = iArr3[i97];
                    int[] iArr4 = iArr3;
                    if (i22 + 1 > i98 || i98 >= i4) {
                        sd3Var5 = sd3Var4;
                        i24 = i22;
                        arrayList9 = arrayList2;
                        fsfVar2 = fsfVar5;
                        j3 = j2;
                        arrayList15 = arrayList4;
                    } else {
                        ArrayList arrayList16 = arrayList4 == null ? new ArrayList() : arrayList4;
                        fsf fsfVar11 = fsf.a;
                        i24 = i22;
                        ArrayList arrayList17 = arrayList16;
                        wfd wfdVarW4 = gyg.w(n5cVar, i98, j2, hxfVar4, j10, sd3Var4, ikkVar5.getLayoutDirection(), i53, jdeVar4);
                        sd3Var5 = sd3Var4;
                        arrayList9 = arrayList2;
                        fsfVar2 = fsfVar5;
                        j3 = j2;
                        arrayList17.add(wfdVarW4);
                        arrayList15 = arrayList17;
                    }
                    i97++;
                    j2 = j3;
                    i22 = i24;
                    arrayList2 = arrayList9;
                    fsfVar5 = fsfVar2;
                    sd3Var4 = sd3Var5;
                    iArr3 = iArr4;
                }
                ArrayList arrayList18 = arrayList2;
                fsf fsfVar12 = fsfVar5;
                long j14 = j2;
                if (arrayList4 == null) {
                    arrayList4 = l08.a;
                }
                int size2 = arrayList4.size();
                int iMax6 = i20;
                for (int i99 = 0; i99 < size2; i99++) {
                    iMax6 = Math.max(iMax6, ((wfd) arrayList4.get(i99)).h);
                }
                boolean z5 = Intrinsics.a(wfdVar, i72Var.first()) && arrayList18.isEmpty() && arrayList4.isEmpty();
                fsf fsfVar13 = fsf.a;
                int i100 = i16;
                int iG = ap5.g(i100, j12);
                int iF = ap5.f(iMax6, j12);
                int i101 = i18;
                boolean z6 = i100 < Math.min(iG, i101);
                if (!z6 || i13 == 0) {
                    i23 = i13;
                } else {
                    StringBuilder sb = new StringBuilder("non-zero pagesScrollOffset=");
                    i23 = i13;
                    sb.append(i23);
                    d8b.c(sb.toString());
                }
                ArrayList arrayList19 = new ArrayList(arrayList4.size() + arrayList18.size() + i72Var.d());
                if (z6) {
                    if (!arrayList18.isEmpty() || !arrayList4.isEmpty()) {
                        d8b.a("No extra pages");
                    }
                    int iD2 = i72Var.d();
                    int[] iArr5 = new int[iD2];
                    for (int i102 = 0; i102 < iD2; i102++) {
                        iArr5[i102] = i53;
                    }
                    int[] iArr6 = new int[iD2];
                    int i103 = i;
                    z = z5;
                    fsfVar = fsfVar12;
                    x62 x62Var = new x62(ikkVar5.j0(i103), false, null);
                    fsf fsfVar14 = fsf.a;
                    ikkVar = ikkVar5;
                    i = i103;
                    x62Var.c(n5cVar, iG, iArr5, d2c.a, iArr6);
                    iG = iG;
                    IntRange intRange = new IntRange(0, iD2 - 1, 1);
                    int i104 = ((a) intRange).b;
                    int i105 = ((a) intRange).c;
                    if ((i105 > 0 && i104 >= 0) || (i105 < 0 && i104 <= 0)) {
                        int i106 = 0;
                        while (true) {
                            int i107 = iArr6[i106];
                            i72Var2 = i72Var;
                            int i108 = i105;
                            wfd wfdVar4 = (wfd) i72Var2.get(i106);
                            wfdVar4.b(i107, iG, iF);
                            arrayList19.add(wfdVar4);
                            if (i106 == i104) {
                                break;
                            }
                            i106 += i108;
                            i72Var = i72Var2;
                            i105 = i108;
                        }
                    } else {
                        i72Var2 = i72Var;
                    }
                    arrayList5 = arrayList18;
                } else {
                    z = z5;
                    ikkVar = ikkVar5;
                    fsfVar = fsfVar12;
                    i72Var2 = i72Var;
                    int size3 = arrayList18.size();
                    int i109 = i23;
                    int i110 = 0;
                    while (true) {
                        arrayList5 = arrayList18;
                        if (i110 >= size3) {
                            break;
                        }
                        int i111 = size3;
                        wfd wfdVar5 = (wfd) arrayList5.get(i110);
                        i109 -= i34;
                        wfdVar5.b(i109, iG, iF);
                        arrayList19.add(wfdVar5);
                        i110++;
                        size3 = i111;
                    }
                    int iD3 = i72Var2.d();
                    for (int i112 = 0; i112 < iD3; i112++) {
                        wfd wfdVar6 = (wfd) i72Var2.get(i112);
                        wfdVar6.b(i23, iG, iF);
                        arrayList19.add(wfdVar6);
                        i23 += i34;
                    }
                    int size4 = arrayList4.size();
                    for (int i113 = 0; i113 < size4; i113++) {
                        wfd wfdVar7 = (wfd) arrayList4.get(i113);
                        wfdVar7.b(i23, iG, iF);
                        arrayList19.add(wfdVar7);
                        i23 += i34;
                    }
                }
                if (z) {
                    arrayList6 = arrayList19;
                } else {
                    arrayList6 = new ArrayList(arrayList19.size());
                    int size5 = arrayList19.size();
                    int i114 = 0;
                    while (i114 < size5) {
                        Object obj2 = arrayList19.get(i114);
                        int i115 = iG;
                        wfd wfdVar8 = (wfd) obj2;
                        int i116 = size5;
                        int i117 = i114;
                        if (wfdVar8.a >= ((wfd) i72Var2.first()).a && wfdVar8.a <= ((wfd) i72Var2.last()).a) {
                            arrayList6.add(obj2);
                        }
                        i114 = i117 + 1;
                        iG = i115;
                        size5 = i116;
                    }
                }
                int i118 = iG;
                if (arrayList5.isEmpty()) {
                    arrayList7 = l08.a;
                } else {
                    arrayList7 = new ArrayList(arrayList19.size());
                    int size6 = arrayList19.size();
                    int i119 = 0;
                    while (i119 < size6) {
                        Object obj3 = arrayList19.get(i119);
                        int i120 = size6;
                        if (((wfd) obj3).a < ((wfd) i72Var2.first()).a) {
                            arrayList7.add(obj3);
                        }
                        i119++;
                        size6 = i120;
                    }
                }
                if (arrayList4.isEmpty()) {
                    arrayList8 = l08.a;
                } else {
                    arrayList8 = new ArrayList(arrayList19.size());
                    int size7 = arrayList19.size();
                    int i121 = 0;
                    while (i121 < size7) {
                        Object obj4 = arrayList19.get(i121);
                        l08 l08Var = arrayList7;
                        if (((wfd) obj4).a > ((wfd) i72Var2.last()).a) {
                            arrayList8.add(obj4);
                        }
                        i121++;
                        arrayList7 = l08Var;
                    }
                }
                l08 l08Var2 = arrayList7;
                if (arrayList6.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList6.get(0);
                    int i122 = ((wfd) obj).j;
                    n9aVar2.getClass();
                    float f = -Math.abs(i122 - 0.0f);
                    int size8 = arrayList6.size() - 1;
                    if (1 <= size8) {
                        float f2 = f;
                        int i123 = 1;
                        while (true) {
                            Object obj5 = arrayList6.get(i123);
                            float f3 = -Math.abs(((wfd) obj5).j - 0.0f);
                            if (Float.compare(f2, f3) < 0) {
                                f2 = f3;
                                obj = obj5;
                            }
                            if (i123 == size8) {
                                break;
                            }
                            i123++;
                        }
                    }
                }
                wfd wfdVar9 = (wfd) obj;
                n9aVar2.getClass();
                gu6Var = gu6Var2;
                z2 = true;
                ikkVar2 = ikkVar;
                jxfVar = new jxf(arrayList6, i53, i, i30, fsfVar, i40, i2, i21, wfdVar, wfdVar9, i15 != 0 ? djh.b((0 - (wfdVar9 != null ? wfdVar9.j : 0)) / i15, -0.5f, 0.5f) : 0.0f, i87, i14 < i4 || i100 > i101, n9aVar2, ikkVar.b0(ap5.g(i118 + i56, j), ap5.f(iF + i57, j), n08.a, new vvf(afeVar, arrayList19, (byte) 2)), z4, l08Var2, arrayList8, nx5Var, n5cVar, j14);
                n5cVar2 = n5cVar;
            }
            gu6 gu6Var3 = gu6Var;
            gu6Var3.h(jxfVar, ikkVar2.F(), false);
            bxf bxfVar = gu6Var3.t;
            List list = jxfVar.a;
            Trace.beginSection("compose:pager:cache_window:keepAroundItems");
            try {
                if (((bxfVar.h == Integer.MAX_VALUE || bxfVar.i == Integer.MIN_VALUE) ? false : z2) && !list.isEmpty()) {
                    int i124 = ((wfd) CollectionsKt.K(list)).a;
                    int i125 = ((wfd) CollectionsKt.Q(list)).a;
                    for (int i126 = bxfVar.h; i126 < i124; i126++) {
                        n5cVar2.a(i126);
                    }
                    int i127 = i125 + 1;
                    int i128 = bxfVar.i;
                    if (i127 <= i128) {
                        while (true) {
                            n5cVar2.a(i127);
                            if (i127 == i128) {
                                break;
                            }
                            i127++;
                        }
                    }
                }
                return jxfVar;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th) {
            bwg.A(ttjVarT, ttjVarX, function1E);
            throw th;
        }
    }
}
