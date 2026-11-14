package defpackage;

/* loaded from: classes.dex */
public final class zb8 {
    public final String a;

    public zb8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof zb8) && this.a.equals(((zb8) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("EventDestinationsiso3ParametersData(iso3=", this.a, ")");
    }
}
