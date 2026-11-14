package defpackage;

/* loaded from: classes.dex */
public final class ez7 {
    public final int a;

    public static String a(int i) {
        return i == 0 ? "EmojiSupportMatch.Default" : i == 1 ? "EmojiSupportMatch.None" : i == 2 ? "EmojiSupportMatch.All" : p3p.i(i, "Invalid(value=", ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ez7) {
            return this.a == ((ez7) obj).a;
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
