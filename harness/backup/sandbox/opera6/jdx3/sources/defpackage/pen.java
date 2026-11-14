package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pen {
    public final Integer a;
    public final CharSequence b;
    public final boolean c;
    public final boolean d;
    public final eb8 e;

    public pen(Integer num, CharSequence charSequence, boolean z, boolean z2, eb8 eb8Var) {
        this.a = num;
        this.b = charSequence;
        this.c = z;
        this.d = z2;
        this.e = eb8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pen)) {
            return false;
        }
        pen penVar = (pen) obj;
        return Intrinsics.a(this.a, penVar.a) && Intrinsics.a(this.b, penVar.b) && this.c == penVar.c && this.d == penVar.d && Intrinsics.a(this.e, penVar.e);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int iK = fki.k(fki.k((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.c), 31, this.d);
        eb8 eb8Var = this.e;
        return iK + (eb8Var != null ? eb8Var.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
