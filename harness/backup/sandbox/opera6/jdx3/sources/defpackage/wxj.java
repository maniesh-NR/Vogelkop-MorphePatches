package defpackage;

/* loaded from: classes.dex */
public final class wxj extends j7h {
    public final int b;
    public final ixh c = new ixh(0.0f);

    public wxj(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wxj) && this.b == ((wxj) obj).b;
    }

    public final ixh h() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return "";
    }
}
