package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ss4 {
    public final List a;
    public final List b;
    public final List c;

    /* JADX WARN: Illegal instructions before constructor call */
    public ss4() {
        l08 l08Var = l08.a;
        this(l08Var, l08Var, l08Var);
    }

    public ss4(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss4)) {
            return false;
        }
        ss4 ss4Var = (ss4) obj;
        return Intrinsics.a(this.a, ss4Var.a) && Intrinsics.a(this.b, ss4Var.b) && Intrinsics.a(this.c, ss4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rfp.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
