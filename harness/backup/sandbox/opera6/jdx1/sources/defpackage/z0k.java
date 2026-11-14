package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z0k implements a1k {
    public final String a;
    public final gpm b;
    public final long c;
    public final long d;

    public z0k(String str, gpm gpmVar, long j, long j2) {
        this.a = str;
        this.b = gpmVar;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0k)) {
            return false;
        }
        z0k z0kVar = (z0k) obj;
        return Intrinsics.a(this.a, z0kVar.a) && this.b.equals(z0kVar.b) && this.c == z0kVar.c && this.d == z0kVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + z1m.e(z1m.f(this.a.hashCode() * 31, 31, this.b.g), 31, this.c);
    }

    public final String toString() {
        return "RequestConfirmation(productTitle=" + this.a + ", productIconUrl=" + this.b + ", currentBalance=" + this.c + ", priceInPoints=" + this.d + ")";
    }
}
