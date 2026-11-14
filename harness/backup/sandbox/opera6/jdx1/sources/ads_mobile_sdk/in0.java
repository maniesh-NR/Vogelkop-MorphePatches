package ads_mobile_sdk;

import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class in0 {
    public final String a;
    public final String b;
    public final String c;

    public in0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in0)) {
            return false;
        }
        in0 in0Var = (in0) obj;
        return Intrinsics.a(this.a, in0Var.a) && Intrinsics.a(this.b, in0Var.b) && Intrinsics.a(this.c, in0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return z1m.l(z1m.n("FirebaseAnalyticsIds(firebaseAppId=", this.a, ", firebaseAppInstanceId=", this.b, ", firebaseAdEventId="), this.c, ")");
    }
}
