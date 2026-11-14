package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d9c {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;

    public d9c(long j, long j2, String str, String str2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9c)) {
            return false;
        }
        d9c d9cVar = (d9c) obj;
        return this.a == d9cVar.a && this.b == d9cVar.b && this.c == d9cVar.c && Intrinsics.a(this.d, d9cVar.d) && Intrinsics.a(this.e, d9cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + z1m.f(z1m.e(z1m.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = p3p.q(this.a, "Leaderboard_tiers(tier=", ", start_rank=");
        sbQ.append(this.b);
        p3p.u(sbQ, ", end_rank=", this.c, ", reward_currency=");
        return sko.n(sbQ, this.d, ", reward_value=", this.e, ")");
    }
}
