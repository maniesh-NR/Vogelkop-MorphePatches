package defpackage;

/* loaded from: classes.dex */
public final class lo3 {
    public final boolean a;

    public lo3(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lo3) && this.a == ((lo3) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
