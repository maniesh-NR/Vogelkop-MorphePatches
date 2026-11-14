package defpackage;

import androidx.annotation.NonNull;
import com.opera.android.annotations.RequiredForTest;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class yv implements csl {
    public static final yv b = b(BigInteger.valueOf(Long.MIN_VALUE));
    public final BigInteger a;

    static {
        new yv(BigInteger.ZERO, false);
    }

    public yv(BigInteger bigInteger, boolean z) {
        if (z) {
            if (bigInteger.signum() >= 0) {
                qp2.o("Sentinel value must be negative");
                throw null;
            }
        } else if (bigInteger.signum() < 0) {
            qp2.o("Value must be non-negative");
            throw null;
        }
        this.a = bigInteger;
    }

    public static yv a(String str) {
        BigInteger bigInteger = new BigInteger(str, 16);
        return new yv(bigInteger, bigInteger.signum() < 0);
    }

    @NonNull
    @RequiredForTest
    public static yv b(@NonNull BigInteger bigInteger) {
        return new yv(bigInteger, true);
    }

    public static yv c(String str, b85 b85Var) {
        if (b85Var.b != 1) {
            return new yv(new BigInteger(1, str.getBytes()), false);
        }
        int i = yw5.a;
        if (str.startsWith("0x")) {
            str = str.substring(2);
        }
        return new yv(new BigInteger(str, 16), false);
    }

    @Override // defpackage.csl
    public final String a1() {
        return this.a.toString(16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yv.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((yv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
