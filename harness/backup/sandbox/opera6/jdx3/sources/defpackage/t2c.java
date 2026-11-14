package defpackage;

/* loaded from: classes.dex */
public final class t2c {
    public final int a;
    public final int b;
    public final boolean c;

    public t2c(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2c)) {
            return false;
        }
        t2c t2cVar = (t2c) obj;
        return this.a == t2cVar.a && this.b == t2cVar.b && this.c == t2cVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rfp.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return z1m.m(sko.o(this.a, this.b, "BidiRun(start=", ", end=", ", isRtl="), this.c, ")");
    }
}
