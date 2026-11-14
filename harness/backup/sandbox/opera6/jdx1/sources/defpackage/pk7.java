package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpk7;", "Lh8e;", "Lqk7;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class pk7 extends h8e {
    public final Function1 b;

    public pk7(Function1 function1) {
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pk7) {
            return this.b == ((pk7) obj).b;
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        qk7 qk7Var = new qk7();
        qk7Var.o = this.b;
        return qk7Var;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        ((qk7) b8eVar).o = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
