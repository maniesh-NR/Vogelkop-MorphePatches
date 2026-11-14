package defpackage;

/* loaded from: classes.dex */
public final class ntl {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public ntl(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntl)) {
            return false;
        }
        ntl ntlVar = (ntl) obj;
        return this.a == ntlVar.a && this.b == ntlVar.b && this.c == ntlVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fki.k(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
