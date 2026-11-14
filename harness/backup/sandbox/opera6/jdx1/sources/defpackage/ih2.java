package defpackage;

/* loaded from: classes.dex */
public final class ih2 {
    public final byte a;

    public final boolean equals(Object obj) {
        if (obj instanceof ih2) {
            return this.a == ((ih2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fki.r("AudioRestrictionMode(value=", this.a, ')');
    }
}
