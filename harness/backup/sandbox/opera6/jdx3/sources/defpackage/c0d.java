package defpackage;

/* loaded from: classes.dex */
public final class c0d {
    public final v3g a;
    public final boolean b;
    public final boolean c;

    public c0d(v3g v3gVar, boolean z, boolean z2) {
        this.a = v3gVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0d)) {
            return false;
        }
        c0d c0dVar = (c0d) obj;
        return this.a.equals(c0dVar.a) && this.b == c0dVar.b && this.c == c0dVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fki.k(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
