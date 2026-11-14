package defpackage;

/* loaded from: classes.dex */
public final class z5j extends p58 {
    public final String b;

    public z5j(String str) {
        super(true);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof z5j) && this.b.equals(((z5j) obj).b);
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
