package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lx35;", "Lh8e;", "La45;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class x35 extends h8e {
    public final lde b;
    public final g6b c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final q5i g;
    public final Function0 h;

    public x35(lde ldeVar, g6b g6bVar, boolean z, boolean z2, String str, q5i q5iVar, Function0 function0) {
        this.b = ldeVar;
        this.c = g6bVar;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = q5iVar;
        this.h = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x35.class != obj.getClass()) {
            return false;
        }
        x35 x35Var = (x35) obj;
        return Intrinsics.a(this.b, x35Var.b) && Intrinsics.a(this.c, x35Var.c) && this.d == x35Var.d && this.e == x35Var.e && Intrinsics.a(this.f, x35Var.f) && Intrinsics.a(this.g, x35Var.g) && this.h == x35Var.h;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new a45(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) throws pxb {
        ((a45) b8eVar).j1(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final int hashCode() {
        lde ldeVar = this.b;
        int iHashCode = (ldeVar != null ? ldeVar.hashCode() : 0) * 31;
        g6b g6bVar = this.c;
        int iK = fki.k(fki.k((iHashCode + (g6bVar != null ? g6bVar.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode2 = (iK + (str != null ? str.hashCode() : 0)) * 31;
        q5i q5iVar = this.g;
        return this.h.hashCode() + ((iHashCode2 + (q5iVar != null ? Integer.hashCode(q5iVar.a) : 0)) * 31);
    }
}
