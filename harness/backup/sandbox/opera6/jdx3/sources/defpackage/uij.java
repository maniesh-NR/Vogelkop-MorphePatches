package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class uij {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final s5h d;

    public uij(boolean z, boolean z2, boolean z3, s5h s5hVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = s5hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uij)) {
            return false;
        }
        uij uijVar = (uij) obj;
        return this.a == uijVar.a && this.b == uijVar.b && this.c == uijVar.c && Intrinsics.a(this.d, uijVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + fki.k(fki.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
