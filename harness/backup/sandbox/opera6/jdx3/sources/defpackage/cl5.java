package defpackage;

/* loaded from: classes.dex */
public final class cl5 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof cl5) {
            return this.a == ((cl5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 1 ? "SUPPORTED" : i == 2 ? "UNSUPPORTED" : "UNKNOWN";
    }
}
