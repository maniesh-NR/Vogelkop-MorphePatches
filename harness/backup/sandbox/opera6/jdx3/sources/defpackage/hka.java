package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hka {
    public final ika a;
    public final String b;
    public final String c;
    public final String d;

    public hka(ika ikaVar, String str, String str2, String str3) {
        this.a = ikaVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hka)) {
            return false;
        }
        hka hkaVar = (hka) obj;
        return this.a == hkaVar.a && Intrinsics.a(this.b, hkaVar.b) && Intrinsics.a(this.c, hkaVar.c) && Intrinsics.a(this.d, hkaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceV1GetDeviceInfoData(productId=");
        sb.append(this.a);
        sb.append(", huid=");
        sb.append(this.b);
        sb.append(", leanplumId=");
        return sko.n(sb, this.c, ", countryCode=", this.d, ")");
    }
}
