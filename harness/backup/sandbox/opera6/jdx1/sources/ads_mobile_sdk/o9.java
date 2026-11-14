package ads_mobile_sdk;

import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o9 {
    public final q9 a;
    public final long b;
    public final xog c;
    public final String d;

    public o9(q9 q9Var, long j, xog xogVar, String str) {
        this.a = q9Var;
        this.b = j;
        this.c = xogVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9)) {
            return false;
        }
        o9 o9Var = (o9) obj;
        return this.a == o9Var.a && this.b == o9Var.b && this.c == o9Var.c && Intrinsics.a(this.d, o9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + z1m.e(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "AdValueParcel(type=" + this.a + ", valueMicros=" + this.b + ", precisionType=" + this.c + ", currencyCode=" + this.d + ")";
    }
}
