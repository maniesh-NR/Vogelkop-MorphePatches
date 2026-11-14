package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public interface sc4 {
    static h07 h(qd4 qd4Var, y10 y10Var, v40 v40Var, gw2 gw2Var, List list, List list2, List list3, int i) {
        y10 y10Var2 = (i & 1) != 0 ? null : y10Var;
        v40 v40Var2 = (i & 2) != 0 ? null : v40Var;
        gw2 gw2Var2 = (i & 4) != 0 ? null : gw2Var;
        List list4 = (i & 8) != 0 ? null : list;
        List list5 = (i & 16) != 0 ? null : list2;
        List list6 = (i & 32) != 0 ? null : list3;
        if (!qd4Var.a.a()) {
            return qu5.b(qd4Var.c, y10Var2, v40Var2, gw2Var2, null, list4, list5, list6, 8);
        }
        kp5.b(qd4Var, " after close.", "Cannot call update3A on ");
        return null;
    }
}
