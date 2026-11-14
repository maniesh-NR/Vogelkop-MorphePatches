package ads_mobile_sdk;

import defpackage.jjj;

/* loaded from: classes.dex */
public final class lm implements zcp {
    public final boolean a;

    public lm(boolean z) {
        this.a = z;
    }

    public final void a(jjj jjjVar) {
        jjjVar.isBannerRefreshRequest = Boolean.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lm) && this.a == ((lm) obj).a;
    }

    public final int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "BannerRefreshSignal(isRefreshRequest=" + this.a + ")";
    }
}
