package defpackage;

/* loaded from: classes.dex */
public final class c22 {
    public final String a;
    public final boolean b;

    public c22(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c22)) {
            return false;
        }
        c22 c22Var = (c22) obj;
        return this.a.equals(c22Var.a) && this.b == c22Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
