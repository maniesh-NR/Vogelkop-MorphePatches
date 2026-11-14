package defpackage;

/* loaded from: classes.dex */
public final class pd3 implements qz0 {
    public final float a;

    public pd3(float f) {
        this.a = f;
    }

    public final int a(int i, int i2, d2c d2cVar) {
        return Math.round((1.0f + this.a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pd3) && Float.compare(this.a, ((pd3) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ")";
    }
}
