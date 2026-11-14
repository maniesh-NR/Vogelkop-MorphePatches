package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class o0o {
    public final m0o a;
    public final List b;
    public final List c;
    public final Function1 d;
    public final Function1 e;
    public i07 f;

    public o0o(m0o m0oVar, List list, List list2, Function1 function1, xm6 xm6Var, int i) {
        list = (i & 2) != 0 ? l08.a : list;
        list2 = (i & 4) != 0 ? l08.a : list2;
        function1 = (i & 8) != 0 ? new q0n((byte) 13) : function1;
        xm6Var = (i & 16) != 0 ? new l0o(1, null, (byte) 0) : xm6Var;
        this.a = m0oVar;
        this.b = list;
        this.c = list2;
        this.d = function1;
        this.e = xm6Var;
    }

    public final boolean a() {
        List list = this.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Function0) it.next()).invoke()).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
