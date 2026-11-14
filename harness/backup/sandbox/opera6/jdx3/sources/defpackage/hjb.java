package defpackage;

/* loaded from: classes.dex */
public final class hjb extends p58 {
    public final String b;

    public hjb(String str) {
        super(true);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof hjb) && this.b.equals(((hjb) obj).b);
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
