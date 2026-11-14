package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fx4 {
    public final nv4 a;
    public final List b;
    public final jx9 c;

    public fx4(nv4 nv4Var, List list) {
        this.a = nv4Var;
        this.b = list;
        this.c = new jx9(list.size() + 1, new bo3(this, (byte) 21));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx4)) {
            return false;
        }
        fx4 fx4Var = (fx4) obj;
        return Intrinsics.a(this.a, fx4Var.a) && Intrinsics.a(this.b, fx4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChildStack(active=" + this.a + ", backStack=" + this.b + ')';
    }
}
