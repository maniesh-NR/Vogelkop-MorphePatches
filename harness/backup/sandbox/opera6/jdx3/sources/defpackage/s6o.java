package defpackage;

/* loaded from: classes.dex */
public final class s6o {
    public final String a;
    public final d3k b;

    public s6o(String str, d3k d3kVar) {
        this.a = str;
        this.b = d3kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6o)) {
            return false;
        }
        s6o s6oVar = (s6o) obj;
        return this.a.equals(s6oVar.a) && this.b.equals(s6oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
