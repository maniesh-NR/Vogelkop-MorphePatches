package defpackage;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o0m {
    public final BigInteger a;
    public final BigInteger b;

    public o0m(BigInteger bigInteger, BigInteger bigInteger2) {
        this.a = bigInteger;
        this.b = bigInteger2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0m)) {
            return false;
        }
        o0m o0mVar = (o0m) obj;
        return Intrinsics.a(this.a, o0mVar.a) && Intrinsics.a(this.b, o0mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BaseFee(perGas=" + this.a + ", eip1559Denominator=" + this.b + ")";
    }
}
