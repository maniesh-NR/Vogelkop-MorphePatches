package defpackage;

/* loaded from: classes.dex */
public final class rd3 implements qz0 {
    public final float a;

    public rd3(float f) {
        this.a = f;
    }

    public final int a(int i, int i2, d2c d2cVar) {
        float f = (i2 - i) / 2.0f;
        d2c d2cVar2 = d2c.a;
        float f2 = this.a;
        if (d2cVar != d2cVar2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rd3) && Float.compare(this.a, ((rd3) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ")";
    }
}
