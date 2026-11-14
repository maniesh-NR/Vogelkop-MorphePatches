package defpackage;

/* loaded from: classes.dex */
public final class j2l implements m2l {
    public final int a;
    public final long b;

    public j2l(int i) {
        this.a = i;
        cgm cgmVar = dgm.b;
        long j = i & 4294967295L;
        igm igmVar = jgm.b;
        this.b = j | 274877906944L;
    }

    @Override // defpackage.e4a
    public final a26 b() {
        return g4a.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2l) && this.a == ((j2l) obj).a;
    }

    @Override // defpackage.m2l
    public final long getId() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
