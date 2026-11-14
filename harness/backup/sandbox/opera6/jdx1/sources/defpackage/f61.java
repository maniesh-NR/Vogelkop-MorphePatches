package defpackage;

/* loaded from: classes.dex */
public final class f61 {
    public final float a;
    public final float b;

    public f61(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f61)) {
            return false;
        }
        f61 f61Var = (f61) obj;
        return Float.compare(this.a, f61Var.a) == 0 && Float.compare(this.b, f61Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FlingResult(distanceCoefficient=" + this.a + ", velocityCoefficient=" + this.b + ")";
    }
}
