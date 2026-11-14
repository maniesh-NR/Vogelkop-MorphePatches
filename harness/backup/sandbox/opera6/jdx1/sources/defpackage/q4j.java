package defpackage;

/* loaded from: classes.dex */
public final class q4j implements us7 {
    public final int a;
    public final int b;

    public q4j(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.us7
    public final void a(pw7 pw7Var) {
        boolean z = pw7Var.d != -1;
        i1 i1Var = (i1) pw7Var.f;
        if (z) {
            pw7Var.d = -1;
            pw7Var.e = -1;
        }
        int iC = djh.c(this.a, 0, i1Var.t());
        int iC2 = djh.c(this.b, 0, i1Var.t());
        if (iC != iC2) {
            if (iC < iC2) {
                pw7Var.f(iC, iC2);
            } else {
                pw7Var.f(iC2, iC);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4j)) {
            return false;
        }
        q4j q4jVar = (q4j) obj;
        return this.a == q4jVar.a && this.b == q4jVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return fki.o(this.a, this.b, "SetComposingRegionCommand(start=", ", end=", ")");
    }
}
