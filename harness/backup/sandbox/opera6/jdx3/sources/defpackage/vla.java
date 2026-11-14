package defpackage;

/* loaded from: classes.dex */
public final class vla {
    public final Boolean a;

    public vla(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof vla) && this.a.equals(((vla) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HostStateStatusesData(hasConsentedToAriaTermsAndConditions=" + this.a + ")";
    }
}
