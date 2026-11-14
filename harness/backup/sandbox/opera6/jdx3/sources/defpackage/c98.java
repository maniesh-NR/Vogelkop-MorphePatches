package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c98 {
    public final String a;
    public final double b;
    public final long c;
    public final y98 d;
    public final Long e;
    public final Double f;
    public final Boolean g;
    public final String h;

    public c98(String str, double d, long j, y98 y98Var, Long l, Double d2, Boolean bool, String str2) {
        this.a = str;
        this.b = d;
        this.c = j;
        this.d = y98Var;
        this.e = l;
        this.f = d2;
        this.g = bool;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c98)) {
            return false;
        }
        c98 c98Var = (c98) obj;
        return this.a.equals(c98Var.a) && Double.compare(this.b, c98Var.b) == 0 && this.c == c98Var.c && this.d == c98Var.d && Intrinsics.a(this.e, c98Var.e) && Intrinsics.a(this.f, c98Var.f) && Intrinsics.a(this.g, c98Var.g) && Intrinsics.a(this.h, c98Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + z1m.e((Double.hashCode(this.b) + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31;
        Long l = this.e;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.f;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.g;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.h;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EsimPlan(iso3=");
        sb.append(this.a);
        sb.append(", dataAmount=");
        sb.append(this.b);
        p3p.u(sb, ", duration=", this.c, ", status=");
        sb.append(this.d);
        sb.append(", activationTime=");
        sb.append(this.e);
        sb.append(", usedDataAmount=");
        sb.append(this.f);
        sb.append(", isFreePlan=");
        sb.append(this.g);
        sb.append(", externalId=");
        return z1m.l(sb, this.h, ")");
    }
}
