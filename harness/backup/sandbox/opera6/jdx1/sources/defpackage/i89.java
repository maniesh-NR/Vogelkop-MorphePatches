package defpackage;

/* loaded from: classes.dex */
public final class i89 {
    public final float a;
    public final float b;
    public final long c;

    public i89(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i89)) {
            return false;
        }
        i89 i89Var = (i89) obj;
        return Float.compare(this.a, i89Var.a) == 0 && Float.compare(this.b, i89Var.b) == 0 && this.c == i89Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + sko.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return j7c.o(this.c, ")", am2.p("FlingInfo(initialVelocity=", this.a, ", distance=", this.b, ", duration="));
    }
}
