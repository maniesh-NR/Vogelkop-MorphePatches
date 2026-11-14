package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yb5 implements us7 {
    public final sf1 a;
    public final int b;

    public yb5(String str, int i) {
        this(new sf1(str), i);
    }

    public yb5(sf1 sf1Var, int i) {
        this.a = sf1Var;
        this.b = i;
    }

    @Override // defpackage.us7
    public final void a(pw7 pw7Var) {
        int i = pw7Var.d;
        sf1 sf1Var = this.a;
        if (i != -1) {
            pw7Var.e(i, pw7Var.e, sf1Var.b);
        } else {
            pw7Var.e(pw7Var.b, pw7Var.c, sf1Var.b);
        }
        int i2 = pw7Var.b;
        int i3 = pw7Var.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int i6 = i4 + i5;
        int iC = djh.c(i5 > 0 ? i6 - 1 : i6 - sf1Var.b.length(), 0, ((i1) pw7Var.f).t());
        pw7Var.g(iC, iC);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb5)) {
            return false;
        }
        yb5 yb5Var = (yb5) obj;
        return Intrinsics.a(this.a.b, yb5Var.a.b) && this.b == yb5Var.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "CommitTextCommand(text='" + this.a.b + "', newCursorPosition=" + this.b + ")";
    }
}
