package defpackage;

/* loaded from: classes.dex */
public final class b9b {
    public final byte a;

    public final boolean equals(Object obj) {
        if (obj instanceof b9b) {
            return this.a == ((b9b) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        byte b = this.a;
        return b == 1 ? "Touch" : b == 2 ? "Keyboard" : "Error";
    }
}
