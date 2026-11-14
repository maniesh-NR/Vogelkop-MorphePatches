package ads_mobile_sdk;

import defpackage.e77;
import defpackage.jjj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class oc3 implements zcp {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public oc3(int i, int i2, int i3, int i4, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    public final void a(jjj jjjVar) {
        jjjVar.carrierCode = this.a;
        jjjVar.networkTypeCoarse = Integer.valueOf(this.b);
        jjjVar.networkTypeFine = Integer.valueOf(this.c);
        jjjVar.phoneType = Integer.valueOf(this.d);
        e77 e77Var = jjjVar.deviceSignals;
        e77Var.networkSignals.isActiveNetworkMetered = Boolean.valueOf(this.e);
        e77Var.networkSignals.activeNetworkState = Integer.valueOf(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc3)) {
            return false;
        }
        oc3 oc3Var = (oc3) obj;
        return Intrinsics.a(this.a, oc3Var.a) && this.b == oc3Var.b && this.c == oc3Var.c && this.d == oc3Var.d && this.e == oc3Var.e && this.f == oc3Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iA = n6h.a(this.d, n6h.a(this.c, n6h.a(this.b, this.a.hashCode() * 31)));
        boolean z = this.e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Integer.hashCode(this.f) + ((iA + i) * 31);
    }

    public final String toString() {
        StringBuilder sbP = sko.p(this.b, "TelephonySignal(carrierCode=", this.a, ", networkTypeCoarse=", ", networkTypeFine=");
        sko.r(this.c, this.d, ", phoneType=", ", isActiveNetworkMetered=", sbP);
        sbP.append(this.e);
        sbP.append(", activeNetworkState=");
        sbP.append(this.f);
        sbP.append(")");
        return sbP.toString();
    }
}
