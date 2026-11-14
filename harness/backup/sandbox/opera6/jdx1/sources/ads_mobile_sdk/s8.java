package ads_mobile_sdk;

import defpackage.dgh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s8 {
    public String b = "";
    public String c = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8)) {
            return false;
        }
        s8 s8Var = (s8) obj;
        return Intrinsics.a(this.b, s8Var.b) && Intrinsics.a(this.c, s8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dgh.a(this.b, 0);
    }

    public final String toString() {
        return sko.l("AdTraceMeta(impressionEarned=false, adTraceId=", this.b, ", backendQueryId=", this.c, ")");
    }
}
