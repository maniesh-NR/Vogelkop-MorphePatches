package defpackage;

/* loaded from: classes.dex */
public final class uec implements di9 {
    public final float a;

    public uec(float f) {
        this.a = f;
    }

    public final float a(float f) {
        return f / this.a;
    }

    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uec) && Float.compare(this.a, ((uec) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ")";
    }
}
