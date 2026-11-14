package ads_mobile_sdk;

import defpackage.jjj;
import defpackage.p3p;

/* loaded from: classes.dex */
public final class i6 implements zcp {
    public final int a;

    public i6(int i) {
        this.a = i;
    }

    public final void a(jjj jjjVar) {
        jjjVar.adServicesExtensionVersion = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6) && this.a == ((i6) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return p3p.i(this.a, "AdServicesExtensionVersionSignal(adServicesExtensionVersion=", ")");
    }
}
