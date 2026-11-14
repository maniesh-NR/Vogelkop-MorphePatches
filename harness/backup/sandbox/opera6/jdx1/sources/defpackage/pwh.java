package defpackage;

/* loaded from: classes.dex */
public final class pwh {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof pwh) {
            return this.a == ((pwh) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "RequestNumber(value=" + this.a + ')';
    }
}
