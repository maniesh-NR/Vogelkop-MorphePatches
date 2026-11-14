package ads_mobile_sdk;

import defpackage.dgh;
import defpackage.z1m;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fz2 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final List e;

    public fz2() {
        this("", "", false, false, l08.a);
    }

    public fz2(String str, String str2, boolean z, boolean z2, List list) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz2)) {
            return false;
        }
        fz2 fz2Var = (fz2) obj;
        return Intrinsics.a(this.a, fz2Var.a) && Intrinsics.a(this.b, fz2Var.b) && this.c == fz2Var.c && this.d == fz2Var.d && Intrinsics.a(this.e, fz2Var.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iA = dgh.a(this.b, this.a.hashCode() * 31);
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iA + i) * 31;
        boolean z2 = this.d;
        return this.e.hashCode() + ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = z1m.n("SafeBrowsingConfig(clickString=", this.a, ", reportUrl=", this.b, ", nonMaliciousReportingEnabled=");
        z1m.v(sbN, this.c, ", autoClickProtectionEnabled=", this.d, ", allowedHeaders=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }
}
