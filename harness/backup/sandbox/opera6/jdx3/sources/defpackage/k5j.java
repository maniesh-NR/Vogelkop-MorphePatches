package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k5j extends dyg {
    public final s15 b;
    public final List c;

    public k5j(s15 s15Var, List list) {
        this.b = s15Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5j)) {
            return false;
        }
        k5j k5jVar = (k5j) obj;
        return this.b.equals(k5jVar.b) && Intrinsics.a(this.c, k5jVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "ListPicker(type=" + this.b + ", values=" + this.c + ")";
    }
}
