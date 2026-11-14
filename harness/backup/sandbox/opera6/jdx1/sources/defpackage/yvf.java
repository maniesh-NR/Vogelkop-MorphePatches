package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lyvf;", "Lh8e;", "Lawf;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class yvf extends h8e {
    public final xvf b;

    public yvf(xvf xvfVar, w5f w5fVar) {
        this.b = xvfVar;
    }

    public final boolean equals(Object obj) {
        yvf yvfVar = obj instanceof yvf ? (yvf) obj : null;
        if (yvfVar == null) {
            return false;
        }
        return Intrinsics.a(this.b, yvfVar.b);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        awf awfVar = new awf();
        awfVar.o = this.b;
        return awfVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        ((awf) b8eVar).o = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
