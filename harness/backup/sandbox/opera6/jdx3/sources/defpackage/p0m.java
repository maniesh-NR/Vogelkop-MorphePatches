package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p0m {
    public final q0m a;
    public final long b;

    public p0m(q0m q0mVar, long j) {
        this.a = q0mVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0m)) {
            return false;
        }
        p0m p0mVar = (p0m) obj;
        return Intrinsics.a(this.a, p0mVar.a) && this.b == p0mVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Entry(fees=" + this.a + ", expiresAt=" + this.b + ")";
    }
}
