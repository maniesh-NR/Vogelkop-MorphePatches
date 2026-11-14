package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class x60 {
    public final zpa a;
    public final w60 b;

    public x60(zpa zpaVar, w60 w60Var) {
        this.a = zpaVar;
        this.b = w60Var;
    }

    public final void a(String str, Function1 function1) {
        if0 if0Var;
        this.a.getClass();
        q60 q60Var = new q60(2443, -1, 3);
        w60 w60Var = this.b;
        Map map = (Map) w60Var.n(0);
        if (map == null || map.isEmpty()) {
            HashMap map2 = new HashMap();
            w60Var.q(0, 1, map2);
            if0Var = new if0(w60Var, 0, map2);
        } else {
            if0Var = new if0(w60Var, 0, map);
        }
        if0Var.put(str, q60Var);
        function1.invoke(new r60(q60Var));
    }
}
