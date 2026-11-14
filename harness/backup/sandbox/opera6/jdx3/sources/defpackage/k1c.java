package defpackage;

/* loaded from: classes.dex */
public final class k1c {
    public final int a;

    public k1c(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof k1c) && this.a == ((k1c) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
