package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public abstract class y8e {
    public static final RoundingMode a = RoundingMode.HALF_EVEN;

    public static final BigInteger a(int i, int i2, BigInteger bigInteger) {
        int i3 = i2 - i;
        if (i3 < 0) {
            return new BigDecimal(bigInteger).scaleByPowerOfTen(i3).setScale(0, a).toBigIntegerExact();
        }
        if (i3 <= 0) {
            return bigInteger;
        }
        BigInteger bigInteger2 = pe3.a;
        return bigInteger.multiply(pe3.d.pow(i3));
    }

    public static final BigDecimal b(int i) {
        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
        if (a == roundingMode) {
            BigDecimal bigDecimal = he3.a;
            return he3.b.scaleByPowerOfTen(-i).setScale(i + 1, roundingMode).divide(BigDecimal.valueOf(2L), roundingMode);
        }
        qp2.n("Check failed.");
        return null;
    }
}
