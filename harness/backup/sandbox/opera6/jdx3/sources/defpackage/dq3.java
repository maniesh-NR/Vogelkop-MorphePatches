package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class dq3 {
    public static final ArrayList a;
    public static final Set b;

    static {
        h58 h58Var = pc.C;
        ArrayList arrayList = new ArrayList();
        h58Var.getClass();
        w4 w4Var = new w4(h58Var, (byte) 0);
        while (w4Var.hasNext()) {
            Object next = w4Var.next();
            if (((pc) next).b) {
                arrayList.add(next);
            }
        }
        a = arrayList;
        b = e82.E(new pc[]{pc.k, pc.l});
    }

    public static List a(fw3 fw3Var) {
        return Arrays.asList(pc.d, pc.f, ((Boolean) ((yk6) fw3Var.a.e().get()).u.g()).booleanValue() ? pc.w : pc.i, pc.k, pc.l);
    }
}
