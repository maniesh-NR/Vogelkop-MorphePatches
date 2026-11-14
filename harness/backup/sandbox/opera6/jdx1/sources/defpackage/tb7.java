package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class tb7 implements dth {
    public final Function1 a;
    public ub7 b;

    public tb7(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.dth
    public final void a() {
        this.b = (ub7) this.a.invoke(rm5.e);
    }

    @Override // defpackage.dth
    public final void b() {
    }

    @Override // defpackage.dth
    public final void c() {
        ub7 ub7Var = this.b;
        if (ub7Var != null) {
            ub7Var.dispose();
        }
        this.b = null;
    }
}
