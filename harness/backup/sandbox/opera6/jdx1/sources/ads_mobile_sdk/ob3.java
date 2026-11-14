package ads_mobile_sdk;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ob3 {
    public final int a;
    public final c13 b;
    public final String c;
    public final ArrayList d;

    public ob3(int i, c13 c13Var, String str, ArrayList arrayList) {
        this.a = i;
        this.b = c13Var;
        this.c = str;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob3)) {
            return false;
        }
        ob3 ob3Var = (ob3) obj;
        return this.a == ob3Var.a && this.b == ob3Var.b && Intrinsics.a(this.c, ob3Var.c) && this.d.equals(ob3Var.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        c13 c13Var = this.b;
        int iHashCode2 = (iHashCode + (c13Var == null ? 0 : c13Var.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SwipeableInterstitialAdConfig(requiredScreenHoldSec=" + this.a + ", videoAutoPlayStartTime=" + this.b + ", interactionUrl=" + this.c + ", interactionTypes=" + this.d + ")";
    }
}
