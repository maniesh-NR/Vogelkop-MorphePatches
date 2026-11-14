package defpackage;

/* loaded from: classes.dex */
public final class ma2 {
    public final byte a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public ma2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma2)) {
            return false;
        }
        ma2 ma2Var = (ma2) obj;
        return this.a == ma2Var.a && this.b == ma2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
