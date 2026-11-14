package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Liyi;", "Lh8e;", "Lkyi;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class iyi extends h8e {
    public final boolean b;
    public final lde c;
    public final p5i d;
    public final boolean e;
    public final boolean f;
    public final q5i g;
    public final Function0 h;

    public iyi(boolean z, lde ldeVar, p5i p5iVar, boolean z2, boolean z3, q5i q5iVar, Function0 function0) {
        this.b = z;
        this.c = ldeVar;
        this.d = p5iVar;
        this.e = z2;
        this.f = z3;
        this.g = q5iVar;
        this.h = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iyi.class != obj.getClass()) {
            return false;
        }
        iyi iyiVar = (iyi) obj;
        return this.b == iyiVar.b && Intrinsics.a(this.c, iyiVar.c) && Intrinsics.a(this.d, iyiVar.d) && this.e == iyiVar.e && this.f == iyiVar.f && Intrinsics.a(this.g, iyiVar.g) && this.h == iyiVar.h;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        kyi kyiVar = new kyi(this.c, this.d, this.e, this.f, null, this.g, this.h);
        kyiVar.M = this.b;
        return kyiVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) throws pxb {
        kyi kyiVar = (kyi) b8eVar;
        boolean z = kyiVar.M;
        boolean z2 = this.b;
        if (z != z2) {
            kyiVar.M = z2;
            aoh.j(kyiVar);
        }
        kyiVar.j1(this.c, this.d, this.e, this.f, null, this.g, this.h);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.b) * 31;
        lde ldeVar = this.c;
        int iHashCode2 = (iHashCode + (ldeVar != null ? ldeVar.hashCode() : 0)) * 31;
        p5i p5iVar = this.d;
        int iK = fki.k(fki.k((iHashCode2 + (p5iVar != null ? p5iVar.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
        q5i q5iVar = this.g;
        return this.h.hashCode() + ((iK + (q5iVar != null ? Integer.hashCode(q5iVar.a) : 0)) * 31);
    }
}
