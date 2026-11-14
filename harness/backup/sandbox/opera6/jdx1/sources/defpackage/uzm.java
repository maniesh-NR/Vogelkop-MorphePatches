package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class uzm {
    public tu7 a;

    public abstract void a(mk7 mk7Var);

    public Function1 b() {
        return this.a;
    }

    public final void c() {
        Function1 function1B = b();
        if (function1B != null) {
            function1B.invoke(this);
        }
    }

    public void d(tu7 tu7Var) {
        this.a = tu7Var;
    }
}
