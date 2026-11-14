package defpackage;

/* loaded from: classes.dex */
public final class kij {
    public final String a;
    public final String b;

    public kij(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kij)) {
            return false;
        }
        kij kijVar = (kij) obj;
        return this.a.equals(kijVar.a) && this.b.equals(kijVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return sko.l("SiaEntry(searchTerm=", this.a, ", searchUrl=", this.b, ")");
    }
}
