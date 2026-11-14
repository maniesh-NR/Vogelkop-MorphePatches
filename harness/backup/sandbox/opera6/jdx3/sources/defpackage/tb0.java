package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class tb0 {
    public final zpa a;
    public final q56 b;

    public tb0(zpa zpaVar, q56 q56Var) {
        this.a = zpaVar;
        this.b = q56Var;
        final byte b = 0;
        z4c.b(new Function0(this) { // from class: sb0
            public final /* synthetic */ tb0 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                tb0 tb0Var = this.b;
                switch (b2) {
                    case 0:
                        tb0Var.b.y(tb0Var.a);
                        return new zpa((byte) 16);
                    default:
                        zpa zpaVar2 = tb0Var.a;
                        q56 q56Var2 = tb0Var.b;
                        if (((e70) q56Var2.n(21)) == null) {
                            zpaVar2.getClass();
                            q56Var2.q(21, 1, new e70(2443, 1, 1));
                        }
                        return new psp();
                }
            }
        });
        final byte b2 = 1;
        z4c.b(new Function0(this) { // from class: sb0
            public final /* synthetic */ tb0 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                tb0 tb0Var = this.b;
                switch (b22) {
                    case 0:
                        tb0Var.b.y(tb0Var.a);
                        return new zpa((byte) 16);
                    default:
                        zpa zpaVar2 = tb0Var.a;
                        q56 q56Var2 = tb0Var.b;
                        if (((e70) q56Var2.n(21)) == null) {
                            zpaVar2.getClass();
                            q56Var2.q(21, 1, new e70(2443, 1, 1));
                        }
                        return new psp();
                }
            }
        });
    }

    public final void a(String str, Function1 function1) {
        if0 if0Var;
        zpa zpaVar = this.a;
        zpaVar.getClass();
        w60 w60Var = new w60(2443, -1, 1);
        q56 q56Var = this.b;
        Map map = (Map) q56Var.n(29);
        if (map == null || map.isEmpty()) {
            HashMap map2 = new HashMap();
            q56Var.q(29, 1, map2);
            if0Var = new if0(q56Var, 29, map2);
        } else {
            if0Var = new if0(q56Var, 29, map);
        }
        if0Var.put(str, w60Var);
        function1.invoke(new x60(zpaVar, w60Var));
    }
}
