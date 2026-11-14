package defpackage;

/* loaded from: classes.dex */
public final class a8d {
    public final boolean a;

    public a8d(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a8d) && this.a == ((a8d) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
