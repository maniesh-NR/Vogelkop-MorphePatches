package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Los3;", "Lh8e;", "Lrs3;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class os3 extends h8e {
    public final qs3 b;

    public os3(qs3 qs3Var) {
        this.b = qs3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof os3) {
            return Intrinsics.a(this.b, ((os3) obj).b);
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        rs3 rs3Var = new rs3();
        rs3Var.o = this.b;
        return rs3Var;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        rs3 rs3Var = (rs3) b8eVar;
        qs3 qs3Var = rs3Var.o;
        if (qs3Var != null) {
            qs3Var.a.k(rs3Var);
        }
        qs3 qs3Var2 = this.b;
        if (qs3Var2 != null) {
            qs3Var2.a.c(rs3Var);
        }
        rs3Var.o = qs3Var2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
