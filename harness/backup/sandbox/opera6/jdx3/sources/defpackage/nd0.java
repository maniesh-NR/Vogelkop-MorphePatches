package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class nd0 {
    public final zpa a;
    public final md0 b;
    public final zyk c = z4c.b(new pa((Object) this, (byte) 7));

    public nd0(md0 md0Var, zpa zpaVar) {
        this.a = zpaVar;
        this.b = md0Var;
    }

    public final void a(Function1 function1) {
        hf0 hf0Var;
        this.a.getClass();
        ed0 ed0Var = new ed0(2443, -1, 2);
        md0 md0Var = this.b;
        List list = (List) md0Var.n(2);
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            md0Var.q(2, 1, arrayList);
            hf0Var = new hf0(md0Var, 2, arrayList);
        } else {
            hf0Var = new hf0(md0Var, 2, list);
        }
        hf0Var.add(ed0Var);
        function1.invoke(new fd0(ed0Var));
    }
}
