package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class lk0 {
    public final zpa a;
    public final kk0 b;

    public lk0(zpa zpaVar, kk0 kk0Var) {
        this.a = zpaVar;
        this.b = kk0Var;
    }

    public final void a(String str, Function1 function1) {
        if0 if0Var;
        this.a.getClass();
        mk0 mk0Var = new mk0(2443, -1, 3);
        kk0 kk0Var = this.b;
        Map map = (Map) kk0Var.n(0);
        if (map == null || map.isEmpty()) {
            HashMap map2 = new HashMap();
            kk0Var.q(0, 1, map2);
            if0Var = new if0(kk0Var, 0, map2);
        } else {
            if0Var = new if0(kk0Var, 0, map);
        }
        if0Var.put(str, mk0Var);
        function1.invoke(new nk0(mk0Var));
    }
}
