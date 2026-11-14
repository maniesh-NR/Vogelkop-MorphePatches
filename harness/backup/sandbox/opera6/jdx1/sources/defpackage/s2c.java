package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls2c;", "Lh8e;", "Ld3c;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class s2c extends h8e {
    public final cr9 b;

    public s2c(cr9 cr9Var) {
        this.b = cr9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s2c) {
            return this.b == ((s2c) obj).b;
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        d3c d3cVar = new d3c();
        d3cVar.o = this.b;
        return d3cVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        ((d3c) b8eVar).o = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
