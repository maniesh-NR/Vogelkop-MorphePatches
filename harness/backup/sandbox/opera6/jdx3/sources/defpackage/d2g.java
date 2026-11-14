package defpackage;

/* loaded from: classes.dex */
public final class d2g {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;

    public d2g(Boolean bool, Boolean bool2, Boolean bool3) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2g)) {
            return false;
        }
        d2g d2gVar = (d2g) obj;
        return this.a.equals(d2gVar.a) && this.b.equals(d2gVar.b) && this.c.equals(d2gVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PartialRecordSettings(trackUserGeoData=" + this.a + ", notificationsEnabled=" + this.b + ", hasRequestedNotificationPermission=" + this.c + ")";
    }
}
