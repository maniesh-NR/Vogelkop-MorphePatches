package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gp9 {
    public final String a;
    public final double b;
    public final long c;
    public final Long d;
    public final Double e;
    public final Boolean f;
    public final String g;
    public final ip9 h;

    public gp9(String str, double d, long j, Long l, Double d2, Boolean bool, String str2, ip9 ip9Var) {
        this.a = str;
        this.b = d;
        this.c = j;
        this.d = l;
        this.e = d2;
        this.f = bool;
        this.g = str2;
        this.h = ip9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp9)) {
            return false;
        }
        gp9 gp9Var = (gp9) obj;
        return this.a.equals(gp9Var.a) && Double.compare(this.b, gp9Var.b) == 0 && this.c == gp9Var.c && Intrinsics.a(this.d, gp9Var.d) && Intrinsics.a(this.e, gp9Var.e) && Intrinsics.a(this.f, gp9Var.f) && Intrinsics.a(this.g, gp9Var.g) && this.h == gp9Var.h;
    }

    public final int hashCode() {
        int iE = z1m.e((Double.hashCode(this.b) + (this.a.hashCode() * 31)) * 31, 31, this.c);
        Long l = this.d;
        int iHashCode = (iE + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.e;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.g;
        return this.h.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FreePlan(iso3=");
        sb.append(this.a);
        sb.append(", dataAmount=");
        sb.append(this.b);
        p3p.u(sb, ", duration=", this.c, ", activationTime=");
        sb.append(this.d);
        sb.append(", usedDataAmount=");
        sb.append(this.e);
        sb.append(", isFreePlan=");
        sb.append(this.f);
        sb.append(", externalId=");
        sb.append(this.g);
        sb.append(", status=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
