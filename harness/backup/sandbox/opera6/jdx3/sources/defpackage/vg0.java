package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class vg0 {
    public final zpa a;
    public final ug0 b;

    public vg0(zpa zpaVar, ug0 ug0Var) {
        this.a = zpaVar;
        this.b = ug0Var;
    }

    public final void a(String str, Function1 function1) {
        this.a.getClass();
        qg0 qg0Var = new qg0(2443, -1, 13);
        this.b.x().put(str, qg0Var);
        function1.invoke(new rg0(qg0Var));
    }

    public final void b(String str, Function1 function1) {
        if0 if0Var;
        zpa zpaVar = this.a;
        zpaVar.getClass();
        ik0 ik0Var = new ik0(2443, -1, 1);
        ug0 ug0Var = this.b;
        Map map = (Map) ug0Var.n(3);
        if (map == null || map.isEmpty()) {
            HashMap map2 = new HashMap();
            ug0Var.q(3, 1, map2);
            if0Var = new if0(ug0Var, 3, map2);
        } else {
            if0Var = new if0(ug0Var, 3, map);
        }
        if0Var.put(str, ik0Var);
        function1.invoke(new jk0(zpaVar, ik0Var));
    }
}
