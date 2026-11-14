package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class poe {
    public final int a;
    public final long b;
    public final long c;
    public final one d;
    public final iyb e;
    public final fr6 f;

    public poe(int i, long j, long j2, one oneVar, iyb iybVar, fr6 fr6Var) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = oneVar;
        this.e = iybVar;
        this.f = fr6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof poe)) {
            return false;
        }
        poe poeVar = (poe) obj;
        return this.a == poeVar.a && this.b == poeVar.b && this.c == poeVar.c && Intrinsics.a(this.d, poeVar.d) && Intrinsics.a(this.e, poeVar.e) && Intrinsics.a(this.f, poeVar.f);
    }

    public final int hashCode() {
        int iH = z1m.h(this.d.a, z1m.e(z1m.e(this.a * 31, 31, this.b), 31, this.c), 31);
        iyb iybVar = this.e;
        int iHashCode = (iH + (iybVar == null ? 0 : iybVar.a.hashCode())) * 31;
        fr6 fr6Var = this.f;
        return iHashCode + (fr6Var != null ? fr6Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkResponse(code=");
        sb.append(this.a);
        sb.append(", requestMillis=");
        sb.append(this.b);
        p3p.u(sb, ", responseMillis=", this.c, ", headers=");
        sb.append(this.d);
        sb.append(", body=");
        sb.append(this.e);
        sb.append(", delegate=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
