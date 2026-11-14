package defpackage;

import com.appsflyer.internal.j;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z1g {
    public final Boolean a;
    public final Boolean b;

    public z1g(Boolean bool, Boolean bool2) {
        this.a = bool;
        this.b = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1g)) {
            return false;
        }
        z1g z1gVar = (z1g) obj;
        return this.a.equals(z1gVar.a) && Intrinsics.a(this.b, z1gVar.b);
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.a.hashCode() + (((1231 * 31) + 1231) * 31)) * 31) + 1231) * 31) + 1237) * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        StringBuilder sb = new StringBuilder("PartialRecordFeatureFlags(experimentalOnboardingPages=");
        sb.append(bool);
        sb.append(", experimentalShortCutsBar=");
        sb.append(bool);
        sb.append(", showBasketball=");
        j.e(sb, this.a, ", showFollowingMEV=", bool, ", showBasketballSEV=");
        j.e(sb, bool2, ", showMatchReport=", bool, ", showAITips=");
        j.e(sb, bool, ", showAudioCommentary=", bool, ", showCasinoGames=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
