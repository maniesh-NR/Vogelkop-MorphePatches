package defpackage;

/* loaded from: classes.dex */
public final class qql {
    public final long a;

    public static String a(long j) {
        return "TimestampNs(value=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qql) {
            return this.a == ((qql) obj).a;
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
