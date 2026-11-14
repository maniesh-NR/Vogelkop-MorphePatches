package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tsn {
    public final zm9 a;
    public final lsn b;
    public final nsn c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public tsn(zm9 zm9Var, lsn lsnVar, nsn nsnVar, boolean z, boolean z2, boolean z3) {
        this.a = zm9Var;
        this.b = lsnVar;
        this.c = nsnVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsn)) {
            return false;
        }
        tsn tsnVar = (tsn) obj;
        return Intrinsics.a(this.a, tsnVar.a) && this.b.equals(tsnVar.b) && this.c == tsnVar.c && this.d == tsnVar.d && this.e == tsnVar.e && this.f == tsnVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + fki.k(fki.k((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "";
    }
}
