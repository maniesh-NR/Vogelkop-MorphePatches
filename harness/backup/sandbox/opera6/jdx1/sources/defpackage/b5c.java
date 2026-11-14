package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lb5c;", "Lh8e;", "Le5c;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class b5c extends h8e {
    public final f5c b;
    public final nv6 c;
    public final fsf d;

    public b5c(f5c f5cVar, nv6 nv6Var, fsf fsfVar) {
        this.b = f5cVar;
        this.c = nv6Var;
        this.d = fsfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5c)) {
            return false;
        }
        b5c b5cVar = (b5c) obj;
        return Intrinsics.a(this.b, b5cVar.b) && Intrinsics.a(this.c, b5cVar.c) && this.d == b5cVar.d;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        e5c e5cVar = new e5c();
        e5cVar.o = this.b;
        e5cVar.p = this.c;
        e5cVar.q = this.d;
        return e5cVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        e5c e5cVar = (e5c) b8eVar;
        e5cVar.o = this.b;
        e5cVar.p = this.c;
        e5cVar.q = this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((((this.c.hashCode() + (this.b.hashCode() * 31)) * 31) + 1237) * 31);
    }
}
