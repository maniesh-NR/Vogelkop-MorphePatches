package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class gxf extends w7d {
    public final Function1 k;
    public final ro9 l;

    public gxf(dr9 dr9Var, Function1 function1, int i) {
        this.k = function1;
        ro9 ro9Var = new ro9((byte) 21);
        ro9Var.c(i, new cxf(function1, dr9Var));
        this.l = ro9Var;
    }

    @Override // defpackage.w7d
    public final ro9 B() {
        return this.l;
    }
}
