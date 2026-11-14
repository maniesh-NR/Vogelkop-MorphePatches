package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class cxf implements g5c {
    public final Function1 a;
    public final dr9 b;

    public cxf(Function1 function1, dr9 dr9Var) {
        this.a = function1;
        this.b = dr9Var;
    }

    @Override // defpackage.g5c
    public final Function1 getKey() {
        return this.a;
    }
}
