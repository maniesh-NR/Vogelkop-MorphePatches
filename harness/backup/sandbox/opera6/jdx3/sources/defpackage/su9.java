package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class su9 extends n1 {
    public final /* synthetic */ tu9 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ ru9 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su9(ou9 ou9Var, tu9 tu9Var, Function2 function2, ru9 ru9Var) {
        super(ou9Var);
        this.c = tu9Var;
        this.d = function2;
        this.e = ru9Var;
    }

    @Override // defpackage.n1
    public final void x0(ou9 ou9Var) {
        xf8.E0(this.c, this.d.invoke(this.e, ou9Var));
    }
}
