package ads_mobile_sdk;

import defpackage.jjj;

/* loaded from: classes.dex */
public final class j3 implements zcp {
    public final boolean a;

    public j3(boolean z) {
        this.a = z;
    }

    public final void a(jjj jjjVar) {
        jjjVar.adIdPermission = this.a ? "1" : "0";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3) && this.a == ((j3) obj).a;
    }

    public final int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "AdIdPermissionSignal(adIdPermissionStatus=" + this.a + ")";
    }
}
