package ads_mobile_sdk;

import defpackage.d2i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cw2 implements d2i {
    public final int a;
    public final String b;

    public cw2(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2)) {
            return false;
        }
        cw2 cw2Var = (cw2) obj;
        return this.a == cw2Var.a && Intrinsics.a(this.b, cw2Var.b);
    }

    @Override // defpackage.d2i
    public final int getAmount() {
        return this.a;
    }

    @Override // defpackage.d2i
    public final String getType() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RewardItemImpl(amount=" + this.a + ", type=" + this.b + ")";
    }
}
