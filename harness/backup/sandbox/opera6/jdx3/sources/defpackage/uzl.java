package defpackage;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class uzl {

    @NotNull
    public static final tzl Companion = new tzl();
    public static final l4c[] f = {z4c.a(f7c.b, new thk((byte) 26)), null, null, null, null};
    public final h46 a;
    public final BigInteger b;
    public final BigInteger c;
    public final BigInteger d;
    public final w8e e;

    public uzl(int i, h46 h46Var, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, w8e w8eVar) {
        BigInteger bigInteger4;
        if (1 != (i & 1)) {
            x7d.I(i, 1, szl.a.getDescriptor());
            throw null;
        }
        this.a = h46Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bigInteger;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bigInteger2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bigInteger3;
        }
        if ((i & 16) != 0) {
            this.e = w8eVar;
        } else {
            BigInteger bigInteger5 = this.c;
            this.e = new w8e(h46Var.j((bigInteger5 == null || (bigInteger4 = this.d) == null) ? pe3.a : bigInteger5.multiply(bigInteger4)), h46Var);
        }
    }

    public uzl(h46 h46Var, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.a = h46Var;
        this.b = bigInteger;
        this.c = bigInteger2;
        this.d = bigInteger3;
        this.e = new w8e(h46Var.j((bigInteger2 == null || bigInteger3 == null) ? pe3.a : bigInteger2.multiply(bigInteger3)), h46Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzl)) {
            return false;
        }
        uzl uzlVar = (uzl) obj;
        return this.a == uzlVar.a && Intrinsics.a(this.b, uzlVar.b) && Intrinsics.a(this.c, uzlVar.c) && Intrinsics.a(this.d, uzlVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        BigInteger bigInteger = this.b;
        int iHashCode2 = (iHashCode + (bigInteger == null ? 0 : bigInteger.hashCode())) * 31;
        BigInteger bigInteger2 = this.c;
        int iHashCode3 = (iHashCode2 + (bigInteger2 == null ? 0 : bigInteger2.hashCode())) * 31;
        BigInteger bigInteger3 = this.d;
        return iHashCode3 + (bigInteger3 != null ? bigInteger3.hashCode() : 0);
    }

    public final String toString() {
        return "Fee(currency=" + this.a + ", maxPriorityPerGas=" + this.b + ", maxPerGas=" + this.c + ", amount=" + this.d + ")";
    }
}
