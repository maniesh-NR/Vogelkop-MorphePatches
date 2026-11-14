package defpackage;

/* loaded from: classes.dex */
public final class vil {
    public static final vil c = new vil(1.0f, 0.0f);
    public final float a;
    public final float b;

    public vil(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vil)) {
            return false;
        }
        vil vilVar = (vil) obj;
        return this.a == vilVar.a && this.b == vilVar.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=" + this.a + ", skewX=" + this.b + ")";
    }
}
