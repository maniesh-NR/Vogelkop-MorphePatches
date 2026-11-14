package defpackage;

/* loaded from: classes.dex */
public final class wff {
    public final String a;

    public wff(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof wff) && this.a.equals(((wff) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("OpaqueKey(key=", this.a, ")");
    }
}
