package defpackage;

import java.io.Closeable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m45 implements Closeable {
    public final jf2 a;
    public final Object b;
    public final Function1 c;
    public Function0 d = new nd3((byte) 8);

    public m45(jf2 jf2Var, Object obj, Function1 function1) {
        this.a = jf2Var;
        this.b = obj;
        this.c = function1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.invoke();
    }
}
