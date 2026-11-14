package defpackage;

/* loaded from: classes.dex */
public final class d27 implements us7 {
    public final int a;
    public final int b;

    public d27(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        b8b.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.us7
    public final void a(pw7 pw7Var) {
        int i = pw7Var.c;
        i1 i1Var = (i1) pw7Var.f;
        int i2 = this.b;
        int iT = i + i2;
        if (((i ^ iT) & (i2 ^ iT)) < 0) {
            iT = i1Var.t();
        }
        pw7Var.a(pw7Var.c, Math.min(iT, i1Var.t()));
        int i3 = pw7Var.b;
        int i4 = this.a;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        pw7Var.a(Math.max(0, i5), pw7Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d27)) {
            return false;
        }
        d27 d27Var = (d27) obj;
        return this.a == d27Var.a && this.b == d27Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return fki.o(this.a, this.b, "DeleteSurroundingTextCommand(lengthBeforeCursor=", ", lengthAfterCursor=", ")");
    }
}
