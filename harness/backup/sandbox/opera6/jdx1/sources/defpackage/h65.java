package defpackage;

/* loaded from: classes.dex */
public final class h65 implements i65 {
    public final float a;

    public h65(float f) {
        this.a = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final Comparable b() {
        return Float.valueOf(0.0f);
    }

    public final Comparable c() {
        return Float.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h65) {
            return (isEmpty() && ((h65) obj).isEmpty()) || this.a == ((h65) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.a);
    }

    public final boolean isEmpty() {
        return 0.0f > this.a;
    }

    public final String toString() {
        return "0.0.." + this.a;
    }
}
