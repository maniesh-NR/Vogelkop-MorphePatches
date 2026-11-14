package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nsj {
    public final osj a;
    public final nh4 b;

    public nsj(osj osjVar, nh4 nh4Var) {
        this.a = osjVar;
        this.b = nh4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nsj.class == obj.getClass()) {
            nsj nsjVar = (nsj) obj;
            return Intrinsics.a(this.a, nsjVar.a) && this.b == nsjVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
