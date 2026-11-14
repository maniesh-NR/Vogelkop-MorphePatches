package defpackage;

/* loaded from: classes.dex */
public final class ua3 {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof ua3) {
            return Float.compare(this.a, ((ua3) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ")";
    }
}
