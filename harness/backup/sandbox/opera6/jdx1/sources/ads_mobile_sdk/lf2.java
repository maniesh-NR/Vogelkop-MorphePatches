package ads_mobile_sdk;

import defpackage.dgh;
import defpackage.z1m;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lf2 {
    public final boolean a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final int f;
    public final String g;
    public final Map h;

    public lf2(boolean z, String str, boolean z2, boolean z3, String str2, int i, String str3, Map map) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = i;
        this.g = str3;
        this.h = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf2)) {
            return false;
        }
        lf2 lf2Var = (lf2) obj;
        return this.a == lf2Var.a && Intrinsics.a(this.b, lf2Var.b) && this.c == lf2Var.c && this.d == lf2Var.d && Intrinsics.a(this.e, lf2Var.e) && this.f == lf2Var.f && Intrinsics.a(this.g, lf2Var.g) && Intrinsics.a(this.h, lf2Var.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public final int hashCode() {
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iA = dgh.a(this.b, r1 * 31);
        ?? r2 = this.c;
        int i = r2;
        if (r2 != 0) {
            i = 1;
        }
        int i2 = (iA + i) * 31;
        boolean z2 = this.d;
        return this.h.hashCode() + dgh.a(this.g, n6h.a(this.f, dgh.a(this.e, (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayPrewarmOptions(enablePrewarming=");
        sb.append(this.a);
        sb.append(", prefetchUrl=");
        sb.append(this.b);
        sb.append(", skipOfflineNotificationFlow=");
        z1m.v(sb, this.c, ", enableHsdpService=", this.d, ", hsdpServiceTargetAppPackageName=");
        sb.append(this.e);
        sb.append(", hsdpInvocationCallbackBitmask=");
        sb.append(this.f);
        sb.append(", hsdpServiceReferrer=");
        sb.append(this.g);
        sb.append(", hsdpServiceExtraQueryParams=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
