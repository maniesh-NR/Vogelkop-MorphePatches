package ads_mobile_sdk;

import defpackage.dgh;
import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dt2 {
    public String a = "";
    public int b = 0;
    public String c = "";
    public String d = "";
    public String e = "";
    public Boolean f = null;
    public boolean g = false;
    public boolean h = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt2)) {
            return false;
        }
        dt2 dt2Var = (dt2) obj;
        return Intrinsics.a(this.a, dt2Var.a) && this.b == dt2Var.b && Intrinsics.a(this.c, dt2Var.c) && Intrinsics.a(this.d, dt2Var.d) && Intrinsics.a(this.e, dt2Var.e) && Intrinsics.a(this.f, dt2Var.f) && this.g == dt2Var.g && this.h == dt2Var.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iA = dgh.a(this.e, dgh.a(this.d, dgh.a(this.c, n6h.a(this.b, this.a.hashCode() * 31))));
        Boolean bool = this.f;
        int iHashCode = (iA + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z = this.g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        boolean z2 = this.h;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        Boolean bool = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        StringBuilder sbP = sko.p(i, "RenderTraceMeta(renderId=", str, ", adConfigIndex=", ", renderer=");
        z1m.t(sbP, str2, ", adapterName=", str3, ", adapterVersion=");
        sbP.append(str4);
        sbP.append(", winningAd=");
        sbP.append(bool);
        sbP.append(", isOfflineAd=");
        sbP.append(z);
        sbP.append(", isHtmlAdResponse=");
        sbP.append(z2);
        sbP.append(")");
        return sbP.toString();
    }
}
