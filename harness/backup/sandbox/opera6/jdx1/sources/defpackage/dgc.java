package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dgc {
    public final int a;
    public final int b;
    public final String c;

    public dgc(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgc)) {
            return false;
        }
        dgc dgcVar = (dgc) obj;
        return this.a == dgcVar.a && this.b == dgcVar.b && Intrinsics.a(this.c, dgcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rfp.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return z1m.l(sko.o(this.a, this.b, "LinkWithPosition(start=", ", end=", ", url="), this.c, ")");
    }
}
