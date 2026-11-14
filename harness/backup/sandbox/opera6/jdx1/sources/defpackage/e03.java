package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Le03;", "Lh8e;", "Lj03;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class e03 extends h8e {
    public final long b;
    public final dz3 c;
    public final paj d;
    public final Function1 e;

    public e03(long j, haj hajVar, paj pajVar, Function1 function1, int i) {
        j = (i & 1) != 0 ? u95.g : j;
        hajVar = (i & 2) != 0 ? null : hajVar;
        this.b = j;
        this.c = hajVar;
        this.d = pajVar;
        this.e = function1;
    }

    public final boolean equals(Object obj) {
        e03 e03Var = obj instanceof e03 ? (e03) obj : null;
        if (e03Var == null) {
            return false;
        }
        long j = e03Var.b;
        int i = u95.h;
        return jgm.a(this.b, j) && Intrinsics.a(this.c, e03Var.c) && Intrinsics.a(this.d, e03Var.d);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        j03 j03Var = new j03();
        j03Var.o = this.b;
        j03Var.p = this.c;
        j03Var.q = 1.0f;
        j03Var.r = this.d;
        j03Var.s = 9205357640488583168L;
        return j03Var;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        j03 j03Var = (j03) b8eVar;
        j03Var.o = this.b;
        j03Var.p = this.c;
        j03Var.q = 1.0f;
        paj pajVar = j03Var.r;
        paj pajVar2 = this.d;
        if (!Intrinsics.a(pajVar, pajVar2)) {
            j03Var.r = pajVar2;
            aoh.j(j03Var);
        }
        c26.y(j03Var);
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        int iHashCode = Long.hashCode(this.b) * 31;
        dz3 dz3Var = this.c;
        return this.d.hashCode() + ((((iHashCode + (dz3Var != null ? dz3Var.hashCode() : 0)) * 31) + 1065353216) * 31);
    }
}
