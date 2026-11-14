package defpackage;

import com.appsflyer.internal.o;
import com.leanplum.internal.Constants;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class dla {
    public final y1g a;
    public final d2g b;
    public final List c;
    public final cum d;
    public final ola e;
    public final wla f;

    public dla(y1g y1gVar, d2g d2gVar, List list, cum cumVar, ola olaVar, wla wlaVar) {
        this.a = y1gVar;
        this.b = d2gVar;
        this.c = list;
        this.d = cumVar;
        this.e = olaVar;
        this.f = wlaVar;
    }

    public final orb a() throws JSONException {
        String str;
        orb orbVar = new orb();
        y1g y1gVar = this.a;
        y1gVar.getClass();
        orb orbVar2 = new orb();
        orbVar2.p(y1gVar.a, "supportsTopicSubscription");
        orbVar2.p(y1gVar.b, "notificationDebug");
        orbVar2.p(Boolean.TRUE, "supportsBackNavigation");
        orbVar2.p(y1gVar.c, "supportsNotificationRequest");
        orbVar2.p(y1gVar.d, "supportsLocationModes");
        orbVar2.p(y1gVar.e, "forecastNotification");
        orbVar2.p(y1gVar.f, "alertNotification");
        orbVar.p(orbVar2, "capabilities");
        d2g d2gVar = this.b;
        d2gVar.getClass();
        orb orbVar3 = new orb();
        orbVar3.p(d2gVar.a, "trackUserGeoData");
        orbVar3.p(d2gVar.b, Constants.Keys.PUSH_METRIC_NOTIFICATIONS_ENABLED);
        orbVar3.p(d2gVar.c, "hasRequestedNotificationPermission");
        orbVar.p(orbVar3, "settings");
        vpb vpbVar = new vpb();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            vpbVar.a((String) it.next());
        }
        orbVar.p(vpbVar, "fcmTopics");
        orbVar.p(this.d.a(), "userLocation");
        ola olaVar = this.e;
        if (olaVar == null) {
            str = null;
        } else {
            if (olaVar == ola.UNDEFINED) {
                o.a("Undefined");
                return null;
            }
            str = olaVar.a;
        }
        orbVar.p(str, "locationMode");
        wla wlaVar = wla.UNDEFINED;
        wla wlaVar2 = this.f;
        if (wlaVar2 == wlaVar) {
            o.a("Undefined");
            return null;
        }
        orbVar.p(wlaVar2.a, "temperatureUnit");
        orbVar.p(null, "hourCycle");
        return orbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dla)) {
            return false;
        }
        dla dlaVar = (dla) obj;
        return Intrinsics.a(this.a, dlaVar.a) && Intrinsics.a(this.b, dlaVar.b) && Intrinsics.a(this.c, dlaVar.c) && this.d.equals(dlaVar.d) && this.e == dlaVar.e && this.f == dlaVar.f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + rfp.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31;
        ola olaVar = this.e;
        return (this.f.hashCode() + ((iHashCode + (olaVar == null ? 0 : olaVar.hashCode())) * 31)) * 31;
    }

    public final String toString() {
        return "HostState(capabilities=" + this.a + ", settings=" + this.b + ", fcmTopics=" + this.c + ", userLocation=" + this.d + ", locationMode=" + this.e + ", temperatureUnit=" + this.f + ", hourCycle=null)";
    }
}
