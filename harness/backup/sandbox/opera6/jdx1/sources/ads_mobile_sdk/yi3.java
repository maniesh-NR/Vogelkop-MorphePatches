package ads_mobile_sdk;

import defpackage.jjj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yi3 implements zcp {
    public final String a;

    public yi3(String str) {
        this.a = str;
    }

    public final void a(jjj jjjVar) {
        String str = this.a;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                jjjVar.personallyIdentifiableInformation.adsId = str;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yi3) && Intrinsics.a(this.a, ((yi3) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return sko.k("TrustlessTokenSignal(trustlessToken=", this.a, ")");
    }
}
