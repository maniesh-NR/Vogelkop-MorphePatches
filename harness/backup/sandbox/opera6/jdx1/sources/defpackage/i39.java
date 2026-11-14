package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Li39;", "Lh8e;", "Lk39;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class i39 extends h8e {
    public final p97 b;

    public i39(p97 p97Var) {
        this.b = p97Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i39) {
            return this.b == ((i39) obj).b;
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        k39 k39Var = new k39();
        k39Var.o = this.b;
        k39Var.p = 1.0f;
        return k39Var;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        k39 k39Var = (k39) b8eVar;
        k39Var.o = this.b;
        k39Var.p = 1.0f;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + 1065353216;
    }
}
