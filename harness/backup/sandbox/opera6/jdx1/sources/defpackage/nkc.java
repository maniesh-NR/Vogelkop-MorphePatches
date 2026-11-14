package defpackage;

/* loaded from: classes.dex */
public final class nkc {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (obj instanceof nkc) {
            return this.a == ((nkc) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a ? 1 : 0);
    }

    public final String toString() {
        boolean z = this.a;
        return !z ? "Polite" : z ? "Assertive" : "Unknown";
    }
}
