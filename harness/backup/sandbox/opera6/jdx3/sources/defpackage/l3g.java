package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l3g implements AutoCloseable {
    public final qie a;
    public final String b;
    public final Function2 c;
    public final zyk d = z4c.b(new d8e(this, (byte) 12));

    public l3g(qie qieVar, String str, Function2 function2) {
        this.a = qieVar;
        this.b = str;
        this.c = function2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        zyk zykVar = this.d;
        if (zykVar.isInitialized()) {
            ((osk) zykVar.getValue()).close();
        }
    }
}
