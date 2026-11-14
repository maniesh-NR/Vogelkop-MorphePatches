package ads_mobile_sdk;

import defpackage.a4h;
import defpackage.elo;
import defpackage.fac;
import defpackage.flp;
import defpackage.ioj;
import defpackage.ogp;
import defpackage.p3p;
import defpackage.pio;
import defpackage.r05;
import defpackage.t3p;
import defpackage.v9g;
import defpackage.wmp;
import defpackage.z1m;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class op1 implements pio {
    public static final int[] n = new int[0];
    public static final Unsafe o = ml3.a();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final ku0 e;
    public final boolean f = true;
    public final int[] g;
    public final int h;
    public final int i;
    public final ioj l;

    public op1(int[] iArr, Object[] objArr, int i, int i2, ku0 ku0Var, int[] iArr2, int i3, int i4, ioj iojVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.l = iojVar;
        this.e = ku0Var;
    }

    public static int a(long j, Object obj) {
        return ((Integer) ((Unsafe) ml3.c.a).getObject(obj, j)).intValue();
    }

    public static int a(byte[] bArr, int i, int i2, cs3 cs3Var, Class cls, defpackage.f72 f72Var) throws bj1 {
        switch (cs3Var.ordinal()) {
            case 0:
                f72Var.c = Double.valueOf(Double.longBitsToDouble(fac.k(i, bArr)));
                return i + 8;
            case 1:
                f72Var.c = Float.valueOf(Float.intBitsToFloat(fac.h(i, bArr)));
                return i + 4;
            case 2:
            case 3:
                int iP = fac.p(bArr, i, f72Var);
                f72Var.c = Long.valueOf(f72Var.b);
                return iP;
            case 4:
            case 12:
            case 13:
                int iN = fac.n(bArr, i, f72Var);
                f72Var.c = Integer.valueOf(f72Var.a);
                return iN;
            case 5:
            case 15:
                f72Var.c = Long.valueOf(fac.k(i, bArr));
                return i + 8;
            case 6:
            case 14:
                f72Var.c = Integer.valueOf(fac.h(i, bArr));
                return i + 4;
            case 7:
                int iP2 = fac.p(bArr, i, f72Var);
                f72Var.c = Boolean.valueOf(f72Var.b != 0);
                return iP2;
            case 8:
                return fac.j(bArr, i, f72Var);
            case 9:
            default:
                h9o.r("unsupported field type.");
                return 0;
            case 10:
                pio pioVarA = zl2.c.a(cls);
                ku0 ku0VarA = pioVarA.a();
                int iE = fac.e(ku0VarA, pioVarA, bArr, i, i2, f72Var);
                pioVarA.c(ku0VarA);
                f72Var.c = ku0VarA;
                return iE;
            case 11:
                return fac.f(bArr, i, f72Var);
            case 16:
                int iN2 = fac.n(bArr, i, f72Var);
                f72Var.c = Integer.valueOf(v9g.b(f72Var.a));
                return iN2;
            case 17:
                int iP3 = fac.p(bArr, i, f72Var);
                f72Var.c = Long.valueOf(v9g.a(f72Var.b));
                return iP3;
        }
    }

    public static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbN = z1m.n("Field ", str, " for ", name, " not found. Known fields are ");
            sbN.append(string);
            throw new RuntimeException(sbN.toString(), e);
        }
    }

    public static void a(g gVar, int i, r05 r05Var, pio pioVar, ul0 ul0Var) throws bj1 {
        int iR;
        long j = i & 1048575;
        ov ovVar = ml3.c;
        flp flpVarA = (flp) ((Unsafe) ovVar.a).getObject(gVar, j);
        if (!((j) flpVarA).a) {
            int size = flpVarA.size();
            flpVarA = flpVarA.a(size == 0 ? 10 : size << 1);
            ovVar.a(j, gVar, flpVarA);
        }
        int i2 = r05Var.b;
        v9g v9gVar = (v9g) r05Var.e;
        if ((i2 & 7) != 2) {
            t3p.c();
            return;
        }
        do {
            ku0 ku0VarA = pioVar.a();
            r05Var.b(ku0VarA, pioVar, ul0Var);
            pioVar.c(ku0VarA);
            flpVarA.add(ku0VarA);
            if (v9gVar.b() || r05Var.d != 0) {
                return;
            } else {
                iR = v9gVar.r();
            }
        } while (iR == i2);
        r05Var.d = iR;
    }

    public static void a(g gVar, long j, r05 r05Var, pio pioVar, ul0 ul0Var) throws bj1 {
        int iR;
        ov ovVar = ml3.c;
        flp flpVarA = (flp) ((Unsafe) ovVar.a).getObject(gVar, j);
        if (!((j) flpVarA).a) {
            int size = flpVarA.size();
            flpVarA = flpVarA.a(size == 0 ? 10 : size << 1);
            ovVar.a(j, gVar, flpVarA);
        }
        int i = r05Var.b;
        v9g v9gVar = (v9g) r05Var.e;
        if ((i & 7) != 3) {
            t3p.c();
            return;
        }
        do {
            ku0 ku0VarA = pioVar.a();
            r05Var.a(ku0VarA, pioVar, ul0Var);
            pioVar.c(ku0VarA);
            flpVarA.add(ku0VarA);
            if (v9gVar.b() || r05Var.d != 0) {
                return;
            } else {
                iR = v9gVar.r();
            }
        } while (iR == i);
        r05Var.d = iR;
    }

    public static long b(long j, Object obj) {
        return ((Long) ((Unsafe) ml3.c.a).getObject(obj, j)).longValue();
    }

    public static void b(int i, r05 r05Var, g gVar) throws elo {
        int i2 = 536870912 & i;
        int i3 = i & 1048575;
        if (i2 != 0) {
            r05Var.a(a4h.c(gVar, i3), true);
        } else {
            r05Var.a(a4h.c(gVar, i3), false);
        }
    }

    public static long d(int i) {
        return i & 1048575;
    }

    public static void e(Object obj) {
        if (g(obj)) {
            return;
        }
        qp2.o("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static boolean g(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof ku0) {
            return ((ku0) obj).j();
        }
        return true;
    }

    public final int a(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int a(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, defpackage.f72 r42) {
        /*
            Method dump skipped, instructions count: 3784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.op1.a(java.lang.Object, byte[], int, int, int, f72):int");
    }

    @Override // defpackage.pio
    public final ku0 a() {
        return (ku0) this.e.a(4, (ku0) null);
    }

    public final Object a(Object obj, int i, Object obj2, ioj iojVar, Object obj3) {
        ogp ogpVarA;
        int i2 = this.a[i];
        Object object = ((Unsafe) ml3.c.a).getObject(obj, r0[i + 1] & 1048575);
        if (object == null || (ogpVarA = a(i)) == null) {
            return obj2;
        }
        os osVar = ((dn1) b(i)).a;
        cs3 cs3Var = (cs3) osVar.b;
        wmp wmpVar = (wmp) osVar.a;
        Iterator it = ((gn1) object).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!ogpVarA.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    iojVar.getClass();
                    obj2 = ioj.c(obj3);
                }
                int iA = gm0.a(cs3Var, 2, entry.getValue()) + gm0.a(wmpVar, 1, entry.getKey());
                byte[] bArr = new byte[iA];
                lv lvVar = new lv(bArr, iA);
                try {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    gm0.a(lvVar, wmpVar, 1, key);
                    gm0.a(lvVar, cs3Var, 2, value);
                    if (lvVar.b() > 0) {
                        qp2.n("Did not write as much data as expected.");
                        return null;
                    }
                    if (lvVar.b() < 0) {
                        qp2.n("Wrote more data than expected.");
                        return null;
                    }
                    fr frVar = new fr(bArr);
                    iojVar.getClass();
                    ((yk3) obj2).a((i2 << 3) | 2, frVar);
                    it.remove();
                } catch (IOException e) {
                    rqd.p(e);
                    return null;
                }
            }
        }
        return obj2;
    }

    public final ogp a(int i) {
        return (ogp) this.b[((i / 3) << 1) + 1];
    }

    public final void a(int i, r05 r05Var, g gVar) throws elo {
        if ((536870912 & i) != 0) {
            r05Var.b(2);
            ml3.c.a(i & 1048575, gVar, ((v9g) r05Var.e).q());
            return;
        }
        int i2 = i & 1048575;
        if (this.f) {
            r05Var.b(2);
            ml3.c.a(i2, gVar, ((v9g) r05Var.e).p());
            return;
        }
        r05Var.b(2);
        ml3.c.a(i2, gVar, ((v9g) r05Var.e).d());
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ce, code lost:
    
        r12.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d4, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(ads_mobile_sdk.g r11, int r12, java.lang.Object r13, ads_mobile_sdk.ul0 r14, defpackage.r05 r15) throws defpackage.elo {
        /*
            r10 = this;
            r0 = 1
            int r12 = r12 + r0
            int[] r10 = r10.a
            r10 = r10[r12]
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r12
            long r1 = (long) r10
            ads_mobile_sdk.ov r10 = ads_mobile_sdk.ml3.c
            java.lang.Object r12 = r10.a
            sun.misc.Unsafe r12 = (sun.misc.Unsafe) r12
            java.lang.Object r12 = r12.getObject(r11, r1)
            if (r12 != 0) goto L21
            ads_mobile_sdk.gn1 r12 = ads_mobile_sdk.gn1.b
            ads_mobile_sdk.gn1 r12 = r12.b()
            r10.a(r1, r11, r12)
            goto L53
        L21:
            r3 = r12
            ads_mobile_sdk.gn1 r3 = (ads_mobile_sdk.gn1) r3
            boolean r4 = r3.a
            if (r4 != 0) goto L53
            ads_mobile_sdk.gn1 r12 = ads_mobile_sdk.gn1.b
            ads_mobile_sdk.gn1 r12 = r12.b()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L50
            boolean r4 = r12.a
            if (r4 != 0) goto L3d
            ads_mobile_sdk.gn1 r4 = r12.b()
            goto L3e
        L3d:
            r4 = r12
        L3e:
            boolean r5 = r4.a
            if (r5 == 0) goto L4c
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L50
            r4.putAll(r3)
            goto L50
        L4c:
            defpackage.t3p.o()
            return
        L50:
            r10.a(r1, r11, r12)
        L53:
            ads_mobile_sdk.gn1 r12 = (ads_mobile_sdk.gn1) r12
            ads_mobile_sdk.dn1 r13 = (ads_mobile_sdk.dn1) r13
            ads_mobile_sdk.os r10 = r13.a
            r11 = 2
            r15.b(r11)
            java.lang.Object r13 = r15.e
            v9g r13 = (defpackage.v9g) r13
            int r1 = r13.s()
            int r1 = r13.d(r1)
            java.lang.Object r2 = r10.c
            java.lang.String r3 = ""
            r4 = r2
        L6e:
            int r5 = r15.a()     // Catch: java.lang.Throwable -> Ld5
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto Lce
            boolean r6 = r13.b()     // Catch: java.lang.Throwable -> Ld5
            if (r6 != 0) goto Lce
            r6 = 0
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r0) goto Lab
            if (r5 == r11) goto L9e
            boolean r5 = r13.b()     // Catch: defpackage.elo -> Lb5 java.lang.Throwable -> Ld5
            if (r5 != 0) goto L95
            int r5 = r15.b     // Catch: defpackage.elo -> Lb5 java.lang.Throwable -> Ld5
            int r8 = r15.c     // Catch: defpackage.elo -> Lb5 java.lang.Throwable -> Ld5
            if (r5 == r8) goto L95
            boolean r5 = r13.e(r5)     // Catch: defpackage.elo -> Lb5 java.lang.Throwable -> Ld5
            goto L96
        L95:
            r5 = r6
        L96:
            if (r5 != 0) goto L6e
            ads_mobile_sdk.bj1 r5 = new ads_mobile_sdk.bj1     // Catch: defpackage.elo -> Lb5 java.lang.Throwable -> Ld5
            r5.<init>(r7)     // Catch: defpackage.elo -> Lb5 java.lang.Throwable -> Ld5
            throw r5     // Catch: defpackage.elo -> Lb5 java.lang.Throwable -> Ld5
        L9e:
            java.lang.Object r5 = r10.b     // Catch: defpackage.elo -> Lb5 java.lang.Throwable -> Ld5
            ads_mobile_sdk.cs3 r5 = (ads_mobile_sdk.cs3) r5     // Catch: defpackage.elo -> Lb5 java.lang.Throwable -> Ld5
            java.lang.Class r8 = r2.getClass()     // Catch: defpackage.elo -> Lb5 java.lang.Throwable -> Ld5
            java.lang.Object r4 = r15.a(r5, r8, r14)     // Catch: defpackage.elo -> Lb5 java.lang.Throwable -> Ld5
            goto L6e
        Lab:
            java.lang.Object r5 = r10.a     // Catch: defpackage.elo -> Lb5 java.lang.Throwable -> Ld5
            wmp r5 = (defpackage.wmp) r5     // Catch: defpackage.elo -> Lb5 java.lang.Throwable -> Ld5
            r8 = 0
            java.lang.Object r3 = r15.a(r5, r8, r8)     // Catch: defpackage.elo -> Lb5 java.lang.Throwable -> Ld5
            goto L6e
        Lb5:
            r5 = move-exception
            boolean r8 = r13.b()     // Catch: java.lang.Throwable -> Ld5
            if (r8 != 0) goto Lc6
            int r8 = r15.b     // Catch: java.lang.Throwable -> Ld5
            int r9 = r15.c     // Catch: java.lang.Throwable -> Ld5
            if (r8 == r9) goto Lc6
            boolean r6 = r13.e(r8)     // Catch: java.lang.Throwable -> Ld5
        Lc6:
            if (r6 != 0) goto L6e
            ads_mobile_sdk.bj1 r10 = new ads_mobile_sdk.bj1     // Catch: java.lang.Throwable -> Ld5
            r10.<init>(r7, r5)     // Catch: java.lang.Throwable -> Ld5
            throw r10     // Catch: java.lang.Throwable -> Ld5
        Lce:
            r12.put(r3, r4)     // Catch: java.lang.Throwable -> Ld5
            r13.c(r1)
            return
        Ld5:
            r10 = move-exception
            r13.c(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.op1.a(ads_mobile_sdk.g, int, java.lang.Object, ads_mobile_sdk.ul0, r05):void");
    }

    @Override // defpackage.pio
    public final void a(g gVar, r05 r05Var, ul0 ul0Var) {
        byte[] bArr = yb1.a;
        ul0Var.getClass();
        e(gVar);
        a(this.l, gVar, r05Var, ul0Var);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void a(defpackage.ioj r21, ads_mobile_sdk.g r22, defpackage.r05 r23, ads_mobile_sdk.ul0 r24) {
        /*
            Method dump skipped, instructions count: 3244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.op1.a(ioj, ads_mobile_sdk.g, r05, ads_mobile_sdk.ul0):void");
    }

    public final void a(Object obj, int i, int i2, Object obj2) {
        o.putObject(obj, this.a[i2 + 1] & 1048575, obj2);
        c(i, i2, obj);
    }

    @Override // defpackage.pio
    public final void a(Object obj, e7 e7Var) {
        int i;
        int i2;
        int i3;
        int i4;
        op1 op1Var = this;
        int[] iArr = op1Var.a;
        int length = iArr.length;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int i9 = iArr[i7 + 1];
            int i10 = iArr[i7];
            int i11 = (267386880 & i9) >>> 20;
            Unsafe unsafe = o;
            if (i11 <= 17) {
                int i12 = iArr[i7 + 2];
                int i13 = i12 & i5;
                if (i13 != i6) {
                    i8 = i13 == i5 ? 0 : unsafe.getInt(obj, i13);
                    i6 = i13;
                }
                i = i9;
                i2 = 1 << (i12 >>> 20);
            } else {
                i = i9;
                i2 = 0;
            }
            long j = i & i5;
            switch (i11) {
                case 0:
                    if (op1Var.a(obj, i7, i6, i8, i2)) {
                        ((ov) e7Var.a).d(i10, Double.doubleToRawLongBits(ml3.c.b(j, obj)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (op1Var.a(obj, i7, i6, i8, i2)) {
                        ((ov) e7Var.a).e(i10, Float.floatToRawIntBits(ml3.c.c(j, obj)));
                    }
                    op1Var = this;
                    break;
                case 2:
                    if (op1Var.a(obj, i7, i6, i8, i2)) {
                        ((ov) e7Var.a).e(i10, unsafe.getLong(obj, j));
                    }
                    op1Var = this;
                    break;
                case 3:
                    if (op1Var.a(obj, i7, i6, i8, i2)) {
                        ((ov) e7Var.a).e(i10, unsafe.getLong(obj, j));
                    }
                    op1Var = this;
                    break;
                case 4:
                    if (op1Var.a(obj, i7, i6, i8, i2)) {
                        ((ov) e7Var.a).f(i10, unsafe.getInt(obj, j));
                    }
                    op1Var = this;
                    break;
                case 5:
                    if (op1Var.a(obj, i7, i6, i8, i2)) {
                        ((ov) e7Var.a).d(i10, unsafe.getLong(obj, j));
                    }
                    op1Var = this;
                    break;
                case 6:
                    if (op1Var.a(obj, i7, i6, i8, i2)) {
                        ((ov) e7Var.a).e(i10, unsafe.getInt(obj, j));
                    }
                    op1Var = this;
                    break;
                case 7:
                    if (op1Var.a(obj, i7, i6, i8, i2)) {
                        ((ov) e7Var.a).a(i10, ml3.c.a(j, obj));
                    }
                    op1Var = this;
                    break;
                case 8:
                    if (op1Var.a(obj, i7, i6, i8, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((ov) e7Var.a).b((String) object, i10);
                        } else {
                            ((ov) e7Var.a).b(i10, (hr) object);
                        }
                    }
                    op1Var = this;
                    break;
                case 9:
                    if (op1Var.a(obj, i7, i6, i8, i2)) {
                        e7Var.b(i10, op1Var.c(i7), unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (op1Var.a(obj, i7, i6, i8, i2)) {
                        ((ov) e7Var.a).b(i10, (hr) unsafe.getObject(obj, j));
                    }
                    op1Var = this;
                    break;
                case 11:
                    if (op1Var.a(obj, i7, i6, i8, i2)) {
                        ((ov) e7Var.a).h(i10, unsafe.getInt(obj, j));
                    }
                    op1Var = this;
                    break;
                case 12:
                    if (op1Var.a(obj, i7, i6, i8, i2)) {
                        ((ov) e7Var.a).f(i10, unsafe.getInt(obj, j));
                    }
                    op1Var = this;
                    break;
                case 13:
                    if (op1Var.a(obj, i7, i6, i8, i2)) {
                        ((ov) e7Var.a).e(i10, unsafe.getInt(obj, j));
                    }
                    op1Var = this;
                    break;
                case 14:
                    if (op1Var.a(obj, i7, i6, i8, i2)) {
                        ((ov) e7Var.a).d(i10, unsafe.getLong(obj, j));
                    }
                    op1Var = this;
                    break;
                case 15:
                    if (op1Var.a(obj, i7, i6, i8, i2)) {
                        ((ov) e7Var.a).h(i10, ov.j(unsafe.getInt(obj, j)));
                    }
                    op1Var = this;
                    break;
                case 16:
                    if (op1Var.a(obj, i7, i6, i8, i2)) {
                        ((ov) e7Var.a).e(i10, ov.b(unsafe.getLong(obj, j)));
                    }
                    op1Var = this;
                    break;
                case 17:
                    if (op1Var.a(obj, i7, i6, i8, i2)) {
                        Object object2 = unsafe.getObject(obj, j);
                        pio pioVarC = op1Var.c(i7);
                        e7Var.getClass();
                        ov ovVar = (ov) e7Var.a;
                        ovVar.g(i10, 3);
                        pioVarC.a(object2, e7Var);
                        ovVar.g(i10, 4);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i3 = i6;
                    i4 = i8;
                    b03.b(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, false);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 19:
                    i3 = i6;
                    i4 = i8;
                    b03.f(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, false);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 20:
                    i3 = i6;
                    i4 = i8;
                    b03.h(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, false);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 21:
                    i3 = i6;
                    i4 = i8;
                    b03.n(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, false);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 22:
                    i3 = i6;
                    i4 = i8;
                    b03.g(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, false);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 23:
                    i3 = i6;
                    i4 = i8;
                    b03.e(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, false);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 24:
                    i3 = i6;
                    i4 = i8;
                    b03.d(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, false);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 25:
                    i3 = i6;
                    i4 = i8;
                    b03.a(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, false);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 26:
                    i3 = i6;
                    i4 = i8;
                    int i14 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = b03.a;
                    if (list != null && !list.isEmpty()) {
                        e7Var.getClass();
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            ((ov) e7Var.a).b((String) list.get(i15), i14);
                        }
                    }
                    i6 = i3;
                    i8 = i4;
                    break;
                case 27:
                    i3 = i6;
                    i4 = i8;
                    int i16 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    pio pioVarC2 = op1Var.c(i7);
                    Class cls2 = b03.a;
                    if (list2 != null && !list2.isEmpty()) {
                        e7Var.getClass();
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            e7Var.b(i16, pioVarC2, list2.get(i17));
                        }
                    }
                    i6 = i3;
                    i8 = i4;
                    break;
                case 28:
                    i3 = i6;
                    i4 = i8;
                    int i18 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = b03.a;
                    if (list3 != null && !list3.isEmpty()) {
                        e7Var.getClass();
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            ((ov) e7Var.a).b(i18, (hr) list3.get(i19));
                        }
                    }
                    i6 = i3;
                    i8 = i4;
                    break;
                case 29:
                    i3 = i6;
                    i4 = i8;
                    b03.m(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, false);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 30:
                    i3 = i6;
                    i4 = i8;
                    b03.c(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, false);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 31:
                    i3 = i6;
                    i4 = i8;
                    b03.i(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, false);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 32:
                    i3 = i6;
                    i4 = i8;
                    b03.j(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, false);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 33:
                    i3 = i6;
                    i4 = i8;
                    b03.k(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, false);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 34:
                    i3 = i6;
                    i4 = i8;
                    b03.l(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, false);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 35:
                    i3 = i6;
                    i4 = i8;
                    b03.b(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, true);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 36:
                    i3 = i6;
                    i4 = i8;
                    b03.f(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, true);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 37:
                    i3 = i6;
                    i4 = i8;
                    b03.h(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, true);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 38:
                    i3 = i6;
                    i4 = i8;
                    b03.n(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, true);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 39:
                    i3 = i6;
                    i4 = i8;
                    b03.g(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, true);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 40:
                    i3 = i6;
                    i4 = i8;
                    b03.e(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, true);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 41:
                    i3 = i6;
                    i4 = i8;
                    b03.d(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, true);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 42:
                    i3 = i6;
                    i4 = i8;
                    b03.a(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, true);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 43:
                    i3 = i6;
                    i4 = i8;
                    b03.m(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, true);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 44:
                    i3 = i6;
                    i4 = i8;
                    b03.c(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, true);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 45:
                    i3 = i6;
                    i4 = i8;
                    b03.i(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, true);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 46:
                    i3 = i6;
                    i4 = i8;
                    b03.j(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, true);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 47:
                    i3 = i6;
                    i4 = i8;
                    b03.k(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, true);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 48:
                    i3 = i6;
                    i4 = i8;
                    b03.l(iArr[i7], (List) unsafe.getObject(obj, j), e7Var, true);
                    i6 = i3;
                    i8 = i4;
                    break;
                case 49:
                    i3 = i6;
                    i4 = i8;
                    int i20 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    pio pioVarC3 = op1Var.c(i7);
                    Class cls4 = b03.a;
                    if (list4 != null && !list4.isEmpty()) {
                        e7Var.getClass();
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            g gVar = (g) list4.get(i21);
                            ov ovVar2 = (ov) e7Var.a;
                            ovVar2.g(i20, 3);
                            pioVarC3.a((Object) gVar, e7Var);
                            ovVar2.g(i20, 4);
                        }
                    }
                    i6 = i3;
                    i8 = i4;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        os osVar = ((dn1) op1Var.b(i7)).a;
                        cs3 cs3Var = (cs3) osVar.b;
                        wmp wmpVar = (wmp) osVar.a;
                        ov ovVar3 = (ov) e7Var.a;
                        for (Map.Entry entry : ((gn1) object3).entrySet()) {
                            ovVar3.g(i10, 2);
                            int i22 = i6;
                            ovVar3.m(gm0.a(cs3Var, 2, entry.getValue()) + gm0.a(wmpVar, 1, entry.getKey()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            gm0.a(ovVar3, wmpVar, 1, key);
                            gm0.a(ovVar3, cs3Var, 2, value);
                            i6 = i22;
                            i8 = i8;
                        }
                        break;
                    } else {
                        break;
                    }
                case 51:
                    if (op1Var.a(i10, i7, obj)) {
                        ((ov) e7Var.a).d(i10, Double.doubleToRawLongBits(((Double) ((Unsafe) ml3.c.a).getObject(obj, j)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (op1Var.a(i10, i7, obj)) {
                        ((ov) e7Var.a).e(i10, Float.floatToRawIntBits(((Float) ((Unsafe) ml3.c.a).getObject(obj, j)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (op1Var.a(i10, i7, obj)) {
                        ((ov) e7Var.a).e(i10, b(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (op1Var.a(i10, i7, obj)) {
                        ((ov) e7Var.a).e(i10, b(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (op1Var.a(i10, i7, obj)) {
                        ((ov) e7Var.a).f(i10, a(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (op1Var.a(i10, i7, obj)) {
                        ((ov) e7Var.a).d(i10, b(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (op1Var.a(i10, i7, obj)) {
                        ((ov) e7Var.a).e(i10, a(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (op1Var.a(i10, i7, obj)) {
                        ((ov) e7Var.a).a(i10, ((Boolean) ((Unsafe) ml3.c.a).getObject(obj, j)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (op1Var.a(i10, i7, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            ((ov) e7Var.a).b((String) object4, i10);
                            break;
                        } else {
                            ((ov) e7Var.a).b(i10, (hr) object4);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (op1Var.a(i10, i7, obj)) {
                        e7Var.b(i10, op1Var.c(i7), unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (op1Var.a(i10, i7, obj)) {
                        ((ov) e7Var.a).b(i10, (hr) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (op1Var.a(i10, i7, obj)) {
                        ((ov) e7Var.a).h(i10, a(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (op1Var.a(i10, i7, obj)) {
                        ((ov) e7Var.a).f(i10, a(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (op1Var.a(i10, i7, obj)) {
                        ((ov) e7Var.a).e(i10, a(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (op1Var.a(i10, i7, obj)) {
                        ((ov) e7Var.a).d(i10, b(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (op1Var.a(i10, i7, obj)) {
                        ((ov) e7Var.a).h(i10, ov.j(a(j, obj)));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (op1Var.a(i10, i7, obj)) {
                        ((ov) e7Var.a).e(i10, ov.b(b(j, obj)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (op1Var.a(i10, i7, obj)) {
                        Object object5 = unsafe.getObject(obj, j);
                        pio pioVarC4 = op1Var.c(i7);
                        e7Var.getClass();
                        ov ovVar4 = (ov) e7Var.a;
                        ovVar4.g(i10, 3);
                        pioVarC4.a(object5, e7Var);
                        ovVar4.g(i10, 4);
                        break;
                    } else {
                        break;
                    }
            }
            i7 += 3;
            i5 = 1048575;
        }
        op1Var.l.getClass();
        ((ku0) obj).b.a(e7Var);
    }

    @Override // defpackage.pio
    public final void a(Object obj, Object obj2) {
        Object obj3;
        e(obj);
        byte[] bArr = yb1.a;
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                b03.a(this.l, obj, obj2);
                return;
            }
            int i2 = iArr[i + 1];
            long j = 1048575 & i2;
            int i3 = iArr[i];
            switch ((i2 & 267386880) >>> 20) {
                case 0:
                    obj3 = obj;
                    if (a(i, obj2)) {
                        ov ovVar = ml3.c;
                        ovVar.a(obj3, j, ovVar.b(j, obj2));
                        c(i, obj3);
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 1:
                    obj3 = obj;
                    if (a(i, obj2)) {
                        ov ovVar2 = ml3.c;
                        ovVar2.a(obj3, j, ovVar2.c(j, obj2));
                        c(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 2:
                    obj3 = obj;
                    if (a(i, obj2)) {
                        ov ovVar3 = ml3.c;
                        ovVar3.a(obj3, j, ((Unsafe) ovVar3.a).getLong(obj2, j));
                        c(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 3:
                    obj3 = obj;
                    if (a(i, obj2)) {
                        ov ovVar4 = ml3.c;
                        ovVar4.a(obj3, j, ((Unsafe) ovVar4.a).getLong(obj2, j));
                        c(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 4:
                    obj3 = obj;
                    if (a(i, obj2)) {
                        ov ovVar5 = ml3.c;
                        ovVar5.a(((Unsafe) ovVar5.a).getInt(obj2, j), j, obj3);
                        c(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 5:
                    obj3 = obj;
                    if (a(i, obj2)) {
                        ov ovVar6 = ml3.c;
                        ovVar6.a(obj3, j, ((Unsafe) ovVar6.a).getLong(obj2, j));
                        c(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 6:
                    obj3 = obj;
                    if (a(i, obj2)) {
                        ov ovVar7 = ml3.c;
                        ovVar7.a(((Unsafe) ovVar7.a).getInt(obj2, j), j, obj3);
                        c(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 7:
                    obj3 = obj;
                    if (a(i, obj2)) {
                        ov ovVar8 = ml3.c;
                        ovVar8.a(obj3, j, ovVar8.a(j, obj2));
                        c(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 8:
                    obj3 = obj;
                    if (a(i, obj2)) {
                        ov ovVar9 = ml3.c;
                        ovVar9.a(j, obj3, ((Unsafe) ovVar9.a).getObject(obj2, j));
                        c(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 9:
                    obj3 = obj;
                    b(i, obj3, obj2);
                    continue;
                    i += 3;
                    obj = obj3;
                case 10:
                    obj3 = obj;
                    if (a(i, obj2)) {
                        ov ovVar10 = ml3.c;
                        ovVar10.a(j, obj3, ((Unsafe) ovVar10.a).getObject(obj2, j));
                        c(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 11:
                    obj3 = obj;
                    if (a(i, obj2)) {
                        ov ovVar11 = ml3.c;
                        ovVar11.a(((Unsafe) ovVar11.a).getInt(obj2, j), j, obj3);
                        c(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 12:
                    obj3 = obj;
                    if (a(i, obj2)) {
                        ov ovVar12 = ml3.c;
                        ovVar12.a(((Unsafe) ovVar12.a).getInt(obj2, j), j, obj3);
                        c(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 13:
                    obj3 = obj;
                    if (a(i, obj2)) {
                        ov ovVar13 = ml3.c;
                        ovVar13.a(((Unsafe) ovVar13.a).getInt(obj2, j), j, obj3);
                        c(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 14:
                    obj3 = obj;
                    if (a(i, obj2)) {
                        ov ovVar14 = ml3.c;
                        ovVar14.a(obj3, j, ((Unsafe) ovVar14.a).getLong(obj2, j));
                        c(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 15:
                    obj3 = obj;
                    if (a(i, obj2)) {
                        ov ovVar15 = ml3.c;
                        ovVar15.a(((Unsafe) ovVar15.a).getInt(obj2, j), j, obj3);
                        c(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 16:
                    if (a(i, obj2)) {
                        ov ovVar16 = ml3.c;
                        obj3 = obj;
                        ovVar16.a(obj3, j, ((Unsafe) ovVar16.a).getLong(obj2, j));
                        c(i, obj3);
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 17:
                    b(i, obj, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    ov ovVar17 = ml3.c;
                    flp flpVarA = (flp) ((Unsafe) ovVar17.a).getObject(obj, j);
                    flp flpVar = (flp) ((Unsafe) ovVar17.a).getObject(obj2, j);
                    int size = flpVarA.size();
                    int size2 = flpVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!((j) flpVarA).a) {
                            flpVarA = flpVarA.a(size2 + size);
                        }
                        flpVarA.addAll(flpVar);
                    }
                    if (size > 0) {
                        flpVar = flpVarA;
                    }
                    ovVar17.a(j, obj, flpVar);
                    break;
                case 50:
                    Class cls = b03.a;
                    ov ovVar18 = ml3.c;
                    gn1 gn1VarB = (gn1) ((Unsafe) ovVar18.a).getObject(obj, j);
                    gn1 gn1Var = (gn1) ((Unsafe) ovVar18.a).getObject(obj2, j);
                    if (!gn1Var.isEmpty()) {
                        if (!gn1VarB.a) {
                            gn1VarB = gn1VarB.b();
                        }
                        if (!gn1VarB.a) {
                            t3p.o();
                            return;
                        } else if (!gn1Var.isEmpty()) {
                            gn1VarB.putAll(gn1Var);
                        }
                    }
                    ovVar18.a(j, obj, gn1VarB);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (a(i3, i, obj2)) {
                        ov ovVar19 = ml3.c;
                        ovVar19.a(j, obj, ((Unsafe) ovVar19.a).getObject(obj2, j));
                        c(i3, i, obj);
                        break;
                    }
                    break;
                case 60:
                    c(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (a(i3, i, obj2)) {
                        ov ovVar20 = ml3.c;
                        ovVar20.a(j, obj, ((Unsafe) ovVar20.a).getObject(obj2, j));
                        c(i3, i, obj);
                        break;
                    }
                    break;
                case 68:
                    c(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }

    @Override // defpackage.pio
    public final void a(Object obj, byte[] bArr, int i, int i2, defpackage.f72 f72Var) {
        a(obj, bArr, i, i2, 0, f72Var);
    }

    public final boolean a(int i, int i2, Object obj) {
        return ((Unsafe) ml3.c.a).getInt(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final boolean a(int i, ku0 ku0Var, ku0 ku0Var2) {
        return a(i, (Object) ku0Var) == a(i, (Object) ku0Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x014f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0150 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.op1.a(int, java.lang.Object):boolean");
    }

    @Override // defpackage.pio
    public final boolean a(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.h) {
            int i6 = this.g[i4];
            int[] iArr = this.a;
            int i7 = iArr[i6 + 1];
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i5 = o.getInt(obj, i9);
                }
                i2 = i5;
                i = i9;
            } else {
                i = i3;
                i2 = i5;
            }
            op1 op1Var = this;
            Object obj2 = obj;
            if ((268435456 & i7) == 0 || op1Var.a(obj2, i6, i, i2, i10)) {
                int i11 = (267386880 & i7) >>> 20;
                if (i11 == 9 || i11 == 17) {
                    if (op1Var.a(obj2, i6, i, i2, i10)) {
                        if (!op1Var.c(i6).a(((Unsafe) ml3.c.a).getObject(obj2, i7 & 1048575))) {
                        }
                    } else {
                        continue;
                    }
                    i4++;
                    this = op1Var;
                    obj = obj2;
                    i3 = i;
                    i5 = i2;
                } else {
                    if (i11 != 27) {
                        if (i11 == 60 || i11 == 68) {
                            if (op1Var.a(iArr[i6], i6, obj2)) {
                                if (!op1Var.c(i6).a(((Unsafe) ml3.c.a).getObject(obj2, i7 & 1048575))) {
                                }
                            } else {
                                continue;
                            }
                            i4++;
                            this = op1Var;
                            obj = obj2;
                            i3 = i;
                            i5 = i2;
                        } else if (i11 != 49) {
                            if (i11 == 50) {
                                gn1 gn1Var = (gn1) ((Unsafe) ml3.c.a).getObject(obj2, i7 & 1048575);
                                if (!gn1Var.isEmpty() && ((cs3) ((dn1) op1Var.b(i6)).a.b).a == ds3.j) {
                                    pio pioVarA = null;
                                    for (Object obj3 : gn1Var.values()) {
                                        if (pioVarA == null) {
                                            pioVarA = zl2.c.a(((ku0) obj3).getClass());
                                        }
                                        if (!pioVarA.a(obj3)) {
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                            i4++;
                            this = op1Var;
                            obj = obj2;
                            i3 = i;
                            i5 = i2;
                        }
                    }
                    List list = (List) ((Unsafe) ml3.c.a).getObject(obj2, i7 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        pio pioVarC = op1Var.c(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (pioVarC.a(list.get(i12))) {
                            }
                        }
                    }
                    i4++;
                    this = op1Var;
                    obj = obj2;
                    i3 = i;
                    i5 = i2;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean a(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? a(i, obj) : (i3 & i4) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x0537  */
    @Override // defpackage.pio
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(ads_mobile_sdk.ku0 r18) {
        /*
            Method dump skipped, instructions count: 1906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.op1.b(ads_mobile_sdk.ku0):int");
    }

    public final Object b(int i) {
        return this.b[(i / 3) << 1];
    }

    public final Object b(int i, int i2, Object obj) {
        pio pioVarC = c(i2);
        if (!a(i, i2, obj)) {
            return pioVarC.a();
        }
        Object object = o.getObject(obj, this.a[i2 + 1] & 1048575);
        if (g(object)) {
            return object;
        }
        ku0 ku0VarA = pioVarC.a();
        if (object != null) {
            pioVarC.a(ku0VarA, object);
        }
        return ku0VarA;
    }

    public final Object b(int i, Object obj) {
        pio pioVarC = c(i);
        long j = this.a[i + 1] & 1048575;
        if (!a(i, obj)) {
            return pioVarC.a();
        }
        Object object = o.getObject(obj, j);
        if (g(object)) {
            return object;
        }
        ku0 ku0VarA = pioVarC.a();
        if (object != null) {
            pioVarC.a(ku0VarA, object);
        }
        return ku0VarA;
    }

    public final void b(int i, Object obj, Object obj2) {
        if (a(i, obj2)) {
            int[] iArr = this.a;
            long j = iArr[i + 1] & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                qp2.n(p3p.j(iArr[i], "Source subfield ", " is present but null: ", String.valueOf(obj2)));
                return;
            }
            pio pioVarC = c(i);
            if (!a(i, obj)) {
                if (g(object)) {
                    ku0 ku0VarA = pioVarC.a();
                    pioVarC.a(ku0VarA, object);
                    unsafe.putObject(obj, j, ku0VarA);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                c(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!g(object2)) {
                ku0 ku0VarA2 = pioVarC.a();
                pioVarC.a(ku0VarA2, object2);
                unsafe.putObject(obj, j, ku0VarA2);
                object2 = ku0VarA2;
            }
            pioVarC.a(object2, object);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0280, code lost:
    
        continue;
     */
    @Override // defpackage.pio
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(ads_mobile_sdk.ku0 r11, ads_mobile_sdk.ku0 r12) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.op1.b(ads_mobile_sdk.ku0, ads_mobile_sdk.ku0):boolean");
    }

    public final pio c(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        pio pioVar = (pio) objArr[i2];
        if (pioVar != null) {
            return pioVar;
        }
        pio pioVarA = zl2.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = pioVarA;
        return pioVarA;
    }

    public final void c(int i, int i2, Object obj) {
        ml3.c.a(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final void c(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        int i3 = 1 << (i2 >>> 20);
        ov ovVar = ml3.c;
        ovVar.a(((Unsafe) ovVar.a).getInt(obj, j) | i3, j, obj);
    }

    public final void c(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (a(i2, i, obj2)) {
            long j = iArr[i + 1] & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                qp2.n(p3p.j(iArr[i], "Source subfield ", " is present but null: ", String.valueOf(obj2)));
                return;
            }
            pio pioVarC = c(i);
            if (!a(i2, i, obj)) {
                if (g(object)) {
                    ku0 ku0VarA = pioVarC.a();
                    pioVarC.a(ku0VarA, object);
                    unsafe.putObject(obj, j, ku0VarA);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                c(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!g(object2)) {
                ku0 ku0VarA2 = pioVarC.a();
                pioVarC.a(ku0VarA2, object2);
                unsafe.putObject(obj, j, ku0VarA2);
                object2 = ku0VarA2;
            }
            pioVarC.a(object2, object);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    @Override // defpackage.pio
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = g(r10)
            if (r0 == 0) goto L9a
            boolean r0 = r10 instanceof ads_mobile_sdk.ku0
            r1 = 0
            if (r0 == 0) goto L19
            r0 = r10
            ads_mobile_sdk.ku0 r0 = (ads_mobile_sdk.ku0) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.a(r2)
            r0.a = r1
            r0.l()
        L19:
            int[] r0 = r9.a
            int r2 = r0.length
            r3 = r1
        L1d:
            if (r3 >= r2) goto L8b
            int r4 = r3 + 1
            r4 = r0[r4]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r4
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r7
            int r4 = r4 >>> 20
            r7 = 9
            sun.misc.Unsafe r8 = ads_mobile_sdk.op1.o
            if (r4 == r7) goto L77
            r7 = 60
            if (r4 == r7) goto L63
            r7 = 68
            if (r4 == r7) goto L63
            switch(r4) {
                case 17: goto L77;
                case 18: goto L4e;
                case 19: goto L4e;
                case 20: goto L4e;
                case 21: goto L4e;
                case 22: goto L4e;
                case 23: goto L4e;
                case 24: goto L4e;
                case 25: goto L4e;
                case 26: goto L4e;
                case 27: goto L4e;
                case 28: goto L4e;
                case 29: goto L4e;
                case 30: goto L4e;
                case 31: goto L4e;
                case 32: goto L4e;
                case 33: goto L4e;
                case 34: goto L4e;
                case 35: goto L4e;
                case 36: goto L4e;
                case 37: goto L4e;
                case 38: goto L4e;
                case 39: goto L4e;
                case 40: goto L4e;
                case 41: goto L4e;
                case 42: goto L4e;
                case 43: goto L4e;
                case 44: goto L4e;
                case 45: goto L4e;
                case 46: goto L4e;
                case 47: goto L4e;
                case 48: goto L4e;
                case 49: goto L4e;
                case 50: goto L3f;
                default: goto L3e;
            }
        L3e:
            goto L88
        L3f:
            java.lang.Object r4 = r8.getObject(r10, r5)
            if (r4 == 0) goto L88
            r7 = r4
            ads_mobile_sdk.gn1 r7 = (ads_mobile_sdk.gn1) r7
            r7.a = r1
            r8.putObject(r10, r5, r4)
            goto L88
        L4e:
            ads_mobile_sdk.ov r4 = ads_mobile_sdk.ml3.c
            java.lang.Object r4 = r4.a
            sun.misc.Unsafe r4 = (sun.misc.Unsafe) r4
            java.lang.Object r4 = r4.getObject(r10, r5)
            flp r4 = (defpackage.flp) r4
            ads_mobile_sdk.j r4 = (ads_mobile_sdk.j) r4
            boolean r5 = r4.a
            if (r5 == 0) goto L88
            r4.a = r1
            goto L88
        L63:
            r4 = r0[r3]
            boolean r4 = r9.a(r4, r3, r10)
            if (r4 == 0) goto L88
            pio r4 = r9.c(r3)
            java.lang.Object r5 = r8.getObject(r10, r5)
            r4.c(r5)
            goto L88
        L77:
            boolean r4 = r9.a(r3, r10)
            if (r4 == 0) goto L88
            pio r4 = r9.c(r3)
            java.lang.Object r5 = r8.getObject(r10, r5)
            r4.c(r5)
        L88:
            int r3 = r3 + 3
            goto L1d
        L8b:
            ioj r9 = r9.l
            r9.getClass()
            ads_mobile_sdk.ku0 r10 = (ads_mobile_sdk.ku0) r10
            ads_mobile_sdk.yk3 r9 = r10.b
            boolean r10 = r9.e
            if (r10 == 0) goto L9a
            r9.e = r1
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.op1.c(java.lang.Object):void");
    }

    @Override // defpackage.pio
    public final int d(ku0 ku0Var) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int[] iArr = this.a;
        int length = iArr.length;
        int iHashCode = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int i4 = iArr[i3 + 1];
            int i5 = (267386880 & i4) >>> 20;
            if (i5 <= 50 || i5 >= 69) {
                long j = i4 & 1048575;
                int iHashCode2 = 37;
                switch (i5) {
                    case 0:
                        i = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(ml3.c.b(j, ku0Var));
                        byte[] bArr = yb1.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 1:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(ml3.c.c(j, ku0Var));
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        jDoubleToLongBits = ((Unsafe) ml3.c.a).getLong(ku0Var, j);
                        byte[] bArr2 = yb1.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 3:
                        i = iHashCode * 53;
                        jDoubleToLongBits = ((Unsafe) ml3.c.a).getLong(ku0Var, j);
                        byte[] bArr3 = yb1.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 4:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((Unsafe) ml3.c.a).getInt(ku0Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        jDoubleToLongBits = ((Unsafe) ml3.c.a).getLong(ku0Var, j);
                        byte[] bArr4 = yb1.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 6:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((Unsafe) ml3.c.a).getInt(ku0Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 7:
                        i2 = iHashCode * 53;
                        boolean zA = ml3.c.a(j, ku0Var);
                        byte[] bArr5 = yb1.a;
                        iFloatToIntBits = zA ? 1231 : 1237;
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 8:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((String) ((Unsafe) ml3.c.a).getObject(ku0Var, j)).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 9:
                        Object object = ((Unsafe) ml3.c.a).getObject(ku0Var, j);
                        if (object != null) {
                            iHashCode2 = object.hashCode();
                        }
                        iHashCode = (iHashCode * 53) + iHashCode2;
                        break;
                    case 10:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((Unsafe) ml3.c.a).getObject(ku0Var, j).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 11:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((Unsafe) ml3.c.a).getInt(ku0Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 12:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((Unsafe) ml3.c.a).getInt(ku0Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 13:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((Unsafe) ml3.c.a).getInt(ku0Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = ((Unsafe) ml3.c.a).getLong(ku0Var, j);
                        byte[] bArr6 = yb1.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 15:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((Unsafe) ml3.c.a).getInt(ku0Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        jDoubleToLongBits = ((Unsafe) ml3.c.a).getLong(ku0Var, j);
                        byte[] bArr7 = yb1.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 17:
                        Object object2 = ((Unsafe) ml3.c.a).getObject(ku0Var, j);
                        if (object2 != null) {
                            iHashCode2 = object2.hashCode();
                        }
                        iHashCode = (iHashCode * 53) + iHashCode2;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((Unsafe) ml3.c.a).getObject(ku0Var, j).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 50:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((Unsafe) ml3.c.a).getObject(ku0Var, j).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i6 = this.i;
        while (true) {
            int[] iArr2 = this.g;
            if (i6 >= iArr2.length) {
                this.l.getClass();
                return ku0Var.b.hashCode() + (iHashCode * 53);
            }
            if (!a(0, iArr2[i6], ku0Var)) {
                iHashCode = ((Unsafe) ml3.c.a).getObject(ku0Var, iArr[r3 + 1] & 1048575).hashCode() + (iHashCode * 53);
            }
            i6++;
        }
    }

    public final void d(int i, Object obj, Object obj2) {
        o.putObject(obj, this.a[i + 1] & 1048575, obj2);
        c(i, obj);
    }
}
