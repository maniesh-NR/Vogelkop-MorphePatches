package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lc1g;", "Lh8e;", "Lb1g;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c1g extends h8e {
    public final f9 b;

    public c1g(f9 f9Var) {
        this.b = f9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c1g) {
            return this.b == ((c1g) obj).b;
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        b1g b1gVar = new b1g();
        b1gVar.o = this.b;
        return b1gVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        b1g b1gVar = (b1g) b8eVar;
        b1gVar.o = this.b;
        aoh.j(b1gVar);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
