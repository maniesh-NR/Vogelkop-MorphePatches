package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z48 {
    public final List a;
    public final List b;

    public z48(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z48)) {
            return false;
        }
        z48 z48Var = (z48) obj;
        return Intrinsics.a(this.a, z48Var.a) && Intrinsics.a(this.b, z48Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
