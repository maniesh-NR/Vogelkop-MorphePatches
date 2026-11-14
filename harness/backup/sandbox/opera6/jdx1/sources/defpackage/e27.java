package defpackage;

/* loaded from: classes.dex */
public final class e27 implements us7 {
    public final int a;
    public final int b;

    public e27(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        b8b.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.us7
    public final void a(pw7 pw7Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = pw7Var.b;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(pw7Var.b((i5 - i4) + (-1))) && Character.isLowSurrogate(pw7Var.b(pw7Var.b - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int iT = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i6 = iT + 1;
            int i7 = pw7Var.c;
            i1 i1Var = (i1) pw7Var.f;
            if (i7 + i6 >= i1Var.t()) {
                iT = i1Var.t() - pw7Var.c;
                break;
            } else {
                iT = (Character.isHighSurrogate(pw7Var.b((pw7Var.c + i6) + (-1))) && Character.isLowSurrogate(pw7Var.b(pw7Var.c + i6))) ? iT + 2 : i6;
                i++;
            }
        }
        int i8 = pw7Var.c;
        pw7Var.a(i8, iT + i8);
        int i9 = pw7Var.b;
        pw7Var.a(i9 - i3, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e27)) {
            return false;
        }
        e27 e27Var = (e27) obj;
        return this.a == e27Var.a && this.b == e27Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return fki.o(this.a, this.b, "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", ", lengthAfterCursor=", ")");
    }
}
