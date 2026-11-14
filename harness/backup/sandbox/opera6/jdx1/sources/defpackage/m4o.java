package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lm4o;", "Lh8e;", "Llij;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m4o extends h8e {
    public final mga b;

    public m4o(mga mgaVar) {
        this.b = mgaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        m4o m4oVar = obj instanceof m4o ? (m4o) obj : null;
        if (m4oVar == null) {
            return false;
        }
        return Intrinsics.a(this.b, m4oVar.b);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        lij lijVar = new lij();
        lijVar.o = this.b;
        return lijVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        ((lij) b8eVar).o = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
