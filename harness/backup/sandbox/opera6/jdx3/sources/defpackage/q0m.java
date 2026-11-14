package defpackage;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q0m {
    public final BigInteger a;
    public final BigInteger b;

    public q0m(BigInteger bigInteger, BigInteger bigInteger2) {
        this.a = bigInteger;
        this.b = bigInteger2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0m)) {
            return false;
        }
        q0m q0mVar = (q0m) obj;
        return Intrinsics.a(this.a, q0mVar.a) && Intrinsics.a(this.b, q0mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Fees(baseFeePerGas=" + this.a + ", maxPriorityFeePerGas=" + this.b + ")";
    }
}
