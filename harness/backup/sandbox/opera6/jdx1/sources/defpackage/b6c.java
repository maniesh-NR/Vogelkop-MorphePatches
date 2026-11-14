package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lb6c;", "Lh8e;", "Le6c;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class b6c extends h8e {
    public final vtb b;
    public final y5c c;
    public final fsf d;
    public final boolean e;

    public b6c(vtb vtbVar, y5c y5cVar, fsf fsfVar, boolean z) {
        this.b = vtbVar;
        this.c = y5cVar;
        this.d = fsfVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6c)) {
            return false;
        }
        b6c b6cVar = (b6c) obj;
        return this.b == b6cVar.b && Intrinsics.a(this.c, b6cVar.c) && this.d == b6cVar.d && this.e == b6cVar.e;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new e6c(this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        e6c e6cVar = (e6c) b8eVar;
        e6cVar.o = this.b;
        e6cVar.p = this.c;
        fsf fsfVar = e6cVar.q;
        fsf fsfVar2 = this.d;
        if (fsfVar != fsfVar2) {
            e6cVar.q = fsfVar2;
            aoh.j(e6cVar);
        }
        boolean z = e6cVar.r;
        boolean z2 = this.e;
        if (z == z2) {
            return;
        }
        e6cVar.r = z2;
        e6cVar.T0();
        aoh.j(e6cVar);
    }

    public final int hashCode() {
        return ((Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31) + 1237;
    }
}
