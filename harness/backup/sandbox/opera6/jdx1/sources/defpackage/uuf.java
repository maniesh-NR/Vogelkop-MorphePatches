package defpackage;

/* loaded from: classes.dex */
public final class uuf {
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uuf) {
            return this.a == ((uuf) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "StreamUseCase(value=" + this.a + ')';
    }
}
