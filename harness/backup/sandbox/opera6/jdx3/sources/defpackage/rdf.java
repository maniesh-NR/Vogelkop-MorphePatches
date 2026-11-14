package defpackage;

/* loaded from: classes.dex */
public final class rdf {
    public final qdf a;
    public final boolean b;

    public rdf(qdf qdfVar, boolean z) {
        this.a = qdfVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdf)) {
            return false;
        }
        rdf rdfVar = (rdf) obj;
        return this.a == rdfVar.a && this.b == rdfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
