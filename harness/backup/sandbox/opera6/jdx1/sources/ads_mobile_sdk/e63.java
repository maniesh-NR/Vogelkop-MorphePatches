package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e63 {
    public final lw0 a;
    public final dw0 b;
    public final e43 c;

    public /* synthetic */ e63(lw0 lw0Var, int i) {
        this(lw0Var, (i & 2) != 0 ? null : dw0.CACHED, null);
    }

    public e63(lw0 lw0Var, dw0 dw0Var, e43 e43Var) {
        this.a = lw0Var;
        this.b = dw0Var;
        this.c = e43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e63)) {
            return false;
        }
        e63 e63Var = (e63) obj;
        return this.a == e63Var.a && this.b == e63Var.b && Intrinsics.a(this.c, e63Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dw0 dw0Var = this.b;
        int iHashCode2 = (iHashCode + (dw0Var == null ? 0 : dw0Var.hashCode())) * 31;
        e43 e43Var = this.c;
        return iHashCode2 + (e43Var != null ? e43Var.hashCode() : 0);
    }

    public final String toString() {
        return "SignalMeta(signalId=" + this.a + ", cacheState=" + this.b + ", signalData=" + this.c + ")";
    }
}
