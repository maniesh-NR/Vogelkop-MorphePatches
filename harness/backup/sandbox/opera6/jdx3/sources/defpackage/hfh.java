package defpackage;

/* loaded from: classes.dex */
public final class hfh implements jfh {
    public final boolean a;

    public hfh(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof hfh) && this.a == ((hfh) obj).a;
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
