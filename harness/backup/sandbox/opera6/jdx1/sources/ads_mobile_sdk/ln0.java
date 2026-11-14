package ads_mobile_sdk;

import defpackage.jjj;
import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ln0 implements zcp {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public ln0(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final void a(jjj jjjVar) {
        if (this.e) {
            String str = this.a;
            if (str == null) {
                str = "";
            }
            jjjVar.gmpAppId = str;
            String str2 = this.b;
            if (str2 == null) {
                str2 = "";
            }
            jjjVar.appInstanceId = str2;
            String str3 = this.c;
            jjjVar.adEventId = str3 != null ? str3 : "";
            jjjVar.appIdOrigin = this.d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln0)) {
            return false;
        }
        ln0 ln0Var = (ln0) obj;
        return Intrinsics.a(this.a, ln0Var.a) && Intrinsics.a(this.b, ln0Var.b) && Intrinsics.a(this.c, ln0Var.c) && Intrinsics.a(this.d, ln0Var.d) && this.e == ln0Var.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode4 + i;
    }

    public final String toString() {
        StringBuilder sbN = z1m.n("FirebaseAnalyticsSignal(firebaseAppId=", this.a, ", firebaseAppInstanceId=", this.b, ", firebaseAdEventId=");
        z1m.t(sbN, this.c, ", firebaseAppIdOrigin=", this.d, ", isFirebaseIntegrationEnabled=");
        return z1m.m(sbN, this.e, ")");
    }
}
