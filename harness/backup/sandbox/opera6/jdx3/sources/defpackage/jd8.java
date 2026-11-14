package defpackage;

/* loaded from: classes.dex */
public final class jd8 {
    public final String a;

    public jd8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof jd8) && this.a.equals(((jd8) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("EventSummaryiso3ParametersData(iso3=", this.a, ")");
    }
}
