package defpackage;

/* loaded from: classes.dex */
public final class h8h implements i8h {
    public final zf a;
    public final qfe b;

    public h8h(zf zfVar, qfe qfeVar) {
        this.a = zfVar;
        this.b = qfeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8h)) {
            return false;
        }
        h8h h8hVar = (h8h) obj;
        return this.a == h8hVar.a && this.b == h8hVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(activeCamera=" + this.a + ", token=" + this.b + ')';
    }
}
