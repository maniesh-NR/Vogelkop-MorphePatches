package defpackage;

/* loaded from: classes.dex */
public final class r0o {
    public final float a;
    public final float b;

    public r0o(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float[] a() {
        float f = this.a;
        float f2 = this.b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0o)) {
            return false;
        }
        r0o r0oVar = (r0o) obj;
        return Float.compare(this.a, r0oVar.a) == 0 && Float.compare(this.b, r0oVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "WhitePoint(x=" + this.a + ", y=" + this.b + ")";
    }
}
