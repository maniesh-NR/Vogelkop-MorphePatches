package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class tu9 extends ode {
    public final su9 l;
    public final /* synthetic */ ou9 m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ ru9 o;

    public tu9(ou9 ou9Var, Function2 function2, ru9 ru9Var) {
        this.m = ou9Var;
        this.n = function2;
        this.o = ru9Var;
        this.l = new su9(ou9Var, this, function2, ru9Var);
    }

    public final void l() {
        ou9 ou9Var = this.m;
        Function2 function2 = this.n;
        ru9 ru9Var = this.o;
        xf8.E0(this, function2.invoke(ru9Var, ou9Var));
        ru9Var.a(this.l);
    }

    public final void m() {
        this.o.d(this.l);
    }
}
