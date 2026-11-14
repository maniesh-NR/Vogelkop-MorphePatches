package defpackage;

/* loaded from: classes.dex */
public final class vuf {
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vuf) {
            return this.a == ((vuf) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "StreamUseHint(value=" + this.a + ')';
    }
}
