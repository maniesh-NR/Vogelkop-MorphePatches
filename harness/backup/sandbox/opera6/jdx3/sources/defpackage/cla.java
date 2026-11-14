package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.RequestBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class cla {
    public final k2h a;
    public final b2g b;
    public final pla c;
    public final gla d;
    public final z1g e;
    public final c2g f;
    public final String g;
    public final yf2 h;

    public cla(k2h k2hVar, b2g b2gVar, pla plaVar, gla glaVar, z1g z1gVar, c2g c2gVar, String str, yf2 yf2Var) {
        this.a = k2hVar;
        this.b = b2gVar;
        this.c = plaVar;
        this.d = glaVar;
        this.e = z1gVar;
        this.f = c2gVar;
        this.g = str;
        this.h = yf2Var;
    }

    public final orb a() throws JSONException {
        orb orbVar;
        orb orbVar2 = new orb();
        orb orbVar3 = new orb();
        k2h k2hVar = this.a;
        orbVar3.p(k2hVar.a, "displayName");
        qla qlaVar = qla.OFA;
        orbVar3.p("OFA", Constants.Params.NAME);
        orbVar3.s(k2hVar.b, "version");
        rla rlaVar = rla.BETA;
        orbVar3.s("beta", RequestBuilder.ACTION_TRACK);
        orbVar2.s(orbVar3, "productInfo");
        orb orbVar4 = new orb();
        orbVar4.p(Boolean.FALSE, "supportsNativeMevAndSev");
        orbVar4.p(Boolean.TRUE, "hostRequiresTournamentToAssociationMigration");
        orbVar2.p(orbVar4, "capabilities");
        orb orbVar5 = new orb();
        vpb vpbVar = new vpb();
        for (pcd pcdVar : this.c.a) {
            pcdVar.getClass();
            orb orbVar6 = new orb();
            orbVar6.o(pcdVar.a, "id");
            orbVar6.p(pcdVar.b.a, "sport");
            vpbVar.a(orbVar6);
        }
        orbVar5.p(vpbVar, "match");
        orbVar2.p(orbVar5, "notificationSubscriptions");
        orb orbVar7 = new orb();
        vpb vpbVar2 = new vpb();
        gla glaVar = this.d;
        for (pcd pcdVar2 : glaVar.a) {
            pcdVar2.getClass();
            orb orbVar8 = new orb();
            orbVar8.o(pcdVar2.a, "id");
            orbVar8.p(pcdVar2.b.a, "sport");
            vpbVar2.a(orbVar8);
        }
        orbVar7.p(vpbVar2, "matches");
        vpb vpbVar3 = new vpb();
        for (gdl gdlVar : glaVar.b) {
            gdlVar.getClass();
            orb orbVar9 = new orb();
            orbVar9.o(gdlVar.a, "id");
            orbVar9.p(gdlVar.b.a, "sport");
            vpbVar3.a(orbVar9);
        }
        orbVar7.p(vpbVar3, "teams");
        vpb vpbVar4 = new vpb();
        for (oxl oxlVar : glaVar.c) {
            oxlVar.getClass();
            orb orbVar10 = new orb();
            orbVar10.o(oxlVar.a, "id");
            orbVar10.p(oxlVar.b.a, "sport");
            vpbVar4.a(orbVar10);
        }
        orbVar7.p(vpbVar4, "tournaments");
        orbVar2.p(orbVar7, "following");
        orb orbVar11 = new orb();
        Boolean bool = Boolean.TRUE;
        orbVar11.p(bool, "experimentalOnboardingPages");
        orbVar11.p(bool, "experimentalShortCutsBar");
        z1g z1gVar = this.e;
        orbVar11.p(z1gVar.a, "showBasketball");
        orbVar11.p(bool, "showFollowingMEV");
        Boolean bool2 = Boolean.FALSE;
        orbVar11.p(bool2, "showBasketballSEV");
        orbVar11.p(bool, "showMatchReport");
        orbVar11.p(bool, "showAITips");
        orbVar11.p(bool, "showAudioCommentary");
        orbVar11.s(z1gVar.b, "showCasinoGames");
        orbVar2.s(orbVar11, "featureFlags");
        orb orbVar12 = new orb();
        c2g c2gVar = this.f;
        orbVar12.s(c2gVar.a, "supportsNotificationSubscription");
        orbVar12.p(c2gVar.b, "trackUserGeoData");
        orbVar12.p(c2gVar.c, "hasAccessedOnboarding");
        orbVar12.p(bool2, "forceAudioCommentary");
        orbVar12.s(c2gVar.d, "supportsOddsVisibility");
        orbVar2.s(orbVar12, "settings");
        orbVar2.s(this.g, "userCountry");
        yf2 yf2Var = this.h;
        if (yf2Var != null) {
            orbVar = new orb();
            orbVar.p(yf2Var.a, "matchId");
            orbVar.p(yf2Var.b.a, "status");
        } else {
            orbVar = null;
        }
        orbVar2.s(orbVar, "audioCommentary");
        return orbVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cla)) {
            return false;
        }
        cla claVar = (cla) obj;
        return this.a.equals(claVar.a) && this.b.equals(claVar.b) && this.c.equals(claVar.c) && this.d.equals(claVar.d) && this.e.equals(claVar.e) && this.f.equals(claVar.f) && Intrinsics.a(this.g, claVar.g) && Intrinsics.a(this.h, claVar.h);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + rfp.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c.a)) * 31)) * 31)) * 31;
        String str = this.g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        yf2 yf2Var = this.h;
        return iHashCode2 + (yf2Var != null ? yf2Var.hashCode() : 0);
    }

    public final String toString() {
        return "HostState(productInfo=" + this.a + ", capabilities=" + this.b + ", notificationSubscriptions=" + this.c + ", following=" + this.d + ", featureFlags=" + this.e + ", settings=" + this.f + ", userCountry=" + this.g + ", audioCommentary=" + this.h + ")";
    }
}
