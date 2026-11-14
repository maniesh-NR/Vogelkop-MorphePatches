package ads_mobile_sdk;

import defpackage.nsd;

/* loaded from: classes.dex */
public final class dv0 extends av0 {
    public final nsd c;

    public dv0(nsd nsdVar) {
        super(ae1.g);
        this.c = nsdVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof dv0) && this.c.equals(((dv0) obj).c);
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "InternalMediationAdError(mediationAdError=" + this.c + ")";
    }
}
