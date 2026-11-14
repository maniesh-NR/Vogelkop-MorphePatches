package defpackage;

/* loaded from: classes.dex */
public final class l27 {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l27) && this.a == ((l27) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return p3p.i(this.a, "DeltaCounter(count=", ")");
    }
}
