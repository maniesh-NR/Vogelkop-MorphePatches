package defpackage;

/* loaded from: classes.dex */
public final class col extends bwg {
    public final boolean a;

    public col(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof col) && this.a == ((col) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
