package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wa8 implements fb8 {
    public final je8 a;
    public final String b;

    public wa8(je8 je8Var, String str) {
        this.a = je8Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa8)) {
            return false;
        }
        wa8 wa8Var = (wa8) obj;
        return this.a == wa8Var.a && Intrinsics.a(this.b, wa8Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CouponCampaign(name=" + this.a + ", coupon=" + this.b + ")";
    }
}
