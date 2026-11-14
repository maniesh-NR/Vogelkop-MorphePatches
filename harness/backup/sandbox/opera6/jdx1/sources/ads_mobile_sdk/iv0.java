package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class iv0 extends av0 {
    public final String c;
    public final Throwable d;

    public iv0(String str, Throwable th) {
        super(ae1.j);
        this.c = str;
        this.d = th;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public iv0(kql kqlVar, int i) {
        this("Operation timed out.", (Throwable) ((i & 2) != 0 ? null : kqlVar));
        zl0[] zl0VarArr = zl0.f;
    }

    @Override // ads_mobile_sdk.av0
    public final Throwable b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv0)) {
            return false;
        }
        iv0 iv0Var = (iv0) obj;
        return Intrinsics.a(this.c, iv0Var.c) && Intrinsics.a(this.d, iv0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        Throwable th = this.d;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "TimeoutError(message=" + this.c + ", exception=" + this.d + ")";
    }
}
