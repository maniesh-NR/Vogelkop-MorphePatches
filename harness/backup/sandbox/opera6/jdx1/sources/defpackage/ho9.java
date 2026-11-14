package defpackage;

/* loaded from: classes.dex */
public final class ho9 {
    public final long a;

    public static String a(long j) {
        return p3p.l(j, "Frame-");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ho9) {
            return this.a == ((ho9) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
