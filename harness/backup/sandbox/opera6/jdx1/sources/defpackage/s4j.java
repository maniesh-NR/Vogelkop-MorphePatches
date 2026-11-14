package defpackage;

/* loaded from: classes.dex */
public final class s4j implements us7 {
    public final int a;
    public final int b;

    public s4j(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.us7
    public final void a(pw7 pw7Var) {
        int iC = djh.c(this.a, 0, ((i1) pw7Var.f).t());
        int iC2 = djh.c(this.b, 0, ((i1) pw7Var.f).t());
        if (iC < iC2) {
            pw7Var.g(iC, iC2);
        } else {
            pw7Var.g(iC2, iC);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4j)) {
            return false;
        }
        s4j s4jVar = (s4j) obj;
        return this.a == s4jVar.a && this.b == s4jVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return fki.o(this.a, this.b, "SetSelectionCommand(start=", ", end=", ")");
    }
}
