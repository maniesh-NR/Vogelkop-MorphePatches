package ads_mobile_sdk;

/* loaded from: classes.dex */
public final class u22 {
    public final int a;
    public final int b;
    public final boolean c;
    public final double d;

    public u22(int i, int i2, boolean z, double d) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u22)) {
            return false;
        }
        u22 u22Var = (u22) obj;
        return this.a == u22Var.a && this.b == u22Var.b && this.c == u22Var.c && Double.compare(this.d, u22Var.d) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iA = n6h.a(this.b, Integer.hashCode(this.a) * 31);
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Double.hashCode(this.d) + ((iA + i) * 31);
    }

    public final String toString() {
        StringBuilder sbO = sko.o(this.a, this.b, "NetworkPingStrategy(maxAttempts=", ", initialBackoffMs=", ", bufferAfterMaxAttempts=");
        sbO.append(this.c);
        sbO.append(", backoffMultiplier=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }
}
