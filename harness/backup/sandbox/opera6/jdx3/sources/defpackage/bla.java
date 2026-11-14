package defpackage;

import com.appsflyer.internal.o;
import com.leanplum.internal.Constants;
import com.leanplum.internal.RequestBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class bla {
    public final hla a;
    public final sla b;
    public final a2g c;

    public bla(hla hlaVar, sla slaVar, a2g a2gVar) {
        this.a = hlaVar;
        this.b = slaVar;
        this.c = a2gVar;
    }

    public final orb a() throws JSONException {
        String str;
        orb orbVar = new orb();
        hla hlaVar = this.a;
        hlaVar.getClass();
        orb orbVar2 = new orb();
        orbVar2.p(hlaVar.a, Constants.Keys.COUNTRY);
        orbVar2.s(hlaVar.b, "currentCountry");
        jla jlaVar = hlaVar.c;
        orb orbVar3 = null;
        if (jlaVar == jla.UNDEFINED) {
            jlaVar.getClass();
            o.a("Undefined");
            return null;
        }
        orbVar2.p(jlaVar.a, "product");
        lla llaVar = hlaVar.d;
        if (llaVar == null) {
            str = null;
        } else {
            if (llaVar == lla.UNDEFINED) {
                o.a("Undefined");
                return null;
            }
            str = llaVar.a;
        }
        orbVar2.s(str, RequestBuilder.ACTION_TRACK);
        orbVar2.s(hlaVar.e, Constants.Params.DEVICE_ID);
        orbVar2.p(hlaVar.f, "esimSupported");
        orbVar2.s(hlaVar.g, "huid");
        orbVar2.p(hlaVar.h, "hasSeenOnboarding");
        orbVar.p(orbVar2, "host");
        sla slaVar = this.b;
        if (slaVar != null) {
            orbVar3 = new orb();
            orbVar3.p(slaVar.a, "trackUserGeoData");
        }
        orbVar.s(orbVar3, "settings");
        orb orbVar4 = new orb();
        a2g a2gVar = this.c;
        orbVar4.s(a2gVar.a, "onboarding");
        orbVar4.s(a2gVar.b, "backButtonAction");
        orbVar4.s(a2gVar.c, "minipayPayment");
        orbVar4.p(a2gVar.d, "freeEsimAvailable");
        orbVar.s(orbVar4, "featureFlag");
        return orbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bla)) {
            return false;
        }
        bla blaVar = (bla) obj;
        return Intrinsics.a(this.a, blaVar.a) && Intrinsics.a(this.b, blaVar.b) && this.c.equals(blaVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        sla slaVar = this.b;
        return this.c.hashCode() + ((iHashCode + (slaVar == null ? 0 : slaVar.a.hashCode())) * 31);
    }

    public final String toString() {
        return "HostState(host=" + this.a + ", settings=" + this.b + ", featureFlag=" + this.c + ")";
    }
}
