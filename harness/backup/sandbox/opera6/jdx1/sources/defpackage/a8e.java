package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public interface a8e extends c8e {
    @Override // defpackage.c8e
    default Object a(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.c8e
    default boolean b(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }
}
