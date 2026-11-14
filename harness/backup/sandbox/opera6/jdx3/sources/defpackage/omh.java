package defpackage;

/* loaded from: classes.dex */
public final class omh {
    public final int a;
    public final long b;

    public omh(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omh)) {
            return false;
        }
        omh omhVar = (omh) obj;
        return this.a == omhVar.a && this.b == omhVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
