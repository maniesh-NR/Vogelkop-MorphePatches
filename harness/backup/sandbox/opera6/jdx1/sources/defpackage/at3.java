package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class at3 extends fw2 {
    public nh4 a;
    public Function1 b;

    public final void a() {
        this.b = null;
        this.a = null;
    }

    public final void b(Throwable th) {
        nh4 nh4Var = this.a;
        if (nh4Var != null) {
            p0i p0iVar = t0i.b;
            nh4Var.resumeWith(new q0i(th));
        }
    }
}
