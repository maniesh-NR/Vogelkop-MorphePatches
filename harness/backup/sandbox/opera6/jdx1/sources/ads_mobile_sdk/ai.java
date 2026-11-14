package ads_mobile_sdk;

import defpackage.jjj;

/* loaded from: classes.dex */
public final class ai implements zcp {
    public final boolean a;

    public ai(boolean z) {
        this.a = z;
    }

    public final void a(jjj jjjVar) {
        jjjVar.appSwitched = Boolean.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ai) && this.a == ((ai) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "AppOpenSignal(hasBeenForegrounded=" + this.a + ")";
    }
}
