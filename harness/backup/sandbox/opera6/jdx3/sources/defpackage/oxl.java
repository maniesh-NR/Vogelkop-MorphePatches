package defpackage;

/* loaded from: classes.dex */
public final class oxl {
    public final long a;
    public final pxl b;

    public oxl(long j, pxl pxlVar) {
        this.a = j;
        this.b = pxlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxl)) {
            return false;
        }
        oxl oxlVar = (oxl) obj;
        return this.a == oxlVar.a && this.b == oxlVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TournamentAssociationId(id=" + this.a + ", sport=" + this.b + ")";
    }
}
