package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmp5;", "Lh8e;", "Lnp5;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class mp5 extends h8e {
    public final Function1 b;
    public final Function1 c;

    public mp5(Function1 function1, Function1 function12) {
        this.b = function1;
        this.c = function12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mp5) && ((mp5) obj).b == this.b;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        np5 np5Var = new np5();
        np5Var.q = this.b;
        return np5Var;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        np5 np5Var = (np5) b8eVar;
        Function1 function1 = np5Var.q;
        Function1 function12 = this.b;
        if (function12 != function1) {
            np5Var.q = function12;
            np5Var.U0();
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
