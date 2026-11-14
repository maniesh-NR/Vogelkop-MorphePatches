package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r4j implements us7 {
    public final sf1 a;
    public final int b;

    public r4j(String str, int i) {
        this.a = new sf1(str);
        this.b = i;
    }

    @Override // defpackage.us7
    public final void a(pw7 pw7Var) {
        String str = this.a.b;
        int i = pw7Var.d;
        if (i != -1) {
            pw7Var.e(i, pw7Var.e, str);
            if (str.length() > 0) {
                pw7Var.f(i, str.length() + i);
            }
        } else {
            int i2 = pw7Var.b;
            pw7Var.e(i2, pw7Var.c, str);
            if (str.length() > 0) {
                pw7Var.f(i2, str.length() + i2);
            }
        }
        int i3 = pw7Var.b;
        int i4 = pw7Var.c;
        int i5 = i3 == i4 ? i4 : -1;
        int i6 = this.b;
        int i7 = i5 + i6;
        int iC = djh.c(i6 > 0 ? i7 - 1 : i7 - str.length(), 0, ((i1) pw7Var.f).t());
        pw7Var.g(iC, iC);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4j)) {
            return false;
        }
        r4j r4jVar = (r4j) obj;
        return Intrinsics.a(this.a.b, r4jVar.a.b) && this.b == r4jVar.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "SetComposingTextCommand(text='" + this.a.b + "', newCursorPosition=" + this.b + ")";
    }
}
