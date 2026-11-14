package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ve0 {
    public final zpa a;
    public final ue0 b;

    public ve0(zpa zpaVar, ue0 ue0Var) {
        this.a = zpaVar;
        this.b = ue0Var;
    }

    public final void a(String str, Function1 function1) {
        if0 if0Var;
        this.a.getClass();
        xe0 xe0Var = new xe0(2443, -1, 2);
        ue0 ue0Var = this.b;
        Map map = (Map) ue0Var.n(3);
        if (map == null || map.isEmpty()) {
            HashMap map2 = new HashMap();
            ue0Var.q(3, 1, map2);
            if0Var = new if0(ue0Var, 3, map2);
        } else {
            if0Var = new if0(ue0Var, 3, map);
        }
        if0Var.put(str, xe0Var);
        function1.invoke(new ye0(xe0Var));
    }
}
