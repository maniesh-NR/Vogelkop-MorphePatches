package ads_mobile_sdk;

import defpackage.h77;
import defpackage.jjj;

/* loaded from: classes.dex */
public final class oi0 implements zcp {
    public final Integer a;
    public final Integer b;
    public final Integer c;

    public oi0(Integer num, Integer num2, Integer num3) {
        this.a = num;
        this.b = num2;
        this.c = num3;
    }

    public final void a(jjj jjjVar) {
        h77 h77Var = jjjVar.deviceSignals.deviceTierSignals;
        h77Var.advertisedMemoryTier = this.a;
        h77Var.availableMemoryTier = this.b;
        h77Var.availableProcessorsTier = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi0)) {
            return false;
        }
        oi0 oi0Var = (oi0) obj;
        return this.a.equals(oi0Var.a) && this.b.equals(oi0Var.b) && this.c.equals(oi0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DeviceTierSignal(advertisedMemoryTier=" + this.a + ", availableMemoryTier=" + this.b + ", availableProcessorsTier=" + this.c + ")";
    }
}
