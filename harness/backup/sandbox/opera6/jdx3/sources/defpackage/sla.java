package defpackage;

/* loaded from: classes.dex */
public final class sla {
    public final Boolean a;

    public sla(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof sla) && this.a.equals(((sla) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HostStateSettingsData(trackUserGeoData=" + this.a + ")";
    }
}
