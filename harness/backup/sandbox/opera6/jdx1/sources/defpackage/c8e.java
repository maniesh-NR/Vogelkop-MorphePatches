package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public interface c8e {
    Object a(Object obj, Function2 function2);

    boolean b(Function1 function1);

    default c8e d(c8e c8eVar) {
        return c8eVar == z7e.b ? this : new ob5(this, c8eVar);
    }
}
