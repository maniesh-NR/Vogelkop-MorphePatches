package ads_mobile_sdk;

import defpackage.flp;
import defpackage.fop;
import defpackage.ioj;
import defpackage.kbp;
import defpackage.ogp;
import defpackage.t3p;
import defpackage.tkp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class b03 {
    public static final Class a;
    public static final ioj b;

    static {
        Class<?> cls;
        int i = qe.a;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = new ioj((byte) 17);
    }

    public static Object a(Object obj, int i, int i2, Object obj2, ioj iojVar) {
        if (obj2 == null) {
            iojVar.getClass();
            obj2 = ioj.c(obj);
        }
        iojVar.getClass();
        ((yk3) obj2).a(i << 3, Long.valueOf(i2));
        return obj2;
    }

    public static Object a(Object obj, int i, flp flpVar, ogp ogpVar, Object obj2, ioj iojVar) {
        if (ogpVar == null) {
            return obj2;
        }
        if (!(flpVar instanceof RandomAccess)) {
            Iterator it = flpVar.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!ogpVar.a(iIntValue)) {
                    obj2 = a(obj, i, iIntValue, obj2, iojVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = flpVar.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) flpVar.get(i3);
            int iIntValue2 = num.intValue();
            if (ogpVar.a(iIntValue2)) {
                if (i3 != i2) {
                    flpVar.set(i2, num);
                }
                i2++;
            } else {
                obj2 = a(obj, i, iIntValue2, obj2, iojVar);
            }
        }
        if (i2 != size) {
            flpVar.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void a(int i, List list, e7 e7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e7Var.getClass();
        ov ovVar = (ov) e7Var.a;
        int i2 = 0;
        if (list instanceof fop) {
            sko.s(list);
            if (z) {
                ovVar.g(i, 2);
                ovVar.m(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                ovVar.a(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        ovVar.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        ovVar.m(i3);
        while (i2 < list.size()) {
            ovVar.a(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void a(ioj iojVar, Object obj, Object obj2) {
        iojVar.getClass();
        ku0 ku0Var = (ku0) obj;
        yk3 yk3Var = ku0Var.b;
        yk3 yk3Var2 = ((ku0) obj2).b;
        yk3 yk3Var3 = yk3.f;
        if (!yk3Var3.equals(yk3Var2)) {
            if (yk3Var3.equals(yk3Var)) {
                int i = yk3Var.a + yk3Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(yk3Var.b, i);
                System.arraycopy(yk3Var2.b, 0, iArrCopyOf, yk3Var.a, yk3Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(yk3Var.c, i);
                System.arraycopy(yk3Var2.c, 0, objArrCopyOf, yk3Var.a, yk3Var2.a);
                yk3Var = new yk3(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                yk3Var.getClass();
                if (!yk3Var2.equals(yk3Var3)) {
                    if (!yk3Var.e) {
                        t3p.o();
                        return;
                    }
                    int i2 = yk3Var.a + yk3Var2.a;
                    yk3Var.a(i2);
                    System.arraycopy(yk3Var2.b, 0, yk3Var.b, yk3Var.a, yk3Var2.a);
                    System.arraycopy(yk3Var2.c, 0, yk3Var.c, yk3Var.a, yk3Var2.a);
                    yk3Var.a = i2;
                }
            }
        }
        ku0Var.b = yk3Var;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qb1)) {
            int iA = 0;
            while (i < size) {
                iA += ov.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        qb1 qb1Var = (qb1) list;
        int iA2 = 0;
        while (i < size) {
            qb1Var.d(i);
            iA2 += ov.a(qb1Var.b[i]);
            i++;
        }
        return iA2;
    }

    public static void b(int i, List list, e7 e7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e7Var.getClass();
        ov ovVar = (ov) e7Var.a;
        int i2 = 0;
        if (list instanceof kbp) {
            sko.s(list);
            if (z) {
                ovVar.g(i, 2);
                ovVar.m(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                ovVar.d(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        ovVar.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        ovVar.m(i3);
        while (i2 < list.size()) {
            ovVar.c(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void c(int i, List list, e7 e7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e7Var.getClass();
        ov ovVar = (ov) e7Var.a;
        int i2 = 0;
        if (!(list instanceof qb1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ovVar.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ovVar.g(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += ov.a(((Integer) list.get(i3)).intValue());
            }
            ovVar.m(iA);
            while (i2 < list.size()) {
                ovVar.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        qb1 qb1Var = (qb1) list;
        if (!z) {
            while (i2 < qb1Var.c) {
                qb1Var.d(i2);
                ovVar.f(i, qb1Var.b[i2]);
                i2++;
            }
            return;
        }
        ovVar.g(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < qb1Var.c; i4++) {
            qb1Var.d(i4);
            iA2 += ov.a(qb1Var.b[i4]);
        }
        ovVar.m(iA2);
        while (i2 < qb1Var.c) {
            qb1Var.d(i2);
            ovVar.l(qb1Var.b[i2]);
            i2++;
        }
    }

    public static void d(int i, List list, e7 e7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e7Var.getClass();
        ov ovVar = (ov) e7Var.a;
        int i2 = 0;
        if (!(list instanceof qb1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ovVar.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ovVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            ovVar.m(i3);
            while (i2 < list.size()) {
                ovVar.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        qb1 qb1Var = (qb1) list;
        if (!z) {
            while (i2 < qb1Var.c) {
                qb1Var.d(i2);
                ovVar.e(i, qb1Var.b[i2]);
                i2++;
            }
            return;
        }
        ovVar.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qb1Var.c; i6++) {
            qb1Var.d(i6);
            int i7 = qb1Var.b[i6];
            i5 += 4;
        }
        ovVar.m(i5);
        while (i2 < qb1Var.c) {
            qb1Var.d(i2);
            ovVar.k(qb1Var.b[i2]);
            i2++;
        }
    }

    public static int e(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ov.h(i) + 8) * size;
    }

    public static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qb1)) {
            int iA = 0;
            while (i < size) {
                iA += ov.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        qb1 qb1Var = (qb1) list;
        int iA2 = 0;
        while (i < size) {
            qb1Var.d(i);
            iA2 += ov.a(qb1Var.b[i]);
            i++;
        }
        return iA2;
    }

    public static void e(int i, List list, e7 e7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e7Var.getClass();
        ov ovVar = (ov) e7Var.a;
        int i2 = 0;
        if (!(list instanceof wm1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ovVar.d(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ovVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            ovVar.m(i3);
            while (i2 < list.size()) {
                ovVar.c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        wm1 wm1Var = (wm1) list;
        if (!z) {
            while (i2 < wm1Var.c) {
                wm1Var.c(i2);
                ovVar.d(i, wm1Var.b[i2]);
                i2++;
            }
            return;
        }
        ovVar.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wm1Var.c; i6++) {
            wm1Var.c(i6);
            long j = wm1Var.b[i6];
            i5 += 8;
        }
        ovVar.m(i5);
        while (i2 < wm1Var.c) {
            wm1Var.c(i2);
            ovVar.c(wm1Var.b[i2]);
            i2++;
        }
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wm1)) {
            int iA = 0;
            while (i < size) {
                iA += ov.a(((Long) list.get(i)).longValue());
                i++;
            }
            return iA;
        }
        wm1 wm1Var = (wm1) list;
        int iA2 = 0;
        while (i < size) {
            wm1Var.c(i);
            iA2 += ov.a(wm1Var.b[i]);
            i++;
        }
        return iA2;
    }

    public static void f(int i, List list, e7 e7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e7Var.getClass();
        ov ovVar = (ov) e7Var.a;
        int i2 = 0;
        if (list instanceof tkp) {
            sko.s(list);
            if (z) {
                ovVar.g(i, 2);
                ovVar.m(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                ovVar.e(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        ovVar.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        ovVar.m(i3);
        while (i2 < list.size()) {
            ovVar.k(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qb1)) {
            int i2 = 0;
            while (i < size) {
                i2 += ov.i(ov.j(((Integer) list.get(i)).intValue()));
                i++;
            }
            return i2;
        }
        qb1 qb1Var = (qb1) list;
        int i3 = 0;
        while (i < size) {
            qb1Var.d(i);
            i3 += ov.i(ov.j(qb1Var.b[i]));
            i++;
        }
        return i3;
    }

    public static void g(int i, List list, e7 e7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e7Var.getClass();
        ov ovVar = (ov) e7Var.a;
        int i2 = 0;
        if (!(list instanceof qb1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ovVar.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ovVar.g(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += ov.a(((Integer) list.get(i3)).intValue());
            }
            ovVar.m(iA);
            while (i2 < list.size()) {
                ovVar.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        qb1 qb1Var = (qb1) list;
        if (!z) {
            while (i2 < qb1Var.c) {
                qb1Var.d(i2);
                ovVar.f(i, qb1Var.b[i2]);
                i2++;
            }
            return;
        }
        ovVar.g(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < qb1Var.c; i4++) {
            qb1Var.d(i4);
            iA2 += ov.a(qb1Var.b[i4]);
        }
        ovVar.m(iA2);
        while (i2 < qb1Var.c) {
            qb1Var.d(i2);
            ovVar.l(qb1Var.b[i2]);
            i2++;
        }
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wm1)) {
            int iA = 0;
            while (i < size) {
                iA += ov.a(ov.b(((Long) list.get(i)).longValue()));
                i++;
            }
            return iA;
        }
        wm1 wm1Var = (wm1) list;
        int iA2 = 0;
        while (i < size) {
            wm1Var.c(i);
            iA2 += ov.a(ov.b(wm1Var.b[i]));
            i++;
        }
        return iA2;
    }

    public static void h(int i, List list, e7 e7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e7Var.getClass();
        ov ovVar = (ov) e7Var.a;
        int i2 = 0;
        if (!(list instanceof wm1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ovVar.e(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ovVar.g(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += ov.a(((Long) list.get(i3)).longValue());
            }
            ovVar.m(iA);
            while (i2 < list.size()) {
                ovVar.d(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        wm1 wm1Var = (wm1) list;
        if (!z) {
            while (i2 < wm1Var.c) {
                wm1Var.c(i2);
                ovVar.e(i, wm1Var.b[i2]);
                i2++;
            }
            return;
        }
        ovVar.g(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < wm1Var.c; i4++) {
            wm1Var.c(i4);
            iA2 += ov.a(wm1Var.b[i4]);
        }
        ovVar.m(iA2);
        while (i2 < wm1Var.c) {
            wm1Var.c(i2);
            ovVar.d(wm1Var.b[i2]);
            i2++;
        }
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qb1)) {
            int i2 = 0;
            while (i < size) {
                i2 += ov.i(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        qb1 qb1Var = (qb1) list;
        int i3 = 0;
        while (i < size) {
            qb1Var.d(i);
            i3 += ov.i(qb1Var.b[i]);
            i++;
        }
        return i3;
    }

    public static void i(int i, List list, e7 e7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e7Var.getClass();
        ov ovVar = (ov) e7Var.a;
        int i2 = 0;
        if (!(list instanceof qb1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ovVar.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ovVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            ovVar.m(i3);
            while (i2 < list.size()) {
                ovVar.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        qb1 qb1Var = (qb1) list;
        if (!z) {
            while (i2 < qb1Var.c) {
                qb1Var.d(i2);
                ovVar.e(i, qb1Var.b[i2]);
                i2++;
            }
            return;
        }
        ovVar.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qb1Var.c; i6++) {
            qb1Var.d(i6);
            int i7 = qb1Var.b[i6];
            i5 += 4;
        }
        ovVar.m(i5);
        while (i2 < qb1Var.c) {
            qb1Var.d(i2);
            ovVar.k(qb1Var.b[i2]);
            i2++;
        }
    }

    public static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wm1)) {
            int iA = 0;
            while (i < size) {
                iA += ov.a(((Long) list.get(i)).longValue());
                i++;
            }
            return iA;
        }
        wm1 wm1Var = (wm1) list;
        int iA2 = 0;
        while (i < size) {
            wm1Var.c(i);
            iA2 += ov.a(wm1Var.b[i]);
            i++;
        }
        return iA2;
    }

    public static void j(int i, List list, e7 e7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e7Var.getClass();
        ov ovVar = (ov) e7Var.a;
        int i2 = 0;
        if (!(list instanceof wm1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ovVar.d(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ovVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            ovVar.m(i3);
            while (i2 < list.size()) {
                ovVar.c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        wm1 wm1Var = (wm1) list;
        if (!z) {
            while (i2 < wm1Var.c) {
                wm1Var.c(i2);
                ovVar.d(i, wm1Var.b[i2]);
                i2++;
            }
            return;
        }
        ovVar.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wm1Var.c; i6++) {
            wm1Var.c(i6);
            long j = wm1Var.b[i6];
            i5 += 8;
        }
        ovVar.m(i5);
        while (i2 < wm1Var.c) {
            wm1Var.c(i2);
            ovVar.c(wm1Var.b[i2]);
            i2++;
        }
    }

    public static void k(int i, List list, e7 e7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e7Var.getClass();
        ov ovVar = (ov) e7Var.a;
        int i2 = 0;
        if (!(list instanceof qb1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ovVar.h(i, ov.j(((Integer) list.get(i2)).intValue()));
                    i2++;
                }
                return;
            }
            ovVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ov.i(ov.j(((Integer) list.get(i4)).intValue()));
            }
            ovVar.m(i3);
            while (i2 < list.size()) {
                ovVar.m(ov.j(((Integer) list.get(i2)).intValue()));
                i2++;
            }
            return;
        }
        qb1 qb1Var = (qb1) list;
        if (!z) {
            while (i2 < qb1Var.c) {
                qb1Var.d(i2);
                ovVar.h(i, ov.j(qb1Var.b[i2]));
                i2++;
            }
            return;
        }
        ovVar.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qb1Var.c; i6++) {
            qb1Var.d(i6);
            i5 += ov.i(ov.j(qb1Var.b[i6]));
        }
        ovVar.m(i5);
        while (i2 < qb1Var.c) {
            qb1Var.d(i2);
            ovVar.m(ov.j(qb1Var.b[i2]));
            i2++;
        }
    }

    public static void l(int i, List list, e7 e7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e7Var.getClass();
        ov ovVar = (ov) e7Var.a;
        int i2 = 0;
        if (!(list instanceof wm1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ovVar.e(i, ov.b(((Long) list.get(i2)).longValue()));
                    i2++;
                }
                return;
            }
            ovVar.g(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += ov.a(ov.b(((Long) list.get(i3)).longValue()));
            }
            ovVar.m(iA);
            while (i2 < list.size()) {
                ovVar.d(ov.b(((Long) list.get(i2)).longValue()));
                i2++;
            }
            return;
        }
        wm1 wm1Var = (wm1) list;
        if (!z) {
            while (i2 < wm1Var.c) {
                wm1Var.c(i2);
                ovVar.e(i, ov.b(wm1Var.b[i2]));
                i2++;
            }
            return;
        }
        ovVar.g(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < wm1Var.c; i4++) {
            wm1Var.c(i4);
            iA2 += ov.a(ov.b(wm1Var.b[i4]));
        }
        ovVar.m(iA2);
        while (i2 < wm1Var.c) {
            wm1Var.c(i2);
            ovVar.d(ov.b(wm1Var.b[i2]));
            i2++;
        }
    }

    public static void m(int i, List list, e7 e7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e7Var.getClass();
        ov ovVar = (ov) e7Var.a;
        int i2 = 0;
        if (!(list instanceof qb1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ovVar.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ovVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ov.i(((Integer) list.get(i4)).intValue());
            }
            ovVar.m(i3);
            while (i2 < list.size()) {
                ovVar.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        qb1 qb1Var = (qb1) list;
        if (!z) {
            while (i2 < qb1Var.c) {
                qb1Var.d(i2);
                ovVar.h(i, qb1Var.b[i2]);
                i2++;
            }
            return;
        }
        ovVar.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qb1Var.c; i6++) {
            qb1Var.d(i6);
            i5 += ov.i(qb1Var.b[i6]);
        }
        ovVar.m(i5);
        while (i2 < qb1Var.c) {
            qb1Var.d(i2);
            ovVar.m(qb1Var.b[i2]);
            i2++;
        }
    }

    public static void n(int i, List list, e7 e7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e7Var.getClass();
        ov ovVar = (ov) e7Var.a;
        int i2 = 0;
        if (!(list instanceof wm1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ovVar.e(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ovVar.g(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += ov.a(((Long) list.get(i3)).longValue());
            }
            ovVar.m(iA);
            while (i2 < list.size()) {
                ovVar.d(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        wm1 wm1Var = (wm1) list;
        if (!z) {
            while (i2 < wm1Var.c) {
                wm1Var.c(i2);
                ovVar.e(i, wm1Var.b[i2]);
                i2++;
            }
            return;
        }
        ovVar.g(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < wm1Var.c; i4++) {
            wm1Var.c(i4);
            iA2 += ov.a(wm1Var.b[i4]);
        }
        ovVar.m(iA2);
        while (i2 < wm1Var.c) {
            wm1Var.c(i2);
            ovVar.d(wm1Var.b[i2]);
            i2++;
        }
    }
}
