package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class rwd implements bni {
    public static final int[] n = new int[0];
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final hv9 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final qpe j;
    public final khc k;
    public final hmm l;
    public final kad m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new bnm((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public rwd(int[] iArr, Object[] objArr, int i, int i2, hv9 hv9Var, int[] iArr2, int i3, int i4, qpe qpeVar, khc khcVar, hmm hmmVar, fl8 fl8Var, kad kadVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = Objects.nonNull(hv9Var);
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = qpeVar;
        this.k = khcVar;
        this.l = hmmVar;
        this.e = hv9Var;
        this.m = kadVar;
    }

    public static Field B(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbS = p3p.s("Field ", str, " for ");
            sbS.append(cls.getName());
            sbS.append(" not found. Known fields are ");
            sbS.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbS.toString());
        }
    }

    public static int E(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean l(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof hv9) {
            return ((hv9) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0394  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.rwd s(defpackage.ekh r32, defpackage.qpe r33, defpackage.khc r34, defpackage.hmm r35, defpackage.fl8 r36, defpackage.kad r37) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwd.s(ekh, qpe, khc, hmm, fl8, kad):rwd");
    }

    public static long t(int i) {
        return i & 1048575;
    }

    public static int u(Object obj, long j) {
        return ((Integer) hnm.i(obj, j)).intValue();
    }

    public static long v(Object obj, long j) {
        return ((Long) hnm.i(obj, j)).longValue();
    }

    public final void A(int i, r05 r05Var, Object obj) throws zib, yib {
        boolean z = (536870912 & i) != 0;
        khc khcVar = this.k;
        int i2 = i & 1048575;
        if (z) {
            khcVar.getClass();
            r05Var.i0(khc.a(i2, obj), true);
        } else {
            khcVar.getClass();
            r05Var.i0(khc.a(i2, obj), false);
        }
    }

    public final void C(Object obj, int i) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        hnm.n(obj, j, hnm.g(obj, j) | (1 << (i2 >>> 20)));
    }

    public final void D(Object obj, int i, int i2) {
        hnm.n(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final int F(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x082c A[Catch: all -> 0x0852, TryCatch #10 {all -> 0x0852, blocks: (B:154:0x0827, B:156:0x082c, B:157:0x0831, B:111:0x04f9, B:112:0x04fe, B:113:0x0516, B:114:0x052e, B:115:0x0546, B:116:0x055e, B:117:0x0576, B:118:0x058e, B:119:0x05a6, B:120:0x05be, B:121:0x05e6, B:122:0x0606, B:123:0x0626, B:124:0x0647, B:125:0x0668, B:126:0x068b, B:127:0x06ab, B:128:0x06c4, B:129:0x06ec, B:130:0x06fd, B:131:0x071f, B:132:0x0740, B:133:0x0761, B:134:0x0781, B:135:0x07a1, B:136:0x07c1, B:137:0x07e4, B:143:0x0806), top: B:189:0x0827 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x085a A[LOOP:3: B:170:0x0858->B:171:0x085a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0837 A[SYNTHETIC] */
    @Override // defpackage.bni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r21, defpackage.r05 r22, defpackage.zk8 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwd.a(java.lang.Object, r05, zk8):void");
    }

    @Override // defpackage.bni
    public final void b(Object obj, eme emeVar) throws IOException {
        int i;
        int i2;
        int i3;
        rwd rwdVar = this;
        emeVar.getClass();
        x75 x75Var = (x75) emeVar.a;
        int[] iArr = rwdVar.a;
        int length = iArr.length;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int iF = rwdVar.F(i6);
            int i8 = iArr[i6];
            int iE = E(iF);
            Unsafe unsafe = o;
            if (iE <= 17) {
                int i9 = iArr[i6 + 2];
                i = 1;
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                int i11 = 1 << (i9 >>> 20);
                i2 = iF;
                i3 = i11;
            } else {
                i = 1;
                i2 = iF;
                i3 = 0;
            }
            long j = i2 & i4;
            switch (iE) {
                case 0:
                    if (rwdVar.k(obj, i6, i5, i7, i3)) {
                        x75Var.s(i8, Double.doubleToRawLongBits(hnm.c.f(obj, j)));
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 1:
                    if (rwdVar.k(obj, i6, i5, i7, i3)) {
                        x75Var.q(i8, Float.floatToRawIntBits(hnm.c.g(obj, j)));
                        break;
                    }
                    break;
                case 2:
                    if (rwdVar.k(obj, i6, i5, i7, i3)) {
                        x75Var.D(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 3:
                    if (rwdVar.k(obj, i6, i5, i7, i3)) {
                        x75Var.D(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 4:
                    if (rwdVar.k(obj, i6, i5, i7, i3)) {
                        x75Var.u(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 5:
                    if (rwdVar.k(obj, i6, i5, i7, i3)) {
                        x75Var.s(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 6:
                    if (rwdVar.k(obj, i6, i5, i7, i3)) {
                        x75Var.q(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 7:
                    if (rwdVar.k(obj, i6, i5, i7, i3)) {
                        x75Var.n(i8, hnm.c.d(obj, j));
                        break;
                    }
                    break;
                case 8:
                    if (rwdVar.k(obj, i6, i5, i7, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            x75Var.y(i8, (String) object);
                            break;
                        } else {
                            x75Var.o(i8, (d54) object);
                            break;
                        }
                    }
                    break;
                case 9:
                    if (rwdVar.k(obj, i6, i5, i7, i3)) {
                        x75Var.x(i8, (x5) unsafe.getObject(obj, j), rwdVar.i(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 10:
                    if (rwdVar.k(obj, i6, i5, i7, i3)) {
                        x75Var.o(i8, (d54) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 11:
                    if (rwdVar.k(obj, i6, i5, i7, i3)) {
                        x75Var.B(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 12:
                    if (rwdVar.k(obj, i6, i5, i7, i3)) {
                        x75Var.u(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 13:
                    if (rwdVar.k(obj, i6, i5, i7, i3)) {
                        x75Var.q(i8, unsafe.getInt(obj, j));
                        break;
                    }
                    break;
                case 14:
                    if (rwdVar.k(obj, i6, i5, i7, i3)) {
                        x75Var.s(i8, unsafe.getLong(obj, j));
                        break;
                    }
                    break;
                case 15:
                    if (rwdVar.k(obj, i6, i5, i7, i3)) {
                        int i12 = unsafe.getInt(obj, j);
                        x75Var.B(i8, (i12 << 1) ^ (i12 >> 31));
                        break;
                    }
                    break;
                case 16:
                    if (rwdVar.k(obj, i6, i5, i7, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        x75Var.D(i8, (j2 << 1) ^ (j2 >> 63));
                        break;
                    }
                    break;
                case 17:
                    if (rwdVar.k(obj, i6, i5, i7, i3)) {
                        emeVar.w0(i8, unsafe.getObject(obj, j), rwdVar.i(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 18:
                    gni.n(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 19:
                    gni.r(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 20:
                    gni.t(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 21:
                    gni.z(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 22:
                    gni.s(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 23:
                    gni.q(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 24:
                    gni.p(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 25:
                    gni.m(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 26:
                    int i13 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = gni.a;
                    if (list == null) {
                        continue;
                    } else if (!list.isEmpty()) {
                        if (list instanceof e7c) {
                            e7c e7cVar = (e7c) list;
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                Object objK = e7cVar.k();
                                if (objK instanceof String) {
                                    x75Var.y(i13, (String) objK);
                                } else {
                                    x75Var.o(i13, (d54) objK);
                                }
                            }
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                x75Var.y(i13, (String) list.get(i15));
                            }
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 27:
                    int i16 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j);
                    bni bniVarI = rwdVar.i(i6);
                    Class cls2 = gni.a;
                    if (list2 == null) {
                        continue;
                    } else if (!list2.isEmpty()) {
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            x75Var.x(i16, (x5) list2.get(i17), bniVarI);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 28:
                    int i18 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = gni.a;
                    if (list3 == null) {
                        continue;
                    } else if (!list3.isEmpty()) {
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            x75Var.o(i18, (d54) list3.get(i19));
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 29:
                    gni.y(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 30:
                    gni.o(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 31:
                    gni.u(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 32:
                    gni.v(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 33:
                    gni.w(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 34:
                    gni.x(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, false);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 35:
                    gni.n(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, i == true ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 36:
                    gni.r(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, i == true ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 37:
                    gni.t(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, i == true ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 38:
                    gni.z(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, i == true ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 39:
                    gni.s(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, i == true ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 40:
                    gni.q(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, i == true ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 41:
                    gni.p(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, i == true ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 42:
                    gni.m(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, i == true ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 43:
                    gni.y(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, i == true ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 44:
                    gni.o(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, i == true ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 45:
                    gni.u(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, i == true ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 46:
                    gni.v(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, i == true ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 47:
                    gni.w(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, i == true ? 1 : 0);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 48:
                    gni.x(iArr[i6], (List) unsafe.getObject(obj, j), emeVar, true);
                    continue;
                    i6 += 3;
                    i4 = 1048575;
                case 49:
                    int i20 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j);
                    bni bniVarI2 = rwdVar.i(i6);
                    Class cls4 = gni.a;
                    if (list4 == null) {
                        continue;
                    } else if (!list4.isEmpty()) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            emeVar.w0(i20, list4.get(i21), bniVarI2);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        Object obj2 = rwdVar.b[(i6 / 3) << 1];
                        rwdVar.m.getClass();
                        g77 g77Var = ((bad) obj2).a;
                        for (Map.Entry entry : ((gad) object2).entrySet()) {
                            x75Var.A(i8, 2);
                            x75Var.C(bad.a(g77Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            g09.b(x75Var, (f4o) g77Var.a, i, key);
                            g09.b(x75Var, (h4o) g77Var.b, 2, value);
                            i = 1;
                        }
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 51:
                    if (rwdVar.m(obj, i8, i6)) {
                        x75Var.s(i8, Double.doubleToRawLongBits(((Double) hnm.i(obj, j)).doubleValue()));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 52:
                    if (rwdVar.m(obj, i8, i6)) {
                        x75Var.q(i8, Float.floatToRawIntBits(((Float) hnm.i(obj, j)).floatValue()));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 53:
                    if (rwdVar.m(obj, i8, i6)) {
                        x75Var.D(i8, v(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 54:
                    if (rwdVar.m(obj, i8, i6)) {
                        x75Var.D(i8, v(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 55:
                    if (rwdVar.m(obj, i8, i6)) {
                        x75Var.u(i8, u(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 56:
                    if (rwdVar.m(obj, i8, i6)) {
                        x75Var.s(i8, v(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 57:
                    if (rwdVar.m(obj, i8, i6)) {
                        x75Var.q(i8, u(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 58:
                    if (rwdVar.m(obj, i8, i6)) {
                        x75Var.n(i8, ((Boolean) hnm.i(obj, j)).booleanValue());
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 59:
                    if (rwdVar.m(obj, i8, i6)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            x75Var.y(i8, (String) object3);
                        } else {
                            x75Var.o(i8, (d54) object3);
                        }
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 60:
                    if (rwdVar.m(obj, i8, i6)) {
                        x75Var.x(i8, (x5) unsafe.getObject(obj, j), rwdVar.i(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 61:
                    if (rwdVar.m(obj, i8, i6)) {
                        x75Var.o(i8, (d54) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 62:
                    if (rwdVar.m(obj, i8, i6)) {
                        x75Var.B(i8, u(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 63:
                    if (rwdVar.m(obj, i8, i6)) {
                        x75Var.u(i8, u(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 64:
                    if (rwdVar.m(obj, i8, i6)) {
                        x75Var.q(i8, u(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 65:
                    if (rwdVar.m(obj, i8, i6)) {
                        x75Var.s(i8, v(obj, j));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 66:
                    if (rwdVar.m(obj, i8, i6)) {
                        int iU = u(obj, j);
                        x75Var.B(i8, (iU << 1) ^ (iU >> 31));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 67:
                    if (rwdVar.m(obj, i8, i6)) {
                        long jV = v(obj, j);
                        x75Var.D(i8, (jV << (i == true ? 1L : 0L)) ^ (jV >> 63));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 68:
                    if (rwdVar.m(obj, i8, i6)) {
                        emeVar.w0(i8, unsafe.getObject(obj, j), rwdVar.i(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                default:
                    i6 += 3;
                    i4 = 1048575;
            }
            rwdVar = this;
            i6 += 3;
            i4 = 1048575;
        }
        rwdVar.l.getClass();
        ((hv9) obj).unknownFields.d(emeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c7  */
    @Override // defpackage.bni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.hv9 r12, defpackage.hv9 r13) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwd.c(hv9, hv9):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01ef A[PHI: r3
      0x01ef: PHI (r3v30 int) = (r3v10 int), (r3v33 int) binds: [B:82:0x01ed, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.bni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(defpackage.hv9 r12) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwd.d(hv9):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x04f4  */
    @Override // defpackage.bni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(defpackage.hv9 r18) {
        /*
            Method dump skipped, instructions count: 1842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwd.e(hv9):int");
    }

    public final boolean f(hv9 hv9Var, hv9 hv9Var2, int i) {
        return j(hv9Var, i) == j(hv9Var2, i);
    }

    public final void g(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (hnm.i(obj, F(i) & 1048575) == null) {
            return;
        }
        h(i);
    }

    public final void h(int i) {
        if (this.b[((i / 3) << 1) + 1] == null) {
            return;
        }
        h9o.t();
    }

    public final bni i(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        bni bniVar = (bni) objArr[i2];
        if (bniVar != null) {
            return bniVar;
        }
        bni bniVarA = y6h.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = bniVarA;
        return bniVarA;
    }

    @Override // defpackage.bni
    public final boolean isInitialized(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.h) {
            int i7 = this.g[i6];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int iF = F(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = o.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & iF) == 0 || k(obj, i2, i, i3, i11)) {
                int iE = E(iF);
                if (iE != 9 && iE != 17) {
                    if (iE != 27) {
                        if (iE == 60 || iE == 68) {
                            if (!m(obj, i8, i2) || i(i2).isInitialized(hnm.i(obj, iF & 1048575))) {
                                i6++;
                                i4 = i;
                                i5 = i3;
                            }
                        } else if (iE != 49) {
                            if (iE == 50) {
                                Object objI = hnm.i(obj, iF & 1048575);
                                this.m.getClass();
                                gad gadVar = (gad) objI;
                                if (gadVar.isEmpty()) {
                                    continue;
                                } else {
                                    if (((h4o) ((bad) this.b[(i2 / 3) << 1]).a.b).a == l4o.MESSAGE) {
                                        bni bniVarA = null;
                                        for (Object obj2 : gadVar.values()) {
                                            if (bniVarA == null) {
                                                bniVarA = y6h.c.a(obj2.getClass());
                                            }
                                            if (!bniVarA.isInitialized(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) hnm.i(obj, iF & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        bni bniVarI = i(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (bniVarI.isInitialized(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else if (!k(obj, i2, i, i3, i11) || i(i2).isInitialized(hnm.i(obj, iF & 1048575))) {
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(java.lang.Object r8, int r9) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwd.j(java.lang.Object, int):boolean");
    }

    public final boolean k(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? j(obj, i) : (i3 & i4) != 0;
    }

    public final boolean m(Object obj, int i, int i2) {
        return hnm.g(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    @Override // defpackage.bni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void makeImmutable(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = l(r10)
            if (r0 == 0) goto L9d
            boolean r0 = r10 instanceof defpackage.hv9
            r1 = 0
            if (r0 == 0) goto L19
            r0 = r10
            hv9 r0 = (defpackage.hv9) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.k(r2)
            r0.memoizedHashCode = r1
            r0.h()
        L19:
            int[] r0 = r9.a
            int r2 = r0.length
            r3 = r1
        L1d:
            if (r3 >= r2) goto L8e
            int r4 = r9.F(r3)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r4
            long r5 = (long) r5
            int r4 = E(r4)
            r7 = 9
            sun.misc.Unsafe r8 = defpackage.rwd.o
            if (r4 == r7) goto L7a
            r7 = 60
            if (r4 == r7) goto L66
            r7 = 68
            if (r4 == r7) goto L66
            switch(r4) {
                case 17: goto L7a;
                case 18: goto L52;
                case 19: goto L52;
                case 20: goto L52;
                case 21: goto L52;
                case 22: goto L52;
                case 23: goto L52;
                case 24: goto L52;
                case 25: goto L52;
                case 26: goto L52;
                case 27: goto L52;
                case 28: goto L52;
                case 29: goto L52;
                case 30: goto L52;
                case 31: goto L52;
                case 32: goto L52;
                case 33: goto L52;
                case 34: goto L52;
                case 35: goto L52;
                case 36: goto L52;
                case 37: goto L52;
                case 38: goto L52;
                case 39: goto L52;
                case 40: goto L52;
                case 41: goto L52;
                case 42: goto L52;
                case 43: goto L52;
                case 44: goto L52;
                case 45: goto L52;
                case 46: goto L52;
                case 47: goto L52;
                case 48: goto L52;
                case 49: goto L52;
                case 50: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L8b
        L3e:
            java.lang.Object r4 = r8.getObject(r10, r5)
            if (r4 == 0) goto L8b
            kad r7 = r9.m
            r7.getClass()
            r7 = r4
            gad r7 = (defpackage.gad) r7
            r7.a = r1
            r8.putObject(r10, r5, r4)
            goto L8b
        L52:
            khc r4 = r9.k
            r4.getClass()
            java.lang.Object r4 = defpackage.hnm.i(r10, r5)
            gfb r4 = (defpackage.gfb) r4
            o6 r4 = (defpackage.o6) r4
            boolean r5 = r4.a
            if (r5 == 0) goto L8b
            r4.a = r1
            goto L8b
        L66:
            r4 = r0[r3]
            boolean r4 = r9.m(r10, r4, r3)
            if (r4 == 0) goto L8b
            bni r4 = r9.i(r3)
            java.lang.Object r5 = r8.getObject(r10, r5)
            r4.makeImmutable(r5)
            goto L8b
        L7a:
            boolean r4 = r9.j(r10, r3)
            if (r4 == 0) goto L8b
            bni r4 = r9.i(r3)
            java.lang.Object r5 = r8.getObject(r10, r5)
            r4.makeImmutable(r5)
        L8b:
            int r3 = r3 + 3
            goto L1d
        L8e:
            hmm r9 = r9.l
            r9.getClass()
            hv9 r10 = (defpackage.hv9) r10
            emm r9 = r10.unknownFields
            boolean r10 = r9.e
            if (r10 == 0) goto L9d
            r9.e = r1
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwd.makeImmutable(java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // defpackage.bni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mergeFrom(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwd.mergeFrom(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        r9.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.lang.Object r8, int r9, java.lang.Object r10, defpackage.zk8 r11, defpackage.r05 r12) throws defpackage.zib, yib {
        /*
            r7 = this;
            int r9 = r7.F(r9)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r0
            long r0 = (long) r9
            java.lang.Object r9 = defpackage.hnm.i(r8, r0)
            kad r7 = r7.m
            if (r9 != 0) goto L1e
            r7.getClass()
            gad r9 = defpackage.gad.b
            gad r9 = r9.j()
            defpackage.hnm.p(r8, r0, r9)
            goto L35
        L1e:
            r7.getClass()
            r2 = r9
            gad r2 = (defpackage.gad) r2
            boolean r2 = r2.a
            if (r2 != 0) goto L35
            gad r2 = defpackage.gad.b
            gad r2 = r2.j()
            defpackage.kad.a(r2, r9)
            defpackage.hnm.p(r8, r0, r2)
            r9 = r2
        L35:
            r7.getClass()
            gad r9 = (defpackage.gad) r9
            bad r10 = (defpackage.bad) r10
            g77 r7 = r10.a
            r8 = 2
            r12.q0(r8)
            java.lang.Object r10 = r12.e
            s75 r10 = (defpackage.s75) r10
            int r0 = r10.D()
            int r0 = r10.m(r0)
            java.lang.Object r1 = r7.c
            qsg r1 = (qsg) r1
            java.lang.String r2 = ""
            r3 = r1
        L55:
            int r4 = r12.w()     // Catch: java.lang.Throwable -> La1
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L9a
            boolean r5 = r10.g()     // Catch: java.lang.Throwable -> La1
            if (r5 != 0) goto L9a
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L84
            if (r4 == r8) goto L77
            boolean r4 = r12.s0()     // Catch: defpackage.zib -> L8e java.lang.Throwable -> La1
            if (r4 != 0) goto L55
            cjb r4 = new cjb     // Catch: defpackage.zib -> L8e java.lang.Throwable -> La1
            r4.<init>(r6)     // Catch: defpackage.zib -> L8e java.lang.Throwable -> La1
            throw r4     // Catch: defpackage.zib -> L8e java.lang.Throwable -> La1
        L77:
            java.lang.Object r4 = r7.b     // Catch: defpackage.zib -> L8e java.lang.Throwable -> La1
            h4o r4 = (defpackage.h4o) r4     // Catch: defpackage.zib -> L8e java.lang.Throwable -> La1
            java.lang.Class r5 = r1.getClass()     // Catch: defpackage.zib -> L8e java.lang.Throwable -> La1
            java.lang.Object r3 = r12.N(r4, r5, r11)     // Catch: defpackage.zib -> L8e java.lang.Throwable -> La1
            goto L55
        L84:
            java.lang.Object r4 = r7.a     // Catch: defpackage.zib -> L8e java.lang.Throwable -> La1
            f4o r4 = (defpackage.f4o) r4     // Catch: defpackage.zib -> L8e java.lang.Throwable -> La1
            r5 = 0
            java.lang.Object r2 = r12.N(r4, r5, r5)     // Catch: defpackage.zib -> L8e java.lang.Throwable -> La1
            goto L55
        L8e:
            boolean r4 = r12.s0()     // Catch: java.lang.Throwable -> La1
            if (r4 != 0) goto L55
            cjb r7 = new cjb     // Catch: java.lang.Throwable -> La1
            r7.<init>(r6)     // Catch: java.lang.Throwable -> La1
            throw r7     // Catch: java.lang.Throwable -> La1
        L9a:
            r9.put(r2, r3)     // Catch: java.lang.Throwable -> La1
            r10.l(r0)
            return
        La1:
            r7 = move-exception
            r10.l(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwd.n(java.lang.Object, int, java.lang.Object, zk8, r05):void");
    }

    @Override // defpackage.bni
    public final hv9 newInstance() {
        this.j.getClass();
        return this.e.i();
    }

    public final void o(Object obj, Object obj2, int i) {
        if (j(obj2, i)) {
            long jF = F(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, jF);
            if (object == null) {
                rqd.c(this.a[i], obj2);
                return;
            }
            bni bniVarI = i(i);
            if (!j(obj, i)) {
                if (l(object)) {
                    hv9 hv9VarNewInstance = bniVarI.newInstance();
                    bniVarI.mergeFrom(hv9VarNewInstance, object);
                    unsafe.putObject(obj, jF, hv9VarNewInstance);
                } else {
                    unsafe.putObject(obj, jF, object);
                }
                C(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jF);
            if (!l(object2)) {
                hv9 hv9VarNewInstance2 = bniVarI.newInstance();
                bniVarI.mergeFrom(hv9VarNewInstance2, object2);
                unsafe.putObject(obj, jF, hv9VarNewInstance2);
                object2 = hv9VarNewInstance2;
            }
            bniVarI.mergeFrom(object2, object);
        }
    }

    public final void p(Object obj, Object obj2, int i) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (m(obj2, i2, i)) {
            long jF = F(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, jF);
            if (object == null) {
                rqd.c(iArr[i], obj2);
                return;
            }
            bni bniVarI = i(i);
            if (!m(obj, i2, i)) {
                if (l(object)) {
                    hv9 hv9VarNewInstance = bniVarI.newInstance();
                    bniVarI.mergeFrom(hv9VarNewInstance, object);
                    unsafe.putObject(obj, jF, hv9VarNewInstance);
                } else {
                    unsafe.putObject(obj, jF, object);
                }
                D(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jF);
            if (!l(object2)) {
                hv9 hv9VarNewInstance2 = bniVarI.newInstance();
                bniVarI.mergeFrom(hv9VarNewInstance2, object2);
                unsafe.putObject(obj, jF, hv9VarNewInstance2);
                object2 = hv9VarNewInstance2;
            }
            bniVarI.mergeFrom(object2, object);
        }
    }

    public final Object q(Object obj, int i) {
        bni bniVarI = i(i);
        long jF = F(i) & 1048575;
        if (!j(obj, i)) {
            return bniVarI.newInstance();
        }
        Object object = o.getObject(obj, jF);
        if (l(object)) {
            return object;
        }
        hv9 hv9VarNewInstance = bniVarI.newInstance();
        if (object != null) {
            bniVarI.mergeFrom(hv9VarNewInstance, object);
        }
        return hv9VarNewInstance;
    }

    public final Object r(Object obj, int i, int i2) {
        bni bniVarI = i(i2);
        if (!m(obj, i, i2)) {
            return bniVarI.newInstance();
        }
        Object object = o.getObject(obj, F(i2) & 1048575);
        if (l(object)) {
            return object;
        }
        hv9 hv9VarNewInstance = bniVarI.newInstance();
        if (object != null) {
            bniVarI.mergeFrom(hv9VarNewInstance, object);
        }
        return hv9VarNewInstance;
    }

    public final int w(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
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

    public final void x(Object obj, long j, r05 r05Var, bni bniVar, zk8 zk8Var) throws zib {
        int iC;
        this.k.getClass();
        gfb gfbVarA = khc.a(j, obj);
        s75 s75Var = (s75) r05Var.e;
        int i = r05Var.b;
        if ((i & 7) != 3) {
            throw cjb.g();
        }
        do {
            hv9 hv9VarNewInstance = bniVar.newInstance();
            r05Var.A(hv9VarNewInstance, bniVar, zk8Var);
            bniVar.makeImmutable(hv9VarNewInstance);
            gfbVarA.add(hv9VarNewInstance);
            if (s75Var.g() || r05Var.d != 0) {
                return;
            } else {
                iC = s75Var.C();
            }
        } while (iC == i);
        r05Var.d = iC;
    }

    public final void y(Object obj, int i, r05 r05Var, bni bniVar, zk8 zk8Var) throws cjb {
        int iC;
        this.k.getClass();
        gfb gfbVarA = khc.a(i & 1048575, obj);
        s75 s75Var = (s75) r05Var.e;
        int i2 = r05Var.b;
        if ((i2 & 7) != 2) {
            throw cjb.g();
        }
        do {
            hv9 hv9VarNewInstance = bniVar.newInstance();
            r05Var.C(hv9VarNewInstance, bniVar, zk8Var);
            bniVar.makeImmutable(hv9VarNewInstance);
            gfbVarA.add(hv9VarNewInstance);
            if (s75Var.g() || r05Var.d != 0) {
                return;
            } else {
                iC = s75Var.C();
            }
        } while (iC == i2);
        r05Var.d = iC;
    }

    public final void z(int i, r05 r05Var, Object obj) throws zib, yib {
        if ((536870912 & i) != 0) {
            r05Var.q0(2);
            hnm.p(obj, i & 1048575, ((s75) r05Var.e).B());
            return;
        }
        int i2 = i & 1048575;
        if (!this.f) {
            hnm.p(obj, i2, r05Var.G());
        } else {
            r05Var.q0(2);
            hnm.p(obj, i2, ((s75) r05Var.e).A());
        }
    }
}
