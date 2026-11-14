package ads_mobile_sdk;

import defpackage.bdg;
import defpackage.jjj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class me implements zcp {
    public final String a;
    public final Boolean b;

    public me(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    public final void a(jjj jjjVar) {
        String str = this.a;
        if (str != null) {
            bdg bdgVar = jjjVar.personallyIdentifiableInformation;
            bdgVar.amazonFireAdId = str;
            bdgVar.isAmazonFireAdIdLimitAdTracking = this.b;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me)) {
            return false;
        }
        me meVar = (me) obj;
        return Intrinsics.a(this.a, meVar.a) && Intrinsics.a(this.b, meVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AmazonFireAdIdSignal(advertisingId=" + this.a + ", limitAdTracking=" + this.b + ")";
    }
}
