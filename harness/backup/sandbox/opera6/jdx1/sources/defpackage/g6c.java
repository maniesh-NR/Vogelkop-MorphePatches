package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g6c implements g5c {
    public final Function1 a;
    public final Function1 b;
    public final ue5 c;

    public g6c(Function1 function1, Function1 function12, ue5 ue5Var) {
        this.a = function1;
        this.b = function12;
        this.c = ue5Var;
    }

    @Override // defpackage.g5c
    public final Function1 getKey() {
        return this.a;
    }

    @Override // defpackage.g5c
    public final Function1 getType() {
        return this.b;
    }
}
