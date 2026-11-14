package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class r0j {
    public static final Comparator[] a;
    public static final ali b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new jk(new jk(i == 0 ? yg9.h : yg9.c, (byte) 9), (byte) 10);
            i++;
        }
        a = comparatorArr;
        b = new ali((byte) 25);
    }

    public static final void a(k0j k0jVar, ArrayList arrayList, z3 z3Var, z3 z3Var2, jde jdeVar) {
        f0j f0jVar = k0jVar.d;
        Object objG = f0jVar.a.g(n0j.n);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) z3Var2.invoke(k0jVar)).booleanValue()) && ((Boolean) z3Var.invoke(k0jVar)).booleanValue()) {
            arrayList.add(k0jVar);
        }
        if (zBooleanValue) {
            jdeVar.i(k0jVar.f, b(k0jVar, z3Var, z3Var2, k0j.j(7, k0jVar)));
            return;
        }
        List listJ = k0j.j(7, k0jVar);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            a((k0j) listJ.get(i), arrayList, z3Var, z3Var2, jdeVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(defpackage.k0j r17, z3 r18, z3 r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0j.b(k0j, z3, z3, java.util.List):java.util.ArrayList");
    }
}
