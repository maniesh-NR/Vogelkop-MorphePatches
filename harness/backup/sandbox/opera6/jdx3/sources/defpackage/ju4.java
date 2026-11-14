package defpackage;

/* loaded from: classes.dex */
public final class ju4 {
    public final long a;

    public static boolean a(long j, Object obj) {
        return (obj instanceof ju4) && j == ((ju4) obj).a;
    }

    public final boolean equals(Object obj) {
        return a(this.a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return z1m.j(this.a, "ChatId(raw=", ")");
    }
}
