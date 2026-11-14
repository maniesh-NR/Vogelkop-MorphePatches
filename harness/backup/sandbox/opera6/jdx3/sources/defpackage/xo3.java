package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xo3 {
    public final List a;
    public final List b;
    public final boolean c;

    public xo3(List list, List list2, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo3)) {
            return false;
        }
        xo3 xo3Var = (xo3) obj;
        return Intrinsics.a(this.a, xo3Var.a) && Intrinsics.a(this.b, xo3Var.b) && this.c == xo3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rfp.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
