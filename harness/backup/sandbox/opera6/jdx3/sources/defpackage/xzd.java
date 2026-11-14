package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xzd {
    public final u3l a;
    public final Set b;

    public xzd(u3l u3lVar, Set set) {
        this.a = u3lVar;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzd)) {
            return false;
        }
        xzd xzdVar = (xzd) obj;
        return Intrinsics.a(this.a, xzdVar.a) && Intrinsics.a(this.b, xzdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
