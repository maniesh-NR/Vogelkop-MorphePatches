package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vj4 implements wj4 {
    public final Map a;
    public final Map b;

    public vj4(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj4)) {
            return false;
        }
        vj4 vj4Var = (vj4) obj;
        return Intrinsics.a(this.a, vj4Var.a) && Intrinsics.a(this.b, vj4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(deferred=" + this.a + ", outputSurfaceMap=" + this.b + ')';
    }
}
