package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lyrl;", "Lh8e;", "Lasl;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class yrl extends h8e {
    public final boolean b;
    public final lde c;
    public final boolean d;
    public final q5i e;
    public final Function1 f;

    public yrl(boolean z, lde ldeVar, boolean z2, q5i q5iVar, Function1 function1) {
        this.b = z;
        this.c = ldeVar;
        this.d = z2;
        this.e = q5iVar;
        this.f = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yrl.class != obj.getClass()) {
            return false;
        }
        yrl yrlVar = (yrl) obj;
        return this.b == yrlVar.b && Intrinsics.a(this.c, yrlVar.c) && this.d == yrlVar.d && this.e.equals(yrlVar.e) && this.f == yrlVar.f;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new asl(this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) throws pxb {
        asl aslVar = (asl) b8eVar;
        boolean z = aslVar.M;
        boolean z2 = this.b;
        if (z != z2) {
            aslVar.M = z2;
            aoh.j(aslVar);
        }
        aslVar.N = this.f;
        aslVar.j1(this.c, null, this.d, true, null, this.e, aslVar.O);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.b) * 31;
        lde ldeVar = this.c;
        return this.f.hashCode() + rfp.c(this.e.a, (((Boolean.hashCode(this.d) + ((iHashCode + (ldeVar != null ? ldeVar.hashCode() : 0)) * 961)) * 31) + 1231) * 31, 31);
    }
}
