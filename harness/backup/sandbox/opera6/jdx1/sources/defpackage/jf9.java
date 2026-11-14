package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ljf9;", "Lh8e;", "Lkf9;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class jf9 extends h8e {
    public final Function1 b;

    public jf9(Function1 function1) {
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jf9) {
            return this.b == ((jf9) obj).b;
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        kf9 kf9Var = new kf9();
        kf9Var.o = this.b;
        return kf9Var;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        ((kf9) b8eVar).o = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
