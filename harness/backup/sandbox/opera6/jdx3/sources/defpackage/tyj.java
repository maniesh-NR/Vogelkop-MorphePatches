package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tyj {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public int e = 0;

    public tyj(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyj)) {
            return false;
        }
        tyj tyjVar = (tyj) obj;
        return Intrinsics.a(this.a, tyjVar.a) && this.b.equals(tyjVar.b) && Intrinsics.a(this.c, tyjVar.c) && this.d == tyjVar.d && this.e == tyjVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + rfp.c(this.d, z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        return "";
    }
}
