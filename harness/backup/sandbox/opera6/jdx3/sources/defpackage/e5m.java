package defpackage;

/* loaded from: classes.dex */
public final class e5m {
    public final boolean a;
    public final boolean b;
    public final szb c;
    public final boolean d;

    public e5m(boolean z, boolean z2, szb szbVar, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = szbVar;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5m)) {
            return false;
        }
        e5m e5mVar = (e5m) obj;
        return this.a == e5mVar.a && this.b == e5mVar.b && this.c == e5mVar.c && this.d == e5mVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + fki.k(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "";
    }
}
