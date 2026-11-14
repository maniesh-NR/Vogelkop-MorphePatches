package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqjk;", "Lh8e;", "Lrjk;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class qjk extends h8e {
    public final Function0 b;

    public qjk(Function0 function0) {
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qjk) {
            return this.b == ((qjk) obj).b;
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new rjk(this.b);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        ((rjk) b8eVar).q = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
