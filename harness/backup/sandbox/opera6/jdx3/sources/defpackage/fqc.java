package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fqc extends gqc {
    public final List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public fqc(List list, boolean z, boolean z2, boolean z3) {
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqc)) {
            return false;
        }
        fqc fqcVar = (fqc) obj;
        return Intrinsics.a(this.a, fqcVar.a) && this.b == fqcVar.b && this.c == fqcVar.c && this.d == fqcVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + fki.k(fki.k(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
