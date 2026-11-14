package ads_mobile_sdk;

/* loaded from: classes.dex */
public final class ay2 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ay2(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay2)) {
            return false;
        }
        ay2 ay2Var = (ay2) obj;
        return this.a == ay2Var.a && this.b == ay2Var.b && this.c == ay2Var.c && this.d == ay2Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + n6h.a(this.c, n6h.a(this.b, Integer.hashCode(this.a) * 31));
    }

    public final String toString() {
        StringBuilder sbO = sko.o(this.a, this.b, "RoundedCornerRadii(topLeft=", ", topRight=", ", bottomRight=");
        sbO.append(this.c);
        sbO.append(", bottomLeft=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }
}
