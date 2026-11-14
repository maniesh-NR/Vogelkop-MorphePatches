package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lok7;", "Lh8e;", "Lf74;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ok7 extends h8e {
    public final Function1 b;

    public ok7(Function1 function1) {
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ok7) {
            return this.b == ((ok7) obj).b;
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new f74(new g74(), this.b);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        f74 f74Var = (f74) b8eVar;
        f74Var.q = this.b;
        f74Var.T0();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
