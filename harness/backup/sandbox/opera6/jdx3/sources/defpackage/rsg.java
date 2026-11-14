package defpackage;

/* loaded from: classes.dex */
public final class rsg {
    public final p8l a;
    public final boolean b;
    public final boolean c;

    public rsg(p8l p8lVar, boolean z, boolean z2) {
        this.a = p8lVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsg)) {
            return false;
        }
        rsg rsgVar = (rsg) obj;
        return this.a == rsgVar.a && this.b == rsgVar.b && this.c == rsgVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fki.k(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
