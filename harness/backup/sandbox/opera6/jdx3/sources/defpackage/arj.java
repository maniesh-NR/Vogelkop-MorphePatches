package defpackage;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class arj {
    public static final zqj c = new zqj();
    public final BigInteger a;
    public final BigInteger b;

    public arj(BigInteger bigInteger, BigInteger bigInteger2) {
        this.a = bigInteger;
        this.b = bigInteger2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arj)) {
            return false;
        }
        arj arjVar = (arj) obj;
        return Intrinsics.a(this.a, arjVar.a) && Intrinsics.a(this.b, arjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MedianRateResult(numerator=" + this.a + ", denominator=" + this.b + ")";
    }
}
