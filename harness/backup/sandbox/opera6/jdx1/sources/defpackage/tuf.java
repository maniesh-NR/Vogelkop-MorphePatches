package defpackage;

/* loaded from: classes.dex */
public final class tuf {
    public final byte a;

    public static String a(int i) {
        return fki.r("MirrorMode(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tuf) {
            return this.a == ((tuf) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
