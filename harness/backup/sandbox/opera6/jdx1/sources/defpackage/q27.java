package defpackage;

/* loaded from: classes.dex */
public final class q27 implements n27 {
    public final float a;
    public final float b;

    public q27(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.n27
    public final float b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q27)) {
            return false;
        }
        q27 q27Var = (q27) obj;
        return Float.compare(this.a, q27Var.a) == 0 && Float.compare(this.b, q27Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // defpackage.n27
    public final float n0() {
        return this.b;
    }

    public final String toString() {
        return "DensityImpl(density=" + this.a + ", fontScale=" + this.b + ")";
    }
}
