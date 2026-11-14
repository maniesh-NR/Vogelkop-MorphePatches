package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class hsc {
    public final ua7 a;
    public final List b;
    public final String c;

    public hsc(Class cls, Class cls2, Class cls3, List list, ua7 ua7Var) {
        this.a = ua7Var;
        if (list.isEmpty()) {
            qp2.o("Must not be empty.");
            throw null;
        }
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final kyh a(int i, int i2, bp bpVar, qc6 qc6Var, trf trfVar) {
        ua7 ua7Var = this.a;
        List list = (List) ua7Var.h();
        try {
            List list2 = this.b;
            int size = list2.size();
            kyh kyhVarA = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    kyhVarA = ((dj6) list2.get(i3)).a(i, i2, bpVar, qc6Var, trfVar);
                } catch (ty9 e) {
                    list.add(e);
                }
                if (kyhVarA != null) {
                    break;
                }
            }
            if (kyhVarA != null) {
                return kyhVarA;
            }
            throw new ty9(this.c, new ArrayList(list));
        } finally {
            ua7Var.K(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
