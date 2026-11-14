package defpackage;

/* loaded from: classes.dex */
public final class r2l implements m2l {
    public final q2l a;
    public final long b;

    public r2l(q2l q2lVar) {
        this.a = q2lVar;
        long jOrdinal = q2lVar.ordinal();
        igm igmVar = jgm.b;
        this.b = jOrdinal | 549755813888L;
    }

    @Override // defpackage.e4a
    public final a26 b() {
        return g4a.o;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof r2l) && this.a == ((r2l) obj).a;
        }
        return true;
    }

    @Override // defpackage.m2l
    public final long getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
