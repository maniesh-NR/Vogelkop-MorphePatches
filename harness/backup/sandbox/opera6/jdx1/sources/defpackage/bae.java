package defpackage;

/* loaded from: classes.dex */
public final class bae {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof bae) {
            return this.a == ((bae) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return z1m.j(this.a, "IndirectPointerEventData(packedValue=", ")");
    }
}
