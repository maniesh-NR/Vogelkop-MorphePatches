package defpackage;

/* loaded from: classes.dex */
public final class vjl {
    public static final vjl c = new vjl(2, false);
    public static final vjl d = new vjl(1, true);
    public final int a;
    public final boolean b;

    public vjl(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjl)) {
            return false;
        }
        vjl vjlVar = (vjl) obj;
        return this.a == vjlVar.a && this.b == vjlVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return equals(c) ? "TextMotion.Static" : equals(d) ? "TextMotion.Animated" : "Invalid";
    }
}
