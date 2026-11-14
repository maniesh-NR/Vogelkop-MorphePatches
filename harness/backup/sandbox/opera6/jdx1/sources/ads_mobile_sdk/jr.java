package ads_mobile_sdk;

import com.google.android.gms.appset.AppSetIdInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jr {
    public final AppSetIdInfo a;
    public final long b;

    public jr(AppSetIdInfo appSetIdInfo, long j) {
        this.a = appSetIdInfo;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr)) {
            return false;
        }
        jr jrVar = (jr) obj;
        return Intrinsics.a(this.a, jrVar.a) && pn7.e(this.b, jrVar.b);
    }

    public final int hashCode() {
        AppSetIdInfo appSetIdInfo = this.a;
        int iHashCode = appSetIdInfo == null ? 0 : appSetIdInfo.hashCode();
        on7 on7Var = pn7.b;
        return Long.hashCode(this.b) + (iHashCode * 31);
    }

    public final String toString() {
        return "CachedAppSetIdInfo(appSetIdInfo=" + this.a + ", timestamp=" + pn7.q(this.b) + ")";
    }
}
