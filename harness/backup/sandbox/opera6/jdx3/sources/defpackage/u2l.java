package defpackage;

/* loaded from: classes.dex */
public final class u2l implements m2l {
    public final b2l a;
    public final int b;
    public final long c;

    public u2l(b2l b2lVar, int i) {
        this.a = b2lVar;
        this.b = i;
        int id = ((d7l) b2lVar).j.getId();
        cgm cgmVar = dgm.b;
        this.c = id & 4294967295L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2l)) {
            return false;
        }
        u2l u2lVar = (u2l) obj;
        return this.a.equals(u2lVar.a) && this.b == u2lVar.b;
    }

    @Override // defpackage.m2l
    public final long getId() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
