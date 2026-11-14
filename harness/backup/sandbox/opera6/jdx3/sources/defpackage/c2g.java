package defpackage;

import com.appsflyer.internal.j;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c2g {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;

    public c2g(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = bool4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2g)) {
            return false;
        }
        c2g c2gVar = (c2g) obj;
        return Intrinsics.a(this.a, c2gVar.a) && this.b.equals(c2gVar.b) && this.c.equals(c2gVar.c) && Intrinsics.a(this.d, c2gVar.d);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (((this.c.hashCode() + ((this.b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31)) * 31) + 1237) * 31;
        Boolean bool2 = this.d;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = Boolean.FALSE;
        StringBuilder sb = new StringBuilder("PartialRecordRuntimeSettings(supportsNotificationSubscription=");
        sb.append(this.a);
        sb.append(", trackUserGeoData=");
        sb.append(this.b);
        sb.append(", hasAccessedOnboarding=");
        j.e(sb, this.c, ", forceAudioCommentary=", bool, ", supportsOddsVisibility=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
