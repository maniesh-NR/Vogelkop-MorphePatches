package defpackage;

/* loaded from: classes.dex */
public final class osl {
    public final nsl a;
    public final boolean b;
    public final boolean c;

    public osl(nsl nslVar, boolean z, boolean z2) {
        this.a = nslVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osl)) {
            return false;
        }
        osl oslVar = (osl) obj;
        return this.a == oslVar.a && this.b == oslVar.b && this.c == oslVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fki.k(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
