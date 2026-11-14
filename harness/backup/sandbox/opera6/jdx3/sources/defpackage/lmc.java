package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lmc {
    public final long a;
    public final oi9 b;
    public final vmc c;
    public final String d;
    public final rmc e;
    public final smc f;
    public final omc g;
    public final imc h;
    public final boolean i;
    public final boolean j;

    public lmc(long j, oi9 oi9Var, vmc vmcVar, String str, rmc rmcVar, smc smcVar, omc omcVar, imc imcVar, boolean z, boolean z2) {
        ix5 ix5Var = apc.b;
        this.a = j;
        this.b = oi9Var;
        this.c = vmcVar;
        this.d = str;
        this.e = rmcVar;
        this.f = smcVar;
        this.g = omcVar;
        this.h = imcVar;
        this.i = z;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmc)) {
            return false;
        }
        lmc lmcVar = (lmc) obj;
        if (this.a != lmcVar.a) {
            return false;
        }
        ix5 ix5Var = apc.b;
        return this.b == lmcVar.b && this.c.equals(lmcVar.c) && Intrinsics.a(this.d, lmcVar.d) && this.e.equals(lmcVar.e) && this.f == lmcVar.f && this.g == lmcVar.g && Intrinsics.a(this.h, lmcVar.h) && this.i == lmcVar.i && this.j == lmcVar.j;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + ((apc.c.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31)) * 31;
        String str = this.d;
        int iHashCode2 = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
        imc imcVar = this.h;
        return Boolean.hashCode(this.j) + fki.k((iHashCode2 + (imcVar != null ? imcVar.hashCode() : 0)) * 31, 31, this.i);
    }

    public final String toString() {
        return "";
    }
}
