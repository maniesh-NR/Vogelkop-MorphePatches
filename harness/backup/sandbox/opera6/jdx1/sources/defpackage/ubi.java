package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ubi {
    public f1o a;
    public ArrayList b;

    public static long a(e37 e37Var, long j) {
        f1o f1oVar = e37Var.d;
        ArrayList arrayList = e37Var.k;
        if (f1oVar instanceof faa) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            z27 z27Var = (z27) arrayList.get(i);
            if (z27Var instanceof e37) {
                e37 e37Var2 = (e37) z27Var;
                if (e37Var2.d != f1oVar) {
                    jMin = Math.min(jMin, a(e37Var2, e37Var2.f + j));
                }
            }
        }
        e37 e37Var3 = f1oVar.i;
        e37 e37Var4 = f1oVar.h;
        if (e37Var != e37Var3) {
            return jMin;
        }
        long j2 = j - f1oVar.j();
        return Math.min(Math.min(jMin, a(e37Var4, j2)), j2 - e37Var4.f);
    }

    public static long b(e37 e37Var, long j) {
        f1o f1oVar = e37Var.d;
        ArrayList arrayList = e37Var.k;
        if (f1oVar instanceof faa) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            z27 z27Var = (z27) arrayList.get(i);
            if (z27Var instanceof e37) {
                e37 e37Var2 = (e37) z27Var;
                if (e37Var2.d != f1oVar) {
                    jMax = Math.max(jMax, b(e37Var2, e37Var2.f + j));
                }
            }
        }
        e37 e37Var3 = f1oVar.h;
        e37 e37Var4 = f1oVar.i;
        if (e37Var != e37Var3) {
            return jMax;
        }
        long j2 = f1oVar.j() + j;
        return Math.max(Math.max(jMax, b(e37Var4, j2)), j2 - e37Var4.f);
    }
}
