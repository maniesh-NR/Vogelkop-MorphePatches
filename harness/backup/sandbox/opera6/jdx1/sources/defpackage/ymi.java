package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ymi {
    public static final /* synthetic */ int a = 0;

    static {
        qs7.B("Schedulers");
    }

    public static void a(i5o i5oVar, ioj iojVar, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                i5oVar.h(jCurrentTimeMillis, ((h5o) obj).a);
            }
        }
    }

    public static void b(jl5 jl5Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        i5o i5oVarC = workDatabase.C();
        workDatabase.c();
        try {
            ArrayList arrayListC = i5oVarC.c();
            a(i5oVarC, jl5Var.d, arrayListC);
            ArrayList arrayListB = i5oVarC.b();
            a(i5oVarC, jl5Var.d, arrayListB);
            arrayListB.addAll(arrayListC);
            ArrayList arrayListA = i5oVarC.a();
            workDatabase.v();
            workDatabase.p();
            if (arrayListB.size() > 0) {
                h5o[] h5oVarArr = (h5o[]) arrayListB.toArray(new h5o[arrayListB.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    vmi vmiVar = (vmi) it.next();
                    if (vmiVar.e()) {
                        vmiVar.c(h5oVarArr);
                    }
                }
            }
            if (arrayListA.size() > 0) {
                h5o[] h5oVarArr2 = (h5o[]) arrayListA.toArray(new h5o[arrayListA.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    vmi vmiVar2 = (vmi) it2.next();
                    if (!vmiVar2.e()) {
                        vmiVar2.c(h5oVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.p();
            throw th;
        }
    }
}
