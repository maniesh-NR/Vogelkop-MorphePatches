package ads_mobile_sdk;

import defpackage.p3p;
import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jv0 extends av0 {
    public final int c;
    public final String d;
    public final String e;

    public jv0(int i, String str, String str2) {
        super(ae1.e);
        this.c = i;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv0)) {
            return false;
        }
        jv0 jv0Var = (jv0) obj;
        return this.c == jv0Var.c && Intrinsics.a(this.d, jv0Var.d) && Intrinsics.a(this.e, jv0Var.e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.c) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return z1m.l(p3p.p(this.c, "WebError(errorCode=", ", description=", this.d, ", failingUrl="), this.e, ")");
    }
}
