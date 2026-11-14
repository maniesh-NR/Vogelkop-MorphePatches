package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ite {
    public final List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public ite(List list, boolean z, boolean z2, boolean z3) {
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ite)) {
            return false;
        }
        ite iteVar = (ite) obj;
        return Intrinsics.a(this.a, iteVar.a) && this.b == iteVar.b && this.c == iteVar.c && this.d == iteVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + fki.k(fki.k(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
