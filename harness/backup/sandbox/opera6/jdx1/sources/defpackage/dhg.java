package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dhg {
    public final ygg a;
    public final pgg b;

    public dhg() {
        this(null, new pgg());
    }

    public dhg(ygg yggVar, pgg pggVar) {
        this.a = yggVar;
        this.b = pggVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhg)) {
            return false;
        }
        dhg dhgVar = (dhg) obj;
        return Intrinsics.a(this.b, dhgVar.b) && Intrinsics.a(this.a, dhgVar.a);
    }

    public final int hashCode() {
        ygg yggVar = this.a;
        int iHashCode = (yggVar != null ? yggVar.hashCode() : 0) * 31;
        pgg pggVar = this.b;
        return iHashCode + (pggVar != null ? pggVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ")";
    }
}
