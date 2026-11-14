package ads_mobile_sdk;

import defpackage.dgh;
import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ml0 {
    public final Throwable a;
    public final String b;
    public final kh3 c;
    public final boolean d;
    public final long e;
    public final int f;
    public final boolean g;

    public ml0(Throwable th, String str, kh3 kh3Var, boolean z, long j, int i, boolean z2) {
        this.a = th;
        this.b = str;
        this.c = kh3Var;
        this.d = z;
        this.e = j;
        this.f = i;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml0)) {
            return false;
        }
        ml0 ml0Var = (ml0) obj;
        return Intrinsics.a(this.a, ml0Var.a) && Intrinsics.a(this.b, ml0Var.b) && Intrinsics.a(this.c, ml0Var.c) && this.d == ml0Var.d && this.e == ml0Var.e && this.f == ml0Var.f && this.g == ml0Var.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iA = dgh.a(this.b, this.a.hashCode() * 31);
        kh3 kh3Var = this.c;
        int iHashCode = (iA + (kh3Var == null ? 0 : kh3Var.hashCode())) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int iA2 = n6h.a(this.f, z1m.e((iHashCode + i) * 31, 31, this.e));
        boolean z2 = this.g;
        return iA2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final String toString() {
        return "ExceptionSnapshot(exception=" + this.a + ", label=" + this.b + ", activeTraceMeta=" + this.c + ", trapped=" + this.d + ", timeMilliseconds=" + this.e + ", liveWebViewCount=" + this.f + ", unsampled=" + this.g + ")";
    }
}
