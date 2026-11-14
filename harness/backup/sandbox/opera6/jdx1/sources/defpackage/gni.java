package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class gni {
    public static final Class a;
    public static final hmm b;
    public static final hmm c;

    static {
        Class<?> cls;
        Class<?> cls2;
        y6h y6hVar = y6h.c;
        hmm hmmVar = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            y6h y6hVar2 = y6h.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                hmmVar = (hmm) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = hmmVar;
        c = new hmm();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof obb) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += x75.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x75.g(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x75.g(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof obb) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += x75.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof n0d) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += x75.i(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int f(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof obb)) {
                int iH = 0;
                for (int i = 0; i < size; i++) {
                    int iIntValue = ((Integer) list.get(i)).intValue();
                    iH += x75.h((iIntValue << 1) ^ (iIntValue >> 31));
                }
                return iH;
            }
            sko.s(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof n0d)) {
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    i += x75.i((jLongValue << 1) ^ (jLongValue >> 63));
                }
                return i;
            }
            sko.s(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof obb) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iH = 0;
        for (int i = 0; i < size; i++) {
            iH += x75.h(((Integer) list.get(i)).intValue());
        }
        return iH;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof n0d) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += x75.i(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static Object j(Object obj, int i, gfb gfbVar, Object obj2, hmm hmmVar) {
        return obj2;
    }

    public static void k(hmm hmmVar, Object obj, Object obj2) {
        hmmVar.getClass();
        hv9 hv9Var = (hv9) obj;
        emm emmVar = hv9Var.unknownFields;
        emm emmVar2 = ((hv9) obj2).unknownFields;
        emm emmVar3 = emm.f;
        if (!emmVar3.equals(emmVar2)) {
            if (emmVar3.equals(emmVar)) {
                int i = emmVar.a + emmVar2.a;
                int[] iArrCopyOf = Arrays.copyOf(emmVar.b, i);
                System.arraycopy(emmVar2.b, 0, iArrCopyOf, emmVar.a, emmVar2.a);
                Object[] objArrCopyOf = Arrays.copyOf(emmVar.c, i);
                System.arraycopy(emmVar2.c, 0, objArrCopyOf, emmVar.a, emmVar2.a);
                emmVar = new emm(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                emmVar.getClass();
                if (!emmVar2.equals(emmVar3)) {
                    if (!emmVar.e) {
                        t3p.o();
                        return;
                    }
                    int i2 = emmVar.a + emmVar2.a;
                    emmVar.a(i2);
                    System.arraycopy(emmVar2.b, 0, emmVar.b, emmVar.a, emmVar2.a);
                    System.arraycopy(emmVar2.c, 0, emmVar.c, emmVar.a, emmVar2.a);
                    emmVar.a = i2;
                }
            }
        }
        hv9Var.unknownFields = emmVar;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, eme emeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x75 x75Var = (x75) emeVar.a;
        if (list instanceof mn3) {
            h9o.t();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x75Var.n(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        x75Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        x75Var.C(i3);
        while (i2 < list.size()) {
            x75Var.l(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, eme emeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x75 x75Var = (x75) emeVar.a;
        if (list instanceof fe7) {
            h9o.t();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x75Var.s(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        x75Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        x75Var.C(i3);
        while (i2 < list.size()) {
            x75Var.t(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, eme emeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x75 x75Var = (x75) emeVar.a;
        if (list instanceof obb) {
            h9o.t();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x75Var.u(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        x75Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += x75.i(((Integer) list.get(i4)).intValue());
        }
        x75Var.C(i3);
        while (i2 < list.size()) {
            x75Var.v(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, eme emeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x75 x75Var = (x75) emeVar.a;
        if (list instanceof obb) {
            h9o.t();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x75Var.q(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        x75Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        x75Var.C(i3);
        while (i2 < list.size()) {
            x75Var.r(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, eme emeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x75 x75Var = (x75) emeVar.a;
        if (list instanceof n0d) {
            h9o.t();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x75Var.s(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        x75Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        x75Var.C(i3);
        while (i2 < list.size()) {
            x75Var.t(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void r(int i, List list, eme emeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x75 x75Var = (x75) emeVar.a;
        if (list instanceof r89) {
            h9o.t();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x75Var.q(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        x75Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        x75Var.C(i3);
        while (i2 < list.size()) {
            x75Var.r(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, eme emeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x75 x75Var = (x75) emeVar.a;
        if (list instanceof obb) {
            h9o.t();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x75Var.u(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        x75Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += x75.i(((Integer) list.get(i4)).intValue());
        }
        x75Var.C(i3);
        while (i2 < list.size()) {
            x75Var.v(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, eme emeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x75 x75Var = (x75) emeVar.a;
        if (list instanceof n0d) {
            h9o.t();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x75Var.D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        x75Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += x75.i(((Long) list.get(i4)).longValue());
        }
        x75Var.C(i3);
        while (i2 < list.size()) {
            x75Var.E(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, eme emeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x75 x75Var = (x75) emeVar.a;
        if (list instanceof obb) {
            h9o.t();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x75Var.q(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        x75Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        x75Var.C(i3);
        while (i2 < list.size()) {
            x75Var.r(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, eme emeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x75 x75Var = (x75) emeVar.a;
        if (list instanceof n0d) {
            h9o.t();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x75Var.s(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        x75Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        x75Var.C(i3);
        while (i2 < list.size()) {
            x75Var.t(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, eme emeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x75 x75Var = (x75) emeVar.a;
        if (list instanceof obb) {
            h9o.t();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                x75Var.B(i, (iIntValue << 1) ^ (iIntValue >> 31));
                i2++;
            }
            return;
        }
        x75Var.A(i, 2);
        int iH = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iH += x75.h((iIntValue2 << 1) ^ (iIntValue2 >> 31));
        }
        x75Var.C(iH);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            x75Var.C((iIntValue3 << 1) ^ (iIntValue3 >> 31));
            i2++;
        }
    }

    public static void x(int i, List list, eme emeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x75 x75Var = (x75) emeVar.a;
        if (list instanceof n0d) {
            h9o.t();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                x75Var.D(i, (jLongValue << 1) ^ (jLongValue >> 63));
                i2++;
            }
            return;
        }
        x75Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long jLongValue2 = ((Long) list.get(i4)).longValue();
            i3 += x75.i((jLongValue2 << 1) ^ (jLongValue2 >> 63));
        }
        x75Var.C(i3);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            x75Var.E((jLongValue3 << 1) ^ (jLongValue3 >> 63));
            i2++;
        }
    }

    public static void y(int i, List list, eme emeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x75 x75Var = (x75) emeVar.a;
        if (list instanceof obb) {
            h9o.t();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x75Var.B(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        x75Var.A(i, 2);
        int iH = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iH += x75.h(((Integer) list.get(i3)).intValue());
        }
        x75Var.C(iH);
        while (i2 < list.size()) {
            x75Var.C(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, eme emeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x75 x75Var = (x75) emeVar.a;
        if (list instanceof n0d) {
            h9o.t();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x75Var.D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        x75Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += x75.i(((Long) list.get(i4)).longValue());
        }
        x75Var.C(i3);
        while (i2 < list.size()) {
            x75Var.E(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
