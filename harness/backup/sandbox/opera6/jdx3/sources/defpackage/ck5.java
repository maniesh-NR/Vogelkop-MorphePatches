package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ck5 extends ek5 {
    public final String a;
    public final gk5 b;
    public final List c;

    public ck5(String str, gk5 gk5Var, List list) {
        this.a = str;
        this.b = gk5Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck5)) {
            return false;
        }
        ck5 ck5Var = (ck5) obj;
        return Intrinsics.a(this.a, ck5Var.a) && this.b == ck5Var.b && Intrinsics.a(this.c, ck5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
