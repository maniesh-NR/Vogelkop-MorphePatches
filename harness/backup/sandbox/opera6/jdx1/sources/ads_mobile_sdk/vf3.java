package ads_mobile_sdk;

import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vf3 {
    public final int a;
    public final Integer b;
    public final long c;
    public final long d;
    public final pm0 e;

    public vf3(int i, Integer num, long j, long j2, pm0 pm0Var) {
        this.a = i;
        this.b = num;
        this.c = j;
        this.d = j2;
        this.e = pm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf3)) {
            return false;
        }
        vf3 vf3Var = (vf3) obj;
        return this.a == vf3Var.a && Intrinsics.a(this.b, vf3Var.b) && pn7.e(this.c, vf3Var.c) && pn7.e(this.d, vf3Var.d) && this.e == vf3Var.e;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        on7 on7Var = pn7.b;
        return this.e.hashCode() + z1m.e(z1m.e(iHashCode2, 31, this.c), 31, this.d);
    }

    public final String toString() {
        String strQ = pn7.q(this.c);
        String strQ2 = pn7.q(this.d);
        StringBuilder sb = new StringBuilder("ThrottleConfiguration(nofillsBeforeThrottle=");
        sb.append(this.a);
        sb.append(", postThrottleNofillsBeforeThrottle=");
        sb.append(this.b);
        sb.append(", nofillRetentionTime=");
        z1m.t(sb, strQ, ", callbackDelay=", strQ2, ", fillDefinition=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
