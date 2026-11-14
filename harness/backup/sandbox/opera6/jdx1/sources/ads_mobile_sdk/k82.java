package ads_mobile_sdk;

import defpackage.jjj;
import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k82 implements zcp {
    public final String a;
    public final String b;
    public final String c;

    public k82(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final void a(jjj jjjVar) {
        jjjVar.omidVersion = this.a;
        jjjVar.omidPartnerName = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k82)) {
            return false;
        }
        k82 k82Var = (k82) obj;
        return Intrinsics.a(this.a, k82Var.a) && Intrinsics.a(this.b, k82Var.b) && Intrinsics.a(this.c, k82Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return z1m.l(z1m.n("OmidSignal(omidVersion=", this.a, ", clientOmidVersion=", this.b, ", omidPartnerName="), this.c, ")");
    }
}
