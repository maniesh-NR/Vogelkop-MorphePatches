package defpackage;

/* loaded from: classes.dex */
public final class dzh extends p58 {
    public final String b;

    public dzh(String str) {
        super(true);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof dzh) && this.b.equals(((dzh) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "";
    }
}
