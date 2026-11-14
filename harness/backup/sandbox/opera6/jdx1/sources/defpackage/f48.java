package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lf48;", "Lh8e;", "Ls48;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class f48 extends h8e {
    public final b3m b;
    public final q2m c;
    public final q2m d;
    public final q2m e;
    public final x48 f;
    public final vh8 g;
    public final ndj h;
    public final Function0 i;
    public final g48 j;

    public f48(b3m b3mVar, q2m q2mVar, q2m q2mVar2, q2m q2mVar3, x48 x48Var, vh8 vh8Var, ndj ndjVar, Function0 function0, g48 g48Var) {
        this.b = b3mVar;
        this.c = q2mVar;
        this.d = q2mVar2;
        this.e = q2mVar3;
        this.f = x48Var;
        this.g = vh8Var;
        this.h = ndjVar;
        this.i = function0;
        this.j = g48Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f48)) {
            return false;
        }
        f48 f48Var = (f48) obj;
        return f48Var.b == this.b && Intrinsics.a(f48Var.c, this.c) && Intrinsics.a(f48Var.d, this.d) && Intrinsics.a(f48Var.e, this.e) && f48Var.f.equals(this.f) && Intrinsics.a(f48Var.g, this.g) && f48Var.h == this.h && f48Var.i == this.i && Intrinsics.a(f48Var.j, this.j);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new s48(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        s48 s48Var = (s48) b8eVar;
        s48Var.p = this.b;
        s48Var.q = this.c;
        s48Var.r = this.d;
        s48Var.s = this.e;
        s48Var.t = this.f;
        s48Var.u = this.g;
        s48Var.v = this.h;
        s48Var.w = this.i;
        s48Var.x = this.j;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        q2m q2mVar = this.c;
        int iHashCode2 = (iHashCode + (q2mVar != null ? q2mVar.hashCode() : 0)) * 31;
        q2m q2mVar2 = this.d;
        int iHashCode3 = (iHashCode2 + (q2mVar2 != null ? q2mVar2.hashCode() : 0)) * 31;
        q2m q2mVar3 = this.e;
        return this.h.hashCode() + (this.j.hashCode() * 31) + ((this.i.hashCode() + ((this.g.a.hashCode() + ((this.f.a.hashCode() + ((iHashCode3 + (q2mVar3 != null ? q2mVar3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
