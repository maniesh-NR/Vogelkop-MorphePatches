package defpackage;

/* loaded from: classes.dex */
public final class g3e {
    public final g1b a;
    public final g1b b;
    public final g1b c;

    public g3e(g1b g1bVar, g1b g1bVar2, g1b g1bVar3) {
        this.a = g1bVar;
        this.b = g1bVar2;
        this.c = g1bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3e)) {
            return false;
        }
        g3e g3eVar = (g3e) obj;
        return this.a.equals(g3eVar.a) && this.b.equals(g3eVar.b) && this.c.equals(g3eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MissionsUiState(banners=" + this.a + ", active=" + this.b + ", completed=" + this.c + ")";
    }
}
