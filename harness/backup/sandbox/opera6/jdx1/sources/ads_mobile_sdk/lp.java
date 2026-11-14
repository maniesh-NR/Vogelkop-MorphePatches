package ads_mobile_sdk;

import defpackage.jjj;
import defpackage.mc3;

/* loaded from: classes.dex */
public final class lp implements zcp {
    public final double a;
    public final boolean b;

    public lp(double d, boolean z) {
        this.a = d;
        this.b = z;
    }

    public final void a(jjj jjjVar) {
        mc3 mc3Var = jjjVar.deviceSignals.batterySignals;
        mc3Var.isCharging = this.b;
        mc3Var.batteryLevel = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp)) {
            return false;
        }
        lp lpVar = (lp) obj;
        return Double.compare(this.a, lpVar.a) == 0 && this.b == lpVar.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = Double.hashCode(this.a) * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        return "BatterySignal(batteryLevel=" + this.a + ", isCharging=" + this.b + ")";
    }
}
