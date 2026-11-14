package defpackage;

/* loaded from: classes.dex */
public final class a2m {
    public static final long b = z7h.a(0.5f, 0.5f);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        return z1m.j(j, "TransformOrigin(packedValue=", ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a2m) {
            return this.a == ((a2m) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
