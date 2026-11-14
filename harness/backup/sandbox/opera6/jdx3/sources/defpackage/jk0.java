package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class jk0 {
    public final zpa a;
    public final ik0 b;

    public jk0(zpa zpaVar, ik0 ik0Var) {
        this.a = zpaVar;
        this.b = ik0Var;
    }

    public final void a(String str, Function1 function1) {
        if0 if0Var;
        zpa zpaVar = this.a;
        zpaVar.getClass();
        kk0 kk0Var = new kk0(2443, -1, 1);
        ik0 ik0Var = this.b;
        Map map = (Map) ik0Var.n(0);
        if (map == null || map.isEmpty()) {
            HashMap map2 = new HashMap();
            ik0Var.q(0, 1, map2);
            if0Var = new if0(ik0Var, 0, map2);
        } else {
            if0Var = new if0(ik0Var, 0, map);
        }
        if0Var.put(str, kk0Var);
        function1.invoke(new lk0(zpaVar, kk0Var));
    }
}
