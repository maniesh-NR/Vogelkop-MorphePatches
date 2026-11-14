package defpackage;

/* loaded from: classes.dex */
public final class p9h extends r9h {
    public final int b;

    public p9h(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p9h) && this.b == ((p9h) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return p3p.i(this.b, "Offset(value=", ")");
    }
}
