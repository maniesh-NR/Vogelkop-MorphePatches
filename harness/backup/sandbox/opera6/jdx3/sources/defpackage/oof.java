package defpackage;

/* loaded from: classes.dex */
public final class oof {
    public final nof a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public oof(nof nofVar, boolean z, boolean z2, boolean z3) {
        this.a = nofVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oof)) {
            return false;
        }
        oof oofVar = (oof) obj;
        return this.a == oofVar.a && this.b == oofVar.b && this.c == oofVar.c && this.d == oofVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + fki.k(fki.k(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
