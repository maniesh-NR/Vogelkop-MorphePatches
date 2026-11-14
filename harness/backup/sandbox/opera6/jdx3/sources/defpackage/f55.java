package defpackage;

/* loaded from: classes.dex */
public final class f55 {
    public final boolean a;

    public f55(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f55) && this.a == ((f55) obj).a;
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
