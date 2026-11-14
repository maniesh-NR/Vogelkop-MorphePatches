package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dtk {
    public final tmj A;
    public final rn9 B;
    public final gba C;
    public final ge4 a;
    public final h28 b;
    public final et8 c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final LinkedHashMap l;
    public final ArrayList m;
    public final ArrayList n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public zo2 v;
    public final ArrayList w;
    public final pfk x;
    public final kb7 y;
    public final yhe z;

    /* JADX WARN: Removed duplicated region for block: B:63:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dtk(android.content.Context r36, defpackage.ge4 r37, defpackage.h28 r38, defpackage.et8 r39) {
        /*
            Method dump skipped, instructions count: 1514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtk.<init>(android.content.Context, ge4, h28, et8):void");
    }

    public static Range c(Range range, int i, Range[] rangeArr) {
        Range range2 = to2.h;
        if (Intrinsics.a(range, range2) || rangeArr == null) {
            return range2;
        }
        Range range3 = new Range(Integer.valueOf(Math.min(((Number) range.getLower()).intValue(), i)), Integer.valueOf(Math.min(((Number) range.getUpper()).intValue(), i)));
        int iH = 0;
        for (Range range4 : rangeArr) {
            if (i >= ((Number) range4.getLower()).intValue()) {
                if (Intrinsics.a(range2, to2.h)) {
                    range2 = range4;
                }
                if (range4.equals(range3)) {
                    return range4;
                }
                try {
                    int iH2 = h(range4.intersect(range3));
                    if (iH == 0) {
                        range2 = range4;
                        iH = iH2;
                    } else if (iH2 >= iH) {
                        double dH = h(range2.intersect(range3));
                        double dH2 = h(range4.intersect(range3));
                        double dH3 = dH2 / h(range4);
                        double dH4 = dH / h(range2);
                        if (dH2 <= dH ? !(dH2 != dH ? dH4 >= 0.5d || dH3 <= dH4 : dH3 <= dH4 && (dH3 != dH4 || ((Number) range4.getLower()).intValue() <= ((Number) range2.getLower()).intValue())) : !(dH3 < 0.5d && dH3 < dH4)) {
                            range2 = range4;
                        }
                        iH = h(range3.intersect(range2));
                    }
                } catch (IllegalArgumentException unused) {
                    if (iH == 0 && (g(range4, range3) < g(range2, range3) || (g(range4, range3) == g(range2, range3) && (((Number) range4.getLower()).intValue() > ((Number) range2.getUpper()).intValue() || h(range4) < h(range2))))) {
                        range2 = range4;
                    }
                }
            }
        }
        return range2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Type inference failed for: r2v1, types: [q0i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Size e(android.hardware.camera2.params.StreamConfigurationMap r8, int r9, boolean r10, android.util.Rational r11) {
        /*
            r0 = 0
            p0i r1 = t0i.b     // Catch: java.lang.Throwable -> L19
            r1 = 34
            if (r9 != r1) goto L10
            if (r8 == 0) goto L17
            java.lang.Class<android.graphics.SurfaceTexture> r1 = android.graphics.SurfaceTexture.class
            android.util.Size[] r1 = r8.getOutputSizes(r1)     // Catch: java.lang.Throwable -> L19
            goto L22
        L10:
            if (r8 == 0) goto L17
            android.util.Size[] r1 = r8.getOutputSizes(r9)     // Catch: java.lang.Throwable -> L19
            goto L22
        L17:
            r1 = r0
            goto L22
        L19:
            r1 = move-exception
            p0i r2 = t0i.b
            q0i r2 = new q0i
            r2.<init>(r1)
            r1 = r2
        L22:
            boolean r2 = r1 instanceof q0i
            if (r2 == 0) goto L27
            r1 = r0
        L27:
            android.util.Size[] r1 = (android.util.Size[]) r1
            r2 = 0
            if (r1 == 0) goto L53
            if (r11 == 0) goto L54
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r1.length
            r5 = r2
        L35:
            if (r5 >= r4) goto L49
            r6 = r1[r5]
            android.util.Rational r7 = ua2.a
            android.util.Size r7 = defpackage.qpj.c
            boolean r7 = ua2.a(r6, r11, r7)
            if (r7 == 0) goto L46
            r3.add(r6)
        L46:
            int r5 = r5 + 1
            goto L35
        L49:
            android.util.Size[] r11 = new android.util.Size[r2]
            java.lang.Object[] r11 = r3.toArray(r11)
            r1 = r11
            android.util.Size[] r1 = (android.util.Size[]) r1
            goto L54
        L53:
            r1 = r0
        L54:
            if (r1 == 0) goto L97
            int r11 = r1.length
            if (r11 == 0) goto L97
            uc5 r11 = new uc5
            r11.<init>(r2, r2)
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r1 = java.util.Collections.max(r1, r11)
            android.util.Size r1 = (android.util.Size) r1
            android.util.Size r2 = defpackage.qpj.a
            if (r10 == 0) goto L86
            if (r8 == 0) goto L74
            android.util.Size[] r0 = r8.getHighResolutionOutputSizes(r9)
        L74:
            if (r0 == 0) goto L86
            int r8 = r0.length
            if (r8 == 0) goto L86
            java.util.List r8 = java.util.Arrays.asList(r0)
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r8 = java.util.Collections.max(r8, r11)
            r2 = r8
            android.util.Size r2 = (android.util.Size) r2
        L86:
            android.util.Size[] r8 = new android.util.Size[]{r1, r2}
            java.util.List r8 = java.util.Arrays.asList(r8)
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r8 = java.util.Collections.max(r8, r11)
            android.util.Size r8 = (android.util.Size) r8
            return r8
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtk.e(android.hardware.camera2.params.StreamConfigurationMap, int, boolean, android.util.Rational):android.util.Size");
    }

    public static int g(Range range, Range range2) {
        if (!range.contains((Range) range2.getUpper()) && !range.contains((Range) range2.getLower())) {
            return ((Number) range.getLower()).intValue() > ((Number) range2.getUpper()).intValue() ? ((Number) range.getLower()).intValue() - ((Number) range2.getUpper()).intValue() : ((Number) range2.getLower()).intValue() - ((Number) range.getUpper()).intValue();
        }
        qp2.o("Ranges must not intersect");
        return 0;
    }

    public static int h(Range range) {
        return (((Number) range.getUpper()).intValue() - ((Number) range.getLower()).intValue()) + 1;
    }

    public static Range m(Range range, Range range2, boolean z) {
        Range range3 = to2.h;
        if (Intrinsics.a(range2, range3) && Intrinsics.a(range, range3)) {
            return range3;
        }
        if (Intrinsics.a(range2, range3)) {
            return range;
        }
        if (Intrinsics.a(range, range3)) {
            return range2;
        }
        if (z) {
            jpo.n("All targetFrameRate should be the same if strict fps is required", Intrinsics.a(range, range2));
            return range;
        }
        try {
            return range2.intersect(range);
        } catch (IllegalArgumentException unused) {
            return range2;
        }
    }

    public final boolean a(ctk ctkVar, ArrayList arrayList, Map map, List list, List list2) {
        boolean z;
        ArrayList arrayList2;
        List list3;
        boolean z2;
        Size size;
        t4n t4nVar = ctkVar.d;
        boolean z3 = ctkVar.h;
        LinkedHashMap linkedHashMap = this.l;
        if (linkedHashMap.containsKey(ctkVar)) {
            list3 = (List) linkedHashMap.get(ctkVar);
            z = z3;
        } else {
            ArrayList arrayList3 = new ArrayList();
            int i = ctkVar.a;
            if (z3) {
                zyk zykVar = q5a.a;
                arrayList3.addAll(q5a.b(this.a, t4nVar));
                z = z3;
            } else if (ctkVar.e) {
                ArrayList arrayList4 = this.n;
                if (arrayList4.isEmpty()) {
                    zyk zykVar2 = q5a.a;
                    ArrayList arrayList5 = new ArrayList();
                    etk etkVar = new etk();
                    igk igkVar = itk.e;
                    htk htkVar = htk.d;
                    ftk ftkVar = ftk.MAXIMUM;
                    etk etkVarL = o18.l(htkVar, ftkVar, etkVar, arrayList5, etkVar);
                    z = z3;
                    o18.u(htk.a, ftk.PREVIEW, etkVarL, htkVar, ftkVar);
                    arrayList5.add(etkVarL);
                    arrayList4.addAll(arrayList5);
                } else {
                    z = z3;
                }
                if (i == 0) {
                    arrayList3.addAll(arrayList4);
                }
            } else {
                z = z3;
                if (ctkVar.f) {
                    ArrayList arrayList6 = this.k;
                    if (arrayList6.isEmpty()) {
                        gba gbaVar = this.C;
                        if (((Boolean) gbaVar.b.getValue()).booleanValue()) {
                            arrayList6.clear();
                            Size size2 = (Size) gbaVar.c.getValue();
                            if (size2 != null) {
                                zo2 zo2VarL = l(34);
                                zyk zykVar3 = q5a.a;
                                ArrayList arrayList7 = new ArrayList();
                                igk igkVar2 = itk.e;
                                itk itkVarJ = drj.j(34, size2, zo2VarL, 0, gtk.b, itk.e);
                                etk etkVar2 = new etk();
                                etkVar2.a(itkVarJ);
                                arrayList7.add(etkVar2);
                                etk etkVar3 = new etk();
                                etkVar3.a(itkVarJ);
                                etkVar3.a(itkVarJ);
                                arrayList7.add(etkVar3);
                                arrayList6.addAll(arrayList7);
                            }
                        }
                    }
                    arrayList3.addAll(arrayList6);
                } else {
                    byte b = ctkVar.b;
                    if (b == 8) {
                        if (i != 1) {
                            ArrayList arrayList8 = this.g;
                            if (i != 2) {
                                if (t4nVar == t4n.e) {
                                    arrayList8 = this.j;
                                }
                                arrayList3.addAll(arrayList8);
                            } else {
                                arrayList3.addAll(this.i);
                                arrayList3.addAll(arrayList8);
                            }
                        } else {
                            arrayList2 = this.f;
                            linkedHashMap.put(ctkVar, arrayList2);
                            list3 = arrayList2;
                        }
                    } else if (b == 10 && i == 0) {
                        arrayList3.addAll(this.m);
                    }
                }
            }
            arrayList2 = arrayList3;
            linkedHashMap.put(ctkVar, arrayList2);
            list3 = arrayList2;
        }
        List list4 = list3;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            z2 = false;
        } else {
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                if (((etk) it.next()).c(arrayList) != null) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        if (!z2 || !z) {
            return z2;
        }
        t3j t3jVar = new t3j();
        int size3 = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size3) {
            Object obj = arrayList.get(i3);
            int i4 = i3 + 1;
            int i5 = i2 + 1;
            if (i2 < 0) {
                j95.n();
                throw null;
            }
            itk itkVar = (itk) obj;
            zo2 zo2VarL2 = l(itkVar.d);
            int i6 = itkVar.d;
            ftk ftkVar2 = itkVar.b;
            int iOrdinal = ftkVar2.ordinal();
            int i7 = size3;
            if (iOrdinal != 3) {
                switch (iOrdinal) {
                    case 9:
                        size = zo2VarL2.e;
                        break;
                    case 10:
                        size = (Size) zo2VarL2.f.get(Integer.valueOf(i6));
                        break;
                    case 11:
                        size = (Size) zo2VarL2.f.get(Integer.valueOf(i6));
                        break;
                    case 12:
                        size = (Size) zo2VarL2.f.get(Integer.valueOf(i6));
                        break;
                    case 13:
                        size = (Size) zo2VarL2.i.get(Integer.valueOf(i6));
                        break;
                    case 14:
                        qp2.n("Not supported config size");
                        return false;
                    default:
                        size = ftkVar2.b;
                        break;
                }
            } else {
                size = zo2VarL2.c;
            }
            qsm qsmVar = (qsm) list.get(((Number) list2.get(i2)).intValue());
            Object obj2 = map.get(itkVar);
            if (obj2 == null) {
                qp2.o("Required value was null.");
                return false;
            }
            ip7 ip7Var = (ip7) obj2;
            dt8 dt8Var = new dt8(qsmVar.m(), size);
            dtm.b.getClass();
            int iOrdinal2 = qsmVar.C().ordinal();
            Class cls = (iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? iOrdinal2 != 4 ? dtm.UNDEFINED : dtm.STREAM_SHARING : dtm.VIDEO_CAPTURE : dtm.IMAGE_ANALYSIS : dtm.PREVIEW : dtm.IMAGE_CAPTURE).a;
            if (cls != null) {
                dt8Var.j = cls;
            }
            q3j q3jVarC = q3j.c(qsmVar, size);
            pyl pylVar = q3jVarC.b;
            q3jVarC.a(dt8Var, ip7Var, -1);
            Range range = ctkVar.i;
            if (Intrinsics.a(range, to2.h)) {
                range = null;
            }
            if (range == null) {
                range = mk9.d;
            }
            ((fee) pylVar.d).s(ai4.h, range);
            if (t4nVar == t4n.e) {
                ((fee) pylVar.d).s(qsm.Tp, 2);
            } else if (t4nVar == t4n.d) {
                ((fee) pylVar.d).s(qsm.Up, 2);
            }
            t3jVar.a(q3jVarC.b());
            boolean zC = t3jVar.c();
            StringBuilder sb = new StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
            sb.append(qsmVar);
            sb.append(" with ");
            sb.append(itkVar);
            sb.append(" due to [");
            sb.append(!t3jVar.m ? "Template is not set" : t3jVar.l.toString());
            sb.append("]; surfaceConfigList = ");
            sb.append(arrayList);
            sb.append(", featureSettings = ");
            sb.append(ctkVar);
            sb.append(", newUseCaseConfigs = ");
            sb.append(list);
            jpo.n(sb.toString(), zC);
            size3 = i7;
            i3 = i4;
            i2 = i5;
        }
        u3j u3jVarB = t3jVar.b();
        boolean zJ = this.c.j(u3jVarB);
        Iterator it2 = u3jVarB.b().iterator();
        while (it2.hasNext()) {
            ((g07) it2.next()).a();
        }
        return zJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Type inference failed for: r2v2, types: [q0i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r11 = this;
            kb7 r0 = r11.y
            android.util.Size r4 = r0.c()
            java.lang.String r0 = r11.d     // Catch: java.lang.NumberFormatException -> L11
            java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L11
            android.util.Size r0 = r11.i()     // Catch: java.lang.NumberFormatException -> L11
            if (r0 != 0) goto L66
        L11:
            pfk r0 = r11.x
            yhe r0 = r0.c
            java.lang.Object r0 = r0.b
            android.hardware.camera2.params.StreamConfigurationMap r0 = (android.hardware.camera2.params.StreamConfigurationMap) r0
            r1 = 0
            p0i r2 = t0i.b     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L25
            java.lang.Class<android.media.MediaRecorder> r2 = android.media.MediaRecorder.class
            android.util.Size[] r0 = r0.getOutputSizes(r2)     // Catch: java.lang.Throwable -> L27
            goto L30
        L25:
            r0 = r1
            goto L30
        L27:
            r0 = move-exception
            p0i r2 = t0i.b
            q0i r2 = new q0i
            r2.<init>(r0)
            r0 = r2
        L30:
            boolean r2 = r0 instanceof q0i
            if (r2 == 0) goto L35
            r0 = r1
        L35:
            android.util.Size[] r0 = (android.util.Size[]) r0
            if (r0 == 0) goto L63
            uc5 r2 = new uc5
            r3 = 0
            r5 = 1
            r2.<init>(r3, r5)
            java.util.Arrays.sort(r0, r2)
            int r2 = r0.length
        L44:
            if (r3 >= r2) goto L63
            r5 = r0[r3]
            int r6 = r5.getWidth()
            android.util.Size r7 = defpackage.qpj.f
            int r8 = r7.getWidth()
            if (r6 > r8) goto L60
            int r6 = r5.getHeight()
            int r7 = r7.getHeight()
            if (r6 > r7) goto L60
            r0 = r5
            goto L64
        L60:
            int r3 = r3 + 1
            goto L44
        L63:
            r0 = r1
        L64:
            if (r0 == 0) goto L68
        L66:
            r6 = r0
            goto L6b
        L68:
            android.util.Size r0 = defpackage.qpj.d
            goto L66
        L6b:
            android.util.Size r2 = defpackage.qpj.c
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            zo2 r1 = new zo2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtk.b():void");
    }

    public final int d(int i, Size size, boolean z, int i2) {
        long j;
        int iIntValue = 0;
        if (!z) {
            try {
                j = j().c.j(i, size);
            } catch (RuntimeException unused) {
                if (gyg.G(5, "CXCP")) {
                    Objects.toString(size);
                }
                j = 0;
            }
            if (j > 0) {
                iIntValue = (int) (1.0E9d / j);
            } else if (!this.u) {
                iIntValue = Integer.MAX_VALUE;
            } else if (gyg.G(5, "CXCP")) {
                Objects.toString(size);
            }
        } else {
            if (i != 34) {
                qp2.n("Check failed.");
                return 0;
            }
            List listC = this.C.c(size);
            if (listC.isEmpty()) {
                listC = null;
            }
            if (listC == null) {
                Objects.toString(size);
            } else {
                Iterator it = listC.iterator();
                if (!it.hasNext()) {
                    t3p.y();
                    return 0;
                }
                Integer num = (Integer) ((Range) it.next()).getUpper();
                while (it.hasNext()) {
                    Integer num2 = (Integer) ((Range) it.next()).getUpper();
                    if (num.compareTo(num2) < 0) {
                        num = num2;
                    }
                }
                iIntValue = num.intValue();
            }
        }
        return Math.min(i2, iIntValue);
    }

    public final List f(ctk ctkVar, ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        boolean z;
        ArrayList arrayList2;
        an2 an2Var = jgk.a;
        if (ctkVar.a != 0 || ctkVar.b != 8 || ctkVar.f) {
            return null;
        }
        ArrayList arrayList3 = this.h;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            List listC = ((etk) obj).c(arrayList);
            if (listC != null) {
                an2 an2Var2 = jgk.a;
                int size2 = listC.size();
                int i2 = 0;
                while (true) {
                    z = true;
                    if (i2 >= size2) {
                        arrayList2 = arrayList3;
                        break;
                    }
                    long j = ((itk) listC.get(i2)).c.a;
                    boolean zContainsKey = linkedHashMap.containsKey(Integer.valueOf(i2));
                    ssm ssmVar = ssm.e;
                    if (zContainsKey) {
                        List list = ((qm2) linkedHashMap.get(Integer.valueOf(i2))).e;
                        arrayList2 = arrayList3;
                        if (list.size() == 1) {
                            ssmVar = (ssm) list.get(0);
                        }
                        if (!jgk.c(ssmVar, j, list)) {
                            break;
                        }
                        i2++;
                        arrayList3 = arrayList2;
                    } else {
                        arrayList2 = arrayList3;
                        if (!linkedHashMap2.containsKey(Integer.valueOf(i2))) {
                            qp2.g("SurfaceConfig does not map to any use case");
                            return null;
                        }
                        qsm qsmVar = (qsm) linkedHashMap2.get(Integer.valueOf(i2));
                        if (!jgk.c(qsmVar.C(), j, qsmVar.C() == ssmVar ? (List) ((ggk) qsmVar).i(ggk.b) : l08.a)) {
                            break;
                        }
                        i2++;
                        arrayList3 = arrayList2;
                    }
                }
                z = false;
                zyk zykVarB = z4c.b(new eek(this, listC, (byte) 5));
                if (z && ((Boolean) zykVarB.getValue()).booleanValue()) {
                    return listC;
                }
                arrayList3 = arrayList2;
            }
        }
        return null;
    }

    public final Size i() {
        j28 j28VarB;
        Iterator it = Arrays.asList(1, 13, 10, 8, 12, 6, 5, 4).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            h28 h28Var = this.b;
            if (h28Var.a(iIntValue) && (j28VarB = h28Var.b(iIntValue)) != null && !j28VarB.b().isEmpty()) {
                return ((hn2) j28VarB.b().get(0)).a();
            }
        }
        return null;
    }

    public final pfk j() {
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        ge4 ge4Var = this.a;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((ma4) ge4Var).c(key);
        if (streamConfigurationMap != null) {
            return new pfk(streamConfigurationMap, new nuf(ge4Var));
        }
        qp2.o("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
        return null;
    }

    public final ArrayList k(int i, ArrayList arrayList, List list, List list2, ArrayList arrayList2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, boolean z) {
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            qm2 qm2Var = (qm2) obj;
            arrayList3.add(qm2Var.a);
            linkedHashMap.put(Integer.valueOf(arrayList3.size() - 1), qm2Var);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i4 = i2 + 1;
            Size size2 = (Size) it.next();
            qsm qsmVar = (qsm) list2.get(((Number) arrayList2.get(i2)).intValue());
            int iM = qsmVar.m();
            igk igkVarB = qsmVar.B();
            igk igkVar = itk.e;
            arrayList3.add(drj.j(iM, size2, l(iM), i, z ? gtk.a : gtk.b, igkVarB));
            linkedHashMap2.put(Integer.valueOf(arrayList3.size() - 1), qsmVar);
            i2 = i4;
        }
        return arrayList3;
    }

    public final zo2 l(int i) {
        Size sizeE;
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = this.w;
        if (!arrayList.contains(numValueOf)) {
            zo2 zo2Var = this.v;
            if (zo2Var == null) {
                zo2Var = null;
            }
            p(zo2Var.b, qpj.e, i);
            zo2 zo2Var2 = this.v;
            if (zo2Var2 == null) {
                zo2Var2 = null;
            }
            p(zo2Var2.d, qpj.g, i);
            zo2 zo2Var3 = this.v;
            if (zo2Var3 == null) {
                zo2Var3 = null;
            }
            o(zo2Var3.f, i, null);
            zo2 zo2Var4 = this.v;
            if (zo2Var4 == null) {
                zo2Var4 = null;
            }
            o(zo2Var4.g, i, ua2.a);
            zo2 zo2Var5 = this.v;
            if (zo2Var5 == null) {
                zo2Var5 = null;
            }
            o(zo2Var5.h, i, ua2.c);
            zo2 zo2Var6 = this.v;
            if (zo2Var6 == null) {
                zo2Var6 = null;
            }
            LinkedHashMap linkedHashMap = zo2Var6.i;
            if (Build.VERSION.SDK_INT >= 31 && this.s) {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((ma4) this.a).c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION);
                if (streamConfigurationMap != null && (sizeE = e(streamConfigurationMap, i, true, null)) != null) {
                    linkedHashMap.put(Integer.valueOf(i), sizeE);
                }
            }
            arrayList.add(Integer.valueOf(i));
        }
        zo2 zo2Var7 = this.v;
        if (zo2Var7 != null) {
            return zo2Var7;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0423, code lost:
    
        r5 = r47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0606 A[PHI: r9 r18 r25
      0x0606: PHI (r9v20 int) = (r9v19 int), (r9v19 int), (r9v25 int), (r9v27 int) binds: [B:186:0x05dc, B:188:0x05e8, B:193:0x05f4, B:196:0x0601] A[DONT_GENERATE, DONT_INLINE]
      0x0606: PHI (r18v4 boolean) = (r18v3 boolean), (r18v3 boolean), (r18v3 boolean), (r18v5 boolean) binds: [B:186:0x05dc, B:188:0x05e8, B:193:0x05f4, B:196:0x0601] A[DONT_GENERATE, DONT_INLINE]
      0x0606: PHI (r25v6 java.util.List) = (r25v5 java.util.List), (r25v5 java.util.List), (r25v8 java.util.List), (r25v9 java.util.List) binds: [B:186:0x05dc, B:188:0x05e8, B:193:0x05f4, B:196:0x0601] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0822  */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1, types: [int] */
    /* JADX WARN: Type inference failed for: r35v10 */
    /* JADX WARN: Type inference failed for: r35v9 */
    /* JADX WARN: Type inference failed for: r50v0, types: [java.util.LinkedHashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cuk n(defpackage.ctk r45, java.util.ArrayList r46, java.util.LinkedHashMap r47, java.util.List r48, java.util.ArrayList r49, java.util.LinkedHashMap r50) {
        /*
            Method dump skipped, instructions count: 2322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtk.n(ctk, java.util.ArrayList, java.util.LinkedHashMap, java.util.List, java.util.ArrayList, java.util.LinkedHashMap):cuk");
    }

    public final void o(LinkedHashMap linkedHashMap, int i, Rational rational) {
        Size sizeE = e((StreamConfigurationMap) this.x.c.b, i, true, rational);
        if (sizeE != null) {
            linkedHashMap.put(Integer.valueOf(i), sizeE);
        }
    }

    public final void p(LinkedHashMap linkedHashMap, Size size, int i) {
        if (this.q) {
            Size sizeE = e((StreamConfigurationMap) this.x.c.b, i, false, null);
            Integer numValueOf = Integer.valueOf(i);
            if (sizeE != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeE), new uc5((byte) 0, false));
            }
            linkedHashMap.put(numValueOf, size);
        }
    }

    public final void q(ctk ctkVar) {
        int i = ctkVar.a;
        boolean z = ctkVar.g;
        if (i != 0) {
            boolean z2 = ctkVar.e;
            String str = this.d;
            if (z2) {
                bxl.d(z1m.l(p3p.s("Camera device Id is ", str, ". Ultra HDR is not currently supported in "), i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
                return;
            } else if (ctkVar.b == 10) {
                bxl.d(z1m.l(p3p.s("Camera device Id is ", str, ". 10 bit dynamic range is not currently supported in "), i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
                return;
            } else if (z) {
                bxl.d(z1m.l(p3p.s("Camera device Id is ", str, ". feature combination is not currently supported in "), i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
                return;
            }
        }
        if (ctkVar.f) {
            if (z) {
                qp2.o("High-speed session is not supported with feature combination");
            } else {
                if (((Boolean) this.C.b.getValue()).booleanValue()) {
                    return;
                }
                qp2.o("High-speed session is not supported on this device.");
            }
        }
    }
}
