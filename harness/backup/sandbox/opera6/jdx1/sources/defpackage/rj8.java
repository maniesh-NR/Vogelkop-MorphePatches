package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lrj8;", "Lh8e;", "Lsj8;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class rj8 extends h8e {
    public final ox0 b;

    public rj8(ox0 ox0Var) {
        this.b = ox0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rj8) {
            return this.b == ((rj8) obj).b;
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        sj8 sj8Var = new sj8();
        sj8Var.o = this.b;
        return sj8Var;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        ((sj8) b8eVar).o = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
