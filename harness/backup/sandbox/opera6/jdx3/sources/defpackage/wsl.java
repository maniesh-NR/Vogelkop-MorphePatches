package defpackage;

/* loaded from: classes.dex */
public final class wsl implements xsl {
    public final boolean a;

    public wsl(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wsl) && this.a == ((wsl) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
