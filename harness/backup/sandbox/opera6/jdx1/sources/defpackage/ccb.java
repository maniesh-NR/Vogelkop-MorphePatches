package defpackage;

/* loaded from: classes.dex */
public final class ccb {
    public static final ccb e = new ccb(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ccb(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        return (((d() / 2) + this.a) << 32) | (((b() / 2) + this.b) & 4294967295L);
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        return (this.a << 32) | (this.b & 4294967295L);
    }

    public final int d() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccb)) {
            return false;
        }
        ccb ccbVar = (ccb) obj;
        return this.a == ccbVar.a && this.b == ccbVar.b && this.c == ccbVar.c && this.d == ccbVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + rfp.c(this.c, rfp.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = sko.o(this.a, this.b, "IntRect.fromLTRB(", ", ", ", ");
        sbO.append(this.c);
        sbO.append(", ");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }
}
