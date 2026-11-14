package defpackage;

/* loaded from: classes.dex */
public final class d5b extends p58 {
    public final int b;

    public d5b(int i) {
        super(true);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d5b) && this.b == ((d5b) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return "";
    }
}
