package defpackage;

import com.appsflyer.internal.j;

/* loaded from: classes.dex */
public final class y1g {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;

    public y1g(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = bool4;
        this.e = bool5;
        this.f = bool6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1g)) {
            return false;
        }
        y1g y1gVar = (y1g) obj;
        return this.a.equals(y1gVar.a) && this.b.equals(y1gVar.b) && this.c.equals(y1gVar.c) && this.d.equals(y1gVar.d) && this.e.equals(y1gVar.e) && this.f.equals(y1gVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 1231) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Boolean bool = Boolean.TRUE;
        StringBuilder sb = new StringBuilder("PartialRecordCapability(supportsTopicSubscription=");
        sb.append(this.a);
        sb.append(", notificationDebug=");
        sb.append(this.b);
        sb.append(", supportsBackNavigation=");
        j.e(sb, bool, ", supportsNotificationRequest=", this.c, ", supportsLocationModes=");
        j.e(sb, this.d, ", forecastNotification=", this.e, ", alertNotification=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
