package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s3k implements we1 {
    public final h49 a;
    public final long b;

    public s3k(h49 h49Var, long j) {
        this.a = h49Var;
        this.b = j;
    }

    @Override // defpackage.we1
    public final y0n a(j8m j8mVar) {
        return new t3k(this.a.a(j8mVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s3k)) {
            return false;
        }
        s3k s3kVar = (s3k) obj;
        return s3kVar.b == this.b && Intrinsics.a(s3kVar.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
