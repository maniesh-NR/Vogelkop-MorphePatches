package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp6m;", "Lh8e;", "Lq6m;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class p6m extends h8e {
    public final bsl b;
    public final lde c;
    public final p5i d;
    public final boolean e;
    public final q5i f;
    public final Function0 g;

    public p6m(bsl bslVar, lde ldeVar, p5i p5iVar, boolean z, q5i q5iVar, Function0 function0) {
        this.b = bslVar;
        this.c = ldeVar;
        this.d = p5iVar;
        this.e = z;
        this.f = q5iVar;
        this.g = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p6m.class != obj.getClass()) {
            return false;
        }
        p6m p6mVar = (p6m) obj;
        return this.b == p6mVar.b && Intrinsics.a(this.c, p6mVar.c) && Intrinsics.a(this.d, p6mVar.d) && this.e == p6mVar.e && this.f.equals(p6mVar.f) && this.g == p6mVar.g;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        q6m q6mVar = new q6m(this.c, this.d, false, this.e, null, this.f, this.g);
        q6mVar.M = this.b;
        return q6mVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) throws pxb {
        q6m q6mVar = (q6m) b8eVar;
        bsl bslVar = q6mVar.M;
        bsl bslVar2 = this.b;
        if (bslVar != bslVar2) {
            q6mVar.M = bslVar2;
            aoh.j(q6mVar);
        }
        q6mVar.j1(this.c, this.d, false, this.e, null, this.f, this.g);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        lde ldeVar = this.c;
        int iHashCode2 = (iHashCode + (ldeVar != null ? ldeVar.hashCode() : 0)) * 31;
        p5i p5iVar = this.d;
        return this.g.hashCode() + rfp.c(this.f.a, fki.k((((iHashCode2 + (p5iVar != null ? p5iVar.hashCode() : 0)) * 31) + 1237) * 31, 31, this.e), 31);
    }
}
